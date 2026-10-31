package p;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mzc {
    public Object a;
    public pzc b;
    public it21 c;
    public boolean d;

    public final void a(Runnable runnable, Executor executor) {
        it21 it21Var = this.c;
        if (it21Var != null) {
            it21Var.b(runnable, executor);
        }
    }

    public final boolean b(Object obj) {
        this.d = true;
        pzc pzcVar = this.b;
        boolean z = pzcVar != null && pzcVar.b.l(obj);
        if (z) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }

    public final boolean c(Throwable th) {
        this.d = true;
        pzc pzcVar = this.b;
        boolean z = pzcVar != null && pzcVar.b.m(th);
        if (z) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }

    public final void finalize() {
        it21 it21Var;
        pzc pzcVar = this.b;
        if (pzcVar != null && !pzcVar.b.isDone()) {
            pzcVar.a(new m9("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, (byte) 2));
        }
        if (this.d || (it21Var = this.c) == null) {
            return;
        }
        it21Var.l(null);
    }
}
