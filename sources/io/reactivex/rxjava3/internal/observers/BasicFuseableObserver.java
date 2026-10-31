package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.operators.QueueDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class BasicFuseableObserver<T, R> implements Observer<T>, QueueDisposable<R> {
    public final Observer a;
    public Disposable b;
    public QueueDisposable c;
    public boolean d;
    public int e;

    public BasicFuseableObserver(Observer observer) {
        this.a = observer;
    }

    @Override // io.reactivex.rxjava3.operators.QueueFuseable
    public int a(int i) {
        QueueDisposable queueDisposable = this.c;
        if (queueDisposable == null || (i & 4) != 0) {
            return 0;
        }
        int iA = queueDisposable.a(i);
        if (iA == 0) {
            return iA;
        }
        this.e = iA;
        return iA;
    }

    public final void b(Throwable th) {
        Exceptions.a(th);
        this.b.dispose();
        onError(th);
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public void clear() {
        this.c.clear();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        this.b.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this.b.isDisposed();
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onComplete() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.onComplete();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onError(Throwable th) {
        if (this.d) {
            RxJavaPlugins.b(th);
        } else {
            this.d = true;
            this.a.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.h(this.b, disposable)) {
            this.b = disposable;
            if (disposable instanceof QueueDisposable) {
                this.c = (QueueDisposable) disposable;
            }
            this.a.onSubscribe(this);
        }
    }
}
