package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yu41 extends hab0 implements Function0 {
    public final /* synthetic */ drr0 a;
    public final /* synthetic */ yqg b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ ven0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu41(drr0 drr0Var, yqg yqgVar, iu30 iu30Var, ven0 ven0Var, ven0 ven0Var2) {
        super(0);
        this.a = drr0Var;
        this.b = yqgVar;
        this.c = iu30Var;
        this.d = ven0Var;
        this.e = ven0Var2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float fS = this.a.s();
        ven0 ven0Var = this.d;
        boolean zA = nyn1.A(ven0Var);
        nyn1.B(ven0Var);
        ven0 ven0Var2 = this.e;
        nyn1.D(ven0Var2, pu41.a(nyn1.C(ven0Var2), (long) (nyn1.C(ven0Var2).b() * fS), this.b.b()));
        this.c.invoke(new ku41(fS, zA));
        return rih1.a;
    }
}
