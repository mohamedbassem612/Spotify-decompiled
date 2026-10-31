package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableDoOnEach<T> extends AbstractObservableWithUpstream<T, T> {
    public final Consumer b;
    public final Consumer c;
    public final Action d;
    public final Action e;

    public static final class DoOnEachObserver<T> implements Observer<T>, Disposable {
        public final Observer a;
        public final Consumer b;
        public final Consumer c;
        public final Action d;
        public final Action e;
        public Disposable f;
        public boolean g;

        public DoOnEachObserver(Observer observer, Consumer consumer, Consumer consumer2, Action action, Action action2) {
            this.a = observer;
            this.b = consumer;
            this.c = consumer2;
            this.d = action;
            this.e = action2;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.g) {
                return;
            }
            try {
                this.d.run();
                this.g = true;
                this.a.onComplete();
                try {
                    this.e.run();
                } catch (Throwable th) {
                    Exceptions.a(th);
                    RxJavaPlugins.b(th);
                }
            } catch (Throwable th2) {
                Exceptions.a(th2);
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.g) {
                RxJavaPlugins.b(th);
                return;
            }
            this.g = true;
            try {
                this.c.accept(th);
            } catch (Throwable th2) {
                Exceptions.a(th2);
                th = new CompositeException(th, th2);
            }
            this.a.onError(th);
            try {
                this.e.run();
            } catch (Throwable th3) {
                Exceptions.a(th3);
                RxJavaPlugins.b(th3);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.g) {
                return;
            }
            try {
                this.b.accept(obj);
                this.a.onNext(obj);
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
    }

    public ObservableDoOnEach(Observable observable, Consumer consumer, Consumer consumer2, Action action, Action action2) {
        super(observable);
        this.b = consumer;
        this.c = consumer2;
        this.d = action;
        this.e = action2;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        this.a.subscribe(new DoOnEachObserver(observer, this.b, this.c, this.d, this.e));
    }
}
