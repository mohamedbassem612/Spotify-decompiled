package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class at41 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ bt41 b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at41(bt41 bt41Var, long j, lnm lnmVar) {
        super(2, lnmVar);
        this.b = bt41Var;
        this.c = j;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new at41(this.b, this.c, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            du41 du41Var = this.b.r1;
            yeo0 yeo0Var = new yeo0(this.c, (lnm) null);
            this.a = true;
            Object objG = du41Var.g(hfn0.b, yeo0Var, this);
            d9n d9nVar = d9n.a;
            if (objG == d9nVar) {
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
    }
}
