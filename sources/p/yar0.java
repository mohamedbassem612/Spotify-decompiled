package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yar0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ war0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yar0(war0 war0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = war0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        war0 war0Var = this.d;
        switch (b) {
            case 0:
                yar0 yar0Var = new yar0(war0Var, lnmVar, (byte) 0);
                yar0Var.c = obj;
                return yar0Var;
            default:
                yar0 yar0Var2 = new yar0(war0Var, lnmVar, (byte) 1);
                yar0Var2.c = obj;
                return yar0Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((nsw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        war0 war0Var = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                ssw0 ssw0Var = (ssw0) this.c;
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
                xjr xjrVar = new xjr(ssw0Var, (byte) 4);
                war0Var.d(xjrVar);
                ft0 ft0Var = new ft0(war0Var, xjrVar, (byte) 18);
                this.c = null;
                this.b = true;
                return jch0.s(ssw0Var, ft0Var, this) == d9nVar ? d9nVar : rih1Var;
            default:
                nsw0 nsw0Var = (nsw0) this.c;
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
                mr20 mr20VarF = qqn1.f(war0Var);
                zrf zrfVar = new zrf(nsw0Var, (byte) 4);
                this.c = null;
                this.b = true;
                return mr20VarF.collect(zrfVar, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
