package p;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nwl1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(nwl1.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater c;
    public static final /* synthetic */ AtomicIntegerFieldUpdater d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long h;
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        Unsafe unsafe = avg.a;
        g = unsafe.objectFieldOffset(nwl1.class.getDeclaredField("lastScheduledTask$volatile"));
        c = AtomicIntegerFieldUpdater.newUpdater(nwl1.class, "producerIndex$volatile");
        h = unsafe.objectFieldOffset(nwl1.class.getDeclaredField("producerIndex$volatile"));
        f = unsafe.objectFieldOffset(nwl1.class.getDeclaredField("consumerIndex$volatile"));
        d = AtomicIntegerFieldUpdater.newUpdater(nwl1.class, "blockingTasksInBuffer$volatile");
        e = unsafe.objectFieldOffset(nwl1.class.getDeclaredField("blockingTasksInBuffer$volatile"));
    }

    public final zrd1 a(zrd1 zrd1Var) {
        if (b() == 127) {
            return zrd1Var;
        }
        if (zrd1Var.b) {
            d.incrementAndGet(this);
        }
        int intVolatile = avg.a.getIntVolatile(this, h) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(intVolatile) == null) {
                atomicReferenceArray.lazySet(intVolatile, zrd1Var);
                c.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final int b() {
        return avg.a.getIntVolatile(this, h) - avg.a.getIntVolatile(this, f);
    }

    public final zrd1 c() {
        zrd1 zrd1Var;
        while (true) {
            Unsafe unsafe = avg.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile - unsafe.getIntVolatile(this, h) == 0) {
                return null;
            }
            int i = intVolatile & 127;
            nwl1 nwl1Var = this;
            if (unsafe.compareAndSwapInt(nwl1Var, j, intVolatile, intVolatile + 1) && (zrd1Var = (zrd1) nwl1Var.a.getAndSet(i, null)) != null) {
                if (zrd1Var.b) {
                    d.decrementAndGet(nwl1Var);
                }
                return zrd1Var;
            }
            this = nwl1Var;
        }
    }

    public final zrd1 d(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        zrd1 zrd1Var = (zrd1) atomicReferenceArray.get(i2);
        if (zrd1Var == null || zrd1Var.b != z || !xvj1.u(atomicReferenceArray, i2, zrd1Var)) {
            return null;
        }
        if (z) {
            d.decrementAndGet(this);
        }
        return zrd1Var;
    }
}
