package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bdx extends hab0 implements vu30 {
    public final /* synthetic */ j2i X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ short Z;
    public final /* synthetic */ gbx a;
    public final /* synthetic */ yf b;
    public final /* synthetic */ max c;
    public final /* synthetic */ gdx d;
    public final /* synthetic */ vzq0 e;
    public final /* synthetic */ idn0 f;
    public final /* synthetic */ ga80 g;
    public final /* synthetic */ qim0 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ eix t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public bdx(gbx gbxVar, yf yfVar, max maxVar, gdx gdxVar, vzq0 vzq0Var, idn0 idn0Var, ga80 ga80Var, qim0 qim0Var, boolean z, eix eixVar, j2i j2iVar, int i, int i2) {
        super(2);
        this.a = gbxVar;
        this.b = yfVar;
        this.c = maxVar;
        this.d = gdxVar;
        this.e = vzq0Var;
        this.f = idn0Var;
        this.g = ga80Var;
        this.h = qim0Var;
        this.i = z;
        this.t = eixVar;
        this.X = j2iVar;
        this.Y = i;
        this.Z = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.Y | 1);
        short s = this.Z;
        boo1.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, (b0k) obj, iP, s);
        return rih1.a;
    }
}
