package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v841 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ x841 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ tv80 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v841(x841 x841Var, String str, tv80 tv80Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = x841Var;
        this.d = str;
        this.e = tv80Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new v841(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new v841(this.c, this.d, this.e, lnmVar, (byte) 1);
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
        x841 x841Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ccc0 ccc0Var = x841Var.c;
                tv80 tv80Var = this.e;
                ubc0 ubc0Var = tv80Var != null ? new ubc0(tv80Var) : null;
                this.b = true;
                ccc0Var.getClass();
                return ccc0.c(ccc0Var, this.d, true, ubc0Var, this) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    ldj0 ldj0Var = (ldj0) x841Var.g;
                    this.b = true;
                    return ldj0Var.c(this.d, this.e, null, null, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
