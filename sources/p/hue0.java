package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hue0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public final /* synthetic */ iue0 c;
    public final /* synthetic */ qzn0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hue0(iue0 iue0Var, qzn0 qzn0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = iue0Var;
        this.d = qzn0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        qzn0 qzn0Var = this.d;
        iue0 iue0Var = this.c;
        switch (b) {
            case 0:
                return new hue0(qzn0Var, iue0Var, lnmVar);
            default:
                return new hue0(iue0Var, qzn0Var, lnmVar);
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
        qzn0 qzn0Var = this.d;
        iue0 iue0Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    eqn0 eqn0Var = eqn0.a;
                    this.b = true;
                    if (qzn0Var.a(eqn0Var, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                if (!(iue0Var.h instanceof svc)) {
                    return rih1Var;
                }
                iue0Var.g.getClass();
                return rih1Var;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    hue0 hue0Var = new hue0(qzn0Var, iue0Var, (lnm) null);
                    this.b = true;
                    return z8p1.u(iue0Var, w8c0.d, hue0Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hue0(qzn0 qzn0Var, iue0 iue0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = qzn0Var;
        this.c = iue0Var;
    }
}
