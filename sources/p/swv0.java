package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class swv0 {
    public final frv0 a;
    public final ryf b;

    public swv0(frv0 frv0Var, ryf ryfVar) {
        this.a = frv0Var;
        this.b = ryfVar;
    }

    public static void c(swv0 swv0Var, Activity activity, rwv0 rwv0Var) {
        activity.startActivity(swv0Var.a(activity, rwv0Var, null));
    }

    public final Intent a(Context context, rwv0 rwv0Var, tv80 tv80Var) {
        hyf gyfVar;
        Intent intentA;
        Uri uriC = rwv0Var.c();
        if (uriC == null) {
            uriC = Uri.parse("https://www.spotify.com/redirect/generic/?redirect_key=android_premium&utm_source=spotify&utm_medium=android_client");
        }
        fm4 fm4Var = this.a.a.a;
        if (fm4Var.c() && fm4Var.b()) {
            intentA = new jqv0(rwv0Var.a()).I(context, uriC.toString());
        } else {
            zxf zxfVarA = rwv0Var.a();
            String strB = rwv0Var.b();
            if (strB == null) {
                gyfVar = hyf.a;
            } else {
                gyfVar = strB.equals("") ? iyf.a : new gyf(strB);
            }
            uriC.getClass();
            intentA = this.b.a(context, new lyf(zxfVarA, gyfVar, uriC));
        }
        if (tv80Var != null) {
            gg.I(intentA, tv80Var);
        }
        return intentA;
    }
}
