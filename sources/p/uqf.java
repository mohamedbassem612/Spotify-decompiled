package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uqf extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ es41 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uqf(es41 es41Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = es41Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        es41 es41Var = this.c;
        switch (b) {
            case 0:
                return new uqf(es41Var, lnmVar, (byte) 0);
            case 1:
                return new uqf(es41Var, lnmVar, (byte) 1);
            default:
                return new uqf(es41Var, lnmVar, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create(Integer.valueOf(((Number) obj).intValue()), (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        es41 es41Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    int iS = es41Var.f.s();
                    this.b = true;
                    return es41.g(es41Var, iS, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    int iS2 = es41Var.f.s();
                    this.b = true;
                    return kqn1.v(es41Var, (float) (iS2 - es41Var.a.s()), this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.b = true;
                    return kqn1.v(es41Var, (float) (0 - es41Var.a.s()), this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
