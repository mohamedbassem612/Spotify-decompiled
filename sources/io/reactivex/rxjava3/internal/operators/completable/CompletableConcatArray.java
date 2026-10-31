package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class CompletableConcatArray extends Completable {
    public final CompletableSource[] a;

    public static final class ConcatInnerObserver extends AtomicInteger implements CompletableObserver {
        public final CompletableObserver a;
        public final CompletableSource[] b;
        public int c;
        public final SequentialDisposable d = new SequentialDisposable();

        public ConcatInnerObserver(CompletableObserver completableObserver, CompletableSource[] completableSourceArr) {
            this.a = completableObserver;
            this.b = completableSourceArr;
        }

        public final void a() {
            SequentialDisposable sequentialDisposable = this.d;
            if (!sequentialDisposable.isDisposed() && getAndIncrement() == 0) {
                while (!sequentialDisposable.isDisposed()) {
                    int i = this.c;
                    this.c = i + 1;
                    CompletableSource[] completableSourceArr = this.b;
                    if (i == completableSourceArr.length) {
                        this.a.onComplete();
                        return;
                    } else {
                        completableSourceArr[i].subscribe(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
            }
        }

        public final void onComplete() {
            a();
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.c(this.d, disposable);
        }
    }

    public CompletableConcatArray(CompletableSource[] completableSourceArr) {
        this.a = completableSourceArr;
    }

    public final void r(CompletableObserver completableObserver) {
        ConcatInnerObserver concatInnerObserver = new ConcatInnerObserver(completableObserver, this.a);
        completableObserver.onSubscribe(concatInnerObserver.d);
        concatInnerObserver.a();
    }
}
