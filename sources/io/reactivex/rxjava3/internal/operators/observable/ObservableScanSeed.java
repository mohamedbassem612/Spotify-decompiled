package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableScanSeed<T, R> extends AbstractObservableWithUpstream<T, R> {
    public final BiFunction b;
    public final Supplier c;

    public static final class ScanSeedObserver<T, R> implements Observer<T>, Disposable {
        public final Observer a;
        public final BiFunction b;
        public Object c;
        public Disposable d;
        public boolean e;

        public ScanSeedObserver(Observer observer, BiFunction biFunction, Object obj) {
            this.a = observer;
            this.b = biFunction;
            this.c = obj;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.d.isDisposed();
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
            try {
                Object objApply = this.b.apply(this.c, obj);
                Objects.requireNonNull(objApply, "The accumulator returned a null value");
                this.c = objApply;
                this.a.onNext(objApply);
            } catch (Throwable th) {
                Exceptions.a(th);
                this.d.dispose();
                onError(th);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.d, disposable)) {
                this.d = disposable;
                Observer observer = this.a;
                observer.onSubscribe(this);
                observer.onNext(this.c);
            }
        }
    }

    public ObservableScanSeed(Observable observable, Supplier supplier, BiFunction biFunction) {
        super(observable);
        this.b = biFunction;
        this.c = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        try {
            Object obj = this.c.get();
            Objects.requireNonNull(obj, "The seed supplied is null");
            this.a.subscribe(new ScanSeedObserver(observer, this.b, obj));
        } catch (Throwable th) {
            Exceptions.a(th);
            EmptyDisposable.c(th, observer);
        }
    }
}
