package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class j9l1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ hcl1 c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j9l1(hcl1 hcl1Var, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = hcl1Var;
        this.d = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ven0 ven0Var = this.d;
        hcl1 hcl1Var = this.c;
        switch (b) {
            case 0:
                return new j9l1(hcl1Var, ven0Var, lnmVar, (byte) 0);
            default:
                return new j9l1(hcl1Var, ven0Var, lnmVar, (byte) 1);
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
        ven0 ven0Var = this.d;
        hcl1 hcl1Var = this.c;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    ve01 ve01Var = hcl1Var.f;
                    i9l1 i9l1Var = new i9l1(ven0Var, (byte) 0);
                    this.b = true;
                    if (ve01Var.a.collect(i9l1Var, this) == d9nVar) {
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
                    ve01 ve01Var2 = hcl1Var.h;
                    i9l1 i9l1Var2 = new i9l1(ven0Var, (byte) 1);
                    this.b = true;
                    Object objCollect = ve01Var2.a.collect(new zmj1(new zmj1(i9l1Var2, (byte) 18), (byte) 17), this);
                    if (objCollect != d9nVar) {
                        objCollect = rih1Var;
                    }
                    if (objCollect != d9nVar) {
                        objCollect = rih1Var;
                    }
                    if (objCollect == d9nVar) {
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
