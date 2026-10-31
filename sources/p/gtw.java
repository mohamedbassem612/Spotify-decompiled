package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gtw extends a8d1 implements vu30 {
    public final /* synthetic */ ven0 X;
    public final /* synthetic */ ven0 Y;
    public final /* synthetic */ ven0 Z;
    public boolean a;
    public final /* synthetic */ u601 b;
    public final /* synthetic */ q811 c;
    public final /* synthetic */ px20 d;
    public final /* synthetic */ q811 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ iu30 g;
    public final /* synthetic */ q811 h;
    public final /* synthetic */ ven0 i;
    public final /* synthetic */ ven0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtw(u601 u601Var, q811 q811Var, px20 px20Var, q811 q811Var2, String str, iu30 iu30Var, q811 q811Var3, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, ven0 ven0Var5, lnm lnmVar) {
        super(2, lnmVar);
        this.b = u601Var;
        this.c = q811Var;
        this.d = px20Var;
        this.e = q811Var2;
        this.f = str;
        this.g = iu30Var;
        this.h = q811Var3;
        this.i = ven0Var;
        this.t = ven0Var2;
        this.X = ven0Var3;
        this.Y = ven0Var4;
        this.Z = ven0Var5;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new gtw(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            ftw ftwVar = new ftw(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, (lnm) null);
            this.a = true;
            Object objB = this.b.b(ftwVar, this);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
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
