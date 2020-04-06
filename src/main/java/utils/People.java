package utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import models.PeopleModel;
import static utils.APIConst.MAIN_URL;

public class People extends PeopleModel {

    public static PeopleModel getPeopleByName(String name) throws UnirestException {
        HttpResponse<JsonNode> jsonResponse =
                Unirest.get("http://swapi.co/api/people/?format=api&search={name}")
                        .routeParam("name", name)
                        .asJson();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        //JSONObject responsejson = jsonResponse.getBody().getObject();
        //String results = responsejson.toString();
        //String stack = jsonResponse.getBody().toString();
        //System.out.println(stack);
        //PeopleModel Model = gson.fromJson(stack, PeopleModel.class);
        //System.out.println(Model);

        String json = gson.toJson(jsonResponse);
        System.out.println(json);

        return null;
    }

    public static PeopleModel getPeopleByID(int id) throws UnirestException {
        String url = MAIN_URL + "people/" + id;
        HttpResponse<JsonNode> jsonResponse = Unirest.get(url).asJson();
        String result = jsonResponse.getBody().toString();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        PeopleModel Model = gson.fromJson(result, PeopleModel.class);
        System.out.println(Model);
        return Model;
    }

    public static PeopleModel getAllPeople() throws UnirestException {

        return null;
    }

}
