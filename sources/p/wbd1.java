package p;

import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wbd1 {
    public final y34 a;
    public final BehaviorSubject b = BehaviorSubject.g(ymb1.b);

    public wbd1(y34 y34Var) {
        this.a = y34Var;
    }

    public final void a(oob1 oob1Var) {
        this.b.onNext(oob1Var);
    }
}
