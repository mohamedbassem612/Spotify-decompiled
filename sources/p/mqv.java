package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mqv extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ xtb0 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqv(xtb0 xtb0Var, iu30 iu30Var, if00 if00Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.c = xtb0Var;
        this.d = iu30Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        iu30 iu30Var = this.d;
        xtb0 xtb0Var = this.c;
        switch (b) {
            case 0:
                return new mqv(xtb0Var, iu30Var, lnmVar, (byte) 0);
            case 1:
                return new mqv(xtb0Var, iu30Var, (if00) null, lnmVar);
            case 2:
                return new mqv(xtb0Var, iu30Var, lnmVar, (byte) 2);
            case 3:
                return new mqv(xtb0Var, iu30Var, lnmVar, (byte) 3);
            case 4:
                return new mqv(xtb0Var, iu30Var, lnmVar, (byte) 4);
            default:
                return new mqv(xtb0Var, iu30Var, lnmVar, (byte) 5);
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
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        xtb0 xtb0Var = this.c;
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
                m441 m441VarQ = rwq.q(new ih1(xtb0Var, (byte) 14));
                qv7 qv7Var = new qv7(iu30Var, (byte) 13);
                this.b = true;
                return m441VarQ.collect(qv7Var, this) == d9nVar ? d9nVar : rih1Var;
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
                m441 m441VarQ2 = rwq.q(new ih1(xtb0Var, (byte) 21));
                qv7 qv7Var2 = new qv7(iu30Var, (if00) null);
                this.b = true;
                return m441VarQ2.collect(qv7Var2, this) == d9nVar ? d9nVar : rih1Var;
            case 2:
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
                mr20 mr20VarU = rqt0.u(rwq.q(new nxb0(xtb0Var, (byte) 14)));
                qv7 qv7Var3 = new qv7(iu30Var, (byte) 25);
                this.b = true;
                return mr20VarU.collect(qv7Var3, this) == d9nVar ? d9nVar : rih1Var;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dt71 dt71Var = xtb0Var.g.a;
                lm31 lm31Var = new lm31(iu30Var, (byte) 1);
                this.b = true;
                dt71Var.collect(lm31Var, this);
                return d9nVar;
            case 4:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarU2 = rqt0.u(rwq.q(new wt41(xtb0Var, (byte) 9)));
                lm31 lm31Var2 = new lm31(iu30Var, (byte) 9);
                this.b = true;
                Object objCollect = mr20VarU2.collect(new qmd1(lm31Var2, (byte) 11), this);
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                return objCollect == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                qt20 qt20VarV = z4p1.v(rqt0.u(new any(rwq.q(new wt41(xtb0Var, (byte) 12)), (byte) 18)), 1);
                lm31 lm31Var3 = new lm31(iu30Var, (byte) 10);
                this.b = true;
                return qt20VarV.collect(lm31Var3, this) == d9nVar ? d9nVar : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mqv(xtb0 xtb0Var, iu30 iu30Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = xtb0Var;
        this.d = iu30Var;
    }
}
