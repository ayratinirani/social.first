package ir.ounegh.socialfirst;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by aseme on 04/07/2017.
 */

public class UserId {
    SharedPreferences idpref;
    Context context;
    public UserId(Context c) {
        context=c;
    }

    public int GetID(){
        idpref=context.getSharedPreferences("id-pref",0);
        return idpref.getInt("id",0);
    }
    public void setId(int id){
        idpref=context.getSharedPreferences("id-pref",0);
        SharedPreferences.Editor e= idpref.edit();
        e.putInt("id",id).commit();
    }

}
