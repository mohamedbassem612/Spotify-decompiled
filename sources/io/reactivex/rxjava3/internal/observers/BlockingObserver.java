package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class BlockingObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
    public static final Object b = new Object();
    public final LinkedBlockingQueue a;

    public BlockingObserver(LinkedBlockingQueue linkedBlockingQueue) {
        this.a = linkedBlockingQueue;
    }

    public void dispose() {
        if (DisposableHelper.a(this)) {
            this.a.offer(b);
        }
    }

    public boolean isDisposed() {
        return get() == DisposableHelper.a;
    }

    public final void onComplete() {
        this.a.offer(NotificationLite.a);
    }

    public final void onError(Throwable th) {
        this.a.offer(NotificationLite.e(th));
    }

    public final void onNext(Object obj) {
        this.a.offer(obj);
    }

    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.g(this, disposable);
    }
}
