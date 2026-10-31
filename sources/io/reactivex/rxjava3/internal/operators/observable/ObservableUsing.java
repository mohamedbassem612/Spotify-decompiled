package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableUsing<T, D> extends Observable<T> {
    public final Supplier a;
    public final Function b;
    public final Consumer c;
    public final boolean d;

    public static final class UsingObserver<T, D> extends AtomicBoolean implements Observer<T>, Disposable {
        public final Observer a;
        public final Object b;
        public final Consumer c;
        public final boolean d;
        public Disposable e;

        public UsingObserver(Observer observer, Object obj, Consumer consumer, boolean z) {
            this.a = observer;
            this.b = obj;
            this.c = consumer;
            this.d = z;
        }

        public final void a() {
            if (compareAndSet(false, true)) {
                try {
                    this.c.accept(this.b);
                } catch (Throwable th) {
                    Exceptions.a(th);
                    RxJavaPlugins.b(th);
                }
            }
        }

        public void dispose() {
            boolean z = this.d;
            DisposableHelper disposableHelper = DisposableHelper.a;
            if (z) {
                a();
                this.e.dispose();
                this.e = disposableHelper;
            } else {
                this.e.dispose();
                this.e = disposableHelper;
                a();
            }
        }

        public boolean isDisposed() {
            return get();
        }

        public final void onComplete() {
            boolean z = this.d;
            Observer observer = this.a;
            if (!z) {
                observer.onComplete();
                a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.c.accept(this.b);
                } catch (Throwable th) {
                    Exceptions.a(th);
                    observer.onError(th);
                    return;
                }
            }
            observer.onComplete();
        }

        public final void onError(Throwable th) {
            boolean z = this.d;
            Observer observer = this.a;
            if (!z) {
                observer.onError(th);
                a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.c.accept(this.b);
                } catch (Throwable th2) {
                    Exceptions.a(th2);
                    th = new CompositeException(new Throwable[]{th, th2});
                }
            }
            observer.onError(th);
        }

        public final void onNext(Object obj) {
            this.a.onNext(obj);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.e, disposable)) {
                this.e = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableUsing(Supplier supplier, Function function, Consumer consumer, boolean z) {
        this.a = supplier;
        this.b = function;
        this.c = consumer;
        this.d = z;
    }

    public final void subscribeActual(Observer observer) {
        Consumer consumer = this.c;
        try {
            Object obj = this.a.get();
            try {
                Object objApply = this.b.apply(obj);
                Objects.requireNonNull(objApply, "The sourceSupplier returned a null ObservableSource");
                ((ObservableSource) objApply).subscribe(new UsingObserver(observer, obj, consumer, this.d));
            } catch (Throwable th) {
                Exceptions.a(th);
                try {
                    consumer.accept(obj);
                    EmptyDisposable.c(th, observer);
                } catch (Throwable th2) {
                    Exceptions.a(th2);
                    EmptyDisposable.c(new CompositeException(new Throwable[]{th, th2}), observer);
                }
            }
        } catch (Throwable th3) {
            Exceptions.a(th3);
            EmptyDisposable.c(th3, observer);
        }
    }
}
