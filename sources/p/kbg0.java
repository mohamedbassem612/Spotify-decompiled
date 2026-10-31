package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kbg0 extends hab0 implements iu30 {
    public final /* synthetic */ oyr0 N0;
    public final /* synthetic */ k1k1 O0;
    public final /* synthetic */ u7j0 P0;
    public final /* synthetic */ lhd0 Q0;
    public final /* synthetic */ b0v0 R0;
    public final /* synthetic */ oex0 S0;
    public final /* synthetic */ kjn0 T0;
    public final /* synthetic */ j6r U0;
    public final /* synthetic */ fx V0;
    public final /* synthetic */ gw3 W0;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ x4g0 X0;
    public final /* synthetic */ tr00 Y;
    public final /* synthetic */ a81 Y0;
    public final /* synthetic */ mij1 Z;
    public final /* synthetic */ o921 Z0;
    public final /* synthetic */ hdg0 a;
    public final /* synthetic */ k6t a1;
    public final /* synthetic */ long b;
    public final /* synthetic */ c0c1 b1;
    public final /* synthetic */ float c;
    public final /* synthetic */ tob1 c1;
    public final /* synthetic */ lb9 d;
    public final /* synthetic */ tob1 d1;
    public final /* synthetic */ g2f0 e;
    public final /* synthetic */ ca50 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ ti51 h;
    public final /* synthetic */ fa50 i;
    public final /* synthetic */ lfs0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbg0(hdg0 hdg0Var, long j, float f, lb9 lb9Var, g2f0 g2f0Var, ca50 ca50Var, boolean z, ti51 ti51Var, fa50 fa50Var, lfs0 lfs0Var, boolean z2, tr00 tr00Var, mij1 mij1Var, oyr0 oyr0Var, k1k1 k1k1Var, u7j0 u7j0Var, lhd0 lhd0Var, b0v0 b0v0Var, oex0 oex0Var, kjn0 kjn0Var, j6r j6rVar, fx fxVar, gw3 gw3Var, x4g0 x4g0Var, a81 a81Var, o921 o921Var, k6t k6tVar, c0c1 c0c1Var, tob1 tob1Var, tob1 tob1Var2) {
        super(1);
        this.a = hdg0Var;
        this.b = j;
        this.c = f;
        this.d = lb9Var;
        this.e = g2f0Var;
        this.f = ca50Var;
        this.g = z;
        this.h = ti51Var;
        this.i = fa50Var;
        this.t = lfs0Var;
        this.X = z2;
        this.Y = tr00Var;
        this.Z = mij1Var;
        this.N0 = oyr0Var;
        this.O0 = k1k1Var;
        this.P0 = u7j0Var;
        this.Q0 = lhd0Var;
        this.R0 = b0v0Var;
        this.S0 = oex0Var;
        this.T0 = kjn0Var;
        this.U0 = j6rVar;
        this.V0 = fxVar;
        this.W0 = gw3Var;
        this.X0 = x4g0Var;
        this.Y0 = a81Var;
        this.Z0 = o921Var;
        this.a1 = k6tVar;
        this.b1 = c0c1Var;
        this.c1 = tob1Var;
        this.d1 = tob1Var2;
    }

    public final Object invoke(Object obj) {
        rtb0 rtb0Var = (rtb0) obj;
        long j = this.b;
        float f = this.c;
        boolean z = this.g;
        hdg0 hdg0Var = this.a;
        rtb0.c(rtb0Var, "headerElements", new j2i(-1330086152, new y9g0(j, f, z, hdg0Var, this.f, this.d, this.e, (byte) 1), true), 2);
        e850 e850Var = hdg0Var.l;
        boolean z2 = ((Boolean) this.c1.getValue()).booleanValue() && hdg0Var.m > 0;
        boolean z3 = this.g && e850Var != null;
        boolean z4 = this.X && e850Var != null;
        ti51 ti51Var = this.h;
        if (z2 || z3 || z4) {
            rtb0.c(rtb0Var, "pendingNotificationsSectionHeader", new j2i(674028423, new w9g0(ti51Var, (byte) 6), true), 2);
            fa50 fa50Var = this.i;
            if (z3) {
                rtb0.c(rtb0Var, "graduationRequestNotificationBanner", new j2i(-1877596171, new nbg0(fa50Var, hdg0Var, (byte) 0), true), 2);
            }
            if (z4) {
                rtb0.c(rtb0Var, "teenGraduationBanner", new j2i(1945373716, new nbg0(fa50Var, hdg0Var, (byte) 1), true), 2);
            }
            if (z2) {
                rtb0.c(rtb0Var, "pendingAllowlistRequestsBanner", new j2i(1473376307, new x9g0(this.t, hdg0Var, (byte) 18), true), 2);
            }
        }
        boolean zBooleanValue = ((Boolean) this.d1.getValue()).booleanValue();
        r7g0 r7g0Var = hdg0Var.f10p;
        i9t0 i9t0Var = hdg0Var.k;
        if (r7g0Var != null) {
            rtb0.c(rtb0Var, "managePlaybackSectionHeader", new j2i(-221641342, new w9g0(ti51Var, (byte) 4), true), 2);
            if (r7g0Var.b != null) {
                rtb0.c(rtb0Var, "explicitContent", new j2i(887669255, new x9g0(this.Y, hdg0Var, (byte) 14), true), 2);
            }
            if (r7g0Var.c != null) {
                rtb0.c(rtb0Var, "videoContent", new j2i(272021744, new x9g0(this.Z, hdg0Var, (byte) 15), true), 2);
            }
            j7g0 j7g0Var = r7g0Var.a;
            if (j7g0Var != null) {
                rtb0.c(rtb0Var, "parentalHub", new j2i(196183183, new tf(this.N0, hdg0Var, zBooleanValue, j7g0Var, (byte) 19), true), 2);
            }
            if (r7g0Var.d) {
                rtb0.c(rtb0Var, "videoSettingsRow", new j2i(120344622, new x9g0(this.O0, hdg0Var, (byte) 16), true), 2);
            }
            rtb0.c(rtb0Var, "managePlaybackDivider", zyi.d, 2);
        }
        s7g0 s7g0Var = hdg0Var.q;
        if (s7g0Var != null) {
            rtb0.c(rtb0Var, "manageSocialSectionHeader", new j2i(1943432350, new w9g0(ti51Var, (byte) 5), true), 2);
            Boolean bool = s7g0Var.c;
            if (bool != null) {
                rtb0.c(rtb0Var, "manageSocialMessages", new j2i(1797008571, new zw2(this.P0, bool.booleanValue(), (byte) 14), true), 2);
            }
            Boolean bool2 = s7g0Var.d;
            if (bool2 != null) {
                rtb0.c(rtb0Var, "manageSocialListeningActivity", new j2i(1707623780, new zw2(this.Q0, bool2.booleanValue(), (byte) 15), true), 2);
            }
            Boolean bool3 = s7g0Var.a;
            if (bool3 != null) {
                rtb0.c(rtb0Var, "manageSocialPlaylistsPublicByDefault", new j2i(253298499, new zw2(this.R0, bool3.booleanValue(), (byte) 16), true), 2);
                rtb0.c(rtb0Var, "manageSocialPlaylistsPublicByDefaultFooter", zyi.b, 2);
            }
            if (s7g0Var.b != null) {
                rtb0.c(rtb0Var, "profileVisibility", new j2i(-1547505181, new x9g0(this.S0, hdg0Var, (byte) 17), true), 2);
            }
            rtb0.c(rtb0Var, "manageSocialDivider", zyi.c, 2);
        }
        rtb0.c(rtb0Var, "accountSectionHeader", new j2i(1137842789, new w9g0(ti51Var, (byte) 3), true), 2);
        rtb0.c(rtb0Var, "name", new j2i(735911566, new x9g0(this.T0, hdg0Var, (byte) 8), true), 2);
        if (hdg0Var.i != null) {
            rtb0.c(rtb0Var, "birthday", new j2i(-2047813910, new x9g0(this.U0, hdg0Var, (byte) 9), true), 2);
        }
        rtb0.c(rtb0Var, "accountType", new j2i(660073005, new x9g0(this.V0, hdg0Var, (byte) 10), true), 2);
        if (i9t0Var != null) {
            rtb0.c(rtb0Var, "planType", new j2i(1631505875, new otf0(hdg0Var, (byte) 7), true), 2);
        }
        if (!hdg0Var.r.isEmpty()) {
            rtb0.c(rtb0Var, "addOns", new j2i(1555667314, new x9g0(this.W0, hdg0Var, (byte) 11), true), 2);
        }
        if (hdg0Var.s) {
            rtb0.c(rtb0Var, "manageAudiobookListening", new j2i(1479828753, new otf0(this.X0, (byte) 8), true), 2);
        }
        rtb0.c(rtb0Var, "accountDetailsDivider", zyi.e, 2);
        if (i9t0Var != null) {
            nn1 nn1Var = i9t0Var.c;
            if (nn1Var != null && nn1Var.a != 1) {
                rtb0.c(rtb0Var, "addAccountRowElement", new j2i(-688207525, new iwf0(this.Y0, hdg0Var, nn1Var, (byte) 8), true), 2);
            }
            z721 z721Var = i9t0Var.b;
            if (z721Var != null) {
                rtb0.c(rtb0Var, "removeAccountRowElement", new j2i(1461751492, new x9g0(this.Z0, z721Var, (byte) 12), true), 2);
            }
        }
        l6t l6tVar = hdg0Var.n;
        if (l6tVar != null && l6tVar.a != 1) {
            rtb0.c(rtb0Var, "deleteAccountRowElement", new j2i(-1903747841, new x9g0(this.a1, hdg0Var, (byte) 13), true), 2);
        }
        int i = hdg0Var.o;
        if (i != 0) {
            rtb0.c(rtb0Var, "stopManagingRowElement", new j2i(1824307422, new zo7(this.b1, hdg0Var, i, (byte) 5), true), 2);
        }
        return rih1.a;
    }
}
