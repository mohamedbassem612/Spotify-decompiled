package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BooleanSupplier;
import io.reactivex.rxjava3.internal.observers.QueueDrainObserver;
import io.reactivex.rxjava3.internal.queue.MpscLinkedQueue;
import io.reactivex.rxjava3.observers.SerializedObserver;
import io.reactivex.rxjava3.operators.SimplePlainQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicLong;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class QueueDrainHelper {
    public static boolean a(boolean z, boolean z2, Observer observer, MpscLinkedQueue mpscLinkedQueue, Disposable disposable, ObservableQueueDrain observableQueueDrain) {
        if (((QueueDrainObserver) observableQueueDrain).d) {
            mpscLinkedQueue.clear();
            disposable.dispose();
            return true;
        }
        if (!z || !z2) {
            return false;
        }
        if (disposable != null) {
            disposable.dispose();
        }
        observer.onComplete();
        return true;
    }

    public static SimplePlainQueue b(int i) {
        return i < 0 ? new SpscLinkedArrayQueue(-i) : new SpscArrayQueue(i);
    }

    public static void c(MpscLinkedQueue mpscLinkedQueue, SerializedObserver serializedObserver, Disposable disposable, QueueDrainObserver queueDrainObserver) {
        int iG = 1;
        while (true) {
            MpscLinkedQueue mpscLinkedQueue2 = mpscLinkedQueue;
            SerializedObserver serializedObserver2 = serializedObserver;
            Disposable disposable2 = disposable;
            QueueDrainObserver queueDrainObserver2 = queueDrainObserver;
            if (a(queueDrainObserver.e, mpscLinkedQueue.isEmpty(), serializedObserver2, mpscLinkedQueue2, disposable2, queueDrainObserver2)) {
                return;
            }
            while (true) {
                boolean z = queueDrainObserver2.e;
                Object objPoll = mpscLinkedQueue2.poll();
                boolean z2 = objPoll == null;
                boolean z3 = z2;
                if (a(z, z2, serializedObserver2, mpscLinkedQueue2, disposable2, queueDrainObserver2)) {
                    return;
                }
                if (z3) {
                    break;
                } else {
                    queueDrainObserver2.a(serializedObserver2, objPoll);
                }
            }
            iG = queueDrainObserver2.g(-iG);
            if (iG == 0) {
                return;
            }
            serializedObserver = serializedObserver2;
            mpscLinkedQueue = mpscLinkedQueue2;
            disposable = disposable2;
            queueDrainObserver = queueDrainObserver2;
        }
    }

    public static void d(gnc1 gnc1Var, ArrayDeque arrayDeque, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j;
        long j2;
        if (arrayDeque.isEmpty()) {
            gnc1Var.onComplete();
            return;
        }
        if (e(atomicLong.get(), gnc1Var, arrayDeque, atomicLong, booleanSupplier)) {
            return;
        }
        do {
            j = atomicLong.get();
            if ((j & Long.MIN_VALUE) != 0) {
                return;
            } else {
                j2 = j | Long.MIN_VALUE;
            }
        } while (!atomicLong.compareAndSet(j, j2));
        if (j != 0) {
            e(j2, gnc1Var, arrayDeque, atomicLong, booleanSupplier);
        }
    }

    public static boolean e(long j, gnc1 gnc1Var, ArrayDeque arrayDeque, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        boolean zA;
        boolean zA2;
        long j2 = j & Long.MIN_VALUE;
        while (true) {
            if (j2 != j) {
                try {
                    zA = booleanSupplier.a();
                } catch (Throwable th) {
                    Exceptions.a(th);
                    zA = true;
                }
                if (zA) {
                    break;
                }
                Object objPoll = arrayDeque.poll();
                if (objPoll == null) {
                    gnc1Var.onComplete();
                    return true;
                }
                gnc1Var.onNext(objPoll);
                j2++;
            } else {
                try {
                    zA2 = booleanSupplier.a();
                } catch (Throwable th2) {
                    Exceptions.a(th2);
                    zA2 = true;
                }
                if (zA2) {
                    break;
                }
                if (arrayDeque.isEmpty()) {
                    gnc1Var.onComplete();
                    return true;
                }
                j = atomicLong.get();
                if (j == j2) {
                    long jAddAndGet = atomicLong.addAndGet(-(j2 & Long.MAX_VALUE));
                    if ((Long.MAX_VALUE & jAddAndGet) == 0) {
                        return false;
                    }
                    j2 = jAddAndGet & Long.MIN_VALUE;
                    j = jAddAndGet;
                } else {
                    continue;
                }
            }
        }
        return true;
    }

    public static boolean f(long j, gnc1 gnc1Var, ArrayDeque arrayDeque, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j2;
        do {
            j2 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j2, BackpressureHelper.c(Long.MAX_VALUE & j2, j) | (j2 & Long.MIN_VALUE)));
        if (j2 != Long.MIN_VALUE) {
            return false;
        }
        e(j | Long.MIN_VALUE, gnc1Var, arrayDeque, atomicLong, booleanSupplier);
        return true;
    }
}
