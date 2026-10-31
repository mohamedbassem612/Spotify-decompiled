package p;

import android.os.Bundle;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jow0 implements yr61 {
    public final efr a;
    public final p1f0 b;
    public final wp20 c;
    public final l0x0 d;
    public final tym0 e;
    public final h9n f;

    public jow0(efr efrVar, p1f0 p1f0Var, wp20 wp20Var, l0x0 l0x0Var, tym0 tym0Var, h9n h9nVar, ubc ubcVar) {
        this.a = efrVar;
        this.b = p1f0Var;
        this.c = wp20Var;
        this.d = l0x0Var;
        this.e = tym0Var;
        this.f = h9nVar;
    }

    @Override // p.yr61
    public final xr61 create() {
        l9d0 l9d0Var = l9d0.d;
        pox poxVar = pox.c;
        jx21 jx21Var = new jx21(2131962101);
        znx znxVar = znx.c;
        wp20 wp20Var = this.c;
        jgb1 jgb1VarA = ((njm0) wp20Var.a).a();
        l0x0 l0x0Var = (l0x0) wp20Var.b;
        cg60 cg60Var = new cg60(((jed0) l0x0Var.d).d(), (byte) 6);
        c0g.x.getClass();
        cxo1 cxo1Var = cxo1.P0;
        xt61 xt61Var = new xt61(znxVar, 2131962159, null, null, mqo1.s(new sq61[]{jgb1VarA, new jgb1("publishListeningActivity", 2131961952, null, 2131961951, null, null, null, cg60Var, cxo1Var, jmo1.e(new mr20[]{((lag) l0x0Var.c).h(), new x3s(new h5y0(((b7n) l0x0Var.b).a(r6n.a), (byte) 4), (byte) 24)}), new ibd1(new xad1(41, false), new dbd1(ucy0.Y, null, 14)), null, 69562), ((s880) wp20Var.c).g(), ((fad0) wp20Var.d).c(), ((dr41) wp20Var.e).i()}), 249);
        xt61 xt61Var2 = new xt61(poxVar, 2131962170, null, null, mqo1.s(new sq61[]{new jgb1("listPrivacy", 2131962001, null, 2131961998, null, 2131962000, null, null, cxo1Var, new pzs(new mnc0(((ov20) ((eb80) this.e.b).b).a("lock-playlists-public-by-default-disabled", false), (byte) 7), 2131961999, (byte) 19), new ibd1(new xad1(28, false), new dbd1(puc0.c1, null, 8)), null, 73146), new jgb1("publishToProfile", 2131962006, null, 2131962004, null, 2131962005, null, null, cxo1Var, null, new ibd1(new xad1(40, false), new dbd1(ucy0.Z, null, 14)), null, 89530), new jgb1("managePlaylistsPrivacy", 2131961884, null, 2131961883, null, null, null, null, cxo1Var, null, new qxn0(new jxn0(41, false), new nxn0("spotify:internal:playlists:edit-privacy", (Bundle) null)), null, 90042)}), 249);
        l0x0 l0x0Var2 = this.d;
        jgb1 jgb1VarB = ((zgz0) l0x0Var2.c).b();
        jgb1 jgb1VarB2 = ((nl51) l0x0Var2.d).b();
        ic9 ic9Var = (ic9) l0x0Var2.b;
        xt61 xt61Var3 = new xt61(poxVar, 2131962171, null, null, mqo1.s(new sq61[]{jgb1VarB, jgb1VarB2, new jgb1("blockedUsersList", 2131961744, null, 2131961743, null, null, null, null, cxo1Var, null, new qxn0(new jxn0(14, false), new mxn0(false, new dt0(ic9Var, (lnm) null, (byte) 16), new vd2(ic9Var, (lnm) null, (byte) 4))), null, 90042)}), 249);
        rnx rnxVar = rnx.c;
        p1f0 p1f0Var = this.b;
        hce1 hce1Var = (hce1) p1f0Var.h;
        jed0 jed0Var = (jed0) hce1Var.d;
        jgb1 jgb1Var = new jgb1("viewOthersListeningActivity", 2131963816, null, 2131963815, null, null, null, ((hgd0) hce1Var.c).r() ? new jdk1(new mnc0(jed0Var.a(l9d0Var), (byte) 15), (byte) 0) : new huz(Boolean.FALSE, (byte) 10), cxo1Var, new jdk1(new mnc0(jed0Var.a(l9d0Var), (byte) 15), (byte) 1), new ibd1(new xad1(53, false), new dbd1(eak1.t, new g2j1(hce1Var, (byte) 20), 4)), Collections.singletonMap("viewOthersListeningActivityToggleOff", new tak1(hce1Var, (byte) 5)), 4026);
        aod aodVar = (aod) p1f0Var.f;
        jgb1 jgb1Var2 = new jgb1("chatFeature", 2131953404, null, 2131953403, null, null, null, ((kbd) aodVar.b).a(), cxo1Var, new pzs(new nwd(((ov20) aodVar.c).a("lock-messages-disabled", false), (byte) 3), 2131960368, (byte) 19), new ibd1(new xad1(7, false), new ebd1(nve.g, nve.h, eqe.e)), null, 69562);
        vi11 vi11Var = (vi11) p1f0Var.e;
        jgb1 jgb1Var3 = new jgb1("chatFeatureShowSuggestions", 2131953424, null, 2131953423, null, null, null, ((kbd) vi11Var.c).a(), cxo1Var, ((oj40) vi11Var.e).a(), new ibd1(new xad1(11, false), new ebd1(rz71.d1, rz71.e1, ea71.d1, new k681(vi11Var, (byte) 3))), Collections.singletonMap("showSuggestions", new d781(vi11Var, (byte) 2)), 4026);
        e821 e821Var = (e821) p1f0Var.g;
        jgb1 jgb1Var4 = new jgb1("chatFeatureShowUpInSuggestions", 2131953429, null, 2131953428, null, null, null, ((kbd) e821Var.a).a(), cxo1Var, ((oj40) e821Var.d).a(), new ibd1(new xad1(12, false), new ebd1(oa81.e, oa81.f, ea71.e1, new k681(e821Var, (byte) 4))), Collections.singletonMap("showUpInSuggestions", new d781(e821Var, (byte) 3)), 4026);
        c8u0 c8u0Var = (c8u0) p1f0Var.b;
        jgb1 jgb1Var5 = new jgb1("chatFeatureSeenReceipts", 2131953419, null, 2131953418, null, null, null, new zo51(c8u0Var.b.a(), c8u0Var, (byte) 0), cxo1Var, c8u0Var.d.a(), new ibd1(new xad1(10, false), new gbd1(c8u0Var.c.c(), new u451(c8u0Var, (byte) 8))), Collections.singletonMap("disableSeenReceipts", new mn41(c8u0Var, (byte) 17)), 4026);
        c8u0 c8u0Var2 = (c8u0) p1f0Var.d;
        jgb1 jgb1Var6 = new jgb1("chatFeaturePlayedReceipts", 2131953409, null, 2131953408, null, null, null, new m9r0(c8u0Var2.b.a(), c8u0Var2, (byte) 11), cxo1Var, c8u0Var2.d.a(), new ibd1(new xad1(8, false), new gbd1(c8u0Var2.c.a(), new dvt0(c8u0Var2, (byte) 1))), Collections.singletonMap("disablePlayedReceipts", new n5u0(c8u0Var2, (byte) 3)), 4026);
        e821 e821Var2 = (e821) p1f0Var.c;
        jgb1 jgb1Var7 = new jgb1("chatFeatureSavedReceipts", 2131953414, null, 2131953413, null, null, null, new f5y0(((kbd) e821Var2.a).a(), e821Var2, (byte) 28), cxo1Var, ((spu) e821Var2.d).a(), new ibd1(new xad1(9, false), new gbd1(((zuw0) e821Var2.c).b(), new lw11(e821Var2, (byte) 23))), Collections.singletonMap("disableSavedReceipts", new zw11(e821Var2, (byte) 25)), 4026);
        haa0 haa0Var = (haa0) p1f0Var.a;
        mr20 mr20Var = ((v4o0) haa0Var.c).g;
        xt61 xt61Var4 = new xt61(rnxVar, 2131962172, null, null, mqo1.s(new sq61[]{jgb1Var, jgb1Var2, jgb1Var3, jgb1Var4, jgb1Var5, jgb1Var6, jgb1Var7, new jgb1("joinNearby", 2131962082, null, 2131962081, null, null, null, new gda0(mr20Var, haa0Var, (byte) 0), cxo1Var, null, new m70(null, new gda0(mr20Var, haa0Var, (byte) 1), new j70(), new vm0(haa0Var, (lnm) null, (byte) 18), 3), null, 85946)}), 249);
        smx smxVar = smx.c;
        mr20 mr20VarA = ((spu) this.a.b).a.a("dj-voice-data-collection-eligibility", false);
        xad1 xad1Var = new xad1(18, false);
        jd11 jd11Var = rc11.a;
        xt61 xt61Var5 = new xt61(smxVar, 2131962151, null, null, mqo1.s(new sq61[]{new jgb1("djVoiceImprovements", 2131961815, null, 2131961814, null, null, null, mr20VarA, cxo1Var, null, new ibd1(xad1Var, new abd1(jd11Var.b(qmk1.class))), null, 85946)}), 249);
        dmx dmxVar = dmx.c;
        mxr mxrVar = (mxr) this.f.b;
        return new xr61((hux) poxVar, jx21Var, p7h.M(new xt61[]{xt61Var, xt61Var2, xt61Var3, xt61Var4, xt61Var5, new xt61(dmxVar, 2131962149, null, null, mqo1.s(new sq61[]{new jgb1("deviceLocationConsent", 2131961809, null, 2131961808, null, null, null, (qbk) ((lls0) mxrVar.a).c, pbo1.N0, ((pcl) mxrVar.c).a(), new ibd1(new yad1(fih1.e), new abd1(jd11Var.b(grt.class), new oat(mxrVar, (byte) 3))), null, 69562)}), 249)}), Collections.singletonList(new lq61("privacySettingsWeb", null, null, cxo1Var, 2131961947, mqo1.s(new jq61[]{new jq61(2131961946, "https://www.spotify.com/account/privacy/")}), new gq61(), 14)), 4);
    }
}
