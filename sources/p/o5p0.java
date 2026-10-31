package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o5p0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ x5p0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o5p0(x5p0 x5p0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = x5p0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        x5p0 x5p0Var = this.c;
        switch (b) {
            case 0:
                return new o5p0(x5p0Var, lnmVar, (byte) 0);
            default:
                return new o5p0(x5p0Var, lnmVar, (byte) 1);
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
        x5p0 x5p0Var = this.c;
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
                this.b = true;
                int i = x5p0.h;
                Object objC = x5p0Var.c(this);
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
                mr20 mr20Var = x5p0Var.c;
                this.b = true;
                Object objK = b5p1.k(mr20Var, this);
                return objK == d9nVar ? d9nVar : objK;
        }
    }
}
