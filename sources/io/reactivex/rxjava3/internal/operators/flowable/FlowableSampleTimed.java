package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableSampleTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    public final short c;
    public final TimeUnit d;
    public final Scheduler e;

    public static final class SampleTimedNoLast<T> extends SampleTimedSubscriber<T> {
    }

    public static abstract class SampleTimedSubscriber<T> extends AtomicReference<T> implements FlowableSubscriber<T>, pnc1, Runnable {
        public final SerializedSubscriber a;
        public final short b;
        public final TimeUnit c;
        public final Scheduler d;
        public final AtomicLong e = new AtomicLong();
        public final SequentialDisposable f = new SequentialDisposable();
        public pnc1 g;

        /* JADX WARN: Type inference failed for: r2v1, types: [int, short] */
        public SampleTimedSubscriber(SerializedSubscriber serializedSubscriber, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.a = serializedSubscriber;
            this.b = (int) j;
            this.c = timeUnit;
            this.d = scheduler;
        }

        @Override // p.pnc1
        public final void cancel() {
            DisposableHelper.a(this.f);
            this.g.cancel();
        }

        @Override // p.gnc1
        public final void onComplete() {
            DisposableHelper.a(this.f);
            this.a.onComplete();
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            DisposableHelper.a(this.f);
            this.a.onError(th);
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            lazySet(obj);
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.g, pnc1Var)) {
                this.g = pnc1Var;
                this.a.onSubscribe(this);
                long j = this.b;
                DisposableHelper.c(this.f, this.d.e(this, j, j, this.c));
                pnc1Var.request(Long.MAX_VALUE);
            }
        }

        @Override // p.pnc1
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                BackpressureHelper.a(this.e, j);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                AtomicLong atomicLong = this.e;
                long j = atomicLong.get();
                SerializedSubscriber serializedSubscriber = this.a;
                if (j != 0) {
                    serializedSubscriber.onNext(andSet);
                    BackpressureHelper.e(atomicLong, 1L);
                } else {
                    cancel();
                    serializedSubscriber.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public FlowableSampleTimed(Flowable flowable, long j, TimeUnit timeUnit, Scheduler scheduler) {
        super(flowable);
        this.c = (int) j;
        this.d = timeUnit;
        this.e = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        this.b.subscribe((FlowableSubscriber) new SampleTimedNoLast(new SerializedSubscriber(gnc1Var), this.c, this.d, this.e));
    }
}
