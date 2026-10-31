package p;

import android.content.Context;
import android.os.Build;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class tm5 {
    public static final HashMap a = sqg0.H(new mmr0[]{new mmr0(sm5.a, "MOBILE_APP_INSTALL"), new mmr0(sm5.b, "CUSTOM_APP_EVENTS")});

    public static final JSONObject a(sm5 sm5Var, en7 en7Var, String str, boolean z, Context context) throws JSONException {
        String strC;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", a.get(sm5Var));
        if (!vz3.c) {
            vz3.a();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = vz3.a;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str2 = vz3.b;
            reentrantReadWriteLock.readLock().unlock();
            if (str2 != null) {
                jSONObject.put("app_user_id", str2);
            }
            kn10 kn10Var = kn10.j1;
            if (!mn10.b(kn10Var)) {
                jSONObject.put("anon_id", str);
            }
            jSONObject.put("application_tracking_enabled", !z);
            wf10 wf10Var = wf10.a;
            jSONObject.put("advertiser_id_collection_enabled", wgi1.b());
            String string = null;
            if (en7Var != null) {
                if (mn10.b(kn10Var) && (Build.VERSION.SDK_INT < 31 || !fpi1.w(context) || !en7Var.e)) {
                    jSONObject.put("anon_id", str);
                }
                if (en7Var.c != null && (!mn10.b(kn10Var) || Build.VERSION.SDK_INT < 31 || !fpi1.w(context) || !en7Var.e)) {
                    jSONObject.put("attribution", en7Var.c);
                }
                if (en7Var.a() != null) {
                    jSONObject.put("advertiser_id", en7Var.a());
                    jSONObject.put("advertiser_tracking_enabled", !en7Var.e);
                }
                if (!en7Var.e) {
                    h8i1 h8i1Var = h8i1.a;
                    if (dhn.a.contains(h8i1.class)) {
                        strC = null;
                    } else {
                        try {
                            if (!h8i1.c.get()) {
                                h8i1Var.b();
                            }
                            HashMap map = new HashMap();
                            map.putAll(h8i1.d);
                            map.putAll(h8i1Var.a());
                            strC = fpi1.C(map);
                        } catch (Throwable th) {
                            dhn.a(h8i1.class, th);
                            strC = null;
                        }
                    }
                    if (strC.length() != 0) {
                        jSONObject.put("ud", strC);
                    }
                }
                String str3 = en7Var.d;
                if (str3 != null) {
                    jSONObject.put("installer_package", str3);
                }
            }
            dp5 dp5VarA = dp5.c.a();
            if (dp5VarA != null && !dhn.a.contains(dp5VarA)) {
                try {
                    string = dp5VarA.l().getString("campaign_ids", null);
                } catch (Throwable th2) {
                    dhn.a(dp5VarA, th2);
                }
            }
            if (string != null) {
                jSONObject.put("campaign_ids", string);
            }
            try {
                fpi1.K(jSONObject, context);
            } catch (Exception e) {
                fza fzaVar = oue0.a;
                e.toString();
                synchronized (wf10.b) {
                }
            }
            JSONObject jSONObjectO = fpi1.o();
            if (jSONObjectO != null) {
                Iterator<String> itKeys = jSONObjectO.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectO.get(next));
                }
            }
            jSONObject.put("application_package_name", context.getPackageName());
            return jSONObject;
        } catch (Throwable th3) {
            vz3.a.readLock().unlock();
            throw th3;
        }
    }
}
