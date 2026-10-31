package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class BlockingDisposableMultiObserver<T> extends CountDownLatch implements MaybeObserver<T>, SingleObserver<T>, CompletableObserver, Disposable {
    public Object a;
    public Throwable b;
    public final SequentialDisposable c;

    public BlockingDisposableMultiObserver() {
        super(1);
        this.c = new SequentialDisposable();
    }

    public final void a(SingleObserver singleObserver) {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e) {
                dispose();
                singleObserver.onError(e);
                return;
            }
        }
        if (isDisposed()) {
            return;
        }
        Throwable th = this.b;
        if (th != null) {
            singleObserver.onError(th);
        } else {
            singleObserver.onSuccess(this.a);
        }
    }

    public void dispose() {
        this.c.dispose();
        countDown();
    }

    public boolean isDisposed() {
        return this.c.isDisposed();
    }

    public final void onComplete() {
        this.c.lazySet(EmptyDisposable.a);
        countDown();
    }

    public final void onError(Throwable th) {
        this.b = th;
        this.c.lazySet(EmptyDisposable.a);
        countDown();
    }

    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.g(this.c, disposable);
    }

    public final void onSuccess(Object obj) {
        this.a = obj;
        this.c.lazySet(EmptyDisposable.a);
        countDown();
    }
}
