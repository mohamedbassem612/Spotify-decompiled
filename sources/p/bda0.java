package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bda0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ pzw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bda0(pzw pzwVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = pzwVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        pzw pzwVar = this.c;
        switch (b) {
            case 0:
                return new bda0(pzwVar, lnmVar, (byte) 0);
            case 1:
                return new bda0(pzwVar, lnmVar, (byte) 1);
            default:
                return new bda0(pzwVar, lnmVar, (byte) 2);
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
        pzw pzwVar = this.c;
        d9n d9nVar = d9n.a;
        lnm lnmVar = null;
        byte b2 = 1;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    d18 d18Var = new d18(new p350(0, (lzn0) pzwVar.X, lzn0.class, "closeCurrentPage", "closeCurrentPage()V", 0, (byte) 10), ((no4) ((b0a0) pzwVar.h).a.get()).d0(), (q8n) pzwVar.b);
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
                mr20 mr20VarU = rqt0.u(new ry50((evz) ((iir) pzwVar.e).c, (byte) 22));
                xp10 xp10Var = new xp10(pzwVar, (byte) 28);
                this.b = true;
                Object objCollect = mr20VarU.collect(new cg90(xp10Var, (byte) 23), this);
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
                q8n q8nVar = (q8n) pzwVar.b;
                bda0 bda0Var = new bda0(pzwVar, lnmVar, b2);
                this.b = true;
                return fn31.Y(q8nVar, bda0Var, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
