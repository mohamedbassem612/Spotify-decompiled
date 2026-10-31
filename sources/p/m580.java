package p;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class m580 {
    public static final AtomicBoolean a = new AtomicBoolean(false);
    public static Boolean b;
    public static Boolean c;
    public static l580 d;
    public static ng0 e;
    public static Intent f;
    public static Object g;
    public static int h;

    public static void a(Context context, ArrayList arrayList, boolean z) {
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        ArrayList<String> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                String string = new JSONObject(str).getString("productId");
                map.put(string, str);
                arrayList2.add(string);
            } catch (JSONException unused) {
            }
        }
        Object obj = g;
        x580 x580Var = x580.a;
        LinkedHashMap linkedHashMap = null;
        if (!dhn.a.contains(x580.class)) {
            try {
                LinkedHashMap linkedHashMapK = x580Var.k(arrayList2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : arrayList2) {
                    if (!linkedHashMapK.containsKey(str2)) {
                        arrayList3.add(str2);
                    }
                }
                linkedHashMapK.putAll(x580Var.g(context, arrayList3, obj, z));
                linkedHashMap = linkedHashMapK;
            } catch (Throwable th) {
                dhn.a(x580.class, th);
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            String str5 = (String) map.get(str3);
            if (str5 != null) {
                m69.d(h, str5, str4, z, false);
            }
        }
    }

    public static final void b(int i) {
        byte b2 = 1;
        if (b == null) {
            Boolean boolValueOf = Boolean.valueOf(c680.x("com.android.vending.billing.IInAppBillingService$Stub") != null);
            b = boolValueOf;
            if (!boolValueOf.equals(Boolean.FALSE)) {
                c = Boolean.valueOf(c680.x("com.android.billingclient.api.ProxyBillingActivity") != null);
                x580 x580Var = x580.a;
                if (!dhn.a.contains(x580.class)) {
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                        SharedPreferences sharedPreferences = x580.e;
                        long j = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
                        if (j == 0) {
                            sharedPreferences.edit().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
                        } else if (jCurrentTimeMillis - j > 604800) {
                            sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
                        }
                    } catch (Throwable th) {
                        dhn.a(x580.class, th);
                    }
                }
                f = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                d = new l580((byte) 0);
                e = new ng0(b2);
            }
        }
        if (!u890.j(b, Boolean.FALSE) && m69.c()) {
            h = i;
            if (a.compareAndSet(false, true)) {
                Context contextA = wf10.a();
                if (contextA instanceof Application) {
                    Application application = (Application) contextA;
                    ng0 ng0Var = e;
                    if (ng0Var == null) {
                        u890.C("callbacks");
                        throw null;
                    }
                    application.registerActivityLifecycleCallbacks(ng0Var);
                    Intent intent = f;
                    if (intent == null) {
                        u890.C("intent");
                        throw null;
                    }
                    l580 l580Var = d;
                    if (l580Var != null) {
                        contextA.bindService(intent, l580Var, 1);
                    } else {
                        u890.C("serviceConnection");
                        throw null;
                    }
                }
            }
        }
    }
}
