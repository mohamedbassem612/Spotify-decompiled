package p;

import android.content.Context;
import android.util.Log;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xot implements Function, BiFunction, Predicate, h371 {
    public final /* synthetic */ byte a;
    public String b;
    public String c;

    public xot(rm5 rm5Var) {
        this.a = (byte) 0;
        Context context = (Context) rm5Var.a;
        int iX = eth.x(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (iX != 0) {
            this.b = "Unity";
            this.c = context.getResources().getString(iX);
            Log.isLoggable("FirebaseCrashlytics", 2);
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.b = "Flutter";
                this.c = null;
                Log.isLoggable("FirebaseCrashlytics", 2);
                return;
            } catch (IOException unused) {
            }
        }
        this.b = null;
        this.c = null;
    }

    public Object apply(Object obj) {
        boolean zJ;
        switch (this.a) {
            case 3:
                String str = this.c;
                Map map = (Map) obj;
                String str2 = this.b;
                eww0 eww0Var = (eww0) map.get(str2);
                ps60 ps60Var = eww0Var != null ? new ps60(eww0Var.a, eww0Var.b, eww0Var.f) : new ps60(str2, (String) null, (String) null);
                eww0 eww0Var2 = (eww0) map.get(str);
                return new mmr0(ps60Var, eww0Var2 != null ? new ps60(eww0Var2.a, eww0Var2.b, eww0Var2.f) : new ps60(str, (String) null, (String) null));
            default:
                uv00 uv00Var = (uv00) obj;
                String str3 = this.b;
                qaa1 qaa1Var = uv00Var.a(qaa1.class, str3).b;
                hll hllVar = uv00Var.a(hll.class, str3).b;
                ixa1 ixa1Var = uv00Var.a(ixa1.class, str3).b;
                ro7 ro7Var = uv00Var.a(ro7.class, str3).b;
                String str4 = this.c;
                if (str4 != null) {
                    dxc0 dxc0Var = uv00Var.a(dxc0.class, str4).b;
                    zJ = u890.j(dxc0Var != null ? Boolean.valueOf(fno1.j(dxc0Var)) : null, Boolean.TRUE);
                } else {
                    zJ = false;
                }
                return new lsf1(qaa1Var, hllVar, ixa1Var, ro7Var, zJ);
        }
    }

    public String c() {
        return this.b;
    }

    public dr41 create() {
        return new dr41(new w371(this.b, this.c), (byte) 9);
    }

    public String d() {
        return this.c;
    }

    public boolean test(Object obj) {
        jdu0 jdu0Var = (jdu0) obj;
        if (u890.j(jdu0Var.a, this.b)) {
            return u890.j(jdu0Var.c, this.c) || jdu0Var.t;
        }
        return false;
    }

    public /* synthetic */ xot(String str, String str2, byte b) {
        this.a = b;
        this.b = str;
        this.c = str2;
    }

    public xot(String str, String str2) {
        this.a = (byte) 2;
        zod.l(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", new Object[]{str, 23});
        this.b = str;
        this.c = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public Object apply(Object obj, Object obj2) {
        return Boolean.valueOf(this.b.equals((String) obj) && this.c.equals((String) obj2));
    }
}
