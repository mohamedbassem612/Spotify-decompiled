package p;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.ViewGroup;
import com.spotify.libraryimportservice.tmm.UnmatchedItem;
import com.spotify.nowplaying.scroll.ScrollCardType;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q0g0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0g0(Object obj, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        int i = 2;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                y9g1.g((p0g0) obj4, (j2i) obj3, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1g0 l1g0Var = (l1g0) obj4;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    t3k1.a(l1g0Var.b, new eq80(new e3h1(l1g0Var.f, (n7h1) null, l1g0Var.e)), new m1g0(l1g0Var.l, l1g0Var.n, (b7p0) l1g0Var.o.get(), l1g0Var.q, ((j1g0) obj3).getLegacyViews()), x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                t3k1.j((n1g0) obj4, (j2i) obj3, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                kln1.g((h7g0) obj4, (md1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj3;
                o3e0 o3e0Var = (o3e0) obj4;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    j2i j2iVar = ezi.a;
                    boolean zI = x340Var4.i(o3e0Var) | x340Var4.g(iu30Var);
                    Object objT = x340Var4.T();
                    if (zI || objT == fkj0.X) {
                        objT = new bsc0(o3e0Var, iu30Var, (byte) 27);
                        x340Var4.s0(objT);
                    }
                    bzn1.e((qim0) null, j2iVar, false, (vu30) null, rgr0.a, (ngr0) null, (ygr0) null, (Function0) objT, x340Var4, 48, 109);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    plg0 plg0Var = (plg0) obj4;
                    iu30 iu30Var2 = (iu30) obj3;
                    Object objT2 = x340Var6.T();
                    if (objT2 == fkj0.X) {
                        objT2 = wlg0.g;
                        x340Var6.s0(objT2);
                    }
                    irn1.d(plg0Var, iu30Var2, s161.b(nim0Var, false, (iu30) objT2), x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    gmg0 gmg0Var = (gmg0) obj4;
                    iu30 iu30Var3 = (iu30) obj3;
                    Object objT3 = x340Var8.T();
                    if (objT3 == fkj0.X) {
                        objT3 = wlg0.W0;
                        x340Var8.s0(objT3);
                    }
                    lrn1.c(gmg0Var, iu30Var3, s161.b(nim0Var, false, (iu30) objT3), x340Var8, 0);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 7:
                y3h1 y3h1Var = (y3h1) obj;
                ((Number) obj2).intValue();
                m6m cxq0Var = y3h1Var.a;
                j1r result = cxq0Var.getResult();
                if (result == null) {
                    return y3h1Var;
                }
                if ((result instanceof h1r) && hso1.U(((h1r) result).a)) {
                    result = j1r.a;
                }
                if (result instanceof j1r) {
                    uyl uylVar = (uyl) obj4;
                    if (uylVar != null) {
                        cxq0Var = new cxq0(cxq0Var, uylVar);
                    }
                } else if (result instanceof h1r) {
                    uyl uylVar2 = (uyl) obj3;
                    if (uylVar2 != null) {
                        cxq0Var = new cxq0(cxq0Var, uylVar2);
                    }
                } else if (!(result instanceof i1r)) {
                    eg.o();
                    return null;
                }
                return y3h1.a(y3h1Var, cxq0Var, (xu30) null, (vu30) null, 14);
            case 8:
                ((Number) obj2).intValue();
                f0o1.c((xtg0) obj4, (qim0) obj3, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 9:
                byg0 byg0Var = (byg0) obj4;
                dg30 dg30Var = (dg30) obj3;
                jzm jzmVar = new jzm(byg0Var, (String) obj, (tqw) obj2, dg30Var, (byte) 29);
                h72 h72Var = byg0Var.n;
                if (h72Var != null) {
                    h72Var.Q(p7h.M(new ObjectAnimator[]{(ObjectAnimator) h72Var.c, (ObjectAnimator) h72Var.e, (ObjectAnimator) h72Var.i, (ObjectAnimator) h72Var.g, (ObjectAnimator) h72Var.X}), new lwg0(jzmVar, dg30Var, (byte) 1), hlv.a, 300L);
                } else {
                    jzmVar.invoke();
                }
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                ((j7s) obj4).d((Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                ((m7h0) obj4).d((Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                ((xu30) obj4).invoke(((UnmatchedItem) obj3).getId(), (String) obj, bool);
                return rih1Var;
            case 13:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ((iuj) ((kly0) ((nm1) obj4).g).get()).a(new hvl1(((xdh0) obj3).a.b, 254, (String) null, (String) null, false, (String) null), x340Var10, 0);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 14:
                return ((lxh0) obj).i((String) obj2, (String) obj4, (Bundle) obj3);
            case 15:
                lxh0 lxh0Var = (lxh0) obj;
                String str = (String) obj2;
                rhe1 rhe1Var = (esz0) obj3;
                ((wph0) obj4).getClass();
                if (!rhe1Var.b) {
                    i = 3;
                } else if (rhe1Var.c) {
                    i = 1;
                }
                return lxh0Var.h(i, str);
            case 16:
                ((Number) obj2).intValue();
                boo1.h((z9i0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                rbi0 rbi0Var = (rbi0) obj4;
                epb1 epb1Var = new epb1((zob1) obj);
                ajq0 ajq0Var = (ajq0) obj3;
                t3p t3pVar = rbi0Var.a;
                ebi0 ebi0Var = new ebi0(new har0(rbi0Var.f.b), rbi0Var.g.g(), false, false, 54);
                kko kkoVar = (kko) ajq0Var.a;
                qa2 qa2Var = rbi0Var.c;
                qa2 qa2Var2 = rbi0Var.b;
                klv0 klv0Var = (klv0) ajq0Var.b;
                d4p d4pVar = (d4p) t3pVar.a.c;
                clm clmVar = (clm) d4pVar.j.get();
                nwt nwtVar = (nwt) d4pVar.v.get();
                yqg yqgVar = (yqg) d4pVar.d.get();
                fza fzaVar = new fza((byte) 11, false);
                m8c m8cVar = d4pVar.a;
                gw70 gw70VarB = m8cVar.b();
                c8o.l(gw70VarB);
                iuj iujVar = (iuj) d4pVar.G.get();
                l0x0 l0x0VarH = d4pVar.h();
                myq0 myq0VarE = d4pVar.e();
                aru0 aru0VarF = d4pVar.f();
                cua cuaVar = new cua((byte) 17);
                ycm ycmVarD = m8cVar.d();
                c8o.l(ycmVarD);
                aru0 aru0VarD = d4pVar.d();
                luk lukVarC = m8cVar.c();
                c8o.l(lukVarC);
                tbw0 tbw0VarM = iwv0.m(new o35(lukVarC), d4pVar.A, d4pVar.B);
                hvp0 hvp0VarG = d4pVar.g();
                ytp0 ytp0Var = new ytp0((yqg) d4pVar.d.get());
                tiv0 tiv0Var = (tiv0) d4pVar.i.get();
                e9g1 e9g1Var = (e9g1) m8cVar.A0.get();
                c8o.l(e9g1Var);
                vgm vgmVarE = m8cVar.e();
                c8o.l(vgmVarE);
                lzn0 lzn0VarI = m8cVar.i();
                c8o.l(lzn0VarI);
                yh2 yh2Var = (yh2) m8cVar.o0.get();
                c8o.l(yh2Var);
                vb2 vb2Var = (vb2) m8cVar.p0.get();
                c8o.l(vb2Var);
                qns0 qns0Var = (qns0) m8cVar.q0.get();
                c8o.l(qns0Var);
                zr00 zr00Var = (zr00) m8cVar.r0.get();
                c8o.l(zr00Var);
                y390 y390Var = (y390) m8cVar.s0.get();
                c8o.l(y390Var);
                return new aso(f6o1.A(new kpg0(rbi0Var.d, new uah0(new pzw(ebi0Var, epb1Var, kkoVar, qa2Var, qa2Var2, klv0Var, clmVar, nwtVar, yqgVar, fzaVar, gw70VarB, iujVar, l0x0VarH, myq0VarE, aru0VarF, cuaVar, ycmVarD, aru0VarD, tbw0VarM, hvp0VarG, ytp0Var, tiv0Var, e9g1Var, vgmVarE, lzn0VarI, new ytp0((Object) yh2Var, (Object) zr00Var, (Object) y390Var.a(d4pVar.c(), r6h1.c), (Object) qns0Var, (Object) vb2Var, (byte) 11)), rbi0Var, (byte) 8)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new z8b0(rbi0Var, (byte) 19));
            case 18:
                tka0 tka0Var = (tka0) obj;
                xuh1 xuh1VarV = (xuh1) obj2;
                p731 p731Var = (p731) ((n0o) obj4).g;
                if (p731Var != null) {
                    String str2 = ((mey0) obj3).c;
                    if (tka0Var != null) {
                        xuh1VarV = dko1.v(tka0Var);
                    }
                    p731Var.b(str2, xuh1VarV);
                }
                return rih1Var;
            case 19:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    p2o1.i((hob1) obj4, (qim0) null, (vu30) obj3, x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 20:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    bth.d((qim0) null, (String) obj4, (jiv0) obj3, 2, x340Var14, 3072, 1);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 21:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    idm idmVar = ((wdi0) obj4).g;
                    wcm wcmVar = ((odi0) obj3).i;
                    Object objT4 = x340Var16.T();
                    if (objT4 == fkj0.X) {
                        objT4 = z7i0.e;
                        x340Var16.s0(objT4);
                    }
                    otw.c(idmVar, wcm.a(wcmVar, (Function0) objT4, (nx2) null, false, (String) null, 1007), (qim0) null, (ipb1) null, x340Var16, 0, 12);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 22:
                tka0 tka0Var2 = (tka0) obj;
                xuh1 xuh1VarV2 = (xuh1) obj2;
                p731 p731Var2 = (p731) ((el9) obj4).i;
                if (p731Var2 != null) {
                    String str3 = ((mey0) obj3).c;
                    if (tka0Var2 != null) {
                        xuh1VarV2 = dko1.v(tka0Var2);
                    }
                    p731Var2.b(str3, xuh1VarV2);
                }
                return rih1Var;
            case 23:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    otw.c((maa) ((idd1) ((iz0) obj4).f).getValue(), (wcm) obj3, (qim0) null, (ipb1) null, x340Var18, 0, 12);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 24:
                bgi0 bgi0Var = (bgi0) obj4;
                return new kpg0(bgi0Var.a.b(new z8i0(bgi0Var, (byte) 6), new epb1((zob1) obj), (kko) ((m7y0) ((tkt) obj3).e).b, null, new uei0(true, new har0(bgi0Var.c.b), true, false, false, false, false, false, false, 8120), (6016 & 32) != 0 ? new cgi0(63) : new cgi0(31), bgi0Var.e, null, null, null, null, bgi0Var.b, null), pfi0.d);
            case 25:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ((iuj) ((kly0) obj4).get()).a(((igi0) obj3).c, x340Var20, 0);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 26:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ((iuj) ((kly0) obj4).get()).a(((pii0) obj3).c, x340Var22, 0);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 27:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    oni0 oni0Var = (oni0) obj3;
                    otw.c((h730) obj4, new d730(oni0Var.a, oni0Var.b), (qim0) null, (ipb1) null, x340Var24, 8, 12);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 28:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    oni0 oni0Var2 = (oni0) obj3;
                    otw.c((e3a) obj4, new b3a(oni0Var2.a, oni0Var2.b), (qim0) null, (ipb1) null, x340Var26, 8, 12);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                kto1.k((uji0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0g0(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
