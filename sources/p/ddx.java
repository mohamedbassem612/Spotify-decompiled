package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ddx extends hab0 implements vu30 {
    public final /* synthetic */ short N0;
    public final /* synthetic */ vu30 X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ gbx a;
    public final /* synthetic */ yf b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ max d;
    public final /* synthetic */ gdx e;
    public final /* synthetic */ vzq0 f;
    public final /* synthetic */ idn0 g;
    public final /* synthetic */ ga80 h;
    public final /* synthetic */ vu30 i;
    public final /* synthetic */ vu30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ddx(gbx gbxVar, yf yfVar, qim0 qim0Var, max maxVar, gdx gdxVar, vzq0 vzq0Var, idn0 idn0Var, ga80 ga80Var, vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3, int i, int i2, int i3) {
        super(2);
        this.a = gbxVar;
        this.b = yfVar;
        this.c = qim0Var;
        this.d = maxVar;
        this.e = gdxVar;
        this.f = vzq0Var;
        this.g = idn0Var;
        this.h = ga80Var;
        this.i = vu30Var;
        this.t = vu30Var2;
        this.X = vu30Var3;
        this.Y = i;
        this.Z = i2;
        this.N0 = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.Y | 1);
        int iP2 = czo1.p(this.Z);
        short s = this.N0;
        foo1.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, (b0k) obj, iP, iP2, s);
        return rih1.a;
    }
}
