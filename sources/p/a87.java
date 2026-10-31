package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.wrapped.v1.proto.Paragraph;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a87 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a87(List list, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = list;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:292:0x0718  */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        int i;
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        vj01 vj01Var;
        Paragraph paragraph;
        int i11;
        int i12;
        boolean z6;
        int i13;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        List list = this.b;
        Object obj8 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                aqb0 aqb0Var = (aqb0) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                b87 b87Var = (b87) obj8;
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (x340Var.g(aqb0Var) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= x340Var.e(iIntValue) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(i & 1, (i & 147) != 146)) {
                    s77 s77Var = (t77) list.get(iIntValue);
                    x340Var2.i0(2137422305);
                    if (u890.j(s77Var, q77.a)) {
                        x340Var2.i0(-485239290);
                        z = false;
                        b87Var.e(((u77) obj7).a, x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        z = false;
                        if (s77Var instanceof s77) {
                            x340Var2.i0(-485236696);
                            s77 s77Var2 = s77Var;
                            b87Var.h(s77Var2.a, s77Var2.b, x340Var2, 0);
                            x340Var2.r(false);
                        } else {
                            if (s77Var instanceof p77) {
                                x340Var2.i0(-485233555);
                                dv20.l(0, ((p77) s77Var).a, x340Var2, false);
                            } else {
                                if (!(s77Var instanceof r77)) {
                                    throw p3d1.k(x340Var2, -485240222, false);
                                }
                                x340Var2.i0(-485231893);
                                r77 r77Var = (r77) s77Var;
                                b87Var.f(aqb0Var, r77Var.a, r77Var.b, !((Boolean) ((tob1) obj5).getValue()).booleanValue() ? (n8b1) obj6 : null, x340Var2, i & 14);
                                z2 = false;
                                x340Var2.r(false);
                            }
                            x340Var2.r(z2);
                        }
                    }
                    z2 = z;
                    x340Var2.r(z2);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                aqb0 aqb0Var2 = (aqb0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var3 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                ven0 ven0Var = (ven0) obj5;
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (x340Var3.g(aqb0Var2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= x340Var3.e(iIntValue3) ? 32 : 16;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(i2 & 1, (i2 & 147) != 146)) {
                    jwm jwmVar = (jwm) ((ArrayList) list).get(iIntValue3);
                    x340Var4.i0(996897720);
                    xpi0 xpi0Var = (xpi0) obj8;
                    abf abfVar = (abf) obj7;
                    String str = abfVar.b;
                    String str2 = abfVar.a;
                    jwm jwmVar2 = (jwm) obj6;
                    boolean zI = x340Var4.i(ven0Var) | x340Var4.i(jwmVar);
                    Object objT = x340Var4.T();
                    if (zI || objT == fkj0.X) {
                        z3 = false;
                        objT = new bbf(ven0Var, jwmVar, (byte) 0);
                        x340Var4.s0(objT);
                    } else {
                        z3 = false;
                    }
                    otw.c(xpi0Var, new tpi0(iIntValue3, str, str2, jwmVar, jwmVar2, (Function0) objT), (qim0) null, (ipb1) null, x340Var4, 0, 12);
                    x340Var4.r(z3);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                aqb0 aqb0Var3 = (aqb0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var5 = (b0k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                iu30 iu30Var = (iu30) obj6;
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (x340Var5.g(aqb0Var3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= x340Var5.e(iIntValue5) ? 32 : 16;
                }
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(i3 & 1, (i3 & 147) != 146)) {
                    h6q0 h6q0Var = (h6q0) list.get(iIntValue5);
                    x340Var6.i0(-704049831);
                    if (h6q0Var.c) {
                        x340Var6.i0(-704030612);
                        int size = ((List) ((ven0) obj5).getValue()).size() + iIntValue5;
                        gv51 gv51Var = (gv51) obj8;
                        boolean z7 = ((zkn) obj7).g.get(h6q0Var.a.a) != null;
                        boolean zG = x340Var6.g(iu30Var) | x340Var6.e(size) | x340Var6.i(h6q0Var);
                        Object objT2 = x340Var6.T();
                        if (zG || objT2 == fkj0.X) {
                            objT2 = new mi1(iu30Var, size, h6q0Var, (byte) 2);
                            x340Var6.s0(objT2);
                        }
                        iu30 iu30Var2 = (iu30) objT2;
                        w4i1 w4i1Var = h6q0Var.a;
                        String strZ = h6q0Var.b().z();
                        if (strZ == null) {
                            strZ = "";
                        }
                        otw.c(gv51Var, new ev51(w4i1Var, z7, size, 1, strZ, iu30Var2), (qim0) null, (ipb1) null, x340Var6, 0, 12);
                        z4 = false;
                        x340Var6.r(false);
                    } else {
                        z4 = false;
                        x340Var6.i0(-703158985);
                        x340Var6.r(false);
                    }
                    x340Var6.r(z4);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                aqb0 aqb0Var4 = (aqb0) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var7 = (b0k) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                dw91 dw91Var = (dw91) obj7;
                zgb0 zgb0Var = (zgb0) obj6;
                cib0 cib0Var = (cib0) obj8;
                List list2 = cib0Var.d;
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (x340Var7.g(aqb0Var4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= x340Var7.e(iIntValue7) ? 32 : 16;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(i4 & 1, (i4 & 147) != 146)) {
                    rib0 rib0Var = (rib0) list.get(iIntValue7);
                    x340Var8.i0(-1128303427);
                    int i14 = iIntValue7 - 1;
                    rib0 rib0Var2 = (rib0) o7h.t0(i14, list2);
                    qv91 qv91Var = dw91Var.c;
                    rib0 rib0Var3 = (rib0) o7h.t0(i14, list2);
                    if (rib0Var3 == null) {
                        z5 = false;
                    } else if (qv91Var.a.containsKey(rib0Var3.a())) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    Integer num = rib0Var.f;
                    if (num == null) {
                        x340Var8.i0(-1128111973);
                        x340Var8.r(false);
                    } else {
                        x340Var8.i0(-1128111972);
                        int iIntValue9 = num.intValue();
                        String strA = rib0Var.a();
                        boolean zI2 = x340Var8.i(zgb0Var) | x340Var8.i(rib0Var) | x340Var8.e(iIntValue9);
                        Object objT3 = x340Var8.T();
                        if (zI2 || objT3 == fkj0.X) {
                            objT3 = new v2b(zgb0Var, rib0Var, iIntValue9, (lnm) null, (byte) 7);
                            x340Var8.s0(objT3);
                        }
                        qxd0.t(strA, x340Var8, (vu30) objT3);
                        x340Var8.r(false);
                    }
                    i1o1.e((bjb0) obj5, new wib0(rib0Var, cib0Var.b), zgb0Var.c, null, null, avi.a, null, 0, apo.r(-1034852744, new tf((Object) rib0Var, (Object) dw91Var, (Object) rib0Var2, z5, (byte) 15), x340Var8), x340Var8, 100859904, 108);
                    x340Var8.r(false);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                aqb0 aqb0Var5 = (aqb0) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var9 = (b0k) obj3;
                int iIntValue11 = ((Number) obj4).intValue();
                if ((iIntValue11 & 6) == 0) {
                    i5 = iIntValue11 | (x340Var9.g(aqb0Var5) ? 4 : 2);
                } else {
                    i5 = iIntValue11;
                }
                if ((iIntValue11 & 48) == 0) {
                    i5 |= x340Var9.e(iIntValue10) ? 32 : 16;
                }
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(i5 & 1, (i5 & 147) != 146)) {
                    ffs0 ffs0Var = (ffs0) list.get(iIntValue10);
                    x340Var10.i0(1953714814);
                    jon1.a(ffs0Var, (a9g0) sqg0.G(ffs0Var.getRequestId(), ((b9g0) obj8).d), (d0r) obj7, (sjq0) ((bjx) obj6).f, (xx21) obj5, x340Var10, 0);
                    x340Var10.r(false);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 5:
                aqb0 aqb0Var6 = (aqb0) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var11 = (b0k) obj3;
                int iIntValue13 = ((Number) obj4).intValue();
                if ((iIntValue13 & 6) == 0) {
                    i6 = iIntValue13 | (x340Var11.g(aqb0Var6) ? 4 : 2);
                } else {
                    i6 = iIntValue13;
                }
                if ((iIntValue13 & 48) == 0) {
                    i6 |= x340Var11.e(iIntValue12) ? 32 : 16;
                }
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(i6 & 1, (i6 & 147) != 146)) {
                    gin0 gin0Var = (gin0) list.get(iIntValue12);
                    x340Var12.i0(-1150883793);
                    t3k1.h(gin0Var, ((Set) obj8).contains(gin0Var.a), (d0r) obj7, (poj0) obj6, (iu30) obj5, x340Var12, 0);
                    x340Var12.r(false);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 6:
                aqb0 aqb0Var7 = (aqb0) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var13 = (b0k) obj3;
                int iIntValue15 = ((Number) obj4).intValue();
                vu30 vu30Var = (vu30) obj7;
                m4c m4cVar = fkj0.X;
                if ((iIntValue15 & 6) == 0) {
                    i7 = iIntValue15 | (x340Var13.g(aqb0Var7) ? 4 : 2);
                } else {
                    i7 = iIntValue15;
                }
                if ((iIntValue15 & 48) == 0) {
                    i7 |= x340Var13.e(iIntValue14) ? 32 : 16;
                }
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(i7 & 1, (i7 & 147) != 146)) {
                    eno0 eno0Var = (eno0) list.get(iIntValue14);
                    x340Var14.i0(-1153027734);
                    String str3 = eno0Var.a;
                    int i15 = (i7 & 112) ^ 48;
                    boolean zI3 = ((i15 > 32 && x340Var14.e(iIntValue14)) || (i7 & 48) == 32) | x340Var14.i(eno0Var) | x340Var14.g((vu30) obj8);
                    Object objT4 = x340Var14.T();
                    if (zI3 || objT4 == m4cVar) {
                        objT4 = new m7s((Set) obj6, eno0Var, (vu30) obj8, iIntValue14, (lnm) null, (byte) 3);
                        i8 = iIntValue14;
                        x340Var14.s0(objT4);
                    } else {
                        i8 = iIntValue14;
                    }
                    qxd0.t(str3, x340Var14, (vu30) objT4);
                    String str4 = eno0Var.b;
                    boolean zG2 = x340Var14.g(vu30Var) | x340Var14.i(eno0Var) | ((i15 > 32 && x340Var14.e(i8)) || (i7 & 48) == 32);
                    Object objT5 = x340Var14.T();
                    if (zG2 || objT5 == m4cVar) {
                        objT5 = new wv1((Object) vu30Var, (Object) eno0Var, i8, (byte) 18);
                        x340Var14.s0(objT5);
                    }
                    Function0 function0 = (Function0) objT5;
                    if (ihc1.y0(str4)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    jto1.b(u291.f(nim0Var, 1.0f), null, null, false, null, null, new gbx(new y50(str4), function0), null, null, null, null, null, apo.r(-1822127708, new ukm0(eno0Var, (String) obj5, (byte) 9), x340Var14), null, null, apo.r(-1705960639, new qsn0(eno0Var, (byte) 10), x340Var14), x340Var14, 0, 196992, 28606);
                    x340Var14.r(false);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 7:
                aqb0 aqb0Var8 = (aqb0) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                x340 x340Var15 = (b0k) obj3;
                int iIntValue17 = ((Number) obj4).intValue();
                if ((iIntValue17 & 6) == 0) {
                    i9 = iIntValue17 | (x340Var15.g(aqb0Var8) ? 4 : 2);
                } else {
                    i9 = iIntValue17;
                }
                if ((iIntValue17 & 48) == 0) {
                    i9 |= x340Var15.e(iIntValue16) ? 32 : 16;
                }
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(i9 & 1, (i9 & 147) != 146)) {
                    Object obj9 = list.get(iIntValue16);
                    int i16 = i9 & 126;
                    h4z0 h4z0Var = (h4z0) obj9;
                    x340Var16.i0(-816012865);
                    Integer numValueOf = Integer.valueOf(iIntValue16);
                    boolean z8 = (((i9 & 112) ^ 48) > 32 && x340Var16.e(iIntValue16)) || (i9 & 48) == 32;
                    Object objT6 = x340Var16.T();
                    if (z8 || objT6 == fkj0.X) {
                        objT6 = new po60(iIntValue16, (byte) 22);
                        x340Var16.s0(objT6);
                    }
                    dgo1.c(numValueOf, (iu30) objT6, apo.r(-332141095, new lqf0((byte) 19, iIntValue16, (p40) obj8, (m4z0) obj7, (o4z0) obj6, h4z0Var, (i4z0) obj5), x340Var16), x340Var16, ((i16 >> 3) & 14) | 384);
                    x340Var16.r(false);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 8:
                aqb0 aqb0Var9 = (aqb0) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                x340 x340Var17 = (b0k) obj3;
                int iIntValue19 = ((Number) obj4).intValue();
                if ((iIntValue19 & 6) == 0) {
                    i10 = iIntValue19 | (x340Var17.g(aqb0Var9) ? 4 : 2);
                } else {
                    i10 = iIntValue19;
                }
                if ((iIntValue19 & 48) == 0) {
                    i10 |= x340Var17.e(iIntValue18) ? 32 : 16;
                }
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(i10 & 1, (i10 & 147) != 146)) {
                    vj01 vj01Var2 = (wj01) list.get(iIntValue18);
                    x340Var18.i0(1721235200);
                    if (vj01Var2 instanceof rj01) {
                        x340Var18.i0(1721282164);
                        otw.c((key) obj8, new jey((rj01) vj01Var2, iIntValue18, ((fl01) obj7).f == iIntValue18, ((Number) ((List) obj6).get(iIntValue18)).intValue()), (qim0) null, (ipb1) null, x340Var18, 0, 12);
                        x340Var18.r(false);
                    } else if (!(vj01Var2 instanceof vj01) || (paragraph = (vj01Var = vj01Var2).c) == null) {
                        x340Var18.i0(-1052831110);
                        fuo1.k(vj01Var2, null, false, x340Var18, 0, 14);
                        x340Var18.r(false);
                    } else {
                        x340Var18.i0(1721695704);
                        otw.c((tk51) obj5, new sk51(vj01Var.b, paragraph, false), (qim0) null, (ipb1) null, x340Var18, 0, 12);
                        x340Var18.r(false);
                    }
                    x340Var18.r(false);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 9:
                aqb0 aqb0Var10 = (aqb0) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                x340 x340Var19 = (b0k) obj3;
                int iIntValue21 = ((Number) obj4).intValue();
                if ((iIntValue21 & 6) == 0) {
                    i11 = iIntValue21 | (x340Var19.g(aqb0Var10) ? 4 : 2);
                } else {
                    i11 = iIntValue21;
                }
                if ((iIntValue21 & 48) == 0) {
                    i11 |= x340Var19.e(iIntValue20) ? 32 : 16;
                }
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(i11 & 1, (i11 & 147) != 146)) {
                    b6q0 b6q0Var = (b6q0) ((ArrayList) list).get(iIntValue20);
                    x340Var20.i0(-1766123330);
                    Object objT7 = x340Var20.T();
                    if (objT7 == fkj0.X) {
                        objT7 = v8r.q(Boolean.TRUE);
                        x340Var20.s0(objT7);
                    }
                    ven0 ven0Var2 = (ven0) objT7;
                    fq7.b((nbh) obj8, ((Boolean) ven0Var2.getValue()).booleanValue(), (qim0) null, (bby) null, xay.f(2, irn1.o0(100, 0, null, 6)).a(xay.l(14, irn1.o0(0, 0, null, 7))), (String) null, apo.r(-306293555, new tj6((yp71) obj7, b6q0Var, iIntValue20, (dp71) obj6, (ven0) obj5, ven0Var2), x340Var20), x340Var20, 1597440, 22);
                    x340Var20.r(false);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 10:
                aqb0 aqb0Var11 = (aqb0) obj;
                int iIntValue22 = ((Number) obj2).intValue();
                x340 x340Var21 = (b0k) obj3;
                int iIntValue23 = ((Number) obj4).intValue();
                if ((iIntValue23 & 6) == 0) {
                    i12 = iIntValue23 | (x340Var21.g(aqb0Var11) ? 4 : 2);
                } else {
                    i12 = iIntValue23;
                }
                if ((iIntValue23 & 48) == 0) {
                    i12 |= x340Var21.e(iIntValue22) ? 32 : 16;
                }
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(i12 & 1, (i12 & 147) != 146)) {
                    f6m f6mVar = (f6m) list.get(iIntValue22);
                    x340Var22.i0(-66070408);
                    qyo1.k((t8r0) obj8, f6mVar, (xfx) obj7, (j2i) obj6, (iu30) obj5, null, x340Var22, 0);
                    x340Var22.r(false);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            default:
                aqb0 aqb0Var12 = (aqb0) obj;
                int iIntValue24 = ((Number) obj2).intValue();
                x340 x340Var23 = (b0k) obj3;
                int iIntValue25 = ((Number) obj4).intValue();
                if ((iIntValue25 & 6) == 0) {
                    z6 = true;
                    i13 = iIntValue25 | (x340Var23.g(aqb0Var12) ? 4 : 2);
                } else {
                    z6 = true;
                    i13 = iIntValue25;
                }
                if ((iIntValue25 & 48) == 0) {
                    i13 |= x340Var23.e(iIntValue24) ? 32 : 16;
                }
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(i13 & 1, (i13 & 147) != 146 ? z6 : false)) {
                    bv50 bv50Var = (pf51) list.get(iIntValue24);
                    x340Var24.i0(-613720908);
                    if (bv50Var instanceof bv50) {
                        x340Var24.i0(-296891215);
                        bv50 bv50Var2 = bv50Var;
                        String str5 = bv50Var2.a;
                        String str6 = bv50Var2.b;
                        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                        uwr uwrVar = cbx.a;
                        aq8.i(0, str5, str6, x340Var24, uyn1.z(cbx.b(x340Var24).e.c, 0.0f, 2, qim0VarF));
                        x340Var24.r(false);
                    } else if (bv50Var instanceof vwv0) {
                        x340Var24.i0(-296882451);
                        ((j2i) obj8).J(bv50Var, ((ahk1) obj7).c, x340Var24, 0);
                        x340Var24.r(false);
                    } else if (bv50Var instanceof s271) {
                        x340Var24.i0(-613317072);
                        s271 s271Var = (s271) bv50Var;
                        qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                        uwr uwrVar2 = cbx.a;
                        aq8.n(s271Var, (lxk1) obj6, uyn1.z(cbx.b(x340Var24).e.b, 0.0f, 2, qim0VarF2), (iu30) obj5, x340Var24, 3072);
                        x340Var24.r(false);
                    } else {
                        if (!(bv50Var instanceof lye1)) {
                            throw p3d1.k(x340Var24, -296892113, false);
                        }
                        x340Var24.i0(-296868346);
                        lye1 lye1Var = (lye1) bv50Var;
                        String str7 = lye1Var.a;
                        String str8 = lye1Var.b;
                        qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                        uwr uwrVar3 = cbx.a;
                        aq8.p(0, str7, str8, x340Var24, uyn1.z(cbx.b(x340Var24).e.b, 0.0f, 2, qim0VarF3));
                        x340Var24.r(false);
                    }
                    x340Var24.r(false);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
        }
    }
}
