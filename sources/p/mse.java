package p;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mse extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mse(List list, i8h1 i8h1Var, String str, z2a z2aVar, qn30 qn30Var, iu30 iu30Var) {
        super(3);
        this.a = (byte) 11;
        this.b = list;
        this.c = i8h1Var;
        this.d = str;
        this.e = z2aVar;
        this.f = qn30Var;
        this.g = iu30Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:84:0x02ed  */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        float f;
        float f2;
        float f3;
        rih1 rih1Var;
        x340 x340Var;
        long jE;
        m4c m4cVar;
        Object objT;
        ArrayList arrayList;
        mo6 mo6Var;
        byte b = this.a;
        u5j1 u5j1Var = d4o1.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var2 = rih1.a;
        Object obj4 = this.g;
        Object obj5 = this.b;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.c;
        Object obj9 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                xse xseVar = (xse) obj;
                x340 x340Var2 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                qse qseVar = (qse) obj9;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? x340Var2.g(xseVar) : x340Var2.i(xseVar) ? 4 : 2;
                }
                x340 x340Var3 = x340Var2;
                if (x340Var3.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    bab1 bab1Var = (bab1) ((c380) obj8).get(((c380) obj5).indexOf(xseVar));
                    boolean zA = bab1Var.a();
                    boolean zI = x340Var3.i(qseVar);
                    Object objT2 = x340Var3.T();
                    if (zI || objT2 == fkj0.X) {
                        objT2 = new ptb(qseVar, (byte) 29);
                        x340Var3.s0(objT2);
                    }
                    q3p1.b(0, 0, (Function0) objT2, x340Var3, zA);
                    w9b1.a(bab1Var, u291.d(nim0Var, 1.0f), apo.r(-1357560237, new k8((Object) qseVar, obj7, obj6, obj4, (byte) 17), x340Var3), x340Var3, 384, 0);
                } else {
                    x340Var3.b0();
                }
                return rih1Var2;
            case 1:
                g1t g1tVar = (g1t) obj8;
                qvm1 qvm1Var = (qvm1) obj5;
                vzq0 vzq0Var = (vzq0) obj;
                x340 x340Var4 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var4.g(vzq0Var) ? 4 : 2;
                }
                x340 x340Var5 = x340Var4;
                if (!x340Var5.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x340Var5.b0();
                } else if (!qvm1Var.d) {
                    x340Var5.i0(1535955503);
                    qim0 qim0VarD = u291.d(too1.i(uyn1.w(nim0Var, vzq0Var), vzq0Var), 1.0f);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var5.T);
                    xos0 xos0VarM = x340Var5.m();
                    qim0 qim0VarE = zr7.E(x340Var5, qim0VarD);
                    hzj.A.getClass();
                    if (x340Var5.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var5.m0();
                    if (x340Var5.S) {
                        x340Var5.l(n4kVar);
                    } else {
                        x340Var5.v0();
                    }
                    nko1.H(gfh0VarC, x340Var5, y580.O0);
                    nko1.H(xos0VarM, x340Var5, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var5, y580.R0);
                    nko1.F(x340Var5);
                    nko1.H(qim0VarE, x340Var5, y580.Y);
                    xto1.e(null, 5, 0L, 0L, x340Var5, 48, 13);
                    x340Var5.r(true);
                    x340Var5.r(false);
                } else if (qvm1Var.c) {
                    x340Var5.i0(1536362378);
                    otw.c(g1tVar.e, otm1.a, too1.i(uyn1.w(nim0Var, vzq0Var), vzq0Var), (ipb1) null, x340Var5, 48, 8);
                    x340Var5.r(false);
                } else {
                    x340Var5.i0(1536722598);
                    Object objT3 = x340Var5.T();
                    if (objT3 == fkj0.X) {
                        objT3 = d0t.i;
                        x340Var5.s0(objT3);
                    }
                    dgo1.c("your_library_page_main_section", (iu30) objT3, apo.r(-446616190, new ta5(vzq0Var, (qim0) obj9, g1tVar, (hlu) obj7, (upb0) obj6, (iu30) obj4, qvm1Var), x340Var5), x340Var5, 438);
                    x340Var5.r(false);
                }
                return rih1Var2;
            case 2:
                g2c g2cVar = (g2c) obj;
                x340 x340Var6 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, u291.f(u291.h(nim0Var, 64.0f), 1.0f));
                uwr uwrVar = cbx.a;
                qim0 qim0VarY = uyn1.y(dug.f(qim0VarZ, ((vex) zex.a.e).i, er31.b(8.0f)), 16.0f, 12.0f);
                zf80 zf80Var = (zf80) obj5;
                mbh mbhVarA = jbh.a(new d36(4.0f, false, new g21(een.N0, (byte) 28)), een.P0, x340Var6, 0);
                x340 x340Var7 = x340Var6;
                int iHashCode2 = Long.hashCode(x340Var7.T);
                xos0 xos0VarM2 = x340Var7.m();
                qim0 qim0VarE2 = zr7.E(x340Var6, qim0VarY);
                hzj.A.getClass();
                x340 x340Var8 = x340Var6;
                if (x340Var8.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var8.m0();
                if (x340Var8.S) {
                    x340Var8.l(n4kVar);
                } else {
                    x340Var8.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var6, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM2, x340Var6, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var6, lljVar3);
                nko1.F(x340Var6);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE2, x340Var6, lljVar4);
                uwo1.e(zf80Var.b, null, cbx.d(x340Var6).h, cbx.a(x340Var6).b.a, null, null, 2, false, new cjc0(1), 0, null, x340Var6, 0, 0, 1714);
                uwo1.e(zf80Var.c, null, cbx.d(x340Var6).m, cbx.a(x340Var6).b.b, null, null, 2, false, new cjc0(1), 0, null, x340Var6, 0, 0, 1714);
                x340Var8.r(true);
                gra graVar = een.i;
                qim0 qim0VarB = uyn1.B(g2cVar.a(nim0Var, graVar), 0.0f, 0.0f, 16.0f, 0.0f, 11);
                ffj1 ffj1Var = (ffj1) obj8;
                cm0 cm0Var = (cm0) obj9;
                iu30 iu30Var = (iu30) obj7;
                zau0 zau0Var = (zau0) obj6;
                ven0 ven0Var = (ven0) obj4;
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode3 = Long.hashCode(x340Var8.T);
                xos0 xos0VarM3 = x340Var8.m();
                qim0 qim0VarE3 = zr7.E(x340Var6, qim0VarB);
                x340Var8.m0();
                if (x340Var8.S) {
                    x340Var8.l(n4kVar);
                } else {
                    x340Var8.v0();
                }
                nko1.H(gfh0VarC2, x340Var6, lljVar);
                nko1.H(xos0VarM3, x340Var6, lljVar2);
                i3a.l(iHashCode3, x340Var6, lljVar3, x340Var6);
                nko1.H(qim0VarE3, x340Var6, lljVar4);
                i3b i3bVar = (i3b) cm0Var.h;
                iac0 iac0Var = (iac0) cm0Var.t;
                boolean zG = x340Var8.g(iu30Var);
                Object objT4 = x340Var8.T();
                if (zG || objT4 == fkj0.X) {
                    objT4 = new bv70(iu30Var, (byte) 5);
                    x340Var8.s0(objT4);
                }
                m6k1 m6k1Var = zf80Var.e.a;
                o6p1.k(ffj1Var, i3bVar, iac0Var, (iu30) objT4, new n6k1(new m6k1(m6k1Var.a, m6k1Var.b, m6k1Var.c, zau0Var, m6k1Var.e, m6k1Var.f, m6k1Var.g, m6k1Var.h, m6k1Var.i, m6k1Var.j, m6k1Var.k), ((Boolean) ven0Var.getValue()).booleanValue()), d7e.r(0.6666667f, u291.v(nim0Var, 54.0f), false), x340Var6, 32776, 0);
                x340Var8.r(true);
                return rih1Var2;
            case 3:
                ((Number) obj3).intValue();
                d3p1.a(((q0e0) obj5).b, (lb50) obj8, (yqg) obj9, (iu30) obj7, (j2i) obj6, (j2i) obj4, null, (b0k) obj2, 0);
                return rih1Var2;
            case 4:
                x340 x340Var9 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                zzz0 zzz0Var = (zzz0) obj5;
                x340 x340Var10 = x340Var9;
                boolean zY = x340Var10.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16);
                j06 j06Var = x340Var10.a;
                if (!zY) {
                    x340Var10.b0();
                    return rih1Var2;
                }
                qim0 qim0VarN = anm1.N("ShareCard", u291.f(nim0Var, 1.0f));
                uwr uwrVar2 = cbx.a;
                cvx cvxVar = cbx.b(x340Var10).b;
                if (ihc1.y0(zzz0Var.i)) {
                    x340Var10.i0(-1281812964);
                    cvx cvxVar2 = cbx.b(x340Var10).b;
                    x340Var10.r(false);
                    f = 6.0f;
                } else {
                    x340Var10.i0(-1281879459);
                    f = cbx.b(x340Var10).b.b;
                    x340Var10.r(false);
                }
                qim0 qim0VarB2 = uyn1.B(qim0VarN, 0.0f, 6.0f, 0.0f, f, 5);
                cvx cvxVar3 = cbx.b(x340Var10).b;
                d36 d36Var = new d36(4.0f, true, new um5(false));
                c101 c101Var = (c101) obj8;
                iu30 iu30Var2 = (iu30) obj9;
                lik1 lik1Var = (lik1) obj7;
                idm idmVar = (idm) obj6;
                err0 err0Var = (hdn0) obj4;
                era eraVar = een.P0;
                mbh mbhVarA2 = jbh.a(d36Var, eraVar, x340Var10, 0);
                int iHashCode4 = Long.hashCode(x340Var10.T);
                xos0 xos0VarM4 = x340Var10.m();
                qim0 qim0VarE4 = zr7.E(x340Var10, qim0VarB2);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var10.m0();
                if (x340Var10.S) {
                    x340Var10.l(n4kVar);
                } else {
                    x340Var10.v0();
                }
                llj lljVar5 = y580.O0;
                nko1.H(mbhVarA2, x340Var10, lljVar5);
                llj lljVar6 = y580.N0;
                nko1.H(xos0VarM4, x340Var10, lljVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode4);
                llj lljVar7 = y580.R0;
                nko1.H(numValueOf2, x340Var10, lljVar7);
                nko1.F(x340Var10);
                llj lljVar8 = y580.Y;
                nko1.H(qim0VarE4, x340Var10, lljVar8);
                rpo1.g(zzz0Var.e, null, x340Var10, 0);
                qim0 qim0VarZ2 = u291.z(nim0Var, (fra) null, 1);
                gfh0 gfh0VarC3 = t1c.c(een.d, false);
                int iHashCode5 = Long.hashCode(x340Var10.T);
                xos0 xos0VarM5 = x340Var10.m();
                qim0 qim0VarE5 = zr7.E(x340Var10, qim0VarZ2);
                x340Var10.m0();
                if (x340Var10.S) {
                    x340Var10.l(n4kVar);
                } else {
                    x340Var10.v0();
                }
                nko1.H(gfh0VarC3, x340Var10, lljVar5);
                nko1.H(xos0VarM5, x340Var10, lljVar6);
                x0d.q(iHashCode5, x340Var10, lljVar7, x340Var10);
                nko1.H(qim0VarE5, x340Var10, lljVar8);
                mbh mbhVarA3 = jbh.a(h36.c, eraVar, x340Var10, 0);
                int iHashCode6 = Long.hashCode(x340Var10.T);
                xos0 xos0VarM6 = x340Var10.m();
                qim0 qim0VarE6 = zr7.E(x340Var10, nim0Var);
                x340Var10.m0();
                if (x340Var10.S) {
                    x340Var10.l(n4kVar);
                } else {
                    x340Var10.v0();
                }
                nko1.H(mbhVarA3, x340Var10, lljVar5);
                nko1.H(xos0VarM6, x340Var10, lljVar6);
                x0d.q(iHashCode6, x340Var10, lljVar7, x340Var10);
                nko1.H(qim0VarE6, x340Var10, lljVar8);
                l4p1.i(lik1Var, zzz0Var, idmVar, iu30Var2, x340Var10, 0);
                err0 err0Var2 = err0Var;
                wpo1.g(err0Var2.s(), 0, x340Var10, (err0Var2.s() == 0 || zzz0Var.k.isEmpty()) ? false : true);
                x340Var10.r(true);
                Object objT5 = x340Var10.T();
                if (objT5 == fkj0.X) {
                    objT5 = new tu9(err0Var, (byte) 25);
                    x340Var10.s0(objT5);
                }
                aqo1.m(zzz0Var, c101Var, (iu30) objT5, iu30Var2, x340Var10, 3078);
                x340Var10.r(true);
                x340Var10.r(true);
                return rih1Var2;
            case 5:
                vzq0 vzq0Var2 = (vzq0) obj;
                x340 x340Var11 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                ven0 ven0Var2 = (ven0) obj4;
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= x340Var11.g(vzq0Var2) ? 4 : 2;
                }
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    b9g0 b9g0Var = (b9g0) obj5;
                    iu30 iu30Var3 = (iu30) obj8;
                    int i = iIntValue4;
                    bjx bjxVar = (bjx) obj9;
                    d0r d0rVar = (d0r) obj7;
                    v8l0 v8l0Var = (v8l0) obj6;
                    boolean zG2 = x340Var12.g(ven0Var2);
                    Object objT6 = x340Var12.T();
                    if (zG2 || objT6 == fkj0.X) {
                        objT6 = new sqa0(ven0Var2, (byte) 20);
                        x340Var12.s0(objT6);
                    }
                    jon1.b(b9g0Var, iu30Var3, vzq0Var2, bjxVar, d0rVar, v8l0Var, (iu30) objT6, x340Var12, (i << 6) & 896);
                } else {
                    x340Var12.b0();
                }
                return rih1Var2;
            case 6:
                uwr uwrVar3 = cbx.a;
                x340 x340Var13 = (b0k) obj2;
                ((Number) obj3).intValue();
                joo0 joo0Var = (joo0) obj5;
                if (joo0Var.c == 1) {
                    x340 x340Var14 = x340Var13;
                    x340Var14.i0(-946557960);
                    cvx cvxVar4 = cbx.b(x340Var14).b;
                    x340Var14.r(false);
                    f2 = 12.0f;
                } else {
                    x340 x340Var15 = x340Var13;
                    x340Var15.i0(-946500517);
                    cvx cvxVar5 = cbx.b(x340Var15).b;
                    x340Var15.r(false);
                    f2 = 16.0f;
                }
                nim0 nim0Var2 = nim0.a;
                qim0 qim0VarF = u291.f(nim0Var2, 1.0f);
                x340 x340Var16 = x340Var13;
                Object objT7 = x340Var16.T();
                m4c m4cVar2 = fkj0.X;
                if (objT7 == m4cVar2) {
                    objT7 = cmo0.g;
                    x340Var16.s0(objT7);
                }
                qim0 qim0VarB3 = s161.b(qim0VarF, false, (iu30) objT7);
                cvx cvxVar6 = cbx.b(x340Var16).b;
                cvx cvxVar7 = cbx.b(x340Var16).b;
                qim0 qim0VarA = uyn1.A(qim0VarB3, f2, 4.0f, f2, 4.0f);
                long jC = cbx.a(x340Var16).a.a.c();
                cua cuaVar = cbx.b(x340Var16).f;
                qim0 qim0VarF2 = dug.f(qim0VarA, jC, er31.b(8.0f));
                Function0 function0 = (Function0) obj8;
                ven0 ven0Var3 = (ven0) obj4;
                c9n c9nVar = (c9n) obj9;
                ven0 ven0Var4 = (ven0) obj7;
                Function0 function1 = (Function0) obj6;
                jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var16, 0);
                int iHashCode7 = Long.hashCode(x340Var16.T);
                xos0 xos0VarM7 = x340Var16.m();
                qim0 qim0VarE7 = zr7.E(x340Var16, qim0VarF2);
                hzj.A.getClass();
                if (x340Var16.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var16.m0();
                if (x340Var16.S) {
                    x340Var16.l(n4kVar);
                } else {
                    x340Var16.v0();
                }
                nko1.H(jw31VarA, x340Var16, y580.O0);
                nko1.H(xos0VarM7, x340Var16, y580.N0);
                nko1.H(Integer.valueOf(iHashCode7), x340Var16, y580.R0);
                nko1.F(x340Var16);
                nko1.H(qim0VarE7, x340Var16, y580.Y);
                String str = joo0Var.a;
                boolean z = joo0Var.e;
                lee1 lee1Var = cbx.d(x340Var16).j;
                wnb0 wnb0Var = new wnb0(1.0f, true);
                cvx cvxVar8 = cbx.b(x340Var16).b;
                cvx cvxVar9 = cbx.b(x340Var16).b;
                cvx cvxVar10 = cbx.b(x340Var16).b;
                cvx cvxVar11 = cbx.b(x340Var16).b;
                uwo1.e(str, uyn1.A(wnb0Var, 16.0f, 8.0f, 16.0f, 8.0f), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var16, 0, 0, 2040);
                idx idxVar = new idx(8);
                String strO0 = cwl1.o0(x340Var16, 2131959179);
                if (!ihc1.y0(strO0)) {
                    y50 y50Var = new y50(strO0);
                    boolean zG3 = x340Var16.g(function0);
                    Object objT8 = x340Var16.T();
                    if (zG3 || objT8 == m4cVar2) {
                        objT8 = new kek0(function0, (byte) 19);
                        x340Var16.s0(objT8);
                    }
                    gbx gbxVar = new gbx(y50Var, (Function0) objT8);
                    gdx gdxVarS = yla.s(x340Var16);
                    cvx cvxVar12 = cbx.b(x340Var16).b;
                    cvx cvxVar13 = cbx.b(x340Var16).b;
                    if (z) {
                        x340Var16.i0(194882914);
                        x340Var16.r(false);
                        f3 = 0.0f;
                    } else {
                        x340Var16.i0(194813319);
                        cvx cvxVar14 = cbx.b(x340Var16).b;
                        x340Var16.r(false);
                        f3 = 16.0f;
                    }
                    foo1.c(gbxVar, idxVar, uyn1.B(nim0Var2, 0.0f, 4.0f, f3, 4.0f, 1), null, gdxVarS, null, null, null, null, null, apo.r(1549282233, new fhk0(joo0Var, (byte) 27), x340Var16), x340Var16, 0, 48, 2008);
                    if (z) {
                        x340Var16.i0(195452973);
                        qim0 qim0VarN2 = anm1.N("notification_nudge_dismiss_button", nim0Var2);
                        ldx ldxVar = ldx.c;
                        String strO1 = cwl1.o0(x340Var16, 2131959181);
                        if (ihc1.y0(strO1)) {
                            hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                        } else {
                            y50 y50Var2 = new y50(strO1);
                            boolean zI2 = x340Var16.i(ven0Var3) | x340Var16.i(c9nVar) | x340Var16.i(ven0Var4) | x340Var16.g(function1);
                            Object objT9 = x340Var16.T();
                            if (zI2 || objT9 == m4cVar2) {
                                objT9 = new h6v(function1, c9nVar, ven0Var3, ven0Var4);
                                x340Var16.s0(objT9);
                            }
                            wro1.h(new gbx(y50Var2, (Function0) objT9), ldxVar, qim0VarN2, null, null, null, false, null, null, d4j.a, x340Var16, 0, 6, 1016);
                            x340Var16.r(false);
                        }
                    } else {
                        x340Var16.i0(196040392);
                        x340Var16.r(false);
                    }
                    x340Var16.r(true);
                    return rih1Var2;
                }
                hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                return null;
            case 7:
                vzq0 vzq0Var3 = (vzq0) obj;
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                ujo1.a(uyn1.B(nim0.a, 0.0f, vzq0Var3.d(), 0.0f, 0.0f, 13), (es41) obj5, apo.r(-590141718, new uuy((Object) vzq0Var3, obj8, obj9, obj7, obj6, obj4, (byte) 25), b0kVar), b0kVar, 384, 0);
                return rih1Var2;
            case 8:
                vzq0 vzq0Var4 = (vzq0) obj;
                x340 x340Var17 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= x340Var17.g(vzq0Var4) ? 4 : 2;
                }
                x340 x340Var18 = x340Var17;
                boolean zY2 = x340Var18.Y(iIntValue5 & 1, (iIntValue5 & 19) != 18);
                rih1 rih1Var3 = rih1.a;
                if (!zY2) {
                    x340Var18.b0();
                    return rih1Var3;
                }
                era eraVar2 = een.Q0;
                qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                uwr uwrVar4 = cbx.a;
                qim0 qim0VarH = l6o1.H(uyn1.w(dug.f(qim0VarD2, cbx.a(x340Var18).a.a.a(), u5j1Var), vzq0Var4), (es41) obj5, false, 14);
                cvx cvxVar15 = cbx.b(x340Var18).b;
                qim0 qim0VarZ3 = uyn1.z(16.0f, 0.0f, 2, qim0VarH);
                b1t0 b1t0Var = (b1t0) obj8;
                n1t0 n1t0Var = b1t0Var.a;
                iu30 iu30Var4 = (iu30) obj9;
                q8n q8nVar = (q8n) obj7;
                q1t0 q1t0Var = (q1t0) obj6;
                ae30 ae30Var = (ae30) obj4;
                mbh mbhVarA4 = jbh.a(h36.c, eraVar2, x340Var18, 48);
                int iHashCode8 = Long.hashCode(x340Var18.T);
                xos0 xos0VarM8 = x340Var18.m();
                qim0 qim0VarE8 = zr7.E(x340Var18, qim0VarZ3);
                hzj.A.getClass();
                if (x340Var18.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var18.m0();
                if (x340Var18.S) {
                    x340Var18.l(n4kVar);
                } else {
                    x340Var18.v0();
                }
                nko1.H(mbhVarA4, x340Var18, y580.O0);
                nko1.H(xos0VarM8, x340Var18, y580.N0);
                nko1.H(Integer.valueOf(iHashCode8), x340Var18, y580.R0);
                nko1.F(x340Var18);
                nko1.H(qim0VarE8, x340Var18, y580.Y);
                String strG = ydh.g(cbx.b(x340Var18).b.b, 2131959741, x340Var18, x340Var18, nim0Var);
                lee1 lee1Var2 = cbx.d(x340Var18).c;
                long j = cbx.a(x340Var18).b.a;
                qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                Object objT10 = x340Var18.T();
                if (objT10 == fkj0.X) {
                    objT10 = egs0.R0;
                    x340Var18.s0(objT10);
                }
                uwo1.e(strG, s161.b(qim0VarF3, false, (iu30) objT10), lee1Var2, j, new a0e1(3), null, 0, false, null, 0, null, x340Var18, 0, 0, 2016);
                op71.g(x340Var18, u291.h(nim0Var, cbx.b(x340Var18).b.a));
                mzs0.a(b1t0Var, iu30Var4, q8nVar, x340Var18, 0);
                cvx cvxVar16 = cbx.b(x340Var18).b;
                op71.g(x340Var18, u291.h(nim0Var, 16.0f));
                if (n1t0Var instanceof l1t0) {
                    x340Var18.i0(1707443781);
                    xto1.e(null, 0, 0L, 0L, x340Var18, 0, 15);
                    x340Var18.r(false);
                } else if (n1t0Var instanceof k1t0) {
                    x340Var18.i0(1707530488);
                    otw.c(q1t0Var, b1t0Var.a, (qim0) null, (ipb1) null, x340Var18, 0, 12);
                    x340Var18.r(false);
                } else if (n1t0Var instanceof g1t0) {
                    x340Var18.i0(1707680187);
                    uwo1.e(cwl1.o0(x340Var18, 2131959736), u291.f(nim0Var, 1.0f), cbx.d(x340Var18).j, cbx.a(x340Var18).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var18, 48, 0, 2016);
                    x340Var18.r(false);
                } else {
                    if (!(n1t0Var instanceof m1t0)) {
                        throw p3d1.k(x340Var18, 1579097908, false);
                    }
                    x340Var18.i0(1579117461);
                    x340Var18.r(false);
                }
                cvx cvxVar17 = cbx.b(x340Var18).b;
                op71.g(x340Var18, u291.h(nim0Var, 16.0f));
                if ((n1t0Var instanceof l1t0) || (n1t0Var instanceof m1t0)) {
                    rih1Var = rih1Var3;
                    x340Var18.i0(1708299505);
                    x340Var18.r(false);
                } else {
                    x340Var18.i0(1708228391);
                    rih1Var = rih1Var3;
                    otw.c(ae30Var, rih1Var, (qim0) null, (ipb1) null, x340Var18, 48, 12);
                    x340Var18.r(false);
                }
                x340Var18.r(true);
                return rih1Var;
            case 9:
                uwr uwrVar5 = cbx.a;
                x340 x340Var19 = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar3 = fkj0.X;
                fl01 fl01Var = (hl01) obj5;
                if (fl01Var instanceof fl01) {
                    x340 x340Var20 = x340Var19;
                    x340Var20.i0(-1434183436);
                    x340Var = x340Var19;
                    jE = ror0.e(cbx.a(x340Var20).a.c, fl01Var.d);
                    x340Var20.r(false);
                } else {
                    x340Var = x340Var19;
                    x340 x340Var21 = x340Var;
                    x340Var21.i0(-1434180153);
                    long jA = cbx.a(x340Var21).a.a.a();
                    x340Var21.r(false);
                    jE = jA;
                }
                x340 x340Var22 = x340Var;
                Object objK = x340Var22.k(AndroidCompositionLocals_androidKt.a);
                j06 j06Var2 = x340Var22.a;
                float f4 = ((Configuration) objK).screenHeightDp / 2.0f;
                int iH = (int) jfv.h(cbx.c(x340Var22).b.b);
                qim0 qim0VarF4 = u291.f(nim0Var, 1.0f);
                hl01 hl01Var = (hl01) obj5;
                i4m0 i4m0Var = (i4m0) obj8;
                iu30 iu30Var5 = (iu30) obj9;
                vu30 vu30Var = (vu30) obj7;
                hce0 hce0Var = (hce0) obj6;
                rjz rjzVar = (rjz) obj4;
                gfh0 gfh0VarC4 = t1c.c(een.h, false);
                int iHashCode9 = Long.hashCode(x340Var22.T);
                xos0 xos0VarM9 = x340Var22.m();
                qim0 qim0VarE9 = zr7.E(x340Var22, qim0VarF4);
                hzj.A.getClass();
                if (j06Var2 == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var22.m0();
                if (x340Var22.S) {
                    x340Var22.l(n4kVar);
                } else {
                    x340Var22.v0();
                }
                llj lljVar9 = y580.O0;
                nko1.H(gfh0VarC4, x340Var22, lljVar9);
                llj lljVar10 = y580.N0;
                nko1.H(xos0VarM9, x340Var22, lljVar10);
                Integer numValueOf3 = Integer.valueOf(iHashCode9);
                llj lljVar11 = y580.R0;
                nko1.H(numValueOf3, x340Var22, lljVar11);
                nko1.F(x340Var22);
                llj lljVar12 = y580.Y;
                nko1.H(qim0VarE9, x340Var22, lljVar12);
                qim0 qim0VarF5 = dug.f(u291.f(u291.q(180.0f, 2, nim0Var), 1.0f), jE, u5j1Var);
                gfh0 gfh0VarC5 = t1c.c(een.d, false);
                int iHashCode10 = Long.hashCode(x340Var22.T);
                xos0 xos0VarM10 = x340Var22.m();
                qim0 qim0VarE10 = zr7.E(x340Var22, qim0VarF5);
                x340Var22.m0();
                if (x340Var22.S) {
                    x340Var22.l(n4kVar);
                } else {
                    x340Var22.v0();
                }
                nko1.H(gfh0VarC5, x340Var22, lljVar9);
                nko1.H(xos0VarM10, x340Var22, lljVar10);
                x0d.q(iHashCode10, x340Var22, lljVar11, x340Var22);
                nko1.H(qim0VarE10, x340Var22, lljVar12);
                boolean zE = x340Var22.e(iH);
                Object objT11 = x340Var22.T();
                if (!zE) {
                    m4cVar = m4cVar3;
                    if (objT11 == m4cVar) {
                    }
                    iu30 iu30Var6 = (iu30) objT11;
                    objT = x340Var22.T();
                    if (objT == m4cVar) {
                        objT = th01.X;
                        x340Var22.s0(objT);
                    }
                    hm5.a(hl01Var, (qim0) null, iu30Var6, (tl3) null, "receipt_state", (iu30) objT, apo.r(-1586056403, new ek01(f4, i4m0Var, iu30Var5, vu30Var, hce0Var, rjzVar), x340Var22), x340Var22, 1794048, 10);
                    x340Var22.r(true);
                    x340Var22.r(true);
                    return rih1Var2;
                }
                m4cVar = m4cVar3;
                objT11 = new po60(iH, (byte) 26);
                x340Var22.s0(objT11);
                iu30 iu30Var7 = (iu30) objT11;
                objT = x340Var22.T();
                if (objT == m4cVar) {
                    objT = th01.X;
                    x340Var22.s0(objT);
                }
                hm5.a(hl01Var, (qim0) null, iu30Var7, (tl3) null, "receipt_state", (iu30) objT, apo.r(-1586056403, new ek01(f4, i4m0Var, iu30Var5, vu30Var, hce0Var, rjzVar), x340Var22), x340Var22, 1794048, 10);
                x340Var22.r(true);
                x340Var22.r(true);
                return rih1Var2;
            case 10:
                x340 x340Var23 = (b0k) obj2;
                ((Number) obj3).intValue();
                iu30 iu30Var8 = (iu30) obj4;
                mvh1 mvh1Var = (mvh1) obj6;
                iu30 iu30Var9 = (iu30) obj7;
                Iterator it = ((List) obj5).iterator();
                while (it.hasNext()) {
                    int iIntValue6 = ((Number) it.next()).intValue();
                    mvh1 mvh1Var2 = (mvh1) obj8;
                    boolean z2 = mvh1Var2 instanceof kvh1;
                    bih1 bih1Var = (bih1) obj9;
                    x340 x340Var24 = x340Var23;
                    boolean zG4 = x340Var24.g(iu30Var9) | x340Var24.i(mvh1Var) | x340Var24.g(iu30Var8);
                    Object objT12 = x340Var24.T();
                    if (zG4 || objT12 == fkj0.X) {
                        objT12 = new rsc1(iu30Var9, mvh1Var, iu30Var8, (byte) 24);
                        x340Var24.s0(objT12);
                    }
                    eko1.e(iIntValue6, mvh1Var2, z2, bih1Var, (iu30) objT12, x340Var24, 0);
                }
                return rih1Var2;
            default:
                x340 x340Var25 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str2 = (String) obj9;
                i8h1 i8h1Var = (i8h1) obj8;
                List<kxn> list = (List) obj5;
                ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                for (kxn kxnVar : list) {
                    txn txnVar = kxnVar.a;
                    if (txnVar instanceof mxn) {
                        mo6Var = mo6.e;
                    } else if (txnVar instanceof oxn) {
                        mo6Var = mo6.f;
                    } else if (txnVar instanceof pxn) {
                        mo6Var = mo6.d;
                    } else if (txnVar instanceof qxn) {
                        mo6Var = mo6.h;
                    } else if (txnVar instanceof sxn) {
                        mo6Var = mo6.g;
                    } else if (txnVar instanceof lxn) {
                        mo6Var = mo6.c;
                    } else if (txnVar instanceof nxn) {
                        mo6Var = mo6.i;
                    } else {
                        if (!(txnVar instanceof rxn)) {
                            eg.o();
                            return null;
                        }
                        mo6Var = mo6.t;
                    }
                    String str3 = kxnVar.b;
                    if (str3.length() == 0) {
                        str3 = null;
                    }
                    arrayList2.add(new io6(mo6Var, (String) null, str3));
                }
                x340 x340Var26 = x340Var25;
                Object objT13 = x340Var26.T();
                Object obj10 = fkj0.X;
                if (objT13 == obj10) {
                    objT13 = new LinkedHashSet();
                    x340Var26.s0(objT13);
                }
                Set set = (Set) objT13;
                boolean zI3 = x340Var26.i(i8h1Var) | x340Var26.g(str2) | x340Var26.i((z2a) obj7) | x340Var26.g((qn30) obj6);
                i8h1 i8h1Var2 = (i8h1) obj8;
                String str4 = (String) obj9;
                z2a z2aVar = (z2a) obj7;
                qn30 qn30Var = (qn30) obj6;
                Object objT14 = x340Var26.T();
                if (zI3 || objT14 == obj10) {
                    objT14 = new wba1(i8h1Var2, str4, z2aVar, qn30Var, (lnm) null, (byte) 15);
                    x340Var26.s0(objT14);
                }
                qxd0.t(rih1Var2, x340Var26, (vu30) objT14);
                boolean zG5 = x340Var26.g(str2) | x340Var26.i(i8h1Var) | x340Var26.i(arrayList2);
                i8h1 i8h1Var3 = (i8h1) obj8;
                String str5 = (String) obj9;
                Object objT15 = x340Var26.T();
                if (zG5 || objT15 == obj10) {
                    objT15 = new wba1(i8h1Var3, str5, arrayList2, set, (lnm) null, (byte) 16);
                    arrayList = arrayList2;
                    x340Var26.s0(objT15);
                } else {
                    arrayList = arrayList2;
                }
                qxd0.t(arrayList, x340Var26, (vu30) objT15);
                i0p1.g((z2a) obj7, (iu30) obj4, arrayList, (qn30) obj6, x340Var26, 0);
                return rih1Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mse(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mse(joo0 joo0Var, Function0 function0, ven0 ven0Var, c9n c9nVar, ven0 ven0Var2, Function0 function1) {
        super(3);
        this.a = (byte) 6;
        this.b = joo0Var;
        this.c = function0;
        this.g = ven0Var;
        this.d = c9nVar;
        this.e = ven0Var2;
        this.f = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mse(zzz0 zzz0Var, c101 c101Var, iu30 iu30Var, lik1 lik1Var, idm idmVar, hdn0 hdn0Var) {
        super(3);
        this.a = (byte) 4;
        this.b = zzz0Var;
        this.c = c101Var;
        this.d = iu30Var;
        this.e = lik1Var;
        this.f = idmVar;
        this.g = hdn0Var;
    }
}
