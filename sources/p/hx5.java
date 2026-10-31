package p;

import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hx5 implements gx5, o5s {
    public final x8c0 a;
    public final BehaviorSubject b = BehaviorSubject.g(Boolean.FALSE);

    public hx5(x8c0 x8c0Var) {
        this.a = x8c0Var;
    }

    public final boolean a() {
        Object objH = this.b.h();
        objH.getClass();
        return ((Boolean) objH).booleanValue();
    }

    public final void onStart(iac0 iac0Var) {
        this.b.onNext(Boolean.TRUE);
    }

    public final void onStop(iac0 iac0Var) {
        this.b.onNext(Boolean.FALSE);
    }
}
