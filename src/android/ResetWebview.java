package com.ichangan.plugins.resetwebview;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;


/** 
 * Class explain
 * @author Huang Li  
 * @version Create：2014年8月19日  
 */
public class ResetWebview extends CordovaPlugin {
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) 
            throws JSONException { 
        if (action.equals("reset")) {
            webView.post(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					webView.clearCache(true);
					System.exit(0);
				}
			}) ;
            return true;
        }
        return false;
    }
}
