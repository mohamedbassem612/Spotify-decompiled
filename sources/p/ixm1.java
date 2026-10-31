package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class ixm1 {
    public static final kiv a = new kiv(wam1.V0, (byte) 0);
    public static final float b = 16.0f;

    public static final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1441449168);
        if (x340Var.Y(i & 1, i != 0)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, cbx.b(x340Var).b.b, 0.0f, cbx.b(x340Var).b.c, 5);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            xto1.e((qim0) null, 0, 0L, 0L, x340Var, 0, 15);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c1j1(i, (byte) 14);
        }
    }

    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean, int] */
    public static final void b(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z, boolean z2) {
        ?? r4;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2029734222);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.h(z2) ? 32 : 16) | (x340Var.i(function0) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            mbh mbhVarA = jbh.a(new d36(b, true, new um5(false)), een.P0, x340Var, 6);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
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
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N("tags_title_bar", u291.f(nim0Var, 1.0f));
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarN);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            gra graVar2 = een.h;
            h2c h2cVar = h2c.a;
            qim0 qim0VarA = h2cVar.a(nim0Var, graVar2);
            Boolean boolValueOf = Boolean.valueOf(z);
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = tsm1.Y;
                x340Var.s0(objT);
            }
            hm5.a(boolValueOf, qim0VarA, (iu30) objT, (tl3) null, "title_crossfade", (iu30) null, btj.a, x340Var, (i2 & 14) | 1597824, 40);
            if (z2) {
                x340Var.i0(1671883342);
                String strO0 = cwl1.o0(x340Var, z ? 2131964067 : 2131964068);
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                r4 = 0;
                foo1.c(new gbx(new y50(strO0), function0), ldx.c, anm1.N("tags_edit_button", h2cVar.a(nim0Var, een.i)), (max) null, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1983035556, new ov51((byte) 9, z), x340Var), x340Var, 48, 48, 2008);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                r4 = 0;
                x340Var.i0(1672669688);
                x340Var.r(false);
            }
            x340Var.r((boolean) r15);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = rre1.Z0;
                x340Var.s0(objT2);
            }
            qim0 qim0VarX = j9k1.x(nim0Var, (xu30) objT2);
            gfh0 gfh0VarC2 = t1c.c(graVar, (boolean) r4);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarX);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            rqo1.g(6, (int) r4, x340Var, u291.f(nim0Var, 1.0f));
            x340Var.r((boolean) r15);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g9p0(z, z2, qim0Var, function0, i);
        }
    }

    public static final void c(List list, boolean z, bzr bzrVar, azr azrVar, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(301097832);
        int i2 = (x340Var.g(list) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16) | (x340Var.g(bzrVar) ? 256 : 128) | (x340Var.g(azrVar) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            mod.b(a.a(Boolean.valueOf(z)), apo.r(-1728608600, new hxm1(z, azrVar, function0, list, bzrVar), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hxm1(list, z, bzrVar, azrVar, function0, i);
        }
    }
}
