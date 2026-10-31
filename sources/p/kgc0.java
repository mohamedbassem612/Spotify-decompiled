package p;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kgc0 extends q8n implements k4t {
    public static final /* synthetic */ AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(kgc0.class, "runningWorkers$volatile");
    public static final /* synthetic */ long i = avg.a.objectFieldOffset(kgc0.class.getDeclaredField("runningWorkers$volatile"));
    public final /* synthetic */ k4t c;
    public final q8n d;
    public final int e;
    public final zoe0 f;
    public final Object g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public kgc0(q8n q8nVar, int i2) {
        k4t k4tVar = q8nVar instanceof k4t ? (k4t) q8nVar : null;
        this.c = k4tVar == null ? lyr.a : k4tVar;
        this.d = q8nVar;
        this.e = i2;
        this.f = new zoe0();
        this.g = new Object();
    }

    @Override // p.q8n
    public final q8n M(int i2) {
        buo1.u(i2);
        return i2 >= this.e ? this : super.M(i2);
    }

    public final Runnable N() {
        while (true) {
            Runnable runnable = (Runnable) this.f.c();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f.b() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean R() {
        synchronized (this.g) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h;
            if (avg.a.getIntVolatile(this, i) >= this.e) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // p.k4t
    public final void c(long j, ohd ohdVar) {
        this.c.c(j, ohdVar);
    }

    @Override // p.k4t
    public final qku f(long j, Runnable runnable, o8n o8nVar) {
        return this.c.f(j, runnable, o8nVar);
    }

    @Override // p.q8n
    public final void h(o8n o8nVar, Runnable runnable) {
        Runnable runnableN;
        this.f.a(runnable);
        if (avg.a.getIntVolatile(this, i) >= this.e || !R() || (runnableN = N()) == null) {
            return;
        }
        try {
            hr80.x(this.d, this, new xwn1(this, runnableN, false, (byte) 24));
        } catch (Throwable th) {
            h.decrementAndGet(this);
            throw th;
        }
    }

    @Override // p.q8n
    public final void q(o8n o8nVar, Runnable runnable) {
        Runnable runnableN;
        this.f.a(runnable);
        if (avg.a.getIntVolatile(this, i) >= this.e || !R() || (runnableN = N()) == null) {
            return;
        }
        try {
            this.d.q(this, new xwn1(this, runnableN, false, (byte) 24));
        } catch (Throwable th) {
            h.decrementAndGet(this);
            throw th;
        }
    }

    @Override // p.q8n
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append(".limitedParallelism(");
        return l1d.o(sb, this.e, ')');
    }
}
