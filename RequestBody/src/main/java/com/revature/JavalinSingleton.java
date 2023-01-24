package com.revature;



import com.fasterxml.jackson.databind.ObjectMapper;

import io.javalin.Javalin;

/**
 * Background: A json string representing a song will be sent in this POST request with the following fields: 
 *      songName, artistName
 */
public class JavalinSingleton {

    public static Javalin getInstance(){
        Javalin app = Javalin.create();
        
        /**
         * problem1: retrieve the song object from the request body and return the artist name.
         * 
         * Note: Please refer to the "RequestBody.MD" file for more assistance if needed.
         */
        app.post("/problem1", ctx -> {
                //implement logic here
                //first step is getting the json from the request body.
                String jsonString = ctx.body();

                //using jackson "objectMapper" to convert that json in to song object
                ObjectMapper om = new ObjectMapper();
                Song song = om.readValue(jsonString, Song.class);

                //using that object to retrieve last name
                //song.getArtistName();
                String theArtistName = song.getArtistName();

                //using jackson "writeValueAsString" to turn the retieved value back to json
                String stringToBeReturned = om.writeValueAsString(theArtistName);

                //returning that json string
                ctx.result(stringToBeReturned);
                
        });

        /**
         * problem2: retrieve the song object from the request body...
         *      1. update the artist in the song object to "Beatles"
         *      2. return the updated song object in the response body
         * 
         * Note: Please refer to the "RequestBody.MD" file for more assistance if needed.
         */
        app.post("/problem2", ctx -> {
               //implement logic here

               //get the json string from the body
               String jsoString = ctx.body();

               //use objectMapper to convert the json into a son object.
               ObjectMapper om = new ObjectMapper();
               Song song = om.readValue(jsoString, Song.class);

               //change artist to "beatles"
               song.setArtistName("Beatles");
              
               //use "WriteValueAsString" to turn string back to json.
               String theStringToBeReturned = om.writeValueAsString(song);

               //return that json string.
               ctx.result(theStringToBeReturned);
               
        });


        return app;
    }
    
}
