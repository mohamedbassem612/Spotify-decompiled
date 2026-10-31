package p;

import android.content.SharedPreferences;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fnv0 {
    public static SharedPreferences c;
    public static final fnv0 a = new fnv0();
    public static final LinkedHashMap b = new LinkedHashMap();
    public static final AtomicBoolean d = new AtomicBoolean(false);

    public static final void a(String str, String str2) {
        if (dhn.a.contains(fnv0.class)) {
            return;
        }
        try {
            if (!d.get()) {
                a.c();
            }
            LinkedHashMap linkedHashMap = b;
            linkedHashMap.put(str, str2);
            SharedPreferences sharedPreferences = c;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString("SUGGESTED_EVENTS_HISTORY", fpi1.C(sqg0.U(linkedHashMap))).apply();
            } else {
                u890.C("shardPreferences");
                throw null;
            }
        } catch (Throwable th) {
            dhn.a(fnv0.class, th);
        }
    }

    public static final String b(View view, String str) {
        if (dhn.a.contains(fnv0.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", str);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = ibk1.i(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            return fpi1.Q(jSONObject.toString());
        } catch (Throwable th) {
            dhn.a(fnv0.class, th);
            return null;
        }
    }

    public final void c() {
        String str = "";
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = wf10.a().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            c = sharedPreferences;
            LinkedHashMap linkedHashMap = b;
            String string = sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", "");
            if (string != null) {
                str = string;
            }
            linkedHashMap.putAll(fpi1.B(str));
            atomicBoolean.set(true);
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }
}
