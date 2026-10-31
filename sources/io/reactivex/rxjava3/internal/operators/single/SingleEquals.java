package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleEquals<T> extends Single<Boolean> {
    public final SingleSource a;
    public final SingleSource b;

    public static class InnerObserver<T> implements SingleObserver<T> {
        public final boolean a;
        public final CompositeDisposable b;
        public final Object[] c;
        public final SingleObserver d;
        public final AtomicInteger e;

        /* JADX WARN: Multi-variable type inference failed */
        public InnerObserver(int i, CompositeDisposable compositeDisposable, Object[] objArr, SingleObserver singleObserver, AtomicInteger atomicInteger) {
            this.a = i;
            this.b = compositeDisposable;
            this.c = objArr;
            this.d = singleObserver;
            this.e = atomicInteger;
        }

        public final void onError(Throwable th) {
            int andSet = this.e.getAndSet(-1);
            if (andSet != 0 && andSet != 1) {
                RxJavaPlugins.b(th);
            } else {
                this.b.dispose();
                this.d.onError(th);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            this.b.b(disposable);
        }

        public final void onSuccess(Object obj) {
            boolean z = this.a;
            Object[] objArr = this.c;
            objArr[z ? 1 : 0] = obj;
            if (this.e.incrementAndGet() == 2) {
                this.d.onSuccess(Boolean.valueOf(Objects.equals(objArr[0], objArr[1])));
            }
        }
    }

    public SingleEquals(SingleSource singleSource, SingleSource singleSource2) {
        this.a = singleSource;
        this.b = singleSource2;
    }

    public final void subscribeActual(SingleObserver singleObserver) {
        AtomicInteger atomicInteger = new AtomicInteger();
        Object[] objArr = {null, null};
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        singleObserver.onSubscribe(compositeDisposable);
        this.a.subscribe(new InnerObserver(0, compositeDisposable, objArr, singleObserver, atomicInteger));
        this.b.subscribe(new InnerObserver(1, compositeDisposable, objArr, singleObserver, atomicInteger));
    }
}
