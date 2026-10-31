package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableNever;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ekf1 {
    public final Flowable a;
    public final Flowable b;
    public final w9u0 c;
    public final h691 d;
    public final o241 e;
    public final kly0 f;
    public final fkf1 g;

    public ekf1(Flowable flowable, Flowable flowable2, w9u0 w9u0Var, h691 h691Var, o241 o241Var, jly0 jly0Var, fkf1 fkf1Var) {
        this.a = flowable;
        this.b = flowable2;
        this.c = w9u0Var;
        this.d = h691Var;
        this.e = o241Var;
        this.f = jly0Var;
        this.g = fkf1Var;
    }

    public static im0 a(ekf1 ekf1Var, dvs dvsVar) {
        int i = Flowable.a;
        return new im0(ekf1Var.a, ekf1Var.b, ekf1Var.c, ekf1Var.d, (Flowable) FlowableNever.b, ekf1Var.e, ekf1Var.f, ekf1Var.g, dvsVar);
    }
}
