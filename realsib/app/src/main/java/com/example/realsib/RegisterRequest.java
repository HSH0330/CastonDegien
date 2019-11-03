package com.example.realsib;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {

    //final static private String URL="http://tjs0899.dothome.co.kr/sib/Login.php";
    final static private String URL="http://210.119.87.220/Register.php";

    private HashMap<String, String> parameters;

    public RegisterRequest(String userID, String password, String userName, String userMail, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);

        parameters = new HashMap<>();
        parameters.put("userID",userID);
        parameters.put("userPassword",password);
        parameters.put("userName",userName);
        parameters.put("userMail",userMail);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return parameters;
    }
}
