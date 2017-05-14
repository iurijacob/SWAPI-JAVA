
/**
 * Created by the-nightphoenix on 12/23/14.
 */
import com.swapi.models.Film;
import com.swapi.models.SWModelList;
import com.swapi.sw.StarWars;
import com.swapi.sw.StarWarsApi;
import java.io.IOException;
import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.Response;

public class Main {

    public static void main(String[] args) throws IOException {
        StarWarsApi.init();
        StarWars api = StarWarsApi.getApi();

        Call<SWModelList<Film>> films = api.getAllFilms(1);

        Response<SWModelList<Film>> response = films.execute();
        ArrayList<Film> results = response.body().results;
        for (Film f : results) {
            System.out.println("Title:" + f.title);
        }

    }
}
