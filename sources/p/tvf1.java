package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tvf1 extends hab0 implements iu30 {
    public final /* synthetic */ e10 N0;
    public final /* synthetic */ boolean O0;
    public final /* synthetic */ yt11 P0;
    public final /* synthetic */ du11 Q0;
    public final /* synthetic */ vu30 R0;
    public final /* synthetic */ boolean S0;
    public final /* synthetic */ kko T0;
    public final /* synthetic */ String U0;
    public final /* synthetic */ btt0 X;
    public final /* synthetic */ iwt0 Y;
    public final /* synthetic */ e10 Z;
    public final /* synthetic */ uvf1 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ vu30 i;
    public final /* synthetic */ y1c1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tvf1(uvf1 uvf1Var, boolean z, boolean z2, boolean z3, boolean z4, long j, boolean z5, boolean z6, vu30 vu30Var, y1c1 y1c1Var, btt0 btt0Var, iwt0 iwt0Var, e10 e10Var, e10 e10Var2, boolean z7, yt11 yt11Var, du11 du11Var, vu30 vu30Var2, boolean z8, kko kkoVar, String str) {
        super(1);
        this.a = uvf1Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = j;
        this.g = z5;
        this.h = z6;
        this.i = vu30Var;
        this.t = y1c1Var;
        this.X = btt0Var;
        this.Y = iwt0Var;
        this.Z = e10Var;
        this.N0 = e10Var2;
        this.O0 = z7;
        this.P0 = yt11Var;
        this.Q0 = du11Var;
        this.R0 = vu30Var2;
        this.S0 = z8;
        this.T0 = kkoVar;
        this.U0 = str;
    }

    public static final kdn0 a(btt0 btt0Var, String str) {
        return t5p1.j(rqt0.u(btt0Var.a(str)), 3);
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        btt0 btt0Var;
        os11 os11Var = (os11) obj;
        uvf1 uvf1Var = this.a;
        os11Var.r = dem1.U(this.c, this.d, uvf1Var.c.a() && this.b, this.e, this.f, this.g, this.h, this.i);
        os11Var.k = new say0(this.R0, (byte) 6);
        y1c1 y1c1Var = this.t;
        if (y1c1Var != null) {
            os11Var.l = new dmo0(y1c1Var, (byte) 10);
            os11Var.q = true;
        }
        boolean z = this.Y != null;
        ymd0 ymd0Var = (!z || uvf1Var.i == null) ? null : (ymd0) uvf1Var.j.getValue();
        kko kkoVar = this.T0;
        String str = this.U0;
        uvf1 uvf1Var2 = this.a;
        boolean z2 = this.S0;
        btt0 btt0Var2 = this.X;
        os11Var.j = new j6v(uvf1Var2, z2, kkoVar, str, ymd0Var, btt0Var2);
        os11Var.t = new juc1(uvf1Var2, ymd0Var, btt0Var2, (byte) 23);
        e10 e10Var = this.Z;
        if (e10Var != null) {
            os11Var.e = two1.q(br11.W0, e10Var.b, new qvf1(e10Var, (byte) 0));
        }
        e10 e10Var2 = this.N0;
        if (e10Var2 != null) {
            w40 w40Var = new w40(e10Var2.b, new qvf1(e10Var2, (byte) 1));
            os11Var.f = two1.q(br11.X0, w40Var.b(), w40Var.a());
        }
        os11Var.y = 2;
        os11Var.z = this.d ? 2 : 1;
        os11Var.m = kpc1.a;
        os11Var.n = true;
        os11Var.p = this.O0;
        yt11 hkeVar = this.P0;
        if (z) {
            btt0Var = btt0Var2;
            hkeVar = new hke(hkeVar, this.Y, btt0Var2, uvf1Var.b, uvf1Var.g, uvf1Var.h, uvf1Var.i);
        } else {
            btt0Var = btt0Var2;
        }
        os11Var.h = hkeVar;
        os11Var.u = new rvf1(uvf1Var, ymd0Var, btt0Var, (byte) 0);
        os11Var.v = new rvf1(uvf1Var, ymd0Var, btt0Var, (byte) 1);
        os11Var.s = new kf2(uvf1Var, this.g, (byte) 26);
        du11 du11Var = this.Q0;
        if (du11Var != null) {
            os11Var.i = du11Var;
        }
        return rih1.a;
    }
}
