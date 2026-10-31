package p;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bs50 extends oyf0 implements k4t {
    public final Handler c;
    public final String d;
    public final boolean e;
    public final bs50 f;

    public bs50(Handler handler, String str, boolean z) {
        this.c = handler;
        this.d = str;
        this.e = z;
        this.f = z ? this : new bs50(handler, str, true);
    }

    @Override // p.q8n
    public final boolean J(o8n o8nVar) {
        return (this.e && u890.j(Looper.myLooper(), this.c.getLooper())) ? false : true;
    }

    public final void N(o8n o8nVar, Runnable runnable) {
        op71.m(o8nVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        fns fnsVar = igu.a;
        b3s.c.h(o8nVar, runnable);
    }

    @Override // p.k4t
    public final void c(long j, ohd ohdVar) {
        Runnable ag20Var = new ag20(ohdVar, this, (byte) 4);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(ag20Var, j)) {
            ohdVar.n(new b6(this, ag20Var, (byte) 24));
        } else {
            N(ohdVar.e, ag20Var);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bs50)) {
            return false;
        }
        bs50 bs50Var = (bs50) obj;
        return bs50Var.c == this.c && bs50Var.e == this.e;
    }

    @Override // p.k4t
    public final qku f(long j, Runnable runnable, o8n o8nVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(runnable, j)) {
            return new as50(this, runnable);
        }
        N(o8nVar, runnable);
        return keo0.a;
    }

    @Override // p.q8n
    public final void h(o8n o8nVar, Runnable runnable) {
        if (this.c.post(runnable)) {
            return;
        }
        N(o8nVar, runnable);
    }

    public final int hashCode() {
        return (this.e ? 1231 : 1237) ^ System.identityHashCode(this.c);
    }

    @Override // p.q8n
    public final String toString() {
        bs50 bs50Var;
        String str;
        fns fnsVar = igu.a;
        bs50 bs50Var2 = pyf0.a;
        if (this == bs50Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                bs50Var = bs50Var2.f;
            } catch (UnsupportedOperationException unused) {
                bs50Var = null;
            }
            str = this == bs50Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.d;
        if (string == null) {
            string = this.c.toString();
        }
        return this.e ? f4i1.e(string, ".immediate") : string;
    }

    public bs50(Handler handler) {
        this(handler, null, false);
    }
}
