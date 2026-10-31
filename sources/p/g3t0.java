package p;

import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g3t0 {
    public static final bma1 c;
    public static final bma1 d;
    public final nu71 a;
    public final z0t b;

    static {
        nbc nbcVar = bma1.b;
        c = nbcVar.u("YourLibraryX.pinsSectionEnabled");
        d = nbcVar.u("YourLibraryX.pinsSectionLayout");
    }

    public g3t0(nu71 nu71Var, z0t z0tVar) {
        this.a = nu71Var;
        this.b = z0tVar;
    }

    public final mr20 a() {
        return !this.b.a.k() ? new huz(Boolean.FALSE, (byte) 10) : rqt0.u(hu20.e(this.a.b(), new i64(3, (lnm) null, (byte) 21)));
    }

    public final a3t0 b(String str) {
        a3t0 m231Var;
        a3t0 m231Var2;
        if (str != null) {
            try {
                m231Var2 = a3t0.valueOf(str);
            } catch (Throwable th) {
                m231Var2 = new m231(th);
            }
            if (m231Var2 instanceof m231) {
                m231Var2 = null;
            }
            a3t0 a3t0Var = m231Var2;
            if (a3t0Var != null) {
                return a3t0Var;
            }
        }
        try {
            m231Var = a3t0.valueOf(this.b.a.c().name().toUpperCase(Locale.ROOT));
        } catch (Throwable th2) {
            m231Var = new m231(th2);
        }
        if (m231Var instanceof m231) {
            m231Var = a3t0.b;
        }
        return m231Var;
    }
}
