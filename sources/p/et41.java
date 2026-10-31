package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class et41 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ xtb0 b;
    public final /* synthetic */ ejk1 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et41(xtb0 xtb0Var, ejk1 ejk1Var, float f, int i, float f2, lnm lnmVar) {
        super(2, lnmVar);
        this.b = xtb0Var;
        this.c = ejk1Var;
        this.d = f;
        this.e = i;
        this.f = f2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new et41(this.b, this.c, this.d, this.e, this.f, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            mmr0 mmr0VarA = irn1.A(this.c, this.d, this.e, this.f);
            int iIntValue = ((Number) mmr0VarA.a).intValue();
            int iIntValue2 = ((Number) mmr0VarA.b).intValue();
            this.a = true;
            Object objK = this.b.k(iIntValue, iIntValue2, this);
            d9n d9nVar = d9n.a;
            if (objK == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }
}
