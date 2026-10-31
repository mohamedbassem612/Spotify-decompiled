package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class htw extends a8d1 implements vu30 {
    public final /* synthetic */ ven0 X;
    public boolean a;
    public final /* synthetic */ tob1 b;
    public final /* synthetic */ q811 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ px20 f;
    public final /* synthetic */ q811 g;
    public final /* synthetic */ iu30 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ ven0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htw(tob1 tob1Var, q811 q811Var, String str, String str2, px20 px20Var, q811 q811Var2, iu30 iu30Var, int i, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.b = tob1Var;
        this.c = q811Var;
        this.d = str;
        this.e = str2;
        this.f = px20Var;
        this.g = q811Var2;
        this.h = iu30Var;
        this.i = i;
        this.t = ven0Var;
        this.X = ven0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new htw(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            m441 m441VarQ = rwq.q(new bu2(this.b, (byte) 4));
            glu gluVar = new glu(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X);
            this.a = true;
            Object objCollect = m441VarQ.collect(gluVar, this);
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
