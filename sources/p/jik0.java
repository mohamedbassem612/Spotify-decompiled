package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jik0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ es41 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jik0(boolean z, es41 es41Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = z;
        this.d = es41Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        es41 es41Var = this.d;
        boolean z = this.c;
        switch (b) {
            case 0:
                return new jik0(z, es41Var, lnmVar, (byte) 0);
            default:
                return new jik0(z, es41Var, lnmVar, (byte) 1);
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
        boolean z = this.c;
        d9n d9nVar = d9n.a;
        es41 es41Var = this.d;
        switch (b) {
            case 0:
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
                if (!z || es41Var.a.s() <= 0) {
                    return rih1Var;
                }
                this.b = true;
                return es41.g(es41Var, 0, this) == d9nVar ? d9nVar : rih1Var;
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
                if (!z || es41Var.a.s() <= 0) {
                    return rih1Var;
                }
                this.b = true;
                return es41.g(es41Var, 0, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
