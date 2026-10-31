package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class duk extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ bs91 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ duk(bs91 bs91Var, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = bs91Var;
        this.d = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        String str = this.d;
        bs91 bs91Var = this.c;
        switch (b) {
            case 0:
                return new duk(bs91Var, str, lnmVar, (byte) 0);
            case 1:
                return new duk(bs91Var, str, lnmVar, (byte) 1);
            case 2:
                return new duk(bs91Var, str, lnmVar, (byte) 2);
            default:
                return new duk(bs91Var, str, lnmVar, (byte) 3);
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
            case 1:
                break;
            case 2:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.d;
        bs91 bs91Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    return bs91.c(bs91Var, str, this, 14) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
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
                wr91 wr91VarA = bs91Var.a();
                if (wr91VarA != null) {
                    wr91VarA.a();
                }
                this.b = true;
                return bs91.c(bs91Var, str, this, 14) == d9nVar ? d9nVar : rih1Var;
            case 2:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                wr91 wr91VarA2 = bs91Var.a();
                if (wr91VarA2 != null) {
                    wr91VarA2.a();
                }
                this.b = true;
                return bs91.c(bs91Var, str, this, 14) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    this.b = true;
                    return bs91.c(bs91Var, str, this, 6) == d9nVar ? d9nVar : rih1Var;
                }
                if (z4) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
