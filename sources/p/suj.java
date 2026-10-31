package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class suj extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ tuj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ suj(tuj tujVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = tujVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        tuj tujVar = this.c;
        switch (b) {
            case 0:
                return new suj(tujVar, lnmVar, (byte) 0);
            default:
                return new suj(tujVar, lnmVar, (byte) 1);
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
        byte b2 = 0;
        d9n d9nVar = d9n.a;
        tuj tujVar = this.c;
        byte b3 = 1;
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
                any anyVarC = ((roc0) tujVar.d).c();
                quj qujVar = new quj(tujVar, b2);
                this.b = true;
                Object objCollect = anyVarC.collect(new x1h(qujVar, (byte) 10), this);
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                return objCollect == d9nVar ? d9nVar : rih1Var;
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
                lt20 lt20Var = new lt20(tujVar.l, new l2(tujVar, (lnm) null, (byte) 24), (byte) 0);
                quj qujVar2 = new quj(tujVar, b3);
                this.b = true;
                return lt20Var.collect(qujVar2, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
