package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Arrays;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class SingleZipIterable<T, R> extends Single<R> {
    public final Iterable a;
    public final Function b;

    public SingleZipIterable(Iterable iterable, Function function) {
        this.a = iterable;
        this.b = function;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        SingleSource[] singleSourceArr = new SingleSource[8];
        try {
            int i = 0;
            for (SingleSource singleSource : this.a) {
                if (singleSource == null) {
                    EmptyDisposable.f(new NullPointerException("One of the sources is null"), singleObserver);
                    return;
                }
                if (i == singleSourceArr.length) {
                    singleSourceArr = (SingleSource[]) Arrays.copyOf(singleSourceArr, (i >> 2) + i);
                }
                int i2 = i + 1;
                singleSourceArr[i] = singleSource;
                i = i2;
            }
            if (i == 0) {
                EmptyDisposable.f(new NoSuchElementException(), singleObserver);
                return;
            }
            if (i == 1) {
                singleSourceArr[0].subscribe(new SingleMap.MapSingleObserver(singleObserver, new SingletonArrayFunc(this)));
                return;
            }
            SingleZipArray.ZipCoordinator zipCoordinator = new SingleZipArray.ZipCoordinator(singleObserver, i, this.b);
            singleObserver.onSubscribe(zipCoordinator);
            for (int i3 = 0; i3 < i && !zipCoordinator.isDisposed(); i3++) {
                singleSourceArr[i3].subscribe(zipCoordinator.c[i3]);
            }
        } catch (Throwable th) {
            Exceptions.a(th);
            EmptyDisposable.f(th, singleObserver);
        }
    }
}
