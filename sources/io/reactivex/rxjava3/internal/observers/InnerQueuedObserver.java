package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.QueueDrainHelper;
import io.reactivex.rxjava3.operators.QueueDisposable;
import io.reactivex.rxjava3.operators.SimpleQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class InnerQueuedObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
    public final InnerQueuedObserverSupport a;
    public final int b;
    public SimpleQueue c;
    public volatile boolean d;
    public int e;

    public InnerQueuedObserver(InnerQueuedObserverSupport innerQueuedObserverSupport, int i) {
        this.a = innerQueuedObserverSupport;
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        DisposableHelper.a(this);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return DisposableHelper.b(get());
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        this.a.c(this);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        this.a.f(this, th);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        int i = this.e;
        InnerQueuedObserverSupport innerQueuedObserverSupport = this.a;
        if (i == 0) {
            innerQueuedObserverSupport.b(this, obj);
        } else {
            innerQueuedObserverSupport.a();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.g(this, disposable)) {
            if (disposable instanceof QueueDisposable) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int iA = queueDisposable.a(3);
                if (iA == 1) {
                    this.e = iA;
                    this.c = queueDisposable;
                    this.d = true;
                    this.a.c(this);
                    return;
                }
                if (iA == 2) {
                    this.e = iA;
                    this.c = queueDisposable;
                    return;
                }
            }
            this.c = QueueDrainHelper.b(-this.b);
        }
    }
}
