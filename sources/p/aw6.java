package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class aw6 extends hab0 implements iu30 {
    public final /* synthetic */ qy71 N0;
    public final /* synthetic */ qy71 O0;
    public final /* synthetic */ iw11 X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ tob1 Z;
    public final /* synthetic */ su6 a;
    public final /* synthetic */ q1d0 b;
    public final /* synthetic */ em0 c;
    public final /* synthetic */ tob1 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ lik1 g;
    public final /* synthetic */ iac0 h;
    public final /* synthetic */ mw6 i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw6(su6 su6Var, q1d0 q1d0Var, em0 em0Var, tob1 tob1Var, boolean z, boolean z2, lik1 lik1Var, iac0 iac0Var, mw6 mw6Var, String str, iw11 iw11Var, String str2, ven0 ven0Var, qy71 qy71Var, qy71 qy71Var2) {
        super(1);
        this.a = su6Var;
        this.b = q1d0Var;
        this.c = em0Var;
        this.d = tob1Var;
        this.e = z;
        this.f = z2;
        this.g = lik1Var;
        this.h = iac0Var;
        this.i = mw6Var;
        this.t = str;
        this.X = iw11Var;
        this.Y = str2;
        this.Z = ven0Var;
        this.N0 = qy71Var;
        this.O0 = qy71Var2;
    }

    public final Object invoke(Object obj) {
        rtb0 rtb0Var = (rtb0) obj;
        em0 em0Var = this.c;
        su6 su6Var = this.a;
        rtb0.f(rtb0Var, "toolbar", new j2i(-528732648, new gk0(em0Var, su6Var, this.d, (byte) 2), true), 2);
        rtb0.c(rtb0Var, "header", new j2i(-1620407900, new zv6(this.a, this.e, em0Var, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0), true), 2);
        if (su6Var.k == 2 && su6Var.d == 0) {
            rtb0.c(rtb0Var, "empty-state", new j2i(-959130263, new ub3(em0Var, (byte) 15), true), 2);
        }
        jyo1.l(rtb0Var, this.b);
        return rih1.a;
    }
}
