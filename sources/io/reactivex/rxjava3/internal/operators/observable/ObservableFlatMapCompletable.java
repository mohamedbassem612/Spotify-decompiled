package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableFlatMapCompletable<T> extends AbstractObservableWithUpstream<T, T> {
    public final Function b;
    public final boolean c;

    public static final class FlatMapCompletableMainObserver<T> extends BasicIntQueueDisposable<T> implements Observer<T> {
        public final Observer a;
        public final Function c;
        public final boolean d;
        public Disposable f;
        public volatile boolean g;
        public final AtomicThrowable b = new AtomicThrowable();
        public final CompositeDisposable e = new CompositeDisposable();

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
                FlatMapCompletableMainObserver flatMapCompletableMainObserver = FlatMapCompletableMainObserver.this;
                flatMapCompletableMainObserver.e.c(this);
                flatMapCompletableMainObserver.onComplete();
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
            public final void onError(Throwable th) {
                FlatMapCompletableMainObserver flatMapCompletableMainObserver = FlatMapCompletableMainObserver.this;
                flatMapCompletableMainObserver.e.c(this);
                flatMapCompletableMainObserver.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.g(this, disposable);
            }
        }

        public FlatMapCompletableMainObserver(Observer observer, Function function, boolean z) {
            this.a = observer;
            this.c = function;
            this.d = z;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        public final int a(int i) {
            return 2;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.g = true;
            this.f.dispose();
            this.e.dispose();
            this.b.b();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f.isDisposed();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                this.b.d(this.a);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.b.a(th)) {
                if (this.d) {
                    if (decrementAndGet() == 0) {
                        this.b.d(this.a);
                    }
                } else {
                    this.g = true;
                    this.f.dispose();
                    this.e.dispose();
                    this.b.d(this.a);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            try {
                Object objApply = this.c.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
                CompletableSource completableSource = (CompletableSource) objApply;
                getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.g || !this.e.b(innerObserver)) {
                    return;
                }
                completableSource.subscribe(innerObserver);
            } catch (Throwable th) {
                Exceptions.a(th);
                this.f.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.f, disposable)) {
                this.f = disposable;
                this.a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            return null;
        }
    }

    public ObservableFlatMapCompletable(Observable observable, Function function, boolean z) {
        super(observable);
        this.b = function;
        this.c = z;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        this.a.subscribe(new FlatMapCompletableMainObserver(observer, this.b, this.c));
    }
}
