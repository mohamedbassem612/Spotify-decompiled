package p;

import io.reactivex.rxjava3.core.Observer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zia extends ko11 {
    public static final Object[] f = new Object[0];
    public static final yia[] g = new yia[0];
    public final AtomicReference a;
    public final AtomicReference b;
    public final Lock c;
    public final Lock d;
    public long e;

    public zia() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.c = reentrantReadWriteLock.readLock();
        this.d = reentrantReadWriteLock.writeLock();
        this.b = new AtomicReference(g);
        this.a = new AtomicReference();
    }

    public static zia a(Object obj) {
        zia ziaVar = new zia();
        ziaVar.a.lazySet(obj);
        return ziaVar;
    }

    public final void accept(Object obj) {
        if (obj == null) {
            bhn0.i("value == null");
            return;
        }
        Lock lock = this.d;
        lock.lock();
        this.e++;
        this.a.lazySet(obj);
        lock.unlock();
        for (yia yiaVar : (yia[]) this.b.get()) {
            long j = this.e;
            if (!yiaVar.g) {
                if (yiaVar.f) {
                    yiaVar.test(obj);
                } else {
                    synchronized (yiaVar) {
                        try {
                            if (!yiaVar.g) {
                                if (yiaVar.h != j) {
                                    if (yiaVar.d) {
                                        mgc mgcVar = yiaVar.e;
                                        if (mgcVar == null) {
                                            mgcVar = new mgc((byte) 4);
                                            yiaVar.e = mgcVar;
                                        }
                                        mgcVar.a(obj);
                                    } else {
                                        yiaVar.c = true;
                                        yiaVar.f = true;
                                        yiaVar.test(obj);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    public final boolean c() {
        return this.a.get() != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(yia yiaVar) {
        yia[] yiaVarArr;
        while (true) {
            AtomicReference atomicReference = this.b;
            yia[] yiaVarArr2 = (yia[]) atomicReference.get();
            int length = yiaVarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (yiaVarArr2[i] == yiaVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                yiaVarArr = g;
            } else {
                yia[] yiaVarArr3 = new yia[length - 1];
                System.arraycopy(yiaVarArr2, 0, yiaVarArr3, 0, i);
                System.arraycopy(yiaVarArr2, i + 1, yiaVarArr3, i, (length - i) - 1);
                yiaVarArr = yiaVarArr3;
            }
            while (!atomicReference.compareAndSet(yiaVarArr2, yiaVarArr)) {
                if (atomicReference.get() != yiaVarArr2) {
                }
            }
            return;
        }
    }

    public final void subscribeActual(Observer observer) {
        yia[] yiaVarArr;
        yia[] yiaVarArr2;
        mgc mgcVar;
        yia yiaVar = new yia(observer, this);
        observer.onSubscribe(yiaVar);
        AtomicReference atomicReference = this.b;
        do {
            yiaVarArr = (yia[]) atomicReference.get();
            int length = yiaVarArr.length;
            yiaVarArr2 = new yia[length + 1];
            System.arraycopy(yiaVarArr, 0, yiaVarArr2, 0, length);
            yiaVarArr2[length] = yiaVar;
        } while (!i3a.p(atomicReference, yiaVarArr, yiaVarArr2));
        if (yiaVar.g) {
            f(yiaVar);
            return;
        }
        if (yiaVar.g) {
            return;
        }
        synchronized (yiaVar) {
            try {
                if (yiaVar.g) {
                    return;
                }
                if (yiaVar.c) {
                    return;
                }
                zia ziaVar = yiaVar.b;
                Lock lock = ziaVar.c;
                lock.lock();
                yiaVar.h = ziaVar.e;
                Object obj = ziaVar.a.get();
                lock.unlock();
                yiaVar.d = obj != null;
                yiaVar.c = true;
                if (obj != null) {
                    yiaVar.test(obj);
                    while (!yiaVar.g) {
                        synchronized (yiaVar) {
                            try {
                                mgcVar = yiaVar.e;
                                if (mgcVar == null) {
                                    yiaVar.d = false;
                                    return;
                                }
                                yiaVar.e = null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        mgcVar.p(yiaVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
