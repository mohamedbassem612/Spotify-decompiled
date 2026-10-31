package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c160 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ d160 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c160(d160 d160Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = d160Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        d160 d160Var = this.c;
        switch (b) {
            case 0:
                return new c160(d160Var, lnmVar, (byte) 0);
            default:
                return new c160(d160Var, lnmVar, (byte) 1);
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
        d160 d160Var = this.c;
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
                haa0 haa0Var = d160Var.c;
                String str = d160Var.a;
                jrc0 jrc0Var = new jrc0("");
                this.b = true;
                return haa0Var.p(str, jrc0Var, this) == d9nVar ? d9nVar : rih1Var;
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
                mr20 mr20VarU = rqt0.u(d160Var.c.o(d160Var.a));
                xp10 xp10Var = new xp10(d160Var, (byte) 13);
                this.b = true;
                return mr20VarU.collect(xp10Var, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
