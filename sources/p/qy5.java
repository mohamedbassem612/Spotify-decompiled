package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qy5 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ y7e1 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qy5(iu30 iu30Var, y7e1 y7e1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = iu30Var;
        this.c = y7e1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        iu30 iu30Var = this.d;
        y7e1 y7e1Var = this.c;
        switch (b) {
            case 0:
                return new qy5(y7e1Var, iu30Var, lnmVar, (byte) 0);
            case 1:
                return new qy5(y7e1Var, iu30Var, lnmVar, (byte) 1);
            case 2:
                return new qy5(y7e1Var, iu30Var, lnmVar, (byte) 2);
            case 3:
                return new qy5(y7e1Var, iu30Var, lnmVar, (byte) 3);
            case 4:
                return new qy5(y7e1Var, iu30Var, lnmVar, (byte) 4);
            case 5:
                return new qy5(y7e1Var, iu30Var, lnmVar, (byte) 5);
            case 6:
                return new qy5(y7e1Var, iu30Var, lnmVar, (byte) 6);
            case 7:
                return new qy5(y7e1Var, iu30Var, lnmVar, (byte) 7);
            case 8:
                return new qy5(iu30Var, y7e1Var, lnmVar, (byte) 8);
            case 9:
                return new qy5(y7e1Var, iu30Var, lnmVar, (byte) 9);
            case 10:
                return new qy5(iu30Var, y7e1Var, lnmVar, (byte) 10);
            case 11:
                return new qy5(y7e1Var, iu30Var, lnmVar, (byte) 11);
            case 12:
                return new qy5(y7e1Var, iu30Var, lnmVar, (byte) 12);
            case 13:
                return new qy5(y7e1Var, iu30Var, lnmVar, (byte) 13);
            case 14:
                return new qy5(y7e1Var, iu30Var, lnmVar, (byte) 14);
            default:
                return new qy5(y7e1Var, iu30Var, lnmVar, (byte) 15);
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
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        y7e1 y7e1Var = this.c;
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
                qt20 qt20VarV = z4p1.v(rwq.q(new tr1(y7e1Var, (byte) 2)), 1);
                py5 py5Var = new py5(iu30Var, (lnm) null, (byte) 0);
                this.b = true;
                return l4p1.q(qt20VarV, py5Var, this) == d9nVar ? d9nVar : rih1Var;
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
                qt20 qt20VarV2 = z4p1.v(rwq.q(new tr1(y7e1Var, (byte) 6)), 1);
                qv7 qv7Var = new qv7(iu30Var, (byte) 2);
                this.b = true;
                return qt20VarV2.collect(qv7Var, this) == d9nVar ? d9nVar : rih1Var;
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
                qt20 qt20VarV3 = z4p1.v(rwq.q(new tr1(y7e1Var, (byte) 7)), 1);
                qv7 qv7Var2 = new qv7(iu30Var, (byte) 3);
                this.b = true;
                return qt20VarV3.collect(qv7Var2, this) == d9nVar ? d9nVar : rih1Var;
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
                m441 m441VarQ = rwq.q(new tr1(y7e1Var, (byte) 12));
                qv7 qv7Var3 = new qv7(iu30Var, (byte) 4);
                this.b = true;
                return m441VarQ.collect(qv7Var3, this) == d9nVar ? d9nVar : rih1Var;
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
                mr20 mr20VarU = rqt0.u(rwq.q(new tr1(y7e1Var, (byte) 19)));
                qv7 qv7Var4 = new qv7(iu30Var, (byte) 12);
                this.b = true;
                return mr20VarU.collect(qv7Var4, this) == d9nVar ? d9nVar : rih1Var;
            case 5:
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
                mr20 mr20VarU2 = rqt0.u(rwq.q(new tr1(y7e1Var, (byte) 20)));
                py5 py5Var2 = new py5(iu30Var, (lnm) null, (byte) 5);
                this.b = true;
                return l4p1.q(mr20VarU2, py5Var2, this) == d9nVar ? d9nVar : rih1Var;
            case 6:
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                m441 m441VarQ2 = rwq.q(new tr1(y7e1Var, (byte) 25));
                qv7 qv7Var5 = new qv7(iu30Var, (byte) 16);
                this.b = true;
                return m441VarQ2.collect(qv7Var5, this) == d9nVar ? d9nVar : rih1Var;
            case 7:
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                m441 m441VarQ3 = rwq.q(new tr1(y7e1Var, (byte) 28));
                om70 om70Var = new om70(y7e1Var, iu30Var, (byte) 12);
                this.b = true;
                return m441VarQ3.collect(om70Var, this) == d9nVar ? d9nVar : rih1Var;
            case 8:
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarU3 = rqt0.u(rwq.q(new tr1(y7e1Var, (byte) 29)));
                j1d0 j1d0Var = new j1d0(iu30Var, (byte) 1);
                this.b = true;
                return mr20VarU3.collect(j1d0Var, this) == d9nVar ? d9nVar : rih1Var;
            case 9:
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                qt20 qt20VarV4 = z4p1.v(rqt0.u(rwq.q(new ime0(y7e1Var, (byte) 1))), 1);
                qv7 qv7Var6 = new qv7(iu30Var, (byte) 22);
                this.b = true;
                return qt20VarV4.collect(qv7Var6, this) == d9nVar ? d9nVar : rih1Var;
            case 10:
                boolean z11 = this.b;
                if (z11) {
                    if (z11) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                m441 m441VarQ4 = rwq.q(new ime0(y7e1Var, (byte) 5));
                j1d0 j1d0Var2 = new j1d0(iu30Var, (byte) 2);
                this.b = true;
                return m441VarQ4.collect(j1d0Var2, this) == d9nVar ? d9nVar : rih1Var;
            case 11:
                boolean z12 = this.b;
                if (z12) {
                    if (z12) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarU4 = rqt0.u(z4p1.v(rwq.q(new ime0(y7e1Var, (byte) 7)), 1));
                lm31 lm31Var = new lm31(iu30Var, (byte) 2);
                this.b = true;
                return mr20VarU4.collect(lm31Var, this) == d9nVar ? d9nVar : rih1Var;
            case 12:
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                qt20 qt20VarV5 = z4p1.v(rqt0.u(rwq.q(new ime0(y7e1Var, (byte) 12))), 1);
                lm31 lm31Var2 = new lm31(iu30Var, (byte) 3);
                this.b = true;
                return qt20VarV5.collect(lm31Var2, this) == d9nVar ? d9nVar : rih1Var;
            case 13:
                boolean z14 = this.b;
                if (z14) {
                    if (z14) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                m441 m441VarQ5 = rwq.q(new ime0(y7e1Var, (byte) 14));
                lm31 lm31Var3 = new lm31(iu30Var, (byte) 11);
                this.b = true;
                return m441VarQ5.collect(lm31Var3, this) == d9nVar ? d9nVar : rih1Var;
            case 14:
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                m441 m441VarQ6 = rwq.q(new ime0(y7e1Var, (byte) 15));
                lm31 lm31Var4 = new lm31(iu30Var, (byte) 12);
                this.b = true;
                return m441VarQ6.collect(lm31Var4, this) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z16 = this.b;
                if (z16) {
                    if (z16) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarK = r4p1.k(rwq.q(new ime0(y7e1Var, (byte) 17)), 300L);
                lm31 lm31Var5 = new lm31(iu30Var, (byte) 14);
                this.b = true;
                return mr20VarK.collect(lm31Var5, this) == d9nVar ? d9nVar : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qy5(y7e1 y7e1Var, iu30 iu30Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = y7e1Var;
        this.d = iu30Var;
    }
}
