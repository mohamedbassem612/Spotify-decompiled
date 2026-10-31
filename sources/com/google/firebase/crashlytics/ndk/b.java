package com.google.firebase.crashlytics.ndk;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONObject;
import p.d520;
import p.e29;
import p.f29;
import p.fjn;
import p.g29;
import p.gj20;
import p.h29;
import p.ppo1;
import p.rm5;
import p.xot;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class b {
    public final /* synthetic */ gj20 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ e29 d;

    public /* synthetic */ b(gj20 gj20Var, String str, long j, e29 e29Var) {
        this.a = gj20Var;
        this.b = str;
        this.c = j;
        this.d = e29Var;
    }

    public final void a() {
        long j = this.c;
        e29 e29Var = this.d;
        Log.isLoggable("FirebaseCrashlytics", 3);
        fjn fjnVar = this.a.a;
        d520 d520Var = fjnVar.c;
        String str = this.b;
        try {
            String canonicalPath = d520Var.H(str).getCanonicalPath();
            if (fjnVar.b.b(fjnVar.a.getAssets(), canonicalPath)) {
                HashMap map = new HashMap();
                map.put("session_id", str);
                map.put("generator", "Crashlytics Android SDK/19.3.0");
                map.put("started_at_seconds", Long.valueOf(j));
                fjn.d(d520Var, str, new JSONObject(map).toString(), "session.json");
                f29 f29Var = e29Var.a;
                String str2 = f29Var.a;
                String str3 = f29Var.b;
                String str4 = f29Var.c;
                String str5 = f29Var.d;
                int i = f29Var.e;
                rm5 rm5Var = f29Var.f;
                xot xotVar = (xot) rm5Var.b;
                if (xotVar == null) {
                    xotVar = new xot(rm5Var);
                    rm5Var.b = xotVar;
                }
                String str6 = xotVar.b;
                xot xotVar2 = (xot) rm5Var.b;
                if (xotVar2 == null) {
                    xotVar2 = new xot(rm5Var);
                    rm5Var.b = xotVar2;
                }
                fjn.d(d520Var, str, ppo1.s(str2, str3, str4, str5, i, str6, xotVar2.c), "app.json");
                h29 h29Var = e29Var.b;
                String str7 = Build.VERSION.RELEASE;
                String str8 = Build.VERSION.CODENAME;
                boolean z = h29Var.a;
                HashMap map2 = new HashMap();
                map2.put("version", str7);
                map2.put("build_version", str8);
                map2.put("is_rooted", Boolean.valueOf(z));
                fjn.d(d520Var, str, new JSONObject(map2).toString(), "os.json");
                g29 g29Var = e29Var.c;
                int i2 = g29Var.a;
                String str9 = Build.MODEL;
                int i3 = g29Var.b;
                long j2 = g29Var.c;
                long j3 = g29Var.d;
                boolean z2 = g29Var.e;
                int i4 = g29Var.f;
                String str10 = Build.MANUFACTURER;
                String str11 = Build.PRODUCT;
                fjn.d(d520Var, str, ppo1.t(i2, i3, j2, j3, z2, i4), "device.json");
            }
        } catch (IOException unused) {
        }
    }
}
