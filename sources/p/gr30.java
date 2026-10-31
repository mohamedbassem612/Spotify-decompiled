package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gr30 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final /* synthetic */ r091 c;
    public final /* synthetic */ jr30 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ c9n f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr30(jr30 jr30Var, String str, r091 r091Var, c9n c9nVar, lnm lnmVar) {
        super(2, lnmVar);
        this.d = jr30Var;
        this.e = str;
        this.c = r091Var;
        this.f = c9nVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new gr30(this.d, this.e, this.c, this.f, lnmVar);
            default:
                return new gr30(this.c, this.d, this.e, this.f, lnmVar);
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
        bpb1 huzVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    if (hap1.i(120000L, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                vuh1 vuh1Var = vuh1.g;
                jr30 jr30Var = this.d;
                p731 p731Var = jr30Var.b;
                String str = this.e;
                if (p731Var != null) {
                    p731Var.b(str, vuh1Var);
                }
                jr30Var.c(str, this.c, this.f);
                return rih1Var;
            default:
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
                r091 r091Var = this.c;
                bpb1 bpb1Var = r091Var.g;
                jr30 jr30Var2 = this.d;
                p731 p731Var2 = jr30Var2.b;
                if (p731Var2 == null || (huzVar = p731Var2.a()) == null) {
                    huzVar = new huz(new o731(), (byte) 10);
                }
                String str2 = this.e;
                mr20 mr20VarU = rqt0.u(new x010(bpb1Var, huzVar, new qr0(str2, lnmVar, (byte) 22), (byte) 1));
                ur1 ur1Var = new ur1(jr30Var2, str2, r091Var, this.f, (lnm) null);
                this.b = true;
                return l4p1.q(mr20VarU, ur1Var, this) == d9nVar ? d9nVar : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr30(r091 r091Var, jr30 jr30Var, String str, c9n c9nVar, lnm lnmVar) {
        super(2, lnmVar);
        this.c = r091Var;
        this.d = jr30Var;
        this.e = str;
        this.f = c9nVar;
    }
}
