package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s9g0 extends hab0 implements iu30 {
    public final /* synthetic */ oyr0 N0;
    public final /* synthetic */ kjn0 O0;
    public final /* synthetic */ j6r P0;
    public final /* synthetic */ fx Q0;
    public final /* synthetic */ a81 R0;
    public final /* synthetic */ o921 S0;
    public final /* synthetic */ k6t T0;
    public final /* synthetic */ tob1 U0;
    public final /* synthetic */ tob1 V0;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ tr00 Y;
    public final /* synthetic */ mij1 Z;
    public final /* synthetic */ xag0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ lb9 d;
    public final /* synthetic */ g2f0 e;
    public final /* synthetic */ ca50 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ ti51 h;
    public final /* synthetic */ lfs0 i;
    public final /* synthetic */ fa50 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9g0(xag0 xag0Var, long j, float f, lb9 lb9Var, g2f0 g2f0Var, ca50 ca50Var, boolean z, ti51 ti51Var, lfs0 lfs0Var, fa50 fa50Var, boolean z2, tr00 tr00Var, mij1 mij1Var, oyr0 oyr0Var, kjn0 kjn0Var, j6r j6rVar, fx fxVar, a81 a81Var, o921 o921Var, k6t k6tVar, tob1 tob1Var, tob1 tob1Var2) {
        super(1);
        this.a = xag0Var;
        this.b = j;
        this.c = f;
        this.d = lb9Var;
        this.e = g2f0Var;
        this.f = ca50Var;
        this.g = z;
        this.h = ti51Var;
        this.i = lfs0Var;
        this.t = fa50Var;
        this.X = z2;
        this.Y = tr00Var;
        this.Z = mij1Var;
        this.N0 = oyr0Var;
        this.O0 = kjn0Var;
        this.P0 = j6rVar;
        this.Q0 = fxVar;
        this.R0 = a81Var;
        this.S0 = o921Var;
        this.T0 = k6tVar;
        this.U0 = tob1Var;
        this.V0 = tob1Var2;
    }

    public final Object invoke(Object obj) {
        rtb0 rtb0Var = (rtb0) obj;
        long j = this.b;
        float f = this.c;
        boolean z = this.g;
        xag0 xag0Var = this.a;
        y9g0 y9g0Var = new y9g0(j, f, z, xag0Var, this.f, this.d, this.e, (byte) 0);
        byte b = 1;
        byte b2 = 2;
        rtb0.c(rtb0Var, "headerElements", new j2i(633859264, y9g0Var, true), 2);
        ndg0 ndg0Var = xag0Var.h;
        kdg0 kdg0Var = xag0Var.i;
        byte b3 = 0;
        boolean z2 = ((Boolean) this.U0.getValue()).booleanValue() && xag0Var.g > 0;
        boolean z3 = this.g && kdg0Var != null;
        boolean z4 = this.X && kdg0Var != null;
        byte b4 = 7;
        ti51 ti51Var = this.h;
        if (z2 || z3 || z4) {
            rtb0.c(rtb0Var, "pendingNotificationsSectionHeader", new j2i(-1638986897, new w9g0(ti51Var, (byte) 2), true), 2);
            fa50 fa50Var = this.t;
            if (z3) {
                rtb0.c(rtb0Var, "graduationRequestNotificationBanner", new j2i(-1145323811, new z9g0(fa50Var, xag0Var, (byte) 0), true), 2);
            }
            if (z4) {
                rtb0.c(rtb0Var, "teenGraduationBanner", new j2i(-1221162372, new z9g0(fa50Var, xag0Var, (byte) 1), true), 2);
            }
            if (z2) {
                rtb0.c(rtb0Var, "pendingAllowlistRequestsBanner", new j2i(-1297000933, new x9g0(this.i, xag0Var, b4), true), 2);
            }
        }
        boolean zBooleanValue = ((Boolean) this.V0.getValue()).booleanValue();
        odg0 odg0Var = xag0Var.j;
        byte b5 = 6;
        if (ndg0Var != null) {
            rtb0.c(rtb0Var, "playbackSectionHeader", new j2i(88798582, new w9g0(ti51Var, (byte) 1), true), 2);
            rtb0.c(rtb0Var, "explicitContent", new j2i(1752604959, new x9g0((Object) this.Y, (Object) xag0Var, (byte) 5), true), 2);
            rtb0.c(rtb0Var, "videoContent", new j2i(-1883979458, new x9g0(this.Z, xag0Var, b5), true), 2);
            rtb0.c(rtb0Var, "blacklist", new j2i(-1225596579, new o3(this.N0, xag0Var, zBooleanValue, (byte) 27), true), 2);
            rtb0.c(rtb0Var, "parentalControlsDivider", xyi.b, 2);
        }
        rtb0.c(rtb0Var, "accountSectionHeader", new j2i(423917007, new w9g0(ti51Var, (byte) 0), true), 2);
        rtb0.c(rtb0Var, "name", new j2i(-581776122, new x9g0(this.O0, xag0Var, b3), true), 2);
        if (ndg0Var != null) {
            rtb0.c(rtb0Var, "birthday", new j2i(-636418262, new x9g0(this.P0, xag0Var, b), true), 2);
        }
        rtb0.c(rtb0Var, "accountType", new j2i(1233711367, new x9g0(this.Q0, xag0Var, b2), true), 2);
        if (odg0Var != null) {
            rtb0.c(rtb0Var, "planType", new j2i(-1656720479, new otf0(xag0Var, (byte) 6), true), 2);
        }
        rtb0.c(rtb0Var, "accountDetailsDivider", xyi.c, 2);
        if (odg0Var != null) {
            v7g0 v7g0Var = odg0Var.b;
            if (v7g0Var != null && v7g0Var.a != 1) {
                rtb0.c(rtb0Var, "addAccountRowElement", new j2i(854824557, new iwf0(this.R0, xag0Var, v7g0Var, (byte) 7), true), 2);
            }
            if (odg0Var.c != null) {
                rtb0.c(rtb0Var, "removeAccountRowElement", new j2i(-1917557084, new x9g0((Object) this.S0, (Object) xag0Var, (byte) 3), true), 2);
            }
        }
        if (xag0Var.k.a != 1) {
            rtb0.c(rtb0Var, "deleteAccountRowElement", new j2i(455104841, new x9g0((Object) this.T0, (Object) xag0Var, (byte) 4), true), 2);
        }
        return rih1.a;
    }
}
