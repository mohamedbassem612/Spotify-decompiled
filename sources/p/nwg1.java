package p;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nwg1 extends nw20 implements RunnableFuture {
    public volatile q790 e;

    public nwg1(Callable callable) {
        this.e = new mwg1(this, callable);
    }

    public static nwg1 A(uh7 uh7Var) {
        nwg1 nwg1Var = new nwg1();
        nwg1Var.e = new mwg1(nwg1Var, uh7Var);
        return nwg1Var;
    }

    public static nwg1 y(Runnable runnable, Object obj) {
        return new nwg1(Executors.callable(runnable, obj));
    }

    public static nwg1 z(Callable callable) {
        return new nwg1(callable);
    }

    @Override // p.v6
    public final void l() {
        q790 q790Var;
        if (x() && (q790Var = this.e) != null) {
            q790Var.c();
        }
        this.e = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        q790 q790Var = this.e;
        if (q790Var != null) {
            q790Var.run();
        }
        this.e = null;
    }

    @Override // p.v6
    public final String s() {
        q790 q790Var = this.e;
        if (q790Var == null) {
            return super.s();
        }
        return "task=[" + q790Var + "]";
    }
}
