package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.operators.QueueDisposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class ObservableScalarXMap {

    public static final class ScalarDisposable<T> extends AtomicInteger implements QueueDisposable<T>, Runnable {
        public final Observer a;
        public final Object b;

        public ScalarDisposable(Observer observer, Object obj) {
            this.a = observer;
            this.b = obj;
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        public final int a(int i) {
            lazySet(1);
            return 1;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            lazySet(3);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            set(3);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return get() == 3;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return get() != 1;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean offer(Object obj) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                Object obj = this.b;
                Observer observer = this.a;
                observer.onNext(obj);
                if (get() == 2) {
                    lazySet(3);
                    observer.onComplete();
                }
            }
        }
    }

    public static final class ScalarXMapObservable<T, R> extends Observable<R> {
        public final Object a;
        public final Function b;

        public ScalarXMapObservable(Object obj, Function function) {
            this.a = obj;
            this.b = function;
        }

        @Override // io.reactivex.rxjava3.core.Observable
        public final void subscribeActual(Observer observer) {
            try {
                Object objApply = this.b.apply(this.a);
                Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                ObservableSource observableSource = (ObservableSource) objApply;
                if (!(observableSource instanceof Supplier)) {
                    observableSource.subscribe(observer);
                    return;
                }
                try {
                    Object obj = ((Supplier) observableSource).get();
                    if (obj == null) {
                        EmptyDisposable.b(observer);
                        return;
                    }
                    ScalarDisposable scalarDisposable = new ScalarDisposable(observer, obj);
                    observer.onSubscribe(scalarDisposable);
                    scalarDisposable.run();
                } catch (Throwable th) {
                    Exceptions.a(th);
                    EmptyDisposable.c(th, observer);
                }
            } catch (Throwable th2) {
                Exceptions.a(th2);
                EmptyDisposable.c(th2, observer);
            }
        }
    }

    public static Observable a(Object obj, Function function) {
        return new ScalarXMapObservable(obj, function);
    }

    public static boolean b(ObservableSource observableSource, Observer observer, Function function) {
        if (!(observableSource instanceof Supplier)) {
            return false;
        }
        try {
            Object obj = ((Supplier) observableSource).get();
            if (obj == null) {
                EmptyDisposable.b(observer);
                return true;
            }
            try {
                Object objApply = function.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                ObservableSource observableSource2 = (ObservableSource) objApply;
                if (observableSource2 instanceof Supplier) {
                    try {
                        Object obj2 = ((Supplier) observableSource2).get();
                        if (obj2 == null) {
                            EmptyDisposable.b(observer);
                            return true;
                        }
                        ScalarDisposable scalarDisposable = new ScalarDisposable(observer, obj2);
                        observer.onSubscribe(scalarDisposable);
                        scalarDisposable.run();
                    } catch (Throwable th) {
                        Exceptions.a(th);
                        EmptyDisposable.c(th, observer);
                        return true;
                    }
                } else {
                    observableSource2.subscribe(observer);
                }
                return true;
            } catch (Throwable th2) {
                Exceptions.a(th2);
                EmptyDisposable.c(th2, observer);
                return true;
            }
        } catch (Throwable th3) {
            Exceptions.a(th3);
            EmptyDisposable.c(th3, observer);
            return true;
        }
    }
}
