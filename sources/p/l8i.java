package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l8i extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l8i(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        long j;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    w0h1.a(etx.c, isl.a, (qim0) null, u7h.f, 0L, ((nk9) obj3).b, x340Var2, etx.d | 48, 20);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    spx spxVar = ((fp9) obj3).a ? spx.c : xpx.c;
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var4).g;
                    w0h1.a(spxVar, isl.a, u291.r(nim0Var, 32.0f), 0L, 0L, false, x340Var4, 56, 56);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    String str = ((aob) obj3).d;
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(str, null, null, cbx.a(x340Var6).b.c, null, null, 0, false, null, 0, null, x340Var6, 0, 0, 2038);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    vby0.b((bac) obj3, (qim0) null, x340Var8, 8);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    vvm1.d(0, ((o8e) obj3).b, x340Var10, (qim0) null);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                m4f m4fVar = (m4f) obj3;
                Integer num = m4fVar.b;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    hux huxVar = m4fVar.a;
                    if (num == null) {
                        x340Var12.i0(-1382274709);
                        iqo1.f(huxVar, x340Var12, 8);
                        x340Var12.r(false);
                    } else {
                        x340Var12.i0(-1382273630);
                        iqo1.m(num.intValue(), 64, x340Var12, huxVar);
                        x340Var12.r(false);
                    }
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    eqr0.b(0, 2, ((flt) obj3).c, x340Var14, (qim0) null);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    uwr uwrVar3 = cbx.a;
                    long j2 = cbx.a(x340Var16).a.c;
                    long j3 = cbx.a(x340Var16).b.a;
                    cua cuaVar = cbx.b(x340Var16).f;
                    cxm.m((xr91) obj3, (qim0) null, er31.b(4.0f), j2, j3, 0L, 0.0f, x340Var16, 0, 198);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    uwr uwrVar4 = cbx.a;
                    uwo1.e(((r7w) obj3).c, null, cbx.d(x340Var18).k, cbx.a(x340Var18).b.b, null, null, 0, false, null, 0, null, x340Var18, 0, 0, 2034);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 9:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ajo1.g((t6x) obj3, null, x340Var20, 0);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 10:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    flo1.b((b9x) obj3, (qim0) null, x340Var22, 8);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    uwo1.e(((xfz) obj3).c, null, null, 0L, null, null, 0, false, null, 0, null, x340Var24, 0, 0, 2046);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case grn1.d /* 12 */:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    y920 y920Var = (y920) obj3;
                    jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), een.Z, x340Var26, 6);
                    int iHashCode = Long.hashCode(x340Var26.T);
                    xos0 xos0VarM = x340Var26.m();
                    qim0 qim0VarE = zr7.E(x340Var26, nim0Var);
                    hzj.A.getClass();
                    if (x340Var26.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var26.m0();
                    if (x340Var26.S) {
                        x340Var26.l(n4kVar);
                    } else {
                        x340Var26.v0();
                    }
                    nko1.H(jw31VarA, x340Var26, y580.O0);
                    nko1.H(xos0VarM, x340Var26, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var26, y580.R0);
                    nko1.F(x340Var26);
                    nko1.H(qim0VarE, x340Var26, y580.Y);
                    q620 q620Var = y920Var.a;
                    String str2 = q620Var.b;
                    Integer num2 = q620Var.c;
                    uwo1.e(str2, null, null, 0L, null, null, 0, false, null, 0, null, x340Var26, 0, 0, 2046);
                    if (num2 == null) {
                        x340Var26.i0(-1402889216);
                        x340Var26.r(false);
                    } else {
                        x340Var26.i0(-1402889215);
                        zic0 zic0Var = new zic0(1);
                        String strN0 = cwl1.n0(2131964164, new Object[]{num2}, x340Var26);
                        uwr uwrVar5 = cbx.a;
                        uwo1.e(strN0, null, null, u7h.b(cbx.a(x340Var26).b.a, 0.6f, 0.0f, 0.0f, 0.0f, 14), null, null, 0, false, zic0Var, 0, null, x340Var26, 0, 0, 1782);
                        x340Var26.r(false);
                    }
                    x340Var26.r(true);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    uwr uwrVar6 = cbx.a;
                    zov0 zov0Var2 = cbx.b(x340Var28).g;
                    qim0 qim0VarR = u291.r(nim0Var, 24.0f);
                    xox xoxVar = xox.c;
                    boolean z = ((xs30) obj3).b;
                    if (z) {
                        x340Var28.i0(1778909395);
                        j = cbx.a(x340Var28).c.c;
                        x340Var28.r(false);
                    } else {
                        x340Var28.i0(1778910162);
                        x340Var28.r(false);
                        j = u7h.k;
                    }
                    w0h1.a(xoxVar, isl.a, qim0VarR, j, 0L, z, x340Var28, xox.d | 48, 16);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 14:
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    uwr uwrVar7 = cbx.a;
                    zov0 zov0Var3 = cbx.b(x340Var30).g;
                    w0h1.a(((at30) obj3).b == xlk1.b ? ztx.c : bux.c, isl.a, u291.r(nim0Var, 24.0f), u7h.k, 0L, false, x340Var30, 199736, 16);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var31 = (b0k) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                x340 x340Var32 = x340Var31;
                if (x340Var32.Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    String str3 = ((kq50) obj3).a.a;
                    uwr uwrVar8 = cbx.a;
                    uwo1.e(str3, null, cbx.d(x340Var32).k, 0L, null, null, 0, false, null, 0, null, x340Var32, 0, 0, 2042);
                } else {
                    x340Var32.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var33 = (b0k) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                x340 x340Var34 = x340Var33;
                if (x340Var34.Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    p9a0 p9a0Var = (p9a0) obj3;
                    eth.a(p9a0Var.c, (qim0) null, (ni20) null, (String) null, apo.r(1984245213, new okg(p9a0Var, (byte) 18), x340Var34), x340Var34, 24576, 14);
                } else {
                    x340Var34.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var35 = (b0k) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                x340 x340Var36 = x340Var35;
                if (x340Var36.Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    String str4 = ((h2d0) obj3).a;
                    uwr uwrVar9 = cbx.a;
                    uwo1.e(str4, null, cbx.d(x340Var36).j, cbx.a(x340Var36).b.a, null, null, 0, false, null, 0, null, x340Var36, 0, 0, 2034);
                } else {
                    x340Var36.b0();
                }
                return rih1Var;
            case 18:
                x340 x340Var37 = (b0k) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                x340 x340Var38 = x340Var37;
                if (x340Var38.Y(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    x1p1.a((jmd0) obj3, null, x340Var38, 0);
                } else {
                    x340Var38.b0();
                }
                return rih1Var;
            case 19:
                x340 x340Var39 = (b0k) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                x340 x340Var40 = x340Var39;
                if (x340Var40.Y(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    f0o1.c((xtg0) obj3, null, x340Var40, 8);
                } else {
                    x340Var40.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                x340 x340Var41 = (b0k) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                x340 x340Var42 = x340Var41;
                if (x340Var42.Y(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    evj0 evj0Var = (evj0) obj3;
                    jw31 jw31VarA2 = ew31.a(h36.a, een.N0, x340Var42, 48);
                    int iHashCode2 = Long.hashCode(x340Var42.T);
                    xos0 xos0VarM2 = x340Var42.m();
                    qim0 qim0VarE2 = zr7.E(x340Var42, nim0Var);
                    hzj.A.getClass();
                    if (x340Var42.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var42.m0();
                    if (x340Var42.S) {
                        x340Var42.l(n4kVar);
                    } else {
                        x340Var42.v0();
                    }
                    nko1.H(jw31VarA2, x340Var42, y580.O0);
                    nko1.H(xos0VarM2, x340Var42, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var42, y580.R0);
                    nko1.F(x340Var42);
                    nko1.H(qim0VarE2, x340Var42, y580.Y);
                    String strN1 = cwl1.n0(2131958684, new Object[]{Integer.valueOf(evj0Var.a)}, x340Var42);
                    uwr uwrVar10 = cbx.a;
                    uwo1.e(strN1, null, cbx.d(x340Var42).j, 0L, null, null, 0, false, new cjc0(1), 0, new px8(cbx.d(x340Var42).o.a.b, cbx.d(x340Var42).j.a.b, fc11.G(1), (mx8) null, 8), x340Var42, 0, 8, 762);
                    op71.g(x340Var42, u291.v(nim0Var, 4.0f));
                    w0h1.a(mlx.c, isl.a, u291.r(nim0Var, 8.0f), z4p1.g(4289967027L), 0L, false, x340Var42, mlx.d | 3504, 48);
                    x340Var42.r(true);
                } else {
                    x340Var42.b0();
                }
                return rih1Var;
            case 21:
                x340 x340Var43 = (b0k) obj;
                int iIntValue22 = ((Number) obj2).intValue();
                x340 x340Var44 = x340Var43;
                if (x340Var44.Y(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    mbk0 mbk0Var = ((obk0) obj3).c;
                    Object objT = x340Var44.T();
                    if (objT == fkj0.X) {
                        objT = oqi.X;
                        x340Var44.s0(objT);
                    }
                    hm5.a(mbk0Var, (qim0) null, (iu30) null, (tl3) null, "", (iu30) objT, a2j.a, x340Var44, 1794048, 14);
                } else {
                    x340Var44.b0();
                }
                return rih1Var;
            case 22:
                x340 x340Var45 = (b0k) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                m6q0 m6q0Var = (m6q0) obj3;
                boolean z2 = m6q0Var.b;
                x340 x340Var46 = x340Var45;
                if (x340Var46.Y(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    uwr uwrVar11 = cbx.a;
                    qim0 qim0VarV = u291.v(nim0Var, if71.b);
                    w5q0 w5q0Var = m6q0Var.a;
                    if (w5q0Var instanceof w5q0) {
                        x340Var46.i0(-195014068);
                        ern1.f(w5q0Var, z2, qim0VarV, x340Var46, 0);
                        x340Var46.r(false);
                    } else if (w5q0Var instanceof x5q0) {
                        x340Var46.i0(-194869205);
                        vzn1.g((x5q0) w5q0Var, z2, qim0VarV, x340Var46, 0);
                        x340Var46.r(false);
                    } else if (w5q0Var instanceof y5q0) {
                        x340Var46.i0(-194721738);
                        ucp1.g((y5q0) w5q0Var, z2, qim0VarV, x340Var46, 0);
                        x340Var46.r(false);
                    } else if (w5q0Var instanceof v5q0) {
                        x340Var46.i0(-194518347);
                        yoo1.f((v5q0) w5q0Var, z2, qim0VarV, x340Var46, 0);
                        x340Var46.r(false);
                    } else {
                        if (!(w5q0Var instanceof z5q0)) {
                            throw p3d1.k(x340Var46, -1668861095, false);
                        }
                        x340Var46.i0(-194313995);
                        qro1.l((z5q0) w5q0Var, z2, qim0VarV, x340Var46, 0);
                        x340Var46.r(false);
                    }
                } else {
                    x340Var46.b0();
                }
                return rih1Var;
            case 23:
                x340 x340Var47 = (b0k) obj;
                int iIntValue24 = ((Number) obj2).intValue();
                x340 x340Var48 = x340Var47;
                if (x340Var48.Y(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    String str5 = ((ce11) obj3).a;
                    uwr uwrVar12 = cbx.a;
                    uwo1.e(str5, null, cbx.d(x340Var48).k, 0L, null, null, 0, false, null, 0, null, x340Var48, 0, 0, 2042);
                } else {
                    x340Var48.b0();
                }
                return rih1Var;
            case 24:
                x340 x340Var49 = (b0k) obj;
                int iIntValue25 = ((Number) obj2).intValue();
                x340 x340Var50 = x340Var49;
                if (x340Var50.Y(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    uwo1.e(((ge21) obj3).a.b, null, null, 0L, null, null, 0, false, null, 0, null, x340Var50, 0, 0, 2046);
                } else {
                    x340Var50.b0();
                }
                return rih1Var;
            case 25:
                x340 x340Var51 = (b0k) obj;
                int iIntValue26 = ((Number) obj2).intValue();
                x340 x340Var52 = x340Var51;
                if (!x340Var52.Y(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    x340Var52.b0();
                } else if (((pn21) obj3).a) {
                    x340Var52.i0(-623085224);
                    xto1.e(null, 2, 0L, 0L, x340Var52, 48, 13);
                    x340Var52.r(false);
                } else {
                    x340Var52.i0(-623002268);
                    uwo1.e(cwl1.o0(x340Var52, 2131952288), null, null, 0L, null, null, 0, false, null, 0, null, x340Var52, 0, 0, 2046);
                    x340Var52.r(false);
                }
                return rih1Var;
            case 26:
                x340 x340Var53 = (b0k) obj;
                int iIntValue27 = ((Number) obj2).intValue();
                x340 x340Var54 = x340Var53;
                if (x340Var54.Y(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    uwr uwrVar13 = cbx.a;
                    uwo1.e(((qh51) obj3).c, null, cbx.d(x340Var54).k, cbx.a(x340Var54).b.b, null, null, 0, false, null, 0, null, x340Var54, 0, 0, 2034);
                } else {
                    x340Var54.b0();
                }
                return rih1Var;
            case 27:
                x340 x340Var55 = (b0k) obj;
                int iIntValue28 = ((Number) obj2).intValue();
                x340 x340Var56 = x340Var55;
                if (x340Var56.Y(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    uwo1.e(((ck51) obj3).b, null, null, 0L, null, null, 0, false, null, 0, null, x340Var56, 0, 0, 2046);
                } else {
                    x340Var56.b0();
                }
                return rih1Var;
            case 28:
                x340 x340Var57 = (b0k) obj;
                int iIntValue29 = ((Number) obj2).intValue();
                x340 x340Var58 = x340Var57;
                if (x340Var58.Y(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    uwr uwrVar14 = cbx.a;
                    uwo1.e(((tw81) obj3).a.c.a, null, cbx.d(x340Var58).k, cbx.a(x340Var58).b.a, null, null, 2, false, new zic0(1), 0, null, x340Var58, 0, 0, 1714);
                } else {
                    x340Var58.b0();
                }
                return rih1Var;
            default:
                x340 x340Var59 = (b0k) obj;
                int iIntValue30 = ((Number) obj2).intValue();
                x340 x340Var60 = x340Var59;
                if (x340Var60.Y(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    boolean z3 = ((l0b1) obj3).a;
                    w0h1.a(z3 ? aux.c : ztx.c, new jsl(z3 ? x0d.k(x340Var60, 388439777, 2131959077, x340Var60, false) : x0d.k(x340Var60, 388442115, 2131963480, x340Var60, false)), (qim0) null, 0L, 0L, false, x340Var60, 8, 60);
                } else {
                    x340Var60.b0();
                }
                return rih1Var;
        }
    }
}
