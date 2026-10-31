package p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xgn0 extends j261 implements vgn0 {
    private volatile /* synthetic */ Object owner$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater t = AtomicReferenceFieldUpdater.newUpdater(xgn0.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long X = avg.a.objectFieldOffset(xgn0.class.getDeclaredField("owner$volatile"));

    public xgn0(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : ygn0.a;
    }

    @Override // p.vgn0
    public final Object a(lnm lnmVar) {
        boolean zG = g();
        rih1 rih1Var = rih1.a;
        if (!zG) {
            ohd ohdVarU = jzn1.u(aym.t(lnmVar));
            try {
                wgn0 wgn0Var = new wgn0(this, ohdVarU);
                while (true) {
                    int andDecrement = j261.f.getAndDecrement(this);
                    if (andDecrement <= this.a) {
                        if (andDecrement > 0) {
                            wgn0Var.f(rih1Var, this.b);
                            break;
                        }
                        if (d(wgn0Var)) {
                            break;
                        }
                    }
                }
                Object objR = ohdVarU.r();
                d9n d9nVar = d9n.a;
                if (objR != d9nVar) {
                    objR = rih1Var;
                }
                if (objR == d9nVar) {
                    return objR;
                }
            } catch (Throwable th) {
                ohdVarU.A();
                throw th;
            }
        }
        return rih1Var;
    }

    @Override // p.vgn0
    public final void c(Object obj) {
        while (this.f()) {
            Unsafe unsafe = avg.a;
            long j = X;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            jm jmVar = ygn0.a;
            if (objectVolatile != jmVar) {
                if (objectVolatile != obj && obj != null) {
                    k220.n("This mutex is locked by ", objectVolatile, ", but ", obj, " is expected");
                    return;
                }
                while (true) {
                    xgn0 xgn0Var = this;
                    if (avg.a.compareAndSwapObject(xgn0Var, X, objectVolatile, jmVar)) {
                        xgn0Var.e();
                        return;
                    } else {
                        if (avg.a.getObjectVolatile(xgn0Var, j) != objectVolatile) {
                            this = xgn0Var;
                            break;
                        }
                        this = xgn0Var;
                    }
                }
            }
        }
        eg.m("This mutex is not locked");
    }

    public final boolean f() {
        return Math.max(avg.a.getIntVolatile(this, j261.g), 0) == 0;
    }

    public final boolean g() {
        xgn0 xgn0Var;
        while (true) {
            Unsafe unsafe = avg.a;
            long j = j261.g;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile > this.a) {
                while (true) {
                    Unsafe unsafe2 = avg.a;
                    long j2 = j261.g;
                    int intVolatile2 = unsafe2.getIntVolatile(this, j2);
                    int i = this.a;
                    if (intVolatile2 <= i) {
                        xgn0Var = this;
                        break;
                    }
                    xgn0 xgn0Var2 = this;
                    xgn0Var = xgn0Var2;
                    if (unsafe2.compareAndSwapInt(xgn0Var2, j2, intVolatile2, i)) {
                        break;
                    }
                    this = xgn0Var;
                }
            } else {
                xgn0Var = this;
                if (intVolatile <= 0) {
                    return false;
                }
                if (unsafe.compareAndSwapInt(xgn0Var, j, intVolatile, intVolatile - 1)) {
                    unsafe.putObjectVolatile(xgn0Var, X, (Object) null);
                    return true;
                }
            }
            this = xgn0Var;
        }
    }

    public final String toString() {
        return "Mutex@" + v8r.n(this) + "[isLocked=" + f() + ",owner=" + avg.a.getObjectVolatile(this, X) + ']';
    }
}
