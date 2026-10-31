package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q73 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ x73 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q73(x73 x73Var, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = x73Var;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        x73 x73Var = this.c;
        switch (b) {
            case 0:
                return new q73(x73Var, lnmVar, (byte) 0);
            case 1:
                return new q73(x73Var, lnmVar, (byte) 1);
            default:
                return new q73(x73Var, lnmVar, (byte) 2);
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
        x73 x73Var = this.c;
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
                mr20 mr20VarE = x73Var.h.e();
                this.b = true;
                Object objI = b5p1.i(mr20VarE, this);
                return objI == d9nVar ? d9nVar : objI;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    ezc ezcVarG = yoi1.g(x73Var.c.a(true));
                    this.b = true;
                    obj = b5p1.i(ezcVarG, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return obj;
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
                mr20 mr20VarB = x73Var.f78p.b();
                this.b = true;
                Object objI2 = b5p1.i(mr20VarB, this);
                return objI2 == d9nVar ? d9nVar : objI2;
        }
    }
}
