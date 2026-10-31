package p;

import io.reactivex.rxjava3.functions.Cancellable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v141 implements Cancellable {
    public final q6 a;

    public v141(q6 q6Var) {
        this.a = q6Var;
    }

    @Override // io.reactivex.rxjava3.functions.Cancellable
    public final void cancel() {
        this.a.d(null);
    }
}
