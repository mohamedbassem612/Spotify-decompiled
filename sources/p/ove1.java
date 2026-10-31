package p;

import androidx.glance.session.TimeoutCancellationException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ove1 implements c9n {
    public final /* synthetic */ c9n a;
    public final AtomicReference b = new AtomicReference(null);
    public final /* synthetic */ t8e1 c;
    public final /* synthetic */ c9n d;
    public final /* synthetic */ vu30 e;
    public final /* synthetic */ AtomicReference f;

    public ove1(c9n c9nVar, t8e1 t8e1Var, c9n c9nVar2, vu30 vu30Var, AtomicReference atomicReference) {
        this.c = t8e1Var;
        this.d = c9nVar2;
        this.e = vu30Var;
        this.f = atomicReference;
        this.a = c9nVar;
    }

    public final o8n J() {
        return this.a.J();
    }

    public final long a() {
        Long l = (Long) this.b.get();
        if (l == null) {
            return jfv.c;
        }
        long jLongValue = l.longValue();
        this.c.getClass();
        long jCurrentTimeMillis = jLongValue - System.currentTimeMillis();
        ytw0 ytw0Var = jfv.b;
        return fdg1.l0(jCurrentTimeMillis, ngv.d);
    }

    public final void b(long j) {
        if (jfv.h(j) <= 0) {
            smo1.p(this.d, new TimeoutCancellationException("Timed out immediately", this.e.hashCode()));
            return;
        }
        if (jfv.c(a(), j) < 0) {
            return;
        }
        this.c.getClass();
        this.b.set(Long.valueOf(jfv.h(j) + System.currentTimeMillis()));
        t8e1 t8e1Var = this.c;
        c9n c9nVar = this.d;
        faa0 faa0Var = (faa0) this.f.getAndSet(fn31.T(c9nVar, (o8n) null, 0, new p651(this, t8e1Var, c9nVar, this.e, null, (byte) 27), 3));
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
    }
}
