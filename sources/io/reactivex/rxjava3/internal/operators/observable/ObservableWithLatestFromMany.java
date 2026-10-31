package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.HalfSerializer;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableWithLatestFromMany<T, R> extends AbstractObservableWithUpstream<T, R> {
    public final ObservableSource[] b;
    public final Iterable c;
    public final Function d;

    public final class SingletonArrayFunc implements Function<T, R> {
        public SingletonArrayFunc() {
        }

        public final Object apply(Object obj) {
            Object objApply = ObservableWithLatestFromMany.this.d.apply(new Object[]{obj});
            Objects.requireNonNull(objApply, "The combiner returned a null value");
            return objApply;
        }
    }

    public static final class WithLatestFromObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        public final Observer a;
        public final Function b;
        public final WithLatestInnerObserver[] c;
        public final AtomicReferenceArray d;
        public final AtomicReference e;
        public final AtomicThrowable f;
        public volatile boolean g;

        public WithLatestFromObserver(Observer observer, Function function, int i) {
            this.a = observer;
            this.b = function;
            WithLatestInnerObserver[] withLatestInnerObserverArr = new WithLatestInnerObserver[i];
            for (int i2 = 0; i2 < i; i2++) {
                withLatestInnerObserverArr[i2] = new WithLatestInnerObserver(this, i2);
            }
            this.c = withLatestInnerObserverArr;
            this.d = new AtomicReferenceArray(i);
            this.e = new AtomicReference();
            this.f = new AtomicThrowable();
        }

        public final void a(int i) {
            int i2 = 0;
            while (true) {
                WithLatestInnerObserver[] withLatestInnerObserverArr = this.c;
                if (i2 >= withLatestInnerObserverArr.length) {
                    return;
                }
                if (i2 != i) {
                    WithLatestInnerObserver withLatestInnerObserver = withLatestInnerObserverArr[i2];
                    withLatestInnerObserver.getClass();
                    DisposableHelper.a(withLatestInnerObserver);
                }
                i2++;
            }
        }

        public void dispose() {
            DisposableHelper.a(this.e);
            for (WithLatestInnerObserver withLatestInnerObserver : this.c) {
                withLatestInnerObserver.getClass();
                DisposableHelper.a(withLatestInnerObserver);
            }
        }

        public boolean isDisposed() {
            return DisposableHelper.b((Disposable) this.e.get());
        }

        public final void onComplete() {
            if (this.g) {
                return;
            }
            this.g = true;
            a(-1);
            HalfSerializer.a(this.a, this, this.f);
        }

        public final void onError(Throwable th) {
            if (this.g) {
                RxJavaPlugins.b(th);
                return;
            }
            this.g = true;
            a(-1);
            HalfSerializer.b(this.a, th, this, this.f);
        }

        public final void onNext(Object obj) {
            if (this.g) {
                return;
            }
            AtomicReferenceArray atomicReferenceArray = this.d;
            int length = atomicReferenceArray.length();
            Object[] objArr = new Object[length + 1];
            int i = 0;
            objArr[0] = obj;
            while (i < length) {
                Object obj2 = atomicReferenceArray.get(i);
                if (obj2 == null) {
                    return;
                }
                i++;
                objArr[i] = obj2;
            }
            try {
                Object objApply = this.b.apply(objArr);
                Objects.requireNonNull(objApply, "combiner returned a null value");
                HalfSerializer.c(this.a, objApply, this, this.f);
            } catch (Throwable th) {
                Exceptions.a(th);
                dispose();
                onError(th);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.g(this.e, disposable);
        }

        public void subscribe(ObservableSource<?>[] observableSourceArr, int i) {
            WithLatestInnerObserver[] withLatestInnerObserverArr = this.c;
            AtomicReference atomicReference = this.e;
            for (int i2 = 0; i2 < i && !DisposableHelper.b((Disposable) atomicReference.get()) && !this.g; i2++) {
                observableSourceArr[i2].subscribe(withLatestInnerObserverArr[i2]);
            }
        }
    }

    public static final class WithLatestInnerObserver extends AtomicReference<Disposable> implements Observer<Object> {
        public final WithLatestFromObserver a;
        public final int b;
        public boolean c;

        public WithLatestInnerObserver(WithLatestFromObserver withLatestFromObserver, int i) {
            this.a = withLatestFromObserver;
            this.b = i;
        }

        public final void onComplete() {
            WithLatestFromObserver withLatestFromObserver = this.a;
            int i = this.b;
            if (this.c) {
                return;
            }
            withLatestFromObserver.g = true;
            withLatestFromObserver.a(i);
            HalfSerializer.a(withLatestFromObserver.a, withLatestFromObserver, withLatestFromObserver.f);
        }

        public final void onError(Throwable th) {
            WithLatestFromObserver withLatestFromObserver = this.a;
            int i = this.b;
            withLatestFromObserver.g = true;
            DisposableHelper.a(withLatestFromObserver.e);
            withLatestFromObserver.a(i);
            HalfSerializer.b(withLatestFromObserver.a, th, withLatestFromObserver, withLatestFromObserver.f);
        }

        public final void onNext(Object obj) {
            if (!this.c) {
                this.c = true;
            }
            this.a.d.set(this.b, obj);
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.g(this, disposable);
        }
    }

    public ObservableWithLatestFromMany(Observable observable, ObservableSource[] observableSourceArr, Function function) {
        super(observable);
        this.b = observableSourceArr;
        this.c = null;
        this.d = function;
    }

    public final void subscribeActual(Observer observer) {
        int length;
        ObservableSource<?>[] observableSourceArr = this.b;
        if (observableSourceArr == null) {
            observableSourceArr = new ObservableSource[8];
            try {
                length = 0;
                for (ObservableSource<?> observableSource : this.c) {
                    if (length == observableSourceArr.length) {
                        observableSourceArr = (ObservableSource[]) Arrays.copyOf(observableSourceArr, (length >> 1) + length);
                    }
                    int i = length + 1;
                    observableSourceArr[length] = observableSource;
                    length = i;
                }
            } catch (Throwable th) {
                Exceptions.a(th);
                EmptyDisposable.c(th, observer);
                return;
            }
        } else {
            length = observableSourceArr.length;
        }
        ObservableSource observableSource2 = ((AbstractObservableWithUpstream) this).a;
        if (length == 0) {
            new ObservableMap(observableSource2, new SingletonArrayFunc()).subscribeActual(observer);
            return;
        }
        WithLatestFromObserver withLatestFromObserver = new WithLatestFromObserver(observer, this.d, length);
        observer.onSubscribe(withLatestFromObserver);
        withLatestFromObserver.subscribe(observableSourceArr, length);
        observableSource2.subscribe(withLatestFromObserver);
    }

    public ObservableWithLatestFromMany(Observable observable, Iterable iterable, Function function) {
        super(observable);
        this.b = null;
        this.c = iterable;
        this.d = function;
    }
}
