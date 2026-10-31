package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p.gnc1;
import p.moy0;
import p.pnc1;
import p.ybx0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableTimeout<T, U, V> extends AbstractFlowableWithUpstream<T, T> {
    public final FlowableTimer c;
    public final Function d;

    public static final class TimeoutConsumer extends AtomicReference<pnc1> implements FlowableSubscriber<Object>, Disposable {
        public final TimeoutSelectorSupport a;
        public final long b;

        public TimeoutConsumer(long j, TimeoutSelectorSupport timeoutSelectorSupport) {
            this.b = j;
            this.a = timeoutSelectorSupport;
        }

        public void dispose() {
            SubscriptionHelper.a(this);
        }

        public boolean isDisposed() {
            return get() == SubscriptionHelper.a;
        }

        public final void onComplete() {
            Object obj = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.a;
            if (obj != subscriptionHelper) {
                lazySet(subscriptionHelper);
                this.a.b(this.b);
            }
        }

        public final void onError(Throwable th) {
            Object obj = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.a;
            if (obj == subscriptionHelper) {
                RxJavaPlugins.b(th);
            } else {
                lazySet(subscriptionHelper);
                this.a.a(this.b, th);
            }
        }

        public final void onNext(Object obj) {
            SubscriptionHelper subscriptionHelper = (pnc1) get();
            SubscriptionHelper subscriptionHelper2 = SubscriptionHelper.a;
            if (subscriptionHelper != subscriptionHelper2) {
                subscriptionHelper.cancel();
                lazySet(subscriptionHelper2);
                this.a.b(this.b);
            }
        }

        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.d(this, pnc1Var)) {
                pnc1Var.request(Long.MAX_VALUE);
            }
        }
    }

    public interface TimeoutSelectorSupport extends FlowableTimeoutTimed.TimeoutSupport {
        void a(long j, Throwable th);
    }

    public static final class TimeoutSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, pnc1, TimeoutSelectorSupport {
        public final gnc1 a;
        public final Function b;
        public final SequentialDisposable c = new SequentialDisposable();
        public final AtomicReference d = new AtomicReference();
        public final AtomicLong e = new AtomicLong();

        public TimeoutSubscriber(gnc1 gnc1Var, Function function) {
            this.a = gnc1Var;
            this.b = function;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport
        public final void a(long j, Throwable th) {
            if (!compareAndSet(j, Long.MAX_VALUE)) {
                RxJavaPlugins.b(th);
            } else {
                SubscriptionHelper.a(this.d);
                this.a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        public final void b(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                SubscriptionHelper.a(this.d);
                this.a.onError(new TimeoutException());
            }
        }

        public final void cancel() {
            SubscriptionHelper.a(this.d);
            this.c.dispose();
        }

        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.c.dispose();
                this.a.onComplete();
            }
        }

        public final void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.b(th);
            } else {
                this.c.dispose();
                this.a.onError(th);
            }
        }

        public final void onNext(Object obj) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    SequentialDisposable sequentialDisposable = this.c;
                    Disposable disposable = (Disposable) sequentialDisposable.get();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    gnc1 gnc1Var = this.a;
                    gnc1Var.onNext(obj);
                    try {
                        Object objApply = this.b.apply(obj);
                        Objects.requireNonNull(objApply, "The itemTimeoutIndicator returned a null Publisher.");
                        moy0 moy0Var = (moy0) objApply;
                        TimeoutConsumer timeoutConsumer = new TimeoutConsumer(j2, this);
                        if (DisposableHelper.c(sequentialDisposable, timeoutConsumer)) {
                            moy0Var.subscribe(timeoutConsumer);
                        }
                    } catch (Throwable th) {
                        Exceptions.a(th);
                        ((pnc1) this.d.get()).cancel();
                        getAndSet(Long.MAX_VALUE);
                        gnc1Var.onError(th);
                    }
                }
            }
        }

        public final void onSubscribe(pnc1 pnc1Var) {
            SubscriptionHelper.c(this.d, this.e, pnc1Var);
        }

        public final void request(long j) {
            SubscriptionHelper.b(this.d, this.e, j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowableTimeout(Flowable flowable, FlowableTimer flowableTimer) {
        super(flowable);
        ybx0 ybx0Var = ybx0.Q0;
        this.c = flowableTimer;
        this.d = ybx0Var;
    }

    public final void V(gnc1 gnc1Var) {
        TimeoutSubscriber timeoutSubscriber = new TimeoutSubscriber(gnc1Var, this.d);
        gnc1Var.onSubscribe(timeoutSubscriber);
        FlowableTimer flowableTimer = this.c;
        if (flowableTimer != null) {
            TimeoutConsumer timeoutConsumer = new TimeoutConsumer(0L, timeoutSubscriber);
            if (DisposableHelper.c(timeoutSubscriber.c, timeoutConsumer)) {
                flowableTimer.subscribe(timeoutConsumer);
            }
        }
        ((AbstractFlowableWithUpstream) this).b.subscribe(timeoutSubscriber);
    }
}
