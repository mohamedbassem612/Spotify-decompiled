package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ihd extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ b3p0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ r261 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihd(b3p0 b3p0Var, Object obj, r261 r261Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = b3p0Var;
        this.c = obj;
        this.d = r261Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new ihd(this.b, this.c, this.d, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            this.a = true;
            Object objA = this.b.a(this.c, this.d, this);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
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
