package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Flowable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w3 implements yr61 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ w3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // p.yr61
    public final xr61 create() {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                eox eoxVar = eox.c;
                jx21 jx21Var = new jx21(2131962088);
                ilh1 ilh1Var = (ilh1) obj;
                vn8 vn8Var = (vn8) ilh1Var.b;
                uqo uqoVar = new uqo(2131962054, null, null, null, 30);
                c0g.x.getClass();
                pbo1 pbo1Var = pbo1.N0;
                kly0 kly0Var = vn8Var.a;
                tqo.a.getClass();
                sqo sqoVar = rqo.c;
                vqo vqoVar = new vqo("version", uqoVar, pbo1Var, kly0Var, sqoVar);
                ekf0 ekf0Var = (ekf0) ilh1Var.c;
                Flowable flowable = ekf0Var.b;
                vbm[] vbmVarArr = q601.a;
                dy20 dy20Var = new dy20(new kge(flowable), (byte) 23);
                ytw0 ytw0Var = jfv.b;
                xt61 xt61Var = new xt61(eoxVar, null, null, null, mqo1.s(new sq61[]{vqoVar, new vqo("playerRelease", new uqo(2131961941, null, null, null, 30), i6p1.w(dy20Var, fdg1.k0(500, ngv.d), tnt0.Z), pbo1Var, ekf0Var.a, sqoVar)}), 253);
                wj3 wj3Var = (wj3) obj2;
                aru0 aru0Var = (aru0) wj3Var.g;
                jgb1 jgb1Var = new jgb1("privacyPolicy", 2131961945, null, null, null, null, null, null, pbo1Var, null, new qxn0(new jxn0(58, false), new mxn0(true, new l8t0(aru0Var, (lnm) null, (byte) 4), new wd2(aru0Var, (lnm) null, (byte) 7))), null, 90106);
                myq0 myq0Var = (myq0) wj3Var.O0;
                cxo1 cxo1Var = cxo1.P0;
                jgb1 jgb1Var2 = new jgb1("planManagerPrivacyPolicy", 2131961932, null, null, null, null, null, new lt20(new x010(((ov20) myq0Var.b).a("allow-kids-account-selection", false), (mr20) myq0Var.c, new irp0(3, (lnm) null, (byte) 7), (byte) 1), new q8t0(3, (lnm) null, (byte) 0), (byte) 0), cxo1Var, null, new qxn0(new jxn0(52, false), new oxn0("https://www.spotify.com/legal/managed-account-plan-manager-privacy-policy/plain/", false)), null, 86010);
                zhq0 zhq0Var = (zhq0) wj3Var.P0;
                jgb1 jgb1Var3 = new jgb1("parentGuardianPrivacyPolicy", 2131961931, null, null, null, null, null, new lt20(new x010(((ov20) zhq0Var.b).a("allow-kids-account-selection", false), (mr20) zhq0Var.c, new irp0(3, (lnm) null, (byte) 4), (byte) 1), new i440(3, (lnm) null, (byte) 28), (byte) 0), cxo1Var, null, new qxn0(new jxn0(52, false), new oxn0("https://www.spotify.com/legal/managed-account-parent-guardian-privacy-policy/plain/", false)), null, 86010);
                jgb1 jgb1Var4 = new jgb1("dataDownload", 2131961793, null, null, null, null, null, null, new i6b((rjn) wj3Var.e, (byte) 28), null, new qxn0(new jxn0(51, false), new nxn0(nik1.l4, (Bundle) null)), null, 90106);
                jgb1 jgb1Var5 = new jgb1("licenses", 2131961875, null, null, null, null, null, null, cxo1Var, null, new qxn0(new jxn0(35, false), new nxn0("spotify:internal:licenses", (Bundle) null)), null, 90106);
                jgb1 jgb1Var6 = new jgb1("termsAndConditions", 2131962045, null, null, null, null, null, null, cxo1Var, null, new qxn0(new jxn0(68, false), new oxn0(((no5) wj3Var.t).a.getString(2131963149), false)), null, 90106);
                jgb1 jgb1Var7 = new jgb1("platformRules", 2131961940, null, null, null, null, null, null, cxo1Var, null, new qxn0(new jxn0(53, false), new oxn0("https://www.spotify.com/platform-rules/plain", false)), null, 90106);
                ham hamVar = (ham) wj3Var.b;
                jgb1 jgb1Var8 = new jgb1("cookies", 2131961781, null, null, null, null, null, new huz(Boolean.valueOf(((eiq0) hamVar.c).a.b()), (byte) 10), cxo1Var, null, new qxn0(new jxn0(21, false), new mxn0(true, new sg0(1, (lnm) null, (byte) 7), new sv7(hamVar, null, (byte) 1))), null, 86010);
                jgb1 jgb1Var9 = new jgb1("noticeAtCollection", 2131961915, null, null, null, null, null, rqt0.u(new ld2(((spu) wj3Var.i).a.c("country_code", ""), "US", (byte) 14)), cxo1Var, null, new qxn0(new jxn0(44, false), new oxn0("https://www.spotify.com/legal/notice-at-collection/plain", false)), null, 86010);
                jgb1 jgb1Var10 = new jgb1("australiaOnlineSafetyAct", 2131961737, null, null, null, null, null, rqt0.u(new ld2(((ov20) ((yo31) wj3Var.N0).b).c("country_code", ""), "AU", (byte) 14)), pbo1Var, null, new qxn0(new jxn0(13, false), new oxn0("https://www.spotify.com/au/safetyandprivacy/aosa-points-of-contact", false)), null, 86010);
                svh0 svh0Var = (svh0) wj3Var.h;
                jgb1 jgb1Var11 = new jgb1("navigateToReport", 2131961905, null, null, null, null, null, new huz(Boolean.valueOf(!svh0Var.b && ((d35) ((kly0) svh0Var.c).get()).c()), (byte) 10), pbo1Var, null, new qxn0(new jxn0(61, false), new nxn0(nik1.I5, (Bundle) null)), null, 86010);
                ua91 ua91Var = (ua91) wj3Var.c;
                return new xr61((hux) eoxVar, jx21Var, p7h.M(new xt61[]{xt61Var, new xt61(eoxVar, null, null, null, mqo1.s(new sq61[]{jgb1Var, jgb1Var2, jgb1Var3, jgb1Var4, jgb1Var5, jgb1Var6, jgb1Var7, jgb1Var8, jgb1Var9, jgb1Var10, jgb1Var11, new jgb1("support", 2131962044, null, null, null, null, null, new a1b1(((ov20) ua91Var.b).a("restrict-settings-for-child", false), ua91Var, (byte) 8), pbo1Var, null, new qxn0(new jxn0(67, false), new mxn0(true, new l8t0(ua91Var, (lnm) null, (byte) 15), new td1(ua91Var, (lnm) null, (byte) 15))), null, 86010), new jgb1("licensingInfo", 2131961876, null, null, null, null, null, ((w5x) wj3Var.f).a.a("licensing-scta-info", false), pbo1Var, null, new qxn0(new jxn0(36, false), new oxn0("https://www.spotify.com/int/legal/licensing-info/", false)), null, 86010), new jgb1("sctaInfo", 2131961992, null, null, null, null, null, ((k141) wj3Var.d).a.a("licensing-scta-info", false), pbo1Var, null, new qxn0(new jxn0(63, false), new oxn0("https://www.spotify.com/int/legal/specified-commercial-transactions", false)), null, 86010), new jgb1("businessInformation", 2131961745, null, null, null, null, null, rqt0.u(new ld2(((pdc) ((i6b) wj3Var.X).b).a.c("country_code", ""), "KR", (byte) 14)), pbo1Var, null, new qxn0(new jxn0(15, false), new nxn0(nik1.R4, (Bundle) null)), null, 86010), new jgb1("legalContactForm", 2131961872, null, null, null, null, null, rqt0.u(new ld2(((k141) wj3Var.Y).a.c("country_code", ""), "RU", (byte) 14)), pbo1Var, null, new qxn0(new jxn0(33, false), new oxn0("https://support.spotify.com/ru-ru/contact-spotify-legal-form/", false)), null, 86010), new jgb1("germanOwnershipStatement", 2131961854, null, null, null, null, null, rqt0.u(new ld2(((oj40) wj3Var.Z).a.c("country_code", ""), "DE", (byte) 14)), pbo1Var, null, new qxn0(new jxn0(30, false), new oxn0("https://www.spotify.com/de/about-us/impressum/", false)), null, 86010)}), 253)}), (List) null, 20);
            case 1:
                njx njxVar = njx.c;
                jx21 jx21Var2 = new jx21(2131962090);
                oj80 oj80Var = (oj80) obj;
                Integer num = ((Boolean) ((kly0) oj80Var.c).get()).booleanValue() ? 2131962139 : null;
                eyh0 eyh0Var = (eyh0) oj80Var.b;
                m441 m441Var = new m441(new wt(eyh0Var, (lnm) null, (byte) 2));
                c0g.x.getClass();
                xt61 xt61Var2 = new xt61(njxVar, num, null, null, mqo1.s(new sq61[]{new jgb1("adPartners", 2131961714, null, 2131961713, null, null, null, m441Var, cxo1.P0, null, new qxn0(new jxn0(4, false), new oxn0(((dg30) eyh0Var.b).getString(2131951861), false)), null, 85946)}), 249);
                tk0 tk0Var = (tk0) ((yo31) obj2).b;
                return new xr61((hux) njxVar, jx21Var2, p7h.M(new xt61[]{xt61Var2, new xt61(njxVar, 2131962138, null, null, mqo1.s(new sq61[]{tk0Var.a("preferredAdCategories", 2131960268, 2131961942, 55, "spotify:internal:ads:preferred-ad-categories"), tk0Var.a("sensitiveAdCategories", 2131961620, 2131961993, 64, "spotify:internal:ads:sensitive-ad-categories")}), 249)}), (List) null, 20);
            default:
                wlx wlxVar = wlx.c;
                jx21 jx21Var3 = new jx21(2131962116);
                pux0 pux0Var = (pux0) obj2;
                enx enxVar = enx.c;
                uxy0 uxy0Var = (uxy0) pux0Var.b;
                huz huzVar = new huz(Boolean.valueOf(((z0t) uxy0Var.c).a.l()), (byte) 10);
                c0g.x.getClass();
                pbo1 pbo1Var2 = pbo1.N0;
                jgb1 jgb1Var12 = new jgb1("rememberFilterState", 2131962136, null, 2131962135, null, null, null, huzVar, pbo1Var2, null, new ibd1(new yad1(fih1.e), new gbd1(rqt0.u(hu20.e(((nu71) ((ij01) uxy0Var.b).b).b(), new i64(3, (lnm) null, (byte) 27))), new lw11(uxy0Var, (byte) 3))), null, 85946);
                jut jutVar = (jut) pux0Var.c;
                haa0 haa0Var = (haa0) obj;
                return new xr61((hux) wlxVar, jx21Var3, p7h.M(new xt61[]{new xt61(enxVar, 2131962155, null, null, mqo1.s(new sq61[]{jgb1Var12, new jgb1("editFilters", 2131961695, null, 2131961694, null, null, null, new pzs((mr20) ((d3s) jutVar.c).invoke(), jutVar, (byte) 15), pbo1Var2, null, new qxn0(new kxn0(), new nxn0(nik1.z2, mno1.h(new mmr0[]{new mmr0("START_IN_EDIT_MODE", Boolean.TRUE)}))), null, 85946)}), 249), new xt61(qnx.c, 2131962158, null, null, mqo1.s(new sq61[]{((vn8) haa0Var.b).c(2131962158), ((sjq0) haa0Var.c).s0(), ((myq0) haa0Var.d).f()}), 249)}), (List) null, 20);
        }
    }
}
