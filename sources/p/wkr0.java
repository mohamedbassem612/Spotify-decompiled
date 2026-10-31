package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wkr0 extends a8d1 implements vu30 {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ e6s c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ xkr0 f;
    public final /* synthetic */ bpb1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkr0(e6s e6sVar, lnm lnmVar, long j, int i, xkr0 xkr0Var, bpb1 bpb1Var) {
        super(2, lnmVar);
        this.c = e6sVar;
        this.d = j;
        this.e = i;
        this.f = xkr0Var;
        this.g = bpb1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        wkr0 wkr0Var = new wkr0(this.c, lnmVar, this.d, this.e, this.f, this.g);
        wkr0Var.b = obj;
        return wkr0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        vr20 vr20Var = (vr20) this.b;
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            vkr0 vkr0Var = new vkr0(vr20Var, this.d, this.e, this.f, this.g);
            this.b = null;
            this.a = true;
            Object objCollect = this.c.collect(vkr0Var, this);
            d9n d9nVar = d9n.a;
            if (objCollect == d9nVar) {
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
