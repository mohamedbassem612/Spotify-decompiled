package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pdl1 extends a8d1 implements xu30 {
    public final /* synthetic */ ven0 X;
    public /* synthetic */ float a;
    public final /* synthetic */ c9n b;
    public final /* synthetic */ yqg c;
    public final /* synthetic */ jti0 d;
    public final /* synthetic */ lel1 e;
    public final /* synthetic */ drr0 f;
    public final /* synthetic */ ven0 g;
    public final /* synthetic */ ven0 h;
    public final /* synthetic */ hdn0 i;
    public final /* synthetic */ ven0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdl1(c9n c9nVar, yqg yqgVar, jti0 jti0Var, lel1 lel1Var, drr0 drr0Var, ven0 ven0Var, ven0 ven0Var2, hdn0 hdn0Var, ven0 ven0Var3, ven0 ven0Var4, lnm lnmVar) {
        super(3, lnmVar);
        this.b = c9nVar;
        this.c = yqgVar;
        this.d = jti0Var;
        this.e = lel1Var;
        this.f = drr0Var;
        this.g = ven0Var;
        this.h = ven0Var2;
        this.i = hdn0Var;
        this.t = ven0Var3;
        this.X = ven0Var4;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        ven0 ven0Var = this.t;
        ven0 ven0Var2 = this.X;
        pdl1 pdl1Var = new pdl1(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, ven0Var, ven0Var2, (lnm) obj3);
        pdl1Var.a = fFloatValue;
        rih1 rih1Var = rih1.a;
        pdl1Var.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        float f = this.a;
        hm5.M(obj);
        ven0 ven0Var = this.t;
        yqg yqgVar = this.c;
        jti0 jti0Var = this.d;
        lel1 lel1Var = this.e;
        drr0 drr0Var = this.f;
        c9n c9nVar = this.b;
        this.X.setValue(fn31.T(c9nVar, (o8n) null, 0, new odl1(yqgVar, jti0Var, lel1Var, f, drr0Var, c9nVar, this.g, this.h, this.i, ven0Var, (lnm) null), 3));
        return rih1.a;
    }
}
