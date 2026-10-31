package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r73 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ x73 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r73(x73 x73Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = x73Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        x73 x73Var = this.c;
        switch (b) {
            case 0:
                return new r73(x73Var, lnmVar, (byte) 0);
            case 1:
                return new r73(x73Var, lnmVar, (byte) 1);
            case 2:
                return new r73(x73Var, lnmVar, (byte) 2);
            case 3:
                return new r73(x73Var, lnmVar, (byte) 3);
            default:
                return new r73(x73Var, lnmVar, (byte) 4);
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
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
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
                bbz0 bbz0VarA = x73Var.h.a();
                q73 q73Var = new q73(x73Var, null, (byte) 0);
                this.b = true;
                Object objC = x73Var.c(bbz0VarA, q73Var, this);
                return objC == d9nVar ? d9nVar : objC;
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
                ezc ezcVarB = x73Var.d.b();
                this.b = true;
                Object objI = b5p1.i(ezcVarB, this);
                return objI == d9nVar ? d9nVar : objI;
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    mr20 mr20VarC = x73Var.b.c("streaming-rules", "");
                    this.b = true;
                    obj = b5p1.i(mr20VarC, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return Boolean.valueOf(y7y0.I((String) obj));
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Boolean bool = Boolean.FALSE;
                q73 q73Var2 = new q73(x73Var, null, (byte) 1);
                this.b = true;
                Object objC2 = x73Var.c(bool, q73Var2, this);
                return objC2 == d9nVar ? d9nVar : objC2;
            default:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                q73 q73Var3 = new q73(x73Var, null, (byte) 2);
                this.b = true;
                Object objC3 = x73Var.c(qrg1.e, q73Var3, this);
                return objC3 == d9nVar ? d9nVar : objC3;
        }
    }
}
