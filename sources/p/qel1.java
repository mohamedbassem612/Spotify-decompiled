package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qel1 extends a8d1 implements xu30 {
    public final /* synthetic */ c9n X;
    public final /* synthetic */ tob1 Y;
    public /* synthetic */ float a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ drr0 d;
    public final /* synthetic */ drr0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ drr0 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ iu30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qel1(ven0 ven0Var, ven0 ven0Var2, drr0 drr0Var, drr0 drr0Var2, float f, float f2, drr0 drr0Var3, int i, iu30 iu30Var, c9n c9nVar, tob1 tob1Var, lnm lnmVar) {
        super(3, lnmVar);
        this.b = ven0Var;
        this.c = ven0Var2;
        this.d = drr0Var;
        this.e = drr0Var2;
        this.f = f;
        this.g = f2;
        this.h = drr0Var3;
        this.i = i;
        this.t = iu30Var;
        this.X = c9nVar;
        this.Y = tob1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        c9n c9nVar = this.X;
        tob1 tob1Var = this.Y;
        qel1 qel1Var = new qel1(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, c9nVar, tob1Var, (lnm) obj3);
        qel1Var.a = fFloatValue;
        rih1 rih1Var = rih1.a;
        qel1Var.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        float f = this.a;
        hm5.M(obj);
        this.b.setValue(Boolean.FALSE);
        boolean zBooleanValue = ((Boolean) this.c.getValue()).booleanValue();
        rih1 rih1Var = rih1.a;
        if (zBooleanValue) {
            return rih1Var;
        }
        drr0 drr0Var = this.d;
        float fS = drr0Var.s() - this.e.s();
        float fS2 = this.h.s() * this.f * this.g;
        if (fS2 > 0.0f) {
            this.t.invoke(new xnk0((int) ((fS / fS2) * this.i)));
        }
        fn31.T(this.X, (o8n) null, 0, new xb5(f, drr0Var, this.Y, (lnm) null), 3);
        return rih1Var;
    }
}
