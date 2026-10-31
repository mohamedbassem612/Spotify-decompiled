package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d72 extends a8d1 implements vu30 {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ g72 c;
    public final /* synthetic */ double d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d72(g72 g72Var, double d, lnm lnmVar) {
        super(2, lnmVar);
        this.c = g72Var;
        this.d = d;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        d72 d72Var = new d72(this.c, this.d, lnmVar);
        d72Var.b = obj;
        return d72Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        c9n c9nVar = (c9n) this.b;
        boolean z = this.a;
        try {
            if (!z) {
                hm5.M(obj);
                mwt mwtVarA = g72.a(this.c);
                double d = this.d;
                this.b = c9nVar;
                this.a = true;
                Object objH = c921.H(mwtVarA.b, new lwt(mwtVarA, d, null), this);
                d9n d9nVar = d9n.a;
                if (objH == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (Throwable th) {
            smo1.t(c9nVar);
            th.getMessage();
        }
        return rih1.a;
    }
}
