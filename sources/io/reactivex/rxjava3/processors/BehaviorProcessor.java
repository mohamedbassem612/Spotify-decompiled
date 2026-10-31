package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p.gnc1;
import p.i3a;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class BehaviorProcessor<T> extends FlowableProcessor<T> {
    public static final Object[] h = new Object[0];
    public static final BehaviorSubscription[] i = new BehaviorSubscription[0];
    public static final BehaviorSubscription[] t = new BehaviorSubscription[0];
    public final AtomicReference b;
    public final Lock c;
    public final Lock d;
    public final AtomicReference e = new AtomicReference();
    public final AtomicReference f;
    public long g;

    public static final class BehaviorSubscription<T> extends AtomicLong implements pnc1, AppendOnlyLinkedArrayList.NonThrowingPredicate<Object> {
        public final gnc1 a;
        public final BehaviorProcessor b;
        public boolean c;
        public boolean d;
        public AppendOnlyLinkedArrayList e;
        public boolean f;
        public volatile boolean g;
        public long h;

        public BehaviorSubscription(gnc1 gnc1Var, BehaviorProcessor behaviorProcessor) {
            this.a = gnc1Var;
            this.b = behaviorProcessor;
        }

        public final void a(long j, Object obj) {
            if (this.g) {
                return;
            }
            if (!this.f) {
                synchronized (this) {
                    try {
                        if (this.g) {
                            return;
                        }
                        if (this.h == j) {
                            return;
                        }
                        if (this.d) {
                            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.e;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList();
                                this.e = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.b(obj);
                            return;
                        }
                        this.c = true;
                        this.f = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            test(obj);
        }

        @Override // p.pnc1
        public final void cancel() {
            if (this.g) {
                return;
            }
            this.g = true;
            this.b.g0(this);
        }

        @Override // p.pnc1
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                BackpressureHelper.a(this, j);
            }
        }

        @Override // io.reactivex.rxjava3.functions.Predicate
        public final boolean test(Object obj) {
            if (this.g) {
                return true;
            }
            if (NotificationLite.g(obj)) {
                this.a.onComplete();
                return true;
            }
            if (NotificationLite.h(obj)) {
                this.a.onError(NotificationLite.f(obj));
                return true;
            }
            long j = get();
            if (j == 0) {
                cancel();
                this.a.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                return true;
            }
            this.a.onNext(obj);
            if (j == Long.MAX_VALUE) {
                return false;
            }
            decrementAndGet();
            return false;
        }
    }

    public BehaviorProcessor() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.c = reentrantReadWriteLock.readLock();
        this.d = reentrantReadWriteLock.writeLock();
        this.b = new AtomicReference(i);
        this.f = new AtomicReference();
    }

    public static BehaviorProcessor e0(Object obj) {
        BehaviorProcessor behaviorProcessor = new BehaviorProcessor();
        behaviorProcessor.e.lazySet(obj);
        return behaviorProcessor;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        BehaviorSubscription[] behaviorSubscriptionArr;
        BehaviorSubscription[] behaviorSubscriptionArr2;
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
        BehaviorSubscription behaviorSubscription = new BehaviorSubscription(gnc1Var, this);
        gnc1Var.onSubscribe(behaviorSubscription);
        AtomicReference atomicReference = this.b;
        do {
            behaviorSubscriptionArr = (BehaviorSubscription[]) atomicReference.get();
            if (behaviorSubscriptionArr == t) {
                Throwable th = (Throwable) this.f.get();
                if (th == ExceptionHelper.a) {
                    gnc1Var.onComplete();
                    return;
                } else {
                    gnc1Var.onError(th);
                    return;
                }
            }
            int length = behaviorSubscriptionArr.length;
            behaviorSubscriptionArr2 = new BehaviorSubscription[length + 1];
            System.arraycopy(behaviorSubscriptionArr, 0, behaviorSubscriptionArr2, 0, length);
            behaviorSubscriptionArr2[length] = behaviorSubscription;
        } while (!i3a.p(atomicReference, behaviorSubscriptionArr, behaviorSubscriptionArr2));
        if (behaviorSubscription.g) {
            g0(behaviorSubscription);
            return;
        }
        if (behaviorSubscription.g) {
            return;
        }
        synchronized (behaviorSubscription) {
            try {
                if (behaviorSubscription.g) {
                    return;
                }
                if (behaviorSubscription.c) {
                    return;
                }
                BehaviorProcessor behaviorProcessor = behaviorSubscription.b;
                Lock lock = behaviorProcessor.c;
                lock.lock();
                behaviorSubscription.h = behaviorProcessor.g;
                Object obj = behaviorProcessor.e.get();
                lock.unlock();
                behaviorSubscription.d = obj != null;
                behaviorSubscription.c = true;
                if (obj == null || behaviorSubscription.test(obj)) {
                    return;
                }
                while (!behaviorSubscription.g) {
                    synchronized (behaviorSubscription) {
                        try {
                            appendOnlyLinkedArrayList = behaviorSubscription.e;
                            if (appendOnlyLinkedArrayList == null) {
                                behaviorSubscription.d = false;
                                return;
                            }
                            behaviorSubscription.e = null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    appendOnlyLinkedArrayList.c(behaviorSubscription);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean f0() {
        return ((BehaviorSubscription[]) this.b.get()).length != 0;
    }

    public final void g0(BehaviorSubscription behaviorSubscription) {
        AtomicReference atomicReference;
        BehaviorSubscription[] behaviorSubscriptionArr;
        BehaviorSubscription[] behaviorSubscriptionArr2;
        do {
            atomicReference = this.b;
            behaviorSubscriptionArr = (BehaviorSubscription[]) atomicReference.get();
            int length = behaviorSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (behaviorSubscriptionArr[i2] == behaviorSubscription) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 < 0) {
                return;
            }
            if (length == 1) {
                behaviorSubscriptionArr2 = i;
            } else {
                BehaviorSubscription[] behaviorSubscriptionArr3 = new BehaviorSubscription[length - 1];
                System.arraycopy(behaviorSubscriptionArr, 0, behaviorSubscriptionArr3, 0, i2);
                System.arraycopy(behaviorSubscriptionArr, i2 + 1, behaviorSubscriptionArr3, i2, (length - i2) - 1);
                behaviorSubscriptionArr2 = behaviorSubscriptionArr3;
            }
        } while (!i3a.p(atomicReference, behaviorSubscriptionArr, behaviorSubscriptionArr2));
    }

    @Override // p.gnc1
    public final void onComplete() {
        if (i3a.o(this.f, ExceptionHelper.a)) {
            Lock lock = this.d;
            lock.lock();
            this.g++;
            AtomicReference atomicReference = this.e;
            NotificationLite notificationLite = NotificationLite.a;
            atomicReference.lazySet(notificationLite);
            lock.unlock();
            for (BehaviorSubscription behaviorSubscription : (BehaviorSubscription[]) this.b.getAndSet(t)) {
                behaviorSubscription.a(this.g, notificationLite);
            }
        }
    }

    @Override // p.gnc1
    public final void onError(Throwable th) {
        ExceptionHelper.c(th, "onError called with a null Throwable.");
        if (!i3a.q(this.f, th)) {
            RxJavaPlugins.b(th);
            return;
        }
        Object objE = NotificationLite.e(th);
        Lock lock = this.d;
        lock.lock();
        this.g++;
        this.e.lazySet(objE);
        lock.unlock();
        for (BehaviorSubscription behaviorSubscription : (BehaviorSubscription[]) this.b.getAndSet(t)) {
            behaviorSubscription.a(this.g, objE);
        }
    }

    @Override // p.gnc1
    public final void onNext(Object obj) {
        ExceptionHelper.c(obj, "onNext called with a null value.");
        if (this.f.get() != null) {
            return;
        }
        Lock lock = this.d;
        lock.lock();
        this.g++;
        this.e.lazySet(obj);
        lock.unlock();
        for (BehaviorSubscription behaviorSubscription : (BehaviorSubscription[]) this.b.get()) {
            behaviorSubscription.a(this.g, obj);
        }
    }

    @Override // p.gnc1
    public final void onSubscribe(pnc1 pnc1Var) {
        if (this.f.get() != null) {
            pnc1Var.cancel();
        } else {
            pnc1Var.request(Long.MAX_VALUE);
        }
    }
}
