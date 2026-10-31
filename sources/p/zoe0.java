package p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class zoe0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(zoe0.class, Object.class, "_cur$volatile");
    public static final /* synthetic */ long b = avg.a.objectFieldOffset(zoe0.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new bpe0(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            bpe0 bpe0Var = (bpe0) avg.a.getObjectVolatile(this, b);
            int iA = bpe0Var.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                g5d0.h(this, bpe0Var, bpe0Var.c());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final int b() {
        bpe0 bpe0Var = (bpe0) avg.a.getObjectVolatile(this, b);
        bpe0Var.getClass();
        long longVolatile = avg.a.getLongVolatile(bpe0Var, bpe0.h);
        return 1073741823 & (((int) ((longVolatile & 1152921503533105152L) >> 30)) - ((int) (1073741823 & longVolatile)));
    }

    public final Object c() {
        zoe0 zoe0Var;
        while (true) {
            Unsafe unsafe = avg.a;
            long j = b;
            bpe0 bpe0Var = (bpe0) unsafe.getObjectVolatile(this, j);
            Object objD = bpe0Var.d();
            if (objD != bpe0.f) {
                return objD;
            }
            bpe0 bpe0VarC = bpe0Var.c();
            while (true) {
                zoe0Var = this;
                if (avg.a.compareAndSwapObject(zoe0Var, b, bpe0Var, bpe0VarC) || avg.a.getObjectVolatile(zoe0Var, j) != bpe0Var) {
                    break;
                }
                this = zoe0Var;
            }
            this = zoe0Var;
        }
    }
}
