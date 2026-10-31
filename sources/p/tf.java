package p;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tf extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf(yg8 yg8Var, ven0 ven0Var, vxf0 vxf0Var, boolean z, jxa jxaVar) {
        super(3);
        this.a = (byte) 17;
        this.c = yg8Var;
        this.d = ven0Var;
        this.e = vxf0Var;
        this.b = z;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        float fD = ((((i2c) obj).d() - 48.0f) - 20.0f) / 2.0f;
        uwr uwrVar = cbx.a;
        xpv0 xpv0Var = cbx.c(x340Var).c;
        float fU = grn1.u(0, irn1.l0(pto1.q(2000, 1, 120.0f), 2000.0f, null, 4), this.b, x340Var, 6);
        nim0 nim0Var = nim0.a;
        qim0 qim0VarD = u291.d(nim0Var, 1.0f);
        r340 r340Var = (r340) this.c;
        bjx bjxVar = (bjx) this.d;
        wam wamVar = (wam) this.e;
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(mbhVarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        qim0 qim0VarZ = uyn1.z(24.0f, 0.0f, 2, u291.f(nim0Var, 1.0f));
        m360 m360Var = r340Var.b;
        boolean zI = x340Var3.i(bjxVar);
        Object objT = x340Var3.T();
        if (zI || objT == m4cVar) {
            objT = new o340(bjxVar, (byte) 3);
            x340Var3.s0(objT);
        }
        sbl.m(m360Var, (Function0) objT, qim0VarZ, this.b, x340Var, 0);
        op71.g(x340Var, u291.h(nim0Var, 16.0f));
        qim0 qim0VarO = grn1.o(grn1.y(uyn1.z(24.0f, 0.0f, 2, u291.d(nim0Var, 1.0f)), fU, 0.5f), fU);
        boolean zI2 = x340Var3.i(bjxVar);
        Object objT2 = x340Var3.T();
        if (zI2 || objT2 == m4cVar) {
            objT2 = new o340(bjxVar, (byte) 4);
            x340Var3.s0(objT2);
        }
        sbl.e(wamVar, fD, fU, (Function0) objT2, qim0VarO, x340Var, 0);
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        sdd0 sdd0Var = (sdd0) this.c;
        cm0 cm0Var = sdd0Var.e;
        String str = ((tdd0) this.d).a;
        xdd0 xdd0Var = sdd0Var.h;
        otw.c(cm0Var, new lyz0(xdd0Var.b, str, this.b, xdd0Var.f, xdd0Var.h, (ArrayList) this.e), (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        boolean z;
        vuk vukVar = (vuk) obj;
        ((Number) obj3).intValue();
        Object obj4 = this.d;
        ven0 ven0Var = (ven0) obj4;
        Object obj5 = this.c;
        yg8 yg8Var = (yg8) obj5;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (b0k) obj2;
        boolean zG = x340Var.g(vukVar);
        Object objT = x340Var.T();
        if (zG || objT == m4cVar) {
            objT = vukVar.d().D() ? new gue0() : null;
            x340Var.s0(objT);
        }
        gue0 gue0Var = (gue0) objT;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarF = dug.f(u291.d(nim0Var, 1.0f), u7h.b, d4o1.a);
        gfh0 gfh0VarC = t1c.c(een.h, false);
        int iHashCode = Long.hashCode(x340Var.T);
        xos0 xos0VarM = x340Var.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
        hzj.A.getClass();
        if (x340Var.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var.m0();
        if (x340Var.S) {
            x340Var.l(hmb0.t1);
        } else {
            x340Var.v0();
        }
        nko1.H(gfh0VarC, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        if (yg8Var == yg8.t) {
            x340Var.i0(-1006973345);
            xto1.e(null, 4, 0L, 0L, x340Var, 48, 13);
            x340Var.r(false);
            z = false;
        } else {
            z = false;
            x340Var.i0(-1006861807);
            if (gue0Var == null) {
                x340Var.i0(-1006861808);
            } else {
                x340Var.i0(-1972142063);
                gue0Var.a(u291.d(nim0Var, 1.0f), x340Var, 6);
            }
            x340Var.r(false);
            x340Var.r(false);
        }
        x340Var.r(true);
        if (gue0Var != null || ((Boolean) ven0Var.getValue()).booleanValue()) {
            x340Var.i0(444013322);
            x340Var.r(z);
        } else {
            x340Var.i0(443786526);
            boolean zE = x340Var.e(yg8Var == null ? -1 : yg8Var.ordinal()) | x340Var.g(ven0Var);
            Object obj6 = this.e;
            boolean zI = zE | x340Var.i((vxf0) obj6) | x340Var.h(this.b);
            yg8 yg8Var2 = (yg8) obj5;
            vxf0 vxf0Var = (vxf0) obj6;
            ven0 ven0Var2 = (ven0) obj4;
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                v4e0 v4e0Var = new v4e0(yg8Var2, vxf0Var, this.b, ven0Var2, (lnm) null);
                x340Var.s0(v4e0Var);
                objT2 = v4e0Var;
            }
            qxd0.t(yg8Var, x340Var, (vu30) objT2);
            x340Var.r(z);
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        boolean z = this.b;
        Object obj4 = this.d;
        Object obj5 = this.c;
        if (z) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1821361828);
            u7n0.e((c9) obj5, (xym) obj4, (qim0) null, x340Var2, 0);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1821449186);
            u7n0.d((c9) obj5, (xym) obj4, (iu30) this.e, (qim0) null, x340Var3, 0);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            otw.c((oyr0) this.c, new myr0(((hdg0) this.d).a, this.b, ((j7g0) this.e).a), (qim0) null, (ipb1) null, x340Var2, 0, 12);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        float f;
        float f2;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        boolean z = this.b;
        x340 x340Var2 = x340Var;
        if (z) {
            x340Var2.i0(582618424);
            x340Var2.r(false);
            f = 0.0f;
        } else {
            x340Var2.i0(582619546);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            x340Var2.r(false);
            f = 16.0f;
        }
        if (z) {
            x340 x340Var3 = x340Var;
            x340Var3.i0(582622170);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar2 = cbx.b(x340Var3).b;
            x340Var3.r(false);
            f2 = 16.0f;
        } else {
            x340 x340Var4 = x340Var;
            x340Var4.i0(582622552);
            x340Var4.r(false);
            f2 = 0.0f;
        }
        qim0 qim0VarB = uyn1.B(nim0.a, f, 0.0f, f2, 0.0f, 10);
        c101 c101Var = (c101) this.c;
        zyi0 zyi0Var = (zyi0) this.d;
        iu30 iu30Var = (iu30) this.e;
        gfh0 gfh0VarC = t1c.c(een.d, false);
        x340 x340Var5 = x340Var;
        int iHashCode = Long.hashCode(x340Var5.T);
        xos0 xos0VarM = x340Var5.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
        hzj.A.getClass();
        x340 x340Var6 = x340Var;
        if (x340Var6.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var6.m0();
        if (x340Var6.S) {
            x340Var6.l(hmb0.t1);
        } else {
            x340Var6.v0();
        }
        nko1.H(gfh0VarC, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        String str = zyi0Var.a;
        List list = zyi0Var.i;
        boolean zG = x340Var6.g(iu30Var) | x340Var6.g(zyi0Var);
        Object objT = x340Var6.T();
        if (zG || objT == fkj0.X) {
            objT = new o5j0(iu30Var, zyi0Var);
            x340Var6.s0(objT);
        }
        otw.c(c101Var, new a101(str, 1, list, this.b, (iu30) objT), (qim0) null, (ipb1) null, x340Var, 0, 12);
        x340Var6.r(true);
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        j2i j2iVar = (j2i) this.e;
        j2i j2iVar2 = (j2i) this.d;
        j2i j2iVar3 = (j2i) this.c;
        vzq0 vzq0Var = (vzq0) obj;
        ((Number) obj3).intValue();
        x340 x340Var = (b0k) obj2;
        int i = ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).orientation;
        nim0 nim0Var = nim0.a;
        if (i == 2) {
            x340Var.i0(1398184197);
            j0o1.f(j2iVar3, j2iVar2, j2iVar, uyn1.w(nim0Var, vzq0Var), x340Var, 0);
            x340Var.r(false);
        } else {
            x340Var.i0(1398402127);
            j0o1.g(j2iVar3, j2iVar2, j2iVar, this.b, uyn1.w(nim0Var, vzq0Var), x340Var, 0);
            x340Var.r(false);
        }
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        max haxVar;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        Function0 function0 = (Function0) this.d;
        String strN0 = cwl1.n0(2131961094, new Object[]{((fdq0) this.c).b}, x340Var);
        ldx ldxVar = ldx.c;
        if (this.b) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-1599882542);
            x340Var2.r(false);
            haxVar = jax.a;
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-1599826587);
            haxVar = new hax(cwl1.o0(x340Var3, 2131961095));
            x340Var3.r(false);
        }
        x340 x340Var4 = x340Var;
        boolean zG = x340Var4.g(function0);
        Object objT = x340Var4.T();
        if (zG || objT == fkj0.X) {
            objT = new kek0(function0, (byte) 22);
            x340Var4.s0(objT);
        }
        Function0 function1 = (Function0) objT;
        if (ihc1.y0(strN0)) {
            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            return null;
        }
        wro1.h(new gbx(new y50(strN0), function1), ldxVar, null, haxVar, null, null, false, null, null, apo.r(2100706777, new nso0((xbq0) this.e, (byte) 15), x340Var4), x340Var4, 0, 6, 1004);
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        boolean z = ((z6d1) this.c).f;
        e6d1 e6d1Var = (e6d1) this.d;
        iu30 iu30Var = (iu30) this.e;
        qim0 qim0VarB = uyn1.B(new tq60(een.Q0), 0.0f, 0.0f, 16.0f, 0.0f, 11);
        zho1.x(z, this.b, e6d1Var, iu30Var, qim0VarB, (b0k) obj2, 0, 0);
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        long j;
        long j2;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarZ = u291.z(nim0Var, (fra) null, 3);
            era eraVar = een.Q0;
            j2i j2iVar = (j2i) this.e;
            String str = (String) this.c;
            String str2 = (String) this.d;
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var2, 48);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            j2iVar.invoke(x340Var2, 0);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            lee1 lee1Var = kk0.p(nim0Var, 4.0f, x340Var2, x340Var2).m;
            boolean z = this.b;
            if (z) {
                x340Var2.i0(1162115395);
                j = cbx.a(x340Var2).b.c;
            } else {
                x340Var2.i0(1162116635);
                j = cbx.a(x340Var2).b.a;
            }
            x340Var2.r(false);
            uwo1.e(str, null, lee1Var, j, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2018);
            if (str2 != null) {
                x340Var2.i0(1665971373);
                Object objT = x340Var2.T();
                if (objT == fkj0.X) {
                    objT = lcz0.g;
                    x340Var2.s0(objT);
                }
                qim0 qim0VarA = s161.a(nim0Var, (iu30) objT);
                lee1 lee1Var2 = cbx.d(x340Var2).m;
                if (z) {
                    x340Var2.i0(1162128163);
                    j2 = cbx.a(x340Var2).b.c;
                } else {
                    x340Var2.i0(1162129406);
                    j2 = cbx.a(x340Var2).b.b;
                }
                x340Var2.r(false);
                uwo1.e(str2, qim0VarA, lee1Var2, j2, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2016);
                x340Var2.r(false);
            } else {
                x340Var2.i0(1666338475);
                x340Var2.r(false);
            }
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        float f;
        float f2;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        boolean z = this.b;
        x340 x340Var2 = x340Var;
        if (z) {
            x340Var2.i0(1129205928);
            x340Var2.r(false);
            f = 0.0f;
        } else {
            x340Var2.i0(1129207050);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            x340Var2.r(false);
            f = 16.0f;
        }
        if (z) {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1129209610);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar2 = cbx.b(x340Var3).b;
            x340Var3.r(false);
            f2 = 16.0f;
        } else {
            x340 x340Var4 = x340Var;
            x340Var4.i0(1129209992);
            x340Var4.r(false);
            f2 = 0.0f;
        }
        qim0 qim0VarB = uyn1.B(nim0.a, f, 0.0f, f2, 0.0f, 10);
        c101 c101Var = (c101) this.c;
        tom tomVar = (tom) this.d;
        iu30 iu30Var = (iu30) this.e;
        gfh0 gfh0VarC = t1c.c(een.d, false);
        x340 x340Var5 = x340Var;
        int iHashCode = Long.hashCode(x340Var5.T);
        xos0 xos0VarM = x340Var5.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
        hzj.A.getClass();
        x340 x340Var6 = x340Var;
        if (x340Var6.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var6.m0();
        if (x340Var6.S) {
            x340Var6.l(hmb0.t1);
        } else {
            x340Var6.v0();
        }
        nko1.H(gfh0VarC, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        String str = tomVar.a;
        List list = tomVar.h;
        boolean zG = x340Var6.g(iu30Var) | x340Var6.g(tomVar);
        Object objT = x340Var6.T();
        if (zG || objT == fkj0.X) {
            objT = new c861(iu30Var, tomVar, (byte) 9);
            x340Var6.s0(objT);
        }
        otw.c(c101Var, new a101(str, 1, list, this.b, (iu30) objT), (qim0) null, (ipb1) null, x340Var, 0, 12);
        x340Var6.r(true);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object o(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        gbx gbxVar;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        lbd1 lbd1Var = (lbd1) this.c;
        if (u890.j(lbd1Var, kbd1.a)) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-327368502);
            anm1.c(this.b, (iu30) null, (qim0) null, (max) null, (idn0) null, x340Var2, 48, 28);
            x340Var2.r(false);
        } else {
            if (!u890.j(lbd1Var, jbd1.a)) {
                throw p3d1.k(x340Var, -327370485, false);
            }
            x340 x340Var3 = x340Var;
            x340Var3.i0(-327364419);
            pk1 pk1Var = new pk1(this.b ? qk1.b : qk1.a, false, (String) null, (String) null, (j7p1) null, 30);
            lax laxVar = (lax) this.d;
            if (laxVar instanceof iax) {
                x340Var3.i0(-327355752);
                x340Var3.r(false);
                gbxVar = (gbx) this.e;
            } else {
                if (!(laxVar instanceof gax)) {
                    throw p3d1.k(x340Var3, -327357735, false);
                }
                x340Var3.i0(-327353599);
                Object objT = x340Var3.T();
                if (objT == m4cVar) {
                    objT = orc1.i;
                    x340Var3.s0(objT);
                }
                gbx gbxVar2 = new gbx(z50.c, (Function0) objT);
                x340Var3.r(false);
                gbxVar = gbxVar2;
            }
            Object objT2 = x340Var3.T();
            if (objT2 == m4cVar) {
                objT2 = d6d1.h;
                x340Var3.s0(objT2);
            }
            h7p1.a(pk1Var, gbxVar, s161.a(nim0.a, (iu30) objT2), null, null, x340Var3, 0, 24);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarX = uyn1.x(nim0Var, 8.0f);
            vu30 vu30Var = (vu30) this.e;
            String str = (String) this.c;
            String str2 = (String) this.d;
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            vu30Var.invoke(x340Var2, 0);
            op71.g(x340Var2, u291.h(nim0Var, 8.0f));
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var2).k;
            long j = u7h.b;
            uwo1.e(str, null, lee1Var, j, null, null, 2, false, new cjc0(2), 0, null, x340Var2, 1575936, 0, 1714);
            uwo1.e(str2, d9y0.k(nim0Var, this.b ? 1.0f : 0.0f), cbx.d(x340Var2).j, u7h.b(j, 0.7f, 0.0f, 0.0f, 0.0f, 14), null, null, 2, false, new cjc0(3), 0, null, x340Var2, 1575936, 0, 1712);
            zov0 zov0Var = ywx0.k(nim0Var, 8.0f, x340Var2, x340Var2).g;
            zpn1.f(u291.h(nim0Var, 12.0f), j, x340Var2, 48, 0);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:145:0x047d  */
    /* JADX WARN: Code duplicated, block: B:147:0x0480  */
    /* JADX WARN: Code duplicated, block: B:148:0x0487  */
    /* JADX WARN: Code duplicated, block: B:149:0x048a  */
    /* JADX WARN: Code duplicated, block: B:171:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:177:0x04da  */
    /* JADX WARN: Code duplicated, block: B:211:0x0566  */
    /* JADX WARN: Code duplicated, block: B:344:0x0908  */
    /* JADX WARN: Code duplicated, block: B:345:0x090d  */
    /* JADX WARN: Code duplicated, block: B:349:0x0931  */
    /* JADX WARN: Code duplicated, block: B:354:0x0947  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v25 java.lang.Object, still in use, count: 2, list:
          (r11v25 java.lang.Object) from 0x0904: PHI (r11 I:??) = (r11v21 java.lang.Object), (r11v25 java.lang.Object) binds: [B:341:0x0903, B:487:0x0904] A[DONT_GENERATE, DONT_INLINE]
          (r11v25 java.lang.Object) from 0x08fc: CHECK_CAST (p.g7o) (r11v25 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final java.lang.Object invoke(java.lang.Object r60, java.lang.Object r61, java.lang.Object r62) {
        /*
            Method dump skipped, instruction units count: 3508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.tf.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tf(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tf(Object obj, boolean z, Object obj2, Object obj3, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tf(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf(j2i j2iVar, String str, boolean z, String str2) {
        super(3);
        this.a = (byte) 25;
        this.e = j2iVar;
        this.c = str;
        this.b = z;
        this.d = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf(j2i j2iVar, j2i j2iVar2, j2i j2iVar3, boolean z) {
        super(3);
        this.a = (byte) 22;
        this.c = j2iVar;
        this.d = j2iVar2;
        this.e = j2iVar3;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf(cvx cvxVar, vu30 vu30Var, String str, boolean z, String str2) {
        super(3);
        this.a = (byte) 28;
        this.e = vu30Var;
        this.c = str;
        this.b = z;
        this.d = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tf(boolean z, Object obj, Object obj2, Object obj3, byte b) {
        super(3);
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
