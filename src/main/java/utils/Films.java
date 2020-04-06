package utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import models.FilmsModel;
import static utils.APIConst.MAIN_URL;

public class Films {
    public static FilmsModel getFilmByID(int id) throws UnirestException {
        String url = MAIN_URL + "films/" + id;
        HttpResponse<JsonNode> jsonResponse = Unirest.get(url).asJson();
        String result = jsonResponse.getBody().toString();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FilmsModel Model = gson.fromJson(result, FilmsModel.class);
        System.out.println(Model);
        return Model;
    }
}
