package p;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class w5 extends nw20 implements Runnable {
    public static final /* synthetic */ int h = 0;
    public n8d0 e;
    public Class f;
    public Object g;

    public w5(n8d0 n8d0Var, Class cls, Object obj) {
        n8d0Var.getClass();
        this.e = n8d0Var;
        this.f = cls;
        this.g = obj;
    }

    public static v5 y(ha haVar, su30 su30Var, Executor executor) {
        v5 v5Var = new v5(haVar, Throwable.class, su30Var);
        haVar.b(v5Var, yoi1.K(executor, v5Var));
        return v5Var;
    }

    public void A(Object obj) {
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
        this.g = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objC;
        n8d0 n8d0Var = this.e;
        Class cls = this.f;
        Object obj = this.g;
        if (((obj == null) || ((n8d0Var == null) | (cls == null))) || isCancelled()) {
            return;
        }
        this.e = null;
        try {
            th = n8d0Var instanceof a490 ? ((a490) n8d0Var).a() : null;
            objC = th == null ? fc11.C(n8d0Var) : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + n8d0Var.getClass() + " threw " + e.getClass() + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            u(objC);
            return;
        }
        if (!cls.isInstance(th)) {
            w(n8d0Var);
            return;
        }
        try {
            Object objZ = z(obj, th);
            this.f = null;
            this.g = null;
            A(objZ);
        } catch (Throwable th2) {
            try {
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                v(th2);
            } finally {
                this.f = null;
                this.g = null;
            }
        }
    }

    @Override // p.v6
    public final String s() {
        String str;
        n8d0 n8d0Var = this.e;
        Class cls = this.f;
        Object obj = this.g;
        String strS = super.s();
        if (n8d0Var != null) {
            str = "inputFuture=[" + n8d0Var + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strS != null) {
                return str.concat(strS);
            }
            return null;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
    }

    public Object z(Object obj, Throwable th) {
        bi7 bi7Var = (bi7) obj;
        n8d0 n8d0VarApply = bi7Var.apply(th);
        dm5.t("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", n8d0VarApply, bi7Var);
        return n8d0VarApply;
    }
}
