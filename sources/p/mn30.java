package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mn30 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ nn30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mn30(nn30 nn30Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = nn30Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        nn30 nn30Var = this.c;
        switch (b) {
            case 0:
                mn30 mn30Var = new mn30(nn30Var, lnmVar, (byte) 0);
                mn30Var.b = ((Boolean) obj).booleanValue();
                return mn30Var;
            default:
                return new mn30(nn30Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((mn30) create(bool, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                return ((mn30) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        nn30 nn30Var = this.c;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                hm5.M(obj);
                nn30Var.z = z ? 1.0f : 0.3f;
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
                mr20 mr20Var = nn30Var.r.c;
                mn30 mn30Var = new mn30(nn30Var, lnmVar, (byte) 0);
                this.b = true;
                Object objCollect = mr20Var.collect(new eu20(kfo0.a, mn30Var, (byte) 1), this);
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
