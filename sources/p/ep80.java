package p;

import android.os.Build;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ep80 {
    public String a;
    public cp80 b;
    public JSONArray c;
    public String d;
    public String e;
    public String f;
    public Long g;

    public final boolean a() {
        String str = this.f;
        Long l = this.g;
        cp80 cp80Var = this.b;
        int i = cp80Var == null ? -1 : dp80.a[cp80Var.ordinal()];
        if (i == 1) {
            return (this.c == null || l == null) ? false : true;
        }
        if (i != 2) {
            return ((i != 3 && i != 4 && i != 5) || str == null || l == null) ? false : true;
        }
        return (str == null || this.e == null || l == null) ? false : true;
    }

    public final void b() {
        if (a()) {
            fap1.r(this.a, toString());
        }
    }

    public final String toString() {
        Long l = this.g;
        cp80 cp80Var = this.b;
        int i = cp80Var == null ? -1 : dp80.a[cp80Var.ordinal()];
        JSONObject jSONObject = null;
        try {
            if (i == 1) {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray = this.c;
                if (jSONArray != null) {
                    jSONObject2.put("feature_names", jSONArray);
                }
                if (l != null) {
                    jSONObject2.put("timestamp", l);
                }
                jSONObject = jSONObject2;
            } else if (i == 2 || i == 3 || i == 4 || i == 5) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("device_os_version", Build.VERSION.RELEASE);
                jSONObject3.put("device_model", Build.MODEL);
                String str = this.d;
                if (str != null) {
                    jSONObject3.put("app_version", str);
                }
                if (l != null) {
                    jSONObject3.put("timestamp", l);
                }
                String str2 = this.e;
                if (str2 != null) {
                    jSONObject3.put("reason", str2);
                }
                String str3 = this.f;
                if (str3 != null) {
                    jSONObject3.put("callstack", str3);
                }
                if (cp80Var != null) {
                    jSONObject3.put("type", cp80Var);
                }
                jSONObject = jSONObject3;
            }
        } catch (JSONException unused) {
        }
        return jSONObject == null ? new JSONObject().toString() : jSONObject.toString();
    }
}
