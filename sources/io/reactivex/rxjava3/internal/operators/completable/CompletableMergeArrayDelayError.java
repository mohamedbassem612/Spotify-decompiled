package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CompletableMergeArrayDelayError extends Completable {
    public final CompletableSource[] a;

    public static final class MergeInnerCompletableObserver implements CompletableObserver {
        public final CompletableObserver a;
        public final CompositeDisposable b;
        public final AtomicThrowable c;
        public final AtomicInteger d;

        public MergeInnerCompletableObserver(CompletableObserver completableObserver, CompositeDisposable compositeDisposable, AtomicThrowable atomicThrowable, AtomicInteger atomicInteger) {
            this.a = completableObserver;
            this.b = compositeDisposable;
            this.c = atomicThrowable;
            this.d = atomicInteger;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            if (this.d.decrementAndGet() == 0) {
                this.c.c(this.a);
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.c;
            if (atomicThrowable.a(th) && this.d.decrementAndGet() == 0) {
                atomicThrowable.c(this.a);
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            this.b.b(disposable);
        }
    }

    public static final class TryTerminateAndReportDisposable implements Disposable {
        public final AtomicThrowable a;

        public TryTerminateAndReportDisposable(AtomicThrowable atomicThrowable) {
            this.a = atomicThrowable;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.a.b();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.a.get() == ExceptionHelper.a;
        }
    }

    public CompletableMergeArrayDelayError(CompletableSource[] completableSourceArr) {
        this.a = completableSourceArr;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public final void r(CompletableObserver completableObserver) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        CompletableSource[] completableSourceArr = this.a;
        AtomicInteger atomicInteger = new AtomicInteger(completableSourceArr.length + 1);
        AtomicThrowable atomicThrowable = new AtomicThrowable();
        compositeDisposable.b(new TryTerminateAndReportDisposable(atomicThrowable));
        completableObserver.onSubscribe(compositeDisposable);
        for (CompletableSource completableSource : completableSourceArr) {
            if (compositeDisposable.isDisposed()) {
                return;
            }
            if (completableSource == null) {
                atomicThrowable.a(new NullPointerException("A completable source is null"));
                atomicInteger.decrementAndGet();
            } else {
                completableSource.subscribe(new MergeInnerCompletableObserver(completableObserver, compositeDisposable, atomicThrowable, atomicInteger));
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            atomicThrowable.c(completableObserver);
        }
    }
}
