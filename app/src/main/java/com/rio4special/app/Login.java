package com.rio4special.app;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.rio4special.app.Custom.CustomActivity;
import com.rio4special.app.utils.Utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import rio4special.jonnasberriel.com.rio4special.R;
//import com.parse.LogInCallback;
//import com.parse.ParseException;
//import com.parse.ParseUser;

import com.android.volley.Request.Method;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * The Class Login is an Activity class that shows the login screen to users.
 * The current implementation simply includes the options for Login and button
 * for Register. On login button click, it sends the Login details to Parse
 * server to verify user.
 */
public class Login extends CustomActivity
{

	/** The username edittext. */
	private EditText user;

	/** The password edittext. */
	private EditText pwd;

	private String url = "http://rio4special.com/RealizarLoginService.php";

	//private String urlJsonObj = "http://api.androidhive.info/volley/person_object.json";
	private JSONObject requestBody;
	Map<String, String> jsonParams = new HashMap<String, String>();
	RequestQueue queue = null; //Volley.newRequestQueue(this);

	/* (non-Javadoc)
	 * @see com.chatt.custom.CustomActivity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);

		setTouchNClick(R.id.btnLogin);
		setTouchNClick(R.id.btnReg);

		user = (EditText) findViewById(R.id.user);
		pwd = (EditText) findViewById(R.id.pwd);

		queue = Volley.newRequestQueue(this);
	}

	/* (non-Javadoc)
	 * @see com.chatt.custom.CustomActivity#onClick(android.view.View)
	 */
	@Override
	public void onClick(View v)
	{
		super.onClick(v);
		if (v.getId() == R.id.btnReg)
		{
			startActivityForResult(new Intent(this, Register.class), 10);
		}
		else
		{
			String x = "";
			jsonParams.put("admin","admin");

			JsonObjectRequest jsonObjReq = new JsonObjectRequest(Method.GET,
					url, new JSONObject(jsonParams), new JSONObjectListener(), new Response.ErrorListener() {
				@Override
				public void onErrorResponse(VolleyError error) {

				}
			}
//{
//
//				@Override
//				public void onErrorResponse(VolleyError error) {
//					//VolleyLog.d(TAG, "Error: " + error.getMessage());
//					Toast.makeText(getApplicationContext(),
//							error.getMessage(), Toast.LENGTH_SHORT).show();
//					// hide the progress dialog
//					//hidepDialog();
//				}
			);

			// Adding request to request queue
			AppController.getInstance().addToRequestQueue(jsonObjReq);





//			JsonObjectRequest jsObjRequest = new JsonObjectRequest
//					(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
//
//						@Override
//						public void onResponse(JSONObject response) {
//							//mTxtDisplay.setText("Response: " + response.toString());
//							String x = response.toString();
//
//							return;
//						}
//					}, new Response.ErrorListener() {
//
//						@Override
//						public void onErrorResponse(VolleyError error) {
//							// TODO Auto-generated method stub
//
//						}
//					});

//			String u = user.getText().toString();
//			String p = pwd.getText().toString();
//			if (u.length() == 0 || p.length() == 0)
//			{
//				Utils.showDialog(this, R.string.err_fields_empty);
//				return;
//			}
//			final ProgressDialog dia = ProgressDialog.show(this, null,
//					getString(R.string.alert_wait));


//			ParseUser.logInInBackground(u, p, new LogInCallback() {
//
//				@Override
//				public void done(ParseUser pu, ParseException e)
//				{
//					dia.dismiss();
//					if (pu != null)
//					{
//						UserList.user = pu;
//						startActivity(new Intent(Login.this, UserList.class));
//						finish();
//					}
//					else
//					{
//						Utils.showDialog(
//								Login.this,
//								getString(R.string.err_login) + " "
//										+ e.getMessage());
//						e.printStackTrace();
//					}
//				}
//			});
		}
	}

	/* (non-Javadoc)
	 * @see android.support.v4.app.FragmentActivity#onActivityResult(int, int, android.content.Intent)
	 */
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data)
	{
		super.onActivityResult(requestCode, resultCode, data);
		if (requestCode == 10 && resultCode == RESULT_OK)
			finish();

	}

	private class JSONObjectListener implements Response.Listener<JSONObject> {

		@Override
        public void onResponse(JSONObject response) {
            //Log.d(TAG, response.toString());

            try {
                // Parsing json object response
                // response will be a json object
                String name = response.getString("id_usuario");
//						String email = response.getString("email");
//						JSONObject phone = response.getJSONObject("phone");
//						String home = phone.getString("home");
//						String mobile = phone.getString("mobile");

//						jsonResponse = "";
//						jsonResponse += "Name: " + name + "\n\n";
//						jsonResponse += "Email: " + email + "\n\n";
//						jsonResponse += "Home: " + home + "\n\n";
//						jsonResponse += "Mobile: " + mobile + "\n\n";

                //txtResponse.setText(jsonResponse);

            } catch (JSONException e) {
                e.printStackTrace();
                Toast.makeText(getApplicationContext(),
						"Error: " + e.getMessage(),
						Toast.LENGTH_LONG).show();
            }
            //hidepDialog();
        }
	}
}
