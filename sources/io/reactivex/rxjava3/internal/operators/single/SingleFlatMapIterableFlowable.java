package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleFlatMapIterableFlowable<T, R> extends Flowable<R> {
    public final Single b;
    public final Function c;

    public static final class FlatMapIterableObserver<T, R> extends BasicIntQueueSubscription<R> implements SingleObserver<T> {
        public final gnc1 a;
        public final Function b;
        public final AtomicLong c = new AtomicLong();
        public Disposable d;
        public volatile Iterator e;
        public volatile boolean f;
        public boolean g;

        public FlatMapIterableObserver(gnc1 gnc1Var, Function function) {
            this.a = gnc1Var;
            this.b = function;
        }

        public final int a(int i) {
            this.g = true;
            return 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            gnc1 gnc1Var = this.a;
            Iterator it = this.e;
            if (this.g && it != null) {
                gnc1Var.onNext((Object) null);
                gnc1Var.onComplete();
                return;
            }
            int iAddAndGet = 1;
            while (true) {
                if (it != null) {
                    long j = this.c.get();
                    if (j == Long.MAX_VALUE) {
                        while (!this.f) {
                            try {
                                gnc1Var.onNext(it.next());
                                if (this.f) {
                                    return;
                                }
                                try {
                                    if (!it.hasNext()) {
                                        gnc1Var.onComplete();
                                        return;
                                    }
                                } catch (Throwable th) {
                                    Exceptions.a(th);
                                    gnc1Var.onError(th);
                                    return;
                                }
                            } catch (Throwable th2) {
                                Exceptions.a(th2);
                                gnc1Var.onError(th2);
                                return;
                            }
                        }
                        return;
                    }
                    long j2 = 0;
                    while (j2 != j) {
                        if (this.f) {
                            return;
                        }
                        try {
                            Object next = it.next();
                            Objects.requireNonNull(next, "The iterator returned a null value");
                            gnc1Var.onNext(next);
                            if (this.f) {
                                return;
                            }
                            j2++;
                            try {
                                if (!it.hasNext()) {
                                    gnc1Var.onComplete();
                                    return;
                                }
                            } catch (Throwable th3) {
                                Exceptions.a(th3);
                                gnc1Var.onError(th3);
                                return;
                            }
                        } catch (Throwable th4) {
                            Exceptions.a(th4);
                            gnc1Var.onError(th4);
                            return;
                        }
                    }
                    if (j2 != 0) {
                        BackpressureHelper.e(this.c, j2);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (it == null) {
                    it = this.e;
                }
            }
        }

        public final void cancel() {
            this.f = true;
            this.d.dispose();
            this.d = DisposableHelper.a;
        }

        public final void clear() {
            this.e = null;
        }

        public final boolean isEmpty() {
            return this.e == null;
        }

        public final void onError(Throwable th) {
            this.d = DisposableHelper.a;
            this.a.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.d, disposable)) {
                this.d = disposable;
                this.a.onSubscribe(this);
            }
        }

        public final void onSuccess(Object obj) {
            try {
                Iterator<T> it = ((Iterable) this.b.apply(obj)).iterator();
                if (!it.hasNext()) {
                    this.a.onComplete();
                } else {
                    this.e = it;
                    b();
                }
            } catch (Throwable th) {
                Exceptions.a(th);
                this.a.onError(th);
            }
        }

        public final Object poll() {
            Iterator it = this.e;
            if (it == null) {
                return null;
            }
            Object next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.e = null;
            }
            return next;
        }

        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                BackpressureHelper.a(this.c, j);
                b();
            }
        }
    }

    public SingleFlatMapIterableFlowable(Single single, Function function) {
        this.b = single;
        this.c = function;
    }

    public final void V(gnc1 gnc1Var) {
        this.b.subscribe(new FlatMapIterableObserver(gnc1Var, this.c));
    }
}
