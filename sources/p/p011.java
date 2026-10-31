package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p011 extends hab0 implements vu30 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ kee1 Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ c380 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ float f;
    public final /* synthetic */ mp10 g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p011(float f, float f2, nf50 nf50Var, int i, int i2, c380 c380Var, float f3, boolean z, float f4, mp10 mp10Var, String str, String str2, String str3, boolean z2, kee1 kee1Var, boolean z3) {
        super(2);
        this.a = i;
        this.b = i2;
        this.c = c380Var;
        this.d = f3;
        this.e = z;
        this.f = f4;
        this.g = mp10Var;
        this.h = str;
        this.i = str2;
        this.t = str3;
        this.X = z2;
        this.Y = kee1Var;
        this.Z = z3;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            gt40 gt40VarJ = dm5.J(et40.a);
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = zx01.Z0;
                x340Var2.s0(objT);
            }
            eqr0.a(iko1.x(gt40VarJ, (iu30) objT), 0, 1, apo.r(-1896080749, new o011(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z), x340Var2), x340Var2, 3072, 2);
            x340Var2.i0(335731545);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
