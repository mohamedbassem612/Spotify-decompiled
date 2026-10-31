package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qik0 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ es41 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qik0(boolean z, int i, es41 es41Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = z;
        this.c = i;
        this.d = es41Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new qik0(this.b, this.c, this.d, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            if (this.b && (i = this.c) > 0) {
                this.a = true;
                Object objG = es41.g(this.d, i, this);
                d9n d9nVar = d9n.a;
                if (objG == d9nVar) {
                    return d9nVar;
                }
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
