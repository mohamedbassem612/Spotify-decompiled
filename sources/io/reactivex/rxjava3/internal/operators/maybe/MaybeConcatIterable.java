package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class MaybeConcatIterable<T> extends Flowable<T> {
    public final ArrayList b;

    public static final class ConcatMaybeObserver<T> extends AtomicInteger implements MaybeObserver<T>, pnc1 {
        public final gnc1 a;
        public final Iterator e;
        public long f;
        public final AtomicLong b = new AtomicLong();
        public final SequentialDisposable d = new SequentialDisposable();
        public final AtomicReference c = new AtomicReference(NotificationLite.a);

        public ConcatMaybeObserver(gnc1 gnc1Var, Iterator it) {
            this.a = gnc1Var;
            this.e = it;
        }

        public final void a() {
            Iterator it = this.e;
            if (getAndIncrement() != 0) {
                return;
            }
            do {
                SequentialDisposable sequentialDisposable = this.d;
                boolean zIsDisposed = sequentialDisposable.isDisposed();
                AtomicReference atomicReference = this.c;
                if (zIsDisposed) {
                    atomicReference.lazySet(null);
                    return;
                }
                Object obj = atomicReference.get();
                if (obj != null) {
                    NotificationLite notificationLite = NotificationLite.a;
                    gnc1 gnc1Var = this.a;
                    if (obj != notificationLite) {
                        long j = this.f;
                        if (j != this.b.get()) {
                            this.f = j + 1;
                            atomicReference.lazySet(null);
                            gnc1Var.onNext(obj);
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (!sequentialDisposable.isDisposed()) {
                        try {
                            if (it.hasNext()) {
                                try {
                                    Object next = it.next();
                                    Objects.requireNonNull(next, "The source Iterator returned a null MaybeSource");
                                    ((MaybeSource) next).subscribe(this);
                                } catch (Throwable th) {
                                    Exceptions.a(th);
                                    gnc1Var.onError(th);
                                    return;
                                }
                            } else {
                                gnc1Var.onComplete();
                            }
                        } catch (Throwable th2) {
                            Exceptions.a(th2);
                            gnc1Var.onError(th2);
                            return;
                        }
                    }
                }
            } while (decrementAndGet() != 0);
        }

        public final void cancel() {
            this.d.dispose();
        }

        public final void onComplete() {
            this.c.lazySet(NotificationLite.a);
            a();
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.c(this.d, disposable);
        }

        public final void onSuccess(Object obj) {
            this.c.lazySet(obj);
            a();
        }

        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                BackpressureHelper.a(this.b, j);
                a();
            }
        }
    }

    public MaybeConcatIterable(ArrayList arrayList) {
        this.b = arrayList;
    }

    public final void V(gnc1 gnc1Var) {
        try {
            Iterator it = this.b.iterator();
            Objects.requireNonNull(it, "The sources Iterable returned a null Iterator");
            ConcatMaybeObserver concatMaybeObserver = new ConcatMaybeObserver(gnc1Var, it);
            gnc1Var.onSubscribe(concatMaybeObserver);
            concatMaybeObserver.a();
        } catch (Throwable th) {
            Exceptions.a(th);
            gnc1Var.onSubscribe(EmptySubscription.a);
            gnc1Var.onError(th);
        }
    }
}
