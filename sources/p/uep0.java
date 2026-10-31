package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uep0 extends a8d1 implements vu30 {
    public final /* synthetic */ int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ byte a = 0;
    public float b;
    public boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ o95 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ hdn0 g;
    public final /* synthetic */ ss50 h;
    public final /* synthetic */ iu30 i;
    public final /* synthetic */ tr80 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uep0(float f, gf6 gf6Var, o95 o95Var, int i, hdn0 hdn0Var, ss50 ss50Var, iu30 iu30Var, tr80 tr80Var, int i2, lnm lnmVar) {
        super(2, lnmVar);
        this.d = f;
        this.Y = gf6Var;
        this.e = o95Var;
        this.f = i;
        this.g = hdn0Var;
        this.h = ss50Var;
        this.i = iu30Var;
        this.t = tr80Var;
        this.X = i2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                tr80 tr80Var = this.t;
                int i = this.X;
                return new uep0(this.d, (gf6) obj2, this.e, this.f, this.g, this.h, this.i, tr80Var, i, lnmVar);
            default:
                return new uep0((nav0) obj2, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        float f;
        float f2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.X;
        tr80 tr80Var = this.t;
        iu30 iu30Var = this.i;
        sct0 sct0Var = this.h;
        float f3 = this.d;
        Object obj2 = this.Y;
        d9n d9nVar = d9n.a;
        o95 o95Var = this.e;
        int i2 = this.f;
        err0 err0Var = this.g;
        switch (b) {
            case 0:
                boolean z = this.c;
                if (!z) {
                    hm5.M(obj);
                    float fO = yoi1.o(((Number) o95Var.e()).floatValue() + ((-f3) / ((Number) ((gf6) obj2).invoke()).floatValue()), 0.0f, i2);
                    Float f4 = new Float(fO);
                    this.b = fO;
                    this.c = true;
                    if (o95Var.g(f4, this) == d9nVar) {
                        return d9nVar;
                    }
                    f = fO;
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f = this.b;
                    hm5.M(obj);
                }
                int iP = yoi1.p(jch0.U(f), 0, i2);
                err0 err0Var2 = err0Var;
                if (iP != err0Var2.s()) {
                    err0Var2.t(iP);
                    sct0Var.a(9);
                }
                iu30Var.invoke(new Integer((iP * i) + ((rr80) tr80Var).a));
                return rih1Var;
            default:
                boolean z2 = this.c;
                if (!z2) {
                    hm5.M(obj);
                    float fO2 = yoi1.o(((Number) o95Var.e()).floatValue() + ((-f3) / (((int) (((nav0) obj2).Y0 >> 32)) / 12.0f)), 0.0f, i2);
                    Float f5 = new Float(fO2);
                    this.b = fO2;
                    this.c = true;
                    if (o95Var.g(f5, this) == d9nVar) {
                        return d9nVar;
                    }
                    f2 = fO2;
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f2 = this.b;
                    hm5.M(obj);
                }
                int iP2 = yoi1.p(jch0.U(f2), 0, i2);
                err0 err0Var3 = err0Var;
                if (iP2 != err0Var3.s()) {
                    err0Var3.t(iP2);
                    sct0Var.a(9);
                }
                iu30Var.invoke(new Integer((iP2 * i) + ((rr80) tr80Var).a));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uep0(nav0 nav0Var, float f, o95 o95Var, int i, hdn0 hdn0Var, ss50 ss50Var, iu30 iu30Var, tr80 tr80Var, int i2, lnm lnmVar) {
        super(2, lnmVar);
        this.Y = nav0Var;
        this.d = f;
        this.e = o95Var;
        this.f = i;
        this.g = hdn0Var;
        this.h = ss50Var;
        this.i = iu30Var;
        this.t = tr80Var;
        this.X = i2;
    }
}
