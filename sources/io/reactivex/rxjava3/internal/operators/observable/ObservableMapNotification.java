package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableMapNotification<T, R> extends AbstractObservableWithUpstream<T, ObservableSource<? extends R>> {
    public final Function b;
    public final Function c;
    public final Supplier d;

    public static final class MapNotificationObserver<T, R> implements Observer<T>, Disposable {
        public final Observer a;
        public final Function b;
        public final Function c;
        public final Supplier d;
        public Disposable e;

        public MapNotificationObserver(Observer observer, Function function, Function function2, Supplier supplier) {
            this.a = observer;
            this.b = function;
            this.c = function2;
            this.d = supplier;
        }

        public void dispose() {
            this.e.dispose();
        }

        public boolean isDisposed() {
            return this.e.isDisposed();
        }

        public final void onComplete() {
            Observer observer = this.a;
            try {
                Object obj = this.d.get();
                Objects.requireNonNull(obj, "The onComplete ObservableSource returned is null");
                observer.onNext((ObservableSource) obj);
                observer.onComplete();
            } catch (Throwable th) {
                Exceptions.a(th);
                observer.onError(th);
            }
        }

        public final void onError(Throwable th) {
            Observer observer = this.a;
            try {
                Object objApply = this.c.apply(th);
                Objects.requireNonNull(objApply, "The onError ObservableSource returned is null");
                observer.onNext((ObservableSource) objApply);
                observer.onComplete();
            } catch (Throwable th2) {
                Exceptions.a(th2);
                observer.onError(new CompositeException(new Throwable[]{th, th2}));
            }
        }

        public final void onNext(Object obj) {
            Observer observer = this.a;
            try {
                Object objApply = this.b.apply(obj);
                Objects.requireNonNull(objApply, "The onNext ObservableSource returned is null");
                observer.onNext((ObservableSource) objApply);
            } catch (Throwable th) {
                Exceptions.a(th);
                observer.onError(th);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.e, disposable)) {
                this.e = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableMapNotification(Observable observable, Function function, Function function2, Supplier supplier) {
        super(observable);
        this.b = function;
        this.c = function2;
        this.d = supplier;
    }

    public final void subscribeActual(Observer observer) {
        ((AbstractObservableWithUpstream) this).a.subscribe(new MapNotificationObserver(observer, this.b, this.c, this.d));
    }
}
