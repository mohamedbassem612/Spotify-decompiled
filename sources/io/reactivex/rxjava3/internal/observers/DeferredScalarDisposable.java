package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class DeferredScalarDisposable<T> extends BasicIntQueueDisposable<T> {
    public final Observer a;
    public Object b;

    public DeferredScalarDisposable(Observer observer) {
        this.a = observer;
    }

    @Override // io.reactivex.rxjava3.operators.QueueFuseable
    public final int a(int i) {
        lazySet(8);
        return 2;
    }

    public final void b(Object obj) {
        int i = get();
        if ((i & 54) != 0) {
            return;
        }
        Observer observer = this.a;
        if (i == 8) {
            this.b = obj;
            lazySet(16);
            observer.onNext(null);
        } else {
            lazySet(2);
            observer.onNext(obj);
        }
        if (get() != 4) {
            observer.onComplete();
        }
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final void clear() {
        lazySet(32);
        this.b = null;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        set(4);
        this.b = null;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return get() == 4;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return get() != 16;
    }

    public void onSuccess(Object obj) {
        b(obj);
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        Object obj = this.b;
        this.b = null;
        lazySet(32);
        return obj;
    }
}
