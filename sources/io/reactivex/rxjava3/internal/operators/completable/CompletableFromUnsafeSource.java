package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class CompletableFromUnsafeSource extends Completable {
    public final CompletableSource a;

    public CompletableFromUnsafeSource(CompletableSource completableSource) {
        this.a = completableSource;
    }

    public final void r(CompletableObserver completableObserver) {
        this.a.subscribe(completableObserver);
    }
}
