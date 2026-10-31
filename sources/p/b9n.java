package p;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b9n implements Executor, Closeable {
    public static final /* synthetic */ long X;
    public static final /* synthetic */ long Y;
    public static final /* synthetic */ AtomicLongFieldUpdater h;
    public static final jm i;
    public static final /* synthetic */ long t;
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int a;
    public final int b;
    public final long c;
    private volatile /* synthetic */ long controlState$volatile;
    public final String d;
    public final nv40 e;
    public final nv40 f;
    public final ws21 g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    static {
        Unsafe unsafe = avg.a;
        Y = unsafe.objectFieldOffset(b9n.class.getDeclaredField("parkedWorkersStack$volatile"));
        h = AtomicLongFieldUpdater.newUpdater(b9n.class, "controlState$volatile");
        X = unsafe.objectFieldOffset(b9n.class.getDeclaredField("controlState$volatile"));
        t = unsafe.objectFieldOffset(b9n.class.getDeclaredField("_isTerminated$volatile"));
        i = new jm("NOT_IN_STACK", (byte) 5);
    }

    public b9n(int i2, long j, String str, int i3) {
        this.a = i2;
        this.b = i3;
        this.c = j;
        this.d = str;
        if (i2 < 1) {
            hhg1.f(gvg.e(i2, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i3 < i2) {
            hhg1.f(cy30.i(i3, "Max pool size ", i2, " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i3 > 2097150) {
            hhg1.f(gvg.e(i3, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            hhg1.f(gvg.f(j, "Idle worker keep alive time ", " must be positive"));
            throw null;
        }
        this.e = new nv40();
        this.f = new nv40();
        this.g = new ws21((i2 + 1) * 2);
        this.controlState$volatile = ((long) i2) << 42;
    }

    public static /* synthetic */ void d(b9n b9nVar, Runnable runnable, int i2) {
        b9nVar.c(runnable, false, (i2 & 4) == 0);
    }

    public final int a() {
        synchronized (this.g) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = h;
                Unsafe unsafe = avg.a;
                long j = X;
                long longVolatile = unsafe.getLongVolatile(this, j);
                int i2 = (int) (longVolatile & 2097151);
                int i3 = i2 - ((int) ((longVolatile & 4398044413952L) >> 21));
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.a) {
                    return 0;
                }
                if (i2 >= this.b) {
                    return 0;
                }
                int longVolatile2 = ((int) (unsafe.getLongVolatile(this, j) & 2097151)) + 1;
                if (longVolatile2 <= 0 || this.g.b(longVolatile2) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a9n a9nVar = new a9n(this, longVolatile2);
                this.g.c(longVolatile2, a9nVar);
                if (longVolatile2 != ((int) (atomicLongFieldUpdater.incrementAndGet(this) & 2097151))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i3 + 1;
                a9nVar.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Runnable runnable, boolean z, boolean z2) {
        zrd1 esd1Var;
        int i2;
        jsd1.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof zrd1) {
            esd1Var = (zrd1) runnable;
            esd1Var.a = jNanoTime;
            esd1Var.b = z;
        } else {
            esd1Var = new esd1(runnable, jNanoTime, z);
        }
        boolean z3 = esd1Var.b;
        long jAddAndGet = z3 ? h.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a9n a9nVar = threadCurrentThread instanceof a9n ? (a9n) threadCurrentThread : null;
        if (a9nVar == null || a9nVar.h != this) {
            a9nVar = null;
        }
        if (a9nVar != null && (i2 = a9nVar.c) != 5 && (esd1Var.b || i2 != 2)) {
            a9nVar.g = true;
            nwl1 nwl1Var = a9nVar.a;
            if (z2) {
                esd1Var = nwl1Var.a(esd1Var);
            } else {
                nwl1Var.getClass();
                zrd1 zrd1Var = (zrd1) avg.a.getAndSetObject(nwl1Var, nwl1.g, esd1Var);
                esd1Var = zrd1Var == null ? null : nwl1Var.a(zrd1Var);
            }
        }
        if (esd1Var != null) {
            if (!(esd1Var.b ? this.f.a(esd1Var) : this.e.a(esd1Var))) {
                throw new RejectedExecutionException(l1d.n(this.d, " was terminated", new StringBuilder()));
            }
        }
        if (z3) {
            if (g() || f(jAddAndGet)) {
                return;
            }
            g();
            return;
        }
        if (g() || f(avg.a.getLongVolatile(this, X))) {
            return;
        }
        g();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int longVolatile;
        zrd1 zrd1VarA;
        Unsafe unsafe = avg.a;
        if (unsafe.compareAndSwapInt(this, t, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            a9n a9nVar = threadCurrentThread instanceof a9n ? (a9n) threadCurrentThread : null;
            if (a9nVar == null || a9nVar.h != this) {
                a9nVar = null;
            }
            synchronized (this.g) {
                longVolatile = (int) (unsafe.getLongVolatile(this, X) & 2097151);
            }
            if (1 <= longVolatile) {
                int i2 = 1;
                while (true) {
                    Object objB = this.g.b(i2);
                    objB.getClass();
                    a9n a9nVar2 = (a9n) objB;
                    if (a9nVar2 != a9nVar) {
                        while (a9nVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(a9nVar2);
                            a9nVar2.join(10000L);
                        }
                        nwl1 nwl1Var = a9nVar2.a;
                        nv40 nv40Var = this.f;
                        nwl1Var.getClass();
                        zrd1 zrd1Var = (zrd1) avg.a.getAndSetObject(nwl1Var, nwl1.g, (Object) null);
                        if (zrd1Var != null) {
                            nv40Var.a(zrd1Var);
                        }
                        while (true) {
                            zrd1 zrd1VarC = nwl1Var.c();
                            if (zrd1VarC == null) {
                                break;
                            } else {
                                nv40Var.a(zrd1VarC);
                            }
                        }
                    }
                    if (i2 == longVolatile) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            nv40 nv40Var2 = this.f;
            while (true) {
                bpe0 bpe0Var = (bpe0) avg.a.getObjectVolatile(nv40Var2, zoe0.b);
                if (bpe0Var.b()) {
                    break;
                } else {
                    g5d0.h(nv40Var2, bpe0Var, bpe0Var.c());
                }
            }
            nv40 nv40Var3 = this.e;
            while (true) {
                bpe0 bpe0Var2 = (bpe0) avg.a.getObjectVolatile(nv40Var3, zoe0.b);
                if (bpe0Var2.b()) {
                    break;
                } else {
                    g5d0.h(nv40Var3, bpe0Var2, bpe0Var2.c());
                }
            }
            while (true) {
                if (a9nVar != null) {
                    zrd1VarA = a9nVar.a(true);
                    if (zrd1VarA == null) {
                        zrd1VarA = (zrd1) this.e.c();
                        if (zrd1VarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    zrd1VarA = (zrd1) this.e.c();
                    if (zrd1VarA == null && (zrd1VarA = (zrd1) this.f.c()) == null) {
                        break;
                    }
                }
                try {
                    zrd1VarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (a9nVar != null) {
                a9nVar.h(5);
            }
            Unsafe unsafe2 = avg.a;
            unsafe2.putLongVolatile(this, Y, 0L);
            unsafe2.putLongVolatile(this, X, 0L);
        }
    }

    public final void e(a9n a9nVar, int i2, int i3) {
        while (true) {
            long longVolatile = avg.a.getLongVolatile(this, Y);
            int i4 = (int) (2097151 & longVolatile);
            long j = (2097152 + longVolatile) & (-2097152);
            if (i4 == i2) {
                if (i3 == 0) {
                    Object objC = a9nVar.c();
                    while (true) {
                        if (objC == i) {
                            i4 = -1;
                            break;
                        }
                        if (objC == null) {
                            i4 = 0;
                            break;
                        }
                        a9n a9nVar2 = (a9n) objC;
                        int iB = a9nVar2.b();
                        if (iB != 0) {
                            i4 = iB;
                            break;
                        }
                        objC = a9nVar2.c();
                    }
                } else {
                    i4 = i3;
                }
            }
            if (i4 >= 0) {
                b9n b9nVar = this;
                if (avg.a.compareAndSwapLong(b9nVar, Y, longVolatile, j | ((long) i4))) {
                    return;
                } else {
                    this = b9nVar;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        d(this, runnable, 6);
    }

    public final boolean f(long j) {
        int i2 = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.a;
        if (i2 < i3) {
            int iA = a();
            if (iA == 1 && i3 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        b9n b9nVar;
        jm jmVar;
        int iB;
        while (true) {
            Unsafe unsafe = avg.a;
            long j = Y;
            long longVolatile = unsafe.getLongVolatile(this, j);
            a9n a9nVar = (a9n) this.g.b((int) (2097151 & longVolatile));
            if (a9nVar == null) {
                a9nVar = null;
                b9nVar = this;
            } else {
                long j2 = (2097152 + longVolatile) & (-2097152);
                Object objC = a9nVar.c();
                while (true) {
                    jmVar = i;
                    if (objC == jmVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a9n a9nVar2 = (a9n) objC;
                    iB = a9nVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = a9nVar2.c();
                    unsafe = unsafe;
                    this = this;
                }
                if (iB >= 0) {
                    b9n b9nVar2 = this;
                    boolean zCompareAndSwapLong = unsafe.compareAndSwapLong(b9nVar2, j, longVolatile, j2 | ((long) iB));
                    b9nVar = b9nVar2;
                    if (zCompareAndSwapLong) {
                        a9nVar.g(jmVar);
                    }
                    this = b9nVar;
                } else {
                    continue;
                }
            }
            if (a9nVar == null) {
                return false;
            }
            if (a9n.i.compareAndSet(a9nVar, -1, 0)) {
                LockSupport.unpark(a9nVar);
                return true;
            }
            this = b9nVar;
        }
    }

    public final boolean isTerminated() {
        return avg.a.getIntVolatile(this, t) == 1;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ws21 ws21Var = this.g;
        int iA = ws21Var.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < iA; i7++) {
            a9n a9nVar = (a9n) ws21Var.b(i7);
            if (a9nVar != null) {
                nwl1 nwl1Var = a9nVar.a;
                nwl1Var.getClass();
                Object objectVolatile = avg.a.getObjectVolatile(nwl1Var, nwl1.g);
                int iB = nwl1Var.b();
                if (objectVolatile != null) {
                    iB++;
                }
                int iC = l1d.C(a9nVar.c);
                if (iC == 0) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iB);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iC == 1) {
                    i3++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iB);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iC == 2) {
                    i4++;
                } else if (iC == 3) {
                    i5++;
                    if (iB > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iB);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iC != 4) {
                        eg.o();
                        return null;
                    }
                    i6++;
                }
            }
        }
        long longVolatile = avg.a.getLongVolatile(this, X);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.d);
        sb4.append('@');
        sb4.append(v8r.n(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.a;
        sb4.append(i8);
        sb4.append(", max = ");
        ktd.p(this.b, i2, "}, Worker States {CPU = ", ", blocking = ", sb4);
        ktd.p(i3, i4, ", parked = ", ", dormant = ", sb4);
        ktd.p(i5, i6, ", terminated = ", "}, running workers queues = ", sb4);
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.e.b());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f.b());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & longVolatile));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & longVolatile) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((longVolatile & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
