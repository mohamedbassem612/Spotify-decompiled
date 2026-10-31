package p;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class txo1 {
    public static final pue0 i = new pue0("ApplicationAnalytics", (String) null);
    public final emo1 a;
    public final son1 b;
    public final c1p1 c;
    public final SharedPreferences f;
    public qzo1 g;
    public b4e h;
    public final jim0 e = new jim0(Looper.getMainLooper(), (byte) 5);
    public final seg1 d = new seg1(this, (byte) 22);

    public txo1(SharedPreferences sharedPreferences, emo1 emo1Var, son1 son1Var, Bundle bundle, String str) {
        this.f = sharedPreferences;
        this.a = emo1Var;
        this.b = son1Var;
        this.c = new c1p1(bundle, str);
    }

    public final void a() {
        this.e.postDelayed(this.d, 300000L);
    }

    public final void b() {
        this.e.removeCallbacks(this.d);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:25:0x00dd  */
    public final void e(SharedPreferences sharedPreferences, String str) {
        qzo1 qzo1Var;
        b4e b4eVar;
        pue0 pue0Var = i;
        boolean z = false;
        if (r(str)) {
            pue0Var.a("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
            zod.s(this.g);
            return;
        }
        son1 son1Var = this.b;
        if (sharedPreferences != null) {
            qzo1Var = new qzo1(son1Var);
            qzo1Var.o = sharedPreferences.getBoolean("is_output_switcher_enabled", false);
            if (sharedPreferences.contains("application_id")) {
                qzo1Var.b = sharedPreferences.getString("application_id", "");
                if (sharedPreferences.contains("receiver_metrics_id")) {
                    qzo1Var.c = sharedPreferences.getString("receiver_metrics_id", "");
                    if (sharedPreferences.contains("analytics_session_id")) {
                        qzo1Var.d = sharedPreferences.getLong("analytics_session_id", 0L);
                        if (sharedPreferences.contains("event_sequence_number")) {
                            qzo1Var.e = sharedPreferences.getInt("event_sequence_number", 0);
                            if (sharedPreferences.contains("receiver_session_id")) {
                                qzo1Var.f = sharedPreferences.getString("receiver_session_id", "");
                                qzo1Var.g = sharedPreferences.getInt("device_capabilities", 0);
                                qzo1Var.h = sharedPreferences.getString("device_model_name", "");
                                qzo1Var.i = sharedPreferences.getString("manufacturer", "");
                                qzo1Var.j = sharedPreferences.getString("product_name", "");
                                qzo1Var.k = sharedPreferences.getString("build_type", "");
                                qzo1Var.l = sharedPreferences.getString("cast_build_version", "");
                                qzo1Var.m = sharedPreferences.getString("system_build_number", "");
                                qzo1Var.n = sharedPreferences.getInt("device_category", 0);
                                qzo1Var.f30p = sharedPreferences.getInt("analytics_session_start_type", 0);
                            }
                        }
                    }
                }
            }
            this.g = qzo1Var;
            if (r(str)) {
                pue0Var.a("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
                zod.s(this.g);
                qzo1.r = this.g.d + 1;
                return;
            }
            pue0Var.a("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
            qzo1 qzo1Var2 = new qzo1(son1Var);
            qzo1.r++;
            this.g = qzo1Var2;
            b4eVar = this.h;
            if (b4eVar != null && b4eVar.g.b1()) {
                z = true;
            }
            qzo1Var2.o = z;
            qzo1 qzo1Var3 = this.g;
            zod.s(qzo1Var3);
            pue0 pue0Var2 = b3e.l;
            zod.n("Must be called from the main thread.");
            b3e b3eVar = b3e.n;
            zod.s(b3eVar);
            zod.n("Must be called from the main thread.");
            qzo1Var3.b = b3eVar.d.a;
            qzo1 qzo1Var4 = this.g;
            zod.s(qzo1Var4);
            qzo1Var4.f = str;
        }
        pue0 pue0Var3 = qzo1.q;
        qzo1Var = null;
        this.g = qzo1Var;
        if (r(str)) {
            pue0Var.a("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
            zod.s(this.g);
            qzo1.r = this.g.d + 1;
            return;
        }
        pue0Var.a("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
        qzo1 qzo1Var5 = new qzo1(son1Var);
        qzo1.r++;
        this.g = qzo1Var5;
        b4eVar = this.h;
        if (b4eVar != null) {
            z = true;
        }
        qzo1Var5.o = z;
        qzo1 qzo1Var6 = this.g;
        zod.s(qzo1Var6);
        pue0 pue0Var4 = b3e.l;
        zod.n("Must be called from the main thread.");
        b3e b3eVar2 = b3e.n;
        zod.s(b3eVar2);
        zod.n("Must be called from the main thread.");
        qzo1Var6.b = b3eVar2.d.a;
        qzo1 qzo1Var7 = this.g;
        zod.s(qzo1Var7);
        qzo1Var7.f = str;
    }

    public final void f() {
        qzo1 qzo1Var = this.g;
        qzo1Var.getClass();
        SharedPreferences sharedPreferences = this.f;
        if (sharedPreferences == null) {
            return;
        }
        qzo1.q.a("Save the ApplicationAnalyticsSession to SharedPreferences %s", new Object[]{sharedPreferences});
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("application_id", qzo1Var.b);
        editorEdit.putString("receiver_metrics_id", qzo1Var.c);
        editorEdit.putLong("analytics_session_id", qzo1Var.d);
        editorEdit.putInt("event_sequence_number", qzo1Var.e);
        editorEdit.putString("receiver_session_id", qzo1Var.f);
        editorEdit.putInt("device_capabilities", qzo1Var.g);
        editorEdit.putString("device_model_name", qzo1Var.h);
        editorEdit.putString("manufacturer", qzo1Var.i);
        editorEdit.putString("product_name", qzo1Var.j);
        editorEdit.putString("build_type", qzo1Var.k);
        editorEdit.putString("cast_build_version", qzo1Var.l);
        editorEdit.putString("system_build_number", qzo1Var.m);
        editorEdit.putInt("device_category", qzo1Var.n);
        editorEdit.putInt("analytics_session_start_type", qzo1Var.f30p);
        editorEdit.putBoolean("is_output_switcher_enabled", qzo1Var.o);
        editorEdit.apply();
    }

    public final void g(int i2) {
        i.a("log session ended with error = %d", new Object[]{Integer.valueOf(i2)});
        d();
        this.a.a(this.c.e(this.g, i2), 228);
        this.e.removeCallbacks(this.d);
        this.g = null;
    }

    public final /* synthetic */ emo1 i() {
        return this.a;
    }

    public final /* synthetic */ c1p1 j() {
        return this.c;
    }

    public final /* synthetic */ SharedPreferences k() {
        return this.f;
    }

    public final /* synthetic */ qzo1 l() {
        return this.g;
    }

    public final /* synthetic */ void m(b4e b4eVar) {
        this.h = b4eVar;
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void c() {
        CastDevice castDevice;
        i.a("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        qzo1 qzo1Var = new qzo1(this.b);
        qzo1.r++;
        this.g = qzo1Var;
        b4e b4eVar = this.h;
        qzo1Var.o = b4eVar != null && b4eVar.g.b1();
        qzo1 qzo1Var2 = this.g;
        zod.s(qzo1Var2);
        pue0 pue0Var = b3e.l;
        zod.n("Must be called from the main thread.");
        b3e b3eVar = b3e.n;
        zod.s(b3eVar);
        zod.n("Must be called from the main thread.");
        qzo1Var2.b = b3eVar.d.a;
        b4e b4eVar2 = this.h;
        if (b4eVar2 == null) {
            castDevice = null;
        } else {
            zod.n("Must be called from the main thread.");
            castDevice = b4eVar2.k;
        }
        if (castDevice != null) {
            p(castDevice);
        }
        qzo1 qzo1Var3 = this.g;
        zod.s(qzo1Var3);
        b4e b4eVar3 = this.h;
        qzo1Var3.f30p = b4eVar3 != null ? b4eVar3.c() : 0;
        zod.s(this.g);
    }

    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void d() {
        CastDevice castDevice;
        if (!q()) {
            i.c("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]);
            c();
            return;
        }
        b4e b4eVar = this.h;
        if (b4eVar != null) {
            zod.n("Must be called from the main thread.");
            castDevice = b4eVar.k;
        } else {
            castDevice = null;
        }
        if (castDevice != null && !TextUtils.equals(this.g.c, castDevice.Y)) {
            p(castDevice);
        }
        zod.s(this.g);
    }

    public final void p(CastDevice castDevice) {
        qzo1 qzo1Var = this.g;
        if (qzo1Var == null) {
            return;
        }
        qzo1Var.c = castDevice.Y;
        qzo1Var.g = castDevice.i.a;
        qzo1Var.h = castDevice.e;
        qzo1Var.n = castDevice.c0();
        kbn1 kbn1VarA0 = castDevice.a0();
        if (kbn1VarA0 != null) {
            String str = kbn1VarA0.d;
            if (str != null) {
                qzo1Var.i = str;
            }
            String str2 = kbn1VarA0.e;
            if (str2 != null) {
                qzo1Var.j = str2;
            }
            String str3 = kbn1VarA0.f;
            if (str3 != null) {
                qzo1Var.k = str3;
            }
            String str4 = kbn1VarA0.g;
            if (str4 != null) {
                qzo1Var.l = str4;
            }
            String str5 = kbn1VarA0.h;
            if (str5 != null) {
                qzo1Var.m = str5;
            }
        }
    }

    public final boolean q() {
        String str;
        pue0 pue0Var = i;
        if (this.g == null) {
            pue0Var.a("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        pue0 pue0Var2 = b3e.l;
        zod.n("Must be called from the main thread.");
        b3e b3eVar = b3e.n;
        zod.s(b3eVar);
        zod.n("Must be called from the main thread.");
        String str2 = b3eVar.d.a;
        if (str2 == null || (str = this.g.b) == null || !TextUtils.equals(str, str2)) {
            pue0Var.a("The analytics session doesn't match the application ID %s", new Object[]{str2});
            return false;
        }
        zod.s(this.g);
        return true;
    }

    public final boolean r(String str) {
        String str2;
        if (!q()) {
            return false;
        }
        zod.s(this.g);
        if (str != null && (str2 = this.g.f) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        i.a("The analytics session doesn't match the receiver session ID %s.", new Object[]{str});
        return false;
    }
}
