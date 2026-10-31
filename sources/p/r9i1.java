package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r9i1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ w9i1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r9i1(w9i1 w9i1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = w9i1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        w9i1 w9i1Var = this.c;
        switch (b) {
            case 0:
                return new r9i1(w9i1Var, lnmVar, (byte) 0);
            default:
                return new r9i1(w9i1Var, lnmVar, (byte) 1);
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
        w9i1 w9i1Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    z0i1 z0i1Var = new z0i1(w9i1Var, (lnm) null);
                    this.b = true;
                    if (guo1.H(z0i1Var, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            default:
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
                rv3 rv3Var = w9i1Var.Q0;
                this.b = true;
                Object objInvoke = rv3Var.invoke(this);
                return objInvoke == d9nVar ? d9nVar : objInvoke;
        }
    }
}
