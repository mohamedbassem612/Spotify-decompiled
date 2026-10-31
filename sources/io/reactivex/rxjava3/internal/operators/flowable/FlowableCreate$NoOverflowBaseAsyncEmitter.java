package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class FlowableCreate$NoOverflowBaseAsyncEmitter<T> extends FlowableCreate$BaseEmitter<T> {
    public final void onNext(T t) {
        if (this.b.isDisposed()) {
            return;
        }
        if (t == null) {
            onError(ExceptionHelper.b("onNext called with a null value."));
        } else if (get() == 0) {
            f();
        } else {
            this.a.onNext(t);
            BackpressureHelper.e(this, 1L);
        }
    }

    public void f() {
    }
}
