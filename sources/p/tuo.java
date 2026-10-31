package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tuo extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ rh31 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tuo(rh31 rh31Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = rh31Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new tuo(this.c, lnmVar, (byte) 0);
            default:
                return new tuo(this.c, lnmVar, (byte) 1);
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
        rh31 rh31Var = this.c;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    zsc zscVar = rh31Var.c;
                    this.b = true;
                    Object objS = smo1.s(new jg41(zscVar, null, (byte) 0), this);
                    if (objS != d9nVar) {
                        objS = rih1Var;
                    }
                    if (objS == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    zsc zscVar2 = rh31Var.c;
                    this.b = true;
                    Object objS2 = smo1.s(new jg41(zscVar2, null, (byte) 1), this);
                    if (objS2 != d9nVar) {
                        objS2 = rih1Var;
                    }
                    if (objS2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
        }
    }
}
