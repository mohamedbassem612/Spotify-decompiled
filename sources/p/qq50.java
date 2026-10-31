package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qq50 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ vi11 c;
    public final /* synthetic */ dh10 d;
    public final /* synthetic */ hv41 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qq50(vi11 vi11Var, dh10 dh10Var, hv41 hv41Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = vi11Var;
        this.d = dh10Var;
        this.e = hv41Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new qq50(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new qq50(this.c, this.d, this.e, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9n.a;
            default:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hm5.M(obj);
                    }
                    return null;
                }
                hm5.M(obj);
                zob1 zob1VarU = ((y1c1) this.c.c).U(p4g.class);
                u5z u5zVar = new u5z(this.d, this.e, (byte) 24);
                this.b = true;
                if (zob1VarU.collect(u5zVar, this) == d9nVar) {
                    return d9nVar;
                }
                jah.d();
                return null;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    vi11 vi11Var = this.c;
                    iac0 iac0Var = (iac0) vi11Var.d;
                    qq50 qq50Var = new qq50(vi11Var, this.d, this.e, null, (byte) 0);
                    this.b = true;
                    if (z8p1.u(iac0Var, w8c0.d, qq50Var, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
        }
    }
}
