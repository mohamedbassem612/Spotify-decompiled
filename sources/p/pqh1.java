package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pqh1 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ alg1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pqh1(alg1 alg1Var, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.c = alg1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        alg1 alg1Var = this.c;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                return new pqh1(alg1Var, lnmVar, (byte) 0).invokeSuspend(rih1Var);
            default:
                return new pqh1(alg1Var, lnmVar, (byte) 1).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        alg1 alg1Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    return alg1Var.h(this) == d9nVar ? d9nVar : rih1Var;
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
                    this.b = true;
                    return alg1Var.h(this) == d9nVar ? d9nVar : rih1Var;
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
