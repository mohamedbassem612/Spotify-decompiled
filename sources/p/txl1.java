package p;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class txl1 {
    public static final /* synthetic */ int a = 0;

    static {
        qs10.c("WorkerWrapper");
    }

    public static final Object a(n8d0 n8d0Var, z8d0 z8d0Var, a8d1 a8d1Var) throws Throwable {
        Object obj;
        try {
            boolean z = false;
            if (!n8d0Var.isDone()) {
                ohd ohdVar = new ohd(1, aym.t(a8d1Var));
                ohdVar.t();
                n8d0Var.b(new ni(n8d0Var, ohdVar, false, (byte) 2), k5u.a);
                ohdVar.n(new svb0(z8d0Var, n8d0Var, (byte) 12));
                return ohdVar.r();
            }
            n8d0 n8d0Var2 = n8d0Var;
            while (true) {
                try {
                    obj = n8d0Var2.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }
}
