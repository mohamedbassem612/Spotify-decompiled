package p;

import android.graphics.Color;
import android.text.format.DateUtils;
import android.widget.EditText;
import com.spotify.aiplaylist.promptcreation.presentation.MessageInputView;
import com.spotify.libraryimportservice.tmm.UnmatchedItem;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x9g0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9g0(j2i j2iVar, j2i j2iVar2) {
        super(3);
        this.a = (byte) 22;
        this.c = j2iVar;
        this.b = j2iVar2;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        long j;
        long j2;
        long j3;
        qim0 qim0Var;
        boolean z;
        boolean z2;
        ((Number) obj3).intValue();
        x340 x340Var = (b0k) obj2;
        Object objT = x340Var.T();
        j06 j06Var = x340Var.a;
        if (objT == fkj0.X) {
            objT = v7k0.i;
            x340Var.s0(objT);
        }
        qim0 qim0Var2 = nim0.a;
        qim0 qim0VarB = s161.b(qim0Var2, false, (iu30) objT);
        era eraVar = een.R0;
        String str = (String) this.c;
        s7k0 s7k0Var = (s7k0) this.b;
        boolean z3 = s7k0Var.f;
        mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
        int iHashCode = Long.hashCode(x340Var.T);
        xos0 xos0VarM = x340Var.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
        hzj.A.getClass();
        if (j06Var == null) {
            tgp1.p();
            throw null;
        }
        x340Var.m0();
        boolean z4 = x340Var.S;
        n4k n4kVar = hmb0.t1;
        if (z4) {
            x340Var.l(n4kVar);
        } else {
            x340Var.v0();
        }
        llj lljVar = y580.O0;
        nko1.H(mbhVarA, x340Var, lljVar);
        llj lljVar2 = y580.N0;
        nko1.H(xos0VarM, x340Var, lljVar2);
        Integer numValueOf = Integer.valueOf(iHashCode);
        llj lljVar3 = y580.R0;
        nko1.H(numValueOf, x340Var, lljVar3);
        nko1.F(x340Var);
        llj lljVar4 = y580.Y;
        nko1.H(qim0VarE, x340Var, lljVar4);
        if (str == null) {
            x340Var.i0(-614494903);
            x340Var.r(false);
        } else {
            x340Var.i0(-614494902);
            if (z3) {
                x340Var.i0(1303083389);
                uwr uwrVar = cbx.a;
                j = cbx.a(x340Var).b.e;
                x340Var.r(false);
            } else {
                x340Var.i0(1303085117);
                j = ((u7h) x340Var.k(qgx.a)).a;
                x340Var.r(false);
            }
            b3o1.e(j, apo.r(-1769730145, new loi0(s7k0Var, str, (byte) 8), x340Var), x340Var, 48);
            x340Var.r(false);
        }
        jfv jfvVar = s7k0Var.e;
        String str2 = s7k0Var.d;
        if (jfvVar == null) {
            x340Var.i0(-613317213);
            x340Var.r(false);
            z2 = true;
        } else {
            x340Var.i0(-613317212);
            long j4 = jfvVar.a;
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0Var2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            String str3 = s7k0Var.b;
            if (str3 == null) {
                x340Var.i0(1196487141);
                x340Var.r(false);
                qim0Var = qim0Var2;
                z = false;
                j3 = j4;
                z2 = true;
            } else {
                x340Var.i0(1196487142);
                u7h u7hVar = (z3 || str2 == null) ? null : new u7h(z4p1.e(Color.parseColor(str2)));
                cr31 cr31VarB = er31.b(4.0f);
                if (u7hVar == null) {
                    x340Var.i0(1114961201);
                    uwr uwrVar2 = cbx.a;
                    j2 = cbx.a(x340Var).b.b;
                    x340Var.r(false);
                } else {
                    x340Var.i0(1114960178);
                    x340Var.r(false);
                    j2 = u7hVar.a;
                }
                qim0 qim0VarF = dug.f(qim0Var2, j2, cr31VarB);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarF);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar4);
                uwr uwrVar3 = cbx.a;
                lee1 lee1Var = cbx.d(x340Var).n;
                long j5 = ((yex) zex.a.d).a;
                qim0 qim0VarN = anm1.N("mixing_key_text_with_" + str3 + "_" + (str2 != null ? Color.parseColor(str2) : 0), uyn1.A(qim0Var2, 4.0f, 2.0f, 4.0f, 2.0f));
                j3 = j4;
                qim0Var = qim0Var2;
                z = false;
                z2 = true;
                uwo1.e(str3, qim0VarN, lee1Var, j5, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
                x340Var.r(true);
                x340Var.r(false);
            }
            op71.g(x340Var, u291.v(qim0Var, 6.0f));
            uwr uwrVar4 = cbx.a;
            lee1 lee1Var2 = cbx.d(x340Var).j;
            long j6 = cbx.a(x340Var).b.b;
            ngv ngvVar = ngv.e;
            long j7 = j3;
            uwo1.e(DateUtils.formatElapsedTime(jfv.u(j7, ngvVar)), anm1.N("mixing_seconds_text_with_" + jfv.u(j7, ngvVar), new i5j1(een.N0)), lee1Var2, j6, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            x340Var.r(z2);
            x340Var.r(z);
        }
        x340Var.r(z2);
        return rih1.a;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        vu30 vu30Var;
        hax haxVar;
        Object obj4;
        byte b = this.a;
        gex0 gex0Var = h36.a;
        f36 f36Var = h36.c;
        nim0 nim0Var = nim0.a;
        n4k n4kVar = hmb0.t1;
        int i = 3;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.b;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    xag0 xag0Var = (xag0) obj5;
                    otw.c((kjn0) obj6, new jjn0(2, xag0Var.a, xag0Var.b, true), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    xag0 xag0Var2 = (xag0) obj5;
                    otw.c((j6r) obj6, new h6r(xag0Var2.a, xag0Var2.h.c, true), (qim0) null, (ipb1) null, x340Var4, 0, 12);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    fx fxVar = (fx) obj6;
                    int iC = l1d.C(((xag0) obj5).e);
                    if (iC == 0 || iC == 1 || iC == 2) {
                        i = 2;
                    } else if (iC != 3) {
                        if (iC != 4) {
                            eg.o();
                            return null;
                        }
                        i = 2;
                    }
                    otw.c(fxVar, new ex(i, false), (qim0) null, (ipb1) null, x340Var6, 0, 12);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var7 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    o921 o921Var = (o921) obj6;
                    heg0 heg0Var = ((xag0) obj5).j.c;
                    otw.c(o921Var, new n921(heg0Var.b, true, heg0Var.a != 2, wxn0.a), (qim0) null, (ipb1) null, x340Var8, 0, 12);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var9 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    k6t k6tVar = (k6t) obj6;
                    xag0 xag0Var3 = (xag0) obj5;
                    String str = xag0Var3.a;
                    int i2 = xag0Var3.k.a;
                    boolean z = i2 == 2;
                    int iC2 = l1d.C(i2);
                    otw.c(k6tVar, new j6t(str, kk0.k(x340Var10, -1183135841, iC2 != 2 ? iC2 != 3 ? 2131958101 : 2131958104 : 2131958103, x340Var10, false), z), (qim0) null, (ipb1) null, x340Var10, 0, 12);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var11 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    otw.c((tr00) obj6, new sr00(((xag0) obj5).h.a, false), (qim0) null, (ipb1) null, x340Var12, 0, 12);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var13 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    xag0 xag0Var4 = (xag0) obj5;
                    otw.c((mij1) obj6, new lij1(xag0Var4.h.b, xag0Var4.e == 2), (qim0) null, (ipb1) null, x340Var14, 0, 12);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var15 = (b0k) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    xag0 xag0Var5 = (xag0) obj5;
                    otw.c((lfs0) obj6, new kfs0(xag0Var5.g, xag0Var5.a, xag0Var5.b), (qim0) null, (ipb1) null, x340Var16, 0, 12);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var17 = (b0k) obj2;
                int iIntValue9 = ((Number) obj3).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    hdg0 hdg0Var = (hdg0) obj5;
                    otw.c((kjn0) obj6, new jjn0(2, hdg0Var.a, hdg0Var.c, hdg0Var.h), (qim0) null, (ipb1) null, x340Var18, 0, 12);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 9:
                x340 x340Var19 = (b0k) obj2;
                int iIntValue10 = ((Number) obj3).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    hdg0 hdg0Var2 = (hdg0) obj5;
                    otw.c((j6r) obj6, new h6r(hdg0Var2.a, hdg0Var2.i, hdg0Var2.j), (qim0) null, (ipb1) null, x340Var20, 0, 12);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 10:
                x340 x340Var21 = (b0k) obj2;
                int iIntValue11 = ((Number) obj3).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    fx fxVar2 = (fx) obj6;
                    int iC3 = l1d.C(((hdg0) obj5).f);
                    if (iC3 == 0 || iC3 == 1 || iC3 == 2) {
                        i = 2;
                    } else if (iC3 != 3) {
                        if (iC3 != 4) {
                            eg.o();
                            return null;
                        }
                        i = 2;
                    }
                    otw.c(fxVar2, new ex(i, false), (qim0) null, (ipb1) null, x340Var22, 0, 12);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 11:
                x340 x340Var23 = (b0k) obj2;
                int iIntValue12 = ((Number) obj3).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    otw.c((gw3) obj6, new ew3(((hdg0) obj5).r), (qim0) null, (ipb1) null, x340Var24, 0, 12);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 12:
                x340 x340Var25 = (b0k) obj2;
                int iIntValue13 = ((Number) obj3).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    z721 z721Var = (z721) obj5;
                    otw.c((o921) obj6, new n921(z721Var.b, true, z721Var.a != 2, wxn0.a), (qim0) null, (ipb1) null, x340Var26, 0, 12);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var27 = (b0k) obj2;
                int iIntValue14 = ((Number) obj3).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    k6t k6tVar2 = (k6t) obj6;
                    hdg0 hdg0Var3 = (hdg0) obj5;
                    String str2 = hdg0Var3.a;
                    int i3 = hdg0Var3.n.a;
                    boolean z2 = i3 == 2;
                    int iC4 = l1d.C(i3);
                    otw.c(k6tVar2, new j6t(str2, kk0.k(x340Var28, 491520777, iC4 != 2 ? iC4 != 3 ? 2131958101 : 2131958104 : 2131958103, x340Var28, false), z2), (qim0) null, (ipb1) null, x340Var28, 0, 12);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 14:
                x340 x340Var29 = (b0k) obj2;
                int iIntValue15 = ((Number) obj3).intValue();
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    otw.c((tr00) obj6, new sr00(((hdg0) obj5).f10p.b.booleanValue(), false), (qim0) null, (ipb1) null, x340Var30, 0, 12);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var31 = (b0k) obj2;
                int iIntValue16 = ((Number) obj3).intValue();
                hdg0 hdg0Var4 = (hdg0) obj5;
                x340 x340Var32 = x340Var31;
                if (x340Var32.Y(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    otw.c((mij1) obj6, new lij1(hdg0Var4.f10p.c.booleanValue(), hdg0Var4.f == 2), (qim0) null, (ipb1) null, x340Var32, 0, 12);
                } else {
                    x340Var32.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var33 = (b0k) obj2;
                int iIntValue17 = ((Number) obj3).intValue();
                x340 x340Var34 = x340Var33;
                if (x340Var34.Y(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    hdg0 hdg0Var5 = (hdg0) obj5;
                    otw.c((k1k1) obj6, new j1k1(hdg0Var5.a, hdg0Var5.b), (qim0) null, (ipb1) null, x340Var34, 0, 12);
                } else {
                    x340Var34.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var35 = (b0k) obj2;
                int iIntValue18 = ((Number) obj3).intValue();
                x340 x340Var36 = x340Var35;
                if (x340Var36.Y(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    otw.c((oex0) obj6, new nex0(((hdg0) obj5).a), (qim0) null, (ipb1) null, x340Var36, 0, 12);
                } else {
                    x340Var36.b0();
                }
                return rih1Var;
            case 18:
                x340 x340Var37 = (b0k) obj2;
                int iIntValue19 = ((Number) obj3).intValue();
                x340 x340Var38 = x340Var37;
                if (x340Var38.Y(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    hdg0 hdg0Var6 = (hdg0) obj5;
                    otw.c((lfs0) obj6, new kfs0(hdg0Var6.m, hdg0Var6.a, hdg0Var6.c), (qim0) null, (ipb1) null, x340Var38, 0, 12);
                } else {
                    x340Var38.b0();
                }
                return rih1Var;
            case 19:
                x340 x340Var39 = (b0k) obj2;
                ((Number) obj3).intValue();
                ctg0 ctg0Var = (ctg0) obj6;
                String str3 = (String) obj5;
                jw31 jw31VarA = ew31.a(gex0Var, een.N0, x340Var39, 0);
                x340 x340Var40 = x340Var39;
                int iHashCode = Long.hashCode(x340Var40.T);
                xos0 xos0VarM = x340Var40.m();
                qim0 qim0VarE = zr7.E(x340Var39, nim0Var);
                hzj.A.getClass();
                x340 x340Var41 = x340Var39;
                if (x340Var41.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var41.m0();
                if (x340Var41.S) {
                    x340Var41.l(n4kVar);
                } else {
                    x340Var41.v0();
                }
                nko1.H(jw31VarA, x340Var39, y580.O0);
                nko1.H(xos0VarM, x340Var39, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var39, y580.R0);
                nko1.F(x340Var39);
                nko1.H(qim0VarE, x340Var39, y580.Y);
                clx clxVar = clx.c;
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var39).g;
                w0h1.a(clxVar, isl.a, u291.r(nim0Var, 12.0f), ctg0Var.b, 0L, false, x340Var39, clx.d | 48, 48);
                uwo1.e(str3, uyn1.z(4.0f, 0.0f, 2, nim0Var), cbx.d(x340Var39).m, ctg0Var.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var39, 0, 0, 2032);
                x340Var41.r(true);
                return rih1Var;
            case 20:
                ((Number) obj3).intValue();
                ((n7h0) obj6).c(0, (b0k) obj2, (iu30) obj5, (qim0) null);
                return rih1Var;
            case 21:
                uwr uwrVar2 = cbx.a;
                x340 x340Var42 = (b0k) obj2;
                int iIntValue20 = ((Number) obj3).intValue();
                x340 x340Var43 = x340Var42;
                if (x340Var43.Y(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    Set set = (Set) obj6;
                    UnmatchedItem unmatchedItem = (UnmatchedItem) obj5;
                    jw31 jw31VarA2 = ew31.a(gex0Var, een.N0, x340Var43, 48);
                    int iHashCode2 = Long.hashCode(x340Var43.T);
                    xos0 xos0VarM2 = x340Var43.m();
                    qim0 qim0VarE2 = zr7.E(x340Var43, nim0Var);
                    hzj.A.getClass();
                    if (x340Var43.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var43.m0();
                    if (x340Var43.S) {
                        x340Var43.l(n4kVar);
                    } else {
                        x340Var43.v0();
                    }
                    nko1.H(jw31VarA2, x340Var43, y580.O0);
                    nko1.H(xos0VarM2, x340Var43, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var43, y580.R0);
                    nko1.F(x340Var43);
                    nko1.H(qim0VarE2, x340Var43, y580.Y);
                    Set set2 = set;
                    hux huxVar = !set2.isEmpty() ? klx.c : cnx.c;
                    if (set2.isEmpty()) {
                        x340Var43.i0(665831377);
                        j = cbx.a(x340Var43).b.e;
                        x340Var43.r(false);
                    } else {
                        x340Var43.i0(665829810);
                        j = cbx.a(x340Var43).b.f;
                        x340Var43.r(false);
                    }
                    long j2 = j;
                    zov0 zov0Var2 = cbx.b(x340Var43).g;
                    w0h1.a(huxVar, isl.a, u291.r(nim0Var, 16.0f), j2, 0L, true, x340Var43, 196664, 16);
                    cvx cvxVar = cbx.b(x340Var43).b;
                    op71.g(x340Var43, u291.v(nim0Var, 8.0f));
                    uwo1.e(unmatchedItem.getTitle(), new wnb0(1.0f, true), cbx.d(x340Var43).g, 0L, (a0e1) null, (iu30) null, 2, false, new zic0(1), 0, (qx8) null, x340Var43, 1572864, 0, 1720);
                    x340Var43.r(true);
                } else {
                    x340Var43.b0();
                }
                return rih1Var;
            case 22:
                x340 x340Var44 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarY = voo1.y(u291.f(nim0Var, 1.0f), voo1.g);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var44).b;
                qim0 qim0VarZ = uyn1.z(0.0f, 16.0f, 1, qim0VarY);
                j2i j2iVar = (j2i) obj6;
                j2i j2iVar2 = (j2i) obj5;
                mbh mbhVarA = jbh.a(f36Var, een.P0, x340Var44, 0);
                x340 x340Var45 = x340Var44;
                int iHashCode3 = Long.hashCode(x340Var45.T);
                xos0 xos0VarM3 = x340Var45.m();
                qim0 qim0VarE3 = zr7.E(x340Var44, qim0VarZ);
                hzj.A.getClass();
                x340 x340Var46 = x340Var44;
                if (x340Var46.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var46.m0();
                if (x340Var46.S) {
                    x340Var46.l(n4kVar);
                } else {
                    x340Var46.v0();
                }
                nko1.H(mbhVarA, x340Var44, y580.O0);
                nko1.H(xos0VarM3, x340Var44, y580.N0);
                nko1.H(Integer.valueOf(iHashCode3), x340Var44, y580.R0);
                nko1.F(x340Var44);
                nko1.H(qim0VarE3, x340Var44, y580.Y);
                String strO0 = cwl1.o0(x340Var44, 2131958512);
                lee1 lee1Var = cbx.d(x340Var44).d;
                cvx cvxVar3 = cbx.b(x340Var44).b;
                uwo1.e(strO0, uyn1.z(16.0f, 0.0f, 2, nim0Var), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var44, 0, 0, 2040);
                cvx cvxVar4 = cbx.b(x340Var44).b;
                op71.g(x340Var44, u291.h(nim0Var, 16.0f));
                j2iVar.invoke(x340Var44, 0);
                j2iVar2.invoke(x340Var44, 0);
                x340Var46.r(true);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                x340 x340Var47 = (b0k) obj2;
                ((Number) obj3).intValue();
                iu30 iu30Var = (iu30) obj5;
                int i4 = 0;
                for (Object obj7 : ((fvi0) obj6).a) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        p7h.T();
                        throw null;
                    }
                    evi0 evi0Var = (evi0) obj7;
                    String str4 = evi0Var.b;
                    String str5 = evi0Var.c;
                    plx plxVar = plx.c;
                    String str6 = evi0Var.d;
                    if (ihc1.y0(str6)) {
                        str6 = null;
                    }
                    if (str6 == null) {
                        x340 x340Var48 = x340Var47;
                        x340Var48.i0(-1650373138);
                        x340Var48.r(false);
                        vu30Var = null;
                    } else {
                        x340 x340Var49 = x340Var47;
                        x340Var49.i0(-1650373137);
                        vu30 vu30VarR = apo.r(579117143, new loi0(str6, evi0Var, true ? (byte) 1 : (byte) 0), x340Var49);
                        x340Var49.r(false);
                        vu30Var = vu30VarR;
                    }
                    x340 x340Var50 = x340Var47;
                    boolean zG = x340Var50.g(iu30Var) | x340Var50.g(evi0Var) | x340Var50.e(i4);
                    Object objT = x340Var50.T();
                    if (zG || objT == fkj0.X) {
                        objT = new wv1(iu30Var, evi0Var, i4, (byte) 15);
                        x340Var50.s0(objT);
                    }
                    h0p1.j(str4, (qim0) null, str5, vu30Var, plxVar, (Function0) objT, x340Var50, plx.d << 15);
                    i4 = i5;
                }
                return rih1Var;
            case 24:
                hsl1 hsl1Var = (hsl1) obj2;
                MessageInputView messageInputView = (MessageInputView) obj5;
                l811 l811Var = (l811) obj6;
                if (l811Var.a) {
                    int i6 = hsl1Var.a.i(8).d;
                    iu30 iu30Var2 = messageInputView.V0;
                    if (i6 > 0) {
                        iu30Var2.invoke(wzi0.b);
                    } else {
                        iu30Var2.invoke(wzi0.a);
                        ((EditText) messageInputView.T0.b).clearFocus();
                    }
                } else {
                    l811Var.a = true;
                }
                return hsl1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                vu30 vu30Var2 = (vu30) obj;
                x340 x340Var51 = (b0k) obj2;
                int iIntValue21 = ((Number) obj3).intValue();
                if ((iIntValue21 & 6) == 0) {
                    iIntValue21 |= x340Var51.i(vu30Var2) ? 4 : 2;
                }
                x340 x340Var52 = x340Var51;
                if (!x340Var52.Y(iIntValue21 & 1, (iIntValue21 & 19) != 18)) {
                    x340Var52.b0();
                } else if (((Boolean) ((ven0) obj5).getValue()).booleanValue()) {
                    x340Var52.i0(-1986874099);
                    us71.j(iIntValue21 & 14, vu30Var2, x340Var52, false);
                } else {
                    x340Var52.i0(-1986816749);
                    fq7.d((zen0) obj6, (qim0) null, xay.e(2, irn1.o0(200, 0, (dlv) null, 6)).a(xay.d(irn1.o0(200, 0, (dlv) null, 6), (fra) null, 14)), (ln00) null, (String) null, apo.r(-702545114, new a2(vu30Var2, (byte) 8), x340Var52), x340Var52, 196992, 26);
                    x340Var52.r(false);
                }
                return rih1Var;
            case 26:
                x340 x340Var53 = (b0k) obj2;
                int iIntValue22 = ((Number) obj3).intValue();
                x340 x340Var54 = x340Var53;
                if (x340Var54.Y(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    WeakHashMap weakHashMap = osl1.x;
                    qim0 qim0VarO = td6.o(lhc.g(x340Var54).f, 16, nim0Var);
                    qyj0 qyj0Var = (qyj0) obj6;
                    kak0 kak0Var = (kak0) obj5;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode4 = Long.hashCode(x340Var54.T);
                    xos0 xos0VarM4 = x340Var54.m();
                    qim0 qim0VarE4 = zr7.E(x340Var54, qim0VarO);
                    hzj.A.getClass();
                    if (x340Var54.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var54.m0();
                    if (x340Var54.S) {
                        x340Var54.l(n4kVar);
                    } else {
                        x340Var54.v0();
                    }
                    nko1.H(gfh0VarC, x340Var54, y580.O0);
                    nko1.H(xos0VarM4, x340Var54, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode4), x340Var54, y580.R0);
                    nko1.F(x340Var54);
                    nko1.H(qim0VarE4, x340Var54, y580.Y);
                    otw.c(qyj0Var.h, kak0Var, (qim0) null, (ipb1) null, x340Var54, 0, 12);
                    x340Var54.r(true);
                } else {
                    x340Var54.b0();
                }
                return rih1Var;
            case 27:
                return a(obj, obj2, obj3);
            case 28:
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                qim0 qim0VarN = anm1.N("harmonize_confirmation", nim0Var);
                sek0 sek0Var = (sek0) obj6;
                iu30 iu30Var3 = (iu30) obj5;
                x340 x340Var55 = (b0k) obj2;
                boolean zG2 = x340Var55.g(iu30Var3);
                Object objT2 = x340Var55.T();
                Object obj8 = objT2;
                if (zG2 || objT2 == m4cVar) {
                    stj0 stj0Var = new stj0(iu30Var3, (byte) 27);
                    x340Var55.s0(stj0Var);
                    obj8 = stj0Var;
                }
                Function0 function0 = (Function0) obj8;
                boolean zG3 = x340Var55.g(iu30Var3);
                Object objT3 = x340Var55.T();
                Object obj9 = objT3;
                if (zG3 || objT3 == m4cVar) {
                    stj0 stj0Var2 = new stj0(iu30Var3, (byte) 28);
                    x340Var55.s0(stj0Var2);
                    obj9 = stj0Var2;
                }
                sek0Var.e(function0, (Function0) obj9, qim0VarN, x340Var55, 0);
                WeakHashMap weakHashMap2 = osl1.x;
                op71.g(x340Var55, yoo1.D(nim0Var, lhc.g(x340Var55).g));
                return rih1Var;
            default:
                x340 x340Var56 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0Var = nim0.a;
                qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                bek0 bek0Var = (bek0) obj6;
                Function0 function1 = (Function0) obj5;
                mbh mbhVarA2 = jbh.a(f36Var, een.Q0, x340Var56, 0);
                x340 x340Var57 = x340Var56;
                int iHashCode5 = Long.hashCode(x340Var57.T);
                xos0 xos0VarM5 = x340Var57.m();
                qim0 qim0VarE5 = zr7.E(x340Var56, qim0VarF);
                hzj.A.getClass();
                x340 x340Var58 = x340Var56;
                if (x340Var58.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var58.m0();
                if (x340Var58.S) {
                    x340Var58.l(n4kVar);
                } else {
                    x340Var58.v0();
                }
                nko1.H(mbhVarA2, x340Var56, y580.O0);
                nko1.H(xos0VarM5, x340Var56, y580.N0);
                nko1.H(Integer.valueOf(iHashCode5), x340Var56, y580.R0);
                nko1.F(x340Var56);
                nko1.H(qim0VarE5, x340Var56, y580.Y);
                String strO1 = cwl1.o0(x340Var56, 2131958847);
                uwr uwrVar4 = cbx.a;
                uwo1.e(strO1, (qim0) null, cbx.d(x340Var56).h, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var56, 0, 0, 2026);
                uwo1.e(cwl1.o0(x340Var56, 2131958844), (qim0) null, cbx.d(x340Var56).j, cbx.a(x340Var56).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var56, 0, 0, 2018);
                gdx gdxVarS = yla.s(x340Var56);
                idx idxVar = new idx(4);
                boolean zEquals = bek0Var.equals(wdk0.a);
                ydk0 ydk0Var = ydk0.a;
                if (zEquals || bek0Var.equals(xdk0.a) || bek0Var.equals(zdk0.a)) {
                    haxVar = jax.a;
                } else {
                    if (!bek0Var.equals(ydk0Var)) {
                        eg.o();
                        return null;
                    }
                    haxVar = new hax("Unable to reorder");
                }
                cvx cvxVar5 = cbx.b(x340Var56).b;
                qim0 qim0VarThen = anm1.N("reorder_education_smart_reorder", uyn1.B(qim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13)).then((!(bek0Var instanceof aek0) || bek0Var.equals(ydk0Var)) ? qim0Var : pqo.h(qim0Var, true));
                boolean zG4 = x340Var58.g(function1);
                Object objT4 = x340Var58.T();
                if (zG4 || objT4 == fkj0.X) {
                    obj4 = objT4;
                    kek0 kek0Var = new kek0(function1, (byte) 3);
                    x340Var58.s0(kek0Var);
                    obj4 = kek0Var;
                }
                obj4 = objT4;
                foo1.c(new gbx(z50.c, (Function0) obj4), idxVar, qim0VarThen, haxVar, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, g2j.a, x340Var56, 0, 48, 1992);
                x340Var58.r(true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x9g0(Object obj, Object obj2, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9g0(ctg0 ctg0Var, cvx cvxVar, String str) {
        super(3);
        this.a = (byte) 19;
        this.c = ctg0Var;
        this.b = str;
    }
}
