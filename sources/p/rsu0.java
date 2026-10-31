package p;

import android.net.Uri;
import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rsu0 extends co41 {
    public static final /* synthetic */ int P0 = 0;
    public final psw N0;
    public final ia00 O0;
    public final wcp X;
    public final o3r Y = w3p1.n(new l4r(v061.a, 2, lqu0.W0, new j4r(lqu0.U0), lqu0.X0), new l4r(new xv00(rc11.a.b(xkk1.class)), 2, lqu0.Y0, new j4r(lqu0.V0), lqu0.Z0), psu0.a);
    public final ljm0 Z;
    public final iyc0 c;
    public final kt91 d;
    public final jik1 e;
    public final op31 f;
    public final ywc0 g;
    public final i4q h;
    public final yhm i;
    public final boolean t;

    public rsu0(iyc0 iyc0Var, kt91 kt91Var, jik1 jik1Var, op31 op31Var, ywc0 ywc0Var, i4q i4qVar, yhm yhmVar, boolean z, wcp wcpVar) {
        this.c = iyc0Var;
        this.d = kt91Var;
        this.e = jik1Var;
        this.f = op31Var;
        this.g = ywc0Var;
        this.h = i4qVar;
        this.i = yhmVar;
        this.t = z;
        this.X = wcpVar;
        lqu0 lqu0Var = lqu0.T0;
        fns fnsVar = igu.a;
        this.Z = h7w.B(lqu0Var, pyf0.a, (iu30) null, new ixt0(this, (byte) 2), 4);
        j2i j2iVar = new j2i(-1873141323, new qsu0(this, (byte) 0), true);
        ien0 ien0Var = qsw.a;
        this.N0 = new psw(j2iVar, (byte) 0);
        this.O0 = n3o1.q(this).a(gou0.X, gou0.Y);
    }

    public static gbx q(dsu0 dsu0Var, iu30 iu30Var, b0k b0kVar, int i) {
        String strN0 = cwl1.n0(2131959926, new Object[]{dsu0Var.b}, b0kVar);
        boolean z = (((i & 112) ^ 48) > 32 && ((x340) b0kVar).g(iu30Var)) || (i & 48) == 32;
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (z || objT == fkj0.X) {
            objT = new smt0(iu30Var, (byte) 12);
            x340Var.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        if (!ihc1.y0(strN0)) {
            return new gbx(new y50(strN0), function0);
        }
        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
        return null;
    }

    public static uvx r(boolean z, boolean z2, b0k b0kVar, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z3 = (i & 2) != 0 ? false : z2;
        if (!z) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(-452830237);
            x340Var.r(false);
            return new uvx(1, (pgx) null, 3, (vzq0) null, (zzq0) null, (tvx) null, (hw61) null, 2, (p3v) null, 378);
        }
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.i0(-453459289);
        uwr uwrVar = cbx.a;
        cua cuaVar = cbx.b(x340Var2).f;
        mgx mgxVar = mgx.e;
        cvx cvxVar = cbx.b(x340Var2).b;
        uvx uvxVar = new uvx(1, mgxVar, 3, (vzq0) null, uyn1.h(2, 12.0f, 0.0f), (tvx) null, er31.d(0.0f, 0.0f, z3 ? 16.0f : 0.0f, z3 ? 16.0f : 0.0f, 3), 2, (p3v) null, 296);
        x340Var2.r(false);
        return uvxVar;
    }

    public final rqw a() {
        return this.O0;
    }

    public final jsw c() {
        return this.N0;
    }

    public final void f(dsu0 dsu0Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-386896433);
        int i2 = i | (x340Var.g(dsu0Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strN0 = cwl1.n0(2131959924, new Object[]{dsu0Var.b}, x340Var);
            gdx gdxVarS = yla.s(x340Var);
            idx idxVar = new idx();
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new wpu0((byte) 3, dsu0Var, iu30Var);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strN0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(strN0), function0), idxVar, (qim0) null, (max) null, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, t8j.a, x340Var, 0, 48, 2012);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hsu0(this, dsu0Var, iu30Var, i, (byte) 0);
        }
    }

    public final void g(dsu0 dsu0Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-644819990);
        int i2 = i | (x340Var.g(dsu0Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strN0 = cwl1.n0(2131959926, new Object[]{dsu0Var.b}, x340Var);
            gdx gdxVarS = yla.s(x340Var);
            ldx ldxVar = ldx.c;
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new smt0(iu30Var, (byte) 11);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strN0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            wro1.h(new gbx(new y50(strN0), function0), ldxVar, (qim0) null, (max) null, gdxVarS, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(1831740467, new psr0(strN0, (byte) 17), x340Var), x340Var, 0, 6, 988);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hsu0(this, dsu0Var, iu30Var, i, (byte) 1);
        }
    }

    public final mqw getBehavior() {
        return this.Z;
    }

    /* JADX INFO: renamed from: getData, reason: collision with other method in class */
    public final o3r m1488getData() {
        return this.Y;
    }

    public final void h(dsu0 dsu0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-408097099);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(dsu0Var) : x340Var.i(dsu0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else if (dsu0Var.g instanceof wru0) {
            x340Var.i0(-1339283431);
            m(dsu0Var, iu30Var, x340Var, i2 & 1022);
            x340Var.r(false);
        } else {
            x340Var.i0(-1339281800);
            n(dsu0Var, iu30Var, x340Var, i2 & 1022);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jsu0(this, dsu0Var, iu30Var, i, (byte) 0);
        }
    }

    public final void i(esu0 esu0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        xu30 xu30Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1916171070);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(esu0Var) : b0kVar3.i(esu0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(this) ? 32 : 16;
        }
        boolean z = false;
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            yru0 yru0Var = esu0Var.a;
            wru0 wru0Var = yru0Var instanceof wru0 ? (wru0) yru0Var : null;
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            if (wru0Var != null) {
                b0kVar3.i0(-241560773);
                b0kVar3.r(false);
                xu30Var = null;
            } else {
                b0kVar3.i0(-241535879);
                xu30 xu30VarR = apo.r(-1593496005, new ksu0(this, (byte) 0), b0kVar3);
                b0kVar3.r(false);
                xu30Var = xu30VarR;
            }
            uvx uvxVarR = r(wru0Var != null, wru0Var != null ? wru0Var.a : false, b0kVar3, 0);
            if (wru0Var != null && wru0Var.a) {
                z = true;
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarF, uvxVarR, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, xu30Var, apo.r(-1418360071, new ksu0(this, (byte) 1), b0kVar3), (xu30) null, apo.r(-1142491142, new ksu0(this, (byte) 2), b0kVar3), (xu30) null, (xu30) null, z ? t8j.b : null, apo.r(-452834818, new ksu0(this, (byte) 3), b0kVar3), b0kVar2, 805306432, 196656, 13564);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new yvs0(this, esu0Var, i, (byte) 9);
        }
    }

    public final void j(dsu0 dsu0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1416105749);
        int i2 = (x340Var.g(dsu0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String str = dsu0Var.e;
            if (str == null) {
                str = "";
            }
            Uri uri = Uri.parse(str);
            as80 as80Var = mif1.P0;
            cbx.a.getClass();
            qim0 qim0VarF = hno1.f(nim0.a, uwr.a());
            fwx fwxVarG = hso1.G(grx.c, 0L, 0L, x340Var, grx.d, 30);
            eso1.e(uri, isl.a, qim0VarF, (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, new pux(fwxVarG, fwxVarG), false, false, x340Var, 1073741872, 0, 3512);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lsu0(this, dsu0Var, i, (byte) 0);
        }
    }

    public final void k(dsu0 dsu0Var, b0k b0kVar, int i) {
        byte b;
        boolean z = dsu0Var.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-637643273);
        int i2 = (x340Var.g(dsu0Var) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, z ? 2131959930 : 2131959931);
            String str = dsu0Var.f;
            if (str == null || str.length() <= 0) {
                str = null;
            }
            List listI0 = f46.i0(new String[]{strO0, str});
            if (x340Var.k(t4k.n) == flb0.b) {
                listI0 = o7h.T0(listI0);
            }
            String strY0 = o7h.y0(listI0, " • ", (String) null, (String) null, (iu30) null, 62);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            boolean z2 = dsu0Var.c;
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.b;
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0VarR = u291.r(nim0Var, 16.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            w0h1.a(z ? pox.c : orx.c, isl.a, uyn1.B(qim0VarR, 0.0f, 0.0f, 4.0f, 0.0f, 11), j, 0L, z2, x340Var, 56, 16);
            b = 1;
            uwo1.e(strY0, (qim0) null, cbx.d(x340Var).j, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1722);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            b = 1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lsu0(this, dsu0Var, i, b);
        }
    }

    public final void l(dsu0 dsu0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(435132663);
        int i2 = (x340Var.g(dsu0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String str = dsu0Var.b;
            cjc0 cjc0Var = new cjc0(1);
            uwr uwrVar = cbx.a;
            uwo1.e(str, (qim0) null, cbx.d(x340Var).h, 0L, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var, 0, 0, 1722);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lsu0(this, dsu0Var, i, (byte) 2);
        }
    }

    public final void m(dsu0 dsu0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-692367363);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(dsu0Var) : x340Var.i(dsu0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((wru0) dsu0Var.g).a;
            int i3 = i2 & 112;
            jto1.b(u291.f(nim0.a, 1.0f), r(true, z, x340Var, 0), (max) null, false, (idn0) null, (ga80) null, (gbx) null, q(dsu0Var, iu30Var, x340Var, i2 & 1022), (xu30) null, apo.r(463627046, new msu0(this, dsu0Var, (byte) 0), x340Var), (xu30) null, apo.r(1535631301, new msu0(this, dsu0Var, (byte) 1), x340Var), apo.r(784082148, new nsu0(this, dsu0Var, iu30Var, (byte) 0), x340Var), (xu30) null, z ? t8j.b : null, apo.r(-1470565311, new msu0(this, dsu0Var, (byte) 2), x340Var), x340Var, 805306432, 197040, 9596);
            x340Var = x340Var;
            if (dsu0Var.h) {
                x340Var.i0(-1882472065);
                n4g0 n4g0Var = new n4g0(dsu0Var.a);
                boolean z2 = i3 == 32;
                Object objT = x340Var.T();
                if (z2 || objT == fkj0.X) {
                    objT = new azr0(iu30Var, (byte) 23);
                    x340Var.s0(objT);
                }
                otw.c(this.X.a(n4g0Var, (iu30) objT), rih1.a, (qim0) null, (ipb1) null, x340Var, 48, 12);
                x340Var.r(false);
            } else {
                x340Var.i0(-1882005019);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jsu0(this, dsu0Var, iu30Var, i, (byte) 1);
        }
    }

    public final void n(dsu0 dsu0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        boolean z = dsu0Var.d;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1412508858);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(dsu0Var) : b0kVar3.i(dsu0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(this) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            Object obj = z ? mru0.a : qru0.a;
            String strO0 = cwl1.o0(b0kVar3, z ? 2131959927 : 2131959932);
            String strO1 = cwl1.o0(b0kVar3, z ? 2131959933 : 2131959929);
            uvx uvxVarR = r(false, false, b0kVar3, 3);
            int i3 = i2 & 112;
            gbx gbxVarQ = q(dsu0Var, iu30Var, b0kVar3, i2 & 1022);
            boolean zI = (i3 == 32) | b0kVar3.i(obj);
            Object objT = b0kVar3.T();
            if (zI || objT == m4cVar) {
                objT = new wpu0(iu30Var, obj, (byte) 4);
                b0kVar3.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            boolean zG = b0kVar3.g(strO1);
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new zqu0(strO1, (byte) 2);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            jto1.b(s161.b(qim0VarF, false, (iu30) objT2), uvxVarR, (max) null, false, (idn0) null, (ga80) null, gbxVar, gbxVarQ, apo.r(1558518780, new hho0(dsu0Var, iu30Var, obj, (byte) 7), b0kVar3), apo.r(-543934723, new msu0(this, dsu0Var, (byte) 3), b0kVar3), (xu30) null, apo.r(-2033374594, new msu0(this, dsu0Var, (byte) 4), b0kVar3), apo.r(159139199, new nsu0(this, dsu0Var, iu30Var, (byte) 1), b0kVar3), (xu30) null, (xu30) null, apo.r(-1853254014, new msu0(this, dsu0Var, (byte) 5), b0kVar3), b0kVar2, 905969728, 197040, 25660);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new jsu0(this, dsu0Var, iu30Var, i, (byte) 2);
        }
    }

    public final void o(float f, float f2, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-889995170);
        int i2 = (x340Var.d(f) ? 4 : 2) | i | (x340Var.d(f2) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarH = u291.h(u291.v(nim0.a, f), f2);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(dug.f(qim0VarH, jA, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qz2(this, f, f2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r9 == r5) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r9 == r5) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(java.lang.String r8, p.onm r9, boolean r10) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.osu0
            if (r0 == 0) goto L13
            r0 = r9
            p.osu0 r0 = (p.osu0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.osu0 r0 = new p.osu0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r9)
            goto L6d
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r2
        L31:
            boolean r10 = r0.b
            java.lang.String r8 = r0.a
            p.hm5.M(r9)
            goto L53
        L39:
            p.hm5.M(r9)
            if (r10 == 0) goto L58
            java.util.List r9 = java.util.Collections.singletonList(r8)
            r0.a = r8
            r0.b = r10
            r0.e = r4
            p.iyc0 r1 = r7.c
            p.wls0 r6 = p.wls0.d
            java.lang.Object r9 = p.iyc0.b(r1, r9, r6, r0)
            if (r9 != r5) goto L53
            goto L6c
        L53:
            p.py21 r9 = (p.py21) r9
            r9.d()
        L58:
            java.util.List r8 = java.util.Collections.singletonList(r8)
            r0.a = r2
            r0.b = r10
            r0.e = r3
            p.op31 r7 = r7.f
            p.pp31 r7 = (p.pp31) r7
            java.lang.Object r9 = r7.d(r8, r4, r0)
            if (r9 != r5) goto L6d
        L6c:
            return r5
        L6d:
            p.py21 r9 = (p.py21) r9
            r9.d()
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rsu0.p(java.lang.String, p.onm, boolean):java.lang.Object");
    }

    public final void s() {
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131959928});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        this.d.k(new er91((fs91) null, "", 2131959928, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
    }

    public final f4r getData() {
        return this.Y;
    }
}
