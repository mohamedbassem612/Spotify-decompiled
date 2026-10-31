package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dqo0 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ gqo0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dqo0(gqo0 gqo0Var, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = gqo0Var;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        gqo0 gqo0Var = this.c;
        switch (b) {
            case 0:
                return new dqo0(gqo0Var, lnmVar, (byte) 0);
            case 1:
                return new dqo0(gqo0Var, lnmVar, (byte) 1);
            default:
                return new dqo0(gqo0Var, lnmVar, (byte) 2);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        gqo0 gqo0Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                boolean zE = gqo0Var.n.e();
                this.b = true;
                Object objA = gqo0Var.a(zE, this);
                return objA == d9nVar ? d9nVar : objA;
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                boolean zF = gqo0Var.n.f();
                this.b = true;
                Object objA2 = gqo0Var.a(zF, this);
                return objA2 == d9nVar ? d9nVar : objA2;
            default:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                boolean zG = gqo0Var.n.g();
                this.b = true;
                Object objA3 = gqo0Var.a(zG, this);
                return objA3 == d9nVar ? d9nVar : objA3;
        }
    }
}
