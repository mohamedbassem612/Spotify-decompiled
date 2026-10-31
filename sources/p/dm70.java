package p;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dm70 {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final akp1 a;
    public final Context b;
    public final String c;
    public final mj20 d;
    public final p68 e;
    public d19 f;

    public dm70(Context context, String str, mj20 mj20Var, p68 p68Var) {
        if (context == null) {
            hhg1.n("appContext must not be null");
            throw null;
        }
        if (str == null) {
            hhg1.n("appIdentifier must not be null");
            throw null;
        }
        this.b = context;
        this.c = str;
        this.d = mj20Var;
        this.e = p68Var;
        this.a = new akp1();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        ws10.Z.g();
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final ij20 b(boolean z) {
        String strB;
        ws10 ws10Var = ws10.Z;
        if (!((Boolean) new l1k((byte) 16).invoke()).booleanValue()) {
            Thread.currentThread().getName();
            ws10Var.c();
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        mj20 mj20Var = this.d;
        String str = null;
        if (z) {
            try {
                strB = ((f19) o0c.h(((lj20) mj20Var).d(), 10000L, timeUnit)).b();
            } catch (Exception unused) {
                ws10Var.h();
                strB = null;
            }
        } else {
            strB = null;
        }
        try {
            str = (String) o0c.h(((lj20) mj20Var).c(), 10000L, timeUnit);
        } catch (Exception unused2) {
            ws10Var.h();
        }
        return new ij20(str, strB);
    }

    public final synchronized d19 c() {
        String str;
        d19 d19Var = this.f;
        if (d19Var != null && (d19Var.b != null || !this.e.f())) {
            return this.f;
        }
        ws10 ws10Var = ws10.Z;
        ws10Var.g();
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        ws10Var.g();
        if (this.e.f()) {
            ij20 ij20VarB = b(false);
            ws10Var.g();
            if (ij20VarB.a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                ij20VarB = new ij20(str, null);
            }
            if (Objects.equals(ij20VarB.a, string)) {
                this.f = new d19(sharedPreferences.getString("crashlytics.installation.id", null), ij20VarB.a, ij20VarB.b);
            } else {
                this.f = new d19(a(sharedPreferences, ij20VarB.a), ij20VarB.a, ij20VarB.b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f = new d19(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f = new d19(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        Objects.toString(this.f);
        ws10Var.g();
        return this.f;
    }
}
