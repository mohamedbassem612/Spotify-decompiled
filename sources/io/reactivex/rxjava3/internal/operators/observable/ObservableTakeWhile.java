package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableTakeWhile<T> extends AbstractObservableWithUpstream<T, T> {
    public final Predicate b;

    public static final class TakeWhileObserver<T> implements Observer<T>, Disposable {
        public final Observer a;
        public final Predicate b;
        public Disposable c;
        public boolean d;

        public TakeWhileObserver(Observer observer, Predicate predicate) {
            this.a = observer;
            this.b = predicate;
        }

        public void dispose() {
            this.c.dispose();
        }

        public boolean isDisposed() {
            return this.c.isDisposed();
        }

        public final void onComplete() {
            if (this.d) {
                return;
            }
            this.d = true;
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            if (this.d) {
                RxJavaPlugins.b(th);
            } else {
                this.d = true;
                this.a.onError(th);
            }
        }

        public final void onNext(Object obj) {
            if (this.d) {
                return;
            }
            try {
                boolean zTest = this.b.test(obj);
                Observer observer = this.a;
                if (zTest) {
                    observer.onNext(obj);
                    return;
                }
                this.d = true;
                this.c.dispose();
                observer.onComplete();
            } catch (Throwable th) {
                Exceptions.a(th);
                this.c.dispose();
                onError(th);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.c, disposable)) {
                this.c = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableTakeWhile(Observable observable, Predicate predicate) {
        super(observable);
        this.b = predicate;
    }

    public final void subscribeActual(Observer observer) {
        ((AbstractObservableWithUpstream) this).a.subscribe(new TakeWhileObserver(observer, this.b));
    }
}
