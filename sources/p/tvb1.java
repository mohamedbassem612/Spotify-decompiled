package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tvb1 extends hab0 implements Function0 {
    public final /* synthetic */ float a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ drr0 d;
    public final /* synthetic */ drr0 e;
    public final /* synthetic */ drr0 f;
    public final /* synthetic */ ven0 g;
    public final /* synthetic */ ven0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tvb1(float f, iu30 iu30Var, iu30 iu30Var2, drr0 drr0Var, drr0 drr0Var2, drr0 drr0Var3, ven0 ven0Var, ven0 ven0Var2) {
        super(0);
        this.a = f;
        this.b = iu30Var;
        this.c = iu30Var2;
        this.d = drr0Var;
        this.e = drr0Var2;
        this.f = drr0Var3;
        this.g = ven0Var;
        this.h = ven0Var2;
    }

    public final Object invoke() {
        boolean zS = r4o1.S(this.d.s(), this.e.s(), this.f.s(), (n511) this.g.getValue(), (n511) this.h.getValue(), this.a);
        this.b.invoke(Boolean.FALSE);
        this.c.invoke(Boolean.valueOf(zS));
        return rih1.a;
    }
}
