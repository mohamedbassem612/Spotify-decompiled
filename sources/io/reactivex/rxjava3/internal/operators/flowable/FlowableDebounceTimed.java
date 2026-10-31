package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableDebounceTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    public final short c;
    public final TimeUnit d;
    public final Scheduler e;

    public static final class DebounceEmitter<T> extends AtomicReference<Disposable> implements Runnable, Disposable {
        public final Object a;
        public final long b;
        public final DebounceTimedSubscriber c;
        public final AtomicBoolean d = new AtomicBoolean();

        public DebounceEmitter(Object obj, long j, DebounceTimedSubscriber debounceTimedSubscriber) {
            this.a = obj;
            this.b = j;
            this.c = debounceTimedSubscriber;
        }

        public final void a() {
            if (this.d.compareAndSet(false, true)) {
                DebounceTimedSubscriber debounceTimedSubscriber = this.c;
                long j = this.b;
                Object obj = this.a;
                if (j == debounceTimedSubscriber.g) {
                    if (debounceTimedSubscriber.get() == 0) {
                        debounceTimedSubscriber.cancel();
                        debounceTimedSubscriber.a.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                    } else {
                        debounceTimedSubscriber.a.onNext(obj);
                        BackpressureHelper.e(debounceTimedSubscriber, 1L);
                        dispose();
                    }
                }
            }
        }

        public void dispose() {
            DisposableHelper.a(this);
        }

        public boolean isDisposed() {
            return get() == DisposableHelper.a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a();
        }
    }

    public static final class DebounceTimedSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, pnc1 {
        public final SerializedSubscriber a;
        public final short b;
        public final TimeUnit c;
        public final Scheduler.Worker d;
        public pnc1 e;
        public Disposable f;
        public volatile long g;
        public boolean h;

        /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
        public DebounceTimedSubscriber(SerializedSubscriber serializedSubscriber, long j, TimeUnit timeUnit, Scheduler.Worker worker) {
            this.a = serializedSubscriber;
            this.b = (int) j;
            this.c = timeUnit;
            this.d = worker;
        }

        public final void cancel() {
            this.e.cancel();
            this.d.dispose();
        }

        public final void onComplete() {
            if (this.h) {
                return;
            }
            this.h = true;
            Disposable disposable = this.f;
            if (disposable != null) {
                disposable.dispose();
            }
            DebounceEmitter debounceEmitter = (DebounceEmitter) disposable;
            if (debounceEmitter != null) {
                debounceEmitter.a();
            }
            this.a.onComplete();
            this.d.dispose();
        }

        public final void onError(Throwable th) {
            if (this.h) {
                RxJavaPlugins.b(th);
                return;
            }
            this.h = true;
            Disposable disposable = this.f;
            if (disposable != null) {
                disposable.dispose();
            }
            this.a.onError(th);
            this.d.dispose();
        }

        public final void onNext(Object obj) {
            if (this.h) {
                return;
            }
            long j = this.g + 1;
            this.g = j;
            Disposable disposable = this.f;
            if (disposable != null) {
                disposable.dispose();
            }
            DebounceEmitter debounceEmitter = new DebounceEmitter(obj, j, this);
            this.f = debounceEmitter;
            DisposableHelper.c(debounceEmitter, this.d.b(debounceEmitter, this.b, this.c));
        }

        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.e, pnc1Var)) {
                this.e = pnc1Var;
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

    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public FlowableDebounceTimed(Flowable flowable, long j, TimeUnit timeUnit, Scheduler scheduler) {
        super(flowable);
        this.c = (int) j;
        this.d = timeUnit;
        this.e = scheduler;
    }

    public final void V(gnc1 gnc1Var) {
        ((AbstractFlowableWithUpstream) this).b.subscribe(new DebounceTimedSubscriber(new SerializedSubscriber(gnc1Var), this.c, this.d, this.e.b()));
    }
}
