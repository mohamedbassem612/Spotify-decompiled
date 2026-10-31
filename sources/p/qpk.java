package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qpk extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ upb0 d;
    public final /* synthetic */ iu30 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qpk(String str, upb0 upb0Var, iu30 iu30Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = str;
        this.d = upb0Var;
        this.e = iu30Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new qpk(this.d, this.c, this.e, lnmVar);
            default:
                return new qpk(this.c, this.d, this.e, lnmVar);
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
        iu30 iu30Var = this.e;
        String str = this.c;
        d9n d9nVar = d9n.a;
        upb0 upb0Var = this.d;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    m441 m441VarQ = rwq.q(new ppk(upb0Var, (byte) 0));
                    h50 h50Var = new h50(str, upb0Var, iu30Var, (byte) 24);
                    this.b = true;
                    if (m441VarQ.collect(h50Var, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    if (str != null && !ihc1.y0(str)) {
                        mr20 mr20VarU = rqt0.u(rwq.q(new ppk(upb0Var, (byte) 3)));
                        kge kgeVarD = hu20.d(new mr20[]{new any(mr20VarU, (byte) 8), new evz(rqt0.u(rwq.q(new ppk(upb0Var, (byte) 4))), upb0Var, (byte) 2)});
                        qv7 qv7Var = new qv7(iu30Var, (byte) 15);
                        this.b = true;
                        if (kgeVarD.collect(qv7Var, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qpk(upb0 upb0Var, String str, iu30 iu30Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = upb0Var;
        this.c = str;
        this.e = iu30Var;
    }
}
