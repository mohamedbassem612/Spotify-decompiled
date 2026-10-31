package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aea0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ dea0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aea0(dea0 dea0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = dea0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        dea0 dea0Var = this.c;
        switch (b) {
            case 0:
                return new aea0(dea0Var, lnmVar, (byte) 0);
            case 1:
                return new aea0(dea0Var, lnmVar, (byte) 1);
            default:
                return new aea0(dea0Var, lnmVar, (byte) 2);
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
            case 1:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        dea0 dea0Var = this.c;
        d9n d9nVar = d9n.a;
        lnm lnmVar = null;
        byte b2 = 1;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    d18 d18Var = new d18(new p350(0, (lzn0) dea0Var.X, lzn0.class, "closeCurrentPage", "closeCurrentPage()V", 0, (byte) 11), ((no4) ((b0a0) dea0Var.i).a.get()).d0(), dea0Var.b);
                    this.b = true;
                    return d18Var.h(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
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
                mr20 mr20VarU = rqt0.u(new ry50((evz) ((iir) dea0Var.f).c, (byte) 23));
                xp10 xp10Var = new xp10(dea0Var, (byte) 29);
                this.b = true;
                Object objCollect = mr20VarU.collect(new cg90(xp10Var, (byte) 25), this);
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                return objCollect == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                q8n q8nVar = dea0Var.b;
                aea0 aea0Var = new aea0(dea0Var, lnmVar, b2);
                this.b = true;
                return fn31.Y(q8nVar, aea0Var, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
