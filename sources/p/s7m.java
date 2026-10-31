package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s7m extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public final /* synthetic */ o95 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ven0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7m(o95 o95Var, boolean z, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = o95Var;
        this.d = z;
        this.e = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new s7m(this.d, this.c, this.e, lnmVar);
            default:
                return new s7m(this.c, this.d, this.e, lnmVar);
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
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.e;
        boolean z = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (!z) {
                    return rih1Var;
                }
                gke gkeVar = new gke(this.c, ven0Var, (lnm) null, (byte) 11);
                this.b = true;
                return smo1.s(gkeVar, this) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    Float f = new Float(1.0f);
                    pxg1 pxg1VarO0 = irn1.o0(200, 0, (dlv) null, 6);
                    this.b = true;
                    if (o95.b(this.c, f, pxg1VarO0, (Float) null, (iu30) null, this, 12) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                if (!z) {
                    return rih1Var;
                }
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7m(boolean z, o95 o95Var, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = z;
        this.c = o95Var;
        this.e = ven0Var;
    }
}
