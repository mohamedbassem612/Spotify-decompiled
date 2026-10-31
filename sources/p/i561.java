package p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i561 {
    public static boolean b;
    public static final i561 a = new i561();
    public static HashSet c = new HashSet();
    public static HashMap d = new HashMap();

    public static final void b(Bundle bundle, String str) {
        if (dhn.a.contains(i561.class)) {
            return;
        }
        try {
            if (b && bundle != null) {
                if (!c.isEmpty() || d.containsKey(str)) {
                    JSONArray jSONArray = new JSONArray();
                    try {
                        HashSet hashSet = (HashSet) d.get(str);
                        for (String str2 : new ArrayList(bundle.keySet())) {
                            i561 i561Var = a;
                            if (!dhn.a.contains(i561Var)) {
                                try {
                                    if (c.contains(str2) || (hashSet != null && !hashSet.isEmpty() && hashSet.contains(str2))) {
                                        bundle.remove(str2);
                                        jSONArray.put(str2);
                                    }
                                } catch (Throwable th) {
                                    dhn.a(i561Var, th);
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                    if (jSONArray.length() > 0) {
                        bundle.putString("_filteredKey", jSONArray.toString());
                    }
                }
            }
        } catch (Throwable th2) {
            dhn.a(i561.class, th2);
        }
    }

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
                c = new HashSet();
                d = new HashMap();
                JSONArray jSONArray = c120VarK.q;
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
                        if (jSONArray2 != null && (hashSetE = fpi1.e(jSONArray2)) != null) {
                            if (string.equals("_MTSDK_Default_")) {
                                c = hashSetE;
                            } else {
                                d.put(string, hashSetE);
                            }
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
