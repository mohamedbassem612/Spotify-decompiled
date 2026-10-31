package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mnl1 extends a8d1 implements vu30 {
    public final /* synthetic */ ven0 X;
    public int a;
    public boolean b;
    public final /* synthetic */ nav0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ o95 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ tr80 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ iu30 i;
    public final /* synthetic */ iu30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mnl1(nav0 nav0Var, float f, o95 o95Var, int i, tr80 tr80Var, int i2, iu30 iu30Var, iu30 iu30Var2, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = nav0Var;
        this.d = f;
        this.e = o95Var;
        this.f = i;
        this.g = tr80Var;
        this.h = i2;
        this.i = iu30Var;
        this.t = iu30Var2;
        this.X = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new mnl1(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        mnl1 mnl1Var;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            int iP = yoi1.p(jch0.U((((-this.d) / (((int) (this.c.Y0 >> 32)) / 12.0f)) * 0.05f) + ((Number) this.e.e()).floatValue()), 0, this.f);
            i = ((rr80) this.g).a + (this.h * iP);
            this.i.invoke(new Integer(i));
            Float f = new Float(iP);
            n8b1 n8b1VarL0 = irn1.l0(1.0f, 0.0f, (Object) null, 6);
            this.a = i;
            this.b = true;
            mnl1Var = this;
            Object objB = o95.b(this.e, f, n8b1VarL0, (Float) null, (iu30) null, mnl1Var, 12);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.a;
            hm5.M(obj);
            mnl1Var = this;
        }
        mnl1Var.t.invoke(new Integer(i));
        mnl1Var.X.setValue(Boolean.FALSE);
        return rih1.a;
    }
}
