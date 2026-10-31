package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kfw0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ ofw0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kfw0(ofw0 ofw0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = ofw0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ofw0 ofw0Var = this.c;
        switch (b) {
            case 0:
                return new kfw0(ofw0Var, lnmVar, (byte) 0);
            case 1:
                return new kfw0(ofw0Var, lnmVar, (byte) 1);
            default:
                return new kfw0(ofw0Var, lnmVar, (byte) 2);
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
        ofw0 ofw0Var = this.c;
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
                mr20 mr20VarA = ofw0Var.h.a();
                jfw0 jfw0Var = new jfw0(ofw0Var, (byte) 1);
                this.b = true;
                return mr20VarA.collect(jfw0Var, this) == d9nVar ? d9nVar : rih1Var;
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
                bpb1 bpb1Var = ofw0Var.g.a;
                jfw0 jfw0Var2 = new jfw0(ofw0Var, (byte) 2);
                this.b = true;
                bpb1Var.collect(jfw0Var2, this);
                return d9nVar;
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
                mr20 mr20Var = ofw0Var.i.a;
                jfw0 jfw0Var3 = new jfw0(ofw0Var, (byte) 3);
                this.b = true;
                return mr20Var.collect(jfw0Var3, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
