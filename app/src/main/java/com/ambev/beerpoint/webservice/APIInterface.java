package com.ambev.beerpoint.webservice;
import com.ambev.beerpoint.model.Network;
import com.ambev.beerpoint.model.Networking;
import com.ambev.beerpoint.model.Person;
import com.ambev.beerpoint.utils.Constants;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by matheuscatossi on 01/07/17.
 */

public interface APIInterface {

    @POST(Constants.SET_NETWORK)
    Call<Response> setNetworking(@Body Network network);

    @GET(Constants.GET_NETWORKING)
    Call<Networking> getNetworking(@Query("id") String id);

}