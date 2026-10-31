package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wtb0 extends a8d1 implements vu30 {
    public final /* synthetic */ xtb0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wtb0(xtb0 xtb0Var, int i, int i2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = xtb0Var;
        this.b = i;
        this.c = i2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new wtb0(this.a, this.b, this.c, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        wtb0 wtb0VarCreate = create((bs41) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        wtb0VarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        hm5.M(obj);
        this.a.l(this.b, this.c, true);
        return rih1.a;
    }
}
