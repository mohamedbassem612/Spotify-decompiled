package p;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qge1 extends iaa0 {
    public static final /* synthetic */ long i = avg.a.objectFieldOffset(qge1.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ int _state$volatile;
    public final Thread g = Thread.currentThread();
    public qku h;

    public static void n(int i2) {
        throw new IllegalStateException(("Illegal state " + i2).toString());
    }

    @Override // p.iaa0
    public final boolean k() {
        return true;
    }

    @Override // p.iaa0
    public final void l(Throwable th) {
        while (true) {
            Unsafe unsafe = avg.a;
            long j = i;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1 || intVolatile == 2 || intVolatile == 3) {
                    return;
                }
                n(intVolatile);
                throw null;
            }
            qge1 qge1Var = this;
            if (unsafe.compareAndSwapInt(qge1Var, i, intVolatile, 2)) {
                qge1Var.g.interrupt();
                unsafe.putIntVolatile(qge1Var, j, 3);
                return;
            }
            this = qge1Var;
        }
    }

    public final void m() {
        qge1 qge1Var;
        while (true) {
            Unsafe unsafe = avg.a;
            long j = i;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == 0) {
                qge1Var = this;
                if (unsafe.compareAndSwapInt(qge1Var, j, intVolatile, 1)) {
                    qku qkuVar = qge1Var.h;
                    if (qkuVar != null) {
                        qkuVar.dispose();
                        return;
                    }
                    return;
                }
            } else {
                if (intVolatile != 2) {
                    if (intVolatile == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        n(intVolatile);
                        throw null;
                    }
                }
                qge1Var = this;
            }
            this = qge1Var;
        }
    }
}
