package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class u5j0 extends hab0 implements vu30 {
    public final /* synthetic */ int N0;
    public final /* synthetic */ iu30 X;
    public final /* synthetic */ uk21 Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ float a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ c380 f;
    public final /* synthetic */ oa0 g;
    public final /* synthetic */ u201 h;
    public final /* synthetic */ iu30 i;
    public final /* synthetic */ c380 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5j0(float f, boolean z, float f2, String str, boolean z2, c380 c380Var, oa0 oa0Var, u201 u201Var, iu30 iu30Var, c380 c380Var2, iu30 iu30Var2, uk21 uk21Var, int i, int i2) {
        super(2);
        this.a = f;
        this.b = z;
        this.c = f2;
        this.d = str;
        this.e = z2;
        this.f = c380Var;
        this.g = oa0Var;
        this.h = u201Var;
        this.i = iu30Var;
        this.t = c380Var2;
        this.X = iu30Var2;
        this.Y = uk21Var;
        this.Z = i;
        this.N0 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.Z | 1);
        int iP2 = czo1.p(this.N0);
        gxo1.e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, (b0k) obj, iP, iP2);
        return rih1.a;
    }
}
