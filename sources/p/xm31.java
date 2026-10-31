package p;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class xm31 {
    public static final wb00 a;

    static {
        aga0 aga0Var = new aga0();
        dx8 dx8Var = dx8.a;
        aga0Var.c(xm31.class, dx8Var);
        aga0Var.c(x19.class, dx8Var);
        a = new wb00(aga0Var, (byte) 23);
    }

    public static x19 a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("rolloutId");
        String string2 = jSONObject.getString("parameterKey");
        String string3 = jSONObject.getString("parameterValue");
        String string4 = jSONObject.getString("variantId");
        long j = jSONObject.getLong("templateVersion");
        if (string3.length() > 256) {
            string3 = string3.substring(0, 256);
        }
        return new x19(string, string2, string3, string4, j);
    }
}
