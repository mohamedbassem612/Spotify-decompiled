package p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.FacebookException;
import com.facebook.FacebookServiceException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class t1f0 implements Parcelable {
    public HashMap a;
    public tye0 b;

    public t1f0(Parcel parcel) {
        HashMap map;
        int i = parcel.readInt();
        if (i < 0) {
            map = null;
        } else {
            map = new HashMap();
            for (int i2 = 0; i2 < i; i2++) {
                map.put(parcel.readString(), parcel.readString());
            }
        }
        this.a = map != null ? new LinkedHashMap(map) : null;
    }

    public final void a(String str, String str2) {
        HashMap map = this.a;
        if (map == null) {
            map = new HashMap();
            this.a = map;
        }
    }

    public final String g(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", j());
            s(jSONObject);
        } catch (JSONException e) {
            e.getMessage();
        }
        return jSONObject.toString();
    }

    public final tye0 h() {
        tye0 tye0Var = this.b;
        if (tye0Var != null) {
            return tye0Var;
        }
        u890.C("loginClient");
        throw null;
    }

    public String j() {
        return "device_auth";
    }

    public String k() {
        return "fb" + wf10.b() + "://authorize/";
    }

    public final void l(String str) {
        String strB;
        rye0 rye0Var = h().g;
        if (rye0Var == null || (strB = rye0Var.d) == null) {
            strB = wf10.b();
        }
        rm5 rm5Var = new rm5(h().j(), strB);
        Bundle bundleG = cy30.g("fb_web_login_e2e", str);
        bundleG.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundleG.putString("app_id", strB);
        wf10 wf10Var = wf10.a;
        if (wgi1.c()) {
            rm5Var.B(bundleG, "fb_dialogs_web_login_dialog_complete");
        }
    }

    public boolean n(int i, int i2, Intent intent) {
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.FacebookException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.FacebookServiceException */
    public final void r(Bundle bundle, rye0 rye0Var) throws FacebookServiceException, FacebookException {
        String string = bundle.getString("code");
        if (fpi1.y(string)) {
            throw new FacebookException("No code param found from the request");
        }
        if (string == null) {
            throw new FacebookException("Failed to create code exchange request");
        }
        String strK = k();
        String str = rye0Var.R0;
        if (str == null) {
            str = "";
        }
        Bundle bundleG = cy30.g("code", string);
        bundleG.putString("client_id", wf10.b());
        bundleG.putString("redirect_uri", strK);
        bundleG.putString("code_verifier", str);
        String str2 = md50.j;
        md50 md50VarQ = cwl1.Q((xd) null, "oauth/access_token", (id50) null);
        md50VarQ.h = a370.a;
        md50VarQ.d = bundleG;
        pd50 pd50VarC = md50VarQ.c();
        lf10 lf10Var = pd50VarC.c;
        if (lf10Var != null) {
            throw new FacebookServiceException(lf10Var, lf10Var.a());
        }
        try {
            JSONObject jSONObject = pd50VarC.b;
            String string2 = jSONObject != null ? jSONObject.getString("access_token") : null;
            if (jSONObject == null || fpi1.y(string2)) {
                throw new FacebookException("No access token found from result");
            }
            bundle.putString("access_token", string2);
            if (jSONObject.has("id_token")) {
                bundle.putString("id_token", jSONObject.getString("id_token"));
            }
        } catch (JSONException e) {
            throw new FacebookException("Fail to process code exchange response: " + e.getMessage());
        }
    }

    public int t(rye0 rye0Var) {
        dg30 dg30VarJ = h().j();
        if (dg30VarJ == null || dg30VarJ.isFinishing()) {
            return 1;
        }
        ppt pptVar = new ppt();
        pptVar.g1(dg30VarJ.e0(), "login_with_facebook");
        pptVar.q1(rye0Var);
        return 1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        HashMap map = this.a;
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public void b() {
    }

    public void s(JSONObject jSONObject) {
    }

    public t1f0(tye0 tye0Var) {
        this.b = tye0Var;
    }
}
