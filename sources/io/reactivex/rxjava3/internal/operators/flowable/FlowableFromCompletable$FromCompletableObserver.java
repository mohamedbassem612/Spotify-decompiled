package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.AbstractEmptyQueueFuseable;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableFromCompletable$FromCompletableObserver<T> extends AbstractEmptyQueueFuseable<T> implements CompletableObserver {
    public final gnc1 a;
    public Disposable b;

    public FlowableFromCompletable$FromCompletableObserver(gnc1 gnc1Var) {
        this.a = gnc1Var;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.AbstractEmptyQueueFuseable, p.pnc1
    public final void cancel() {
        this.b.dispose();
        this.b = DisposableHelper.a;
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
    public final void onComplete() {
        this.b = DisposableHelper.a;
        this.a.onComplete();
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
    public final void onError(Throwable th) {
        this.b = DisposableHelper.a;
        this.a.onError(th);
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.h(this.b, disposable)) {
            this.b = disposable;
            this.a.onSubscribe(this);
        }
    }
}
