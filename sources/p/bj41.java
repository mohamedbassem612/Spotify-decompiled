package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bj41 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ dj41 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bj41(dj41 dj41Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = dj41Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        dj41 dj41Var = this.c;
        switch (b) {
            case 0:
                return new bj41(dj41Var, lnmVar, (byte) 0);
            default:
                return new bj41(dj41Var, lnmVar, (byte) 1);
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
        d9n d9nVar = d9n.a;
        dj41 dj41Var = this.c;
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
                dt71 dt71Var = (dt71) dj41Var.b.e;
                j0z0 j0z0Var = new j0z0(dj41Var, (byte) 12);
                this.b = true;
                dt71Var.collect(j0z0Var, this);
                return d9nVar;
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
                n811 n811Var = new n811();
                mr20 mr20VarK = o4p1.k(dj41Var.g.d, -1, 2);
                mib mibVar = new mib(dj41Var, n811Var, (byte) 17);
                this.b = true;
                return mr20VarK.collect(mibVar, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
