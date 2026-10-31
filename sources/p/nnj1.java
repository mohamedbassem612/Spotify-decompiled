package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nnj1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ ve01 c;
    public final /* synthetic */ pnj1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nnj1(ve01 ve01Var, pnj1 pnj1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = ve01Var;
        this.d = pnj1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        pnj1 pnj1Var = this.d;
        ve01 ve01Var = this.c;
        switch (b) {
            case 0:
                return new nnj1(ve01Var, pnj1Var, lnmVar, (byte) 0);
            default:
                return new nnj1(ve01Var, pnj1Var, lnmVar, (byte) 1);
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
        rih1 rih1Var = rih1.a;
        pnj1 pnj1Var = this.d;
        ve01 ve01Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
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
                mr20 mr20VarU = rqt0.u(ve01Var);
                mnj1 mnj1Var = new mnj1(pnj1Var, (byte) 0);
                this.b = true;
                return mr20VarU.collect(mnj1Var, this) == d9nVar ? d9nVar : rih1Var;
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
                plu pluVarW = rqt0.w(ve01Var, jmj1.R0, rqt0.b);
                mnj1 mnj1Var2 = new mnj1(pnj1Var, (byte) 1);
                this.b = true;
                return pluVarW.collect(mnj1Var2, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
