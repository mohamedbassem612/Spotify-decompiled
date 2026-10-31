package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hjx extends hab0 implements vu30 {
    public final /* synthetic */ int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ short Z;
    public final /* synthetic */ gbx a;
    public final /* synthetic */ yf b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ max d;
    public final /* synthetic */ gdx e;
    public final /* synthetic */ vzq0 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ idn0 h;
    public final /* synthetic */ ga80 i;
    public final /* synthetic */ vu30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hjx(gbx gbxVar, yf yfVar, qim0 qim0Var, max maxVar, gdx gdxVar, vzq0 vzq0Var, boolean z, idn0 idn0Var, ga80 ga80Var, vu30 vu30Var, int i, int i2, int i3) {
        super(2);
        this.a = gbxVar;
        this.b = yfVar;
        this.c = qim0Var;
        this.d = maxVar;
        this.e = gdxVar;
        this.f = vzq0Var;
        this.g = z;
        this.h = idn0Var;
        this.i = ga80Var;
        this.t = vu30Var;
        this.X = i;
        this.Y = i2;
        this.Z = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.X | 1);
        int iP2 = czo1.p(this.Y);
        short s = this.Z;
        wro1.h(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, (b0k) obj, iP, iP2, s);
        return rih1.a;
    }
}
