package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w2c extends a8d1 implements vu30 {
    public /* synthetic */ int a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ven0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2c(iu30 iu30Var, int i, int i2, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = iu30Var;
        this.c = i;
        this.d = i2;
        this.e = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        w2c w2cVar = new w2c(this.b, this.c, this.d, this.e, lnmVar);
        w2cVar.a = ((Number) obj).intValue();
        return w2cVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        w2c w2cVarCreate = create(Integer.valueOf(((Number) obj).intValue()), (lnm) obj2);
        rih1 rih1Var = rih1.a;
        w2cVarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        hm5.M(obj);
        lee1 lee1Var = g3c.a;
        if (((az31) this.e.getValue()) == az31.b) {
            int i2 = this.c;
            this.b.invoke(new Integer(yoi1.p(i + i2, i2, this.d)));
        }
        return rih1.a;
    }
}
