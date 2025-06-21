package tests;

import org.json.JSONObject;
import org.junit.jupiter.api.Test;

public class D02_JsonDataOlusturma {
    /*
    Asagidaki JSON objesini olusturup konsolda yazdirin

    {
    "title":"Ahmet",
    "body":"Merhaba",
    "userId":1
    }

     */

    @Test
    public void JsonDataCreate(){

        JSONObject data = new JSONObject();

        data.put("title","Ali");
        data.put("body","Merhaba");
        data.put("userId",1);

        System.out.println(data);
    }

    /*
    "firstname":"Jim",
    "lastname":Brown",
    "totalprice":111,
    "depositpaid":true,
    "bookingdates":{
               "checkin":"2018-01-01",
               "chechout":"2019-01-01"
               },
    "additionalneeds":"Breakfast"
    }
     */

    @Test
    public void JsonDateOlusturma(){

        JSONObject bookingDates = new JSONObject();

        bookingDates.put("checkin","2018-01-01");
        bookingDates.put("chechout","2019-01-01");

        JSONObject date = new JSONObject();

        date.put("firstname","Jim");
        date.put("lastname","Brown");
        date.put("totalprice",111);
        date.put("depositpaid",true);
        date.put("bookingdates",bookingDates);
        date.put("additionalneeds","Breakfast");

        System.out.println(date);

    }
}
