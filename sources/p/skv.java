package p;

import android.net.Uri;
import android.os.Bundle;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class skv extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ skv(Object obj, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.d = obj;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        byte b2 = 5;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                skv skvVar = new skv((qj0) this.d, (lnm) obj5, (byte) 0);
                skvVar.b = (qkv) obj2;
                skvVar.c = (pkv) obj3;
                skvVar.invokeSuspend(rih1Var);
                break;
            case 1:
                skv skvVar2 = new skv((kuy) this.d, (lnm) obj5, (byte) 1);
                skvVar2.b = (huy) obj2;
                skvVar2.c = (cuy) obj3;
                skvVar2.invokeSuspend(rih1Var);
                break;
            case 2:
                skv skvVar3 = new skv((rwj) this.d, (lnm) obj5, (byte) 2);
                skvVar3.b = (vp00) obj3;
                skvVar3.c = (tqw) obj4;
                skvVar3.invokeSuspend(rih1Var);
                break;
            case 3:
                skv skvVar4 = new skv((xk10) this.d, (lnm) obj5, (byte) 3);
                skvVar4.b = (vk10) obj2;
                skvVar4.c = (rk10) obj3;
                skvVar4.invokeSuspend(rih1Var);
                break;
            case 4:
                skv skvVar5 = new skv(b2, (lnm) obj5);
                skvVar5.b = (fp10) obj;
                skvVar5.c = (bp10) obj3;
                skvVar5.d = (tqw) obj4;
                skvVar5.invokeSuspend(rih1Var);
                break;
            case 5:
                skv skvVar6 = new skv((yxb0) this.d, (lnm) obj5, b2);
                skvVar6.b = (g3j1) obj3;
                skvVar6.c = (tqw) obj4;
                skvVar6.invokeSuspend(rih1Var);
                break;
            case 6:
                skv skvVar7 = new skv((br0) this.d, (lnm) obj5, (byte) 6);
                skvVar7.b = (i720) obj3;
                skvVar7.c = (tqw) obj4;
                skvVar7.invokeSuspend(rih1Var);
                break;
            case 7:
                skv skvVar8 = new skv((ng20) this.d, (lnm) obj5, (byte) 7);
                skvVar8.b = (ig20) obj3;
                skvVar8.c = (tqw) obj4;
                skvVar8.invokeSuspend(rih1Var);
                break;
            case 8:
                skv skvVar9 = new skv((lzn0) this.d, (lnm) obj5, (byte) 8);
                skvVar9.b = (nc30) obj3;
                skvVar9.c = (tqw) obj4;
                skvVar9.invokeSuspend(rih1Var);
                break;
            case 9:
                skv skvVar10 = new skv((ar30) this.d, (lnm) obj5, (byte) 9);
                skvVar10.b = (yq30) obj2;
                skvVar10.c = (tqw) obj4;
                skvVar10.invokeSuspend(rih1Var);
                break;
            case 10:
                skv skvVar11 = new skv((wr30) this.d, (lnm) obj5, (byte) 10);
                skvVar11.b = (tr30) obj2;
                skvVar11.c = (sr30) obj3;
                skvVar11.invokeSuspend(rih1Var);
                break;
            case 11:
                skv skvVar12 = new skv((jb3) this.d, (lnm) obj5, (byte) 11);
                skvVar12.b = (y540) obj;
                skvVar12.c = (a640) obj3;
                skvVar12.invokeSuspend(rih1Var);
                break;
            case 12:
                skv skvVar13 = new skv((el9) this.d, (lnm) obj5, (byte) 12);
                skvVar13.b = (tnb1) obj2;
                skvVar13.c = (zwz) obj3;
                skvVar13.invokeSuspend(rih1Var);
                break;
            case 13:
                skv skvVar14 = new skv((gmn) this.d, (lnm) obj5, (byte) 13);
                skvVar14.b = (l0a0) obj3;
                skvVar14.c = (tqw) obj4;
                skvVar14.invokeSuspend(rih1Var);
                break;
            case 14:
                skv skvVar15 = new skv((z72) this.d, (lnm) obj5, (byte) 14);
                skvVar15.b = (hba0) obj;
                skvVar15.c = (gba0) obj3;
                skvVar15.invokeSuspend(rih1Var);
                break;
            case 15:
                skv skvVar16 = new skv((x0b0) this.d, (lnm) obj5, (byte) 15);
                skvVar16.b = (t0b0) obj3;
                skvVar16.c = (tqw) obj4;
                skvVar16.invokeSuspend(rih1Var);
                break;
            case 16:
                skv skvVar17 = new skv((bjb0) this.d, (lnm) obj5, (byte) 16);
                skvVar17.b = (xib0) obj2;
                skvVar17.c = (uib0) obj3;
                skvVar17.invokeSuspend(rih1Var);
                break;
            case 17:
                skv skvVar18 = new skv((yxb0) this.d, (lnm) obj5, (byte) 17);
                skvVar18.b = (bwb0) obj3;
                skvVar18.c = (tqw) obj4;
                skvVar18.invokeSuspend(rih1Var);
                break;
            case 18:
                skv skvVar19 = new skv((qj0) this.d, (lnm) obj5, (byte) 18);
                skvVar19.b = (w5d0) obj3;
                skvVar19.c = (tqw) obj4;
                skvVar19.invokeSuspend(rih1Var);
                break;
            case 19:
                skv skvVar20 = new skv((res) this.d, (lnm) obj5, (byte) 19);
                skvVar20.b = (u9d0) obj3;
                skvVar20.c = (tqw) obj4;
                skvVar20.invokeSuspend(rih1Var);
                break;
            case 20:
                skv skvVar21 = new skv((bgd0) this.d, (lnm) obj5, (byte) 20);
                skvVar21.b = (tfd0) obj3;
                skvVar21.c = (tqw) obj4;
                skvVar21.invokeSuspend(rih1Var);
                break;
            case 21:
                skv skvVar22 = new skv((et90) this.d, (lnm) obj5, (byte) 21);
                skvVar22.b = (emd0) obj3;
                skvVar22.c = (tqw) obj4;
                skvVar22.invokeSuspend(rih1Var);
                break;
            case 22:
                skv skvVar23 = new skv((yud0) this.d, (lnm) obj5, (byte) 22);
                skvVar23.b = (uud0) obj2;
                skvVar23.c = (tud0) obj3;
                skvVar23.invokeSuspend(rih1Var);
                break;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                skv skvVar24 = new skv((t6k0) this.d, (lnm) obj5, (byte) 23);
                skvVar24.b = (n6k0) obj3;
                skvVar24.c = (tqw) obj4;
                skvVar24.invokeSuspend(rih1Var);
                break;
            case 24:
                skv skvVar25 = new skv((nm1) this.d, (lnm) obj5, (byte) 24);
                skvVar25.b = (cak0) obj;
                skvVar25.c = (bak0) obj3;
                skvVar25.invokeSuspend(rih1Var);
                break;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                skv skvVar26 = new skv((nm1) this.d, (lnm) obj5, (byte) 25);
                skvVar26.b = (lak0) obj3;
                skvVar26.c = (tqw) obj4;
                skvVar26.invokeSuspend(rih1Var);
                break;
            case 26:
                skv skvVar27 = new skv((ng20) this.d, (lnm) obj5, (byte) 26);
                skvVar27.b = (lkm0) obj3;
                skvVar27.c = (tqw) obj4;
                skvVar27.invokeSuspend(rih1Var);
                break;
            case 27:
                skv skvVar28 = new skv((b6n0) this.d, (lnm) obj5, (byte) 27);
                skvVar28.b = (o5n0) obj3;
                skvVar28.c = (tqw) obj4;
                skvVar28.invokeSuspend(rih1Var);
                break;
            case 28:
                skv skvVar29 = new skv((itn0) this.d, (lnm) obj5, (byte) 28);
                skvVar29.b = (tsn0) obj3;
                skvVar29.c = (tqw) obj4;
                skvVar29.invokeSuspend(rih1Var);
                break;
            default:
                skv skvVar30 = new skv((y1c1) this.d, (lnm) obj5, (byte) 29);
                skvVar30.b = (bmo0) obj2;
                skvVar30.c = (ulo0) obj3;
                skvVar30.invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        s2p0 s2p0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tv80 tv80VarConcat = null;
        switch (b) {
            case 0:
                qkv qkvVar = (qkv) this.b;
                pkv pkvVar = (pkv) this.c;
                hm5.M(obj);
                if (u890.j(pkvVar, pkv.a)) {
                    ((ja8) ((qj0) this.d).d).a(qkvVar.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 1:
                huy huyVar = (huy) this.b;
                cuy cuyVar = (cuy) this.c;
                hm5.M(obj);
                if (!(cuyVar instanceof cuy)) {
                    eg.o();
                    return null;
                }
                if (!(huyVar instanceof guy) || (str = ((guy) huyVar).a) == null) {
                    return rih1Var;
                }
                Set set = s4b1.f;
                s4b1 s4b1VarX = uic.x(str);
                String strJ = s4b1VarX.j();
                if (strJ != null) {
                    int iOrdinal = s4b1VarX.c.ordinal();
                    if (iOrdinal == 844) {
                        tv80VarConcat = "spotify:internal:entity-segments:bottomsheet:episode:".concat(strJ);
                    } else if (iOrdinal == 926) {
                        tv80VarConcat = "spotify:internal:entity-segments:bottomsheet:track:".concat(strJ);
                    }
                }
                tv80 tv80Var = tv80VarConcat;
                if (tv80Var == null) {
                    return rih1Var;
                }
                a1r0.j((a1r0) ((kuy) this.d).g, tv80Var, (String) null, (Bundle) null, false, 14);
                return rih1Var;
            case 2:
                rwj rwjVar = (rwj) this.d;
                mwn0 mwn0Var = (mwn0) rwjVar.f;
                vp00 vp00Var = (vp00) this.b;
                tqw tqwVar = (tqw) this.c;
                hm5.M(obj);
                if (u890.j(vp00Var, tp00.a)) {
                    mwn0Var.e(new yrn0((ou80) null));
                    mwn0Var.f(new yrn0((ou80) null));
                    k0y k0yVar = (k0y) rwjVar.e;
                    if (tqwVar != null) {
                        n3o1.y(tqwVar);
                    }
                    switch (k0yVar.a) {
                        case 0:
                            k0yVar.b.a();
                            return rih1Var;
                        case 1:
                            k0yVar.b.a();
                            return rih1Var;
                        case 2:
                            k0yVar.b.a();
                            return rih1Var;
                        default:
                            k0yVar.b.a();
                            return rih1Var;
                    }
                }
                if (!u890.j(vp00Var, up00.a)) {
                    eg.o();
                    return null;
                }
                l0y l0yVar = (l0y) rwjVar.d;
                tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
                switch (l0yVar.a) {
                    case 0:
                        l0yVar.b.b(tv80VarY != null ? tv80VarY.a : null);
                        return rih1Var;
                    case 1:
                        l0yVar.b.b(tv80VarY != null ? tv80VarY.a : null);
                        return rih1Var;
                    case 2:
                        l0yVar.b.b(tv80VarY != null ? tv80VarY.a : null);
                        return rih1Var;
                    default:
                        l0yVar.b.b(tv80VarY != null ? tv80VarY.a : null);
                        return rih1Var;
                }
            case 3:
                uk10 uk10Var = (vk10) this.b;
                rk10 rk10Var = (rk10) this.c;
                hm5.M(obj);
                if (!u890.j(rk10Var, rk10.a)) {
                    eg.o();
                } else {
                    if (u890.j(uk10Var, tk10.a)) {
                        return rih1Var;
                    }
                    if (uk10Var instanceof uk10) {
                        z710.d(((xk10) this.d).a, uk10Var.b, false, 6);
                        return rih1Var;
                    }
                    eg.o();
                }
                return null;
            case 4:
                fp10 fp10Var = (fp10) this.b;
                bp10 bp10Var = (bp10) this.c;
                tqw tqwVar2 = (tqw) this.d;
                hm5.M(obj);
                if (u890.j(bp10Var, bp10.a)) {
                    fp10Var.c.invoke(tqwVar2);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 5:
                yxb0 yxb0Var = (yxb0) this.d;
                g3j1 g3j1Var = (g3j1) this.b;
                tqw tqwVar3 = (tqw) this.c;
                hm5.M(obj);
                if ((g3j1Var instanceof c3j1) || (g3j1Var instanceof d3j1)) {
                    return rih1Var;
                }
                if (g3j1Var instanceof f3j1) {
                    z710.d((z710) yxb0Var.c, ((f3j1) g3j1Var).a, false, 6);
                    return rih1Var;
                }
                if (g3j1Var instanceof e3j1) {
                    ((lzn0) yxb0Var.d).a("spotify:genre:0JQ5DAqbMKFImHYGo3eTSg", cvl1.d(tqwVar3), (Bundle) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 6:
                i720 i720Var = (i720) this.b;
                tqw tqwVar4 = (tqw) this.c;
                hm5.M(obj);
                if (u890.j(i720Var, i720.a)) {
                    ((j720) ((br0) this.d).c).c(tqwVar4 != null ? n3o1.y(tqwVar4) : null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 7:
                ig20 ig20Var = (ig20) this.b;
                tqw tqwVar5 = (tqw) this.c;
                hm5.M(obj);
                if (ig20Var != null) {
                    ((lzn0) ((ng20) this.d).b).a(nik1.d5.a, cvl1.d(tqwVar5), (Bundle) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 8:
                nc30 nc30Var = (nc30) this.b;
                tqw tqwVar6 = (tqw) this.c;
                hm5.M(obj);
                if (!u890.j(nc30Var, nc30.a)) {
                    eg.o();
                    return null;
                }
                String str2 = nik1.i4.a;
                if (tqwVar6 == null) {
                    return rih1Var;
                }
                ((lzn0) this.d).a(str2, n3o1.y(tqwVar6), (Bundle) null);
                return rih1Var;
            case 9:
                yq30 yq30Var = (yq30) this.b;
                tqw tqwVar7 = (tqw) this.c;
                hm5.M(obj);
                ((lzn0) ((ar30) this.d).h).a(yq30Var.a, cvl1.d(tqwVar7), (Bundle) null);
                return rih1Var;
            case 10:
                wr30 wr30Var = (wr30) this.d;
                tr30 tr30Var = (tr30) this.b;
                sr30 sr30Var = (sr30) this.c;
                hm5.M(obj);
                if (!tr30Var.a) {
                    return rih1Var;
                }
                if (!wr30Var.d) {
                    ((p2p0) wr30Var.a.get()).c(wr30Var.b == pqq0.b ? yqq0.a : yqq0.b, true);
                    return rih1Var;
                }
                t2p0 t2p0Var = wr30Var.c;
                if (u890.j(sr30Var, qr30.a)) {
                    s2p0Var = s2p0.b;
                } else {
                    if (!u890.j(sr30Var, rr30.a)) {
                        eg.o();
                        return null;
                    }
                    s2p0Var = s2p0.a;
                }
                t2p0Var.b(s2p0Var);
                return rih1Var;
            case 11:
                y540 y540Var = (y540) this.b;
                a640 a640Var = (a640) this.c;
                hm5.M(obj);
                if (u890.j(a640Var, a640.a)) {
                    ((y5v0) ((jb3) this.d).e).d(y540Var.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 12:
                tnb1 tnb1Var = (tnb1) this.b;
                zwz zwzVar = (zwz) this.c;
                hm5.M(obj);
                if (!u890.j(zwzVar, zwz.a)) {
                    eg.o();
                    return null;
                }
                boolean z = tnb1Var.d;
                String str3 = tnb1Var.c;
                el9 el9Var = (el9) this.d;
                if (z) {
                    ((y5v0) el9Var.h).d(str3);
                    return rih1Var;
                }
                ((lzn0) el9Var.g).f(new dwn0(str3, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                return rih1Var;
            case 13:
                gmn gmnVar = (gmn) this.d;
                lzn0 lzn0Var = (lzn0) gmnVar.g;
                l0a0 l0a0Var = (l0a0) this.b;
                tqw tqwVar8 = (tqw) this.c;
                hm5.M(obj);
                if (l0a0Var instanceof k0a0) {
                    String str4 = ((k0a0) l0a0Var).a;
                    fns fnsVar = igu.a;
                    c921.y(smo1.e(b3s.c), (o8n) null, 0, new n0a0(gmnVar, str4, i8y.ENGAGEMENT_TYPE_IMPRESSION, (lnm) null, (byte) 0), 3);
                    return rih1Var;
                }
                if (!(l0a0Var instanceof j0a0)) {
                    eg.o();
                    return null;
                }
                j0a0 j0a0Var = (j0a0) l0a0Var;
                String str5 = j0a0Var.a;
                String str6 = j0a0Var.b;
                fns fnsVar2 = igu.a;
                c921.y(smo1.e(b3s.c), (o8n) null, 0, new n0a0(gmnVar, str6, i8y.ENGAGEMENT_TYPE_INTERACTION_CTA_TAP, (lnm) null, (byte) 0), 3);
                if (tqwVar8 != null) {
                    lzn0Var.a(str5, n3o1.y(tqwVar8), (Bundle) null);
                    return rih1Var;
                }
                lzn0Var.h(str5);
                return rih1Var;
            case 14:
                z72 z72Var = (z72) this.d;
                svh0 svh0Var = (svh0) z72Var.X;
                hba0 hba0Var = (hba0) this.b;
                bba0 bba0Var = (gba0) this.c;
                hm5.M(obj);
                if (bba0Var instanceof bba0) {
                    ((vt90) z72Var.h).a(new wea0(hba0Var.b), hba0Var.a, bba0Var.a);
                    svh0Var.i();
                    return rih1Var;
                }
                if (bba0Var instanceof eba0) {
                    ((lzn0) z72Var.f).h(sap1.s("inline_upsell:group_listening", nik1.b2));
                    svh0Var.i();
                    return rih1Var;
                }
                if ((bba0Var instanceof dba0) || (bba0Var instanceof cba0) || (bba0Var instanceof fba0)) {
                    return rih1Var;
                }
                eg.o();
                return null;
            case 15:
                t0b0 t0b0Var = (t0b0) this.b;
                tqw tqwVar9 = (tqw) this.c;
                hm5.M(obj);
                if (!u890.j(t0b0Var, t0b0.a)) {
                    eg.o();
                    return null;
                }
                if (tqwVar9 == null) {
                    return rih1Var;
                }
                n3o1.y(tqwVar9);
                return rih1Var;
            case 16:
                ygb0 ygb0Var = ((bjb0) this.d).d;
                xib0 xib0Var = (xib0) this.b;
                uib0 uib0Var = (uib0) this.c;
                hm5.M(obj);
                if (uib0Var instanceof sib0) {
                    ygb0Var.invoke(new sib0(xib0Var));
                    return rih1Var;
                }
                if (uib0Var instanceof tib0) {
                    ygb0Var.invoke(new tib0(xib0Var));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 17:
                bwb0 bwb0Var = (bwb0) this.b;
                tqw tqwVar10 = (tqw) this.c;
                hm5.M(obj);
                if (bwb0Var != null) {
                    ((lzn0) ((yxb0) this.d).c).a(bwb0Var.b, cvl1.d(tqwVar10), (Bundle) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 18:
                qj0 qj0Var = (qj0) this.d;
                svh0 svh0Var2 = (svh0) qj0Var.e;
                w5d0 w5d0Var = (w5d0) this.b;
                tqw tqwVar11 = (tqw) this.c;
                hm5.M(obj);
                int iOrdinal2 = w5d0Var.ordinal();
                if (iOrdinal2 == 0) {
                    svh0Var2.i();
                    return rih1Var;
                }
                if (iOrdinal2 == 1) {
                    svh0Var2.i();
                    ((lzn0) qj0Var.d).a(nik1.u4.a, cvl1.d(tqwVar11), (Bundle) null);
                    return rih1Var;
                }
                if (iOrdinal2 == 2) {
                    return rih1Var;
                }
                eg.o();
                return null;
            case 19:
                res resVar = (res) this.d;
                u9d0 u9d0Var = (u9d0) this.b;
                tqw tqwVar12 = (tqw) this.c;
                hm5.M(obj);
                if (u9d0Var instanceof t9d0) {
                    hqn1.q((lzn0) resVar.d, nik1.u4.a, tqwVar12, (Bundle) null);
                    return rih1Var;
                }
                if (u9d0Var instanceof s9d0) {
                    ((i9i1) resVar.g).b(((s9d0) u9d0Var).a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 20:
                tfd0 tfd0Var = (tfd0) this.b;
                tqw tqwVar13 = (tqw) this.c;
                hm5.M(obj);
                ((bgd0) this.d).c.invoke(tfd0Var, tqwVar13 != null ? n3o1.y(tqwVar13) : null);
                return rih1Var;
            case 21:
                emd0 emd0Var = (emd0) this.b;
                tqw tqwVar14 = (tqw) this.c;
                hm5.M(obj);
                if (emd0Var != null) {
                    hqn1.q((lzn0) ((et90) this.d).d, emd0Var.b, tqwVar14, (Bundle) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 22:
                uud0 uud0Var = (uud0) this.b;
                tud0 tud0Var = (tud0) this.c;
                hm5.M(obj);
                if (tud0Var == null) {
                    eg.o();
                    return null;
                }
                yud0 yud0Var = (yud0) this.d;
                String str7 = uud0Var.a;
                Flowable flowable = yud0Var.a;
                Completable completableB = ydh.f(flowable, flowable).B(new upa0(yud0Var, (byte) 9));
                c1f1 c1f1Var = yud0Var.b;
                c1f1Var.getClass();
                Uri uri = Uri.parse(str7);
                g341 g341Var = c1f1Var.a;
                uri.getClass();
                completableB.c(g341Var.b(uri).observeOn(c1f1Var.c).doOnSuccess(new z2a1(c1f1Var, (byte) 15)).ignoreElement()).n(yud0Var.c).subscribe();
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                t6k0 t6k0Var = (t6k0) this.d;
                bnj0 bnj0Var = (bnj0) t6k0Var.g;
                r7j0 r7j0Var = (r7j0) t6k0Var.e;
                n6k0 n6k0Var = (n6k0) this.b;
                tqw tqwVar15 = (tqw) this.c;
                hm5.M(obj);
                switch (n6k0Var.ordinal()) {
                    case 0:
                        r7j0Var.invoke(new p3k0(tqwVar15 != null ? n3o1.y(tqwVar15) : null));
                        return rih1Var;
                    case 1:
                        r7j0Var.invoke(new d2k0(tqwVar15 != null ? n3o1.y(tqwVar15) : null));
                        return rih1Var;
                    case 2:
                        r7j0Var.invoke(q3k0.a);
                        return rih1Var;
                    case 3:
                        r7j0Var.invoke(new d3k0(tqwVar15 != null ? n3o1.y(tqwVar15) : null));
                        return rih1Var;
                    case 4:
                        r7j0Var.invoke(new t2k0(tqwVar15 != null ? n3o1.y(tqwVar15) : null));
                        return rih1Var;
                    case 5:
                        r7j0Var.invoke(new i4k0(bnj0Var.q().a.a));
                        return rih1Var;
                    case 6:
                        r7j0Var.invoke(new m3k0(bnj0Var.p().a.a));
                        return rih1Var;
                    default:
                        eg.o();
                        return null;
                }
            case 24:
                cak0 cak0Var = (cak0) this.b;
                bak0 bak0Var = (bak0) this.c;
                hm5.M(obj);
                if (bak0Var == null) {
                    eg.o();
                    return null;
                }
                ijf1 ijf1Var = bak0Var.a;
                cak0Var.h.invoke(ijf1Var);
                cak0Var.g.invoke(new Integer(bak0Var.b), Boolean.valueOf(bak0Var.c));
                ((r7j0) ((nm1) this.d).f).invoke(new h4k0(ijf1Var, bak0Var.b, bak0Var.c, false, 2));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                r7j0 r7j0Var2 = (r7j0) ((nm1) this.d).g;
                lak0 lak0Var = (lak0) this.b;
                tqw tqwVar16 = (tqw) this.c;
                hm5.M(obj);
                int iOrdinal3 = lak0Var.ordinal();
                if (iOrdinal3 == 0) {
                    r7j0Var2.invoke(new r1k0(tqwVar16 != null ? n3o1.y(tqwVar16) : null));
                    return rih1Var;
                }
                if (iOrdinal3 == 1) {
                    r7j0Var2.invoke(new r3k0(tqwVar16 != null ? n3o1.y(tqwVar16) : null));
                    return rih1Var;
                }
                if (iOrdinal3 == 2) {
                    r7j0Var2.invoke(e3k0.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 26:
                lkm0 lkm0Var = (lkm0) this.b;
                tqw tqwVar17 = (tqw) this.c;
                hm5.M(obj);
                tv80VarConcat = tqwVar17 != null ? n3o1.y(tqwVar17) : null;
                if (tv80VarConcat != null) {
                    ((fhk0) ((ng20) this.d).e).invoke(lkm0Var, tv80VarConcat);
                } else {
                    n57.e("Missing InteractionLoggingResult for MoreLikeElement event: " + lkm0Var);
                }
                return rih1Var;
            case 27:
                b6n0 b6n0Var = (b6n0) this.d;
                m5n0 m5n0Var = (o5n0) this.b;
                tqw tqwVar18 = (tqw) this.c;
                hm5.M(obj);
                if (m5n0Var instanceof m5n0) {
                    String str8 = m5n0Var.a;
                    if (str8.length() <= 0) {
                        return rih1Var;
                    }
                    b6n0Var.f.a(str8, tqwVar18 != null ? n3o1.y(tqwVar18) : null, (Bundle) null);
                    return rih1Var;
                }
                if (!(m5n0Var instanceof n5n0)) {
                    eg.o();
                    return null;
                }
                p410 p410Var = b6n0Var.d;
                fn31.T((llm) p410Var.h, (q8n) p410Var.e, 0, new l4f0(((n5n0) m5n0Var).a, p410Var, tqwVar18 != null ? n3o1.y(tqwVar18) : null, (lnm) null, (byte) 12), 2);
                return rih1Var;
            case 28:
                lzn0 lzn0Var2 = ((itn0) this.d).a;
                tsn0 tsn0Var = (tsn0) this.b;
                tqw tqwVar19 = (tqw) this.c;
                hm5.M(obj);
                tv80 tv80VarY2 = tqwVar19 != null ? n3o1.y(tqwVar19) : null;
                if (tsn0Var != null) {
                    btn0 btn0Var = tsn0Var.a;
                    lik1 lik1Var = btn0Var.c;
                    xsn0 xsn0Var = btn0Var.f;
                    if (xsn0Var instanceof zsn0) {
                        ssn0 ssn0Var = itn0.i;
                        p1f0 p1f0VarW = rrn1.w(lik1Var.a);
                        p1f0VarW.k();
                        p1f0VarW.B(tv80VarY2);
                        a690 a690Var = b690.a;
                        p1f0VarW.p();
                        lzn0Var2.f(p1f0VarW.h());
                        return rih1Var;
                    }
                    if (xsn0Var instanceof xsn0) {
                        if (((Boolean) xsn0Var.a.invoke(tv80VarY2)).booleanValue()) {
                            return rih1Var;
                        }
                        ssn0 ssn0Var2 = itn0.i;
                        p1f0 p1f0VarW2 = rrn1.w(lik1Var.a);
                        p1f0VarW2.k();
                        p1f0VarW2.B(tv80VarY2);
                        a690 a690Var2 = b690.a;
                        p1f0VarW2.p();
                        lzn0Var2.f(p1f0VarW2.h());
                        return rih1Var;
                    }
                    if (xsn0Var instanceof ysn0) {
                        return rih1Var;
                    }
                    eg.o();
                } else {
                    eg.o();
                }
                return null;
            default:
                w2c1 w2c1Var = (y1c1) this.d;
                bmo0 bmo0Var = (bmo0) this.b;
                ulo0 ulo0Var = (ulo0) this.c;
                hm5.M(obj);
                if (!u890.j(ulo0Var, ulo0.a) || !bmo0Var.c.equals(eh10.R0)) {
                    return rih1Var;
                }
                amo0 amo0Var = bmo0Var.b;
                if (amo0Var instanceof zlo0) {
                    w2c1Var.T(fmo0.c);
                    return rih1Var;
                }
                if (amo0Var instanceof ylo0) {
                    w2c1Var.T(fmo0.d);
                    return rih1Var;
                }
                eg.o();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ skv(int i, lnm lnmVar) {
        super(i, lnmVar);
        this.a = (byte) 4;
    }
}
