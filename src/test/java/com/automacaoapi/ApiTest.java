package com.automacaoapi;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApiTest {

    @Test
    public void listaTodos() {
        given()
                .when()
                .get("https://api.hgbrasil.com/weather")
                .then()
                .log().all()
                .assertThat()
                .body(is(notNullValue()))
                .statusCode(200);
    }
    @Test
    public void devoCapturarDinamicamenteJSONObject() throws FileNotFoundException {

        List<Map<String, Object>> finalPayload = new ArrayList<Map<String, Object>> ();
       
        Map<String, Object> results = new HashMap<String, Object>();
        results.put("temp", 10);

        Map<String, Object> forecast = new HashMap<String, Object>();

        forecast.put("date","20/08");

        results.put("forecast", forecast);
        finalPayload.add(results);

        given().log().all().body(finalPayload).when().get("https://api.hgbrasil.com/weather").then().log().all().statusCode(200);

    
    }
    @Test
    public void devoValidarCampoDescripitionEMax(){
        
        given().when().
                get("https://api.hgbrasil.com/weather").
                then().
                log().all().
                statusCode(200).
                body(is(notNullValue())).
                body("results.forecast.description", is(notNullValue())).
                body("results.forecast.description", hasItems("Chuva", "Tempo nublado", "Parcialmente nublado", "Tempo limpo")).
                body("results.forecast.max", is(notNullValue())).
                body("results.forecast.findAll{it.max > 0}.size()", is(10));

    
    }
    @Test
    public void devoValidarCampoDate(){
        
        given().when().
                get("https://api.hgbrasil.com/weather").
                then().
                log().all().
                statusCode(200).
                body("results.forecast.find{it.date}", is(notNullValue()));
                

    
    }
}