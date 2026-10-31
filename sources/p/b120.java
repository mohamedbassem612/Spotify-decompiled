package p;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class b120 {
    public static final b120 a = new b120();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static volatile Long e;
    public static volatile jl00 f;

    public static JSONObject a() {
        Bundle bundleG = cy30.g("platform", "android");
        wf10 wf10Var = wf10.a;
        bundleG.putString("sdk_version", "18.2.3");
        bundleG.putString("fields", "gatekeepers");
        String str = md50.j;
        md50 md50VarQ = cwl1.Q(null, String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1)), null);
        md50VarQ.d = bundleG;
        JSONObject jSONObject = md50VarQ.c().d;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static final boolean b(String str, String str2, boolean z) {
        HashMap map;
        Boolean bool;
        b120 b120Var = a;
        d(null);
        if (b120Var.c(str2) == null) {
            map = new HashMap();
        } else {
            jl00 jl00Var = f;
            ArrayList<k440> arrayListA = jl00Var != null ? jl00Var.a(str2) : null;
            if (arrayListA != null) {
                map = new HashMap();
                for (k440 k440Var : arrayListA) {
                    map.put(k440Var.a, Boolean.valueOf(k440Var.b));
                }
            } else {
                HashMap map2 = new HashMap();
                JSONObject jSONObjectC = b120Var.c(str2);
                if (jSONObjectC == null) {
                    jSONObjectC = new JSONObject();
                }
                Iterator<String> itKeys = jSONObjectC.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map2.put(next, Boolean.valueOf(jSONObjectC.optBoolean(next)));
                }
                jl00 jl00Var2 = f;
                if (jl00Var2 == null) {
                    jl00Var2 = new jl00();
                }
                ArrayList arrayList = new ArrayList(map2.size());
                for (Map.Entry entry : map2.entrySet()) {
                    arrayList.add(new k440((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                jl00Var2.e(str2, arrayList);
                f = jl00Var2;
                map = map2;
            }
        }
        return (map.containsKey(str) && (bool = (Boolean) map.get(str)) != null) ? bool.booleanValue() : z;
    }

    public static final synchronized void d(ln10 ln10Var) {
        if (ln10Var != null) {
            try {
                c.add(ln10Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        String strB = wf10.b();
        b120 b120Var = a;
        Long l = e;
        if (l != null && System.currentTimeMillis() - l.longValue() < 3600000 && b120Var.c(strB) != null) {
            f();
            return;
        }
        Context contextA = wf10.a();
        String str = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{strB}, 1));
        JSONObject jSONObject = null;
        String string = contextA.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(str, null);
        if (!fpi1.y(string)) {
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException unused) {
                wf10 wf10Var = wf10.a;
            }
            if (jSONObject != null) {
                e(strB, jSONObject);
            }
        }
        Executor executorC = wf10.c();
        if (b.compareAndSet(false, true)) {
            executorC.execute(new c45(strB, contextA, str, (byte) 18));
        }
    }

    public static final synchronized JSONObject e(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        try {
            JSONObject jSONObjectC = a.c(str);
            jSONObject2 = jSONObjectC != null ? new JSONObject(jSONObjectC.toString()) : new JSONObject();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.optJSONObject(0) : null;
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("gatekeepers");
            if (jSONArrayOptJSONArray2 == null) {
                jSONArrayOptJSONArray2 = new JSONArray();
            }
            int length = jSONArrayOptJSONArray2.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i);
                    jSONObject2.put(jSONObject3.getString("key"), jSONObject3.getBoolean("value"));
                } catch (JSONException unused) {
                    wf10 wf10Var = wf10.a;
                }
            }
            synchronized (a) {
                d.put(str, jSONObject2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject2;
    }

    public static void f() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = c;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            ln10 ln10Var = (ln10) concurrentLinkedQueue.poll();
            if (ln10Var != null) {
                handler.post(new n6(ln10Var, (byte) 5));
            }
        }
    }

    public final synchronized JSONObject c(String str) {
        return (JSONObject) d.get(str);
    }
}
