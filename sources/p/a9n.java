package p;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a9n extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(a9n.class, "workerCtl$volatile");
    public static final /* synthetic */ long t = avg.a.objectFieldOffset(a9n.class.getDeclaredField("workerCtl$volatile"));
    public final nwl1 a;
    public final p811 b;
    public int c;
    public long d;
    public long e;
    public int f;
    public boolean g;
    public final /* synthetic */ b9n h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public a9n(b9n b9nVar, int i2) {
        this.h = b9nVar;
        setDaemon(true);
        setContextClassLoader(b9n.class.getClassLoader());
        this.a = new nwl1();
        this.b = new p811();
        this.c = 4;
        this.nextParkedWorker = b9n.i;
        int iNanoTime = (int) System.nanoTime();
        this.f = iNanoTime == 0 ? 42 : iNanoTime;
        f(i2);
    }

    public final zrd1 a(boolean z) {
        zrd1 zrd1VarE;
        zrd1 zrd1VarE2;
        long j;
        int i2 = this.c;
        b9n b9nVar = this.h;
        zrd1 zrd1Var = null;
        nwl1 nwl1Var = this.a;
        if (i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b9n.h;
            do {
                j = atomicLongFieldUpdater.get(b9nVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    nwl1Var.getClass();
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nwl1.b;
                        Unsafe unsafe = avg.a;
                        zrd1 zrd1Var2 = (zrd1) unsafe.getObjectVolatile(nwl1Var, nwl1.g);
                        if (zrd1Var2 == null || !zrd1Var2.b) {
                            int intVolatile = unsafe.getIntVolatile(nwl1Var, nwl1.f);
                            int intVolatile2 = unsafe.getIntVolatile(nwl1Var, nwl1.h);
                            while (intVolatile != intVolatile2 && avg.a.getIntVolatile(nwl1Var, nwl1.e) != 0) {
                                intVolatile2--;
                                zrd1 zrd1VarD = nwl1Var.d(intVolatile2, true);
                                if (zrd1VarD != null) {
                                    zrd1Var = zrd1VarD;
                                    break;
                                }
                            }
                            break;
                        }
                        if (xvj1.v(nwl1Var, zrd1Var2)) {
                            zrd1Var = zrd1Var2;
                            break;
                        }
                    }
                    if (zrd1Var != null) {
                        return zrd1Var;
                    }
                    zrd1 zrd1Var3 = (zrd1) b9nVar.f.c();
                    return zrd1Var3 == null ? i(1) : zrd1Var3;
                }
            } while (!b9n.h.compareAndSet(b9nVar, j, j - 4398046511104L));
            this.c = 1;
        }
        if (z) {
            boolean z2 = d(b9nVar.a * 2) == 0;
            if (z2 && (zrd1VarE2 = e()) != null) {
                return zrd1VarE2;
            }
            nwl1Var.getClass();
            zrd1 zrd1VarC = (zrd1) avg.a.getAndSetObject(nwl1Var, nwl1.g, (Object) null);
            if (zrd1VarC == null) {
                zrd1VarC = nwl1Var.c();
            }
            if (zrd1VarC != null) {
                return zrd1VarC;
            }
            if (!z2 && (zrd1VarE = e()) != null) {
                return zrd1VarE;
            }
        } else {
            zrd1 zrd1VarE3 = e();
            if (zrd1VarE3 != null) {
                return zrd1VarE3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i2) {
        int i3 = this.f;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f = i6;
        int i7 = i2 - 1;
        return (i7 & i2) == 0 ? i7 & i6 : (Integer.MAX_VALUE & i6) % i2;
    }

    public final zrd1 e() {
        int iD = d(2);
        b9n b9nVar = this.h;
        nv40 nv40Var = b9nVar.f;
        nv40 nv40Var2 = b9nVar.e;
        if (iD == 0) {
            zrd1 zrd1Var = (zrd1) nv40Var2.c();
            return zrd1Var != null ? zrd1Var : (zrd1) nv40Var.c();
        }
        zrd1 zrd1Var2 = (zrd1) nv40Var.c();
        return zrd1Var2 != null ? zrd1Var2 : (zrd1) nv40Var2.c();
    }

    public final void f(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.h.d);
        sb.append("-worker-");
        sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i2) {
        int i3 = this.c;
        boolean z = i3 == 1;
        if (z) {
            b9n.h.addAndGet(this.h, 4398046511104L);
        }
        if (i3 != i2) {
            this.c = i2;
        }
        return z;
    }

    public final zrd1 i(int i2) {
        int i3;
        long j;
        zrd1 zrd1VarC;
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b9n.h;
        b9n b9nVar = this.h;
        int i4 = (int) (atomicLongFieldUpdater.get(b9nVar) & 2097151);
        zrd1 zrd1Var = null;
        if (i4 < 2) {
            return null;
        }
        int iD = d(i4);
        int i5 = 0;
        long jMin = Long.MAX_VALUE;
        while (i5 < i4) {
            iD++;
            if (iD > i4) {
                iD = 1;
            }
            a9n a9nVar = (a9n) b9nVar.g.b(iD);
            if (a9nVar == null || a9nVar == this) {
                i3 = i4;
            } else {
                nwl1 nwl1Var = a9nVar.a;
                nwl1Var.getClass();
                if (i2 != 3) {
                    boolean z = i2 == 1;
                    Unsafe unsafe = avg.a;
                    j = 0;
                    int intVolatile = unsafe.getIntVolatile(nwl1Var, nwl1.f);
                    int intVolatile2 = unsafe.getIntVolatile(nwl1Var, nwl1.h);
                    while (true) {
                        if (intVolatile != intVolatile2) {
                            if (z) {
                                i3 = i4;
                                if (avg.a.getIntVolatile(nwl1Var, nwl1.e) == 0) {
                                }
                            } else {
                                i3 = i4;
                            }
                            int i6 = intVolatile + 1;
                            zrd1 zrd1VarD = nwl1Var.d(intVolatile, z);
                            if (zrd1VarD != null) {
                                zrd1VarC = zrd1VarD;
                                break;
                            }
                            intVolatile = i6;
                            i4 = i3;
                        } else {
                            i3 = i4;
                        }
                        zrd1VarC = zrd1Var;
                        break;
                    }
                } else {
                    zrd1VarC = nwl1Var.c();
                    i3 = i4;
                    j = 0;
                }
                p811 p811Var = this.b;
                if (zrd1VarC == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nwl1.b;
                        j2 = -1;
                        zrd1 zrd1Var2 = (zrd1) avg.a.getObjectVolatile(nwl1Var, nwl1.g);
                        if (zrd1Var2 != null) {
                            if (((zrd1Var2.b ? 1 : 2) & i2) != 0) {
                                jsd1.f.getClass();
                                nwl1 nwl1Var2 = nwl1Var;
                                long jNanoTime = System.nanoTime() - zrd1Var2.a;
                                long j4 = jsd1.b;
                                if (jNanoTime < j4) {
                                    j3 = j4 - jNanoTime;
                                    break;
                                }
                                if (xvj1.r(nwl1Var2, zrd1Var2)) {
                                    p811Var.a = zrd1Var2;
                                    j3 = -1;
                                    break;
                                }
                                nwl1Var = nwl1Var2;
                            }
                        }
                        j3 = -2;
                        break;
                    }
                } else {
                    p811Var.a = zrd1VarC;
                    j3 = -1;
                    j2 = -1;
                }
                if (j3 == j2) {
                    zrd1 zrd1Var3 = (zrd1) p811Var.a;
                    p811Var.a = null;
                    return zrd1Var3;
                }
                if (j3 > j) {
                    jMin = Math.min(jMin, j3);
                }
            }
            i5++;
            i4 = i3;
            zrd1Var = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.e = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (this.h.isTerminated() || this.c == 5) {
                    break loop0;
                }
                zrd1 zrd1VarA = a(this.g);
                if (zrd1VarA != null) {
                    this.e = 0L;
                    b9n b9nVar = this.h;
                    this.d = 0L;
                    if (this.c == 3) {
                        this.c = 2;
                    }
                    if (!zrd1VarA.b) {
                        try {
                            zrd1VarA.run();
                            break;
                        } catch (Throwable th) {
                            Thread threadCurrentThread = Thread.currentThread();
                            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                            break;
                        }
                    }
                    if (h(2) && !b9nVar.g() && !b9nVar.f(avg.a.getLongVolatile(b9nVar, b9n.X))) {
                        b9nVar.g();
                    }
                    try {
                        zrd1VarA.run();
                    } catch (Throwable th2) {
                        Thread threadCurrentThread2 = Thread.currentThread();
                        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                    }
                    b9n.h.addAndGet(b9nVar, -2097152L);
                    if (this.c == 5) {
                        break;
                    }
                    this.c = 4;
                    break;
                }
                this.g = false;
                if (this.e == 0) {
                    Object obj = this.nextParkedWorker;
                    jm jmVar = b9n.i;
                    if (obj != jmVar) {
                        avg.a.putIntVolatile(this, t, -1);
                        while (this.nextParkedWorker != b9n.i) {
                            Unsafe unsafe = avg.a;
                            long j2 = t;
                            if (unsafe.getIntVolatile(this, j2) != -1 || this.h.isTerminated() || this.c == 5) {
                                break;
                            }
                            h(3);
                            Thread.interrupted();
                            if (this.d == 0) {
                                j = 2097151;
                                this.d = System.nanoTime() + this.h.c;
                            } else {
                                j = 2097151;
                            }
                            LockSupport.parkNanos(this.h.c);
                            if (System.nanoTime() - this.d >= 0) {
                                this.d = 0L;
                                b9n b9nVar2 = this.h;
                                synchronized (b9nVar2.g) {
                                    try {
                                        if (!b9nVar2.isTerminated()) {
                                            AtomicLongFieldUpdater atomicLongFieldUpdater = b9n.h;
                                            if (((int) (atomicLongFieldUpdater.get(b9nVar2) & j)) > b9nVar2.a && unsafe.compareAndSwapInt(this, j2, -1, 1)) {
                                                int i2 = this.indexInArray;
                                                f(0);
                                                b9nVar2.e(this, i2, 0);
                                                int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(b9nVar2) & j);
                                                if (andDecrement != i2) {
                                                    Object objB = b9nVar2.g.b(andDecrement);
                                                    objB.getClass();
                                                    a9n a9nVar = (a9n) objB;
                                                    b9nVar2.g.c(i2, a9nVar);
                                                    a9nVar.f(i2);
                                                    b9nVar2.e(a9nVar, andDecrement, i2);
                                                }
                                                b9nVar2.g.c(andDecrement, null);
                                                this.c = 5;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                            }
                        }
                    } else {
                        b9n b9nVar3 = this.h;
                        if (this.nextParkedWorker == jmVar) {
                            while (true) {
                                Unsafe unsafe2 = avg.a;
                                long j3 = b9n.Y;
                                long longVolatile = unsafe2.getLongVolatile(b9nVar3, j3);
                                int i3 = this.indexInArray;
                                this.nextParkedWorker = b9nVar3.g.b((int) (longVolatile & 2097151));
                                b9n b9nVar4 = b9nVar3;
                                if (unsafe2.compareAndSwapLong(b9nVar4, j3, longVolatile, ((longVolatile + 2097152) & (-2097152)) | ((long) i3))) {
                                    break;
                                } else {
                                    b9nVar3 = b9nVar4;
                                }
                            }
                        }
                    }
                } else {
                    if (z) {
                        h(3);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.e);
                        this.e = 0L;
                        break;
                    }
                    z = true;
                }
            }
        }
        h(5);
    }
}
