package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o011 extends hab0 implements xu30 {
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
    public o011(int i, int i2, c380 c380Var, float f, boolean z, float f2, mp10 mp10Var, String str, String str2, String str3, boolean z2, kee1 kee1Var, boolean z3) {
        super(3);
        this.a = i;
        this.b = i2;
        this.c = c380Var;
        this.d = f;
        this.e = z;
        this.f = f2;
        this.g = mp10Var;
        this.h = str;
        this.i = str2;
        this.t = str3;
        this.X = z2;
        this.Y = kee1Var;
        this.Z = z3;
    }

    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean, int] */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        ?? r1 = 0;
        int i = 0;
        while (i < this.a) {
            int i2 = this.b;
            int i3 = i * i2;
            c380 c380Var = this.c;
            int iMin = Math.min(i2 + i3, c380Var.size());
            if (i3 >= c380Var.size()) {
                break;
            }
            et40 et40Var = et40.a;
            if (i > 0) {
                x340 x340Var2 = x340Var;
                x340Var2.i0(1268519445);
                fc11.g(dm5.J(dm5.Q(et40Var, this.d)), x340Var2, (int) r1);
                x340Var2.r((boolean) r1);
            } else {
                x340 x340Var3 = x340Var;
                x340Var3.i0(1268605935);
                x340Var3.r((boolean) r1);
            }
            jch0.f(dm5.J(et40Var), 1, apo.r(1411012621, new n011(i3, iMin, this.e, this.c, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, iMin - i3, this.b), x340Var), x340Var, 3072, 2);
            i++;
            r1 = 0;
        }
        return rih1.a;
    }
}
