package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.observers.DisposableObserver;
import io.reactivex.rxjava3.observers.SerializedObserver;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableDebounce<T, U> extends AbstractObservableWithUpstream<T, T> {
    public final Function b;

    public static final class DebounceObserver<T, U> implements Observer<T>, Disposable {
        public final SerializedObserver a;
        public final Function b;
        public Disposable c;
        public final AtomicReference d = new AtomicReference();
        public volatile long e;
        public boolean f;

        public static final class DebounceInnerObserver<T, U> extends DisposableObserver<U> {
            public final DebounceObserver b;
            public final long c;
            public final Object d;
            public boolean e;
            public final AtomicBoolean f = new AtomicBoolean();

            public DebounceInnerObserver(DebounceObserver debounceObserver, long j, Object obj) {
                this.b = debounceObserver;
                this.c = j;
                this.d = obj;
            }

            public final void a() {
                if (this.f.compareAndSet(false, true)) {
                    DebounceObserver debounceObserver = this.b;
                    long j = this.c;
                    Object obj = this.d;
                    if (j == debounceObserver.e) {
                        debounceObserver.a.onNext(obj);
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

        public DebounceObserver(SerializedObserver serializedObserver, Function function) {
            this.a = serializedObserver;
            this.b = function;
        }

        public void dispose() {
            this.c.dispose();
            DisposableHelper.a(this.d);
        }

        public boolean isDisposed() {
            return this.c.isDisposed();
        }

        public final void onComplete() {
            if (this.f) {
                return;
            }
            this.f = true;
            AtomicReference atomicReference = this.d;
            DisposableHelper disposableHelper = (Disposable) atomicReference.get();
            if (disposableHelper != DisposableHelper.a) {
                DebounceInnerObserver debounceInnerObserver = (DebounceInnerObserver) disposableHelper;
                if (debounceInnerObserver != null) {
                    debounceInnerObserver.a();
                }
                DisposableHelper.a(atomicReference);
                this.a.onComplete();
            }
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
                Objects.requireNonNull(objApply, "The ObservableSource supplied is null");
                ObservableSource observableSource = (ObservableSource) objApply;
                DebounceInnerObserver debounceInnerObserver = new DebounceInnerObserver(this, j, obj);
                AtomicReference atomicReference = this.d;
                while (!atomicReference.compareAndSet(disposable, debounceInnerObserver)) {
                    if (atomicReference.get() != disposable) {
                        return;
                    }
                }
                observableSource.subscribe(debounceInnerObserver);
            } catch (Throwable th) {
                Exceptions.a(th);
                dispose();
                this.a.onError(th);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.c, disposable)) {
                this.c = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableDebounce(Observable observable, Function function) {
        super(observable);
        this.b = function;
    }

    public final void subscribeActual(Observer observer) {
        ((AbstractObservableWithUpstream) this).a.subscribe(new DebounceObserver(new SerializedObserver(observer), this.b));
    }
}
