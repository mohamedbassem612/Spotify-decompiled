package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableNever;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ktf1 {
    public final Flowable a;
    public final Flowable b;
    public final w9u0 c;
    public final h691 d;
    public final o241 e;
    public final kly0 f;
    public final fkf1 g;

    public ktf1(Flowable flowable, Flowable flowable2, w9u0 w9u0Var, h691 h691Var, o241 o241Var, kly0 kly0Var, fkf1 fkf1Var) {
        this.a = flowable;
        this.b = flowable2;
        this.c = w9u0Var;
        this.d = h691Var;
        this.e = o241Var;
        this.f = kly0Var;
        this.g = fkf1Var;
    }

    public static mtf1 a(ktf1 ktf1Var) {
        int i = Flowable.a;
        return new mtf1(ktf1Var.a, ktf1Var.b, ktf1Var.c, ktf1Var.d, FlowableNever.b, ktf1Var.e, ktf1Var.f, ktf1Var.g);
    }
}
