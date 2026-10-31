package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.core.Observer;
import java.util.concurrent.atomic.AtomicInteger;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class HalfSerializer {
    public static void a(Observer observer, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            atomicThrowable.d(observer);
        }
    }

    public static void b(Observer observer, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicThrowable.a(th) && atomicInteger.getAndIncrement() == 0) {
            atomicThrowable.d(observer);
        }
    }

    public static void c(Observer observer, Object obj, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            observer.onNext(obj);
            if (atomicInteger.decrementAndGet() != 0) {
                atomicThrowable.d(observer);
            }
        }
    }

    public static boolean d(gnc1 gnc1Var, Object obj, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            gnc1Var.onNext(obj);
            if (atomicInteger.decrementAndGet() == 0) {
                return true;
            }
            atomicThrowable.e(gnc1Var);
        }
        return false;
    }
}
