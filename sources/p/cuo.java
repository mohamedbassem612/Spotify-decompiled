package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cuo extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ o8n b;
    public final /* synthetic */ en31 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ iu30 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuo(o8n o8nVar, en31 en31Var, boolean z, boolean z2, iu30 iu30Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = o8nVar;
        this.c = en31Var;
        this.d = z;
        this.e = z2;
        this.f = iu30Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new cuo(this.b, this.c, this.d, this.e, this.f, lnmVar);
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
        buo buoVar = new buo(null, this.f, this.c, this.d, this.e);
        this.a = true;
        Object objH = c921.H(this.b, buoVar, this);
        d9n d9nVar = d9n.a;
        return objH == d9nVar ? d9nVar : objH;
    }
}
