package com.example.realsib;

import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest extends StringRequest {

    //final static private String URL="http://tjs0899.dothome.co.kr/sib/Login.php";
    //final static private String URL="http://210.119.87.220/Login.php";
    static String URL = "http://210.119.87.220/Login.php";

    private HashMap<String, String> parameters;

    public LoginRequest(String userID, String userPassword, Response.Listener<String> listener){
        super(Method.GET, URL, listener, null);

        parameters = new HashMap<>();
        parameters.put("userID",userID);
        parameters.put("userPassword",userPassword);
        URL = "http://210.119.87.220/Login.php?userID="+ userID +"&userPassword="+userPassword;
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return parameters;
    }
}
