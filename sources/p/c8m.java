package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c8m extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ kes c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c8m(kes kesVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = kesVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        kes kesVar = this.c;
        switch (b) {
            case 0:
                return new c8m(kesVar, lnmVar, (byte) 0);
            default:
                return new c8m(kesVar, lnmVar, (byte) 1);
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
        kes kesVar = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    int iS = ((err0) ((jkr0) kesVar).d.c).s() - 1;
                    this.b = true;
                    return jkr0.g(kesVar, iS, (n8b1) null, this, 6) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    int iS2 = ((err0) ((jkr0) kesVar).d.c).s() + 1;
                    this.b = true;
                    return jkr0.g(kesVar, iS2, (n8b1) null, this, 6) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
