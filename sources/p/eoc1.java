package p;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class eoc1 extends bbc implements gnc1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater T0;
    public static final /* synthetic */ long U0;
    public static final /* synthetic */ long V0;
    public final boolean S0 = true;
    private volatile /* synthetic */ int _requested$volatile;
    private volatile /* synthetic */ Object _subscription$volatile;

    static {
        Unsafe unsafe = avg.a;
        V0 = unsafe.objectFieldOffset(eoc1.class.getDeclaredField("_subscription$volatile"));
        T0 = AtomicIntegerFieldUpdater.newUpdater(eoc1.class, "_requested$volatile");
        U0 = unsafe.objectFieldOffset(eoc1.class.getDeclaredField("_requested$volatile"));
    }

    @Override // p.bbc
    public final void G() {
        pnc1 pnc1Var = (pnc1) avg.a.getAndSetObject(this, V0, (Object) null);
        if (pnc1Var != null) {
            pnc1Var.cancel();
        }
    }

    @Override // p.bbc
    public final void L() {
        T0.incrementAndGet(this);
    }

    @Override // p.bbc
    public final void M() {
        pnc1 pnc1Var;
        int i;
        eoc1 eoc1Var;
        while (true) {
            Unsafe unsafe = avg.a;
            long j = U0;
            int intVolatile = unsafe.getIntVolatile(this, j);
            pnc1Var = (pnc1) unsafe.getObjectVolatile(this, V0);
            i = intVolatile - 1;
            if (pnc1Var == null || i >= 0) {
                eoc1Var = this;
                if (unsafe.compareAndSwapInt(eoc1Var, j, intVolatile, i)) {
                    return;
                }
            } else {
                boolean z = this.S0;
                eoc1Var = this;
                if (intVolatile == z || unsafe.compareAndSwapInt(eoc1Var, j, intVolatile, z ? 1 : 0)) {
                    break;
                }
            }
            this = eoc1Var;
        }
        pnc1Var.request((eoc1Var.S0 ? 1 : 0) - i);
    }

    @Override // p.gnc1
    public final void onComplete() {
        e(null, false);
    }

    @Override // p.gnc1
    public final void onError(Throwable th) {
        e(th, false);
    }

    @Override // p.bbc, p.gnc1
    public final void onNext(Object obj) {
        T0.decrementAndGet(this);
        l(obj);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    @Override // p.gnc1
    public final void onSubscribe(pnc1 pnc1Var) {
        avg.a.putObjectVolatile(this, V0, pnc1Var);
        while (!this.K()) {
            Unsafe unsafe = avg.a;
            long j = U0;
            int intVolatile = unsafe.getIntVolatile(this, j);
            ?? r6 = this.S0;
            if (intVolatile >= r6) {
                return;
            }
            eoc1 eoc1Var = this;
            if (unsafe.compareAndSwapInt(eoc1Var, j, intVolatile, r6 == true ? 1 : 0)) {
                pnc1Var.request((eoc1Var.S0 ? 1 : 0) - intVolatile);
                return;
            }
            this = eoc1Var;
        }
        pnc1Var.cancel();
    }
}
