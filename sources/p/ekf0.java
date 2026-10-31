package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ekf0 {
    public final kly0 a;
    public final Flowable b;

    public ekf0(Flowable flowable, jly0 jly0Var) {
        this.b = flowable;
        this.a = jly0Var;
    }

    public ekf0(thq thqVar, Flowable flowable) {
        this.a = thqVar;
        this.b = flowable;
    }
}
