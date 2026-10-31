package p;

import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class i711 {
    public static boolean b;
    public static final i711 a = new i711();
    public static HashMap c = new HashMap();

    public final void a() {
        HashSet hashSetE;
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            c120 c120VarK = g120.k(wf10.b(), false);
            if (c120VarK == null) {
                return;
            }
            try {
                c = new HashMap();
                JSONArray jSONArray = c120VarK.p;
                if (jSONArray == null || jSONArray.length() == 0) {
                    return;
                }
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    boolean zHas = jSONObject.has("key");
                    boolean zHas2 = jSONObject.has("value");
                    if (zHas && zHas2) {
                        String string = jSONObject.getString("key");
                        JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                        if (string != null && (hashSetE = fpi1.e(jSONArray2)) != null) {
                            c.put(string, hashSetE);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }
}
