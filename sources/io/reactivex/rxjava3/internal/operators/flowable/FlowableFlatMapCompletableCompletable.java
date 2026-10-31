package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.FuseToFlowable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableFlatMapCompletableCompletable<T> extends Completable implements FuseToFlowable<T> {
    public final Flowable a;
    public final Function b;
    public final int c = Integer.MAX_VALUE;

    public static final class FlatMapCompletableMainSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {
        public final CompletableObserver a;
        public final Function c;
        public final int e;
        public pnc1 f;
        public volatile boolean g;
        public final AtomicThrowable b = new AtomicThrowable();
        public final CompositeDisposable d = new CompositeDisposable();

        public final class InnerObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            public InnerObserver() {
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public void dispose() {
                DisposableHelper.a(this);
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public boolean isDisposed() {
                return DisposableHelper.b(get());
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
            public final void onComplete() {
                FlatMapCompletableMainSubscriber flatMapCompletableMainSubscriber = FlatMapCompletableMainSubscriber.this;
                flatMapCompletableMainSubscriber.d.c(this);
                flatMapCompletableMainSubscriber.onComplete();
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
            public final void onError(Throwable th) {
                FlatMapCompletableMainSubscriber flatMapCompletableMainSubscriber = FlatMapCompletableMainSubscriber.this;
                flatMapCompletableMainSubscriber.d.c(this);
                flatMapCompletableMainSubscriber.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.g(this, disposable);
            }
        }

        public FlatMapCompletableMainSubscriber(CompletableObserver completableObserver, Function function, int i) {
            this.a = completableObserver;
            this.c = function;
            this.e = i;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.g = true;
            this.f.cancel();
            this.d.dispose();
            this.b.b();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.d.isDisposed();
        }

        @Override // p.gnc1
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                this.b.c(this.a);
            } else if (this.e != Integer.MAX_VALUE) {
                this.f.request(1L);
            }
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            if (this.b.a(th)) {
                this.g = true;
                this.f.cancel();
                this.d.dispose();
                this.b.c(this.a);
            }
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            try {
                Object objApply = this.c.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
                CompletableSource completableSource = (CompletableSource) objApply;
                getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.g || !this.d.b(innerObserver)) {
                    return;
                }
                completableSource.subscribe(innerObserver);
            } catch (Throwable th) {
                Exceptions.a(th);
                this.f.cancel();
                onError(th);
            }
        }

        @Override // p.gnc1
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
    }

    public FlowableFlatMapCompletableCompletable(Flowable flowable, Function function) {
        this.a = flowable;
        this.b = function;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.FuseToFlowable
    public final Flowable b() {
        return new FlowableFlatMapCompletable(this.a, this.b, this.c);
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public final void r(CompletableObserver completableObserver) {
        this.a.subscribe((FlowableSubscriber) new FlatMapCompletableMainSubscriber(completableObserver, this.b, this.c));
    }
}
