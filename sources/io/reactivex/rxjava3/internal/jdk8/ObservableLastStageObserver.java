package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableLastStageObserver<T> extends ObservableStageObserver<T> {
    public final boolean c;
    public final Object d;

    public ObservableLastStageObserver(Object obj, boolean z) {
        this.c = z;
        this.d = obj;
    }

    public final void onComplete() {
        if (isDone()) {
            return;
        }
        Object obj = this.b;
        this.b = null;
        this.a.lazySet(DisposableHelper.a);
        if (obj != null) {
            complete(obj);
        } else if (this.c) {
            complete(this.d);
        } else {
            completeExceptionally(new NoSuchElementException());
        }
    }

    @Override // io.reactivex.rxjava3.internal.jdk8.ObservableStageObserver
    public final void onNext(Object obj) {
        this.b = obj;
    }
}
