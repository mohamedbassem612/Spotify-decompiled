package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a03 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ u961 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a03(u961 u961Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = u961Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        u961 u961Var = this.c;
        switch (b) {
            case 0:
                return new a03(u961Var, lnmVar, (byte) 0);
            default:
                return new a03(u961Var, lnmVar, (byte) 1);
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
        u961 u961Var = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    es41 es41Var = (es41) u961Var.a;
                    this.b = true;
                    return es41.g(es41Var, 0, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
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
                n811 n811Var = new n811();
                n811Var.a = ((es41) u961Var.a).a.s();
                m441 m441VarQ = rwq.q(new g82(u961Var, (byte) 4));
                vt vtVar = new vt(u961Var, n811Var, (byte) 18);
                this.b = true;
                return m441VarQ.collect(vtVar, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
