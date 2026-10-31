package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m5h extends hab0 implements vu30 {
    public final /* synthetic */ boolean N0;
    public final /* synthetic */ vu30 O0;
    public final /* synthetic */ float P0;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ u7h Z;
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String f;
    public final /* synthetic */ c380 g;
    public final /* synthetic */ y0q0 h;
    public final /* synthetic */ qim0 i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m5h(String str, String str2, String str3, boolean z, String str4, c380 c380Var, y0q0 y0q0Var, qim0 qim0Var, boolean z2, boolean z3, boolean z4, u7h u7hVar, boolean z5, vu30 vu30Var, float f, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = str4;
        this.g = c380Var;
        this.h = y0q0Var;
        this.i = qim0Var;
        this.t = z2;
        this.X = z3;
        this.Y = z4;
        this.Z = u7hVar;
        this.N0 = z5;
        this.O0 = vu30Var;
        this.P0 = f;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                float f = this.P0;
                int iP = czo1.p(1);
                o5h.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, f, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                float f2 = this.P0;
                int iP2 = czo1.p(1);
                o5h.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, f2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
