package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes14.dex */
public final class fq extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ s2t b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq(s2t s2tVar, lnm lnmVar) {
        super(2, lnmVar);
        this.b = s2tVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new fq(this.b, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (z) {
            if (z) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        this.a = true;
        Object objQ = this.b.Q(this);
        d9n d9nVar = d9n.a;
        return objQ == d9nVar ? d9nVar : objQ;
    }
}
