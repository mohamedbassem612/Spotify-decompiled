package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromCompletable$FromCompletableObserver;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CompletableToFlowable<T> extends Flowable<T> {
    public final CompletableSource b;

    public CompletableToFlowable(CompletableSource completableSource) {
        this.b = completableSource;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        this.b.subscribe(new FlowableFromCompletable$FromCompletableObserver(gnc1Var));
    }
}
