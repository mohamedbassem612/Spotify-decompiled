package p;

import android.app.Activity;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dns implements yr61 {
    public final /* synthetic */ byte a = 2;
    public final Object b;

    public dns(vun vunVar) {
        this.b = vunVar;
    }

    @Override // p.yr61
    public final xr61 create() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                wlx wlxVar = wlx.c;
                jx21 jx21Var = new jx21(2131962093);
                bns bnsVar = (bns) ((vun) obj).b;
                ans ansVar = (ans) bnsVar.a.get();
                huz huzVar = new huz(Boolean.valueOf(ansVar.b.a.e()), (byte) 10);
                bsn bsnVar = new bsn(bnsVar, (byte) 1);
                c0g.x.getClass();
                return new xr61((hux) wlxVar, jx21Var, Collections.singletonList(new xt61(wlxVar, 2131962148, null, null, mqo1.s(new sq61[]{new vqo("defaultSaveLocation", new uqo(2131961684, null, null, null, 30), huzVar, pbo1.N0, bsnVar, new qqo(mls.P0, new hxn(bnsVar, ansVar, (lnm) null, (byte) 14)))}), 249)), (List) null, 20);
            case 1:
                wsx wsxVar = wsx.c;
                jx21 jx21Var2 = new jx21(2131962094);
                smc0 smc0VarN = k4p1.n();
                yqu0 yqu0Var = (yqu0) obj;
                mr20 mr20VarA = ((w5x) yqu0Var.c).a.a("employee", false);
                c0g.x.getClass();
                jgb1 jgb1Var = new jgb1("employeeTier", 2131961846, null, 2131961842, null, null, null, mr20VarA, cxo1.P0, null, new xxm0(p7h.M(new qxm0[]{v5x.a, v5x.b, v5x.c}), null, new nxm0(vrw.b1, urw.Y), new rxm0(rc11.a.b(u5x.class), fmk0.Y), null, 18), null, 85946);
                svh0 svh0Var = (svh0) yqu0Var.b;
                smc0VarN.add(new xt61(wsxVar, null, null, null, mqo1.s(new sq61[]{jgb1Var, new jgb1("reportBug", 2131961987, null, 2131961986, null, null, null, new huz(Boolean.valueOf(svh0Var.b), (byte) 10), pbo1.N0, null, new qxn0(new jxn0(60, false), new mxn0(false, new sg0(1, (lnm) null, (byte) 26), new wd2(svh0Var, (lnm) null, (byte) 12))), null, 85946)}), 253));
                fg91 fg91Var = fg91.b;
                smc0VarN.add(new xt61(wsxVar, null, null, null, fg91Var, 253));
                smc0VarN.add(new xt61(wsxVar, null, null, null, fg91Var, 253));
                return new xr61((hux) wsxVar, jx21Var2, (List) k4p1.k(smc0VarN), (List) null, 20);
            default:
                knx knxVar = knx.c;
                jx21 jx21Var3 = new jx21(2131962201);
                gn10 gn10Var = mno1.f0;
                g2z g2zVar = (g2z) obj;
                j7s j7sVar = (j7s) g2zVar.c;
                vqo vqoVarC = j7sVar.c(false);
                dkd dkdVar = (dkd) g2zVar.d;
                uqo uqoVar = new uqo(null, null, null, null, 31);
                mr20 mr20Var = (mr20) dkdVar.c.get();
                c0g.x.getClass();
                c0g c0gVar = cxo1.P0;
                vqo vqoVar = new vqo("quickAccess", uqoVar, mr20Var, c0gVar, dkdVar.b, new qqo(lcz0.f, new c3u0(dkdVar, (lnm) null, (byte) 27)));
                vqo vqoVarC2 = j7sVar.c(true);
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                vqo vqoVarY = g2zVar.y("employeeToolsPage", 28, yon1.b5());
                vqo vqoVarY2 = g2zVar.y("accountPage", 3, yon1.X4());
                ic9 ic9Var = (ic9) g2zVar.e;
                bw20 bw20Var = (ov20) ic9Var.b;
                vqo vqoVar2 = new vqo("cancelPlan", new uqo(2131961767, null, 2131961766, null, 26), new x010(new any(rqt0.u(new any(bw20Var.c("type", ""), (byte) 19)), (byte) 20), rqt0.u(new ld2(bw20Var.c("country_code", ""), "DE", (byte) 14)), new ce2(3, (lnm) null, (byte) 9), (byte) 1), c0gVar, (kly0) ic9Var.c, new sqo(jpc.d1));
                vqo vqoVarY3 = g2zVar.y("parentalControlsPage", 50, yon1.G1("SETTINGS_PARENTAL_CONTROLS", "settings/parental-controls", 1841, "settings"));
                vqo vqoVarY4 = g2zVar.y("contentPersonalization", 19, yon1.G1("SETTINGS_CONTENT_PERSONALIZATION", "settings/content-personalization", 1813, "settings"));
                vqo vqoVarY5 = g2zVar.y("privacyAndSocialPage", 57, yon1.G1("SETTINGS_SOCIAL", "settings/social", 1846, "settings"));
                vqo vqoVarY6 = g2zVar.y("playbackPage", 54, yon1.G1("SETTINGS_PLAYBACK", "settings/playback", 1842, "settings"));
                jpx jpxVar = jpx.c;
                lik1 lik1Var = nik1.F2;
                mr20 huzVar2 = new huz(Boolean.TRUE, (byte) 10);
                o3e0 o3e0Var = (o3e0) g2zVar.f;
                Activity activity = (Activity) o3e0Var.b;
                vqo vqoVarH = o3e0Var.h("notificationsPage", huzVar2, c0gVar, new n2g0(45, lik1Var, z6x.a, jpxVar, activity.getString(2131962097), activity.getString(2131962098)));
                vqo vqoVarY7 = g2zVar.y("appsAndDevicesIntegrationsPage", 10, yon1.G1("SETTINGS_INTEGRATIONS", "settings/integrations", 1823, "settings"));
                vqo vqoVarY8 = g2zVar.y("connectivityPage", 23, yon1.G1("SETTINGS_CONNECTIVITY", "settings/connectivity", 1811, "settings"));
                vqo vqoVarY9 = g2zVar.y("mediaQualityPage", 42, yon1.G1("SETTINGS_MEDIA_QUALITY", "settings/media-quality", 1830, "settings"));
                vqo vqoVarY10 = g2zVar.y("advertisementsPage", 6, yon1.Y4());
                vqo vqoVarY11 = g2zVar.y("aboutPage", 1, yon1.G1("SETTINGS_ABOUT", "settings/about", 1803, "settings"));
                hcs hcsVar = (hcs) g2zVar.b;
                pbo1 pbo1Var = pbo1.N0;
                uqo uqoVar2 = new uqo(2131961792, null, null, null, 30);
                kly0 kly0Var = hcsVar.a;
                tqo.a.getClass();
                return new xr61((hux) knxVar, jx21Var3, gn10Var, Collections.singletonList(new xt61(knxVar, null, null, null, mqo1.F(f46.i0(new sq61[]{vqoVarC, vqoVar, vqoVarC2, vqoVarY, vqoVarY2, vqoVar2, vqoVarY3, vqoVarY4, vqoVarY5, vqoVarY6, vqoVarH, vqoVarY7, vqoVarY8, vqoVarY9, vqoVarY10, vqoVarY11, new vqo("logout", uqoVar2, pbo1Var, kly0Var, rqo.c)})), 253)), Collections.singletonList(new lq61("childAccountFootnote", null, null, qbo1.N0, 2131961772, mqo1.s(new jq61[]{new jq61(2131961773, "https://support.spotify.com/article/managed-accounts-for-premium-family-young-listeners/?plain")}), new gq61(), 14)));
        }
    }

    public dns(g2z g2zVar, nhc nhcVar) {
        this.b = g2zVar;
    }

    public dns(ubc ubcVar, c9c c9cVar, yqu0 yqu0Var) {
        this.b = yqu0Var;
    }
}
