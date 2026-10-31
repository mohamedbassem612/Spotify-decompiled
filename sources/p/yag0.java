package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yag0 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ bbg0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yag0(bbg0 bbg0Var, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = bbg0Var;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        bbg0 bbg0Var = this.c;
        switch (b) {
            case 0:
                return new yag0(bbg0Var, lnmVar, (byte) 0);
            default:
                return new yag0(bbg0Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        bbg0 bbg0Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                k2b0 k2b0Var = bbg0Var.e;
                String str = bbg0Var.c.a;
                this.b = true;
                Object objC = k2b0Var.c(str, this);
                return objC == d9nVar ? d9nVar : objC;
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
                n2b0 n2b0Var = bbg0Var.f;
                gbg0 gbg0Var = bbg0Var.c;
                String str2 = gbg0Var.a;
                ibg0 ibg0Var = gbg0Var.b;
                this.b = true;
                Object objA = n2b0Var.a(str2, ibg0Var, this);
                return objA == d9nVar ? d9nVar : objA;
        }
    }
}
