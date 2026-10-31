package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p.gnc1;
import p.moy0;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableTimeoutTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    public final short c;
    public final TimeUnit d;
    public final Scheduler e;
    public final moy0 f;

    public static final class FallbackSubscriber<T> implements FlowableSubscriber<T> {
        public final gnc1 a;
        public final SubscriptionArbiter b;

        public FallbackSubscriber(gnc1 gnc1Var, SubscriptionArbiter subscriptionArbiter) {
            this.a = gnc1Var;
            this.b = subscriptionArbiter;
        }

        public final void onComplete() {
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onNext(Object obj) {
            this.a.onNext(obj);
        }

        public final void onSubscribe(pnc1 pnc1Var) {
            this.b.e(pnc1Var);
        }
    }

    public static final class TimeoutFallbackSubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T>, TimeoutSupport {
        public final AtomicReference N0;
        public final AtomicLong O0;
        public long P0;
        public moy0 Q0;
        public final TimeUnit X;
        public final Scheduler.Worker Y;
        public final SequentialDisposable Z;
        public final gnc1 i;
        public final short t;

        /* JADX WARN: Type inference failed for: r2v1, types: [int, short] */
        public TimeoutFallbackSubscriber(gnc1 gnc1Var, long j, TimeUnit timeUnit, Scheduler.Worker worker, moy0 moy0Var) {
            super(true);
            this.i = gnc1Var;
            this.t = (int) j;
            this.X = timeUnit;
            this.Y = worker;
            this.Q0 = moy0Var;
            this.Z = new SequentialDisposable();
            this.N0 = new AtomicReference();
            this.O0 = new AtomicLong();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        public final void b(long j) {
            if (this.O0.compareAndSet(j, Long.MAX_VALUE)) {
                SubscriptionHelper.a(this.N0);
                long j2 = this.P0;
                if (j2 != 0) {
                    d(j2);
                }
                moy0 moy0Var = this.Q0;
                this.Q0 = null;
                moy0Var.subscribe(new FallbackSubscriber(this.i, this));
                this.Y.dispose();
            }
        }

        public final void cancel() {
            super.cancel();
            this.Y.dispose();
        }

        public final void onComplete() {
            if (this.O0.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.Z.dispose();
                this.i.onComplete();
                this.Y.dispose();
            }
        }

        public final void onError(Throwable th) {
            if (this.O0.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.b(th);
                return;
            }
            this.Z.dispose();
            this.i.onError(th);
            this.Y.dispose();
        }

        public final void onNext(Object obj) {
            AtomicLong atomicLong = this.O0;
            long j = atomicLong.get();
            if (j != Long.MAX_VALUE) {
                long j2 = j + 1;
                if (atomicLong.compareAndSet(j, j2)) {
                    SequentialDisposable sequentialDisposable = this.Z;
                    ((Disposable) sequentialDisposable.get()).dispose();
                    this.P0++;
                    this.i.onNext(obj);
                    Disposable disposableB = this.Y.b(new TimeoutTask(j2, this), this.t, this.X);
                    sequentialDisposable.getClass();
                    DisposableHelper.c(sequentialDisposable, disposableB);
                }
            }
        }

        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.d(this.N0, pnc1Var)) {
                e(pnc1Var);
            }
        }
    }

    public static final class TimeoutSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, pnc1, TimeoutSupport {
        public final gnc1 a;
        public final short b;
        public final TimeUnit c;
        public final Scheduler.Worker d;
        public final SequentialDisposable e = new SequentialDisposable();
        public final AtomicReference f = new AtomicReference();
        public final AtomicLong g = new AtomicLong();

        /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
        public TimeoutSubscriber(gnc1 gnc1Var, long j, TimeUnit timeUnit, Scheduler.Worker worker) {
            this.a = gnc1Var;
            this.b = (int) j;
            this.c = timeUnit;
            this.d = worker;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        public final void b(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                SubscriptionHelper.a(this.f);
                this.a.onError(new TimeoutException(ExceptionHelper.e(this.b, this.c)));
                this.d.dispose();
            }
        }

        public final void cancel() {
            SubscriptionHelper.a(this.f);
            this.d.dispose();
        }

        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.e.dispose();
                this.a.onComplete();
                this.d.dispose();
            }
        }

        public final void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.b(th);
                return;
            }
            this.e.dispose();
            this.a.onError(th);
            this.d.dispose();
        }

        public final void onNext(Object obj) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    SequentialDisposable sequentialDisposable = this.e;
                    ((Disposable) sequentialDisposable.get()).dispose();
                    this.a.onNext(obj);
                    DisposableHelper.c(sequentialDisposable, this.d.b(new TimeoutTask(j2, this), this.b, this.c));
                }
            }
        }

        public final void onSubscribe(pnc1 pnc1Var) {
            SubscriptionHelper.c(this.f, this.g, pnc1Var);
        }

        public final void request(long j) {
            SubscriptionHelper.b(this.f, this.g, j);
        }
    }

    public interface TimeoutSupport {
        void b(long j);
    }

    public static final class TimeoutTask implements Runnable {
        public final TimeoutSupport a;
        public final long b;

        public TimeoutTask(long j, TimeoutSupport timeoutSupport) {
            this.b = j;
            this.a = timeoutSupport;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.b(this.b);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public FlowableTimeoutTimed(Flowable flowable, long j, TimeUnit timeUnit, Scheduler scheduler, moy0 moy0Var) {
        super(flowable);
        this.c = (int) j;
        this.d = timeUnit;
        this.e = scheduler;
        this.f = moy0Var;
    }

    public final void V(gnc1 gnc1Var) {
        moy0 moy0Var = this.f;
        short s = this.c;
        Flowable flowable = ((AbstractFlowableWithUpstream) this).b;
        Scheduler scheduler = this.e;
        if (moy0Var == null) {
            TimeoutSubscriber timeoutSubscriber = new TimeoutSubscriber(gnc1Var, s, this.d, scheduler.b());
            gnc1Var.onSubscribe(timeoutSubscriber);
            DisposableHelper.c(timeoutSubscriber.e, timeoutSubscriber.d.b(new TimeoutTask(0L, timeoutSubscriber), timeoutSubscriber.b, timeoutSubscriber.c));
            flowable.subscribe(timeoutSubscriber);
            return;
        }
        TimeoutFallbackSubscriber timeoutFallbackSubscriber = new TimeoutFallbackSubscriber(gnc1Var, s, this.d, scheduler.b(), this.f);
        gnc1Var.onSubscribe(timeoutFallbackSubscriber);
        Disposable disposableB = timeoutFallbackSubscriber.Y.b(new TimeoutTask(0L, timeoutFallbackSubscriber), timeoutFallbackSubscriber.t, timeoutFallbackSubscriber.X);
        SequentialDisposable sequentialDisposable = timeoutFallbackSubscriber.Z;
        sequentialDisposable.getClass();
        DisposableHelper.c(sequentialDisposable, disposableB);
        flowable.subscribe(timeoutFallbackSubscriber);
    }
}
