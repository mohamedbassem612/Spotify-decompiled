package p;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityManager;
import io.reactivex.rxjava3.core.Observable;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tp implements yr61 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ tp(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [boolean, byte] */
    @Override // p.yr61
    public final xr61 create() {
        ?? r12;
        mr20 mr20VarA;
        sq61 jgb1Var;
        Integer numValueOf;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                vtx vtxVar = vtx.c;
                jx21 jx21Var = new jx21(2131962089);
                d520 d520Var = (d520) obj;
                bm00 bm00Var = (bm00) ((ps7) d520Var.g).b;
                j0g j0gVar = new j0g(new wef(yoi1.g(bm00Var.k()), (byte) 3), (byte) 0);
                c0g.x.getClass();
                qbo1 qbo1Var = qbo1.N0;
                jgb1 jgb1Var2 = new jgb1("childGraduate", 2131961775, null, 2131961774, null, null, null, j0gVar, qbo1Var, null, new qxn0(new jxn0(31, false), new nxn0(nik1.i4, (Bundle) null)), null, 85946);
                jgb1 jgb1Var3 = new jgb1("childGraduate", 2131961777, null, 2131961776, null, null, null, new j0g(new wef(yoi1.g(bm00Var.k()), (byte) 3), (byte) 1), qbo1Var, null, new qxn0(new jxn0(62, false), new nxn0(nik1.a4, (Bundle) null)), null, 85946);
                ptf1 ptf1Var = (ptf1) d520Var.c;
                ph11 ph11Var = new ph11(yoi1.g((Observable) ptf1Var.c), (byte) 20);
                cxo1 cxo1Var = cxo1.P0;
                uqo uqoVar = new uqo(2131962051, null, null, null, 30);
                kly0 kly0Var = (kly0) ptf1Var.b;
                tqo.a.getClass();
                sqo sqoVar = rqo.c;
                vqo vqoVar = new vqo("username", uqoVar, ph11Var, cxo1Var, kly0Var, sqoVar);
                vqo vqoVar2 = new vqo("updateEmail", new uqo(2131961841, null, null, null, 30), cxo1Var, ((xgb) d520Var.d).a, sqoVar);
                fad0 fad0Var = (fad0) d520Var.e;
                jgb1 jgb1Var4 = new jgb1("login_methods", 2131961880, null, 2131961879, null, null, null, new huz(Boolean.valueOf(((ar4) fad0Var.c).a()), (byte) 10), cxo1Var, null, new qxn0(new jxn0(39, false), new mxn0(true, new sg0(1, (lnm) null, (byte) 16), new wd2(fad0Var, (lnm) null, (byte) 6))), null, 85946);
                jgb1 jgb1Var5 = new jgb1("address", 2131951973, null, 2131951972, null, null, null, (ezc) ((fl1) d520Var.b).b, cxo1Var, null, new qxn0(new jxn0(5, false), new nxn0(nik1.Q6, (Bundle) null)), null, 85946);
                kl1 kl1Var = (kl1) d520Var.f;
                pbo1 pbo1Var = pbo1.N0;
                bw20 bw20Var = (ov20) kl1Var.b;
                kly0 kly0Var2 = (kly0) kl1Var.f;
                if (kl1Var.a) {
                    jgb1Var = new vqo("ageAssurance", new uqo(2131961723, null, 2131961715, null, 26), ((Boolean) kly0Var2.get()).booleanValue() ? new huz(Boolean.TRUE, (byte) 10) : bw20Var.a("age-assurance-enabled-account-settings", false), pbo1Var, (kly0) kl1Var.d, sqoVar);
                } else {
                    if (((Boolean) kly0Var2.get()).booleanValue()) {
                        mr20VarA = new huz(Boolean.TRUE, (byte) 10);
                        r12 = 0;
                    } else {
                        r12 = 0;
                        mr20VarA = bw20Var.a("age-assurance-enabled-account-settings", false);
                    }
                    jgb1Var = new jgb1("ageAssurance", 2131961723, null, 2131961716, null, null, null, mr20VarA, pbo1Var, ((pcl) kl1Var.e).a(), new qxn0(new jxn0(7, r12), new mxn0(true, new sg0(1, (lnm) null, (byte) 1), new wd2(kl1Var, (lnm) null, (byte) r12))), null, 69562);
                }
                xt61 xt61Var = new xt61(vtxVar, 2131962137, null, null, mqo1.s(new sq61[]{jgb1Var2, jgb1Var3, vqoVar, vqoVar2, jgb1Var4, jgb1Var5, jgb1Var, new jgb1("accountOverview", 2131961712, null, 2131961711, null, null, null, new huz(((bn) d520Var.h).b.get(), (byte) 10), cxo1Var, null, new qxn0(new jxn0(2, true), new oxn0("https://spotify.com/account/overview/plain", true)), null, 85946)}), 249);
                cik1 cik1Var = (cik1) obj2;
                upx upxVar = upx.c;
                sjq0 sjq0Var = (sjq0) cik1Var.d;
                vqo vqoVar3 = new vqo("planOverview", new uqo(null, null, null, null, 31), cxo1Var, (kly0) sjq0Var.b, new qqo(egs0.b1, new i2p0(sjq0Var, (lnm) null, (byte) 22)));
                kdy0 kdy0Var = (kdy0) cik1Var.c;
                b05 b05Var = (b05) kdy0Var.e;
                if (!b05Var.a() || b05Var.b()) {
                    numValueOf = null;
                } else {
                    int iOrdinal = b05Var.c().ordinal();
                    numValueOf = Integer.valueOf(iOrdinal != 1 ? iOrdinal != 2 ? 2131960986 : 2131960988 : 2131960987);
                }
                vqo vqoVar4 = new vqo("referrals", new uqo(numValueOf, null, null, null, 30), (!b05Var.a() || b05Var.b()) ? new huz(Boolean.FALSE, (byte) 10) : new any(rqt0.u(new any(((ov20) kdy0Var.c).c("type", ""), (byte) 19)), (byte) 20), cxo1Var, (kly0) kdy0Var.d, new qqo(a411.N0, new ic01(kdy0Var, (lnm) null, (byte) 7)));
                oua ouaVar = (oua) cik1Var.b;
                bw20 bw20Var2 = ouaVar.b;
                vqo vqoVar5 = new vqo("billing", new uqo(2131964193, null, null, null, 30), hu20.e(new x010(new any(rqt0.u(new any(bw20Var2.c("type", ""), (byte) 19)), (byte) 20), bw20Var2.a("is-standalone-audiobooks", false), new ce2(3, (lnm) null, (byte) 5), (byte) 1), new qt((lnm) null, ouaVar, (byte) 27)), cxo1Var, ouaVar.c, new qqo(new tla(ouaVar, (byte) 4), new nua(ouaVar, null, (byte) 1)));
                va9 va9Var = (va9) cik1Var.e;
                int i = va9.h;
                List listM = p7h.M(new xt61[]{xt61Var, new xt61(upxVar, 2131962181, null, null, mqo1.s(new sq61[]{vqoVar3, vqoVar4, vqoVar5, new vqo("availablePlans", new uqo(null, null, null, null, 31), hu20.e(hu20.e(hu20.e(hu20.e(new any(rqt0.u(new any(va9Var.b.c("type", ""), (byte) 19)), (byte) 20), new qt((lnm) null, new qa9(va9Var, (byte) 0), (byte) 21)), new qt((lnm) null, new qa9(va9Var, (byte) 1), (byte) 21)), new qt((lnm) null, new qa9(va9Var, (byte) 2), (byte) 21)), new qt((lnm) null, new qa9(va9Var, (byte) 3), (byte) 22)), cxo1Var, va9Var.d, new qqo(zv8.i, new bu(va9Var, (lnm) null, (byte) 3)))}), 249)});
                drg drgVar = (drg) this.c;
                return new xr61((hux) vtxVar, jx21Var, listM, Collections.singletonList(new lq61("closeAccount", 2131961779, null, new ps7(drgVar, (byte) 21), 2131961780, mqo1.s(new iq61[]{new iq61(2131961778, "close_account", new bu(drgVar, (lnm) null, (byte) 8), new qr0(drgVar, (lnm) null, (byte) 9))}), new fq61(tpg.Y, rng.g), 10)), 4);
            default:
                fih1 fih1Var = fih1.e;
                pbo1 pbo1Var2 = pbo1.N0;
                ltx ltxVar = ltx.c;
                jx21 jx21Var2 = new jx21(2131962092);
                zrj1 zrj1Var = (zrj1) obj2;
                xtx xtxVar = xtx.c;
                kqi0 kqi0Var = (kqi0) zrj1Var.c;
                k6e0 k6e0Var = new k6e0(new r6k0(((u601) ((idd1) ((poj0) kqi0Var.c).e).getValue()).a(), (byte) 12), (byte) 10);
                c0g.x.getClass();
                cxo1 cxo1Var2 = cxo1.P0;
                jgb1 jgb1Var6 = new jgb1("musicVideos", 2131961902, null, 2131961901, null, null, null, k6e0Var, cxo1Var2, new pzs(new r6k0(((ov20) kqi0Var.b).a("lock-music-video-disabled", false), (byte) 14), 2131960368, (byte) 19), new ibd1(new xad1(31, false), new dbd1(sbn0.g, new mbj0(kqi0Var, (byte) 26), 2)), null, 69562);
                cab cabVar = (cab) zrj1Var.b;
                bjd bjdVar = (bjd) cabVar.b;
                jgb1 jgb1Var7 = new jgb1("canvas", 2131961769, null, 2131961768, null, null, null, new huz(Boolean.valueOf(bjdVar.a()), (byte) 10), cxo1Var2, new pzs(new hs6(bjdVar.e.a("lock-canvas-disabled", false), (byte) 25), 2131960368, (byte) 19), new ibd1(new xad1(6, false), new ebd1(fjd.c, new m4d(cabVar, (byte) 3), wnb.O0, new gaa(cabVar, (byte) 27))), null, 69562);
                sjq0 sjq0Var2 = (sjq0) zrj1Var.d;
                xt61 xt61Var2 = new xt61(xtxVar, 2131962177, 2131962176, null, mqo1.s(new sq61[]{jgb1Var6, jgb1Var7, new jgb1("otherVideos", 2131961928, null, 2131961926, null, 2131961927, null, null, cxo1Var2, new pzs(new php0(((ov20) sjq0Var2.b).a("lock-other-video-disabled", false), (byte) 11), 2131960368, (byte) 19), new ibd1(new xad1(36, false), new dbd1(rfq0.i, new qsn0(sjq0Var2, (byte) 28), 2)), null, 73146)}), 233);
                a680 a680Var = (a680) obj;
                htx htxVar = htx.c;
                fdc fdcVar = (fdc) a680Var.e;
                jgb1 jgb1Var8 = new jgb1("disablePersonalizedRecommendations", 2131961813, null, 2131961811, null, null, null, fdcVar.b ? ((ov20) fdcVar.c).a("dsa-mode-available", false) : new huz(Boolean.FALSE, (byte) 10), cxo1Var2, ((pcl) fdcVar.e).a(), new ibd1(new xad1(17, true), new abd1(rc11.a.b(b6u.class), new oat(fdcVar, (byte) 4))), null, 69544);
                jgb1 jgb1Var9 = new jgb1("musicLanguage", 2131961900, null, 2131961899, null, null, null, new huz(Boolean.valueOf(((ei4) ((tk0) ((swm0) a680Var.a).b).a.get()).a()), (byte) 10), cxo1Var2, null, new qxn0(new jxn0(43, false), new nxn0(nik1.Q0, (Bundle) null)), null, 85946);
                uny unyVar = (uny) a680Var.b;
                Context context = (Context) unyVar.b;
                String string = context.getString(2131961849, "<EXPLICIT>");
                AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
                String str = (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) ? "E" : "EXPLICIT";
                int iW0 = ihc1.w0(string, "<EXPLICIT>", 0, false, 6);
                sp00 sp00Var = new sp00(string.subSequence(0, iW0), str, string.subSequence(iW0 + 10, string.length()), unyVar, (byte) 2);
                as00 as00Var = (as00) unyVar.c;
                jgb1 jgb1Var10 = new jgb1("explicitContent", 2131961851, null, null, sp00Var, 2131961850, null, new any(as00Var.b, (byte) 11), cxo1Var2, new pzs(new any(as00Var.a, (byte) 12), 2131960368, (byte) 19), new ibd1(new xad1(21, false), new dbd1(fa00.X, null, 10)), null, 68858);
                oza0 oza0Var = (oza0) a680Var.c;
                xt61 xt61Var3 = new xt61(htxVar, 2131962147, null, null, mqo1.s(new sq61[]{jgb1Var8, jgb1Var9, jgb1Var10, new jgb1("kidsFamilyExclude", 2131957119, null, 2131957113, null, null, new wb00(oza0Var, (byte) 24), new x880(oza0Var.f, oza0Var, (byte) 14), cxo1Var2, null, new ibd1(new xad1(25, false), new dbd1(jqa0.Z, new yy80(oza0Var, (byte) 15), 2)), Collections.singletonMap("managedAccountsPrompt", new mza0(oza0Var, (byte) 1)), 18362), new jgb1("unplayableSongs", 2131962012, null, 2131962011, null, null, null, null, cxo1Var2, null, new ibd1(new xad1(48, false), new cbd1(s6n.a)), null, 90042), new jgb1("voiceChatCharacterEntry", 2131962061, null, 2131962060, null, null, null, new huz(Boolean.valueOf(((mr4) ((o2b1) a680Var.f).b).z()), (byte) 10), pbo1Var2, null, new qxn0(new kxn0(), new nxn0("spotify:settings:voice-chat-character", (Bundle) null)), null, 85946), new jgb1("defaultSaveLocationEntry", 2131961802, null, 2131961801, null, null, null, new huz(Boolean.valueOf(((z0t) ((her) a680Var.d).b).a.e()), (byte) 10), pbo1Var2, null, new qxn0(new jxn0(25, false), new nxn0(nik1.k1, (Bundle) null)), null, 85946)}), 249);
                mxr mxrVar = (mxr) this.c;
                nrx nrxVar = nrx.c;
                jgb1 jgb1Var11 = new jgb1("appLanguage", 2131961734, null, 2131961733, null, null, null, new huz(Boolean.valueOf(Build.VERSION.SDK_INT >= 33), (byte) 10), cxo1Var2, null, new qxn0(new jxn0(9, false), new nxn0(nik1.P0, (Bundle) null)), null, 85946);
                jgb1 jgb1Var12 = new jgb1("appIcon", 2131961732, null, 2131961731, null, null, null, new huz(Boolean.FALSE, (byte) 10), cxo1Var2, null, new qxn0(new jxn0(8, false), new nxn0(nik1.o4, (Bundle) null)), null, 85946);
                qpj1 qpj1Var = (qpj1) mxrVar.d;
                boolean z = false;
                Object obj3 = null;
                for (Object obj4 : ((ss61) qpj1Var.c).a) {
                    p6r0 p6r0VarE = ((rs61) obj4).e();
                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                    if (u890.j(p6r0VarE, yon1.i5())) {
                        if (z) {
                            hhg1.n("Collection contains more than one matching element.");
                            return null;
                        }
                        obj3 = obj4;
                        z = true;
                    }
                }
                if (!z) {
                    bhn0.t("Collection contains no element matching the predicate.");
                    return null;
                }
                jx21 jx21Var3 = ((yr61) ((rs61) obj3).c().get()).create().b;
                if (jx21Var3 == null) {
                    jx21Var3 = null;
                }
                Integer numValueOf2 = jx21Var3 != null ? Integer.valueOf(jx21Var3.c) : null;
                huz huzVar = new huz(Boolean.valueOf(((z0t) qpj1Var.b).a.i()), (byte) 10);
                c0g.x.getClass();
                jgb1 jgb1Var13 = new jgb1("yourLibrarySettingsEntry", numValueOf2, null, 2131962077, null, null, null, huzVar, pbo1Var2, null, new qxn0(new jxn0(72, false), new nxn0(nik1.j1, (Bundle) null)), null, 85938);
                xaz0 xaz0Var = (xaz0) mxrVar.c;
                jgb1 jgb1Var14 = new jgb1("reduceDistractions", 2131961974, null, 2131961973, null, null, null, null, pbo1Var2, null, new ibd1(new xad1(42, false), new gbd1(new h5y0(((men0) xaz0Var.b).b, (byte) 18), new f2z0(xaz0Var, (byte) 24))), null, 90042);
                fp8 fp8Var = (fp8) mxrVar.a;
                jgb1 jgb1Var15 = new jgb1("createButton", 2131961789, null, 2131961788, null, null, null, null, pbo1Var2, null, new ibd1(new xad1(14, false), new gbd1(((mjn) fp8Var.b).b, new mgl(fp8Var, (byte) 13))), null, 90042);
                jqd0 jqd0Var = (jqd0) mxrVar.b;
                return new xr61((hux) ltxVar, jx21Var2, p7h.M(new xt61[]{xt61Var2, xt61Var3, new xt61(nrxVar, 2131962150, null, null, mqo1.s(new sq61[]{jgb1Var11, jgb1Var12, jgb1Var13, jgb1Var14, jgb1Var15, new jgb1("trailingActions", 2131962047, null, 2131962046, null, null, null, new huz(Boolean.valueOf(jqd0Var.b), (byte) 10), pbo1Var2, null, new ibd1(new yad1(fih1Var), new gbd1((bpb1) jqd0Var.d, new e9f1(jqd0Var, (byte) 7))), null, 85946)}), 249)}), (List) null, 20);
        }
    }
}
