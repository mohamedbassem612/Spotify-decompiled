package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vec extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ idn0 c;
    public final /* synthetic */ bw91 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vec(idn0 idn0Var, bw91 bw91Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = idn0Var;
        this.d = bw91Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new vec(this.c, this.d, lnmVar, (byte) 0);
            case 1:
                return new vec(this.c, this.d, lnmVar, (byte) 1);
            case 2:
                return new vec(this.c, this.d, lnmVar, (byte) 2);
            case 3:
                return new vec(this.c, this.d, lnmVar, (byte) 3);
            default:
                return new vec(this.c, this.d, lnmVar, (byte) 4);
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
        bw91 bw91Var = this.d;
        idn0 idn0Var = this.c;
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
                mr20 mr20VarC = idn0Var.c();
                uec uecVar = new uec(bw91Var, (byte) 0);
                this.b = true;
                return mr20VarC.collect(uecVar, this) == d9nVar ? d9nVar : rih1Var;
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
                mr20 mr20VarC2 = idn0Var.c();
                uec uecVar2 = new uec(bw91Var, (byte) 1);
                this.b = true;
                return mr20VarC2.collect(uecVar2, this) == d9nVar ? d9nVar : rih1Var;
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
                mr20 mr20VarC3 = idn0Var.c();
                uec uecVar3 = new uec(bw91Var, (byte) 2);
                this.b = true;
                return mr20VarC3.collect(uecVar3, this) == d9nVar ? d9nVar : rih1Var;
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
                mr20 mr20VarC4 = idn0Var.c();
                uec uecVar4 = new uec(bw91Var, (byte) 3);
                this.b = true;
                return mr20VarC4.collect(uecVar4, this) == d9nVar ? d9nVar : rih1Var;
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
                mr20 mr20VarC5 = idn0Var.c();
                uec uecVar5 = new uec(bw91Var, (byte) 4);
                this.b = true;
                return mr20VarC5.collect(uecVar5, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
