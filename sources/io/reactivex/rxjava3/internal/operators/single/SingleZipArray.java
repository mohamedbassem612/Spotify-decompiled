package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class SingleZipArray<T, R> extends Single<R> {
    public final SingleSource[] a;
    public final Function b;

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements Disposable {
        public final SingleObserver a;
        public final Function b;
        public final ZipSingleObserver[] c;
        public Object[] d;

        public ZipCoordinator(SingleObserver singleObserver, int i, Function function) {
            super(i);
            this.a = singleObserver;
            this.b = function;
            ZipSingleObserver[] zipSingleObserverArr = new ZipSingleObserver[i];
            for (int i2 = 0; i2 < i; i2++) {
                zipSingleObserverArr[i2] = new ZipSingleObserver(this, i2);
            }
            this.c = zipSingleObserverArr;
            this.d = new Object[i];
        }

        public final void a(int i, Throwable th) {
            if (getAndSet(0) <= 0) {
                RxJavaPlugins.b(th);
                return;
            }
            ZipSingleObserver[] zipSingleObserverArr = this.c;
            int length = zipSingleObserverArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                ZipSingleObserver zipSingleObserver = zipSingleObserverArr[i2];
                zipSingleObserver.getClass();
                DisposableHelper.a(zipSingleObserver);
            }
            while (true) {
                i++;
                if (i >= length) {
                    this.d = null;
                    this.a.onError(th);
                    return;
                } else {
                    ZipSingleObserver zipSingleObserver2 = zipSingleObserverArr[i];
                    zipSingleObserver2.getClass();
                    DisposableHelper.a(zipSingleObserver2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (getAndSet(0) > 0) {
                for (ZipSingleObserver zipSingleObserver : this.c) {
                    zipSingleObserver.getClass();
                    DisposableHelper.a(zipSingleObserver);
                }
                this.d = null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return get() <= 0;
        }
    }

    public static final class ZipSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T> {
        public final ZipCoordinator a;
        public final int b;

        public ZipSingleObserver(ZipCoordinator zipCoordinator, int i) {
            this.a = zipCoordinator;
            this.b = i;
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            this.a.a(this.b, th);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.g(this, disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            ZipCoordinator zipCoordinator = this.a;
            SingleObserver singleObserver = zipCoordinator.a;
            Object[] objArr = zipCoordinator.d;
            if (objArr != null) {
                objArr[this.b] = obj;
            }
            if (zipCoordinator.decrementAndGet() == 0) {
                try {
                    Object objApply = zipCoordinator.b.apply(objArr);
                    Objects.requireNonNull(objApply, "The zipper returned a null value");
                    zipCoordinator.d = null;
                    singleObserver.onSuccess(objApply);
                } catch (Throwable th) {
                    Exceptions.a(th);
                    zipCoordinator.d = null;
                    singleObserver.onError(th);
                }
            }
        }
    }

    public SingleZipArray(Function function, SingleSource[] singleSourceArr) {
        this.a = singleSourceArr;
        this.b = function;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        SingleSource[] singleSourceArr = this.a;
        int length = singleSourceArr.length;
        if (length == 1) {
            singleSourceArr[0].subscribe(new SingleMap.MapSingleObserver(singleObserver, new SingletonArrayFunc(this)));
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(singleObserver, length, this.b);
        singleObserver.onSubscribe(zipCoordinator);
        for (int i = 0; i < length && !zipCoordinator.isDisposed(); i++) {
            SingleSource singleSource = singleSourceArr[i];
            if (singleSource == null) {
                zipCoordinator.a(i, new NullPointerException("One of the sources is null"));
                return;
            }
            singleSource.subscribe(zipCoordinator.c[i]);
        }
    }
}
