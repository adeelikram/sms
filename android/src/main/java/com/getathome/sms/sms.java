package com.getathome.sms;

import android.content.Intent;
import android.net.Uri;

import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

import java.net.URI;

@NativePlugin
public class sms extends Plugin {

    @PluginMethod
    public void send(PluginCall call) {
        String number = call.getString("number");
        String text = call.getString("text");
        Intent inter= new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:"+number));
        inter.putExtra("sms_body",text);
        startActivityForResult(call,inter,1);
        JSObject ret = new JSObject();
        ret.put("value", number);
        call.success(ret);
    }
}
