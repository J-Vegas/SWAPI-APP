package utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import models.PlanetsModel;
import static utils.APIConst.MAIN_URL;

public class Planets extends PlanetsModel {
    public static PlanetsModel getPlanetByID(int id) throws UnirestException {
        String url = MAIN_URL + "planets/" + id;
        HttpResponse<JsonNode> jsonResponse = Unirest.get(url).asJson();
        String result = jsonResponse.getBody().toString();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        PlanetsModel Model = gson.fromJson(result, PlanetsModel.class);
        System.out.println(Model);
        return Model;
    }
}
