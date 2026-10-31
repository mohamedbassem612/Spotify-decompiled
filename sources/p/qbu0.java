package p;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qbu0 extends oyf0 implements k4t {
    public final Handler c;
    public final boolean d;
    public final qbu0 e;

    public qbu0(Handler handler, boolean z) {
        this.c = handler;
        this.d = z;
        this.e = z ? this : new qbu0(handler, true);
    }

    public final boolean J(o8n o8nVar) {
        return (this.d && Looper.myLooper() == this.c.getLooper()) ? false : true;
    }

    public final void N(o8n o8nVar, Runnable runnable) {
        op71.m(o8nVar, new CancellationException("The handler underlying " + this + " was closed"));
        fns fnsVar = igu.a;
        b3s.c.h(o8nVar, runnable);
    }

    public final void c(long j, ohd ohdVar) {
        Runnable jyh0Var = new jyh0(ohdVar, this, (byte) 9);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(jyh0Var, j)) {
            ohdVar.n(new aft0(this, jyh0Var, (byte) 18));
        } else {
            N(ohdVar.e, jyh0Var);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qbu0)) {
            return false;
        }
        qbu0 qbu0Var = (qbu0) obj;
        return qbu0Var.c == this.c && qbu0Var.d == this.d;
    }

    public final qku f(long j, Runnable runnable, o8n o8nVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(runnable, j)) {
            return new obu0(this, runnable);
        }
        N(o8nVar, runnable);
        return pbu0.a;
    }

    public final void h(o8n o8nVar, Runnable runnable) {
        jcu0 jcu0VarA = o8nVar.A(jcu0.c);
        int i = jcu0VarA != null ? jcu0VarA.b : 0;
        Handler handler = this.c;
        if (i == 2 ? handler.postAtFrontOfQueue(runnable) : handler.post(runnable)) {
            return;
        }
        N(o8nVar, runnable);
    }

    public final int hashCode() {
        return (this.d ? 1231 : 1237) ^ System.identityHashCode(this.c);
    }

    public final String toString() {
        return this.d ? "BetamaxPlayer".concat(".immediate") : "BetamaxPlayer";
    }
}
