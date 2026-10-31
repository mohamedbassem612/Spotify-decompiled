package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableFlatMapCompletable<T> extends AbstractFlowableWithUpstream<T, T> {
    public final Function c;
    public final int d;

    public static final class FlatMapCompletableMainSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {
        public final gnc1 a;
        public final Function c;
        public final int e;
        public pnc1 f;
        public volatile boolean g;
        public final AtomicThrowable b = new AtomicThrowable();
        public final CompositeDisposable d = new CompositeDisposable();

        public final class InnerConsumer extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            public InnerConsumer() {
            }

            public void dispose() {
                DisposableHelper.a(this);
            }

            public boolean isDisposed() {
                return DisposableHelper.b(get());
            }

            public final void onComplete() {
                FlatMapCompletableMainSubscriber flatMapCompletableMainSubscriber = FlatMapCompletableMainSubscriber.this;
                flatMapCompletableMainSubscriber.d.c(this);
                flatMapCompletableMainSubscriber.onComplete();
            }

            public final void onError(Throwable th) {
                FlatMapCompletableMainSubscriber flatMapCompletableMainSubscriber = FlatMapCompletableMainSubscriber.this;
                flatMapCompletableMainSubscriber.d.c(this);
                flatMapCompletableMainSubscriber.onError(th);
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.g(this, disposable);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FlatMapCompletableMainSubscriber(gnc1 gnc1Var, Function function, int i) {
            this.a = gnc1Var;
            this.c = function;
            this.e = i;
            lazySet(1);
        }

        public final int a(int i) {
            return 2;
        }

        public final void cancel() {
            this.g = true;
            this.f.cancel();
            this.d.dispose();
            this.b.b();
        }

        public final void clear() {
        }

        public final boolean isEmpty() {
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                this.b.e(this.a);
            } else if (this.e != Integer.MAX_VALUE) {
                this.f.request(1L);
            }
        }

        public final void onError(Throwable th) {
            if (this.b.a(th)) {
                this.g = true;
                this.f.cancel();
                this.d.dispose();
                this.b.e(this.a);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void onNext(Object obj) {
            try {
                Object objApply = this.c.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
                CompletableSource completableSource = (CompletableSource) objApply;
                getAndIncrement();
                InnerConsumer innerConsumer = new InnerConsumer();
                if (this.g || !this.d.b(innerConsumer)) {
                    return;
                }
                completableSource.subscribe(innerConsumer);
            } catch (Throwable th) {
                Exceptions.a(th);
                this.f.cancel();
                onError(th);
            }
        }

        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.f, pnc1Var)) {
                this.f = pnc1Var;
                this.a.onSubscribe(this);
                int i = this.e;
                if (i == Integer.MAX_VALUE) {
                    pnc1Var.request(Long.MAX_VALUE);
                } else {
                    pnc1Var.request(i);
                }
            }
        }

        public final Object poll() {
            return null;
        }

        public final void request(long j) {
        }
    }

    public FlowableFlatMapCompletable(Flowable flowable, Function function, int i) {
        super(flowable);
        this.c = function;
        this.d = i;
    }

    public final void V(gnc1 gnc1Var) {
        ((AbstractFlowableWithUpstream) this).b.subscribe(new FlatMapCompletableMainSubscriber(gnc1Var, this.c, this.d));
    }
}
