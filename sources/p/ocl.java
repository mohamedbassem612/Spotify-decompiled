package p;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ocl implements yr61 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ ocl(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final xr61 a() {
        x010 huzVar;
        byte b;
        Observable observableH;
        Observable observableH2;
        rpx rpxVar = rpx.c;
        jx21 jx21Var = new jx21(2131962099);
        sjq0 sjq0Var = (sjq0) this.e;
        rl1 rl1Var = (rl1) sjq0Var.b;
        c0g.x.getClass();
        vqo vqoVar = new vqo("parentDetails", new uqo(2131961930, null, null, null, 30), rl1Var.b ? ((ov20) rl1Var.e).a("show-linked-parent-in-settings", false) : new huz(Boolean.FALSE, (byte) 10), pbo1.N0, (kly0) rl1Var.c, new qqo(q4r0.Z0, new i2p0(rl1Var, (lnm) null, (byte) 16)));
        ie90 ie90Var = (ie90) sjq0Var.c;
        cxo1 cxo1Var = cxo1.P0;
        if (ie90Var.a) {
            huzVar = new x010(ie90Var.c(), ie90Var.b(), new ce2(3, (lnm) null, (byte) 22), (byte) 1);
            b = 10;
        } else {
            b = 10;
            huzVar = new huz(Boolean.FALSE, (byte) 10);
        }
        byte b2 = b;
        xt61 xt61Var = new xt61(rpxVar, 2131962164, null, null, mqo1.s(new sq61[]{vqoVar, new jgb1("inviteParent", 2131961869, null, 2131961868, null, null, null, huzVar, cxo1Var, null, new qxn0(new ixn0(), new nxn0(ie90Var.a(), (Bundle) null)), null, 85946)}), 249);
        o3e0 o3e0Var = (o3e0) this.b;
        o3e0 o3e0Var2 = (o3e0) o3e0Var.c;
        vqo vqoVar2 = new vqo("managedAccounts", new uqo(2131962161, null, null, null, 30), ((ov20) o3e0Var2.d).a("show-managed-account-list-in-parental-controls", false), cxo1Var, (kly0) o3e0Var2.b, new qqo(j2g0.S0, new p6d0(o3e0Var2, (lnm) null, (byte) 28)));
        oql oqlVar = (oql) o3e0Var.b;
        jgb1 jgb1Var = new jgb1("createAccount", 2131961787, null, 2131961786, null, null, null, ((ov20) oqlVar.c).a("show-create-managed-account-in-parental-controls", false), cxo1Var, new dkm(((czr0) oqlVar.b).d, (byte) 2), new qxn0(new jxn0(48, false), new nxn0(nik1.P3, (Bundle) null)), null, 69562);
        lls0 lls0Var = (lls0) o3e0Var.d;
        xt61 xt61Var2 = new xt61(rpxVar, 2131962161, null, null, mqo1.s(new sq61[]{vqoVar2, jgb1Var, new jgb1("inviteExistingAccount", 2131961867, null, 2131961866, null, null, null, lls0Var.b ? ((ov20) lls0Var.c).a("show-create-managed-account-in-parental-controls", false) : new huz(Boolean.FALSE, b2), cxo1Var, null, new qxn0(new kxn0(), new nxn0("spotify:managed-account-linking:invite-dependent", (Bundle) null)), null, 85946)}), 249);
        poj0 poj0Var = (poj0) this.c;
        sb40 sb40Var = (sb40) poj0Var.e;
        boolean z = sb40Var.b.i() || sb40Var.b.h();
        pox poxVar = pox.c;
        Integer numValueOf = Integer.valueOf(z ? 2131962165 : 2131962166);
        vgg0 vgg0Var = (vgg0) poj0Var.b;
        ek4 ek4Var = vgg0Var.b.b;
        if (ek4Var.i != null) {
            observableH = ((Observable) ek4Var.k.getValue()).map(vrg.f).distinctUntilChanged();
            observableH.getClass();
        } else {
            observableH = l1d.h(ek4Var.g);
        }
        jgb1 jgb1Var2 = new jgb1("managedAccountsRequestSettings", 2131958168, null, 2131958167, null, null, null, new x010(yoi1.g(observableH), vgg0Var.a.a("show-managed-accounts-request-settings-in-parental-controls", false), new ce2(3, (lnm) null, (byte) 26), (byte) 1), cxo1Var, null, new qxn0(new jxn0(49, false), new nxn0(nik1.b6, (Bundle) null)), null, 85946);
        vgg0 vgg0Var2 = (vgg0) poj0Var.c;
        qbo1 qbo1Var = qbo1.N0;
        ek4 ek4Var2 = vgg0Var2.b.b;
        if (ek4Var2.i != null) {
            observableH2 = ((Observable) ek4Var2.k.getValue()).map(bbn.f).distinctUntilChanged();
            observableH2.getClass();
        } else {
            observableH2 = l1d.h(ek4Var2.h);
        }
        List listM = p7h.M(new xt61[]{xt61Var, xt61Var2, new xt61(poxVar, numValueOf, null, null, mqo1.s(new sq61[]{jgb1Var2, new jgb1("myAllowlistingRequests", 2131961904, null, 2131961903, null, null, null, new x010(yoi1.g(observableH2), vgg0Var2.a.a("show-my-allowlisting-requests-in-parental-controls", false), new ce2(3, (lnm) null, (byte) 28), (byte) 1), qbo1Var, null, new qxn0(new jxn0(47, false), new nxn0(nik1.Y5, (Bundle) null)), null, 85946), new jgb1("changePin", 2131961771, null, 2131961770, null, null, null, ((pdc) poj0Var.d).a.a("can-change-parent-pin", false), cxo1Var, null, new qxn0(new jxn0(46, false), new nxn0(nik1.R3, (Bundle) null)), null, 85946)}), 249)});
        ie90 ie90Var2 = (ie90) this.d;
        return new xr61((hux) rpxVar, jx21Var, listM, Collections.singletonList(new lq61("inviteParent", 2131961704, ie90Var2.a ? new x010(ie90Var2.c(), ie90Var2.b(), new ce2(3, (lnm) null, (byte) 21), (byte) 1) : ie90Var2.c(), cxo1Var, 2131961703, mqo1.s(new iq61[]{new iq61(2131961702, "invite_parent", new n3s(ie90Var2, (lnm) null, (byte) 26), new qr0(ie90Var2, (lnm) null, (byte) 24))}), new fq61(o390.N0, g070.Z0), 2)), 4);
    }

    @Override // p.yr61
    public final xr61 create() {
        huz huzVarS;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                tmx tmxVar = tmx.c;
                jx21 jx21Var = new jx21(2131962091);
                bkx bkxVar = bkx.c;
                u1r u1rVar = (u1r) ((xap) obj4).b;
                c0g.x.getClass();
                cxo1 cxo1Var = cxo1.P0;
                mr20 mr20VarH = u1rVar.a.h();
                qxm0 qxm0Var = u1r.e;
                qxm0 qxm0VarA = u1rVar.a();
                qxm0 qxm0Var2 = u1r.f;
                List listM = p7h.M(new qxm0[]{qxm0Var, qxm0VarA, qxm0Var2});
                oxm0 oxm0Var = new oxm0(1);
                t1r t1rVar = u1rVar.b;
                uxm0 uxm0Var = new uxm0(new x010(yoi1.g(t1rVar.b()), yoi1.g(t1rVar.a()), new qr0(u1rVar, (lnm) null, (byte) 11), (byte) 1), new cml(u1rVar, (byte) 22));
                fnn fnnVar = new fnn(u1rVar, (byte) 28);
                qxm0[] qxm0VarArr = {qxm0Var2, u1rVar.a(), qxm0Var};
                ArrayList arrayList = new ArrayList(3);
                int i = 0;
                for (int i2 = 3; i < i2; i2 = 3) {
                    arrayList.add(Integer.valueOf(qxm0VarArr[i].a));
                    i++;
                }
                int[] iArrK1 = o7h.k1(arrayList);
                xt61 xt61Var = new xt61(bkxVar, null, null, null, mqo1.s(new sq61[]{new jgb1("dataSaverMode", 2131961800, null, 2131961794, null, null, null, null, cxo1Var, mr20VarH, new xxm0(listM, null, oxm0Var, uxm0Var, new mxm0(fnnVar, new xkm0(Arrays.copyOf(iArrK1, iArrK1.length), (byte) 6)), 2), null, 73658)}), 253);
                rzo0 rzo0Var = (rzo0) obj2;
                mpx mpxVar = mpx.c;
                rok0 rok0Var = (rok0) rzo0Var.b;
                x010 x010Var = (x010) ((ruc0) rok0Var.c).b;
                c0g.x.getClass();
                pbo1 pbo1Var = pbo1.N0;
                mr20 mr20VarH2 = ((lag) rok0Var.b).h();
                xad1 xad1Var = new xad1(33, false);
                o6n o6nVar = o6n.a;
                jgb1 jgb1Var = new jgb1("offlineMode", 2131961919, null, 2131961916, null, null, null, x010Var, pbo1Var, mr20VarH2, new ibd1(xad1Var, new cbd1(o6nVar)), null, 69562);
                rzo0 rzo0Var2 = (rzo0) rzo0Var.d;
                x010 x010Var2 = new x010((x010) ((ruc0) rzo0Var2.d).b, ((b7n) rzo0Var2.b).a(o6nVar), new irp0(3, (lnm) null, (byte) 2), (byte) 1);
                uqo uqoVar = new uqo(null, null, null, null, 31);
                kly0 kly0Var = (kly0) rzo0Var2.c;
                tqo.a.getClass();
                vqo vqoVar = new vqo("offlineModeTimeLeft", uqoVar, x010Var2, pbo1Var, kly0Var, rqo.b);
                ytp0 ytp0Var = (ytp0) rzo0Var.c;
                bw20 bw20Var = (ov20) ytp0Var.b;
                if (((m020) ytp0Var.d).b()) {
                    mr20 mr20VarA = bw20Var.a("offline", false);
                    bw20 bw20Var2 = bw20Var;
                    huzVarS = h5p1.s(mr20VarA, bw20Var2.a("has-podcasts-available", false), bw20Var2.a("has-audiobooks-available", false), new ryu(4, (lnm) null, (byte) 3));
                } else {
                    huzVarS = new huz(Boolean.FALSE, (byte) 10);
                }
                xt61 xt61Var2 = new xt61(mpxVar, 2131962162, null, null, mqo1.s(new sq61[]{jgb1Var, vqoVar, new jgb1("offlinePlayback", 2131961925, null, 2131961920, null, 2131961924, null, huzVarS, pbo1Var, ((pcl) ytp0Var.e).a(), new ibd1(new wad1(), new abd1(rc11.a.b(bup0.class), mgn0.g)), Collections.singletonMap("offlineAccess", new xtp0(ytp0Var, (byte) 1)), 3514)}), 249);
                zeu zeuVar = (zeu) obj3;
                tmx tmxVar2 = tmx.c;
                vyu vyuVar = (vyu) zeuVar.a;
                bw20 bw20Var3 = vyuVar.a;
                mr20 mr20VarA2 = bw20Var3.a("offline", false);
                bw20 bw20Var4 = bw20Var3;
                jgb1 jgb1Var2 = new jgb1("downloadOver3g", 2131961821, null, 2131961816, null, null, null, h5p1.s(mr20VarA2, bw20Var4.a("has-podcasts-available", false), bw20Var4.a("has-audiobooks-available", false), new ryu(4, (lnm) null, (byte) 0)), pbo1Var, vyuVar.b.h(), new ibd1(new xad1(19, false), new cbd1(i6n.a, new oat(vyuVar, (byte) 11))), sqg0.J(new mmr0[]{new mmr0("losslessDownloadOverCellularWarning", new uyu(vyuVar, (byte) 0)), new mmr0("internalQualityDownloadOverCellularWarning", new uyu(vyuVar, (byte) 1))}), 4026);
                jgb1 jgb1Var3 = new jgb1("videoPodcastsDownloadAudioOnly", 2131962056, null, 2131962055, null, null, null, ((ov20) ((qeh1) zeuVar.c).b).a("has-podcasts-available", false), cxo1Var, null, new ibd1(new xad1(51, false), new bbd1()), null, 85946);
                zrj1 zrj1Var = (zrj1) zeuVar.b;
                xt61 xt61Var3 = new xt61(tmxVar2, 2131962154, null, null, mqo1.s(new sq61[]{jgb1Var2, jgb1Var3, new jgb1("videoPodcastsStreamAudioOnly", 2131962059, null, 2131962057, null, 2131962058, null, ((ov20) zrj1Var.b).a("has-podcasts-available", false), cxo1Var, ((lag) zrj1Var.d).h(), new ibd1(new xad1(52, false), new gbd1(yoi1.g(((t1r) zrj1Var.c).c()), new g2j1(zrj1Var, (byte) 10))), null, 69050)}), 249);
                e821 e821Var = (e821) obj;
                gnx gnxVar = gnx.c;
                cqz cqzVar = (cqz) e821Var.b;
                uqo uqoVar2 = new uqo(2131962030, null, null, null, 30);
                kly0 kly0Var2 = cqzVar.a;
                sqo sqoVar = rqo.c;
                vqo vqoVar2 = new vqo("storageBar", uqoVar2, pbo1Var, kly0Var2, sqoVar);
                k811 k811Var = (k811) e821Var.d;
                jgb1 jgb1Var4 = new jgb1("removeDownloads", 2131961985, null, 2131961984, null, null, null, null, pbo1Var, ((pcl) k811Var.d).a(), new m70(2131961983, null, new i70(i021.t, i021.X), new xx0(3, (lnm) null, (byte) 20), 6), Collections.singletonMap("removeDownloads", new l621(k811Var, (byte) 1)), 8122);
                it8 it8Var = (it8) e821Var.a;
                vqo vqoVar3 = new vqo("cacheLimit", new uqo(2131961762, null, 2131961749, null, 26), (ezc) it8Var.c, pbo1Var, (kly0) it8Var.b, sqoVar);
                p6t p6tVar = (p6t) e821Var.c;
                jgb1 jgb1Var5 = new jgb1("deleteCache", 2131961805, null, 2131961804, null, null, null, null, pbo1Var, null, new m70(2131961803, null, new i70(d0t.V0, d0t.W0), new uls(p6tVar, (lnm) null, (byte) 1), 6), sqg0.J(new mmr0[]{new mmr0("deleteCache", new o6t(p6tVar, (byte) 1)), new mmr0("cacheLimitGuidance", new o6t(p6tVar, (byte) 2))}), 24506);
                hp91 hp91Var = (hp91) e821Var.e;
                return new xr61((hux) tmxVar, jx21Var, p7h.M(new xt61[]{xt61Var, xt61Var2, xt61Var3, new xt61(gnxVar, 2131962173, null, null, mqo1.s(new sq61[]{vqoVar2, jgb1Var4, vqoVar3, jgb1Var5, new vqo("storageLocation", new uqo(2131962043, null, 2131962031, null, 26), new huz(Boolean.valueOf(((pjm1) hp91Var.c).a().size() > 1), (byte) 10), pbo1Var, (kly0) hp91Var.b, sqoVar)}), 249)}), (List) null, 20);
            case 1:
                return new xr61((hux) lpx.c, new jx21(2131962096), p7h.M(new xt61[]{((uxy0) obj3).l(), ((p2o0) obj2).t(), ((yzu) obj4).r(), ((zrj1) obj).f()}), (List) null, 20);
            case 2:
                return a();
            default:
                cxo1 cxo1Var2 = cxo1.P0;
                ztx ztxVar = ztx.c;
                jx21 jx21Var2 = new jx21(2131962100);
                lvc1 lvc1Var = (lvc1) obj4;
                ptx ptxVar = ptx.c;
                lc20 lc20Var = (lc20) lvc1Var.c;
                boolean zA = ((d84) lc20Var.d).a();
                c0g.x.getClass();
                pbo1 pbo1Var2 = pbo1.N0;
                jgb1 jgb1Var6 = new jgb1("gapless", 2131961853, null, 2131961852, null, null, null, null, pbo1Var2, zA ? ((pcl) lc20Var.c).a() : ((lag) lc20Var.b).h(), new ibd1(new xad1(23, false), zA ? new abd1(rc11.a.b(j440.class)) : new cbd1(l6n.a)), null, 73658);
                km3 km3Var = (km3) lvc1Var.b;
                jgb1 jgb1Var7 = new jgb1("automix", 2131961739, null, 2131961738, null, null, null, (ezc) km3Var.c, pbo1Var2, ((lag) km3Var.b).h(), new ibd1(new xad1(3, false), new cbd1(d6n.a)), null, 69562);
                ham hamVar = (ham) lvc1Var.d;
                ezc ezcVar = (ezc) hamVar.c;
                uqo uqoVar3 = new uqo(2131961791, null, 2131961790, null, 26);
                kly0 kly0Var3 = (kly0) hamVar.b;
                tqo.a.getClass();
                xt61 xt61Var4 = new xt61(ptxVar, 2131962174, null, null, mqo1.s(new sq61[]{jgb1Var6, jgb1Var7, new vqo("crossfade", uqoVar3, ezcVar, pbo1Var2, kly0Var3, rqo.c)}), 249);
                ur00 ur00Var = (ur00) obj3;
                lpx lpxVar = lpx.c;
                jgb1 jgb1Var8 = new jgb1("autoplay", 2131961742, null, 2131961740, null, null, null, null, pbo1Var2, new pzs(new nf(yoi1.g(((xvo) ((f89) ur00Var.b).b.get()).a(true)), (byte) 18), 2131961741, (byte) 19), new ibd1(new xad1(4, false), new dbd1(zv8.h, null, 14)), null, 73658);
                jgb1 jgb1Var9 = new jgb1("monoAudio", 2131961898, null, 2131961897, null, null, null, null, pbo1Var2, ((njm0) ur00Var.c).a.h(), new ibd1(new xad1(30, false), new cbd1(t6n.a)), null, 73658);
                vpt vptVar = (vpt) ur00Var.f;
                ima1 ima1VarD = vptVar.c.a.d(vptVar.a, "spotify_preferences");
                jgb1 jgb1Var10 = new jgb1("deviceBroadcastStatus", 2131961807, null, 2131961806, null, null, null, null, cxo1Var2, vptVar.b.h(), new ibd1(new xad1(16, false), new gbd1(new ht20(new p3t(ima1VarD.q(vpt.d), (byte) 3), new n5s(ima1VarD, (lnm) null, (byte) 20)), new oat(ima1VarD, (byte) 2))), null, 73658);
                nl51 nl51Var = (nl51) ur00Var.d;
                r961 r961Var = (r961) nl51Var.b;
                ezc ezcVar2 = (ezc) r961Var.c;
                ezc ezcVar3 = (ezc) r961Var.b;
                jgb1 jgb1Var11 = new jgb1("smartShuffle", 2131962023, null, 2131962022, null, null, null, rqt0.u(new x010(ezcVar3, ezcVar2, new irp0(3, (lnm) null, (byte) 17), (byte) 1)), pbo1Var2, null, new ibd1(new xad1(50, false), new gbd1(hu20.e(rqt0.u(new x010(ezcVar3, ezcVar2, new irp0(3, (lnm) null, (byte) 17), (byte) 1)), new af01((lnm) null, r961Var, (byte) 25)), new k681(nl51Var, (byte) 17))), null, 85946);
                re81 re81Var = (re81) ur00Var.e;
                c681 c681Var = new c681(re81Var, (byte) 3);
                ezc ezcVar4 = re81Var.d;
                List list = re81.e;
                ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                int i3 = 0;
                for (Object obj5 : list) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        p7h.T();
                        throw null;
                    }
                    pe81 pe81Var = (pe81) obj5;
                    arrayList2.add(new qxm0(i3, Integer.valueOf(pe81Var.b), Integer.valueOf(pe81Var.c), null, !pe81Var.d ? new huz(iax.a, (byte) 10) : new pzs(new ph11(yoi1.g(((xvo) re81Var.c.get()).a(true)), (byte) 7), 2131962016, (byte) 19), null, 948));
                    i3 = i4;
                }
                xt61 xt61Var5 = new xt61(lpxVar, 2131962160, null, null, mqo1.s(new sq61[]{jgb1Var8, jgb1Var9, jgb1Var10, jgb1Var11, new jgb1("shuffleAlgorithm", 2131962021, null, 2131962013, null, null, c681Var, ezcVar4, pbo1Var2, null, new xxm0(arrayList2, null, new nxm0(oa81.Z, yd81.d), new txm0(), null, 18), null, 83898)}), 249);
                bih1 bih1Var = (bih1) obj2;
                xtx xtxVar = xtx.c;
                x390 x390Var = (x390) bih1Var.b;
                huz huzVar = new huz(Boolean.valueOf(((gh4) x390Var.c).g()), (byte) 10);
                c0g.x.getClass();
                jgb1 jgb1Var12 = new jgb1("largerNpbVideo", 2131961871, null, 2131961870, null, null, null, huzVar, pbo1Var2, null, new ibd1(new xad1(26, false), new gbd1(((ffb0) x390Var.b).a(), new yy80(x390Var, (byte) 20))), null, 85946);
                qkn0 qkn0Var = (qkn0) bih1Var.c;
                ((gvs0) qkn0Var.b).getClass();
                xt61 xt61Var6 = new xt61(xtxVar, 2131962175, null, null, mqo1.s(new sq61[]{jgb1Var12, new jgb1("pictureInPicture", 2131962169, null, 2131962167, null, 2131962168, null, new huz(Boolean.valueOf(Build.VERSION.SDK_INT >= 31), (byte) 10), cxo1Var2, null, new ibd1(new yad1(fih1.d), new fbd1(new kks0(qkn0Var, (byte) 1), new n1r0(qkn0Var, (byte) 19))), null, 85434)}), 249);
                brk1 brk1Var = (brk1) obj;
                ztx ztxVar2 = ztx.c;
                cu61 cu61Var = ((h15) brk1Var.a).a() ? (o021) brk1Var.f : null;
                wmy wmyVar = (wmy) brk1Var.c;
                jge jgeVarE = hu20.e(yoi1.g((ObservableSource) ((vqb0) wmyVar.f).invoke()), new t4o0((lnm) null, wmyVar, (byte) 4));
                xad1 xad1Var2 = new xad1(32, false);
                jd11 jd11Var = rc11.a;
                jgb1 jgb1Var13 = new jgb1("normalizeVolume", 2131962074, null, 2131962070, null, null, null, null, pbo1Var2, jgeVarE, new ibd1(xad1Var2, new abd1(jd11Var.b(yfo0.class), new qsn0(wmyVar, (byte) 9))), sqg0.J(new mmr0[]{new mmr0("turnOff", new vfo0(wmyVar, (byte) 0)), new mmr0("turnOnWithNonQuietLevel", new vfo0(wmyVar, (byte) 1))}), 8122);
                rfo0 rfo0Var = (rfo0) brk1Var.e;
                jgb1 jgb1Var14 = new jgb1("volumeLevel", 2131962069, null, 2131962064, null, 2131962065, null, yoi1.g(rfo0Var.b.a("loudness-levels", "").map(o810.R0)), pbo1Var2, hu20.e(yoi1.g((ObservableSource) rfo0Var.g.invoke()), new t4o0((lnm) null, rfo0Var, (byte) 2)), new xxm0(p7h.M(new qxm0[]{rfo0.h, rfo0.i, rfo0.j}), null, new oxm0(8), new rxm0(jd11Var.b(tfo0.class), new x3o0(rfo0Var, (byte) 2)), null, 18), Collections.singletonMap("nonQuietLevel", new y3o0(rfo0Var, (byte) 6)), 3514);
                rl1 rl1Var = (rl1) brk1Var.d;
                jgb1 jgb1Var15 = new jgb1("dynamicNormalizer", 2131962063, null, 2131962062, null, null, null, new huz(Boolean.valueOf(rl1Var.b), (byte) 10), pbo1Var2, hu20.e(yoi1.g((ObservableSource) ((vqb0) rl1Var.e).invoke()), new uls((lnm) null, rl1Var, (byte) 7)), new ibd1(new xad1(35, false), new cbd1(p6n.a)), null, 69562);
                yzu yzuVar = (yzu) brk1Var.b;
                return new xr61((hux) ztxVar, jx21Var2, p7h.M(new xt61[]{xt61Var4, xt61Var5, xt61Var6, new xt61(ztxVar2, 2131962180, null, cu61Var, mqo1.s(new sq61[]{jgb1Var13, jgb1Var14, jgb1Var15, new jgb1("equalizer", 2131961848, null, 2131961847, null, null, null, new huz(Boolean.valueOf(!((Activity) yzuVar.a).getPackageManager().queryIntentActivities(new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL"), 65536).isEmpty() || ((k9r) yzuVar.b).q()), (byte) 10), pbo1Var2, ((lag) yzuVar.c).h(), new qxn0(new jxn0(29, false), new mxn0(false, new ro8(yzuVar, (lnm) null, (byte) 11), new vd2(yzuVar, (lnm) null, (byte) 15))), Collections.singletonMap("warning", new nty(yzuVar, (byte) 20)), 4026)}), 121)}), (List) null, 20);
        }
    }
}
