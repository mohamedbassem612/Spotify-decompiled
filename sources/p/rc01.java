package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rc01 extends a8d1 implements vu30 {
    public final /* synthetic */ lee1 N0;
    public final /* synthetic */ int O0;
    public final /* synthetic */ int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ ven0 Z;
    public boolean a;
    public final /* synthetic */ jkr0 b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ hdn0 d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ bw91 f;
    public final /* synthetic */ c9n g;
    public final /* synthetic */ ven0 h;
    public final /* synthetic */ ed01 i;
    public final /* synthetic */ yae1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc01(jkr0 jkr0Var, ven0 ven0Var, hdn0 hdn0Var, ven0 ven0Var2, bw91 bw91Var, c9n c9nVar, ven0 ven0Var3, ed01 ed01Var, yae1 yae1Var, int i, int i2, ven0 ven0Var4, lee1 lee1Var, int i3, lnm lnmVar) {
        super(2, lnmVar);
        this.b = jkr0Var;
        this.c = ven0Var;
        this.d = hdn0Var;
        this.e = ven0Var2;
        this.f = bw91Var;
        this.g = c9nVar;
        this.h = ven0Var3;
        this.i = ed01Var;
        this.t = yae1Var;
        this.X = i;
        this.Y = i2;
        this.Z = ven0Var4;
        this.N0 = lee1Var;
        this.O0 = i3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new rc01(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            jkr0 jkr0Var = this.b;
            ven0 ven0Var = this.c;
            mr20 mr20VarU = rqt0.u(rwq.q(new zkz0(jkr0Var, ven0Var, (byte) 5)));
            qc01 qc01Var = new qc01(this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, ven0Var);
            this.a = true;
            Object objCollect = mr20VarU.collect(qc01Var, this);
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
