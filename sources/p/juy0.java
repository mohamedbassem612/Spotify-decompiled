package p;

import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class juy0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public juy0(iu30 iu30Var, xv00 xv00Var) {
        super(4);
        this.a = (byte) 3;
        this.b = iu30Var;
        this.c = xv00Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        m4c m4cVar;
        qim0 qim0Var;
        boolean z;
        mmr0 mmr0Var;
        int i;
        boolean z2;
        byte b = this.a;
        z50 z50Var = z50.c;
        f36 f36Var = h36.c;
        byte b2 = 4;
        n4k n4kVar = hmb0.t1;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.b;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj2).intValue();
                ((Number) obj4).intValue();
                ggo1.x((rul1) ((c380) obj6).get(iIntValue), (iu30) obj5, (b0k) obj3, 0);
                return rih1Var;
            case 1:
                ((Boolean) obj2).getClass();
                b0k b0kVar = (b0k) obj3;
                ((Number) obj4).intValue();
                m4c m4cVar2 = fkj0.X;
                qim0 qim0Var2 = nim0.a;
                qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
                era eraVar = een.Q0;
                gjz0 gjz0Var = (gjz0) obj6;
                int i2 = gjz0Var.c;
                iu30 iu30Var = (iu30) obj5;
                mbh mbhVarA = jbh.a(f36Var, eraVar, b0kVar, 0);
                x340 x340Var = (x340) b0kVar;
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(b0kVar, qim0VarD);
                hzj.A.getClass();
                x340 x340Var2 = (x340) b0kVar;
                if (x340Var2.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, b0kVar, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, b0kVar, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, b0kVar, lljVar3);
                nko1.F(b0kVar);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, b0kVar, lljVar4);
                uwr uwrVar = cbx.a;
                qim0 qim0VarH = kx40.h(1.0f, u291.f(uyn1.z(cbx.b(b0kVar).b.a, 0.0f, 2, qim0Var2), 1.0f), true);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(b0kVar, qim0VarH);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC, b0kVar, lljVar);
                nko1.H(xos0VarM2, b0kVar, lljVar2);
                i3a.l(iHashCode2, b0kVar, lljVar3, b0kVar);
                nko1.H(qim0VarE2, b0kVar, lljVar4);
                String str = gjz0Var.h;
                int iC = l1d.C(i2);
                isl islVar = isl.a;
                if (iC == 0) {
                    b0kVar = b0kVar;
                    x340Var2.i0(-303899188);
                    if (str != null) {
                        x340Var2.i0(-830894664);
                        Uri uri = Uri.parse(str);
                        as80 as80Var = mif1.P0;
                        qim0Var = qim0Var2;
                        qim0 qim0VarZ = uyn1.z(cbx.b(b0kVar).b.e, 0.0f, 2, qim0Var);
                        Object objT = x340Var2.T();
                        m4cVar = m4cVar2;
                        if (objT == m4cVar) {
                            objT = lcz0.V0;
                            x340Var2.s0(objT);
                        }
                        qim0 qim0VarC = i541.C(qim0VarZ, (iu30) objT);
                        cua cuaVar = cbx.b(b0kVar).f;
                        eso1.e(uri, islVar, i1p1.q(qim0VarC, er31.b(16.0f)), (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, (qux) null, false, false, b0kVar, 3120, 0, 4016);
                        z = false;
                        x340Var2.r(false);
                    } else {
                        m4cVar = m4cVar2;
                        qim0Var = qim0Var2;
                        z = false;
                        x340Var2.i0(-830376127);
                        x340Var2.r(false);
                    }
                    x340Var2.r(z);
                } else {
                    if (iC != 1) {
                        throw p3d1.k(x340Var2, -303901335, false);
                    }
                    x340Var2.i0(-303879215);
                    eso1.e(Uri.parse("https://learning-public-assets-cdn.spotifycdn.com/quiz/flame-guy/error_1024.png"), islVar, (qim0) null, (p3v) null, (zvx) null, (ecx) null, mif1.Q0, (tl3) null, (ColorFilter) null, (qux) null, false, false, b0kVar, 3120, 0, 4020);
                    x340Var2.r(false);
                    m4cVar = m4cVar2;
                    qim0Var = qim0Var2;
                }
                x340Var2.r(true);
                op71.g(b0kVar, u291.r(qim0Var, cbx.b(b0kVar).b.b));
                gxo1.c(gjz0Var.a, (qim0) null, lee1.a(cbx.d(b0kVar).a, 0L, fc11.G(48), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, fc11.D(1.0d), (u8e1) null, (wdt0) null, (shc0) null, 0, 16646141), cbx.a(b0kVar).b.a, new a0e1(3), 0, false, (djc0) null, (qx8) null, 0.0f, (FontWeight) ((bjx) ajx.a.c).g, (iu30) null, b0kVar, 0, 0, 3042);
                cvx cvxVar = cbx.b(b0kVar).b;
                op71.g(b0kVar, u291.r(qim0Var, 16.0f));
                uwo1.e(gjz0Var.b, (qim0) null, (lee1) null, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar, 0, 0, 2030);
                op71.g(b0kVar, u291.r(qim0Var, cbx.b(b0kVar).b.e));
                int iC2 = l1d.C(i2);
                if (iC2 == 0) {
                    mmr0Var = new mmr0(cjz0.a, 2131959024);
                } else {
                    if (iC2 != 1) {
                        eg.o();
                        return null;
                    }
                    mmr0Var = new mmr0(bjz0.a, 2131959023);
                }
                djz0 djz0Var = (djz0) mmr0Var.a;
                int iIntValue2 = ((Number) mmr0Var.b).intValue();
                boolean zG = x340Var2.g(iu30Var) | x340Var2.i(djz0Var);
                Object objT2 = x340Var2.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new g1x0(iu30Var, djz0Var, (byte) 28);
                    x340Var2.s0(objT2);
                }
                foo1.c(new gbx(z50Var, (Function0) objT2), lzj.d(gjz0Var.f), (qim0) null, (max) null, yla.r(b0kVar), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1969979400, new p4g0(iIntValue2, (byte) 11), b0kVar), b0kVar, 0, 48, 2012);
                op71.g(b0kVar, u291.r(qim0Var, cbx.b(b0kVar).b.e));
                x340Var2.r(true);
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                b0k b0kVar2 = (b0k) obj3;
                ((Number) obj4).intValue();
                fl01 fl01Var = (fl01) obj6;
                List list = fl01Var.b;
                String str2 = fl01Var.c;
                String str3 = fl01Var.d;
                uwr uwrVar2 = cbx.a;
                guo1.u(list, str2, ror0.e(cbx.a(b0kVar2).a.c, str3), (tk51) obj5, b0kVar2, 0);
                return rih1Var;
            case 3:
                ses0 ses0Var = (ses0) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                ((Number) obj4).intValue();
                Object objInvoke = ((iu30) obj5).invoke(((jh5) obj).b);
                if (objInvoke != null) {
                    ses0Var.p(iIntValue3, new jh5((xv00) obj6, objInvoke));
                }
                return rih1Var;
            case 4:
                return new vh((Context) obj2, (ViewGroup) obj3, (dx0) obj6, (gpq) obj5);
            case 5:
                pv71 pv71Var = (pv71) obj;
                qim0 qim0Var3 = (qim0) obj2;
                x340 x340Var3 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i = (x340Var3.g(pv71Var) ? 4 : 2) | iIntValue4;
                } else {
                    i = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i |= x340Var3.g(qim0Var3) ? 32 : 16;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(i & 1, (i & 147) != 146)) {
                    qim0 qim0VarThen = ((qim0) obj6).then(qim0Var3);
                    j2i j2iVar = (j2i) obj5;
                    gfh0 gfh0VarC2 = t1c.c(een.d, false);
                    int iHashCode3 = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM3 = x340Var4.m();
                    qim0 qim0VarE3 = zr7.E(x340Var4, qim0VarThen);
                    hzj.A.getClass();
                    if (x340Var4.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var4, y580.O0);
                    nko1.H(xos0VarM3, x340Var4, y580.N0);
                    nko1.B(x340Var4, Integer.valueOf(iHashCode3));
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE3, x340Var4, y580.Y);
                    j2iVar.invoke(pv71Var, x340Var4, Integer.valueOf(i & 14));
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 6:
                z9b1 z9b1Var = (z9b1) obj2;
                b0k b0kVar3 = (b0k) obj3;
                ((Number) obj4).intValue();
                ((kd41) obj6).c(z9b1Var.a, apo.r(-1928540368, new vvb((j2i) obj5, z9b1Var.b, (byte) 6), b0kVar3), b0kVar3, 48);
                return rih1Var;
            case 7:
                ((fob) obj6).g((aeb1) obj2, ((beb1) obj5).b, (b0k) obj3, (((Number) obj4).intValue() >> 3) & 14);
                return rih1Var;
            case 8:
                mmr0 mmr0Var2 = (mmr0) obj2;
                x340 x340Var5 = (b0k) obj3;
                ((Number) obj4).intValue();
                y5c1 y5c1Var = (y5c1) mmr0Var2.a;
                float f = ((p3v) mmr0Var2.b).a;
                u5c1 u5c1Var = y5c1Var.h;
                vnr0 vnr0Var = y5c1Var.e;
                vnr0 vnr0Var2 = y5c1Var.c;
                dzo1 dzo1Var = y5c1Var.l;
                String str4 = y5c1Var.k;
                String str5 = y5c1Var.j;
                int i3 = y5c1Var.i;
                if (u5c1Var instanceof u5c1) {
                    x340 x340Var6 = x340Var5;
                    x340Var6.i0(-1105814793);
                    otw.c((n6c1) obj6, new m6c1(y5c1Var.a, vnr0Var2, y5c1Var.d, vnr0Var, y5c1Var.f, u5c1Var.a, f, new l6c1(i3, str5), new k6c1(str4, dzo1Var)), (qim0) null, (ipb1) null, x340Var6, 64, 12);
                    x340Var6.r(false);
                } else {
                    if (!(u5c1Var instanceof v5c1)) {
                        throw p3d1.k(x340Var5, -1105816255, false);
                    }
                    x340 x340Var7 = x340Var5;
                    x340Var7.i0(-1105782103);
                    otw.c((ol31) obj5, new gl31(y5c1Var.a, vnr0Var2, y5c1Var.d, vnr0Var, y5c1Var.f, ((v5c1) u5c1Var).a, f, new fl31(i3, str5), new el31(str4, dzo1Var)), (qim0) null, (ipb1) null, x340Var7, 64, 12);
                    x340Var7.r(false);
                }
                return rih1Var;
            case 9:
                return new zm0((jb3) obj6, (tnd1) obj5, (ViewGroup) obj3, new hp91(new b1c1((iu30) obj4, b2)));
            case 10:
                int iIntValue5 = ((Number) obj).intValue();
                ((Boolean) obj2).getClass();
                ((Number) obj4).intValue();
                x340 x340Var8 = (b0k) obj3;
                x340Var8.i0(-1327751351);
                Object objT3 = x340Var8.T();
                Object obj7 = fkj0.X;
                if (objT3 == obj7) {
                    objT3 = mno1.a(-2, 0, 6);
                    x340Var8.s0(objT3);
                }
                jfe jfeVar = (jfe) objT3;
                boolean zI = x340Var8.i(jfeVar);
                Object objT4 = x340Var8.T();
                if (zI || objT4 == obj7) {
                    objT4 = new zw11(jfeVar, (byte) 16);
                    x340Var8.s0(objT4);
                }
                qxd0.i(rih1Var, (iu30) objT4, x340Var8);
                String str6 = (String) ((ven0) obj6).getValue();
                int iIntValue6 = ((Number) ((ven0) obj5).getValue()).intValue();
                if (str6 != null) {
                    x340Var8.i0(1608586914);
                    Integer numValueOf2 = Integer.valueOf(iIntValue5);
                    boolean zI2 = x340Var8.i(jfeVar) | x340Var8.g(str6);
                    Object objT5 = x340Var8.T();
                    if (zI2 || objT5 == obj7) {
                        objT5 = new w621(jfeVar, str6, (lnm) null, (byte) 19);
                        x340Var8.s0(objT5);
                    }
                    qxd0.s(numValueOf2, str6, (vu30) objT5, x340Var8);
                    Object objT6 = x340Var8.T();
                    if (objT6 == obj7) {
                        objT6 = Integer.valueOf(iIntValue6);
                        x340Var8.s0(objT6);
                    }
                    int iIntValue7 = ((Number) objT6).intValue();
                    Integer numValueOf3 = Integer.valueOf(iIntValue5);
                    Integer numValueOf4 = Integer.valueOf(iIntValue6);
                    boolean zE = x340Var8.e(iIntValue6) | x340Var8.i(jfeVar);
                    Object objT7 = x340Var8.T();
                    if (zE || objT7 == obj7) {
                        objT7 = new jme1(iIntValue6, iIntValue7, jfeVar, (lnm) null);
                        x340Var8.s0(objT7);
                    }
                    qxd0.s(numValueOf3, numValueOf4, (vu30) objT7, x340Var8);
                    z2 = false;
                    x340Var8.r(false);
                } else {
                    z2 = false;
                    x340Var8.i0(1609162553);
                    x340Var8.r(false);
                }
                x340Var8.r(z2);
                return jfeVar;
            case 11:
                int iIntValue8 = ((Number) obj).intValue();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                int iIntValue9 = ((Number) obj4).intValue();
                x340 x340Var9 = (b0k) obj3;
                x340Var9.i0(572224392);
                g7m1 g7m1Var = (g7m1) obj6;
                jfe jfeVarA = g7m1Var.d.a(iIntValue8, iIntValue9 & 126, x340Var9, zBooleanValue);
                ven0 ven0VarS = v8r.s(jfeVarA, x340Var9);
                Integer numValueOf5 = Integer.valueOf(iIntValue8);
                o9f1 o9f1Var = (o9f1) obj5;
                boolean zI3 = x340Var9.i(o9f1Var) | x340Var9.i(g7m1Var) | x340Var9.g(ven0VarS);
                Object objT8 = x340Var9.T();
                if (zI3 || objT8 == fkj0.X) {
                    objT8 = new q721(o9f1Var, g7m1Var, ven0VarS, null, (byte) 22);
                    x340Var9.s0(objT8);
                }
                qxd0.t(numValueOf5, x340Var9, (vu30) objT8);
                x340Var9.r(false);
                return jfeVarA;
            case 12:
                int iIntValue10 = ((Number) obj2).intValue();
                odf1.h((rdf1) ((c380) obj6).get(iIntValue10), iIntValue10, (nef1) obj5, false, false, (b0k) obj3, (((Number) obj4).intValue() & 112) | 24576, 8);
                return rih1Var;
            case 13:
                return new i34((Context) obj2, (ViewGroup) obj3, (sma1) obj6, (gpq) obj5, (iu30) obj4);
            case 14:
                qim0 qim0Var4 = (qim0) obj;
                a0e1 a0e1Var = (a0e1) obj2;
                int i4 = a0e1Var.a;
                x340 x340Var10 = (b0k) obj3;
                int iIntValue11 = ((Number) obj4).intValue();
                m4c m4cVar3 = fkj0.X;
                p1i1 p1i1Var = (p1i1) obj6;
                iu30 iu30Var2 = (iu30) obj5;
                mbh mbhVarA2 = jbh.a(f36Var, i4 == 5 ? een.P0 : een.Q0, x340Var10, 0);
                x340 x340Var11 = x340Var10;
                int iHashCode4 = Long.hashCode(x340Var11.T);
                xos0 xos0VarM4 = x340Var11.m();
                qim0 qim0VarE4 = zr7.E(x340Var10, qim0Var4);
                hzj.A.getClass();
                x340 x340Var12 = x340Var10;
                if (x340Var12.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var12.m0();
                if (x340Var12.S) {
                    x340Var12.l(n4kVar);
                } else {
                    x340Var12.v0();
                }
                nko1.H(mbhVarA2, x340Var10, y580.O0);
                nko1.H(xos0VarM4, x340Var10, y580.N0);
                nko1.H(Integer.valueOf(iHashCode4), x340Var10, y580.R0);
                nko1.F(x340Var10);
                nko1.H(qim0VarE4, x340Var10, y580.Y);
                String str7 = p1i1Var.a;
                uwr uwrVar3 = cbx.a;
                lee1 lee1Var = cbx.d(x340Var10).d;
                long j = cbx.a(x340Var10).b.a;
                cvx cvxVar2 = cbx.b(x340Var10).b;
                nim0 nim0Var = nim0.a;
                int i5 = (iIntValue11 << 9) & 57344;
                uwo1.e(str7, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 12.0f, 7), lee1Var, j, a0e1Var, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var10, i5, 0, 2016);
                String str8 = p1i1Var.b;
                lee1 lee1Var2 = cbx.d(x340Var10).g;
                long j2 = cbx.a(x340Var10).b.b;
                cvx cvxVar3 = cbx.b(x340Var10).b;
                uwo1.e(str8, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), lee1Var2, j2, a0e1Var, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var10, i5, 0, 2016);
                boolean zG2 = x340Var12.g(iu30Var2) | x340Var12.i(p1i1Var);
                Object objT9 = x340Var12.T();
                if (zG2 || objT9 == m4cVar3) {
                    objT9 = new j1i1(iu30Var2, p1i1Var, (byte) 0);
                    x340Var12.s0(objT9);
                }
                gbx gbxVar = new gbx(z50Var, (Function0) objT9);
                idx idxVar = new idx(4);
                gdx gdxVarR = yla.r(x340Var10);
                cvx cvxVar4 = cbx.b(x340Var10).b;
                foo1.c(gbxVar, idxVar, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 12.0f, 7), (max) null, gdxVarR, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1095465361, new k1i1(p1i1Var, (byte) 0), x340Var10), x340Var10, 0, 48, 2008);
                if (p1i1Var.e != null) {
                    x340Var12.i0(759397273);
                    boolean zG3 = x340Var12.g(iu30Var2) | x340Var12.i(p1i1Var);
                    Object objT10 = x340Var12.T();
                    if (zG3 || objT10 == m4cVar3) {
                        objT10 = new j1i1(iu30Var2, p1i1Var, (byte) 1);
                        x340Var12.s0(objT10);
                    }
                    gbx gbxVar2 = new gbx(z50Var, (Function0) objT10);
                    jdx jdxVar = jdx.c;
                    gdx gdxVarR2 = yla.r(x340Var10);
                    cvx cvxVar5 = cbx.b(x340Var10).b;
                    foo1.c(gbxVar2, jdxVar, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), (max) null, gdxVarR2, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1329978294, new k1i1(p1i1Var, (byte) 1), x340Var10), x340Var10, 0, 48, 2008);
                    x340Var12.r(false);
                } else {
                    x340Var12.i0(759892498);
                    x340Var12.r(false);
                }
                x340Var12.r(true);
                return rih1Var;
            case 15:
                int iIntValue12 = ((Number) obj2).intValue();
                ((Number) obj4).intValue();
                ((dlg1) obj5).a((qhi1) ((c380) obj6).get(iIntValue12), (b0k) obj3, 0);
                return rih1Var;
            default:
                int iIntValue13 = ((Number) obj2).intValue();
                ((Number) obj4).intValue();
                r271 r271Var = (r271) ((s271) obj6).a.get(iIntValue13);
                otw.c((lxk1) obj5, new kxk1(r271Var.b, r271Var.f), (qim0) null, (ipb1) null, (b0k) obj3, 0, 12);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ juy0(Object obj, Object obj2, byte b) {
        super(4);
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public juy0(c380 c380Var, iu30 iu30Var) {
        super(4);
        this.a = (byte) 0;
        this.c = c380Var;
        this.b = iu30Var;
    }
}
