package p;

import android.graphics.Bitmap;
import com.spotify.remoteconfig.internal.ProductStateProto;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class rqt0 {
    public static final cix0 a = new cix0((byte) 17);
    public static final n75 b = new n75((byte) 24);
    public static b180 c = null;
    public static final int d = 9;
    public static final int e = 6;
    public static final int f = 10;
    public static final int g = 5;
    public static final int h = 15;

    public static final boolean A(fef0 fef0Var, String str) {
        if (str == null) {
            return false;
        }
        List list = fef0Var.c;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (nhc1.S(((def0) it.next()).a, str, true)) {
                return true;
            }
        }
        return false;
    }

    public static int B(int i) {
        return Integer.hashCode(i);
    }

    public static final boolean C(mtl mtlVar, Boolean bool) {
        return (mtlVar != null ? mtlVar.a : null) == ktl.b && u890.j(bool, Boolean.TRUE);
    }

    public static final boolean D(zuc0 zuc0Var) {
        tu00 tu00Var = zuc0Var.q;
        mtl mtlVarA = tu00Var.a(mtl.class);
        dxc0 dxc0VarA = tu00Var.a(dxc0.class);
        return C(mtlVarA, dxc0VarA != null ? Boolean.valueOf(fno1.j(dxc0VarA)) : null);
    }

    public static final void E(hf91 hf91Var, j06 j06Var, int i) {
        while (true) {
            int i2 = hf91Var.v;
            if (i > i2 && i < hf91Var.u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            hf91Var.N();
            if (hf91Var.x(hf91Var.v)) {
                j06Var.l();
            }
            hf91Var.i();
        }
    }

    public static final Single F(o8n o8nVar, vu30 vu30Var) {
        if (o8nVar.A(fkj0.W0) == null) {
            return Single.create(new x141(o8nVar, vu30Var));
        }
        bhn0.s(o8nVar, "Single context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had ");
        return null;
    }

    public static final String H(jo70 jo70Var) {
        io70 io70Var;
        String str = null;
        if (jo70Var != null && (io70Var = jo70Var.e) != null) {
            Set set = s4b1.f;
            if (uic.x(io70Var.b).c != blc0.fh) {
                io70Var = null;
            }
            if (io70Var != null) {
                str = io70Var.a;
            }
        }
        return str == null ? "" : str;
    }

    public static String I(int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = d;
        if ((i & i2) == i2) {
            J(sb, "Start");
        }
        int i3 = f;
        if ((i & i3) == i3) {
            J(sb, "Left");
        }
        if ((i & 16) == 16) {
            J(sb, "Top");
        }
        int i4 = e;
        if ((i & i4) == i4) {
            J(sb, "End");
        }
        int i5 = g;
        if ((i & i5) == i5) {
            J(sb, "Right");
        }
        if ((i & 32) == 32) {
            J(sb, "Bottom");
        }
        return f4i1.f("WindowInsetsSides(", sb.toString(), ")");
    }

    public static final void J(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public static final fef0 K(fef0 fef0Var, String str) {
        for (Object obj : fef0Var.c) {
            if (nhc1.S(((def0) obj).a, str, true)) {
                return new fef0(fef0Var.a, fef0Var.b, p7h.N(obj), fef0Var.d, fef0Var.e, fef0Var.f, fef0Var.g, fef0Var.h, fef0Var.i);
            }
        }
        obj = null;
        return new fef0(fef0Var.a, fef0Var.b, p7h.N(obj), fef0Var.d, fef0Var.e, fef0Var.f, fef0Var.g, fef0Var.h, fef0Var.i);
    }

    public static final void a(Function0 function0, String str, String str2, String str3, String str4, b0k b0kVar, int i) {
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(606451141);
        int i2 = i | (b0kVar2.i(function0) ? 4 : 2) | (b0kVar2.g(str) ? 32 : 16) | (b0kVar2.g(str2) ? 256 : 128) | (b0kVar2.g(str3) ? 2048 : 1024) | (b0kVar2.g(str4) ? 16384 : 8192);
        if (b0kVar2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            zzq0 zzq0Var = new zzq0(cbx.b(b0kVar2).e.b, cbx.b(b0kVar2).e.b, cbx.b(b0kVar2).e.b, cbx.b(b0kVar2).e.c);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarW = uyn1.w(nim0Var, zzq0Var);
            mbh mbhVarA = jbh.a(h36.g, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarW);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            vbe.s(str, anm1.N("premiumSignifier", nim0Var), 0L, 0L, (lee1) null, false, b0kVar2, (i2 >> 3) & 14, 60);
            op71.g(b0kVar2, new wnb0(1.0f, true));
            uwo1.e(str2, anm1.N("title", nim0Var), cbx.d(b0kVar2).d, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(4), 0, (qx8) null, b0kVar2, (i2 >> 6) & 14, 0, 1720);
            cvx cvxVar = cbx.b(b0kVar2).b;
            uwo1.e(str3, anm1.N("explanation", nim0Var), kk0.p(nim0Var, 6.0f, b0kVar2, b0kVar2).j, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, b0kVar2, (i2 >> 9) & 14, 0, 1720);
            b0kVar2 = b0kVar2;
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.h(nim0Var, 16.0f));
            gfx.f(6, apo.r(275515173, new ql(str4, function0, (byte) 7), b0kVar2), b0kVar2);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new uk20(function0, str, str2, str3, str4, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void b(c2l c2lVar, Function0 function0, int i, qim0 qim0Var, float f2, float f3, boolean z, boolean z2, boolean z3, String str, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        String str2;
        String strO0;
        int i3;
        qim0 qim0Var3;
        String str3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-816618593);
        int i4 = i2 | (x340Var.g(c2lVar) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.e(l1d.C(i)) ? 256 : 128) | 3072 | (x340Var.d(f2) ? 16384 : 8192) | (x340Var.d(f3) ? 131072 : 65536) | (x340Var.h(z) ? 1048576 : 524288) | (x340Var.h(z2) ? 8388608 : 4194304) | (x340Var.h(z3) ? 67108864 : 33554432) | 268435456;
        if (x340Var.Y(i4 & 1, (306783379 & i4) != 306783378)) {
            x340Var.d0();
            int i5 = i2 & 1;
            qim0 qim0VarB = nim0.a;
            if (i5 == 0 || x340Var.E()) {
                strO0 = cwl1.o0(x340Var, 2131954222);
                i3 = i4 & (-1879048193);
                qim0Var3 = qim0VarB;
            } else {
                x340Var.b0();
                strO0 = str;
                i3 = i4 & (-1879048193);
                qim0Var3 = qim0Var;
            }
            x340Var.s();
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            qim0 qim0VarF = dug.f(u291.r(qim0Var3, f2), u7h.b(u7h.f, ((Number) z95.b(z ? 1.0f : 0.0f, irn1.o0(100, 0, (dlv) null, 6), "connect-destination-button-highlight", (iu30) null, x340Var, 3072, 20).getValue()).floatValue() * 0.1f, 0.0f, 0.0f, 0.0f, 14), er31.a);
            if (z3) {
                x340Var.i0(-1188790762);
                qim0 qim0VarV = bin.v(qim0VarB, idn0Var, jtr.f, false, strO0, (pm31) null, function0, 20);
                str3 = strO0;
                boolean zG = x340Var.g(str3);
                Object objT2 = x340Var.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new kak(str3, (byte) 7);
                    x340Var.s0(objT2);
                }
                qim0VarB = s161.b(qim0VarV, false, (iu30) objT2);
                x340Var.r(false);
            } else {
                str3 = strO0;
                x340Var.i0(-1188463743);
                x340Var.r(false);
            }
            qim0 qim0VarThen = qim0VarF.then(qim0VarB);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarThen);
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
            m(c2lVar, f3, z2, i, x340Var, (i3 & 14) | ((i3 >> 12) & 112) | ((i3 >> 15) & 896) | ((i3 << 3) & 7168));
            x340Var.i0(402352253);
            x340Var.r(false);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
            str2 = str3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            str2 = str;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t1l(c2lVar, function0, i, qim0Var2, f2, f3, z, z2, z3, str2, i2);
        }
    }

    public static final void c(String str, float f2, mic0 mic0Var, Function0 function0, Function0 function1, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(340908097);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.d(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(mic0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.h(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var2.i(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (x340Var2.Y(i3 & 1, (i3 & 4793491) != 4793490)) {
            qim0 qim0VarF = u291.f(dug.e(qim0Var, mic0Var, (hw61) null, 0.0f, 6), 1.0f);
            boolean z = (i3 & 3670016) == 1048576;
            Object objT = x340Var2.T();
            if (z || objT == m4cVar) {
                objT = new c5a(iu30Var, (byte) 13);
                x340Var2.s0(objT);
            }
            qim0 qim0VarU = lrn1.u(qim0VarF, (iu30) objT);
            u85 u85Var = (erl1) x340Var2.k(szf0.b);
            if (u85Var == null) {
                x340Var2.i0(-241884180);
                WeakHashMap weakHashMap = osl1.x;
                u85Var = lhc.g(x340Var2).g;
            } else {
                x340Var2.i0(-241885792);
            }
            x340Var2.r(false);
            qim0 qim0VarY = too1.y(qim0VarU, new bgc0(u85Var, 16));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarX = uyn1.x(qim0VarY, 4.0f);
            mta mtaVar = cbx.b(x340Var2).d;
            qim0 qim0VarJ = u291.j(56.0f, 0.0f, 2, qim0VarX);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarJ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            z50 z50Var = z50.c;
            gbx gbxVar = new gbx(z50Var, function0);
            ldx ldxVar = ldx.c;
            gra graVar = een.g;
            h2c h2cVar = h2c.a;
            nim0 nim0Var = nim0.a;
            wro1.h(gbxVar, ldxVar, h2cVar.a(nim0Var, graVar), (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, bai.b, x340Var2, 0, 6, 1016);
            lee1 lee1Var = cbx.d(x340Var2).h;
            long j = cbx.a(x340Var2).b.a;
            qim0 qim0VarK = d9y0.k(h2cVar.a(nim0Var, een.h), f2);
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = iub.O0;
                x340Var2.s0(objT2);
            }
            uwo1.e(str, s161.b(qim0VarK, false, (iu30) objT2), lee1Var, j, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, i3 & 14, 0, 2016);
            qim0 qim0VarA = h2cVar.a(nim0Var, een.i);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarA);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            x340Var2.i0(-1051471605);
            x340Var2.r(false);
            wro1.h(new gbx(z50Var, function1), ldxVar, (qim0) null, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, bai.c, x340Var2, 0, 6, 1020);
            x340Var = x340Var2;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oe8(str, f2, mic0Var, function0, function1, iu30Var, qim0Var, i);
        }
    }

    public static final void d(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1560645305);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var).a.b.c();
            qim0 qim0Var2 = nim0.a;
            hr80.d(qim0Var2, 1.0f, jC, x340Var, 6, 0);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ns30(qim0Var, i, (byte) 16);
        }
    }

    public static final void e(fs40 fs40Var, Function0 function0, Function0 function1, qim0 qim0Var, idn0 idn0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        idn0 idn0Var2;
        idn0 idn0Var3;
        qim0 qim0Var3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(268847232);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(fs40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function1) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 = i2 | 11264;
        }
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                Object objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = ktd.n(x340Var);
                }
                idn0Var3 = (idn0) objT;
                qim0Var3 = nim0.a;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var;
                idn0Var3 = idn0Var;
            }
            x340Var.s();
            ven0 ven0VarM = k1u.m(idn0Var3, x340Var, 0);
            tob1 tob1VarB = z95.b(((Boolean) ven0VarM.getValue()).booleanValue() ? 0.97f : 1.0f, (fe5) null, "scale", (iu30) null, x340Var, 3072, 22);
            tob1 tob1VarB2 = z95.b(((Boolean) ven0VarM.getValue()).booleanValue() ? 0.8f : 1.0f, (fe5) null, "alpha", (iu30) null, x340Var, 3072, 22);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = p3d1.n(0L, x340Var);
            }
            ven0 ven0Var = (ven0) objT2;
            qim0 qim0VarH = u291.h(u291.v(qim0Var3, 343.0f), 280.0f);
            float fFloatValue = ((Number) tob1VarB.getValue()).floatValue();
            qim0 qim0VarN = anm1.N("card", d9y0.k(fj30.F(qim0VarH, fFloatValue, fFloatValue), ((Number) tob1VarB2.getValue()).floatValue()));
            String str = fs40Var.e;
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(str), function1);
            mgx mgxVar = mgx.e;
            zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cwl1.b(qim0VarN, (tl3) null, er31.b(8.0f), mgxVar, zzq0Var, (max) null, false, idn0Var3, (ga80) null, gbxVar, (gbx) null, apo.r(1167220841, new cy00(fs40Var, ven0Var, function0), x340Var), x340Var, 0, 48, 1378);
            x340Var = x340Var;
            qim0Var2 = qim0Var3;
            idn0Var2 = idn0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            idn0Var2 = idn0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kyq((byte) 14, i, (Object) fs40Var, (Object) function0, (Object) function1, (Object) qim0Var2, (Object) idn0Var2);
        }
    }

    public static final void f(long j, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2016267231);
        int i2 = (x340Var.f(j) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new ps((byte) 10, j);
                x340Var.s0(objT);
            }
            t1c.a(anm1.N("imageGradient", exd0.q(qim0VarD, (iu30) objT)), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sre(j, i, (byte) 21);
        }
    }

    public static final void g(Function0 function0, j2i j2iVar, b0k b0kVar, int i) {
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(897327562);
        byte b2 = 2;
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            function1 = function0;
            o((olx.d << 3) | ((i2 << 6) & 896), cwl1.o0(x340Var, 2131959661), function1, x340Var, olx.c, null);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            d(null, x340Var, 0);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            j2iVar.invoke(x340Var, 6);
            cvx cvxVar3 = cbx.b(x340Var).b;
            x0d.s(nim0Var, 4.0f, x340Var, true);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bu9(function1, j2iVar, i, b2);
        }
    }

    public static final void h(az90 az90Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(163332316);
        int i2 = (x340Var.g(az90Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new ux90(iu30Var, (byte) 2);
                x340Var.s0(objT);
            }
            g((Function0) objT, apo.r(-271217562, new jz90(az90Var, iu30Var), x340Var), x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jz90(az90Var, iu30Var, i);
        }
    }

    public static final void i(hux huxVar, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1159835940);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarR = u291.r(nim0.a, 32.0f);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new j160(function0, (byte) 28);
                x340Var.s0(objT);
            }
            cwl1.b(anm1.N("navigate-back-button", bin.x(qim0VarR, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15)), een.h, (hw61) null, (pgx) null, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(-1511171309, new g70(huxVar, (byte) 5), x340Var), x340Var, 0, 48, 2044);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lg60(huxVar, function0, i, (byte) 9);
        }
    }

    public static final void j(int i, String str, b0k b0kVar, iu30 iu30Var, qim0 qim0Var, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1134958911);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = c13.l(z, x340Var);
            }
            ven0 ven0Var = (ven0) objT;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = ((i2 & 112) == 32) | x340Var.i(ven0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new hj6(z, ven0Var, (lnm) null, (byte) 10);
                x340Var.s0(objT2);
            }
            qxd0.t(boolValueOf, x340Var, (vu30) objT2);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, 8.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            uwo1.e(str, new wnb0(1.0f, true), (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i2 & 14, 0, 2044);
            x340Var = x340Var;
            boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
            boolean zI2 = x340Var.i(ven0Var) | ((i2 & 896) == 256);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new gp0(iu30Var, ven0Var, (byte) 18);
                x340Var.s0(objT3);
            }
            aex.b(zBooleanValue, (iu30) objT3, anm1.N("control-checkbox", nim0.a), (String) null, 0, (idn0) null, (ga80) null, x340Var, 0, 120);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kz90(str, z, iu30Var, qim0Var, i, (byte) 0);
        }
    }

    public static final void k(az90 az90Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1189283129);
        int i2 = i | (x340Var.g(az90Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = u291.z(u291.f(qim0Var3, 1.0f), (fra) null, 3);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            if (az90Var.b) {
                x340Var.i0(-949655002);
                String strO0 = cwl1.o0(x340Var, 2131959663);
                boolean z = az90Var.c;
                boolean z2 = (i2 & 112) == 32;
                Object objT = x340Var.T();
                if (z2 || objT == m4cVar) {
                    objT = new bv70(iu30Var, (byte) 16);
                    x340Var.s0(objT);
                }
                j(0, strO0, x340Var, (iu30) objT, anm1.N("volume-control", qim0Var3), z);
                x340Var.r(false);
            } else {
                x340Var.i0(-949367663);
                x340Var.r(false);
            }
            String strO1 = cwl1.o0(x340Var, 2131959662);
            boolean z3 = !az90Var.d;
            boolean z4 = (i2 & 112) == 32;
            Object objT2 = x340Var.T();
            if (z4 || objT2 == m4cVar) {
                objT2 = new bv70(iu30Var, (byte) 17);
                x340Var.s0(objT2);
            }
            j(0, strO1, x340Var, (iu30) objT2, anm1.N("queue-only-mode-control", qim0Var3), z3);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mb90(az90Var, iu30Var, qim0Var2, i, (byte) 10);
        }
    }

    public static final void l(int i, int i2, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        Function0 function1;
        int i3;
        qim0 qim0Var2;
        Function0 function2;
        float f2;
        Function0 function3;
        h2c h2cVar;
        boolean z;
        qim0 qim0Var3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(950723666);
        int i4 = i | (x340Var.g(str) ? 4 : 2);
        int i5 = i4 | 48;
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i4 | 432;
            function1 = function0;
        } else {
            function1 = function0;
            i3 = i5 | (x340Var.i(function1) ? 256 : 128);
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            if (i6 != 0) {
                function1 = null;
            }
            if (function1 != null) {
                x340Var.i0(-1182580682);
                uwr uwrVar = cbx.a;
                mta mtaVar = cbx.b(x340Var).d;
                x340Var.r(false);
                f2 = 48.0f;
            } else {
                x340Var.i0(-1182580300);
                x340Var.r(false);
                f2 = 0.0f;
            }
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarN = anm1.N("song_dna_search_header", u291.f(qim0Var4, 1.0f));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            float f3 = f2;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            h2c h2cVar2 = h2c.a;
            if (function1 != null) {
                x340Var.i0(-967072093);
                boolean z2 = (i3 & 896) == 256;
                Object objT = x340Var.T();
                if (z2 || objT == m4cVar) {
                    objT = new pt61(function1, (byte) 19);
                    x340Var.s0(objT);
                }
                function3 = function1;
                qim0Var3 = qim0Var4;
                h2cVar = h2cVar2;
                z = false;
                wro1.h(new gbx(z50.c, (Function0) objT), ldx.c, anm1.N("song_dna_search_back", u291.y(u291.h(h2cVar2.a(qim0Var4, een.g), 0.0f), een.N0, true)), (max) null, yla.s(x340Var), (vzq0) null, false, (idn0) null, (ga80) null, xjj.a, x340Var, 0, 6, 984);
                x340Var.r(false);
            } else {
                function3 = function1;
                h2cVar = h2cVar2;
                z = false;
                qim0Var3 = qim0Var4;
                x340Var.i0(-966217578);
                x340Var.r(false);
            }
            uwr uwrVar2 = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).e;
            qim0 qim0VarZ = uyn1.z(f3, 0.0f, 2, h2cVar.a(u291.f(qim0Var3, 1.0f), een.h));
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = bba1.O0;
                x340Var.s0(objT2);
            }
            uwo1.e(str, s161.b(qim0VarZ, z, (iu30) objT2), lee1Var, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i3 & 14, 0, 2024);
            x340Var = x340Var;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
            function2 = function3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            function2 = function1;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hd11(i, str, function2, qim0Var2, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:64:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:70:0x0104  */
    /* JADX WARN: Code duplicated, block: B:72:0x0108  */
    /* JADX WARN: Code duplicated, block: B:73:0x010b  */
    public static final void m(c2l c2lVar, float f2, boolean z, int i, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        int i3;
        hux huxVarT;
        int iC;
        hux huxVar;
        hux huxVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1266540064);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? x340Var.g(c2lVar) : x340Var.i(c2lVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.d(f2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.e(l1d.C(i)) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zJ = u890.j(c2lVar, b2l.a);
            nim0 nim0Var = nim0.a;
            isl islVar = isl.a;
            if (zJ) {
                x340Var.i0(1669263021);
                int iC2 = l1d.C(i);
                if (iC2 == 0) {
                    huxVar2 = jmx.c;
                } else if (iC2 == 1) {
                    huxVar2 = slx.c;
                } else {
                    if (iC2 != 2) {
                        eg.o();
                        return;
                    }
                    huxVar2 = vsx.c;
                }
                hux huxVar3 = huxVar2;
                qim0 qim0VarR = u291.r(nim0Var, f2);
                uwr uwrVar = cbx.a;
                w0h1.a(huxVar3, islVar, qim0VarR, u7h.b(cbx.a(x340Var).b.b, 0.5f, 0.0f, 0.0f, 0.0f, 14), 0L, false, x340Var, 56, 48);
                x340Var.r(false);
            } else {
                hux huxVar4 = null;
                if (c2lVar instanceof a2l) {
                    x340Var.i0(1669272329);
                    switch (((a2l) c2lVar).a.ordinal()) {
                        case 0:
                            if (huxVar4 == null) {
                                iC = l1d.C(i);
                                if (iC == 0) {
                                    huxVar = jmx.c;
                                } else if (iC == 1) {
                                    huxVar = slx.c;
                                } else {
                                    if (iC != 2) {
                                        eg.o();
                                        return;
                                    }
                                    huxVar = vsx.c;
                                }
                                huxVar4 = huxVar;
                            }
                            qim0 qim0VarR2 = u291.r(nim0Var, f2);
                            uwr uwrVar2 = cbx.a;
                            w0h1.a(huxVar4, islVar, qim0VarR2, cbx.a(x340Var).b.a, 0L, false, x340Var, 56, 48);
                            x340Var.r(false);
                            break;
                        case 1:
                        case 2:
                            huxVar4 = unx.c;
                            if (huxVar4 == null) {
                                iC = l1d.C(i);
                                if (iC == 0) {
                                    huxVar = jmx.c;
                                } else if (iC == 1) {
                                    huxVar = slx.c;
                                } else {
                                    if (iC != 2) {
                                        eg.o();
                                        return;
                                    }
                                    huxVar = vsx.c;
                                }
                                huxVar4 = huxVar;
                            }
                            qim0 qim0VarR3 = u291.r(nim0Var, f2);
                            uwr uwrVar3 = cbx.a;
                            w0h1.a(huxVar4, islVar, qim0VarR3, cbx.a(x340Var).b.a, 0L, false, x340Var, 56, 48);
                            x340Var.r(false);
                            break;
                        case 3:
                            huxVar4 = vnx.c;
                            if (huxVar4 == null) {
                                iC = l1d.C(i);
                                if (iC == 0) {
                                    huxVar = jmx.c;
                                } else if (iC == 1) {
                                    huxVar = slx.c;
                                } else {
                                    if (iC != 2) {
                                        eg.o();
                                        return;
                                    }
                                    huxVar = vsx.c;
                                }
                                huxVar4 = huxVar;
                            }
                            qim0 qim0VarR4 = u291.r(nim0Var, f2);
                            uwr uwrVar4 = cbx.a;
                            w0h1.a(huxVar4, islVar, qim0VarR4, cbx.a(x340Var).b.a, 0L, false, x340Var, 56, 48);
                            x340Var.r(false);
                            break;
                        case 4:
                        case 5:
                            huxVar4 = jmx.c;
                            if (huxVar4 == null) {
                                iC = l1d.C(i);
                                if (iC == 0) {
                                    huxVar = jmx.c;
                                } else if (iC == 1) {
                                    huxVar = slx.c;
                                } else {
                                    if (iC != 2) {
                                        eg.o();
                                        return;
                                    }
                                    huxVar = vsx.c;
                                }
                                huxVar4 = huxVar;
                            }
                            qim0 qim0VarR5 = u291.r(nim0Var, f2);
                            uwr uwrVar5 = cbx.a;
                            w0h1.a(huxVar4, islVar, qim0VarR5, cbx.a(x340Var).b.a, 0L, false, x340Var, 56, 48);
                            x340Var.r(false);
                            break;
                        case 6:
                            huxVar4 = vnx.c;
                            if (huxVar4 == null) {
                                iC = l1d.C(i);
                                if (iC == 0) {
                                    huxVar = jmx.c;
                                } else if (iC == 1) {
                                    huxVar = slx.c;
                                } else {
                                    if (iC != 2) {
                                        eg.o();
                                        return;
                                    }
                                    huxVar = vsx.c;
                                }
                                huxVar4 = huxVar;
                            }
                            qim0 qim0VarR6 = u291.r(nim0Var, f2);
                            uwr uwrVar6 = cbx.a;
                            w0h1.a(huxVar4, islVar, qim0VarR6, cbx.a(x340Var).b.a, 0L, false, x340Var, 56, 48);
                            x340Var.r(false);
                            break;
                        default:
                            eg.o();
                            return;
                    }
                } else {
                    boolean z2 = c2lVar instanceof z1l;
                    xvd1 xvd1Var = xvd1.a;
                    if (z2) {
                        x340Var.i0(208161761);
                        cb80 cb80VarG = t5p1.g(t5p1.r("connect-destination-button-connecting", x340Var, 0), 1.0f, 0.0f, irn1.Y(irn1.o0(1000, 0, mlv.a, 2), 2, 0L, 4), "connect-destination-button-connecting-alpha", x340Var, 29112, 0);
                        z1l z1lVar = (z1l) c2lVar;
                        f0u f0uVar = z1lVar.a;
                        boolean z3 = z1lVar.b;
                        xvd1 xvd1Var2 = z1lVar.c;
                        if (!z) {
                            xvd1Var2 = null;
                        }
                        hux huxVarT2 = xvd1Var2 == xvd1Var ? slx.c : sqe.t(f0uVar, z3, z1lVar.d);
                        qim0 qim0VarK = d9y0.k(u291.r(nim0Var, f2), ((Number) cb80VarG.d.getValue()).floatValue());
                        uwr uwrVar7 = cbx.a;
                        w0h1.a(huxVarT2, islVar, qim0VarK, cbx.a(x340Var).b.a, 0L, false, x340Var, 56, 48);
                        x340Var.r(false);
                    } else {
                        if (!(c2lVar instanceof y1l)) {
                            throw p3d1.k(x340Var, 1669263175, false);
                        }
                        x340Var.i0(1669316615);
                        y1l y1lVar = (y1l) c2lVar;
                        switch (y1lVar.e.ordinal()) {
                            case 0:
                                huxVarT = null;
                                break;
                            case 1:
                            case 2:
                                huxVarT = unx.c;
                                break;
                            case 3:
                                huxVarT = vnx.c;
                                break;
                            case 4:
                            case 5:
                                huxVarT = jmx.c;
                                break;
                            case 6:
                                huxVarT = vnx.c;
                                break;
                            default:
                                eg.o();
                                return;
                        }
                        if (huxVarT == null) {
                            f0u f0uVar2 = y1lVar.a;
                            boolean z4 = y1lVar.b;
                            xvd1 xvd1Var3 = y1lVar.c;
                            if (!z) {
                                xvd1Var3 = null;
                            }
                            huxVarT = xvd1Var3 == xvd1Var ? rlx.c : sqe.t(f0uVar2, z4, y1lVar.f);
                        }
                        hux huxVar5 = huxVarT;
                        qim0 qim0VarR7 = u291.r(nim0Var, f2);
                        uwr uwrVar8 = cbx.a;
                        w0h1.a(huxVar5, islVar, qim0VarR7, cbx.a(x340Var).b.c, 0L, false, x340Var, 56, 48);
                        x340Var.r(false);
                    }
                }
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u1l(c2lVar, f2, z, i, i2);
        }
    }

    public static final void n(int i, String str, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1078945588);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            cwl1.b(qim0Var, een.h, (hw61) null, (pgx) null, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(-1112602379, new z3y(str, (byte) 18), x340Var), x340Var, (i2 >> 3) & 14, 48, 2044);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gy0(str, qim0Var, i, (byte) 10);
        }
    }

    public static final void o(int i, String str, Function0 function0, b0k b0kVar, hux huxVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1048215);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            qim0Var = nim0.a;
            qim0 qim0VarH = u291.h(u291.f(qim0Var, 1.0f), 48.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("top-bar", uyn1.z(16.0f, 0.0f, 2, qim0VarH));
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            int i4 = i3 >> 3;
            i(huxVar, function0, x340Var, (i4 & 112) | (i4 & 14) | 8);
            n(i3 & 14, str, x340Var, new wnb0(1.0f, true));
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new glf(str, huxVar, function0, qim0Var2, i);
        }
    }

    public static final Throwable p(Throwable th, llq0 llq0Var, hf91 hf91Var, s340 s340Var) {
        if (llq0Var == null) {
            return th;
        }
        jm5.r(th, new uc9(s340Var, hf91Var, llq0Var, (byte) 10));
        return th;
    }

    public static final rok0 q(llq0 llq0Var, hf91 hf91Var) {
        return new rok0(llq0Var, hf91Var, (byte) 28);
    }

    public static final Bitmap r(oq70 oq70Var, dqq0 dqq0Var, List list) {
        if (oq70Var instanceof kxa) {
            Bitmap bitmap = ((kxa) oq70Var).a;
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            if (f46.M(aqi1.a, config)) {
                return bitmap;
            }
        }
        return zno1.e(x2p1.g(oq70Var, dqq0Var.a.getResources()), (Bitmap.Config) kto1.v(dqq0Var, dz70.b), dqq0Var.b, dqq0Var.c, dqq0Var.d == 2);
    }

    public static final upa0 s(rwu rwuVar) {
        qwu qwuVar = rwuVar.a;
        tr80 tr80VarQ = yoi1.Q(0, qwuVar.c());
        ArrayList arrayList = new ArrayList(q7h.U(tr80VarQ, 10));
        lr80 it = tr80VarQ.iterator();
        while (((sr80) it).c) {
            int iNextInt = it.nextInt();
            qwuVar.b();
            arrayList.add(qwuVar.m[iNextInt]);
        }
        return new upa0(arrayList, (byte) 20);
    }

    public static final plu t(mr20 mr20Var, vu30 vu30Var) {
        w0h1.o(2, vu30Var);
        return w(mr20Var, a, vu30Var);
    }

    public static final mr20 u(mr20 mr20Var) {
        return mr20Var instanceof zob1 ? mr20Var : w(mr20Var, a, b);
    }

    public static final plu v(mr20 mr20Var, iu30 iu30Var) {
        return w(mr20Var, iu30Var, b);
    }

    public static final plu w(mr20 mr20Var, iu30 iu30Var, vu30 vu30Var) {
        if (mr20Var instanceof plu) {
            plu pluVar = (plu) mr20Var;
            if (pluVar.b == iu30Var && pluVar.c == vu30Var) {
                return pluVar;
            }
        }
        return new plu(mr20Var, iu30Var, vu30Var);
    }

    public static final boolean x(int i, int i2) {
        return i == i2;
    }

    public static sks0 y(byte[] bArr) {
        return new sks0((Object) ProductStateProto.r(bArr), (byte) 16);
    }

    public static final boolean z(int i, int i2) {
        return (i & i2) != 0;
    }
}
