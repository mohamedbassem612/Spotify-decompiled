package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h721 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ j721 c;
    public final /* synthetic */ d721 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h721(j721 j721Var, d721 d721Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = j721Var;
        this.d = d721Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        d721 d721Var = this.d;
        j721 j721Var = this.c;
        switch (b) {
            case 0:
                return new h721(j721Var, d721Var, lnmVar, (byte) 0);
            default:
                return new h721(j721Var, d721Var, lnmVar, (byte) 1);
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
        d721 d721Var = this.d;
        j721 j721Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    mzr0 mzr0Var = j721Var.c;
                    String str = d721Var.a;
                    String str2 = d721Var.b;
                    this.b = true;
                    if (mzr0Var.y(str, str2, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mzr0 mzr0Var2 = j721Var.c;
                String str3 = d721Var.a;
                String str4 = d721Var.b;
                this.b = true;
                Object objR = mzr0Var2.r(str3, str4, this);
                return objR == d9nVar ? d9nVar : objR;
        }
    }
}
