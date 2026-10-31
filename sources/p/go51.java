package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class go51 extends a8d1 implements iu30 {
    public boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ jo51 d;
    public final /* synthetic */ mhg1 e;
    public final /* synthetic */ float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go51(Object obj, Object obj2, jo51 jo51Var, mhg1 mhg1Var, float f, lnm lnmVar) {
        super(1, lnmVar);
        this.b = obj;
        this.c = obj2;
        this.d = jo51Var;
        this.e = mhg1Var;
        this.f = f;
    }

    public final lnm create(lnm lnmVar) {
        return new go51(this.b, this.c, this.d, this.e, this.f, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            fo51 fo51Var = new fo51(this.b, this.c, this.d, this.e, this.f, null);
            this.a = true;
            Object objS = smo1.s(fo51Var, this);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
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
