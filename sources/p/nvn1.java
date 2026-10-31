package p;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class nvn1 implements gyn1 {
    public static final Object d = new Object();
    public static final pin1 e = new pin1(yyn1.class);
    public static final boolean f;
    public static final ggo1 g;
    public volatile Object a;
    public volatile bvn1 b;
    public volatile ivn1 c;

    static {
        boolean z;
        ggo1 gvn1Var;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                gvn1Var = new hvn1();
            } catch (Error | Exception e2) {
                try {
                    gvn1Var = new fvn1();
                } catch (Error | Exception e3) {
                    th3 = e3;
                    gvn1Var = new gvn1();
                }
                th = th3;
                th2 = e2;
            }
        } else {
            try {
                gvn1Var = new fvn1();
            } catch (NoClassDefFoundError unused2) {
                gvn1Var = new gvn1();
            }
        }
        th = null;
        th2 = null;
        g = gvn1Var;
        if (th != null) {
            pin1 pin1Var = e;
            Logger loggerA = pin1Var.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            pin1Var.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void a(ivn1 ivn1Var) {
        ivn1Var.a = null;
        while (true) {
            ivn1 ivn1Var2 = this.c;
            if (ivn1Var2 != ivn1.c) {
                ivn1 ivn1Var3 = null;
                while (ivn1Var2 != null) {
                    ivn1 ivn1Var4 = ivn1Var2.b;
                    if (ivn1Var2.a != null) {
                        ivn1Var3 = ivn1Var2;
                    } else if (ivn1Var3 != null) {
                        ivn1Var3.b = ivn1Var4;
                        if (ivn1Var3.a == null) {
                        }
                    } else if (!g.W(this, ivn1Var2, ivn1Var4)) {
                    }
                    ivn1Var2 = ivn1Var4;
                }
                return;
            }
            return;
        }
    }

    public abstract Throwable d();
}
