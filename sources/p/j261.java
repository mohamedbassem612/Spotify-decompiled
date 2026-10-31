package p;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class j261 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(j261.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d;
    public static final /* synthetic */ AtomicLongFieldUpdater e;
    public static final /* synthetic */ AtomicIntegerFieldUpdater f;
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long h;
    public static final /* synthetic */ long i;
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a;
    public final g261 b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = avg.a;
        h = unsafe.objectFieldOffset(j261.class.getDeclaredField("head$volatile"));
        d = AtomicLongFieldUpdater.newUpdater(j261.class, "deqIdx$volatile");
        i = unsafe.objectFieldOffset(j261.class.getDeclaredField("tail$volatile"));
        e = AtomicLongFieldUpdater.newUpdater(j261.class, "enqIdx$volatile");
        f = AtomicIntegerFieldUpdater.newUpdater(j261.class, "_availablePermits$volatile");
        g = unsafe.objectFieldOffset(j261.class.getDeclaredField("_availablePermits$volatile"));
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [p.g261] */
    public j261(int i2, int i3) {
        this.a = i2;
        if (i2 <= 0) {
            hhg1.f(f4i1.c(i2, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i3 < 0 || i3 > i2) {
            hhg1.f(f4i1.c(i2, "The number of acquired permits should be in 0.."));
            throw null;
        }
        m261 m261Var = new m261(0L, null, 2);
        this.head$volatile = m261Var;
        this.tail$volatile = m261Var;
        this._availablePermits$volatile = i2 - i3;
        this.b = new xu30() { // from class: p.g261
            @Override // p.xu30
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                this.a.e();
                return rih1.a;
            }
        };
    }

    public final Object b(onm onmVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i2;
        do {
            atomicIntegerFieldUpdater = f;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i2 = this.a;
        } while (andDecrement > i2);
        rih1 rih1Var = rih1.a;
        if (andDecrement <= 0) {
            ohd ohdVarU = jzn1.u(aym.t(onmVar));
            try {
                if (!d(ohdVarU)) {
                    while (true) {
                        int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                        if (andDecrement2 <= i2) {
                            if (andDecrement2 > 0) {
                                ohdVarU.f(rih1Var, this.b);
                                break;
                            }
                            if (d(ohdVarU)) {
                                break;
                            }
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

    public final boolean d(o4l1 o4l1Var) {
        Object objH;
        Unsafe unsafe;
        j261 j261Var = this;
        Unsafe unsafe2 = avg.a;
        long j = i;
        m261 m261Var = (m261) unsafe2.getObjectVolatile(j261Var, j);
        long andIncrement = e.getAndIncrement(j261Var);
        h261 h261Var = h261.a;
        long j2 = andIncrement / ((long) l261.f);
        loop0: while (true) {
            objH = lvx.h(m261Var, j2, h261Var);
            if (zgo1.s(objH)) {
                break;
            }
            hp51 hp51VarR = zgo1.r(objH);
            while (true) {
                hp51 hp51Var = (hp51) avg.a.getObjectVolatile(j261Var, j);
                if (hp51Var.e >= hp51VarR.e) {
                    j261Var = this;
                    break loop0;
                }
                if (!hp51VarR.j()) {
                    break;
                }
                do {
                    unsafe = avg.a;
                    j261Var = this;
                    if (unsafe.compareAndSwapObject(j261Var, i, hp51Var, hp51VarR)) {
                        if (!hp51Var.f()) {
                            break loop0;
                        }
                        hp51Var.e();
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(j261Var, j) == hp51Var);
                if (hp51VarR.f()) {
                    hp51VarR.e();
                }
            }
            j261Var = this;
        }
        m261 m261Var2 = (m261) zgo1.r(objH);
        AtomicReferenceArray atomicReferenceArray = m261Var2.h;
        int i2 = (int) (andIncrement % ((long) l261.f));
        while (!atomicReferenceArray.compareAndSet(i2, null, o4l1Var)) {
            if (atomicReferenceArray.get(i2) != null) {
                jm jmVar = l261.b;
                jm jmVar2 = l261.c;
                while (!atomicReferenceArray.compareAndSet(i2, jmVar, jmVar2)) {
                    if (atomicReferenceArray.get(i2) != jmVar) {
                        return false;
                    }
                }
                ((mhd) o4l1Var).f(rih1.a, j261Var.b);
                return true;
            }
        }
        o4l1Var.b(m261Var2, i2);
        return true;
    }

    public final void e() {
        Object objH;
        int i2;
        do {
            int andIncrement = f.getAndIncrement(this);
            int i3 = this.a;
            if (andIncrement >= i3) {
                while (true) {
                    Unsafe unsafe = avg.a;
                    long j = g;
                    int intVolatile = unsafe.getIntVolatile(this, j);
                    int i4 = this.a;
                    if (intVolatile <= i4) {
                        break;
                    }
                    j261 j261Var = this;
                    if (unsafe.compareAndSwapInt(j261Var, j, intVolatile, i4)) {
                        break;
                    } else {
                        this = j261Var;
                    }
                }
                bhn0.x(i3, "The number of released permits cannot be greater than ");
                return;
            }
            if (andIncrement >= 0) {
                return;
            }
            Unsafe unsafe2 = avg.a;
            long j2 = h;
            m261 m261Var = (m261) unsafe2.getObjectVolatile(this, j2);
            long andIncrement2 = d.getAndIncrement(this);
            long j3 = andIncrement2 / ((long) l261.f);
            i261 i261Var = i261.a;
            while (true) {
                objH = lvx.h(m261Var, j3, i261Var);
                if (!zgo1.s(objH)) {
                    hp51 hp51VarR = zgo1.r(objH);
                    while (true) {
                        hp51 hp51Var = (hp51) avg.a.getObjectVolatile(this, j2);
                        if (hp51Var.e >= hp51VarR.e) {
                            break;
                        }
                        if (!hp51VarR.j()) {
                            break;
                        }
                        if (lf51.n(this, hp51Var, hp51VarR)) {
                            if (!hp51Var.f()) {
                                break;
                            }
                            hp51Var.e();
                            break;
                        } else if (hp51VarR.f()) {
                            hp51VarR.e();
                        }
                    }
                } else {
                    break;
                }
            }
            m261 m261Var2 = (m261) zgo1.r(objH);
            AtomicReferenceArray atomicReferenceArray = m261Var2.h;
            m261Var2.b();
            i2 = 0;
            if (m261Var2.e <= j3) {
                int i5 = (int) (andIncrement2 % ((long) l261.f));
                Object andSet = atomicReferenceArray.getAndSet(i5, l261.b);
                if (andSet == null) {
                    int i6 = l261.a;
                    while (true) {
                        if (i2 >= i6) {
                            i2 = !lf51.h(atomicReferenceArray, i5, l261.b, l261.d) ? 1 : 0;
                            break;
                        } else {
                            if (atomicReferenceArray.get(i5) == l261.c) {
                                i2 = 1;
                                break;
                            }
                            i2++;
                        }
                    }
                } else if (andSet != l261.e) {
                    boolean z = andSet instanceof mhd;
                    rih1 rih1Var = rih1.a;
                    if (z) {
                        mhd mhdVar = (mhd) andSet;
                        jm jmVarM = mhdVar.M(rih1Var, this.b);
                        if (jmVarM != null) {
                            mhdVar.O(jmVarM);
                            i2 = 1;
                            break;
                            break;
                        }
                    } else if (!(andSet instanceof ou51)) {
                        eg.m(f4i1.d(andSet, "unexpected: "));
                        return;
                    } else if (((ou51) andSet).i(this, rih1Var) == 0) {
                        i2 = 1;
                        break;
                        break;
                    }
                }
            }
        } while (i2 == 0);
    }
}
