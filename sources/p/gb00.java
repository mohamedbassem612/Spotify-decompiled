package p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class gb00 extends ab00 implements k4t {
    public static final /* synthetic */ long X;
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(gb00.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h;
    public static final /* synthetic */ long i;
    public static final /* synthetic */ long t;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = avg.a;
        X = unsafe.objectFieldOffset(gb00.class.getDeclaredField("_queue$volatile"));
        h = AtomicReferenceFieldUpdater.newUpdater(gb00.class, Object.class, "_delayed$volatile");
        i = unsafe.objectFieldOffset(gb00.class.getDeclaredField("_delayed$volatile"));
        t = unsafe.objectFieldOffset(gb00.class.getDeclaredField("_isCompleted$volatile"));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0083  */
    /* JADX WARN: Code duplicated, block: B:41:0x0088 A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #0 {, blocks: (B:39:0x0084, B:41:0x0088), top: B:56:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x009e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public final long Y() {
        Unsafe unsafe;
        long j;
        Runnable runnable;
        fb00 fb00Var;
        eb00 eb00Var;
        long jNanoTime;
        jm jmVar = bwp0.b;
        if (!Z()) {
            b0();
            while (true) {
                unsafe = avg.a;
                j = X;
                Object objectVolatile = unsafe.getObjectVolatile(this, j);
                if (objectVolatile != null) {
                    if (objectVolatile instanceof bpe0) {
                        bpe0 bpe0Var = (bpe0) objectVolatile;
                        Object objD = bpe0Var.d();
                        if (objD != bpe0.f) {
                            runnable = (Runnable) objD;
                            break;
                        }
                        bb00.k(this, objectVolatile, bpe0Var.c());
                    } else if (objectVolatile != jmVar) {
                        if (bb00.o(this, objectVolatile)) {
                            runnable = (Runnable) objectVolatile;
                            break;
                        }
                    }
                }
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            if (super.S() != 0) {
                Object objectVolatile2 = unsafe.getObjectVolatile(this, j);
                if (objectVolatile2 == null) {
                    fb00Var = (fb00) unsafe.getObjectVolatile(this, i);
                    if (fb00Var != null) {
                        return Long.MAX_VALUE;
                    }
                    synchronized (fb00Var) {
                        eb00[] eb00VarArr = fb00Var.a;
                        eb00Var = eb00VarArr != null ? eb00VarArr[0] : null;
                    }
                    if (eb00Var == null) {
                        return Long.MAX_VALUE;
                    }
                    jNanoTime = eb00Var.a - System.nanoTime();
                    if (jNanoTime < 0) {
                        return jNanoTime;
                    }
                } else if (objectVolatile2 instanceof bpe0) {
                    long longVolatile = unsafe.getLongVolatile((bpe0) objectVolatile2, bpe0.h);
                    if (((int) (1073741823 & longVolatile)) != ((int) ((longVolatile & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                    fb00Var = (fb00) unsafe.getObjectVolatile(this, i);
                    if (fb00Var != null) {
                        return Long.MAX_VALUE;
                    }
                    synchronized (fb00Var) {
                        eb00[] eb00VarArr2 = fb00Var.a;
                        if (eb00VarArr2 != null) {
                        }
                        if (eb00Var == null) {
                            return Long.MAX_VALUE;
                        }
                        jNanoTime = eb00Var.a - System.nanoTime();
                        if (jNanoTime < 0) {
                            return jNanoTime;
                        }
                    }
                } else if (objectVolatile2 == jmVar) {
                    return Long.MAX_VALUE;
                }
            }
        }
        return 0L;
    }

    public void a0(Runnable runnable) {
        b0();
        if (!c0(runnable)) {
            kyr.Y.a0(runnable);
            return;
        }
        Thread threadD0 = d0();
        if (Thread.currentThread() != threadD0) {
            LockSupport.unpark(threadD0);
        }
    }

    public final void b0() {
        eb00 eb00VarC;
        fb00 fb00Var = (fb00) avg.a.getObjectVolatile(this, i);
        if (fb00Var == null || fb00Var.b() == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (fb00Var) {
                try {
                    eb00[] eb00VarArr = fb00Var.a;
                    eb00VarC = null;
                    eb00 eb00Var = eb00VarArr != null ? eb00VarArr[0] : null;
                    if (eb00Var != null) {
                        if (jNanoTime - eb00Var.a >= 0 ? c0(eb00Var) : false) {
                            eb00VarC = fb00Var.c(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (eb00VarC != null);
    }

    @Override // p.k4t
    public final void c(long j, ohd ohdVar) {
        long jI = bwp0.i(j);
        if (jI < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            cb00 cb00Var = new cb00(this, jI + jNanoTime, ohdVar);
            g0(jNanoTime, cb00Var);
            jzn1.r(ohdVar, cb00Var);
        }
    }

    public final boolean c0(Runnable runnable) {
        Unsafe unsafe;
        Unsafe unsafe2;
        Unsafe unsafe3;
        while (true) {
            Unsafe unsafe4 = avg.a;
            long j = X;
            Object objectVolatile = unsafe4.getObjectVolatile(this, j);
            if (unsafe4.getIntVolatile(this, t) == 1) {
                return false;
            }
            if (objectVolatile == null) {
                do {
                    unsafe = avg.a;
                    if (unsafe.compareAndSwapObject(this, X, (Object) null, runnable)) {
                        return true;
                    }
                } while (unsafe.getObjectVolatile(this, j) == null);
            } else if (objectVolatile instanceof bpe0) {
                bpe0 bpe0Var = (bpe0) objectVolatile;
                int iA = bpe0Var.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    bpe0 bpe0VarC = bpe0Var.c();
                    do {
                        unsafe2 = avg.a;
                        if (unsafe2.compareAndSwapObject(this, X, objectVolatile, bpe0VarC)) {
                            break;
                        }
                    } while (unsafe2.getObjectVolatile(this, j) == objectVolatile);
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (objectVolatile == bwp0.b) {
                    return false;
                }
                bpe0 bpe0Var2 = new bpe0(8, true);
                bpe0Var2.a((Runnable) objectVolatile);
                bpe0Var2.a(runnable);
                do {
                    unsafe3 = avg.a;
                    if (unsafe3.compareAndSwapObject(this, X, objectVolatile, bpe0Var2)) {
                        return true;
                    }
                } while (unsafe3.getObjectVolatile(this, j) == objectVolatile);
            }
        }
    }

    public abstract Thread d0();

    public final boolean e0() {
        if (X()) {
            Unsafe unsafe = avg.a;
            fb00 fb00Var = (fb00) unsafe.getObjectVolatile(this, i);
            if (fb00Var != null && fb00Var.b() != 0) {
                return false;
            }
            Object objectVolatile = unsafe.getObjectVolatile(this, X);
            if (objectVolatile != null) {
                if (objectVolatile instanceof bpe0) {
                    long longVolatile = unsafe.getLongVolatile((bpe0) objectVolatile, bpe0.h);
                    return ((int) (1073741823 & longVolatile)) == ((int) ((longVolatile & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == bwp0.b) {
                }
            }
            return true;
        }
        return false;
    }

    public void f0(long j, eb00 eb00Var) {
        kyr.Y.g0(j, eb00Var);
    }

    public final void g0(long j, eb00 eb00Var) {
        int iB;
        Thread threadD0;
        long j2 = i;
        Unsafe unsafe = avg.a;
        if (unsafe.getIntVolatile(this, t) == 1) {
            iB = 1;
        } else {
            fb00 fb00Var = (fb00) unsafe.getObjectVolatile(this, j2);
            if (fb00Var == null) {
                fb00 fb00Var2 = new fb00();
                fb00Var2.c = j;
                zjy.n(this, fb00Var2);
                Object objectVolatile = unsafe.getObjectVolatile(this, j2);
                objectVolatile.getClass();
                fb00Var = (fb00) objectVolatile;
            }
            iB = eb00Var.b(j, fb00Var, this);
        }
        if (iB != 0) {
            if (iB == 1) {
                f0(j, eb00Var);
                return;
            } else {
                if (iB == 2) {
                    return;
                }
                eg.m("unexpected result");
                return;
            }
        }
        fb00 fb00Var3 = (fb00) unsafe.getObjectVolatile(this, j2);
        eb00 eb00Var2 = null;
        if (fb00Var3 != null) {
            synchronized (fb00Var3) {
                eb00[] eb00VarArr = fb00Var3.a;
                eb00Var2 = eb00VarArr != null ? eb00VarArr[0] : null;
            }
        }
        if (eb00Var2 != eb00Var || Thread.currentThread() == (threadD0 = d0())) {
            return;
        }
        LockSupport.unpark(threadD0);
    }

    public final void h(o8n o8nVar, Runnable runnable) {
        a0(runnable);
    }

    public void shutdown() {
        eb00 eb00VarC;
        jge1.a.set(null);
        avg.a.putIntVolatile(this, t, 1);
        jm jmVar = bwp0.b;
        while (true) {
            Object objectVolatile = avg.a.getObjectVolatile(this, X);
            if (objectVolatile == null) {
                if (zjy.o(this)) {
                    break;
                }
            } else if (objectVolatile instanceof bpe0) {
                ((bpe0) objectVolatile).b();
                break;
            } else {
                if (objectVolatile == jmVar) {
                    break;
                }
                bpe0 bpe0Var = new bpe0(8, true);
                bpe0Var.a((Runnable) objectVolatile);
                if (bb00.p(this, objectVolatile, bpe0Var)) {
                    break;
                }
            }
        }
        while (Y() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            fb00 fb00Var = (fb00) avg.a.getObjectVolatile(this, i);
            if (fb00Var == null) {
                return;
            }
            synchronized (fb00Var) {
                eb00VarC = fb00Var.b() > 0 ? fb00Var.c(0) : null;
            }
            if (eb00VarC == null) {
                return;
            } else {
                f0(jNanoTime, eb00VarC);
            }
        }
    }
}
