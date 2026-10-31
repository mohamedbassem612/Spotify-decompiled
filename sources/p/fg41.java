package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fg41 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ hg41 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fg41(hg41 hg41Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = hg41Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        hg41 hg41Var = this.c;
        switch (b) {
            case 0:
                return new fg41(hg41Var, lnmVar, (byte) 0);
            case 1:
                return new fg41(hg41Var, lnmVar, (byte) 1);
            case 2:
                return new fg41(hg41Var, lnmVar, (byte) 2);
            case 3:
                return new fg41(hg41Var, lnmVar, (byte) 3);
            default:
                return new fg41(hg41Var, lnmVar, (byte) 4);
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        hg41 hg41Var = this.c;
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
                o95 o95Var = hg41Var.P0;
                Float f = new Float(1.0f);
                this.b = true;
                return o95.b(o95Var, f, (fe5) null, (Float) null, (iu30) null, this, 14) == d9nVar ? d9nVar : rih1Var;
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
                o95 o95Var2 = hg41Var.Q0;
                Float f2 = new Float(1.0f);
                this.b = true;
                return o95.b(o95Var2, f2, (fe5) null, (Float) null, (iu30) null, this, 14) == d9nVar ? d9nVar : rih1Var;
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
                o95 o95Var3 = hg41Var.P0;
                Float f3 = new Float(0.97f);
                this.b = true;
                return o95.b(o95Var3, f3, (fe5) null, (Float) null, (iu30) null, this, 14) == d9nVar ? d9nVar : rih1Var;
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
                o95 o95Var4 = hg41Var.Q0;
                Float f4 = new Float(0.8f);
                this.b = true;
                return o95.b(o95Var4, f4, (fe5) null, (Float) null, (iu30) null, this, 14) == d9nVar ? d9nVar : rih1Var;
            default:
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
                mr20 mr20VarJ = o4p1.j(hg41Var.O0.c(), 2, 2);
                j0z0 j0z0Var = new j0z0(hg41Var, (byte) 11);
                this.b = true;
                return mr20VarJ.collect(j0z0Var, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
