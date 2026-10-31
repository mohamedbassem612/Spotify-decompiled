package p;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class hp51 extends csk implements ago0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(hp51.class, "cleanedAndPointers$volatile");
    public static final /* synthetic */ long g = avg.a.objectFieldOffset(hp51.class.getDeclaredField("cleanedAndPointers$volatile"));
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long e;

    public hp51(long j, hp51 hp51Var, int i) {
        super(hp51Var);
        this.e = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // p.csk
    public final boolean d() {
        return avg.a.getIntVolatile(this, g) == g() && c() != null;
    }

    public final boolean f() {
        return f.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i, o8n o8nVar);

    public final void i() {
        if (f.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        while (true) {
            Unsafe unsafe = avg.a;
            long j = g;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == this.g() && this.c() != null) {
                return false;
            }
            hp51 hp51Var = this;
            if (unsafe.compareAndSwapInt(hp51Var, j, intVolatile, intVolatile + 65536)) {
                return true;
            }
            this = hp51Var;
        }
    }
}
