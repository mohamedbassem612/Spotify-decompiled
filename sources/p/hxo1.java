package p;

import android.net.Uri;
import android.text.Html;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class hxo1 {
    public static b180 a;
    public static b180 b;

    public static final void a(String str, c380 c380Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-737450362);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(c380Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = u291.z(u291.f(qim0Var3, 1.0f), (fra) null, 3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarZ, 16.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = h3.Y0;
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarX, true, (iu30) objT);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwo1.e(str, anm1.N("member-details-allocation-row-title", qim0Var3), cbx.d(x340Var).g, cbx.a(x340Var).b.a, new a0e1(5), null, 2, false, new cjc0(1), 0, null, x340Var, 1572912 | (i2 & 14), 0, 1696);
            x340Var.i0(1125801150);
            int i3 = 0;
            for (Object obj : c380Var) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                b(0, (String) obj, f4i1.c(i3, "member-details-allocation-item-"), x340Var, null);
                i3 = i4;
            }
            x340Var.r(false);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pl(str, c380Var, qim0Var2, i, (byte) 0);
        }
    }

    public static final void b(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2080949960);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String strN0 = cwl1.n0(2131961012, new Object[]{str, cwl1.o0(x340Var, 2131961013)}, x340Var);
            fra fraVar = een.N0;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N(str2, qim0Var3);
            boolean zG = x340Var.g(strN0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new v1(strN0, (byte) 5);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarN, false, (iu30) objT);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 48);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwr uwrVar = cbx.a;
            uwo1.e(str, new wnb0(1.0f, true), cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 2, false, null, 0, null, x340Var, (i2 & 14) | 1572864, 0, 1968);
            ilx ilxVar = ilx.c;
            long j = cbx.a(x340Var).c.c;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(ilxVar, isl.a, u291.r(qim0Var3, 16.0f), j, 0L, false, x340Var, ilx.d | 48, 48);
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(kk0.j(8.0f, 2131961013, x340Var, x340Var, qim0Var3), null, cbx.d(x340Var).j, cbx.a(x340Var).c.c, null, null, 3, false, null, 0, null, x340Var, 1572864, 0, 1970);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c4(str, str2, qim0Var2, i, (byte) 1);
        }
    }

    public static final void c(Function0 function0, Function0 function1, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(890532793);
        if ((i & 48) == 0) {
            i2 = (x340Var.i(function0) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function1) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 145) != 144)) {
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).b.b;
            nim0 nim0Var = nim0.a;
            j(ydh.g(f, 2131963632, x340Var, x340Var, nim0Var), new idx(), function0, x340Var, (i2 << 3) & 896);
            cvx cvxVar = cbx.b(x340Var).b;
            j(ydh.g(16.0f, 2131963633, x340Var, x340Var, nim0Var), ldx.c, function1, x340Var, i2 & 896);
            op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.c));
            h(x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k16(function0, function1, i, (byte) 2);
        }
    }

    public static final void d(boolean z, String str, maa maaVar, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-492834722);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.i(maaVar) ? 256 : 128) | 3072 | (x340Var.i(function0) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            String strO0 = cwl1.o0(x340Var, z ? 2131952641 : 2131952642);
            boolean z2 = (z || str == null) ? false : true;
            qim0 qim0Var3 = nim0.a;
            obg1.e(z2, strO0, u291.f(qim0Var3, 1.0f), 136.0f, true, "series_row", apo.r(-1182563651, new pp5(maaVar, str, (byte) 29), x340Var), function0, x340Var, ((i2 << 9) & 29360128) | 1797120, 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ey(z, str, maaVar, qim0Var2, function0, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void e(quf qufVar, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        Function0 function2;
        Function0 function3;
        qim0 qim0Var2;
        int i2;
        int i3;
        a5i1 a5i1Var = qufVar.a;
        yuf yufVar = qufVar.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2082158757);
        j06 j06Var = x340Var.a;
        int i4 = i | (x340Var.g(qufVar) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | 3072;
        if (x340Var.Y(i4 & 1, (i4 & 1171) != 1170)) {
            String strN = n(a5i1Var);
            vuf vufVar = vuf.a;
            boolean zEquals = yufVar.equals(vufVar);
            wuf wufVar = wuf.a;
            xuf xufVar = xuf.a;
            if (zEquals) {
                i2 = 2131963636;
            } else if (yufVar.equals(xufVar)) {
                i2 = 2131963663;
            } else {
                if (!yufVar.equals(wufVar)) {
                    eg.o();
                    return;
                }
                i2 = 2131963650;
            }
            String strN0 = cwl1.n0(i2, new Object[]{strN}, x340Var);
            if (yufVar.equals(vufVar)) {
                i3 = 2131963634;
            } else if (yufVar.equals(xufVar)) {
                i3 = 2131963662;
            } else {
                if (!yufVar.equals(wufVar)) {
                    eg.o();
                    return;
                }
                i3 = 2131963649;
            }
            String strO0 = cwl1.o0(x340Var, i3);
            boolean z = !(a5i1Var instanceof t4i1);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarH = l6o1.H(dug.f(qim0VarF, cbx.a(x340Var).a.a.a(), d4o1.a), l6o1.C(0, 0, 1, x340Var), false, 14);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarH);
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarA = uyn1.A(qim0VarP, 16.0f, cbx.b(x340Var).b.c, 16.0f, cbx.b(x340Var).b.b);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            era eraVar = een.Q0;
            mbh mbhVarA = jbh.a(new d36(cbx.b(x340Var).b.c, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            phx phxVarX = x(a5i1Var);
            a5i1 a5i1Var2 = qufVar.b;
            qim0Var2 = qim0Var3;
            fc11.a(mqo1.A(f46.i0(new phx[]{phxVarX, a5i1Var2 != null ? x(a5i1Var2) : null})), (qim0) null, hcx.e, (hux) null, false, 0, (gbx) null, (String) null, (idn0) null, x340Var, 392, 506);
            qim0 qim0VarF3 = u291.f(qim0Var2, 1.0f);
            mbh mbhVarA2 = jbh.a(h36.c, eraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarF3);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            i(strN0, strO0, z, !yufVar.equals(vufVar), x340Var, 0);
            if (yufVar.equals(vufVar)) {
                x340Var.i0(-79916);
                function2 = function0;
                function3 = function1;
                c(function2, function3, x340Var, (i4 & 112) | 6 | (i4 & 896));
                x340Var.r(false);
            } else {
                function2 = function0;
                function3 = function1;
                if (yufVar.equals(xufVar)) {
                    x340Var.i0(-76351);
                    k(x340Var, 6);
                    x340Var.r(false);
                } else {
                    if (!yufVar.equals(wufVar)) {
                        throw p3d1.k(x340Var, -82134, false);
                    }
                    x340Var.i0(-74611);
                    f(function3, x340Var, ((i4 >> 3) & 112) | 6);
                    x340Var.r(false);
                }
            }
            us71.m(x340Var, true, true, true);
        } else {
            function2 = function0;
            function3 = function1;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hwd(qufVar, function2, function3, qim0Var2, i, (byte) 13);
        }
    }

    public static final void f(Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-542284647);
        if ((i & 48) == 0) {
            i2 = (x340Var.i(function0) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 17) != 16)) {
            uwr uwrVar = cbx.a;
            j(ydh.g(cbx.b(x340Var).b.c, 2131963648, x340Var, x340Var, nim0.a), new idx(), function0, x340Var, (i2 << 3) & 896);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wk1((byte) 3, i, function0, false);
        }
    }

    public static final void g(xn10 xn10Var, boolean z, j2i j2iVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(220940566);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(xn10Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarQ = i1p1.q(qim0VarD, er31.b(16.0f));
            Uri uri = Uri.parse(xn10Var.e);
            cbx.a.getClass();
            eso1.e(uri, isl.a, qim0VarQ, (p3v) null, (zvx) null, uwr.c(), mif1.P0, (tl3) null, (ColorFilter) null, (qux) null, true, false, x340Var, 48, 6, 2968);
            qim0 qim0VarX = uyn1.x(u291.d(qim0Var3, 1.0f), 16.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            j2iVar.invoke(apo.r(1844716407, new kf2((Object) xn10Var, z, (byte) 7), x340Var), x340Var, 54);
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.i(qim0Var3, 8.0f, 12.0f));
            uwo1.e(xn10Var.a, u291.f(qim0Var3, 1.0f), cbx.d(x340Var).d, 0L, new a0e1(5), null, 2, false, new cjc0(2), 0, new px8(0L, cbx.d(x340Var).d.a.b, 0L, (mx8) null, 13), x340Var, 0, 8, 680);
            cvx cvxVar3 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.j(0.0f, 4.0f, 1, qim0Var3));
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwo1.e(xn10Var.b, qim0VarF, cbx.d(x340Var).k, 0L, new a0e1(5), null, 0, false, new cjc0(1), 0, new px8(cbx.d(x340Var).o.a.b, cbx.d(x340Var).k.a.b, 0L, (mx8) null, 12), x340Var, 0, 8, 744);
            cvx cvxVar4 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.j(8.0f, 0.0f, 2, qim0Var3).then(new wnb0(1.0f, true)));
            vbe.s(xn10Var.c, u291.f(u291.z(qim0Var3, (fra) null, 1), 1.0f), 0L, 0L, (lee1) null, false, x340Var, 0, 60);
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bk0(xn10Var, z, j2iVar, qim0Var2, i, (byte) 24);
        }
    }

    public static final void h(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1111249114);
        if (x340Var.Y(i & 1, i != 0)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            String strO0 = cwl1.o0(x340Var, 2131963635);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, qim0VarF, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), null, 2, false, new cjc0(3), 0, null, x340Var, 0, 0, 1696);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qza((byte) 18, i, false);
        }
    }

    public static final void i(String str, String str2, boolean z, boolean z2, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0VarA;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1594806158);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.g(str2) ? 32 : 16) | (x340Var2.h(z) ? 256 : 128) | (x340Var2.h(z2) ? 2048 : 1024);
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            if (z) {
                x340Var2.i0(58194794);
                boolean z3 = (i2 & 7168) == 2048;
                Object objT = x340Var2.T();
                if (z3 || objT == m4cVar) {
                    objT = new gy((byte) 11, z2);
                    x340Var2.s0(objT);
                }
                qim0VarA = s161.b(nim0Var, true, (iu30) objT);
                x340Var2.r(false);
            } else {
                x340Var2.i0(58521720);
                Object objT2 = x340Var2.T();
                if (objT2 == m4cVar) {
                    objT2 = rmf.e1;
                    x340Var2.s0(objT2);
                }
                qim0VarA = s161.a(nim0Var, (iu30) objT2);
                x340Var2.r(false);
            }
            qim0 qim0VarThen = qim0VarF.then(qim0VarA);
            era eraVar = een.Q0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarThen);
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
            uwo1.e(str, u291.f(nim0Var, 1.0f), cbx.d(x340Var2).d, cbx.a(x340Var2).b.a, new a0e1(3), null, 2, false, new cjc0(3), 0, null, x340Var2, i2 & 14, 0, 1696);
            uwo1.e(str2, u291.f(nim0Var, 1.0f), cbx.d(x340Var2).g, cbx.a(x340Var2).b.a, new a0e1(3), null, 2, false, new cjc0(3), 0, null, x340Var2, (i2 >> 3) & 14, 0, 1696);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pa0((Object) str, str2, z, z2, i, (byte) 4);
        }
    }

    public static final void j(String str, yf yfVar, Function0 function0, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1459441800);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(yfVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(function0) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            b0kVar2 = b0kVar3;
            foo1.c(new gbx(z50.c, function0), yfVar, null, null, yla.r(b0kVar3), null, null, null, null, null, apo.r(-419970327, new j3b(str, (byte) 20), b0kVar3), b0kVar2, i2 & 112, 48, 2012);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new p1b(str, yfVar, function0, i, (byte) 21);
        }
    }

    public static final void k(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1134894497);
        int i2 = i & 1;
        if (x340Var.Y(i2, i2 != 0)) {
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).b.c;
            nim0 nim0Var = nim0.a;
            op71.g(x340Var, u291.h(nim0Var, f));
            yto1.e(2, 48, 1, x340Var, null);
            op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.c));
            h(x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qza((byte) 19, i, false);
        }
    }

    public static qim0 l() {
        n511 n511Var = ckk1.a;
        return zr7.i(nim0.a, new n1r0(irn1.l0(0.0f, 400.0f, new qr80(4294967297L), 1), (byte) 26));
    }

    public static tad1 m(long j, long j2, long j3, long j4, long j5, b0k b0kVar, int i) {
        long j6 = u7h.j;
        long jE = eah.e(b0kVar, 11);
        long jE2 = (i & 64) != 0 ? eah.e(b0kVar, 24) : j5;
        long jE3 = eah.e(b0kVar, 39);
        long jB = u7h.b(eah.e(b0kVar, 35), 1.0f, 0.0f, 0.0f, 0.0f, 14);
        kiv kivVar = eah.a;
        return new tad1(j, j2, j6, jE, j3, j4, jE2, jE3, z4p1.t(jB, ((dah) ((x340) b0kVar).k(kivVar)).p), z4p1.t(u7h.b(eah.e(b0kVar, 18), 0.12f, 0.0f, 0.0f, 0.0f, 14), ((dah) ((x340) b0kVar).k(kivVar)).p), j6, z4p1.t(u7h.b(eah.e(b0kVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), ((dah) ((x340) b0kVar).k(kivVar)).p), z4p1.t(u7h.b(eah.e(b0kVar, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14), ((dah) ((x340) b0kVar).k(kivVar)).p), z4p1.t(u7h.b(eah.e(b0kVar, 39), 0.12f, 0.0f, 0.0f, 0.0f, 14), ((dah) ((x340) b0kVar).k(kivVar)).p), z4p1.t(u7h.b(eah.e(b0kVar, 18), 0.12f, 0.0f, 0.0f, 0.0f, 14), ((dah) ((x340) b0kVar).k(kivVar)).p), z4p1.t(u7h.b(eah.e(b0kVar, 39), 0.38f, 0.0f, 0.0f, 0.0f, 14), ((dah) ((x340) b0kVar).k(kivVar)).p));
    }

    public static final String n(a5i1 a5i1Var) {
        if ((a5i1Var instanceof t4i1) || (a5i1Var instanceof p4i1)) {
            return a5i1Var.getUsername();
        }
        if (!(a5i1Var instanceof r4i1)) {
            eg.o();
            return null;
        }
        r4i1 r4i1Var = (r4i1) a5i1Var;
        String str = r4i1Var.b.a;
        if (str != null) {
            String str2 = ihc1.y0(str) ? null : str;
            if (str2 != null) {
                return str2;
            }
        }
        return r4i1Var.a;
    }

    public static final int o(List list, int i, iu30 iu30Var) {
        if (list.isEmpty()) {
            return -1;
        }
        int iJ = p7h.J(list, new z0e(iu30Var, i, (byte) 5));
        if (iJ >= 0) {
            return iJ;
        }
        int i2 = -iJ;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return 0;
        }
        if (i3 == list.size()) {
            return list.size() - 1;
        }
        int iC = l1d.C(2);
        if (iC == 0) {
            int i4 = i2 - 2;
            if (Math.abs(((Number) iu30Var.invoke(list.get(i4))).intValue() - i) <= Math.abs(((Number) iu30Var.invoke(list.get(i3))).intValue() - i)) {
                i3 = i4;
            }
        } else if (iC == 1) {
            i3 = i2 - 2;
        } else if (iC != 2) {
            eg.o();
            return 0;
        }
        return yoi1.p(i3, 0, list.size() - 1);
    }

    public static CharSequence q(y570 y570Var) {
        return v(y570Var.n().a.b, y570Var.g().b("glue:subtitleAsHtml", false));
    }

    public static CharSequence r(y570 y570Var) {
        return v(y570Var.n().a.a, y570Var.g().b("glue:titleAsHtml", false));
    }

    public static final boolean s(cr01 cr01Var) {
        yq01 yq01Var = cr01Var.m;
        return (yq01Var != null ? yq01Var.b : 0) > 0;
    }

    public static boolean t(y570 y570Var) {
        id70 id70VarN = y570Var.n();
        if (id70VarN.a.a == null) {
            return false;
        }
        hd70 hd70Var = id70VarN.a;
        return (hd70Var.b == null && hd70Var.c == null && hd70Var.d == null) ? false : true;
    }

    public static final io80 u(klm klmVar, fdp0 fdp0Var, hbp0 hbp0Var, fdp0 fdp0Var2) {
        return klmVar.b("DownloadImageService", new iyo0(fdp0Var, hbp0Var, fdp0Var2, (byte) 14));
    }

    public static CharSequence v(String str, boolean z) {
        if (str == null) {
            str = "";
        }
        return (!z || jhc1.F(str)) ? str : Html.fromHtml(str, 0);
    }

    public static final void w(DrawScope drawScope, List list, long j, float f, float f2, float f3, float f4) {
        if (list.isEmpty()) {
            return;
        }
        tw4 tw4VarA = ww4.a();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
        float f5 = f4 * f3;
        long j2 = ((Offset) o7h.q0(list)).a;
        int i = (int) (j2 & 4294967295L);
        tw4VarA.k(Float.intBitsToFloat((int) (j2 >> 32)) * f5, fIntBitsToFloat - ((Math.abs(Float.intBitsToFloat(i)) <= Float.MAX_VALUE ? Float.intBitsToFloat(i) : 0.0f) * fIntBitsToFloat));
        int size = list.size();
        for (int i2 = 1; i2 < size; i2++) {
            long j3 = ((Offset) list.get(i2)).a;
            int i3 = (int) (j3 & 4294967295L);
            tw4VarA.j(Float.intBitsToFloat((int) (j3 >> 32)) * f5, fIntBitsToFloat - ((Math.abs(Float.intBitsToFloat(i3)) <= Float.MAX_VALUE ? Float.intBitsToFloat(i3) : 0.0f) * fIntBitsToFloat));
        }
        DrawScope.w0(drawScope, tw4VarA, u7h.b(j, f, 0.0f, 0.0f, 0.0f, 14), new phc1(f2, 0.0f, 1, 1, (uw4) null, 18), 52);
    }

    public static final phx x(a5i1 a5i1Var) {
        r4i1 r4i1Var = a5i1Var instanceof r4i1 ? (r4i1) a5i1Var : null;
        String str = r4i1Var != null ? r4i1Var.b.b : null;
        if (str == null) {
            str = "";
        }
        return new phx(8, 0L, str, a5i1Var.getUsername(), n(a5i1Var));
    }

    public abstract String p();
}
