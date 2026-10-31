package p;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class vwg implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    public /* synthetic */ vwg(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Locale locale = null;
        switch (this.a) {
            case 0:
                String str = this.b;
                if (dhn.a.contains(wwg.class)) {
                    return;
                }
                try {
                    Bundle bundle = new Bundle();
                    en7 en7VarQ = lro1.q(wf10.a());
                    JSONArray jSONArray = new JSONArray();
                    String str2 = Build.MODEL;
                    if (str2 == null) {
                        str2 = "";
                    }
                    jSONArray.put(str2);
                    if ((en7VarQ != null ? en7VarQ.a() : null) != null) {
                        jSONArray.put(en7VarQ.a());
                    } else {
                        jSONArray.put("");
                    }
                    jSONArray.put("0");
                    jSONArray.put(jm5.m() ? "1" : "0");
                    try {
                        locale = wf10.a().getResources().getConfiguration().locale;
                        break;
                    } catch (Exception unused) {
                    }
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    jSONArray.put(locale.getLanguage() + '_' + locale.getCountry());
                    String string = jSONArray.toString();
                    bundle.putString("device_session_id", wwg.a());
                    bundle.putString("extinfo", string);
                    String str3 = md50.j;
                    boolean z = true;
                    JSONObject jSONObject = new md50((xd) null, String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1)), bundle, a370.b, (id50) null, 32).c().b;
                    AtomicBoolean atomicBoolean = wwg.g;
                    if (jSONObject == null || !jSONObject.optBoolean("is_app_indexing_enabled", false)) {
                        z = false;
                    }
                    atomicBoolean.set(z);
                    if (atomicBoolean.get()) {
                        lbk1 lbk1Var = wwg.d;
                        if (lbk1Var != null) {
                            lbk1Var.c();
                        }
                    } else {
                        wwg.e = null;
                    }
                    wwg.h = false;
                    return;
                } catch (Throwable th) {
                    dhn.a(wwg.class, th);
                    return;
                }
            case 1:
                throw new RuntimeException(this.b);
            default:
                String str4 = this.b;
                if (dhn.a.contains(h8i1.class)) {
                    return;
                }
                try {
                    if (!h8i1.c.get()) {
                        h8i1.a.b();
                    }
                    SharedPreferences sharedPreferences = h8i1.b;
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putString("com.facebook.appevents.UserDataStore.internalUserData", str4).apply();
                        return;
                    } else {
                        u890.C("sharedPreferences");
                        throw null;
                    }
                } catch (Throwable th2) {
                    dhn.a(h8i1.class, th2);
                    return;
                }
        }
    }
}
