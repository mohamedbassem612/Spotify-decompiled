package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pel1 extends a8d1 implements vu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ drr0 c;
    public final /* synthetic */ drr0 d;
    public final /* synthetic */ float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pel1(boolean z, boolean z2, drr0 drr0Var, drr0 drr0Var2, float f, lnm lnmVar) {
        super(2, lnmVar);
        this.a = z;
        this.b = z2;
        this.c = drr0Var;
        this.d = drr0Var2;
        this.e = f;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new pel1(this.a, this.b, this.c, this.d, this.e, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        pel1 pel1VarCreate = create((c9n) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        pel1VarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        hm5.M(obj);
        boolean z = this.a;
        drr0 drr0Var = this.c;
        if (z && this.b) {
            float fS = drr0Var.s();
            float f = this.e;
            if (fS > f) {
                drr0Var.t(f);
            }
        } else {
            drr0Var.t(1.0f);
            this.d.t(0.0f);
        }
        return rih1.a;
    }
}
