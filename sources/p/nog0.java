package p;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class nog0 extends ReentrantLock {
    public static final /* synthetic */ int g = 0;
    public final ipg0 a;
    public volatile int b;
    public int c;
    public int d;
    public volatile AtomicReferenceArray e;
    public final AtomicInteger f = new AtomicInteger();

    public nog0(ipg0 ipg0Var, int i) {
        this.a = ipg0Var;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i);
        this.d = (atomicReferenceArray.length() * 3) / 4;
        this.e = atomicReferenceArray;
    }

    public final void a(ReferenceQueue referenceQueue) {
        int i = 0;
        do {
            Object objPoll = referenceQueue.poll();
            if (objPoll == null) {
                return;
            }
            log0 log0Var = (log0) objPoll;
            ipg0 ipg0Var = this.a;
            int iB = log0Var.b();
            nog0 nog0VarB = ipg0Var.b(iB);
            nog0VarB.lock();
            try {
                AtomicReferenceArray atomicReferenceArray = nog0VarB.e;
                int length = iB & (atomicReferenceArray.length() - 1);
                log0 log0Var2 = (log0) atomicReferenceArray.get(length);
                for (log0 log0VarC = log0Var2; log0VarC != null; log0VarC = log0VarC.c()) {
                    if (log0VarC == log0Var) {
                        nog0VarB.c++;
                        log0 log0VarI = nog0VarB.i(log0Var2, log0VarC);
                        int i2 = nog0VarB.b - 1;
                        atomicReferenceArray.set(length, log0VarI);
                        nog0VarB.b = i2;
                        break;
                    }
                }
                nog0VarB.unlock();
                i++;
            } catch (Throwable th) {
                nog0VarB.unlock();
                throw th;
            }
        } while (i != 16);
    }

    public final void b(ReferenceQueue referenceQueue) {
        int i = 0;
        do {
            Object objPoll = referenceQueue.poll();
            if (objPoll == null) {
                return;
            }
            fpg0 fpg0Var = (fpg0) objPoll;
            ipg0 ipg0Var = this.a;
            log0 log0VarA = fpg0Var.a();
            int iB = log0VarA.b();
            nog0 nog0VarB = ipg0Var.b(iB);
            Object key = log0VarA.getKey();
            nog0VarB.lock();
            try {
                AtomicReferenceArray atomicReferenceArray = nog0VarB.e;
                int length = (atomicReferenceArray.length() - 1) & iB;
                log0 log0Var = (log0) atomicReferenceArray.get(length);
                for (log0 log0VarC = log0Var; log0VarC != null; log0VarC = log0VarC.c()) {
                    Object key2 = log0VarC.getKey();
                    if (log0VarC.b() == iB && key2 != null && nog0VarB.a.e.c(key, key2)) {
                        if (((epg0) log0VarC).a() != fpg0Var) {
                            break;
                        }
                        nog0VarB.c++;
                        log0 log0VarI = nog0VarB.i(log0Var, log0VarC);
                        int i2 = nog0VarB.b - 1;
                        atomicReferenceArray.set(length, log0VarI);
                        nog0VarB.b = i2;
                        break;
                    }
                }
                nog0VarB.unlock();
                i++;
            } catch (Throwable th) {
                nog0VarB.unlock();
                throw th;
            }
        } while (i != 16);
    }

    public final void c() {
        AtomicReferenceArray atomicReferenceArray = this.e;
        int length = atomicReferenceArray.length();
        if (length >= 1073741824) {
            return;
        }
        int i = this.b;
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length << 1);
        this.d = (atomicReferenceArray2.length() * 3) / 4;
        int length2 = atomicReferenceArray2.length() - 1;
        for (int i2 = 0; i2 < length; i2++) {
            log0 log0VarC = (log0) atomicReferenceArray.get(i2);
            if (log0VarC != null) {
                log0 log0VarC2 = log0VarC.c();
                int iB = log0VarC.b() & length2;
                if (log0VarC2 == null) {
                    atomicReferenceArray2.set(iB, log0VarC);
                } else {
                    log0 log0Var = log0VarC;
                    while (log0VarC2 != null) {
                        int iB2 = log0VarC2.b() & length2;
                        if (iB2 != iB) {
                            log0Var = log0VarC2;
                            iB = iB2;
                        }
                        log0VarC2 = log0VarC2.c();
                    }
                    atomicReferenceArray2.set(iB, log0Var);
                    while (log0VarC != log0Var) {
                        int iB3 = log0VarC.b() & length2;
                        log0 log0VarD = this.a.f.d(k(), log0VarC, (log0) atomicReferenceArray2.get(iB3));
                        if (log0VarD != null) {
                            atomicReferenceArray2.set(iB3, log0VarD);
                        } else {
                            i--;
                        }
                        log0VarC = log0VarC.c();
                    }
                }
            }
        }
        this.e = atomicReferenceArray2;
        this.b = i;
    }

    public final log0 d(int i, Object obj) {
        if (this.b == 0) {
            return null;
        }
        AtomicReferenceArray atomicReferenceArray = this.e;
        for (log0 log0VarC = (log0) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); log0VarC != null; log0VarC = log0VarC.c()) {
            if (log0VarC.b() == i) {
                Object key = log0VarC.getKey();
                if (key == null) {
                    m();
                } else if (this.a.e.c(obj, key)) {
                    return log0VarC;
                }
            }
        }
        return null;
    }

    public final void g() {
        if ((this.f.incrementAndGet() & 63) == 0) {
            j();
        }
    }

    public final Object h(int i, Object obj, Object obj2, boolean z) {
        lock();
        try {
            j();
            int i2 = this.b + 1;
            if (i2 > this.d) {
                c();
                i2 = this.b + 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.e;
            int length = (atomicReferenceArray.length() - 1) & i;
            log0 log0Var = (log0) atomicReferenceArray.get(length);
            for (log0 log0VarC = log0Var; log0VarC != null; log0VarC = log0VarC.c()) {
                Object key = log0VarC.getKey();
                if (log0VarC.b() == i && key != null && this.a.e.c(obj, key)) {
                    Object value = log0VarC.getValue();
                    if (value == null) {
                        this.c++;
                        l(log0VarC, obj2);
                        this.b = this.b;
                        return null;
                    }
                    if (z) {
                        return value;
                    }
                    this.c++;
                    l(log0VarC, obj2);
                    return value;
                }
            }
            this.c++;
            log0 log0VarC2 = this.a.f.c(k(), obj, i, log0Var);
            l(log0VarC2, obj2);
            atomicReferenceArray.set(length, log0VarC2);
            this.b = i2;
            return null;
        } finally {
            unlock();
        }
    }

    public final log0 i(log0 log0Var, log0 log0Var2) {
        int i = this.b;
        log0 log0VarC = log0Var2.c();
        while (log0Var != log0Var2) {
            log0 log0VarD = this.a.f.d(k(), log0Var, log0VarC);
            if (log0VarD != null) {
                log0VarC = log0VarD;
            } else {
                i--;
            }
            log0Var = log0Var.c();
        }
        this.b = i;
        return log0VarC;
    }

    public final void j() {
        if (tryLock()) {
            try {
                f();
                this.f.set(0);
            } finally {
                unlock();
            }
        }
    }

    public final void l(log0 log0Var, Object obj) {
        this.a.f.a(k(), log0Var, obj);
    }

    public final void m() {
        if (tryLock()) {
            try {
                f();
            } finally {
                unlock();
            }
        }
    }

    public void e() {
    }

    public void f() {
    }

    public nog0 k() {
        return this;
    }
}
