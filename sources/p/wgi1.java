package p;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.FacebookSdkNotInitializedException;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wgi1 {
    public static final wgi1 a = new wgi1();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final vgi1 d = new vgi1(true, "com.facebook.sdk.AutoInitEnabled");
    public static final vgi1 e = new vgi1(true, "com.facebook.sdk.AutoLogAppEventsEnabled");
    public static final vgi1 f = new vgi1(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");
    public static final vgi1 g = new vgi1(false, "auto_event_setup_enabled");
    public static final vgi1 h = new vgi1(true, "com.facebook.sdk.MonitorEnabled");
    public static SharedPreferences i;

    public static final boolean b() {
        if (dhn.a.contains(wgi1.class)) {
            return false;
        }
        try {
            a.e();
            return f.a();
        } catch (Throwable th) {
            dhn.a(wgi1.class, th);
            return false;
        }
    }

    public static final boolean c() {
        if (dhn.a.contains(wgi1.class)) {
            return false;
        }
        try {
            wgi1 wgi1Var = a;
            wgi1Var.e();
            return wgi1Var.a();
        } catch (Throwable th) {
            dhn.a(wgi1.class, th);
            return false;
        }
    }

    public static final Boolean i() {
        String str = "";
        if (!dhn.a.contains(wgi1.class)) {
            try {
                a.k();
                try {
                    SharedPreferences sharedPreferences = i;
                    if (sharedPreferences == null) {
                        u890.C("userSettingPref");
                        throw null;
                    }
                    String string = sharedPreferences.getString(e.b, "");
                    if (string != null) {
                        str = string;
                    }
                    if (str.length() > 0) {
                        return Boolean.valueOf(new JSONObject(str).getBoolean("value"));
                    }
                } catch (JSONException unused) {
                    wf10 wf10Var = wf10.a;
                }
            } catch (Throwable th) {
                dhn.a(wgi1.class, th);
                return null;
            }
        }
        return null;
    }

    public final boolean a() {
        Set set = dhn.a;
        if (set.contains(this)) {
            return false;
        }
        try {
            HashMap mapC = g120.c();
            if (mapC != null && !mapC.isEmpty()) {
                Boolean bool = (Boolean) mapC.get("auto_log_app_events_enabled");
                Boolean bool2 = (Boolean) mapC.get("auto_log_app_events_default");
                if (bool != null) {
                    return bool.booleanValue();
                }
                Boolean bool3 = null;
                if (!set.contains(this)) {
                    try {
                        Boolean boolI = i();
                        if (boolI != null || (boolI = f()) != null) {
                            bool3 = boolI;
                        }
                    } catch (Throwable th) {
                        dhn.a(this, th);
                    }
                }
                if (bool3 != null) {
                    return bool3.booleanValue();
                }
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                return true;
            }
            return e.a();
        } catch (Throwable th2) {
            dhn.a(this, th2);
            return false;
        }
    }

    public final void d() {
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            vgi1 vgi1Var = g;
            j(vgi1Var);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            if (vgi1Var.c == null || jCurrentTimeMillis - vgi1Var.d >= 604800000) {
                vgi1Var.c = null;
                vgi1Var.d = 0L;
                if (c.compareAndSet(false, true)) {
                    wf10.c().execute(new Runnable() { // from class: p.ugi1
                        @Override // java.lang.Runnable
                        public final void run() {
                            c120 c120VarK;
                            long j = jCurrentTimeMillis;
                            if (dhn.a.contains(wgi1.class)) {
                                return;
                            }
                            try {
                                if (wgi1.f.a() && (c120VarK = g120.k(wf10.b(), false)) != null && c120VarK.g) {
                                    en7 en7VarQ = lro1.q(wf10.a());
                                    String strA = (en7VarQ == null || en7VarQ.a() == null) ? null : en7VarQ.a();
                                    if (strA != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putString("advertiser_id", strA);
                                        bundle.putString("fields", "auto_event_setup_enabled");
                                        String str = md50.j;
                                        md50 md50VarQ = cwl1.Q(null, "app", null);
                                        md50VarQ.d = bundle;
                                        JSONObject jSONObject = md50VarQ.c().b;
                                        if (jSONObject != null) {
                                            vgi1 vgi1Var2 = wgi1.g;
                                            vgi1Var2.c = Boolean.valueOf(jSONObject.optBoolean("auto_event_setup_enabled", false));
                                            vgi1Var2.d = j;
                                            wgi1.a.l(vgi1Var2);
                                        }
                                    }
                                }
                                wgi1.c.set(false);
                            } catch (Throwable th) {
                                dhn.a(wgi1.class, th);
                            }
                        }
                    });
                }
            }
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0086 A[Catch: all -> 0x008f, NameNotFoundException -> 0x0093, TRY_LEAVE, TryCatch #4 {NameNotFoundException -> 0x0093, all -> 0x008f, blocks: (B:32:0x0070, B:34:0x0086), top: B:48:0x0070, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void e() {
        Bundle bundle;
        Set set = dhn.a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (wf10.q.get()) {
                if (b.compareAndSet(false, true)) {
                    i = wf10.a().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                    vgi1[] vgi1VarArr = {e, f, d};
                    if (!set.contains(this)) {
                        for (int i2 = 0; i2 < 3; i2++) {
                            try {
                                vgi1 vgi1Var = vgi1VarArr[i2];
                                if (vgi1Var == g) {
                                    d();
                                } else if (vgi1Var.c == null) {
                                    j(vgi1Var);
                                    if (vgi1Var.c == null) {
                                        g(vgi1Var);
                                    }
                                } else {
                                    l(vgi1Var);
                                }
                            } catch (Throwable th) {
                                dhn.a(this, th);
                                d();
                                if (!dhn.a.contains(this)) {
                                    try {
                                        Context contextA = wf10.a();
                                        bundle = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128).metaData;
                                        if (bundle != null) {
                                            bundle.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled");
                                            b();
                                        }
                                    } catch (PackageManager.NameNotFoundException unused) {
                                    } catch (Throwable th2) {
                                        dhn.a(this, th2);
                                    }
                                }
                                h();
                            }
                        }
                    }
                    d();
                    if (!dhn.a.contains(this)) {
                        Context contextA2 = wf10.a();
                        bundle = contextA2.getPackageManager().getApplicationInfo(contextA2.getPackageName(), 128).metaData;
                        if (bundle != null) {
                            bundle.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled");
                            b();
                        }
                    }
                    h();
                }
            }
        } catch (Throwable th3) {
            dhn.a(this, th3);
        }
    }

    public final Boolean f() {
        if (!dhn.a.contains(this)) {
            try {
                k();
                try {
                    Context contextA = wf10.a();
                    ApplicationInfo applicationInfo = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128);
                    Bundle bundle = applicationInfo.metaData;
                    if (bundle != null) {
                        vgi1 vgi1Var = e;
                        if (bundle.containsKey(vgi1Var.b)) {
                            return Boolean.valueOf(applicationInfo.metaData.getBoolean(vgi1Var.b));
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    wf10 wf10Var = wf10.a;
                }
            } catch (Throwable th) {
                dhn.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final void g(vgi1 vgi1Var) {
        String str = vgi1Var.b;
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            k();
            try {
                Context contextA = wf10.a();
                ApplicationInfo applicationInfo = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128);
                Bundle bundle = applicationInfo.metaData;
                if (bundle == null || !bundle.containsKey(str)) {
                    return;
                }
                vgi1Var.c = Boolean.valueOf(applicationInfo.metaData.getBoolean(str, vgi1Var.a));
            } catch (PackageManager.NameNotFoundException unused) {
                wf10 wf10Var = wf10.a;
            }
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }

    public final void h() {
        int i2;
        int i3;
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            if (b.get() && wf10.q.get()) {
                Context contextA = wf10.a();
                int i4 = (d.a() ? 1 : 0) | ((e.a() ? 1 : 0) << 1) | ((f.a() ? 1 : 0) << 2) | ((h.a() ? 1 : 0) << 3);
                SharedPreferences sharedPreferences = i;
                if (sharedPreferences == null) {
                    u890.C("userSettingPref");
                    throw null;
                }
                int i5 = 0;
                int i6 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i6 != i4) {
                    SharedPreferences sharedPreferences2 = i;
                    if (sharedPreferences2 == null) {
                        u890.C("userSettingPref");
                        throw null;
                    }
                    sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i4).apply();
                    try {
                        ApplicationInfo applicationInfo = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128);
                        if (applicationInfo.metaData != null) {
                            String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                            boolean[] zArr = {true, true, true, true};
                            i3 = 0;
                            i2 = 0;
                            while (i5 < 4) {
                                try {
                                    i2 |= (applicationInfo.metaData.containsKey(strArr[i5]) ? 1 : 0) << i5;
                                    i3 |= (applicationInfo.metaData.getBoolean(strArr[i5], zArr[i5]) ? 1 : 0) << i5;
                                    i5++;
                                } catch (PackageManager.NameNotFoundException unused) {
                                    i5 = i3;
                                    i3 = i5;
                                    i5 = i2;
                                    ouz ouzVar = new ouz(contextA);
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("usage", i5);
                                    bundle.putInt("initial", i3);
                                    bundle.putInt("previous", i6);
                                    bundle.putInt("current", i4);
                                    ouzVar.m(bundle);
                                }
                            }
                            i5 = i2;
                        } else {
                            i3 = 0;
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                        i2 = 0;
                    }
                    ouz ouzVar2 = new ouz(contextA);
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("usage", i5);
                    bundle2.putInt("initial", i3);
                    bundle2.putInt("previous", i6);
                    bundle2.putInt("current", i4);
                    ouzVar2.m(bundle2);
                }
            }
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }

    public final void j(vgi1 vgi1Var) {
        String str = "";
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            k();
            try {
                SharedPreferences sharedPreferences = i;
                if (sharedPreferences == null) {
                    u890.C("userSettingPref");
                    throw null;
                }
                String string = sharedPreferences.getString(vgi1Var.b, "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    vgi1Var.c = Boolean.valueOf(jSONObject.getBoolean("value"));
                    vgi1Var.d = jSONObject.getLong("last_timestamp");
                }
            } catch (JSONException unused) {
                wf10 wf10Var = wf10.a;
            }
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }

    public final void k() {
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            if (b.get()) {
            } else {
                throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }

    public final void l(vgi1 vgi1Var) {
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            k();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", vgi1Var.c);
                jSONObject.put("last_timestamp", vgi1Var.d);
                SharedPreferences sharedPreferences = i;
                if (sharedPreferences == null) {
                    u890.C("userSettingPref");
                    throw null;
                }
                sharedPreferences.edit().putString(vgi1Var.b, jSONObject.toString()).apply();
                h();
            } catch (Exception unused) {
                wf10 wf10Var = wf10.a;
            }
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }
}
