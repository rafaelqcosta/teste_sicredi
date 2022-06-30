package br.com.sicredi.simulacao;
import org.junit.Test;

import static io.restassured.RestAssured.given;



public class SimulacaoTest {


    @Test
    public void testCriaSimulacao(){
        String baseUrl = "http://localhost:8080/v2/api-docs";
        String paramns = "   {\n" +
                "        \"nome\": \"Fulano de Tal\",\n" +
                "            \"cpf\": \"97093236014\",\n" +
                "            \"email\": \"email@email.com\",\n" +
                "            \"valor\": 1200,\n" +
                "            \"parcelas\": 3,\n" +
                "            \"seguro\": true\n" +
                "    }";
        given().
                body(paramns).

                when().
                    post(baseUrl + "/api/v1/simulacoes").
                then().
                    statusCode(201);



    }




}
