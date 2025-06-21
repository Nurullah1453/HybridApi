package tests;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class D01_GET_ApiSorgulama {

    /*
    https://restful-booker.herokuapp.com/booking/10 url'ine bir GET request gönderdigimizde
    dönen Response'un
    status code 200
    content type application/json; charset=utf-8,
    Server isimli Header'in degerinin Heroku,
    status Line'in HTTP/1.1 200 OK
    ve respoonse suresinin 5 sn'den kısa oldugunu manuel olarak test ediniz
     */

    @Test
    public void test(){
        /*
        Tüm api testleri 4 aşamada gerçekleşir
        1-Endpoint ve varsa request Body hazırlama
        2-Soruda bize verilmiş ise expectedbody hazırlama
        3-Response kayıt altına alma
        4-Assertion işlemleri
         */

        //1-Endpoind hazırlama
        String url= "https://restful-booker.herokuapp.com/booking/10";

        //2- Response body soruda verilmedigi için expected data hazırlanmaz

        //3-Response kayıt altına alınır
        Response response = given().when().get(url);

        //response.prettyPrint(); //Sorguda dönen cevabın içerigini yazdırır
        //response.prettyPeek(); //Sorgunun tüm bilgileri ile içerdiğini yazdırır

        //4-Assertion

        //Manuel Kontrol
        //System.out.println(response.getStatusCode());
        //System.out.println(response.getContentType());
        //System.out.println(response.getHeader("Server"));
        //System.out.println(response.getStatusLine());
        //System.out.println(response.getTime());

        //Otomasyon kontrol
        response.then().assertThat().statusCode(200).contentType("application/json; charset=utf-8")
                .statusLine("HTTP/1.1 200 OK").header("Server","Heroku");
    }


}
