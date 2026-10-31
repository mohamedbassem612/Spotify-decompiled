package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z160 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ pbq b;
    public final /* synthetic */ tob1 c;
    public final /* synthetic */ b8f1 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ tob1 g;
    public final /* synthetic */ drr0 h;
    public final /* synthetic */ hdn0 i;
    public final /* synthetic */ wen0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z160(pbq pbqVar, tob1 tob1Var, b8f1 b8f1Var, float f, float f2, tob1 tob1Var2, drr0 drr0Var, hdn0 hdn0Var, wen0 wen0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = pbqVar;
        this.c = tob1Var;
        this.d = b8f1Var;
        this.e = f;
        this.f = f2;
        this.g = tob1Var2;
        this.h = drr0Var;
        this.i = hdn0Var;
        this.t = wen0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new z160(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            m441 m441VarQ = rwq.q(new b3c(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i));
            zx8 zx8Var = new zx8(this.t, (byte) 1);
            this.a = true;
            Object objCollect = m441VarQ.collect(zx8Var, this);
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
