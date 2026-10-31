package p;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gf01 implements Runnable {
    public final nyc a;
    public volatile AtomicInteger b = new AtomicInteger(0);
    public final /* synthetic */ jf01 c;

    public gf01(jf01 jf01Var, nyc nycVar) {
        this.c = jf01Var;
        this.a = nycVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        Throwable th;
        azp0 azp0Var;
        String strConcat = "OkHttp ".concat(this.c.b.a.h());
        jf01 jf01Var = this.c;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            jf01Var.f.i();
            boolean z2 = false;
            try {
                try {
                    z = true;
                    try {
                        this.a.n(jf01Var, jf01Var.h());
                        azp0Var = jf01Var.a;
                    } catch (IOException e) {
                        e = e;
                        z2 = true;
                        if (z2) {
                            nct0 nct0Var = nct0.a;
                            nct0 nct0Var2 = nct0.a;
                            StringBuilder sb = new StringBuilder(jf01Var.R0 ? "canceled " : "");
                            sb.append(jf01Var.c ? "web socket" : "call");
                            sb.append(" to ");
                            sb.append(jf01Var.b.a.h());
                            nct0Var2.i(4);
                        } else {
                            this.a.k(jf01Var, e);
                        }
                        azp0Var = jf01Var.a;
                    } catch (Throwable th2) {
                        th = th2;
                        jf01Var.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.initCause(th);
                            this.a.k(jf01Var, iOException);
                        }
                        if (!(th instanceof InterruptedException)) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        azp0Var = jf01Var.a;
                    }
                } catch (Throwable th3) {
                    jf01Var.a.a.b(this);
                    throw th3;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th4) {
                z = false;
                th = th4;
            }
            azp0Var.a.b(this);
            threadCurrentThread.setName(name);
        } catch (Throwable th5) {
            threadCurrentThread.setName(name);
            throw th5;
        }
    }
}
