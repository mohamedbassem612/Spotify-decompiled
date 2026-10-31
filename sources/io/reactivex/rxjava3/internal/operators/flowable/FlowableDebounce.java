package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.subscribers.DisposableSubscriber;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p.gnc1;
import p.moy0;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableDebounce<T, U> extends AbstractFlowableWithUpstream<T, T> {
    public final Function c;

    public static final class DebounceSubscriber<T, U> extends AtomicLong implements FlowableSubscriber<T>, pnc1 {
        public final SerializedSubscriber a;
        public final Function b;
        public pnc1 c;
        public final AtomicReference d = new AtomicReference();
        public volatile long e;
        public boolean f;

        public static final class DebounceInnerSubscriber<T, U> extends DisposableSubscriber<U> {
            public final DebounceSubscriber b;
            public final long c;
            public final Object d;
            public boolean e;
            public final AtomicBoolean f = new AtomicBoolean();

            public DebounceInnerSubscriber(DebounceSubscriber debounceSubscriber, long j, Object obj) {
                this.b = debounceSubscriber;
                this.c = j;
                this.d = obj;
            }

            public final void a() {
                if (this.f.compareAndSet(false, true)) {
                    DebounceSubscriber debounceSubscriber = this.b;
                    long j = this.c;
                    Object obj = this.d;
                    if (j == debounceSubscriber.e) {
                        if (debounceSubscriber.get() != 0) {
                            debounceSubscriber.a.onNext(obj);
                            BackpressureHelper.e(debounceSubscriber, 1L);
                        } else {
                            debounceSubscriber.cancel();
                            debounceSubscriber.a.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                        }
                    }
                }
            }

            public final void onComplete() {
                if (this.e) {
                    return;
                }
                this.e = true;
                a();
            }

            public final void onError(Throwable th) {
                if (this.e) {
                    RxJavaPlugins.b(th);
                } else {
                    this.e = true;
                    this.b.onError(th);
                }
            }

            public final void onNext(Object obj) {
                if (this.e) {
                    return;
                }
                this.e = true;
                dispose();
                a();
            }
        }

        public DebounceSubscriber(SerializedSubscriber serializedSubscriber, Function function) {
            this.a = serializedSubscriber;
            this.b = function;
        }

        public final void cancel() {
            this.c.cancel();
            DisposableHelper.a(this.d);
        }

        public final void onComplete() {
            if (this.f) {
                return;
            }
            this.f = true;
            AtomicReference atomicReference = this.d;
            Disposable disposable = (Disposable) atomicReference.get();
            if (DisposableHelper.b(disposable)) {
                return;
            }
            DebounceInnerSubscriber debounceInnerSubscriber = (DebounceInnerSubscriber) disposable;
            if (debounceInnerSubscriber != null) {
                debounceInnerSubscriber.a();
            }
            DisposableHelper.a(atomicReference);
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            DisposableHelper.a(this.d);
            this.a.onError(th);
        }

        public final void onNext(Object obj) {
            if (this.f) {
                return;
            }
            long j = this.e + 1;
            this.e = j;
            Disposable disposable = (Disposable) this.d.get();
            if (disposable != null) {
                disposable.dispose();
            }
            try {
                Object objApply = this.b.apply(obj);
                Objects.requireNonNull(objApply, "The publisher supplied is null");
                moy0 moy0Var = (moy0) objApply;
                DebounceInnerSubscriber debounceInnerSubscriber = new DebounceInnerSubscriber(this, j, obj);
                AtomicReference atomicReference = this.d;
                while (!atomicReference.compareAndSet(disposable, debounceInnerSubscriber)) {
                    if (atomicReference.get() != disposable) {
                        return;
                    }
                }
                moy0Var.subscribe(debounceInnerSubscriber);
            } catch (Throwable th) {
                Exceptions.a(th);
                cancel();
                this.a.onError(th);
            }
        }

        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.c, pnc1Var)) {
                this.c = pnc1Var;
                this.a.onSubscribe(this);
                pnc1Var.request(Long.MAX_VALUE);
            }
        }

        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                BackpressureHelper.a(this, j);
            }
        }
    }

    public FlowableDebounce(Flowable flowable, Function function) {
        super(flowable);
        this.c = function;
    }

    public final void V(gnc1 gnc1Var) {
        ((AbstractFlowableWithUpstream) this).b.subscribe(new DebounceSubscriber(new SerializedSubscriber(gnc1Var), this.c));
    }
}
