package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wy81 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ az81 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wy81(az81 az81Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = az81Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        az81 az81Var = this.c;
        switch (b) {
            case 0:
                return new wy81(az81Var, lnmVar, (byte) 0);
            default:
                return new wy81(az81Var, lnmVar, (byte) 1);
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
        az81 az81Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    Object objB = az81Var.b(10000, this);
                    return objB == d9nVar ? d9nVar : objB;
                }
                if (z) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    Object objC = az81Var.c(10000, this);
                    return objC == d9nVar ? d9nVar : objC;
                }
                if (z2) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
