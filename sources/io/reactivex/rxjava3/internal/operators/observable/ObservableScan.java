package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableScan<T> extends AbstractObservableWithUpstream<T, T> {
    public final BiFunction b;

    public static final class ScanObserver<T> implements Observer<T>, Disposable {
        public final Observer a;
        public final BiFunction b;
        public Disposable c;
        public Object d;
        public boolean e;

        public ScanObserver(Observer observer, BiFunction biFunction) {
            this.a = observer;
            this.b = biFunction;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.e) {
                return;
            }
            this.e = true;
            this.a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.e) {
                RxJavaPlugins.b(th);
            } else {
                this.e = true;
                this.a.onError(th);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.e) {
                return;
            }
            Object obj2 = this.d;
            Observer observer = this.a;
            if (obj2 == null) {
                this.d = obj;
                observer.onNext(obj);
                return;
            }
            try {
                Object objApply = this.b.apply(obj2, obj);
                Objects.requireNonNull(objApply, "The value returned by the accumulator is null");
                this.d = objApply;
                observer.onNext(objApply);
            } catch (Throwable th) {
                Exceptions.a(th);
                this.c.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.c, disposable)) {
                this.c = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableScan(Observable observable, BiFunction biFunction) {
        super(observable);
        this.b = biFunction;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        this.a.subscribe(new ScanObserver(observer, this.b));
    }
}
