package p;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.base.java.logging.Logger;
import com.spotify.libraryimportservice.tmm.GetMatchReviewResponse;
import com.spotify.libraryimportservice.tmm.ItemAlternative;
import com.spotify.libraryimportservice.tmm.UnmatchedItem;
import com.spotify.mainlayout.ui.view.containers.MainLayoutContentContainerView;
import com.spotify.mobius.Next;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mbf0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbf0(ld5 ld5Var) {
        super(2);
        this.a = (byte) 0;
        this.b = ld5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        rih1 rih1Var;
        Integer num;
        Number number;
        ddf0 ddf0Var;
        ddf0 ddf0VarS;
        boolean z;
        tvf0 parcelable;
        b9g0 b9g0Var;
        gjj1 gjj1Var;
        gjj1 gjj1Var2;
        gjj1 gjj1Var3;
        List list;
        bbh0 bbh0Var;
        byte b = this.a;
        Object obj3 = null;
        rih1 rih1Var2 = rih1.a;
        Object obj4 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                llj lljVar = y580.Y;
                llj lljVar2 = y580.R0;
                llj lljVar3 = y580.N0;
                llj lljVar4 = y580.O0;
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                ld5 ld5Var = (ld5) obj4;
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                j06 j06Var = x340Var2.a;
                if (zY) {
                    Object objT = x340Var2.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = v8r.q(Boolean.FALSE);
                        x340Var2.s0(objT);
                    }
                    ven0 ven0Var = (ven0) objT;
                    Object objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = v8r.q(Boolean.FALSE);
                        x340Var2.s0(objT2);
                    }
                    ven0 ven0Var2 = (ven0) objT2;
                    int i = ld5Var.b;
                    int iC = l1d.C(i);
                    if (iC == 0 || iC == 1) {
                        ocf0 ocf0Var = new ocf0(2131886081);
                        boolean zI = x340Var2.i(ven0Var2);
                        Object objT3 = x340Var2.T();
                        if (zI || objT3 == m4cVar) {
                            objT3 = new xx0(ven0Var2, (lnm) null, (byte) 13);
                            x340Var2.s0(objT3);
                        }
                        ncf0 ncf0VarG = h5p1.G(ocf0Var, null, (xu30) objT3, x340Var2, 0, 30);
                        nim0 nim0Var = nim0.a;
                        qim0 qim0VarA = uyn1.A(nim0Var, 16.0f, 0.0f, 16.0f, 0.0f);
                        boolean zI2 = x340Var2.i(ven0Var);
                        Object objT4 = x340Var2.T();
                        if (zI2 || objT4 == m4cVar) {
                            objT4 = new sqa0(ven0Var, (byte) 7);
                            x340Var2.s0(objT4);
                        }
                        iu30 iu30Var = (iu30) objT4;
                        View view = (View) ((View) x340Var2.k(AndroidCompositionLocals_androidKt.f)).getParent();
                        boolean zG = x340Var2.g(iu30Var) | x340Var2.i(view);
                        Object objT5 = x340Var2.T();
                        if (zG || objT5 == m4cVar) {
                            objT5 = new j2d0(view, iu30Var);
                            x340Var2.s0(objT5);
                        }
                        qim0 qim0VarThen = qim0VarA.then(ern1.x(qim0VarA, (iu30) objT5));
                        gfh0 gfh0VarC = t1c.c(een.d, false);
                        int iHashCode = Long.hashCode(x340Var2.T);
                        xos0 xos0VarM = x340Var2.m();
                        qim0 qim0VarE = zr7.E(x340Var2, qim0VarThen);
                        hzj.A.getClass();
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var2.m0();
                        boolean z2 = x340Var2.S;
                        rih1Var = rih1Var2;
                        n4k n4kVar = hmb0.t1;
                        if (z2) {
                            x340Var2.l(n4kVar);
                        } else {
                            x340Var2.v0();
                        }
                        nko1.H(gfh0VarC, x340Var2, lljVar4);
                        nko1.H(xos0VarM, x340Var2, lljVar3);
                        nko1.H(Integer.valueOf(iHashCode), x340Var2, lljVar2);
                        nko1.F(x340Var2);
                        nko1.H(qim0VarE, x340Var2, lljVar);
                        if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                            x340Var2.i0(919604510);
                            x340Var2.r(false);
                        } else {
                            x340Var2.i0(919177578);
                            qim0 qim0VarA2 = h2c.a.a(u291.h(nim0Var, 140.0f), een.e);
                            fcf0 fcf0VarC = ncf0VarG.c();
                            gra graVar = een.h;
                            as80 as80Var = mif1.R0;
                            x340Var2.i0(2032617168);
                            String str = ld5Var.c;
                            if ((i == 1 || i == 2) && str.length() > 0) {
                                x340Var2.i0(-1045612862);
                                try {
                                    int color = Color.parseColor(str);
                                    float[] fArr = new float[3];
                                    Color.colorToHSV(Color.parseColor(str), fArr);
                                    float f = fArr[1];
                                    fArr[1] = Math.min(f, 1.5f * f);
                                    fArr[2] = fArr[2] * 0.5f;
                                    int iHSVToColor = Color.HSVToColor(fArr);
                                    PointF pointF = ndf0.a;
                                    ddf0VarS = e130.s(new edf0[]{e130.t(1, Integer.valueOf(iHSVToColor), new String[]{"**", "CONFETTI_1"}, x340Var2, 6), e130.t(1, Integer.valueOf(color), new String[]{"**", "CONFETTI_2"}, x340Var2, 6)}, x340Var2);
                                    z = false;
                                    x340Var2.r(false);
                                } catch (IllegalArgumentException e) {
                                    Logger.e(e, "Invalid dynamic color: %s", new Object[]{str});
                                    x340Var2.r(false);
                                    x340Var2.r(false);
                                    ddf0Var = null;
                                }
                            } else {
                                z = false;
                                x340Var2.i0(-1044945619);
                                x340Var2.r(false);
                                ddf0VarS = null;
                            }
                            x340Var2.r(z);
                            ddf0Var = ddf0VarS;
                            mp10.f(fcf0VarC, qim0VarA2, false, false, !((Boolean) ven0Var.getValue()).booleanValue() ? new zbf0(0, 0) : null, 0, ddf0Var, graVar, as80Var, x340Var2, 0, 4096, 2039788);
                            x340Var2.r(false);
                        }
                        int iC2 = l1d.C(i);
                        if (iC2 == 0) {
                            num = null;
                        } else if (iC2 == 1) {
                            num = 2131959112;
                        } else {
                            eg.o();
                        }
                        qim0 qim0VarF = u291.f(uyn1.B(nim0Var, 0.0f, 80.0f, 0.0f, num != null ? 20.0f : 32.0f, 5), 1.0f);
                        mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 0);
                        int iHashCode2 = Long.hashCode(x340Var2.T);
                        xos0 xos0VarM2 = x340Var2.m();
                        qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF);
                        hzj.A.getClass();
                        x340Var2.m0();
                        if (x340Var2.S) {
                            x340Var2.l(n4kVar);
                        } else {
                            x340Var2.v0();
                        }
                        nko1.H(mbhVarA, x340Var2, lljVar4);
                        nko1.H(xos0VarM2, x340Var2, lljVar3);
                        nko1.H(Integer.valueOf(iHashCode2), x340Var2, lljVar2);
                        nko1.F(x340Var2);
                        nko1.H(qim0VarE2, x340Var2, lljVar);
                        uwr uwrVar = cbx.a;
                        lee1 lee1Var = cbx.d(x340Var2).h;
                        long j = cbx.a(x340Var2).b.a;
                        int iC3 = l1d.C(i);
                        if (iC3 == 0 || iC3 == 1) {
                            uwo1.e(cwl1.o0(x340Var2, 2131952255), null, lee1Var, j, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2018);
                            int iC4 = l1d.C(i);
                            if (iC4 == 0) {
                                number = null;
                            } else if (iC4 == 1) {
                                number = r5;
                            } else {
                                eg.o();
                            }
                            if (number == null) {
                                x340Var2.i0(1974922280);
                                x340Var2.r(false);
                            } else {
                                x340Var2.i0(1974922281);
                                uwo1.e(cwl1.o0(x340Var2, number.intValue()), null, cbx.d(x340Var2).g, cbx.a(x340Var2).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2018);
                                x340Var2.r(false);
                            }
                            x340Var2.r(true);
                            x340Var2.r(true);
                        } else {
                            eg.o();
                        }
                    } else {
                        eg.o();
                    }
                    return null;
                }
                rih1Var = rih1Var2;
                x340Var2.b0();
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                qjf0 qjf0Var = (qjf0) obj4;
                wjf0 wjf0Var = qjf0Var.c;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    cir0 cir0Var = (cir0) x340Var4.k(k2r0.a);
                    boolean zG2 = x340Var4.g(cir0Var);
                    Object objT6 = x340Var4.T();
                    if (zG2 || objT6 == m4cVar2) {
                        objT6 = new g1f1(cir0Var, qjf0Var.f, qjf0Var.d, qjf0Var.e);
                        x340Var4.s0(objT6);
                    }
                    g1f1 g1f1Var = (g1f1) objT6;
                    mqp mqpVar = qjf0Var.b;
                    boolean zI3 = x340Var4.i(qjf0Var);
                    Object objT7 = x340Var4.T();
                    if (zI3 || objT7 == m4cVar2) {
                        objT7 = new jgd0(qjf0Var, (byte) 25);
                        x340Var4.s0(objT7);
                    }
                    umf0 umf0VarA = ((mqp) mqpVar.b).a((Function0) objT7, g1f1Var);
                    otw.c(umf0VarA, wjf0Var, (qim0) null, wpb1.C(qjf0.class.getName(), umf0VarA, wjf0Var, x340Var4, 0, 8), x340Var4, 0, 4);
                } else {
                    x340Var4.b0();
                }
                return rih1Var2;
            case 2:
                bnf0 bnf0Var = (bnf0) obj4;
                mre0 mre0Var = bnf0Var.b;
                q2p0 q2p0Var = bnf0Var.a;
                return new jpg0(f6o1.A(((imf0) mre0Var.b).a(q2p0Var.j(), q2p0Var.c().d(), q2p0Var.d()).element(), null, ScrollCardType.LYRICS, 1), klf0.f);
            case 3:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    String strO0 = cwl1.o0(x340Var6, 2131957900);
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(strO0, null, cbx.d(x340Var6).h, z4p1.e(((bff0) obj4).c), null, null, 0, false, null, 0, null, x340Var6, 0, 0, 2034);
                } else {
                    x340Var6.b0();
                }
                return rih1Var2;
            case 4:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    ((cpf0) ((bpf0) obj4).b.get()).a(x340Var8, 6);
                } else {
                    x340Var8.b0();
                }
                return rih1Var2;
            case 5:
                ((Number) obj2).intValue();
                ((cpf0) obj4).a((b0k) obj, czo1.p(7));
                return rih1Var2;
            case 6:
                mpf0 mpf0Var = (mpf0) obj;
                tof0 tof0Var = (xof0) obj2;
                String str2 = mpf0Var.a;
                jpf0 jpf0Var = mpf0Var.b;
                if (tof0Var instanceof tof0) {
                    tof0 tof0Var2 = tof0Var;
                    fef0 fef0Var = tof0Var2.a;
                    bff0 bff0Var = tof0Var2.b;
                    String str3 = tof0Var2.c;
                    String str4 = tof0Var2.d;
                    String str5 = tof0Var2.e;
                    Set set = tof0Var2.f;
                    return Next.h(new mpf0(str2, new jpf0(fef0Var, bff0Var, str3, str4, str5, set, set, false)));
                }
                if (tof0Var instanceof sof0) {
                    return Next.h(new mpf0(str2, new hpf0(mpf0Var.a())));
                }
                if (tof0Var instanceof wof0) {
                    if (!(jpf0Var instanceof jpf0)) {
                        return Next.j();
                    }
                    jpf0 jpf0Var2 = jpf0Var;
                    wof0 wof0Var = (wof0) tof0Var;
                    return Next.h(new mpf0(str2, new jpf0(jpf0Var2.a, jpf0Var2.b, jpf0Var2.c, jpf0Var2.d, jpf0Var2.e, jpf0Var2.f, wof0Var.a, wof0Var.b)));
                }
                if (tof0Var instanceof rof0) {
                    if (!(jpf0Var instanceof jpf0)) {
                        eg.m("Check failed.");
                        return null;
                    }
                    jpf0 jpf0Var3 = jpf0Var;
                    List listZ0 = o7h.Z0(jpf0Var3.g);
                    return Next.a(Collections.singleton(new hof0(jpf0Var3.c, ((aef0) jpf0Var3.a.a.get(((Number) o7h.q0(listZ0)).intValue())).a, mpf0Var.a, listZ0)));
                }
                if (tof0Var instanceof uof0) {
                    return Next.a(Collections.singleton(new iof0(((uof0) tof0Var).a)));
                }
                if (tof0Var instanceof vof0) {
                    fpf0 fpf0Var = (fpf0) obj4;
                    return Next.i(new mpf0(str2, new kpf0(mpf0Var.a())), Collections.singleton(new gof0(fpf0Var.a, fpf0Var.b)));
                }
                if (tof0Var instanceof qof0) {
                    return Next.a(Collections.singleton(fof0.a));
                }
                eg.o();
                return null;
            case 7:
                Bundle bundle = (Bundle) obj2;
                return (bundle == null || (parcelable = bundle.getParcelable("magic_link_already_authenticated_model")) == null) ? new tvf0(((vvf0) obj4).c.b) : parcelable;
            case 8:
                if (!(((hwf0) obj) instanceof gwf0)) {
                    return null;
                }
                qyl0 qyl0Var = (qyl0) ((jwf0) obj4).g.getValue();
                qyl0Var.getClass();
                x6h1 x6h1VarC = qyl0Var.b.c();
                x6h1VarC.i.add(new a7h1("no_results_invite_link_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = qyl0Var.a;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var.a();
            case 9:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                    cvg1 cvg1Var = (cvg1) obj4;
                    f0u f0uVar = cvg1Var.a;
                    boolean z3 = cvg1Var.b;
                    String str6 = cvg1Var.c;
                    iho1.c(f0uVar, z3, str6, str6, null, x340Var10, 0);
                } else {
                    x340Var10.b0();
                }
                return rih1Var2;
            case 10:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    String str7 = ((kbl1) obj4).a;
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(str7, null, cbx.d(x340Var12).h, 0L, null, null, 0, false, new cjc0(1), 0, null, x340Var12, 0, 0, 1786);
                } else {
                    x340Var12.b0();
                }
                return rih1Var2;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                ((MainLayoutContentContainerView) obj4).a((b0k) obj, czo1.p(1));
                return rih1Var2;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                mue1.l((l0g0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 13:
                ((Number) obj2).intValue();
                ((r1g0) obj4).a((b0k) obj, czo1.p(1));
                return rih1Var2;
            case 14:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                boolean zY2 = x340Var14.Y(1 & iIntValue7, (iIntValue7 & 3) != 2);
                rih1 rih1Var3 = rih1.a;
                if (zY2) {
                    otw.c((ng20) obj4, rih1Var3, (qim0) null, (ipb1) null, x340Var14, 48, 12);
                } else {
                    x340Var14.b0();
                }
                return rih1Var3;
            case 15:
                ((Number) obj2).intValue();
                kln1.f((iyr0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 16:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(1 & iIntValue8, (iIntValue8 & 3) != 2)) {
                    irn1.u(null, null, null, null, apo.r(-1566118010, new otf0((k7g0) obj4, (byte) 4), x340Var16), x340Var16, 24576, 15);
                } else {
                    x340Var16.b0();
                }
                return rih1Var2;
            case 17:
                nhs0 nhs0Var = (nhs0) obj;
                Bundle bundle2 = (Bundle) obj2;
                d9g0 d9g0Var = (d9g0) obj4;
                if (bundle2 == null || (b9g0Var = (b9g0) jhc1.t(bundle2, "ManagedAccountAllowlistingRequestsModel", b9g0.class)) == null) {
                    String str8 = d9g0Var.d.a;
                    String str9 = nhs0Var.a;
                    List list2 = nhs0Var.b;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        r7h.W(((ifs0) it.next()).l0(), arrayList);
                    }
                    int iS = zno1.s(q7h.U(arrayList, 10));
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iS >= 16 ? iS : 16);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        linkedHashMap.put(((ffs0) it2.next()).getRequestId(), new a9g0(ox3.a, false));
                    }
                    b9g0Var = new b9g0(str8, str9, list2, linkedHashMap, w7x.a, false);
                }
                return b9g0.a(b9g0Var, (Map) null, (LinkedHashSet) null, d9g0Var.f.b.d(), 31);
            case 18:
                tk tkVar = ((jbg0) obj).h;
                sfg0 sfg0Var = ((qfg0) obj4).b;
                String str10 = sfg0Var.a;
                ibg0 ibg0Var = sfg0Var.b;
                Boolean bool = (tkVar == null || (gjj1Var3 = tkVar.c) == null) ? null : gjj1Var3.a;
                Boolean bool2 = (tkVar == null || (gjj1Var2 = tkVar.c) == null) ? null : gjj1Var2.b;
                if (tkVar != null && (gjj1Var = tkVar.c) != null) {
                    obj3 = gjj1Var.c;
                }
                return new ofg0(str10, ibg0Var, bool, bool2, obj3, false, false, false);
            case 19:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(1 & iIntValue9, (iIntValue9 & 3) != 2)) {
                    zm6.a((xm6) obj4, (qim0) null, x340Var18, 0);
                } else {
                    x340Var18.b0();
                }
                return rih1Var2;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(1 & iIntValue10, (iIntValue10 & 3) != 2)) {
                    zm6.a(((gmg0) obj4).o, (qim0) null, x340Var20, 0);
                } else {
                    x340Var20.b0();
                }
                return rih1Var2;
            case 21:
                ewg0 ewg0Var = (ewg0) obj;
                mmr0 mmr0Var = (mmr0) obj2;
                Boolean bool3 = (Boolean) mmr0Var.a;
                boolean zBooleanValue = ((Boolean) mmr0Var.b).booleanValue();
                String str11 = ewg0Var.b;
                String str12 = ewg0Var.c;
                String str13 = ewg0Var.d;
                String str14 = ewg0Var.e;
                String str15 = ewg0Var.f;
                String str16 = ewg0Var.g;
                String str17 = ewg0Var.h;
                String str18 = ewg0Var.i;
                String str19 = ewg0Var.j;
                String str20 = ewg0Var.k;
                String str21 = ewg0Var.m;
                twg0 twg0Var = ewg0Var.n;
                String str22 = ewg0Var.o;
                sw9 sw9Var = ((mvg0) obj4).d;
                return new fwg0(str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, twg0Var, str22, new mgc(str13, sw9Var.b, (gw70) sw9Var.c, (byte) 2), bool3.booleanValue(), zBooleanValue);
            case 22:
                ewg0 ewg0Var2 = (ewg0) obj;
                mmr0 mmr0Var2 = (mmr0) obj2;
                Boolean bool4 = (Boolean) mmr0Var2.a;
                boolean zBooleanValue2 = ((Boolean) mmr0Var2.b).booleanValue();
                String str23 = ewg0Var2.b;
                String str24 = ewg0Var2.c;
                String str25 = ewg0Var2.d;
                String str26 = ewg0Var2.e;
                String str27 = ewg0Var2.f;
                String str28 = ewg0Var2.g;
                String str29 = ewg0Var2.h;
                String str30 = ewg0Var2.i;
                String str31 = ewg0Var2.j;
                String str32 = ewg0Var2.k;
                String str33 = ewg0Var2.m;
                twg0 twg0Var2 = ewg0Var2.n;
                String str34 = ewg0Var2.o;
                sw9 sw9Var2 = (sw9) ((s060) obj4).i;
                return new fwg0(str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, twg0Var2, str34, new mgc(str25, sw9Var2.b, (gw70) sw9Var2.c, (byte) 2), bool4.booleanValue(), zBooleanValue2);
            case 23:
                iys0 iys0Var = (iys0) obj;
                tv80 tv80Var = (tv80) obj2;
                kmy kmyVar = (kmy) obj4;
                if (iys0Var.j) {
                    kmyVar.invoke(new s2h0(tv80Var));
                } else {
                    kmyVar.invoke(new f3h0(iys0Var.e, tv80Var));
                }
                return rih1Var2;
            case 24:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                boolean zY3 = x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2);
                rih1 rih1Var4 = rih1.a;
                if (zY3) {
                    otw.c((ni60) obj4, rih1Var4, u291.d(nim0.a, 1.0f), (ipb1) null, x340Var22, 48, 8);
                } else {
                    x340Var22.b0();
                }
                return rih1Var4;
            case 25:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    ynx ynxVar = ynx.c;
                    jsl jslVar = new jsl(o4o1.n((bbh0) obj4, x340Var24));
                    uwr uwrVar4 = cbx.a;
                    w0h1.a(ynxVar, jslVar, (qim0) null, cbx.a(x340Var24).b.b, 0L, false, x340Var24, ynx.d, 52);
                } else {
                    x340Var24.b0();
                }
                return rih1Var2;
            case 26:
                GetMatchReviewResponse getMatchReviewResponse = (GetMatchReviewResponse) obj;
                Bundle bundle3 = (Bundle) obj2;
                f8a f8aVar = ((qah0) obj4).f.a;
                h290 h290VarN = getMatchReviewResponse.n();
                h290 h290VarO = getMatchReviewResponse.o();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj5 : h290VarO) {
                    ri90 ri90VarN = ((UnmatchedItem) obj5).n();
                    Object arrayList2 = linkedHashMap2.get(ri90VarN);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap2.put(ri90VarN, arrayList2);
                    }
                    ((List) arrayList2).add(obj5);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    ri90 ri90Var = (ri90) entry.getKey();
                    List list3 = (List) entry.getValue();
                    ri90Var.getClass();
                    int iOrdinal = ri90Var.ordinal();
                    if (iOrdinal == 0) {
                        bbh0Var = null;
                    } else if (iOrdinal == 1) {
                        bbh0Var = bbh0.c;
                    } else if (iOrdinal == 2) {
                        bbh0Var = bbh0.a;
                    } else if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            eg.o();
                            return null;
                        }
                        bbh0Var = null;
                    } else {
                        bbh0Var = bbh0.b;
                    }
                    mmr0 mmr0Var3 = bbh0Var != null ? new mmr0(bbh0Var, list3) : null;
                    if (mmr0Var3 != null) {
                        arrayList3.add(mmr0Var3);
                    }
                }
                mah0 mah0Var = new mah0(sqg0.T(arrayList3), h290VarN, f8aVar, (bbh0) null, b7x.a, 1, 0);
                if (bundle3 == null) {
                    return mah0Var;
                }
                ArrayList arrayListC = mah0Var.c();
                int iS2 = zno1.s(q7h.U(arrayListC, 10));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
                for (Object obj6 : arrayListC) {
                    linkedHashMap3.put(((UnmatchedItem) obj6).getId(), obj6);
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                ArrayList<String> stringArrayList = bundle3.getStringArrayList("ignored");
                ArrayList<String> arrayList4 = z6x.a;
                if (stringArrayList == null) {
                    stringArrayList = arrayList4;
                }
                for (String str35 : stringArrayList) {
                    if (linkedHashMap3.containsKey(str35)) {
                        linkedHashMap4.put(str35, mm90.a);
                    }
                }
                Bundle bundle4 = bundle3.getBundle("selected");
                if (bundle4 != null) {
                    for (String str36 : bundle4.keySet()) {
                        UnmatchedItem unmatchedItem = (UnmatchedItem) linkedHashMap3.get(str36);
                        if (unmatchedItem != null) {
                            h290 h290VarO2 = unmatchedItem.o();
                            ArrayList arrayList5 = new ArrayList(q7h.U(h290VarO2, 10));
                            Iterator it3 = h290VarO2.iterator();
                            while (it3.hasNext()) {
                                arrayList5.add(((ItemAlternative) it3.next()).getId());
                            }
                            Set setP1 = o7h.p1(arrayList5);
                            ArrayList<String> stringArrayList2 = bundle4.getStringArrayList(str36);
                            if (stringArrayList2 == null) {
                                stringArrayList2 = arrayList4;
                            }
                            LinkedHashSet linkedHashSetV0 = o7h.v0(o7h.p1(stringArrayList2), setP1);
                            if (!linkedHashSetV0.isEmpty()) {
                                linkedHashMap4.put(str36, new nm90(linkedHashSetV0));
                            }
                        }
                    }
                }
                int i2 = bundle3.getBoolean("complete") ? 3 : 1;
                for (Object obj7 : bbh0.e) {
                    bbh0 bbh0Var2 = (bbh0) obj7;
                    if (u890.j(bbh0Var2.name(), bundle3.getString("activeSection")) && (list = (List) mah0Var.a.get(bbh0Var2)) != null && (!list.isEmpty())) {
                        obj3 = obj7;
                        return mah0.a(mah0Var, (bbh0) obj3, linkedHashMap4, i2, 0, 71);
                    }
                }
                return mah0.a(mah0Var, (bbh0) obj3, linkedHashMap4, i2, 0, 71);
            case 27:
                ((Number) obj2).intValue();
                r4o1.w((UnmatchedItem) obj4, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 28:
                ((Number) obj2).intValue();
                gho1.f((kdh0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var2;
            default:
                ((Number) obj2).intValue();
                ((ufh0) obj4).c((b0k) obj, czo1.p(9));
                return rih1Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mbf0(Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mbf0(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }
}
