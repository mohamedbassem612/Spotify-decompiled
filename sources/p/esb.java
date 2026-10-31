package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class esb extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ lsb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ esb(lsb lsbVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = lsbVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        lsb lsbVar = this.c;
        switch (b) {
            case 0:
                return new esb(lsbVar, lnmVar, (byte) 0);
            case 1:
                return new esb(lsbVar, lnmVar, (byte) 1);
            default:
                return new esb(lsbVar, lnmVar, (byte) 2);
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
        byte b2 = 25;
        lsb lsbVar = this.c;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        byte b3 = 1;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    zob1 zob1Var = lsbVar.m;
                    dsb dsbVar = new dsb(lsbVar, (byte) 0);
                    this.b = true;
                    Object objCollect = zob1Var.collect(new o010(dsbVar, b2), this);
                    if (objCollect != d9nVar) {
                        objCollect = rih1Var;
                    }
                    if (objCollect == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    jge jgeVarE = hu20.e(new any(lsbVar.m, (byte) 18), new i64(3, (lnm) null, (byte) 3));
                    dsb dsbVar2 = new dsb(lsbVar, b3);
                    this.b = true;
                    if (jgeVarE.collect(dsbVar2, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            default:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    zob1 zob1Var2 = lsbVar.n;
                    dsb dsbVar3 = new dsb(lsbVar, (byte) 2);
                    this.b = true;
                    Object objCollect2 = zob1Var2.collect(new o010(dsbVar3, b2), this);
                    if (objCollect2 != d9nVar) {
                        objCollect2 = rih1Var;
                    }
                    if (objCollect2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
        }
    }
}
