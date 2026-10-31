package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class a081 {
    public static final yz71 a = new yz71();
    public static final long b = z4p1.g(4282812374L);

    public static final void a(String str, String str2, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(300904765);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(str2) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Set set = s4b1.f;
            boolean zH = uic.h(str, new blc0[]{blc0.u1, blc0.A1, blc0.M1});
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            boolean zD = x340Var.d(4.0f);
            Object objT = x340Var.T();
            if (zD || objT == fkj0.X) {
                objT = er31.b(4.0f);
                x340Var.s0(objT);
            }
            qim0 qim0VarQ = nim0.a;
            qim0 qim0VarThen = i1p1.q(u291.d(qim0VarQ, 1.0f), (cr31) objT).then(zH ? qim0VarQ : dug.f(qim0VarQ, ((vex) zex.a.e).g, d4o1.a));
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
            Uri uri = Uri.parse(str2);
            if (zH) {
                x340Var.i0(1877493800);
                cvx cvxVar = cbx.b(x340Var).b;
                qim0VarQ = i1p1.q(u291.d(uyn1.x(qim0VarQ, 2.0f), 1.0f), er31.a);
                x340Var.r(false);
            } else {
                x340Var.i0(1877494783);
                x340Var.r(false);
            }
            eso1.e(uri, isl.a, qim0VarQ, (p3v) null, (zvx) null, (ecx) null, zH ? mif1.P0 : mif1.Q0, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 224304, 0, 3968);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b4((byte) 19, i, str, str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    public static final void b(n081 n081Var, gw70 gw70Var, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        gw70 gw70Var2;
        Function0 function2;
        Function0 function3;
        qim0 qim0Var2;
        Enum r2;
        j2i j2iVar;
        m4c m4cVar = fkj0.X;
        boolean z = n081Var.g;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-526855210);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(n081Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            gw70Var2 = gw70Var;
            i2 |= x340Var.i(gw70Var2) ? 32 : 16;
        } else {
            gw70Var2 = gw70Var;
        }
        if ((i & 384) == 0) {
            function2 = function0;
            i2 |= x340Var.i(function2) ? 256 : 128;
        } else {
            function2 = function0;
        }
        if ((i & 3072) == 0) {
            function3 = function1;
            i2 |= x340Var.i(function3) ? 2048 : 1024;
        } else {
            function3 = function1;
        }
        int i3 = i2 | 221184;
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            l081 l081Var = n081Var.e;
            boolean z2 = l081Var instanceof k081;
            Enum r8 = zkt0.c;
            if (z2) {
                r2 = r8;
            } else {
                if (!(l081Var instanceof j081)) {
                    eg.o();
                    return;
                }
                j081 j081Var = (j081) l081Var;
                if (j081Var.a) {
                    r2 = j081Var.b ? zkt0.a : zkt0.b;
                } else {
                    r2 = r8;
                }
            }
            d081 d081Var = n081Var.f;
            boolean z3 = d081Var instanceof b081;
            boolean z4 = z3 && ((b081) d081Var).a;
            boolean z5 = z3 && !z4 && n081Var.d;
            boolean zE = x340Var.e(r2.ordinal()) | x340Var.h(z) | x340Var.h(z5);
            Object objT = x340Var.T();
            if (zE || objT == m4cVar) {
                if (r2 != r8) {
                    objT = new j2i(-1410819787, new u451(r2, (byte) 28), true);
                } else {
                    if (z) {
                        j2iVar = nhj.a;
                    } else {
                        j2iVar = z5 ? nhj.b : null;
                    }
                    objT = j2iVar;
                }
                x340Var.s0(objT);
            }
            xu30 xu30Var = (xu30) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT2;
            tob1 tob1VarB = z95.b(((Boolean) k1u.m(idn0Var, x340Var, 0).getValue()).booleanValue() ? 0.97f : 1.0f, (fe5) null, "shortcut-press", (iu30) null, x340Var, 3072, 22);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = yv91.a(new bu2(tob1VarB, (byte) 22));
                x340Var.s0(objT3);
            }
            nyx.a(2, (wux) null, apo.r(-1924485079, new qw1(gw70Var2, tob1VarB, n081Var, function2, function3, xu30Var, z4, idn0Var, (tob1) objT3), x340Var), x340Var, 3078, 6);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ay71((byte) 1, i, n081Var, gw70Var, function0, function1, qim0Var2);
        }
    }

    public static final void c(iix0 iix0Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-184304357);
        int i2 = i | (x340Var.i(iix0Var) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
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
            if ((iix0Var instanceof hix0) && ((hix0) iix0Var).a) {
                x340Var.i0(-459651146);
                qim0Var2 = qim0Var3;
                uwo1.e(cwl1.o0(x340Var, 2131954272), (qim0) null, cbx.d(x340Var).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2042);
                w0h1.a(klx.c, isl.a, u291.r(qim0Var2, 12.0f), cbx.a(x340Var).c.c, 0L, false, x340Var, klx.d | 48, 48);
                x340Var.r(false);
            } else {
                qim0Var2 = qim0Var3;
                x340Var.i0(-459292693);
                x340Var.r(false);
            }
            if ((iix0Var instanceof gix0) || (d(iix0Var) > 0.0f && (d(iix0Var) < 1.0d || !iix0Var.g()))) {
                x340Var.i0(-459240861);
                tto1.d(d(iix0Var), 0, 12, 0L, 0L, x340Var, u291.f(qim0Var2, 1.0f));
                x340Var.r(false);
            } else {
                x340Var.i0(-459110165);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jt41(iix0Var, qim0Var2, i, (byte) 29);
        }
    }

    public static final float d(iix0 iix0Var) {
        if (!(iix0Var instanceof gix0)) {
            return 0.0f;
        }
        gix0 gix0Var = (gix0) iix0Var;
        long j = gix0Var.b;
        if (j == 0) {
            return 0.0f;
        }
        long j2 = gix0Var.c;
        if (j2 > j) {
            j2 = j;
        }
        return j2 / j;
    }

    public static final gbx e(String str, Function0 function0) {
        if (ihc1.y0(str)) {
            return new gbx(z50.c, function0);
        }
        if (!ihc1.y0(str)) {
            return new gbx(new y50(str), function0);
        }
        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
        return null;
    }
}
