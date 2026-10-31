package p;

import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.player.model.Restrictions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ziz0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ziz0(zl5 zl5Var, String str) {
        super(2);
        this.a = (byte) 29;
        this.b = zl5Var;
    }

    private final Object a(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            eqr0.b(0, 0, cwl1.o0(x340Var2, b2p1.A((sc11) this.b)), x340Var2, uyn1.y(nim0.a, 16.0f, 8.0f));
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        vwz0 vwz0Var = (vwz0) this.b;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean zG = x340Var2.g(vwz0Var);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                objT = new vwz0(vwz0Var, (byte) 15);
                x340Var2.s0(objT);
            }
            wro1.h(new gbx(z50.c, (Function0) objT), ldx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, rcj.a, x340Var2, 48, 6, 1020);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    private final Object e(Object obj, Object obj2) {
        yi11 yi11Var = (yi11) obj2;
        String str = yi11Var.a;
        Restrictions restrictions = yi11Var.b;
        fvf1 fvf1Var = yi11Var.c;
        tig0 tig0Var = yi11Var.d;
        boolean z = tig0Var instanceof rig0;
        gj11 gj11Var = (gj11) this.b;
        t380 t380VarDisallowSkippingPrevReasons = restrictions.disallowSkippingPrevReasons();
        t380 t380VarDisallowSeekingReasons = restrictions.disallowSeekingReasons();
        rh11 rh11Var = gj11Var.e;
        boolean zE = rh11Var.e();
        dj11 bj11Var = cj11.a;
        dj11 dj11Var = aj11.a;
        if (zE || rh11Var.a() || z) {
            if (!t380VarDisallowSkippingPrevReasons.isEmpty() && !t380VarDisallowSeekingReasons.isEmpty()) {
                Set set = gj11.X;
                if (t380VarDisallowSkippingPrevReasons.equals(set) && rh11Var.a()) {
                    bj11Var = new bj11(z);
                } else if (t380VarDisallowSeekingReasons.equals(set) && rh11Var.e()) {
                    bj11Var = new bj11(z);
                } else if (z && (t380VarDisallowSkippingPrevReasons.equals(set) || t380VarDisallowSeekingReasons.equals(set))) {
                    bj11Var = new bj11(true);
                } else {
                    bj11Var = dj11Var;
                }
            }
        } else if (!t380VarDisallowSkippingPrevReasons.isEmpty() && !t380VarDisallowSeekingReasons.isEmpty()) {
            bj11Var = dj11Var;
        }
        return new zi11(str, bj11Var, fvf1Var, tig0Var);
    }

    private final Object f(Object obj, Object obj2) {
        hyy0 hyy0Var;
        zob1 zob1Var = (zob1) obj;
        k811 k811Var = (k811) this.b;
        rpv0 rpv0Var = (rpv0) k811Var.b;
        xpw xpwVarA = ((rk11) k811Var.d).a(zob1Var, new xho((kko) k811Var.c), 1);
        switch (((svp) rpv0Var.b).a) {
            case 0:
                hyy0Var = new hyy0(zob1Var, xpwVarA, (byte) 20);
                break;
            default:
                hyy0Var = new hyy0(zob1Var, xpwVarA, (byte) 20);
                break;
        }
        return new jpg0(f6o1.A(new yup0((xpw) hyy0Var.c, (zob1) hyy0Var.b), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), ej11.N0);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x018c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:84:0x013f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0186  */
    /* JADX WARN: Code duplicated, block: B:99:0x0189  */
    private final Object g(Object obj, Object obj2) {
        String str;
        Iterator it;
        String str2;
        hoj0 hoj0VarC;
        String str3;
        String str4;
        jm11 jm11Var;
        String strValueOf;
        goj0 goj0VarA;
        zoy0 zoy0Var;
        goj0 goj0VarA2;
        xkk1 xkk1Var;
        mq70 mq70Var;
        up70 up70VarA;
        goj0 goj0VarA3;
        xkk1 xkk1Var2;
        mq70 mq70Var2;
        goj0 goj0VarA4;
        zoy0 zoy0Var2;
        goj0 goj0VarA5;
        lm11 lm11Var = (lm11) obj;
        ioj0 ioj0Var = (ioj0) obj2;
        Context context = (Context) ((ug3) this.b).b;
        hvl1 hvl1Var = lm11Var.a;
        List list = lm11Var.b;
        if (list.isEmpty()) {
            return new wmb1("more_by", hvl1Var);
        }
        List<mo11> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Iterator it2 = list2.iterator(); it2.hasNext(); it2 = it) {
            mo11 mo11Var = (mo11) it2.next();
            String str5 = mo11Var.a;
            ArrayList arrayList2 = mo11Var.b;
            hoj0 hoj0VarC2 = ioj0Var.c(jo70.class, str5);
            if (hoj0VarC2 != null) {
                goj0 goj0VarA6 = hoj0VarC2.a();
                str = goj0VarA6 != null ? ((jo70) goj0VarA6.a).a : null;
            } else {
                str = null;
            }
            String str6 = (hoj0VarC2 == null || (goj0VarA5 = hoj0VarC2.a()) == null) ? null : ((jo70) goj0VarA5.a).b;
            hoj0 hoj0VarC3 = ioj0Var.c(zoy0.class, str5);
            jxp0 jxp0Var = (hoj0VarC3 == null || (goj0VarA4 = hoj0VarC3.a()) == null || (zoy0Var2 = (zoy0) goj0VarA4.a) == null) ? null : zoy0Var2.b;
            hoj0 hoj0VarC4 = ioj0Var.c(xkk1.class, str5);
            if (hoj0VarC4 == null || (goj0VarA3 = hoj0VarC4.a()) == null || (xkk1Var2 = (xkk1) goj0VarA3.a) == null || (mq70Var2 = xkk1Var2.a) == null) {
                it = it2;
            } else {
                it = it2;
                up70 up70VarA2 = mq70Var2.a(vp70.c);
                str2 = up70VarA2 != null ? up70VarA2.a.a : null;
                hoj0VarC = ioj0Var.c(xkk1.class, str5);
                if (hoj0VarC != null || (goj0VarA2 = hoj0VarC.a()) == null || (xkk1Var = (xkk1) goj0VarA2.a) == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.b)) == null) {
                    str3 = null;
                } else {
                    str3 = up70VarA.a.a;
                }
                if (str2 == null) {
                    str4 = str3;
                } else {
                    str4 = str2;
                }
                if (str != null || str4 == null || jxp0Var == null) {
                    jm11Var = null;
                } else {
                    boolean zContains = arrayList2.contains(vv11.c);
                    boolean zContains2 = arrayList2.contains(vv11.b);
                    if (zContains) {
                        strValueOf = context.getString(2131952201);
                    } else if (zContains2) {
                        strValueOf = context.getString(2131952179);
                    } else {
                        hoj0 hoj0VarC5 = ioj0Var.c(zoy0.class, str5);
                        if (hoj0VarC5 == null || (goj0VarA = hoj0VarC5.a()) == null || (zoy0Var = (zoy0) goj0VarA.a) == null) {
                            strValueOf = "";
                        } else {
                            xoy0 xoy0Var = (yoy0) zoy0Var.b.b;
                            if (xoy0Var instanceof xoy0) {
                                strValueOf = String.valueOf(xoy0Var.a);
                            } else if (xoy0Var instanceof woy0) {
                                strValueOf = String.valueOf(((woy0) xoy0Var).a);
                            } else {
                                strValueOf = xoy0Var instanceof voy0 ? String.valueOf(((voy0) xoy0Var).a) : "";
                            }
                            if (strValueOf == null) {
                                strValueOf = "";
                            }
                        }
                    }
                    strValueOf.getClass();
                    jm11Var = new jm11(new etd(str4, str, o7h.y0(f46.i0(new String[]{strValueOf.length() == 0 ? null : strValueOf, str6}), " • ", (String) null, (String) null, (iu30) null, 62), mo11Var.a, (List) null, str, zContains ? "upcoming_release" : zContains2 ? "latest_release" : "default", 272));
                }
                if (jm11Var != null) {
                    arrayList.add(jm11Var);
                }
            }
            hoj0VarC = ioj0Var.c(xkk1.class, str5);
            if (hoj0VarC != null) {
                str3 = null;
            } else {
                str3 = null;
            }
            if (str2 == null) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            if (str != null) {
                jm11Var = null;
            } else {
                jm11Var = null;
            }
            if (jm11Var != null) {
                arrayList.add(jm11Var);
            }
        }
        if (!arrayList.isEmpty()) {
            return new kmb1("more_by", arrayList, hvl1Var);
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(list2, 10));
        for (mo11 mo11Var2 : list2) {
            arrayList3.add(km11.a);
        }
        return new pmb1("more_by", arrayList3, hvl1Var);
    }

    private final Object h(Object obj, Object obj2) {
        en11 en11Var;
        r7m r7mVar = (r7m) this.b;
        wvp wvpVar = (wvp) r7mVar.c;
        epb1 epb1Var = new epb1((zob1) obj);
        kko kkoVar = (kko) r7mVar.b;
        lik1 lik1Var = new lik1("spotify:npv:related-audio-card");
        switch (wvpVar.a) {
            case 0:
                nwp nwpVar = (nwp) wvpVar.b.c;
                gw70 gw70VarA0 = nwpVar.a.a0();
                c8o.l(gw70VarA0);
                en11Var = new en11(gw70VarA0, (yvp) nwpVar.c1.get(), (lzn0) nwpVar.G.get(), kkoVar, lik1Var, epb1Var);
                break;
            default:
                thq thqVar = wvpVar.b;
                gw70 gw70Var = (gw70) thqVar.b.d8.get();
                v5q v5qVar = thqVar.c;
                en11Var = new en11(gw70Var, (yvp) v5qVar.w9.get(), (lzn0) v5qVar.U0.get(), kkoVar, lik1Var, epb1Var);
                break;
        }
        return new bs0((iu30) new ak01(r7mVar, (byte) 22), (iu30) hm11.R0, (wpw) f6o1.A(en11Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3));
    }

    private final Object i(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            ven0 ven0VarB = b2p1.B(((ro11) this.b).b, "", x340Var2, 48);
            if (((String) ven0VarB.getValue()).length() > 0) {
                x340Var2.i0(-885467527);
                nyx.a(2, (wux) null, apo.r(-1188583690, new xd2(ven0VarB, (byte) 18), x340Var2), x340Var2, 3078, 6);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-885374310);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2) {
        ((qp11) this.b).f.T(new cjt0(((Number) obj).longValue(), (tv80) obj2));
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:139:0x0313  */
    /* JADX WARN: Code duplicated, block: B:141:0x0317  */
    /* JADX WARN: Code duplicated, block: B:142:0x031b  */
    /* JADX WARN: Code duplicated, block: B:149:0x032b  */
    /* JADX WARN: Code duplicated, block: B:152:0x033a  */
    /* JADX WARN: Code duplicated, block: B:165:0x035c  */
    /* JADX WARN: Code duplicated, block: B:168:0x0365  */
    /* JADX WARN: Code duplicated, block: B:169:0x036a  */
    /* JADX WARN: Code duplicated, block: B:175:0x0377  */
    /* JADX WARN: Code duplicated, block: B:178:0x037b  */
    /* JADX WARN: Code duplicated, block: B:183:0x038b  */
    /* JADX WARN: Code duplicated, block: B:185:0x038e  */
    /* JADX WARN: Code duplicated, block: B:242:0x0481  */
    /* JADX WARN: Code duplicated, block: B:378:0x05ec A[PHI: r1
      0x05ec: PHI (r1v105 java.lang.String) = (r1v104 java.lang.String), (r1v106 java.lang.String) binds: [B:380:0x05f2, B:377:0x05e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:379:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:384:0x0606  */
    /* JADX WARN: Code duplicated, block: B:386:0x0613 A[PHI: r11
      0x0613: PHI (r11v57 java.util.List) = (r11v52 java.util.List), (r11v58 java.util.List) binds: [B:404:0x0646, B:385:0x0611] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:387:0x0616  */
    /* JADX WARN: Code duplicated, block: B:389:0x061b  */
    /* JADX WARN: Code duplicated, block: B:390:0x061d  */
    /* JADX WARN: Code duplicated, block: B:402:0x0643  */
    /* JADX WARN: Code duplicated, block: B:404:0x0646  */
    /* JADX WARN: Code duplicated, block: B:406:0x0652  */
    /* JADX WARN: Code duplicated, block: B:408:0x0658  */
    /* JADX WARN: Code duplicated, block: B:411:0x0672 A[LOOP:0: B:409:0x066c->B:411:0x0672, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:414:0x0690 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:415:0x0692  */
    /* JADX WARN: Code duplicated, block: B:417:0x069c  */
    /* JADX WARN: Code duplicated, block: B:418:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:420:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:421:0x06bb A[PHI: r1
      0x06bb: PHI (r1v125 p.ce71) = (r1v124 p.ce71), (r1v124 p.ce71), (r1v124 p.ce71), (r1v124 p.ce71), (r1v133 p.ce71) binds: [B:423:0x06c0, B:424:0x06c2, B:426:0x06ce, B:441:0x06f9, B:419:0x06a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:422:0x06be  */
    /* JADX WARN: Code duplicated, block: B:424:0x06c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:428:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:440:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:442:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:444:0x0703 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:449:0x070f  */
    /* JADX WARN: Code duplicated, block: B:451:0x0713  */
    /* JADX WARN: Code duplicated, block: B:462:0x072e  */
    /* JADX WARN: Code duplicated, block: B:466:0x0737  */
    /* JADX WARN: Code duplicated, block: B:469:0x0748  */
    /* JADX WARN: Code duplicated, block: B:475:0x0755  */
    /* JADX WARN: Code duplicated, block: B:478:0x075b  */
    /* JADX WARN: Code duplicated, block: B:483:0x076b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0277  */
    /* JADX WARN: Code duplicated, block: B:98:0x0279  */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        Uri uri;
        long j;
        int i;
        String str;
        boolean zF;
        blc0 blc0Var;
        String strC;
        blc0 blc0Var2;
        String str2;
        String strY0;
        zwm1 zwm1Var;
        jw01 jw01Var;
        String str3;
        String strA;
        String strF;
        List list;
        ho70 ho70Var;
        String str4;
        String quantityString;
        String strF2;
        int i2;
        boolean z;
        String str5;
        io70 io70Var;
        boolean z2;
        List list2;
        String str6;
        gv01 gv01Var;
        xkk1 xkk1Var;
        String str7;
        List listSingletonList;
        mq70 mq70Var;
        List list3;
        ce71 ce71Var;
        String str8;
        gkt hktVar;
        mq70 mq70Var2;
        gkt gktVar;
        String str9;
        String str10;
        boolean z3;
        boolean z4;
        jv01 jv01Var;
        ft01 ft01Var;
        String str11;
        String strA2;
        jw01 jw01Var2;
        String str12;
        ArrayList arrayList;
        ce71 ce71Var2;
        String str13;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    w0h1.a(((Boolean) obj3).booleanValue() ? aux.c : ztx.c, new jsl(cwl1.o0(x340Var2, 2131959020)), (qim0) null, 0L, 0L, false, x340Var2, 8, 60);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((tbr0) obj3).a(new y231(new hrz0(new v0a((List) obj, (String) obj2))));
                return rih1Var;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                jtz0 jtz0Var = (jtz0) obj3;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objT = x340Var4.T();
                    if (objT == fkj0.X) {
                        mzr0 mzr0Var = jtz0Var.d;
                        objT = new guz0((kdy0) mzr0Var.a, (t8r0) mzr0Var.b, (lzn0) mzr0Var.c, (kt91) mzr0Var.d, (Context) mzr0Var.f, (uu00) mzr0Var.e, (zwz0) mzr0Var.g);
                        x340Var4.s0(objT);
                    }
                    guz0 guz0Var = (guz0) objT;
                    muz0 muz0Var = jtz0Var.e;
                    otw.c(guz0Var, new xtz0(muz0Var.d, muz0Var.a), (qim0) null, (ipb1) null, x340Var4, 0, 12);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 3:
                wzz0 wzz0Var = (wzz0) obj;
                e001 e001Var = (e001) obj2;
                String str14 = ((h001) obj3).Y;
                qzz0 qzz0Var = wzz0Var.m;
                String str15 = wzz0Var.h;
                vzz0 vzz0Var = wzz0Var.b;
                vzz0 vzz0Var2 = wzz0Var.a;
                uzz0 uzz0Var = wzz0Var.f;
                if (uzz0Var instanceof szz0) {
                    return new a001(wzz0Var.c, new xzz0(vzz0Var2, vzz0Var, str14, str15.length() == 0), wzz0Var.d, h001.e(wzz0Var), qzz0Var);
                }
                if (uzz0Var instanceof rzz0) {
                    return new yzz0(wzz0Var.c, ((rzz0) uzz0Var).a, wzz0Var.d, new xzz0(vzz0Var2, vzz0Var, str14, str15.length() == 0), h001.e(wzz0Var), wzz0Var.g, qzz0Var);
                }
                if (e001Var instanceof c001) {
                    return new yzz0(wzz0Var.c, true, wzz0Var.d, new xzz0(vzz0Var2, vzz0Var, str14, str15.length() == 0), h001.e(wzz0Var), wzz0Var.g, qzz0Var);
                }
                if (!(e001Var instanceof d001)) {
                    return new a001(wzz0Var.c, new xzz0(vzz0Var2, vzz0Var, str14, str15.length() == 0), wzz0Var.d, h001.e(wzz0Var), qzz0Var);
                }
                d001 d001Var = (d001) e001Var;
                return new zzz0(d001Var.a, wzz0Var.c, d001Var.c, d001Var.d, new xzz0(vzz0Var2, vzz0Var, str14, str15.length() == 0), wzz0Var.d, wzz0Var.e, uzz0Var, h001.e(wzz0Var), wzz0Var.g, wzz0Var.i, qzz0Var, d001Var.e, wzz0Var.l, wzz0Var.n, wzz0Var.o);
            case 4:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                m001 m001Var = (m001) obj3;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Iterator it = m001Var.b.a.iterator();
                    if (it.hasNext()) {
                        throw pze0.g(it);
                    }
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                boolean zY = x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2);
                rih1 rih1Var2 = rih1.a;
                if (!zY) {
                    x340Var8.b0();
                    return rih1Var2;
                }
                u001 u001Var = (u001) obj3;
                Object objT2 = x340Var8.T();
                if (objT2 == fkj0.X) {
                    dnq dnqVar = u001Var.c;
                    w001 w001Var = u001Var.b;
                    String str16 = w001Var.a;
                    String str17 = w001Var.b;
                    los losVar = u001Var.d;
                    uw0 uw0Var = (uw0) dnqVar.a.c;
                    umq umqVar = (umq) ((jly0) uw0Var.i).get();
                    jly0 jly0Var = (jly0) uw0Var.N0;
                    v001 v001Var = (v001) uw0Var.d;
                    bnq bnqVar = (bnq) jly0Var.get();
                    pux0 pux0VarH = uw0Var.H();
                    txz0 txz0Var = (txz0) v001Var.c.get();
                    c8o.l(txz0Var);
                    gw70 gw70Var = (gw70) v001Var.h.get();
                    c8o.l(gw70Var);
                    Context context = (Context) v001Var.f.get();
                    c8o.l(context);
                    q401 q401Var = new q401(str16, str17, losVar, umqVar, bnqVar, pux0VarH, txz0Var, gw70Var, context);
                    x340Var8.s0(q401Var);
                    objT2 = q401Var;
                }
                q401 q401Var2 = (q401) objT2;
                otw.c(q401Var2, rih1Var2, (qim0) null, wpb1.C(u001.class.getName(), q401Var2, rih1Var2, x340Var8, 384, 8), x340Var8, 48, 4);
                return rih1Var2;
            case 6:
                ((Number) obj2).intValue();
                ((e201) obj3).a((b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    nyx.a(2, (wux) null, apo.r(1007816423, new kpw0((q501) obj3, ((cir0) x340Var10.k(k2r0.a)).c(), (byte) 19), x340Var10), x340Var10, 3078, 6);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                v501 v501Var = ((w501) obj3).a;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    String str18 = v501Var.c;
                    if (str18 == null || (uri = Uri.parse(str18)) == null) {
                        uri = Uri.EMPTY;
                    }
                    Uri uri2 = uri;
                    uri2.getClass();
                    bmq0.a(uri2, (qim0) null, hcx.d, v501Var.a, v501Var.b, bro1.q(v501Var.d), 0L, false, x340Var12, 384, 194);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 9:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    lee1 lee1Var = cbx.d(x340Var14).k;
                    if (((err0) ((jkr0) obj3).d.c).s() == 0) {
                        x340Var14.i0(-746733530);
                        j = cbx.a(x340Var14).b.a;
                        x340Var14.r(false);
                    } else {
                        x340Var14.i0(-746668957);
                        j = cbx.a(x340Var14).b.b;
                        x340Var14.r(false);
                    }
                    uwo1.e(cwl1.o0(x340Var14, 2131960880), uyn1.z(12.0f, 0.0f, 2, nim0Var), lee1Var, j, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var14, 48, 0, 2016);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 10:
                return new jpg0((laa) ((j3y0) ((fxh) obj3).b).invoke((iac0) obj2), k301.W0);
            case 11:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    int iOrdinal = ((fd01) obj3).ordinal();
                    if (iOrdinal == 0) {
                        i = 2131955634;
                    } else if (iOrdinal == 1) {
                        i = 2131955632;
                    } else if (iOrdinal == 2) {
                        i = 2131955630;
                    } else {
                        if (iOrdinal != 3) {
                            eg.o();
                            return null;
                        }
                        i = 2131955631;
                    }
                    uwo1.e(cwl1.o0(x340Var16, i), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var16, 0, 0, 1790);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 12:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    lh01 lh01Var = (lh01) obj3;
                    if (lh01Var.equals(hh01.a) || (lh01Var instanceof ih01) || (lh01Var instanceof kh01)) {
                        x340Var18.i0(-695548477);
                        w0h1.a(zpx.c, isl.a, (qim0) null, 0L, 0L, false, x340Var18, zpx.d | 48, 60);
                        x340Var18.r(false);
                    } else {
                        if (!lh01Var.equals(jh01.a)) {
                            throw p3d1.k(x340Var18, -695551888, false);
                        }
                        x340Var18.i0(-695544861);
                        xto1.e((qim0) null, 0, 0L, 0L, x340Var18, 0, 15);
                        x340Var18.r(false);
                    }
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 13:
                aw01 aw01Var = (aw01) obj;
                i1r i1rVar = (k1r) obj2;
                kt01 kt01Var = (kt01) obj3;
                boolean z5 = aw01Var.c;
                cr01 cr01Var = aw01Var.b;
                if (i1rVar instanceof j1r) {
                    cr01Var.getClass();
                    return new yv01(z5);
                }
                boolean z6 = i1rVar instanceof h1r;
                br01 br01Var = br01.c;
                br01 br01Var2 = br01.b;
                if (z6) {
                    String strS = zxo1.s(cr01Var);
                    String str19 = cr01Var.x;
                    String str20 = str19 == null ? "" : str19;
                    List list4 = cr01Var.f;
                    m9m m9mVar = (m9m) o7h.s0(cr01Var.o);
                    boolean z7 = aw01Var.c;
                    int i3 = aw01Var.e;
                    br01 br01Var3 = cr01Var.e;
                    return new wv01(strS, strS, str20, list4, m9mVar, z7, i3, br01Var3 == br01Var2, br01Var3 == br01Var, cr01Var.g);
                }
                if (i1rVar instanceof i1r) {
                    uqv0 uqv0Var = kt01Var.X;
                    yy71 yy71Var = (yy71) i1rVar.a;
                    jo70 jo70Var = yy71Var.a;
                    jw01 jw01Var3 = yy71Var.d;
                    String strS2 = zxo1.s(cr01Var);
                    int iOrdinal2 = cr01Var.e.ordinal();
                    if (iOrdinal2 != 0) {
                        if (iOrdinal2 != 1) {
                            zF = iOrdinal2 != 2 ? uqv0Var.f(strS2, cr01Var, yy71Var) : uqv0Var.f(strS2, cr01Var, yy71Var);
                        } else if (yy71Var.d != null) {
                            zF = true;
                        } else {
                            zF = false;
                        }
                    } else if ((strS2.length() <= 0 || eyo1.p(strS2) || eyo1.r(strS2) || yy71Var.a != null) && !((uqv0.g(strS2, cr01Var) && yy71Var.e == null) || (eyo1.t(strS2) && ((vh4) uqv0Var.b).d() && yy71Var.f == null))) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                    if (!zF) {
                        return new yv01(z5);
                    }
                    Context context2 = kt01Var.c;
                    zwm1 zwm1Var2 = kt01Var.i;
                    String strS3 = zxo1.s(cr01Var);
                    gkt gktVar2 = cr01Var.g;
                    List list5 = cr01Var.o;
                    String str21 = cr01Var.h;
                    List list6 = cr01Var.f;
                    yq01 yq01Var = cr01Var.m;
                    ce71 ce71Var3 = cr01Var.y;
                    br01 br01Var4 = cr01Var.e;
                    boolean z8 = br01Var4 == br01Var2;
                    boolean z9 = br01Var4 == br01Var;
                    try {
                        Set set = s4b1.f;
                        blc0Var = uic.x(strS3).c;
                        break;
                    } catch (Exception unused) {
                        blc0Var = null;
                    }
                    if (z9) {
                        if (jw01Var3 != null) {
                            str13 = jw01Var3.c;
                            if (str13.length() <= 0) {
                                str13 = null;
                            }
                            if (str13 == null) {
                                if (ce71Var3 instanceof ce71) {
                                    ce71Var2 = ce71Var3;
                                } else {
                                    ce71Var2 = null;
                                }
                                if (ce71Var2 != null || (str13 = ce71Var2.a.c) == null || str13.length() <= 0) {
                                    str13 = null;
                                }
                            }
                        } else {
                            if (ce71Var3 instanceof ce71) {
                                ce71Var2 = ce71Var3;
                            } else {
                                ce71Var2 = null;
                            }
                            if (ce71Var2 != null) {
                                str13 = null;
                            } else {
                                str13 = null;
                            }
                        }
                        if (str13 != null) {
                            strC = context2.getString(2131962354, str13);
                        } else if (!strS3.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ")) {
                            strC = zwm1Var2.c();
                        } else if (blc0Var == blc0.C4) {
                            strC = zwm1Var2.h();
                        } else {
                            if (jo70Var != null) {
                                strC = null;
                            } else {
                                strC = null;
                            }
                            if (strC == null) {
                                strC = cr01Var.c;
                                if (strC.length() > 0) {
                                    strC = null;
                                } else {
                                    strC = null;
                                }
                                if (strC == null) {
                                    strC = "";
                                }
                            }
                        }
                    } else if (!strS3.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || strS3.equals("spotify:collection:tracks") || strS3.equals("spotify:internal:collection:tracks") || (nhc1.Y(strS3, "spotify:user:", false) && nhc1.R(strS3, ":collection", false))) {
                        strC = zwm1Var2.c();
                    } else if (blc0Var == blc0.C4) {
                        strC = zwm1Var2.h();
                    } else {
                        if (jo70Var != null || (strC = jo70Var.a) == null || strC.length() <= 0) {
                            strC = null;
                        }
                        if (strC == null) {
                            strC = cr01Var.c;
                            if (strC.length() > 0 || nhc1.Y(strC, "spotify:", false)) {
                                strC = null;
                            }
                            if (strC == null) {
                                strC = "";
                            }
                        }
                    }
                    try {
                        Set set2 = s4b1.f;
                        blc0Var2 = uic.x(strS3).c;
                        break;
                    } catch (Exception unused2) {
                        blc0Var2 = null;
                    }
                    if (z9) {
                        int i4 = yq01Var != null ? yq01Var.b : 0;
                        if (i4 > 0) {
                            quantityString = context2.getResources().getQuantityString(2131820895, i4, Integer.valueOf(i4));
                            str2 = strC;
                        } else {
                            str2 = strC;
                            quantityString = str21 == null ? "" : str21;
                        }
                        jw01Var = jw01Var3;
                        str = null;
                        str6 = cr01Var.b;
                        gv01Var = yy71Var.e;
                        xkk1Var = yy71Var.b;
                        vp70 vp70Var = vp70.d;
                        vp70 vp70Var2 = vp70.b;
                        vp70 vp70Var3 = vp70.c;
                        if (gv01Var != null) {
                            listSingletonList = gv01Var.a;
                            if (!listSingletonList.isEmpty()) {
                                list3 = listSingletonList;
                            } else {
                                if (!z9) {
                                    if (xkk1Var != null || (mq70Var = xkk1Var.a) == null) {
                                        str7 = str;
                                    } else {
                                        up70 up70VarA = mq70Var.a(vp70Var3);
                                        if (up70VarA == null || (str7 = up70VarA.a.a) == null) {
                                            up70 up70VarA2 = mq70Var.a(vp70Var2);
                                            if (up70VarA2 != null) {
                                                str7 = up70VarA2.a.a;
                                            } else {
                                                up70 up70VarA3 = mq70Var.a(vp70Var);
                                                if (up70VarA3 != null) {
                                                    str7 = up70VarA3.a.a;
                                                } else {
                                                    str7 = str;
                                                }
                                            }
                                        }
                                    }
                                    if (str7 != null) {
                                        listSingletonList = Collections.singletonList(new ft01(str7, str6));
                                        list3 = listSingletonList;
                                    }
                                }
                                list3 = list6;
                            }
                        } else {
                            if (!z9) {
                                if (xkk1Var != null) {
                                    str7 = str;
                                } else {
                                    str7 = str;
                                }
                                if (str7 != null) {
                                    listSingletonList = Collections.singletonList(new ft01(str7, str6));
                                    list3 = listSingletonList;
                                }
                            }
                            list3 = list6;
                        }
                        if (z9) {
                            ce71Var = ce71Var3;
                            if (ce71Var instanceof be71) {
                                ArrayList<hy71> arrayList2 = ((be71) ce71Var).b;
                                arrayList = new ArrayList(q7h.U(arrayList2, 10));
                                for (hy71 hy71Var : arrayList2) {
                                    arrayList.add(new ikt(hy71Var.a, hy71Var.b, hy71Var.c));
                                }
                                hktVar = new gkt(arrayList);
                            } else if (jw01Var != null) {
                                jw01Var2 = jw01Var;
                                str12 = jw01Var2.d;
                                if (str12.length() > 0) {
                                    hktVar = new ikt(str12, jw01Var2.b, jw01Var2.c);
                                } else if (ce71Var instanceof ce71) {
                                    hy71 hy71Var2 = ce71Var.a;
                                    hktVar = new ikt(hy71Var2.a, hy71Var2.b, hy71Var2.c);
                                } else {
                                    gktVar = gktVar2;
                                }
                            } else if (ce71Var instanceof ce71) {
                                hy71 hy71Var3 = ce71Var.a;
                                hktVar = new ikt(hy71Var3.a, hy71Var3.b, hy71Var3.c);
                            } else {
                                gktVar = gktVar2;
                            }
                            gktVar = hktVar;
                        } else {
                            ce71Var = ce71Var3;
                            if (yq01Var != null && gv01Var != null && (!gv01Var.a.isEmpty())) {
                                if (xkk1Var != null || (mq70Var2 = xkk1Var.a) == null) {
                                    str8 = str;
                                } else {
                                    up70 up70VarA4 = mq70Var2.a(vp70Var3);
                                    if (up70VarA4 == null || (str8 = up70VarA4.a.a) == null) {
                                        up70 up70VarA5 = mq70Var2.a(vp70Var2);
                                        if (up70VarA5 != null) {
                                            str8 = up70VarA5.a.a;
                                        } else {
                                            up70 up70VarA6 = mq70Var2.a(vp70Var);
                                            if (up70VarA6 != null) {
                                                str8 = up70VarA6.a.a;
                                            } else {
                                                str8 = str;
                                            }
                                        }
                                    }
                                }
                                if (str8 != null) {
                                    hktVar = new hkt(str8);
                                    gktVar = hktVar;
                                }
                            }
                            gktVar = gktVar2;
                        }
                        if (z9 || ce71Var == null || (strA2 = ce71Var.a()) == null) {
                            str9 = strS3;
                        } else {
                            str9 = strA2;
                        }
                        if (z9 || (ft01Var = (ft01) o7h.s0(list6)) == null || (str11 = ft01Var.b) == null) {
                            str10 = strS3;
                        } else {
                            String str22 = str11.length() > 0 ? str11 : str;
                            if (str22 == null) {
                                str10 = strS3;
                            } else {
                                str10 = str22;
                            }
                        }
                        String str23 = cr01Var.x;
                        String str24 = str23 != null ? str23 : "";
                        m9m m9mVar2 = (m9m) o7h.s0(list5);
                        boolean z10 = aw01Var.c;
                        if (!cr01Var.j || ((jv01Var = yy71Var.c) != null && jv01Var.b)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!cr01Var.k || u890.j(yy71Var.f, Boolean.TRUE)) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        return new xv01(str10, str9, str2, quantityString, str24, list3, m9mVar2, z10, z3, z4, kt01Var.t.d(), aw01Var.e, z8, z9, gktVar);
                    }
                    str2 = strC;
                    if (blc0Var2 == blc0.C4) {
                        int size = yq01Var != null ? yq01Var.b : list6.size();
                        if (size > 0) {
                            quantityString = context2.getResources().getQuantityString(2131820679, size, Integer.valueOf(size));
                        }
                        str6 = cr01Var.b;
                        gv01Var = yy71Var.e;
                        xkk1Var = yy71Var.b;
                        vp70 vp70Var4 = vp70.d;
                        vp70 vp70Var5 = vp70.b;
                        vp70 vp70Var6 = vp70.c;
                        if (gv01Var != null) {
                            listSingletonList = gv01Var.a;
                            if (!listSingletonList.isEmpty()) {
                                list3 = listSingletonList;
                            } else {
                                if (!z9) {
                                    if (xkk1Var != null) {
                                        str7 = str;
                                    } else {
                                        str7 = str;
                                    }
                                    if (str7 != null) {
                                        listSingletonList = Collections.singletonList(new ft01(str7, str6));
                                        list3 = listSingletonList;
                                    }
                                }
                                list3 = list6;
                            }
                        } else {
                            if (!z9) {
                                if (xkk1Var != null) {
                                    str7 = str;
                                } else {
                                    str7 = str;
                                }
                                if (str7 != null) {
                                    listSingletonList = Collections.singletonList(new ft01(str7, str6));
                                    list3 = listSingletonList;
                                }
                            }
                            list3 = list6;
                        }
                        if (z9) {
                            ce71Var = ce71Var3;
                            if (ce71Var instanceof be71) {
                                ArrayList<hy71> arrayList3 = ((be71) ce71Var).b;
                                arrayList = new ArrayList(q7h.U(arrayList3, 10));
                                while (r4.hasNext()) {
                                    arrayList.add(new ikt(hy71Var.a, hy71Var.b, hy71Var.c));
                                }
                                hktVar = new gkt(arrayList);
                            } else if (jw01Var != null) {
                                jw01Var2 = jw01Var;
                                str12 = jw01Var2.d;
                                if (str12.length() > 0) {
                                    hktVar = new ikt(str12, jw01Var2.b, jw01Var2.c);
                                } else if (ce71Var instanceof ce71) {
                                    hy71 hy71Var4 = ce71Var.a;
                                    hktVar = new ikt(hy71Var4.a, hy71Var4.b, hy71Var4.c);
                                } else {
                                    gktVar = gktVar2;
                                }
                            } else if (ce71Var instanceof ce71) {
                                hy71 hy71Var5 = ce71Var.a;
                                hktVar = new ikt(hy71Var5.a, hy71Var5.b, hy71Var5.c);
                            } else {
                                gktVar = gktVar2;
                            }
                            gktVar = hktVar;
                        } else {
                            ce71Var = ce71Var3;
                            if (yq01Var != null) {
                                if (xkk1Var != null) {
                                    str8 = str;
                                } else {
                                    str8 = str;
                                }
                                if (str8 != null) {
                                    hktVar = new hkt(str8);
                                    gktVar = hktVar;
                                }
                            }
                            gktVar = gktVar2;
                        }
                        if (z9) {
                            str9 = strS3;
                        } else {
                            str9 = strS3;
                        }
                        if (z9) {
                            str10 = strS3;
                        } else {
                            str10 = strS3;
                        }
                        String str25 = cr01Var.x;
                        if (str25 != null) {
                        }
                        m9m m9mVar3 = (m9m) o7h.s0(list5);
                        boolean z11 = aw01Var.c;
                        if (cr01Var.j) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (cr01Var.k) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        return new xv01(str10, str9, str2, quantityString, str24, list3, m9mVar3, z11, z3, z4, kt01Var.t.d(), aw01Var.e, z8, z9, gktVar);
                    }
                    if (jo70Var == null || (list2 = jo70Var.d) == null) {
                        strY0 = null;
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            Iterator it3 = it2;
                            String str26 = ((ho70) it2.next()).a;
                            if (str26.length() <= 0) {
                                str26 = null;
                            }
                            if (str26 != null) {
                                arrayList4.add(str26);
                            }
                            it2 = it3;
                        }
                        strY0 = o7h.y0(arrayList4, ", ", (String) null, (String) null, (iu30) null, 62);
                    }
                    if (strY0 == null) {
                        strY0 = "";
                    }
                    Set set3 = s4b1.f;
                    String str27 = strY0;
                    if (uic.j(strS3, nyu0.e)) {
                        ce71Var3 = ce71Var3;
                        zwm1Var = zwm1Var2;
                        jw01Var = jw01Var3;
                        strF = zwm1Var.e(str27.length() > 0 ? str27 : null, true, "", false);
                    } else {
                        ce71Var3 = ce71Var3;
                        jw01Var = jw01Var3;
                        int i5 = blc0Var2 == null ? -1 : gt01.a[blc0Var2.ordinal()];
                        if (i5 != 1) {
                            zwm1Var = zwm1Var2;
                            if (i5 != 2) {
                                if (i5 != 3) {
                                    zwm1Var = zwm1Var2;
                                    strF = null;
                                } else {
                                    if (jo70Var == null || (str4 = jo70Var.b) == null) {
                                        strF = null;
                                    } else {
                                        if (str4.length() <= 0) {
                                            str4 = null;
                                        }
                                        strF = str4;
                                    }
                                    strA = (jo70Var == null || (list = jo70Var.d) == null || (ho70Var = (ho70) o7h.s0(list)) == null) ? null : ho70Var.a;
                                    if (strF != null && strA != null && strA.length() != 0) {
                                        strF = f4i1.f(strF, " • ", strA);
                                    } else if (strF == null) {
                                    }
                                }
                            } else if (jo70Var == null || (strA = jo70Var.b) == null || strA.length() <= 0) {
                                zwm1Var = zwm1Var2;
                                strF = null;
                            }
                        } else {
                            zwm1Var = zwm1Var2;
                            if (str27.length() > 0) {
                                zwm1Var = zwm1Var2;
                                str3 = str27;
                            } else {
                                zwm1Var = zwm1Var2;
                                str3 = null;
                            }
                            strA = zwm1Var.a(str3, true);
                        }
                        strF = strA;
                    }
                    if (strF == null) {
                        if (strS3.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || strS3.equals("spotify:collection:tracks") || strS3.equals("spotify:internal:collection:tracks")) {
                            str = null;
                            z2 = true;
                            z = false;
                        } else {
                            z = false;
                            if (nhc1.Y(strS3, "spotify:user:", false) && nhc1.R(strS3, ":collection", false)) {
                                str = null;
                                z2 = true;
                            } else {
                                str = null;
                                if (jo70Var != null) {
                                    if (!eyo1.q(strS3) || (io70Var = jo70Var.e) == null || (str5 = io70Var.a) == null || str5.length() <= 0) {
                                        str5 = null;
                                    }
                                    if (str5 != null) {
                                        strF = str5;
                                    } else {
                                        if (str27.length() <= 0) {
                                            str27 = null;
                                        }
                                        if (str27 == null) {
                                            str5 = jo70Var.b;
                                            if (str5.length() <= 0) {
                                                str5 = null;
                                            }
                                            strF = str5;
                                        } else {
                                            strF = str27;
                                        }
                                    }
                                } else {
                                    strF = null;
                                }
                                if (strF == null) {
                                    strF = str21 != null ? (str21.length() <= 0 || nhc1.Y(str21, "spotify:", false)) ? null : str21 : null;
                                    if (strF == null) {
                                        strF = "";
                                    }
                                }
                            }
                        }
                        strF = zwm1Var.e(str, z2, "", z);
                    } else {
                        str = null;
                    }
                    if (strF == null) {
                        strF = "";
                    }
                    int i6 = yq01Var != null ? yq01Var.b : 0;
                    if (strF.length() != 0 && i6 != 0 && br01Var4 != br01.d) {
                        if (list5.size() == 1) {
                            int iOrdinal3 = ((m9m) o7h.q0(list5)).ordinal();
                            if (iOrdinal3 == 0) {
                                i2 = br01Var4 == br01Var2 ? 2131820926 : 2131820927;
                            } else if (iOrdinal3 == 1) {
                                i2 = br01Var4 == br01Var2 ? 2131820679 : 2131820680;
                            } else if (iOrdinal3 == 2) {
                                i2 = br01Var4 == br01Var2 ? 2131820584 : 2131820585;
                            } else {
                                eg.o();
                            }
                        } else {
                            if (list5.size() > 1) {
                                i2 = br01Var4 == br01Var2 ? 2131820715 : 2131820716;
                            } else {
                                strF2 = "";
                            }
                            if (strF2.length() <= 0 && strF.length() > 0) {
                                strF2 = f4i1.f(strF2, " • ", strF);
                            } else if (strF2.length() != 0) {
                            }
                            strF = strF2;
                        }
                        strF2 = context2.getResources().getQuantityString(i2, i6, Integer.valueOf(i6));
                        if (strF2.length() <= 0) {
                            if (strF2.length() != 0) {
                                strF = strF2;
                            }
                        } else if (strF2.length() != 0) {
                            strF = strF2;
                        }
                    }
                    quantityString = strF;
                    str6 = cr01Var.b;
                    gv01Var = yy71Var.e;
                    xkk1Var = yy71Var.b;
                    vp70 vp70Var7 = vp70.d;
                    vp70 vp70Var8 = vp70.b;
                    vp70 vp70Var9 = vp70.c;
                    if (gv01Var != null) {
                        listSingletonList = gv01Var.a;
                        if (!listSingletonList.isEmpty()) {
                            list3 = listSingletonList;
                        } else {
                            if (!z9) {
                                if (xkk1Var != null) {
                                    str7 = str;
                                } else {
                                    str7 = str;
                                }
                                if (str7 != null) {
                                    listSingletonList = Collections.singletonList(new ft01(str7, str6));
                                    list3 = listSingletonList;
                                }
                            }
                            list3 = list6;
                        }
                    } else {
                        if (!z9) {
                            if (xkk1Var != null) {
                                str7 = str;
                            } else {
                                str7 = str;
                            }
                            if (str7 != null) {
                                listSingletonList = Collections.singletonList(new ft01(str7, str6));
                                list3 = listSingletonList;
                            }
                        }
                        list3 = list6;
                    }
                    if (z9) {
                        ce71Var = ce71Var3;
                        if (ce71Var instanceof be71) {
                            ArrayList<hy71> arrayList5 = ((be71) ce71Var).b;
                            arrayList = new ArrayList(q7h.U(arrayList5, 10));
                            while (r4.hasNext()) {
                                arrayList.add(new ikt(hy71Var.a, hy71Var.b, hy71Var.c));
                            }
                            hktVar = new gkt(arrayList);
                        } else if (jw01Var != null) {
                            jw01Var2 = jw01Var;
                            str12 = jw01Var2.d;
                            if (str12.length() > 0) {
                                hktVar = new ikt(str12, jw01Var2.b, jw01Var2.c);
                            } else if (ce71Var instanceof ce71) {
                                hy71 hy71Var6 = ce71Var.a;
                                hktVar = new ikt(hy71Var6.a, hy71Var6.b, hy71Var6.c);
                            } else {
                                gktVar = gktVar2;
                            }
                        } else if (ce71Var instanceof ce71) {
                            hy71 hy71Var7 = ce71Var.a;
                            hktVar = new ikt(hy71Var7.a, hy71Var7.b, hy71Var7.c);
                        } else {
                            gktVar = gktVar2;
                        }
                        gktVar = hktVar;
                    } else {
                        ce71Var = ce71Var3;
                        if (yq01Var != null) {
                            if (xkk1Var != null) {
                                str8 = str;
                            } else {
                                str8 = str;
                            }
                            if (str8 != null) {
                                hktVar = new hkt(str8);
                                gktVar = hktVar;
                            }
                        }
                        gktVar = gktVar2;
                    }
                    if (z9) {
                        str9 = strS3;
                    } else {
                        str9 = strS3;
                    }
                    if (z9) {
                        str10 = strS3;
                    } else {
                        str10 = strS3;
                    }
                    String str28 = cr01Var.x;
                    if (str28 != null) {
                    }
                    m9m m9mVar4 = (m9m) o7h.s0(list5);
                    boolean z12 = aw01Var.c;
                    if (cr01Var.j) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (cr01Var.k) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    return new xv01(str10, str9, str2, quantityString, str24, list3, m9mVar4, z12, z3, z4, kt01Var.t.d(), aw01Var.e, z8, z9, gktVar);
                    jw01Var = jw01Var3;
                    str = null;
                    str6 = cr01Var.b;
                    gv01Var = yy71Var.e;
                    xkk1Var = yy71Var.b;
                    vp70 vp70Var10 = vp70.d;
                    vp70 vp70Var11 = vp70.b;
                    vp70 vp70Var12 = vp70.c;
                    if (gv01Var != null) {
                        listSingletonList = gv01Var.a;
                        if (!listSingletonList.isEmpty()) {
                            list3 = listSingletonList;
                        } else {
                            if (!z9) {
                                if (xkk1Var != null) {
                                    str7 = str;
                                } else {
                                    str7 = str;
                                }
                                if (str7 != null) {
                                    listSingletonList = Collections.singletonList(new ft01(str7, str6));
                                    list3 = listSingletonList;
                                }
                            }
                            list3 = list6;
                        }
                    } else {
                        if (!z9) {
                            if (xkk1Var != null) {
                                str7 = str;
                            } else {
                                str7 = str;
                            }
                            if (str7 != null) {
                                listSingletonList = Collections.singletonList(new ft01(str7, str6));
                                list3 = listSingletonList;
                            }
                        }
                        list3 = list6;
                    }
                    if (z9) {
                        ce71Var = ce71Var3;
                        if (ce71Var instanceof be71) {
                            ArrayList<hy71> arrayList6 = ((be71) ce71Var).b;
                            arrayList = new ArrayList(q7h.U(arrayList6, 10));
                            while (r4.hasNext()) {
                                arrayList.add(new ikt(hy71Var.a, hy71Var.b, hy71Var.c));
                            }
                            hktVar = new gkt(arrayList);
                        } else if (jw01Var != null) {
                            jw01Var2 = jw01Var;
                            str12 = jw01Var2.d;
                            if (str12.length() > 0) {
                                hktVar = new ikt(str12, jw01Var2.b, jw01Var2.c);
                            } else if (ce71Var instanceof ce71) {
                                hy71 hy71Var8 = ce71Var.a;
                                hktVar = new ikt(hy71Var8.a, hy71Var8.b, hy71Var8.c);
                            } else {
                                gktVar = gktVar2;
                            }
                        } else if (ce71Var instanceof ce71) {
                            hy71 hy71Var9 = ce71Var.a;
                            hktVar = new ikt(hy71Var9.a, hy71Var9.b, hy71Var9.c);
                        } else {
                            gktVar = gktVar2;
                        }
                        gktVar = hktVar;
                    } else {
                        ce71Var = ce71Var3;
                        if (yq01Var != null) {
                            if (xkk1Var != null) {
                                str8 = str;
                            } else {
                                str8 = str;
                            }
                            if (str8 != null) {
                                hktVar = new hkt(str8);
                                gktVar = hktVar;
                            }
                        }
                        gktVar = gktVar2;
                    }
                    if (z9) {
                        str9 = strS3;
                    } else {
                        str9 = strS3;
                    }
                    if (z9) {
                        str10 = strS3;
                    } else {
                        str10 = strS3;
                    }
                    String str29 = cr01Var.x;
                    if (str29 != null) {
                    }
                    m9m m9mVar5 = (m9m) o7h.s0(list5);
                    boolean z13 = aw01Var.c;
                    if (cr01Var.j) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (cr01Var.k) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    return new xv01(str10, str9, str2, quantityString, str24, list3, m9mVar5, z13, z3, z4, kt01Var.t.d(), aw01Var.e, z8, z9, gktVar);
                }
                str = null;
                eg.o();
                return str;
            case 14:
                cu01 cu01Var = (cu01) obj;
                i1r i1rVar2 = (k1r) obj2;
                cm0 cm0Var = (cm0) obj3;
                sq01 sq01Var = (sq01) cm0Var.h;
                String str30 = cu01Var.a;
                if (i1rVar2 instanceof j1r) {
                    return new eu01(cu01Var.c, cu01Var.e);
                }
                boolean z14 = i1rVar2 instanceof h1r;
                fu01 fu01Var = fu01.a;
                if (z14) {
                    sq01Var.invoke(str30);
                } else {
                    if (!(i1rVar2 instanceof i1r)) {
                        eg.o();
                        return null;
                    }
                    List list7 = (List) i1rVar2.a;
                    if (!list7.isEmpty()) {
                        return new du01(cu01Var.c, list7, cu01Var.e, cu01Var.b, ((vh4) cm0Var.d).d());
                    }
                    sq01Var.invoke(str30);
                }
                return fu01Var;
            case 15:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    uwr uwrVar2 = cbx.a;
                    lee1 lee1Var2 = cbx.d(x340Var20).j;
                    long j2 = cbx.a(x340Var20).b.b;
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    cvx cvxVar = cbx.b(x340Var20).b;
                    uwo1.d((af5) obj3, j2, uyn1.x(qim0VarF, 12.0f), lee1Var2, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var20, 0, 0, 4080);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 16:
                q911 q911Var = (q911) obj;
                return new r911(q911Var.a, q911Var.b, ((l911) ((s911) obj3).b.getValue()).b());
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    String str31 = ((pey0) obj3).c;
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(str31, (qim0) null, cbx.d(x340Var22).k, cbx.a(x340Var22).b.c, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var22, 0, 0, 2034);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new opl0(Integer.valueOf(((Number) obj).intValue()), ((wc11) obj3).c.b, (r6h1) obj2);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    pd11 pd11Var = (pd11) obj3;
                    ngs0 ngs0Var = pd11Var.b;
                    rd11 rd11Var = pd11Var.c;
                    otw.c(ngs0Var, new od11(rd11Var.a, rd11Var.b), (qim0) null, (ipb1) null, x340Var24, 0, 12);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return a(obj, obj2);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((Number) obj2).intValue();
                ud11.b((lz20) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                return d(obj, obj2);
            case 23:
                return e(obj, obj2);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return f(obj, obj2);
            case 25:
                return g(obj, obj2);
            case 26:
                return h(obj, obj2);
            case 27:
                return i(obj, obj2);
            case 28:
                return j(obj, obj2);
            default:
                return new ef3((jr6) ((zl5) obj3).k, (String) obj, (String) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ziz0(Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ziz0(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }
}
