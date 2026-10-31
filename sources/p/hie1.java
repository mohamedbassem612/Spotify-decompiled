package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hie1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ iie1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hie1(iie1 iie1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = iie1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        iie1 iie1Var = this.c;
        switch (b) {
            case 0:
                return new hie1(iie1Var, lnmVar, (byte) 0);
            default:
                return new hie1(iie1Var, lnmVar, (byte) 1);
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
        iie1 iie1Var = this.c;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    xtb0 xtb0Var = iie1Var.a;
                    int i = iie1Var.e;
                    this.b = true;
                    df41 df41Var = xtb0.y;
                    if (xtb0Var.k(i, 0, this) == d9nVar) {
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
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dt71 dt71Var = iie1Var.a.g.a;
                bda1 bda1Var = new bda1(iie1Var, (byte) 9);
                this.b = true;
                dt71Var.collect(bda1Var, this);
                return d9nVar;
        }
    }
}
