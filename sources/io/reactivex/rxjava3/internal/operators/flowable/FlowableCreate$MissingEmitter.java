package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableCreate$MissingEmitter<T> extends FlowableCreate$BaseEmitter<T> {
    public FlowableCreate$MissingEmitter(gnc1 gnc1Var) {
        super(gnc1Var);
    }

    public void onNext(T t) {
        long j;
        if (this.b.isDisposed()) {
            return;
        }
        if (t == null) {
            onError(ExceptionHelper.b("onNext called with a null value."));
            return;
        }
        this.a.onNext(t);
        do {
            j = get();
            if (j == 0) {
                return;
            }
        } while (!compareAndSet(j, j - 1));
    }
}
