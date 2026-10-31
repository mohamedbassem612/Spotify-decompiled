package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ndy extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ qdy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ndy(qdy qdyVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = qdyVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        qdy qdyVar = this.c;
        switch (b) {
            case 0:
                ndy ndyVar = new ndy(qdyVar, lnmVar, (byte) 0);
                ndyVar.b = ((Boolean) obj).booleanValue();
                return ndyVar;
            default:
                return new ndy(qdyVar, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((ndy) create(bool, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                return ((ndy) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        qdy qdyVar = this.c;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                hm5.M(obj);
                qdyVar.f31p = z ? 1.0f : 0.3f;
                return rih1Var;
            default:
                boolean z2 = this.b;
                lnm lnmVar = null;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20Var = qdyVar.l.c;
                ndy ndyVar = new ndy(qdyVar, lnmVar, (byte) 0);
                this.b = true;
                Object objCollect = mr20Var.collect(new eu20(kfo0.a, ndyVar, (byte) 1), this);
                d9n d9nVar = d9n.a;
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                return objCollect == d9nVar ? d9nVar : rih1Var;
        }
    }
}
