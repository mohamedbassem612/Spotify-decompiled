package p;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class tfp1 implements n8d0 {
    public static final Object d = new Object();
    public static final pin1 e = new pin1((byte) 3);
    public static final boolean f;
    public static final too1 g;
    public volatile Object a;
    public volatile lfp1 b;
    public volatile rfp1 c;

    static {
        boolean z;
        too1 pfp1Var;
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
                pfp1Var = new qfp1();
            } catch (Error | Exception e2) {
                try {
                    pfp1Var = new ofp1();
                } catch (Error | Exception e3) {
                    th3 = e3;
                    pfp1Var = new pfp1();
                }
                th = th3;
                th2 = e2;
            }
        } else {
            try {
                pfp1Var = new ofp1();
            } catch (NoClassDefFoundError unused2) {
                pfp1Var = new pfp1();
            }
        }
        th = null;
        th2 = null;
        g = pfp1Var;
        if (th != null) {
            pin1 pin1Var = e;
            Logger loggerA = pin1Var.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            pin1Var.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void a(rfp1 rfp1Var) {
        rfp1Var.a = null;
        while (true) {
            rfp1 rfp1Var2 = this.c;
            if (rfp1Var2 != rfp1.c) {
                rfp1 rfp1Var3 = null;
                while (rfp1Var2 != null) {
                    rfp1 rfp1Var4 = rfp1Var2.b;
                    if (rfp1Var2.a != null) {
                        rfp1Var3 = rfp1Var2;
                    } else if (rfp1Var3 != null) {
                        rfp1Var3.b = rfp1Var4;
                        if (rfp1Var3.a == null) {
                        }
                    } else if (!g.B(this, rfp1Var2, rfp1Var4)) {
                    }
                    rfp1Var2 = rfp1Var4;
                }
                return;
            }
            return;
        }
    }
}
