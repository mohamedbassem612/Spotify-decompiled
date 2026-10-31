package p;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ia extends nw20 implements Runnable {
    public n8d0 e;
    public Object f;

    public ia(n8d0 n8d0Var, Object obj) {
        n8d0Var.getClass();
        this.e = n8d0Var;
        this.f = obj;
    }

    public static ha y(n8d0 n8d0Var, su30 su30Var, Executor executor) {
        ha haVar = new ha(n8d0Var, su30Var);
        n8d0Var.b(haVar, yoi1.K(executor, haVar));
        return haVar;
    }

    public static ga z(n8d0 n8d0Var, bi7 bi7Var, Executor executor) {
        executor.getClass();
        ga gaVar = new ga(n8d0Var, bi7Var);
        n8d0Var.b(gaVar, yoi1.K(executor, gaVar));
        return gaVar;
    }

    public Object A(Object obj, Object obj2) {
        bi7 bi7Var = (bi7) obj;
        n8d0 n8d0VarApply = bi7Var.apply(obj2);
        dm5.t("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", n8d0VarApply, bi7Var);
        return n8d0VarApply;
    }

    public void B(Object obj) {
        w((n8d0) obj);
    }

    @Override // p.v6
    public final void l() {
        n8d0 n8d0Var = this.e;
        if ((n8d0Var != null) & isCancelled()) {
            n8d0Var.cancel(x());
        }
        this.e = null;
        this.f = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n8d0 n8d0Var = this.e;
        Object obj = this.f;
        if ((isCancelled() | (n8d0Var == null)) || (obj == null)) {
            return;
        }
        this.e = null;
        if (n8d0Var.isCancelled()) {
            w(n8d0Var);
            return;
        }
        try {
            try {
                Object objA = A(obj, fc11.C(n8d0Var));
                this.f = null;
                B(objA);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    v(th);
                } finally {
                    this.f = null;
                }
            }
        } catch (Error e) {
            v(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            v(e2.getCause());
        } catch (Exception e3) {
            v(e3);
        }
    }

    @Override // p.v6
    public final String s() {
        String str;
        n8d0 n8d0Var = this.e;
        Object obj = this.f;
        String strS = super.s();
        if (n8d0Var != null) {
            str = "inputFuture=[" + n8d0Var + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strS != null) {
                return str.concat(strS);
            }
            return null;
        }
        return str + "function=[" + obj + "]";
    }
}
