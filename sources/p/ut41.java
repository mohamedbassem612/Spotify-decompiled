package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ut41 extends z031 implements vu30 {
    public final /* synthetic */ xtb0 X;
    public /* synthetic */ Object b;
    public final /* synthetic */ c9n c;
    public final /* synthetic */ nav0 d;
    public final /* synthetic */ kzt e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ ven0 g;
    public final /* synthetic */ tob1 h;
    public final /* synthetic */ tob1 i;
    public final /* synthetic */ ven0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut41(c9n c9nVar, nav0 nav0Var, kzt kztVar, ven0 ven0Var, ven0 ven0Var2, tob1 tob1Var, tob1 tob1Var2, ven0 ven0Var3, xtb0 xtb0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = c9nVar;
        this.d = nav0Var;
        this.e = kztVar;
        this.f = ven0Var;
        this.g = ven0Var2;
        this.h = tob1Var;
        this.i = tob1Var2;
        this.t = ven0Var3;
        this.X = xtb0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        ut41 ut41Var = new ut41(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, lnmVar);
        ut41Var.b = obj;
        return ut41Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ut41 ut41VarCreate = create((i8d1) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        ut41VarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        i8d1 i8d1Var = (i8d1) this.b;
        hm5.M(obj);
        xtb0 xtb0Var = this.X;
        nav0 nav0Var = this.d;
        kzt kztVar = this.e;
        c9n c9nVar = this.c;
        fn31.T(c9nVar, (o8n) null, 0, new d96(nav0Var, kztVar, i8d1Var, c9nVar, this.f, this.g, this.h, this.i, this.t, xtb0Var, (lnm) null), 3);
        return rih1.a;
    }
}
