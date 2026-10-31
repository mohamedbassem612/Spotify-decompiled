package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qwm0 extends hab0 implements iu30 {
    public final /* synthetic */ ven0 X;
    public final /* synthetic */ ven0 Y;
    public final /* synthetic */ m0t Z;
    public final /* synthetic */ q9l1 a;
    public final /* synthetic */ clj1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ b9l1 g;
    public final /* synthetic */ ven0 h;
    public final /* synthetic */ c2u0 i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwm0(q9l1 q9l1Var, clj1 clj1Var, String str, ven0 ven0Var, ven0 ven0Var2, boolean z, b9l1 b9l1Var, ven0 ven0Var3, c2u0 c2u0Var, String str2, ven0 ven0Var4, ven0 ven0Var5, m0t m0tVar) {
        super(1);
        this.a = q9l1Var;
        this.b = clj1Var;
        this.c = str;
        this.d = ven0Var;
        this.e = ven0Var2;
        this.f = z;
        this.g = b9l1Var;
        this.h = ven0Var3;
        this.i = c2u0Var;
        this.t = str2;
        this.X = ven0Var4;
        this.Y = ven0Var5;
        this.Z = m0tVar;
    }

    public final Object invoke(Object obj) {
        abc0 abc0Var = (abc0) obj;
        ven0 ven0Var = this.e;
        q9l1 q9l1Var = this.a;
        clj1 clj1Var = this.b;
        abc0Var.a = new ur1(q9l1Var, clj1Var, this.c, this.d, ven0Var, (lnm) null);
        ven0 ven0Var2 = this.d;
        boolean z = this.f;
        b9l1 b9l1Var = this.g;
        ven0 ven0Var3 = this.e;
        ven0 ven0Var4 = this.h;
        abc0Var.b = new ofk0(z, b9l1Var, ven0Var3, ven0Var4, ven0Var2, (lnm) null);
        abc0Var.c = new m45(this.g, this.e, clj1Var, this.a, this.i, this.t, ven0Var4, this.d, this.X, this.Y, this.Z, (lnm) null);
        abc0Var.d = new q2j0(this.e, (byte) 6);
        return rih1.a;
    }
}
