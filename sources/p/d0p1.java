package p;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.unit.TextUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class d0p1 {
    public static b180 a;
    public static b180 b;

    public static List A(i0h1 i0h1Var) {
        if (i0h1Var instanceof h0h1) {
            return ((h0h1) i0h1Var).getParameters();
        }
        StringBuilder sbJ = ktd.j("ClassicTypeSystemContext couldn't handle: ", i0h1Var, ", ");
        hhg1.f(us71.f(rc11.a, i0h1Var.getClass(), sbJ));
        return null;
    }

    public static a8b0 B(a1h1 a1h1Var) {
        if (a1h1Var instanceof y0h1) {
            return rzn1.v((y0h1) a1h1Var);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(a1h1Var);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, a1h1Var.getClass(), sb));
        return null;
    }

    public static gmh1 C(efg efgVar, d0h1 d0h1Var) {
        if (efgVar.J(d0h1Var)) {
            return null;
        }
        if (d0h1Var instanceof e1h1) {
            return ((e1h1) d0h1Var).b().w0();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(d0h1Var);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, d0h1Var.getClass(), sb));
        return null;
    }

    public static y0h1 D(i0h1 i0h1Var) {
        if (i0h1Var instanceof h0h1) {
            y0h1 y0h1VarS = ((h0h1) i0h1Var).s();
            if (y0h1VarS instanceof y0h1) {
                return y0h1VarS;
            }
            return null;
        }
        StringBuilder sbJ = ktd.j("ClassicTypeSystemContext couldn't handle: ", i0h1Var, ", ");
        hhg1.f(us71.f(rc11.a, i0h1Var.getClass(), sbJ));
        return null;
    }

    public static int E(d0h1 d0h1Var) {
        if (d0h1Var instanceof e1h1) {
            return ozn1.m(((e1h1) d0h1Var).a());
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(d0h1Var);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, d0h1Var.getClass(), sb));
        return 0;
    }

    public static int F(a1h1 a1h1Var) {
        if (a1h1Var instanceof y0h1) {
            return ozn1.m(((y0h1) a1h1Var).x());
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(a1h1Var);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, a1h1Var.getClass(), sb));
        return 0;
    }

    public static boolean G(a1h1 a1h1Var, i0h1 i0h1Var) {
        if (!(a1h1Var instanceof y0h1)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(a1h1Var);
            sb.append(", ");
            hhg1.f(us71.f(rc11.a, a1h1Var.getClass(), sb));
            return false;
        }
        y0h1 y0h1Var = (y0h1) a1h1Var;
        if (i0h1Var == null ? true : i0h1Var instanceof h0h1) {
            return rzn1.w(y0h1Var, (h0h1) i0h1Var, null);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(y0h1Var);
        sb2.append(", ");
        hhg1.f(us71.f(rc11.a, y0h1Var.getClass(), sb2));
        return false;
    }

    public static boolean H(qh31 qh31Var, qh31 qh31Var2) {
        if (!(qh31Var instanceof qx81)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(qh31Var);
            sb.append(", ");
            hhg1.f(us71.f(rc11.a, qh31Var.getClass(), sb));
            return false;
        }
        if (qh31Var2 instanceof qx81) {
            return ((qx81) qh31Var).r0() == ((qx81) qh31Var2).r0();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(qh31Var2);
        sb2.append(", ");
        hhg1.f(us71.f(rc11.a, qh31Var2.getClass(), sb2));
        return false;
    }

    public static boolean I(i0h1 i0h1Var) {
        if (i0h1Var instanceof h0h1) {
            return g6b0.J((h0h1) i0h1Var, rfb1.a);
        }
        StringBuilder sbJ = ktd.j("ClassicTypeSystemContext couldn't handle: ", i0h1Var, ", ");
        hhg1.f(us71.f(rc11.a, i0h1Var.getClass(), sbJ));
        return false;
    }

    public static boolean J(i0h1 i0h1Var) {
        if (i0h1Var instanceof h0h1) {
            return ((h0h1) i0h1Var).s() instanceof beg;
        }
        StringBuilder sbJ = ktd.j("ClassicTypeSystemContext couldn't handle: ", i0h1Var, ", ");
        hhg1.f(us71.f(rc11.a, i0h1Var.getClass(), sbJ));
        return false;
    }

    public static boolean K(i0h1 i0h1Var) {
        if (i0h1Var instanceof h0h1) {
            beg begVarS = ((h0h1) i0h1Var).s();
            beg begVar = begVarS instanceof beg ? begVarS : null;
            return (begVar == null || begVar.o() != 1 || begVar.e0() == 3 || begVar.e0() == 4 || begVar.e0() == 5) ? false : true;
        }
        hhg1.f(us71.f(rc11.a, i0h1Var.getClass(), ktd.j("ClassicTypeSystemContext couldn't handle: ", i0h1Var, ", ")));
        return false;
    }

    public static boolean L(i0h1 i0h1Var) {
        if (i0h1Var instanceof h0h1) {
            return ((h0h1) i0h1Var).t();
        }
        StringBuilder sbJ = ktd.j("ClassicTypeSystemContext couldn't handle: ", i0h1Var, ", ");
        hhg1.f(us71.f(rc11.a, i0h1Var.getClass(), sbJ));
        return false;
    }

    public static boolean M(e8b0 e8b0Var) {
        if (e8b0Var instanceof a8b0) {
            return d4o1.i((a8b0) e8b0Var);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(e8b0Var);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, e8b0Var.getClass(), sb));
        return false;
    }

    public static boolean N(i0h1 i0h1Var) {
        if (i0h1Var instanceof h0h1) {
            beg begVarS = ((h0h1) i0h1Var).s();
            beg begVar = begVarS instanceof beg ? begVarS : null;
            return (begVar != null ? begVar.Q() : null) instanceof uf80;
        }
        hhg1.f(us71.f(rc11.a, i0h1Var.getClass(), ktd.j("ClassicTypeSystemContext couldn't handle: ", i0h1Var, ", ")));
        return false;
    }

    public static boolean O(i0h1 i0h1Var) {
        if (i0h1Var instanceof h0h1) {
            return i0h1Var instanceof bs80;
        }
        StringBuilder sbJ = ktd.j("ClassicTypeSystemContext couldn't handle: ", i0h1Var, ", ");
        hhg1.f(us71.f(rc11.a, i0h1Var.getClass(), sbJ));
        return false;
    }

    public static boolean P(i0h1 i0h1Var) {
        if (i0h1Var instanceof h0h1) {
            return i0h1Var instanceof e890;
        }
        StringBuilder sbJ = ktd.j("ClassicTypeSystemContext couldn't handle: ", i0h1Var, ", ");
        hhg1.f(us71.f(rc11.a, i0h1Var.getClass(), sbJ));
        return false;
    }

    public static boolean Q(e8b0 e8b0Var) {
        return (e8b0Var instanceof qx81) && ((qx81) e8b0Var).u0();
    }

    public static boolean R(i0h1 i0h1Var) {
        if (i0h1Var instanceof h0h1) {
            return g6b0.J((h0h1) i0h1Var, rfb1.b);
        }
        StringBuilder sbJ = ktd.j("ClassicTypeSystemContext couldn't handle: ", i0h1Var, ", ");
        hhg1.f(us71.f(rc11.a, i0h1Var.getClass(), sbJ));
        return false;
    }

    public static boolean S(e8b0 e8b0Var) {
        if (e8b0Var instanceof a8b0) {
            return o1h1.e((a8b0) e8b0Var);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(e8b0Var);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, e8b0Var.getClass(), sb));
        return false;
    }

    public static boolean T(sx81 sx81Var) {
        if (sx81Var instanceof a8b0) {
            return g6b0.G((a8b0) sx81Var);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(sx81Var);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, sx81Var.getClass(), sb));
        return false;
    }

    public static boolean U(wod wodVar) {
        if (wodVar instanceof w8o0) {
            return ((w8o0) wodVar).g;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(wodVar);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, wodVar.getClass(), sb));
        return false;
    }

    public static boolean V(d0h1 d0h1Var) {
        if (d0h1Var instanceof e1h1) {
            return ((e1h1) d0h1Var).c();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(d0h1Var);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, d0h1Var.getClass(), sb));
        return false;
    }

    public static void W(qh31 qh31Var) {
        if (qh31Var instanceof qx81) {
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(qh31Var);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, qh31Var.getClass(), sb));
    }

    public static void X(qh31 qh31Var) {
        if (qh31Var instanceof qx81) {
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(qh31Var);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, qh31Var.getClass(), sb));
    }

    public static final boolean Y(List list, xo20 xo20Var) {
        if (xo20Var == null) {
            return list.contains("media:video");
        }
        to20 to20Var = xo20Var.b;
        to20 to20Var2 = to20Var instanceof to20 ? to20Var : null;
        return (to20Var2 != null ? to20Var2.a : 0) == 1;
    }

    public static qx81 Z(gq20 gq20Var) {
        if (gq20Var instanceof dq20) {
            return ((dq20) gq20Var).b;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(gq20Var);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, gq20Var.getClass(), sb));
        return null;
    }

    public static final void a(yap1 yap1Var, String str, String str2, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1718465122);
        int i2 = i | (b0kVar3.g(yap1Var) ? 4 : 2) | (b0kVar3.g(str) ? 32 : 16) | (b0kVar3.g(str2) ? 256 : 128) | (b0kVar3.i(function0) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarZ = u291.z(u291.f(nim0.a, 1.0f), (fra) null, 3);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(b0kVar3).g;
            cvx cvxVar = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarZ, new uvx(0, (pgx) null, 3, (vzq0) null, uyn1.h(2, 4.0f, 0.0f), (tvx) null, (hw61) null, 0, new p3v(64.0f), 235), null, false, null, null, new gbx(z50.c, function0), null, null, apo.r(237327509, new o2((Object) yap1Var, (byte) 5), b0kVar3), null, apo.r(-47587626, new p3(str2, (byte) 4), b0kVar3), c3i.b, null, null, apo.r(-480303654, new p3(str, (byte) 5), b0kVar3), b0kVar2, 805306432, 197040, 26044);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new x2((Object) yap1Var, str, str2, (Object) function0, i, (byte) 3);
        }
    }

    public static gmh1 a0(wod wodVar) {
        if (wodVar instanceof w8o0) {
            return ((w8o0) wodVar).d;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(wodVar);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, wodVar.getClass(), sb));
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void b(yap1 yap1Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1128692123);
        int i2 = (x340Var.g(yap1Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarR = u291.r(nim0Var, 64.0f);
            long jC = cbx.a(x340Var).a.a.c();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(qim0VarR, jC, er31.b(4.0f));
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
            boolean z2 = yap1Var instanceof rrp0;
            isl islVar = isl.a;
            if (z2) {
                x340Var.i0(1306928632);
                hux huxVar = ((rrp0) yap1Var).c;
                zov0 zov0Var2 = cbx.b(x340Var).g;
                w0h1.a(huxVar, islVar, u291.r(nim0Var, 32.0f), cbx.a(x340Var).b.a, 0L, false, x340Var, 56, 48);
                x340Var.r(false);
                z = true;
            } else {
                if (!(yap1Var instanceof srp0)) {
                    throw p3d1.k(x340Var, 2120368020, false);
                }
                x340Var.i0(1307182491);
                Uri uri = Uri.parse("spotify:cached-files");
                zov0 zov0Var3 = cbx.b(x340Var).g;
                eso1.e(uri, islVar, u291.r(nim0Var, 64.0f), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 48, 0, 4088);
                x340Var.r(false);
                z = true;
            }
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ab(yap1Var, i, (byte) 7);
        }
    }

    public static gmh1 b0(e8b0 e8b0Var) {
        if (e8b0Var instanceof gmh1) {
            return mue1.M((gmh1) e8b0Var, false);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(e8b0Var);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, e8b0Var.getClass(), sb));
        return null;
    }

    public static final void c(int i, int i2, b0k b0kVar, qim0 qim0Var) throws Throwable {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(991666906);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            String strU = cwl1.U(2131820694, i, new Object[]{Integer.valueOf(i)}, x340Var);
            String strU2 = cwl1.U(2131820695, i, new Object[]{Integer.valueOf(i)}, x340Var);
            qim0 qim0Var2 = nim0.a;
            e(2, 24624, 0L, strU, strU2, x340Var, qim0Var2);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mq2((byte) 18, i, i2, qim0Var);
        }
    }

    public static LinkedHashMap c0(int i) {
        int i2;
        if (i < 3) {
            i2 = i + 1;
        } else {
            i2 = i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Integer.MAX_VALUE;
        }
        return new LinkedHashMap(i2);
    }

    public static final void d(int i, String str, b0k b0kVar, qim0 qim0Var) throws Throwable {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-298559648);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strN0 = cwl1.n0(2131956485, new Object[]{str}, x340Var);
            String strN1 = cwl1.n0(2131956486, new Object[]{str}, x340Var);
            qim0 qim0Var2 = nim0.a;
            e(2, 24624, 0L, strN0, strN1, x340Var, qim0Var2);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uo50(str, qim0Var, i, (byte) 5);
        }
    }

    public static int d0(i0h1 i0h1Var) {
        if (i0h1Var instanceof h0h1) {
            return ((h0h1) i0h1Var).getParameters().size();
        }
        StringBuilder sbJ = ktd.j("ClassicTypeSystemContext couldn't handle: ", i0h1Var, ", ");
        hhg1.f(us71.f(rc11.a, i0h1Var.getClass(), sbJ));
        return 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(int i, int i2, long j, String str, String str2, b0k b0kVar, qim0 qim0Var) throws Throwable {
        int i3;
        b0k b0kVar2;
        long j2;
        int i4;
        long j3;
        qim0 qim0VarB;
        Throwable th;
        float fU0;
        b0k b0kVar3;
        int i5;
        lee1 lee1Var;
        m4c m4cVar = fkj0.X;
        b0k b0kVar4 = (x340) b0kVar;
        b0kVar4.k0(884781909);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar4.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar4.g(qim0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= b0kVar4.g(str2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= b0kVar4.e(i == 0 ? -1 : l1d.C(i)) ? 16384 : 8192;
        }
        if (b0kVar4.Y(i3 & 1, (i3 & 9363) != 9362)) {
            b0kVar4.d0();
            if ((i2 & 1) == 0 || b0kVar4.E()) {
                uwr uwrVar = cbx.a;
                i4 = i3 & (-897);
                j3 = cbx.a(b0kVar4).b.c;
            } else {
                b0kVar4.b0();
                i4 = i3 & (-897);
                j3 = j;
            }
            b0kVar4.s();
            qim0 qim0VarN = anm1.N("group_listening_activity_indicator_test_tag", qim0Var);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar = cbx.b(b0kVar4).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 2.0f, 1, qim0VarN);
            if (str2 == null) {
                b0kVar4.i0(323989747);
                b0kVar4.r(false);
                qim0VarB = null;
            } else {
                b0kVar4.i0(323989748);
                boolean zG = b0kVar4.g(str2);
                Object objT = b0kVar4.T();
                if (zG || objT == m4cVar) {
                    objT = new z9b0(str2, (byte) 7);
                    b0kVar4.s0(objT);
                }
                qim0VarB = s161.b(qim0VarZ, true, (iu30) objT);
                b0kVar4.r(false);
            }
            if (qim0VarB != null) {
                qim0VarZ = qim0VarB;
            }
            lee1 lee1Var2 = cbx.d(b0kVar4).j;
            wat watVar = (wat) b0kVar4.k(t4k.h);
            b0kVar4.i0(-128088510);
            long j4 = lee1Var2.a.b;
            if (TextUnit.e(j4)) {
                th = null;
                b0kVar4.i0(422423446);
                b0kVar4.r(false);
                fU0 = watVar.U0() * TextUnit.c(j4);
            } else {
                th = null;
                b0kVar4.i0(422424710);
                zov0 zov0Var = cbx.b(b0kVar4).g;
                b0kVar4.r(false);
                fU0 = 12.0f;
            }
            b0kVar4.r(false);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar4, 48);
            int iHashCode = Long.hashCode(((x340) b0kVar4).T);
            xos0 xos0VarM = b0kVar4.m();
            qim0 qim0VarE = zr7.E(b0kVar4, qim0VarZ);
            hzj.A.getClass();
            if (((x340) b0kVar4).a == null) {
                tgp1.p();
                throw th;
            }
            b0kVar4.m0();
            if (((x340) b0kVar4).S) {
                b0kVar4.l(hmb0.t1);
            } else {
                b0kVar4.v0();
            }
            nko1.H(jw31VarA, b0kVar4, y580.O0);
            nko1.H(xos0VarM, b0kVar4, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar4, y580.R0);
            nko1.F(b0kVar4);
            nko1.H(qim0VarE, b0kVar4, y580.Y);
            int iC = l1d.C(i);
            if (iC != 0) {
                nim0 nim0Var = nim0.a;
                if (iC == 1) {
                    b0kVar3 = b0kVar4;
                    i5 = 1;
                    lee1Var = lee1Var2;
                    b0kVar3.i0(-394115109);
                    qim0 qim0VarR = u291.r(nim0Var, fU0);
                    Object objT2 = b0kVar3.T();
                    if (objT2 == m4cVar) {
                        objT2 = ecd0.g;
                        b0kVar3.s0(objT2);
                    }
                    c0p1.b(qim0VarR.then(new uul1(new mi31((iu30) objT2))), b0kVar3, 0);
                    cvx cvxVar2 = cbx.b(b0kVar3).b;
                    ab80.p(nim0Var, 4.0f, b0kVar3, false);
                } else {
                    if (iC != 2) {
                        throw p3d1.k(b0kVar4, 1788400817, false);
                    }
                    b0kVar4.i0(-393869093);
                    lee1Var = lee1Var2;
                    w0h1.a(urx.c, isl.a, anm1.N("listening_activity_indicator_recent_icon_test_tag", u291.r(nim0Var, fU0).then(new vul1(xl3.a))), 0L, 0L, false, b0kVar4, urx.d | 48, 56);
                    b0kVar3 = b0kVar4;
                    cvx cvxVar3 = cbx.b(b0kVar3).b;
                    ab80.p(nim0Var, 4.0f, b0kVar3, false);
                    i5 = 1;
                }
            } else {
                b0kVar3 = b0kVar4;
                i5 = 1;
                lee1Var = lee1Var2;
                b0kVar3.i0(1788422325);
                b0kVar3.r(false);
            }
            long j5 = j3;
            b0k b0kVar5 = b0kVar3;
            uwo1.e(str, new vul1(xl3.a), lee1Var, j5, null, null, 2, false, new cjc0(i5), 0, null, b0kVar5, (i4 & 14) | 1572864, 0, 1712);
            b0kVar2 = b0kVar5;
            b0kVar2.r(i5);
            j2 = j5;
        } else {
            b0kVar2 = b0kVar4;
            b0kVar2.b0();
            j2 = j;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ved0(i, i2, j2, str, str2, qim0Var);
        }
    }

    public static Collection e0(efg efgVar, qh31 qh31Var) {
        bs80 bs80VarQ = efgVar.q(qh31Var);
        if (bs80VarQ instanceof bs80) {
            return bs80VarQ.a;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(qh31Var);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, qh31Var.getClass(), sb));
        return null;
    }

    public static final void f(q8d1 q8d1Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-789478646);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(q8d1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(nim0.a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            function1 = function0;
            tho1.l(q8d1Var.b, q8d1Var.c, function1, apo.r(-534070041, new jb50(q8d1Var, (byte) 12), x340Var), x340Var, (i2 & 896) | 24576 | ((i2 << 6) & 7168));
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lg60(q8d1Var, function1, i);
        }
    }

    public static e1h1 f0(vod vodVar) {
        if (vodVar instanceof x8o0) {
            return ((x8o0) vodVar).a;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(vodVar);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, vodVar.getClass(), sb));
        return null;
    }

    public static final void g(trt0 trt0Var, String str, String str2, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        long j;
        float fU0;
        pw31 pw31Var;
        qim0 qim0Var3;
        x340 x340Var;
        lee1 lee1Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-504634363);
        int i2 = i | (x340Var2.g(trt0Var) ? 4 : 2) | (x340Var2.g(str) ? 32 : 16) | (x340Var2.g(str2) ? 256 : 128) | 3072;
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = trt0Var instanceof nrt0;
            if (z) {
                x340Var2.i0(377688657);
                uwr uwrVar = cbx.a;
                j = cbx.a(x340Var2).b.c;
                x340Var2.r(false);
            } else {
                x340Var2.i0(377689964);
                uwr uwrVar2 = cbx.a;
                j = cbx.a(x340Var2).b.b;
                x340Var2.r(false);
            }
            long j2 = j;
            boolean z2 = trt0Var instanceof irt0;
            irt0 irt0Var = z2 ? (irt0) trt0Var : null;
            hrt0 hrt0Var = irt0Var != null ? irt0Var.a : null;
            frt0 frt0Var = hrt0Var instanceof frt0 ? (frt0) hrt0Var : null;
            int i3 = i2 >> 3;
            String strK = zko1.k(z, str2, str, frt0Var != null ? frt0Var.b : null, null, x340Var2, 16);
            lee1 lee1Var2 = cbx.d(x340Var2).j;
            wat watVar = (wat) x340Var2.k(t4k.h);
            x340Var2.i0(377704997);
            long j3 = lee1Var2.a.b;
            if (TextUnit.e(j3)) {
                x340Var2.i0(-1887038983);
                x340Var2.r(false);
                fU0 = watVar.U0() * TextUnit.c(j3);
            } else {
                x340Var2.i0(-1886934079);
                zov0 zov0Var = cbx.b(x340Var2).g;
                x340Var2.r(false);
                fU0 = 12.0f;
            }
            x340Var2.r(false);
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarN = anm1.N("listening_activity_indicator_test_tag", qim0Var4);
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 2.0f, 1, qim0VarN);
            boolean zG = x340Var2.g(strK);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = new z9b0(strK, (byte) 8);
                x340Var2.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarZ, false, (iu30) objT);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 48);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
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
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            pw31 pw31Var2 = pw31.a;
            if (z) {
                x340Var2.i0(-1320014133);
                qim0 qim0VarR = u291.r(qim0Var4, fU0);
                Object objT2 = x340Var2.T();
                if (objT2 == m4cVar) {
                    objT2 = ecd0.h;
                    x340Var2.s0(objT2);
                }
                c0p1.b(pw31Var2.d(qim0VarR, (iu30) objT2), x340Var2, 0);
                cvx cvxVar2 = cbx.b(x340Var2).b;
                ab80.p(qim0Var4, 4.0f, x340Var2, false);
                pw31Var = pw31Var2;
                qim0Var3 = qim0Var4;
                x340Var = x340Var2;
                lee1Var = lee1Var2;
            } else if (z2 && (((irt0) trt0Var).a instanceof grt0)) {
                x340Var2.i0(-1319715169);
                urx urxVar = urx.c;
                qim0 qim0VarR2 = u291.r(qim0Var4, fU0);
                Object objT3 = x340Var2.T();
                if (objT3 == m4cVar) {
                    objT3 = ecd0.i;
                    x340Var2.s0(objT3);
                }
                x340Var = x340Var2;
                pw31Var = pw31Var2;
                lee1Var = lee1Var2;
                qim0Var3 = qim0Var4;
                w0h1.a(urxVar, isl.a, anm1.N("listening_activity_indicator_recent_icon_test_tag", pw31Var2.d(qim0VarR2, (iu30) objT3)), 0L, 0L, false, x340Var, urx.d | 48, 56);
                cvx cvxVar3 = cbx.b(x340Var).b;
                ab80.p(qim0Var3, 4.0f, x340Var, false);
            } else {
                pw31Var = pw31Var2;
                qim0Var3 = qim0Var4;
                x340Var = x340Var2;
                lee1Var = lee1Var2;
                x340Var.i0(-1319338271);
                x340Var.r(false);
            }
            lee1 lee1Var3 = lee1Var;
            x340Var2 = x340Var;
            pw31 pw31Var3 = pw31Var;
            uwo1.e(str2, pw31Var.c(qim0Var3), lee1Var3, j2, null, null, 2, false, new cjc0(1), 0, null, x340Var2, ((i2 >> 6) & 14) | 1572864, 0, 1712);
            uwo1.e(" – ", pw31Var3.c(qim0Var3), lee1Var3, j2, null, null, 0, false, new cjc0(1), 0, null, x340Var2, 6, 0, 1776);
            uwo1.e(str, pw31Var3.c(pw31Var3.a(1.0f, qim0Var3, false)), lee1Var3, j2, null, null, 2, false, new cjc0(1), 0, null, x340Var2, (i3 & 14) | 1572864, 0, 1712);
            irt0 irt0Var2 = z2 ? (irt0) trt0Var : null;
            hrt0 hrt0Var2 = irt0Var2 != null ? irt0Var2.a : null;
            frt0 frt0Var2 = hrt0Var2 instanceof frt0 ? (frt0) hrt0Var2 : null;
            String str3 = frt0Var2 != null ? frt0Var2.a : null;
            if (str3 == null) {
                x340Var2.i0(-1318688295);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1318688294);
                uwo1.e(" • ", pw31Var3.c(qim0Var3), lee1Var3, j2, null, null, 0, false, new cjc0(1), 0, null, x340Var2, 6, 0, 1776);
                uwo1.e(str3, anm1.N("listening_activity_indicator_last_played_test_tag", pw31Var3.c(qim0Var3)), lee1Var3, j2, null, null, 2, false, new cjc0(1), 0, null, x340Var2, 1572864, 0, 1712);
                x340Var2.r(false);
            }
            x340Var2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var2.v();
        if (h311VarV != null) {
            h311VarV.d = new cb60(i, (Object) trt0Var, (Object) str, (Object) str2, (Object) qim0Var2, (byte) 22);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0086  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void g0(HashMap map, String str, String str2) {
        List listX;
        switch (str.hashCode()) {
            case 3585:
                if (str.equals("r3")) {
                    str2 = (!nhc1.Y(str2, "m", false) && !nhc1.Y(str2, "b", false) && !nhc1.Y(str2, "ge", false)) ? "f" : "m";
                }
                break;
            case 3586:
                if (str.equals("r4")) {
                    str2 = cy30.o("[^a-z]+", str2, "");
                }
                break;
            case 3587:
                if (str.equals("r5")) {
                    str2 = cy30.o("[^a-z]+", str2, "");
                }
                break;
            case 3588:
                if (str.equals("r6") && ihc1.h0(str2, "-", false)) {
                    Pattern patternCompile = Pattern.compile("-");
                    ihc1.N0(0);
                    Matcher matcher = patternCompile.matcher(str2);
                    if (matcher.find()) {
                        ArrayList arrayList = new ArrayList(10);
                        int iEnd = 0;
                        do {
                            arrayList.add(str2.subSequence(iEnd, matcher.start()).toString());
                            iEnd = matcher.end();
                        } while (matcher.find());
                        arrayList.add(str2.subSequence(iEnd, str2.length()).toString());
                        listX = arrayList;
                    } else {
                        listX = k4p1.x(str2.toString());
                    }
                    str2 = ((String[]) listX.toArray(new String[0]))[0];
                }
                break;
        }
        map.put(str, str2);
    }

    public static final void h(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1999780602);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        byte b2 = 3;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0Var2 = qim0Var;
            wkt0.a(zkt0.a, qim0Var2, (ksl) null, 0L, false, x340Var, ((i2 << 3) & 112) | 6, 28);
        } else {
            qim0Var2 = qim0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nws0(qim0Var2, i, b2);
        }
    }

    public static a8b0 h0(l1h1 l1h1Var, e8b0 e8b0Var) {
        if (e8b0Var instanceof gmh1) {
            return l1h1Var.f(1, (a8b0) e8b0Var);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(e8b0Var);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, e8b0Var.getClass(), sb));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0109  */
    /* JADX WARN: Code duplicated, block: B:102:0x0118  */
    /* JADX WARN: Code duplicated, block: B:104:0x014a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0159  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00da  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:96:0x0101  */
    /* JADX WARN: Code duplicated, block: B:98:0x0104  */
    public static final void i(String str, qim0 qim0Var, String str2, Brush brush, String str3, Function0 function0, float f, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        int i4;
        String str4;
        int i5;
        int i6;
        Brush brush2;
        int i7;
        float f2;
        boolean z;
        b0k b0kVar2;
        qim0 qim0Var3;
        String str5;
        Brush brush3;
        float f3;
        h311 h311VarV;
        qim0 qim0Var4;
        qim0 qim0Var5;
        float f4;
        String str6;
        Brush brush4;
        int i8;
        int i9;
        int i10;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1434963192);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                qim0Var2 = qim0Var;
                i3 |= b0kVar3.i(qim0Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    str4 = str2;
                    if (b0kVar3.g(str4)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        brush2 = brush;
                        if (b0kVar3.i(brush2)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    if ((i & 24576) == 0) {
                        if (b0kVar3.g(str3)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i3 |= i10;
                    }
                    if ((196608 & i) == 0) {
                        if (b0kVar3.i(function0)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((i & 1572864) == 0) {
                        if ((i2 & 64) == 0) {
                            f2 = f;
                            int i12 = b0kVar3.d(f2) ? 1048576 : 524288;
                            i3 |= i12;
                        } else {
                            f2 = f;
                        }
                        i3 |= i12;
                    } else {
                        f2 = f;
                    }
                    if ((12582912 & i) == 0) {
                        if (b0kVar3.i(j2iVar)) {
                            i8 = 8388608;
                        } else {
                            i8 = 4194304;
                        }
                        i3 |= i8;
                    }
                    if ((4793491 & i3) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i3 & 1, z)) {
                        b0kVar3.d0();
                        if ((i & 1) != 0 || b0kVar3.E()) {
                            if (i11 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i4 != 0) {
                                str4 = null;
                            }
                            if (i6 != 0) {
                                brush2 = null;
                            }
                            if ((i2 & 64) != 0) {
                                uwr uwrVar = cbx.a;
                                cvx cvxVar = cbx.b(b0kVar3).b;
                                i3 &= -3670017;
                                f4 = 12.0f;
                                qim0Var5 = qim0Var4;
                                str6 = str4;
                                brush4 = brush2;
                            } else {
                                qim0Var5 = qim0Var4;
                            }
                            b0kVar3.s();
                            b0kVar2 = b0kVar3;
                            j(str, qim0Var5, str6, brush4, str3, function0, apo.r(-605769672, new rz2(f4, j2iVar), b0kVar3), b0kVar2, (i3 & 14) | 1572864 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752));
                            f3 = f4;
                            qim0Var3 = qim0Var5;
                            str5 = str6;
                            brush3 = brush4;
                        } else {
                            b0kVar3.b0();
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            qim0Var5 = qim0Var2;
                        }
                        brush4 = brush2;
                        f4 = f2;
                        str6 = str4;
                        b0kVar3.s();
                        b0kVar2 = b0kVar3;
                        j(str, qim0Var5, str6, brush4, str3, function0, apo.r(-605769672, new rz2(f4, j2iVar), b0kVar3), b0kVar2, (i3 & 14) | 1572864 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752));
                        f3 = f4;
                        qim0Var3 = qim0Var5;
                        str5 = str6;
                        brush3 = brush4;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var3 = qim0Var2;
                        str5 = str4;
                        brush3 = brush2;
                        f3 = f2;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new k411(str, qim0Var3, str5, brush3, str3, function0, f3, j2iVar, i, i2);
                    }
                }
                i3 |= 3072;
                brush2 = brush;
                if ((i & 24576) == 0) {
                    if (b0kVar3.g(str3)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i3 |= i10;
                }
                if ((196608 & i) == 0) {
                    if (b0kVar3.i(function0)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i & 1572864) == 0) {
                    if ((i2 & 64) == 0) {
                        f2 = f;
                        if (b0kVar3.d(f2)) {
                        }
                        i3 |= i12;
                    } else {
                        f2 = f;
                    }
                    i3 |= i12;
                } else {
                    f2 = f;
                }
                if ((12582912 & i) == 0) {
                    if (b0kVar3.i(j2iVar)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                if ((4793491 & i3) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i3 & 1, z)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            str4 = null;
                        }
                        if (i6 != 0) {
                            brush2 = null;
                        }
                        if ((i2 & 64) != 0) {
                            uwr uwrVar2 = cbx.a;
                            cvx cvxVar2 = cbx.b(b0kVar3).b;
                            i3 &= -3670017;
                            f4 = 12.0f;
                            qim0Var5 = qim0Var4;
                            str6 = str4;
                            brush4 = brush2;
                        } else {
                            qim0Var5 = qim0Var4;
                            brush4 = brush2;
                            f4 = f2;
                            str6 = str4;
                        }
                    } else {
                        if (i11 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            str4 = null;
                        }
                        if (i6 != 0) {
                            brush2 = null;
                        }
                        if ((i2 & 64) != 0) {
                            uwr uwrVar3 = cbx.a;
                            cvx cvxVar3 = cbx.b(b0kVar3).b;
                            i3 &= -3670017;
                            f4 = 12.0f;
                            qim0Var5 = qim0Var4;
                            str6 = str4;
                            brush4 = brush2;
                        } else {
                            qim0Var5 = qim0Var4;
                            brush4 = brush2;
                            f4 = f2;
                            str6 = str4;
                        }
                    }
                    b0kVar3.s();
                    b0kVar2 = b0kVar3;
                    j(str, qim0Var5, str6, brush4, str3, function0, apo.r(-605769672, new rz2(f4, j2iVar), b0kVar3), b0kVar2, (i3 & 14) | 1572864 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752));
                    f3 = f4;
                    qim0Var3 = qim0Var5;
                    str5 = str6;
                    brush3 = brush4;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    str5 = str4;
                    brush3 = brush2;
                    f3 = f2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new k411(str, qim0Var3, str5, brush3, str3, function0, f3, j2iVar, i, i2);
                }
            }
            i3 |= 384;
            str4 = str2;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    brush2 = brush;
                    if (b0kVar3.i(brush2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if (b0kVar3.g(str3)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i3 |= i10;
                }
                if ((196608 & i) == 0) {
                    if (b0kVar3.i(function0)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i & 1572864) == 0) {
                    if ((i2 & 64) == 0) {
                        f2 = f;
                        if (b0kVar3.d(f2)) {
                        }
                        i3 |= i12;
                    } else {
                        f2 = f;
                    }
                    i3 |= i12;
                } else {
                    f2 = f;
                }
                if ((12582912 & i) == 0) {
                    if (b0kVar3.i(j2iVar)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                if ((4793491 & i3) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i3 & 1, z)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            str4 = null;
                        }
                        if (i6 != 0) {
                            brush2 = null;
                        }
                        if ((i2 & 64) != 0) {
                            uwr uwrVar4 = cbx.a;
                            cvx cvxVar4 = cbx.b(b0kVar3).b;
                            i3 &= -3670017;
                            f4 = 12.0f;
                            qim0Var5 = qim0Var4;
                            str6 = str4;
                            brush4 = brush2;
                        } else {
                            qim0Var5 = qim0Var4;
                            brush4 = brush2;
                            f4 = f2;
                            str6 = str4;
                        }
                    } else {
                        if (i11 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            str4 = null;
                        }
                        if (i6 != 0) {
                            brush2 = null;
                        }
                        if ((i2 & 64) != 0) {
                            uwr uwrVar5 = cbx.a;
                            cvx cvxVar5 = cbx.b(b0kVar3).b;
                            i3 &= -3670017;
                            f4 = 12.0f;
                            qim0Var5 = qim0Var4;
                            str6 = str4;
                            brush4 = brush2;
                        } else {
                            qim0Var5 = qim0Var4;
                            brush4 = brush2;
                            f4 = f2;
                            str6 = str4;
                        }
                    }
                    b0kVar3.s();
                    b0kVar2 = b0kVar3;
                    j(str, qim0Var5, str6, brush4, str3, function0, apo.r(-605769672, new rz2(f4, j2iVar), b0kVar3), b0kVar2, (i3 & 14) | 1572864 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752));
                    f3 = f4;
                    qim0Var3 = qim0Var5;
                    str5 = str6;
                    brush3 = brush4;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    str5 = str4;
                    brush3 = brush2;
                    f3 = f2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new k411(str, qim0Var3, str5, brush3, str3, function0, f3, j2iVar, i, i2);
                }
            }
            i3 |= 3072;
            brush2 = brush;
            if ((i & 24576) == 0) {
                if (b0kVar3.g(str3)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i3 |= i10;
            }
            if ((196608 & i) == 0) {
                if (b0kVar3.i(function0)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((i & 1572864) == 0) {
                if ((i2 & 64) == 0) {
                    f2 = f;
                    if (b0kVar3.d(f2)) {
                    }
                    i3 |= i12;
                } else {
                    f2 = f;
                }
                i3 |= i12;
            } else {
                f2 = f;
            }
            if ((12582912 & i) == 0) {
                if (b0kVar3.i(j2iVar)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i3 |= i8;
            }
            if ((4793491 & i3) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        str4 = null;
                    }
                    if (i6 != 0) {
                        brush2 = null;
                    }
                    if ((i2 & 64) != 0) {
                        uwr uwrVar6 = cbx.a;
                        cvx cvxVar6 = cbx.b(b0kVar3).b;
                        i3 &= -3670017;
                        f4 = 12.0f;
                        qim0Var5 = qim0Var4;
                        str6 = str4;
                        brush4 = brush2;
                    } else {
                        qim0Var5 = qim0Var4;
                        brush4 = brush2;
                        f4 = f2;
                        str6 = str4;
                    }
                } else {
                    if (i11 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        str4 = null;
                    }
                    if (i6 != 0) {
                        brush2 = null;
                    }
                    if ((i2 & 64) != 0) {
                        uwr uwrVar7 = cbx.a;
                        cvx cvxVar7 = cbx.b(b0kVar3).b;
                        i3 &= -3670017;
                        f4 = 12.0f;
                        qim0Var5 = qim0Var4;
                        str6 = str4;
                        brush4 = brush2;
                    } else {
                        qim0Var5 = qim0Var4;
                        brush4 = brush2;
                        f4 = f2;
                        str6 = str4;
                    }
                }
                b0kVar3.s();
                b0kVar2 = b0kVar3;
                j(str, qim0Var5, str6, brush4, str3, function0, apo.r(-605769672, new rz2(f4, j2iVar), b0kVar3), b0kVar2, (i3 & 14) | 1572864 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752));
                f3 = f4;
                qim0Var3 = qim0Var5;
                str5 = str6;
                brush3 = brush4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                str5 = str4;
                brush3 = brush2;
                f3 = f2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new k411(str, qim0Var3, str5, brush3, str3, function0, f3, j2iVar, i, i2);
            }
        }
        i3 |= 48;
        qim0Var2 = qim0Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                str4 = str2;
                if (b0kVar3.g(str4)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    brush2 = brush;
                    if (b0kVar3.i(brush2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if (b0kVar3.g(str3)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i3 |= i10;
                }
                if ((196608 & i) == 0) {
                    if (b0kVar3.i(function0)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i & 1572864) == 0) {
                    if ((i2 & 64) == 0) {
                        f2 = f;
                        if (b0kVar3.d(f2)) {
                        }
                        i3 |= i12;
                    } else {
                        f2 = f;
                    }
                    i3 |= i12;
                } else {
                    f2 = f;
                }
                if ((12582912 & i) == 0) {
                    if (b0kVar3.i(j2iVar)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                if ((4793491 & i3) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i3 & 1, z)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            str4 = null;
                        }
                        if (i6 != 0) {
                            brush2 = null;
                        }
                        if ((i2 & 64) != 0) {
                            uwr uwrVar8 = cbx.a;
                            cvx cvxVar8 = cbx.b(b0kVar3).b;
                            i3 &= -3670017;
                            f4 = 12.0f;
                            qim0Var5 = qim0Var4;
                            str6 = str4;
                            brush4 = brush2;
                        } else {
                            qim0Var5 = qim0Var4;
                            brush4 = brush2;
                            f4 = f2;
                            str6 = str4;
                        }
                    } else {
                        if (i11 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            str4 = null;
                        }
                        if (i6 != 0) {
                            brush2 = null;
                        }
                        if ((i2 & 64) != 0) {
                            uwr uwrVar9 = cbx.a;
                            cvx cvxVar9 = cbx.b(b0kVar3).b;
                            i3 &= -3670017;
                            f4 = 12.0f;
                            qim0Var5 = qim0Var4;
                            str6 = str4;
                            brush4 = brush2;
                        } else {
                            qim0Var5 = qim0Var4;
                            brush4 = brush2;
                            f4 = f2;
                            str6 = str4;
                        }
                    }
                    b0kVar3.s();
                    b0kVar2 = b0kVar3;
                    j(str, qim0Var5, str6, brush4, str3, function0, apo.r(-605769672, new rz2(f4, j2iVar), b0kVar3), b0kVar2, (i3 & 14) | 1572864 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752));
                    f3 = f4;
                    qim0Var3 = qim0Var5;
                    str5 = str6;
                    brush3 = brush4;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    str5 = str4;
                    brush3 = brush2;
                    f3 = f2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new k411(str, qim0Var3, str5, brush3, str3, function0, f3, j2iVar, i, i2);
                }
            }
            i3 |= 3072;
            brush2 = brush;
            if ((i & 24576) == 0) {
                if (b0kVar3.g(str3)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i3 |= i10;
            }
            if ((196608 & i) == 0) {
                if (b0kVar3.i(function0)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((i & 1572864) == 0) {
                if ((i2 & 64) == 0) {
                    f2 = f;
                    if (b0kVar3.d(f2)) {
                    }
                    i3 |= i12;
                } else {
                    f2 = f;
                }
                i3 |= i12;
            } else {
                f2 = f;
            }
            if ((12582912 & i) == 0) {
                if (b0kVar3.i(j2iVar)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i3 |= i8;
            }
            if ((4793491 & i3) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        str4 = null;
                    }
                    if (i6 != 0) {
                        brush2 = null;
                    }
                    if ((i2 & 64) != 0) {
                        uwr uwrVar10 = cbx.a;
                        cvx cvxVar10 = cbx.b(b0kVar3).b;
                        i3 &= -3670017;
                        f4 = 12.0f;
                        qim0Var5 = qim0Var4;
                        str6 = str4;
                        brush4 = brush2;
                    } else {
                        qim0Var5 = qim0Var4;
                        brush4 = brush2;
                        f4 = f2;
                        str6 = str4;
                    }
                } else {
                    if (i11 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        str4 = null;
                    }
                    if (i6 != 0) {
                        brush2 = null;
                    }
                    if ((i2 & 64) != 0) {
                        uwr uwrVar11 = cbx.a;
                        cvx cvxVar11 = cbx.b(b0kVar3).b;
                        i3 &= -3670017;
                        f4 = 12.0f;
                        qim0Var5 = qim0Var4;
                        str6 = str4;
                        brush4 = brush2;
                    } else {
                        qim0Var5 = qim0Var4;
                        brush4 = brush2;
                        f4 = f2;
                        str6 = str4;
                    }
                }
                b0kVar3.s();
                b0kVar2 = b0kVar3;
                j(str, qim0Var5, str6, brush4, str3, function0, apo.r(-605769672, new rz2(f4, j2iVar), b0kVar3), b0kVar2, (i3 & 14) | 1572864 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752));
                f3 = f4;
                qim0Var3 = qim0Var5;
                str5 = str6;
                brush3 = brush4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                str5 = str4;
                brush3 = brush2;
                f3 = f2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new k411(str, qim0Var3, str5, brush3, str3, function0, f3, j2iVar, i, i2);
            }
        }
        i3 |= 384;
        str4 = str2;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                brush2 = brush;
                if (b0kVar3.i(brush2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i & 24576) == 0) {
                if (b0kVar3.g(str3)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i3 |= i10;
            }
            if ((196608 & i) == 0) {
                if (b0kVar3.i(function0)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((i & 1572864) == 0) {
                if ((i2 & 64) == 0) {
                    f2 = f;
                    if (b0kVar3.d(f2)) {
                    }
                    i3 |= i12;
                } else {
                    f2 = f;
                }
                i3 |= i12;
            } else {
                f2 = f;
            }
            if ((12582912 & i) == 0) {
                if (b0kVar3.i(j2iVar)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i3 |= i8;
            }
            if ((4793491 & i3) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        str4 = null;
                    }
                    if (i6 != 0) {
                        brush2 = null;
                    }
                    if ((i2 & 64) != 0) {
                        uwr uwrVar12 = cbx.a;
                        cvx cvxVar12 = cbx.b(b0kVar3).b;
                        i3 &= -3670017;
                        f4 = 12.0f;
                        qim0Var5 = qim0Var4;
                        str6 = str4;
                        brush4 = brush2;
                    } else {
                        qim0Var5 = qim0Var4;
                        brush4 = brush2;
                        f4 = f2;
                        str6 = str4;
                    }
                } else {
                    if (i11 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        str4 = null;
                    }
                    if (i6 != 0) {
                        brush2 = null;
                    }
                    if ((i2 & 64) != 0) {
                        uwr uwrVar13 = cbx.a;
                        cvx cvxVar13 = cbx.b(b0kVar3).b;
                        i3 &= -3670017;
                        f4 = 12.0f;
                        qim0Var5 = qim0Var4;
                        str6 = str4;
                        brush4 = brush2;
                    } else {
                        qim0Var5 = qim0Var4;
                        brush4 = brush2;
                        f4 = f2;
                        str6 = str4;
                    }
                }
                b0kVar3.s();
                b0kVar2 = b0kVar3;
                j(str, qim0Var5, str6, brush4, str3, function0, apo.r(-605769672, new rz2(f4, j2iVar), b0kVar3), b0kVar2, (i3 & 14) | 1572864 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752));
                f3 = f4;
                qim0Var3 = qim0Var5;
                str5 = str6;
                brush3 = brush4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                str5 = str4;
                brush3 = brush2;
                f3 = f2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new k411(str, qim0Var3, str5, brush3, str3, function0, f3, j2iVar, i, i2);
            }
        }
        i3 |= 3072;
        brush2 = brush;
        if ((i & 24576) == 0) {
            if (b0kVar3.g(str3)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i3 |= i10;
        }
        if ((196608 & i) == 0) {
            if (b0kVar3.i(function0)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        if ((i & 1572864) == 0) {
            if ((i2 & 64) == 0) {
                f2 = f;
                if (b0kVar3.d(f2)) {
                }
                i3 |= i12;
            } else {
                f2 = f;
            }
            i3 |= i12;
        } else {
            f2 = f;
        }
        if ((12582912 & i) == 0) {
            if (b0kVar3.i(j2iVar)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i3 |= i8;
        }
        if ((4793491 & i3) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i3 & 1, z)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i4 != 0) {
                    str4 = null;
                }
                if (i6 != 0) {
                    brush2 = null;
                }
                if ((i2 & 64) != 0) {
                    uwr uwrVar14 = cbx.a;
                    cvx cvxVar14 = cbx.b(b0kVar3).b;
                    i3 &= -3670017;
                    f4 = 12.0f;
                    qim0Var5 = qim0Var4;
                    str6 = str4;
                    brush4 = brush2;
                } else {
                    qim0Var5 = qim0Var4;
                    brush4 = brush2;
                    f4 = f2;
                    str6 = str4;
                }
            } else {
                if (i11 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i4 != 0) {
                    str4 = null;
                }
                if (i6 != 0) {
                    brush2 = null;
                }
                if ((i2 & 64) != 0) {
                    uwr uwrVar15 = cbx.a;
                    cvx cvxVar15 = cbx.b(b0kVar3).b;
                    i3 &= -3670017;
                    f4 = 12.0f;
                    qim0Var5 = qim0Var4;
                    str6 = str4;
                    brush4 = brush2;
                } else {
                    qim0Var5 = qim0Var4;
                    brush4 = brush2;
                    f4 = f2;
                    str6 = str4;
                }
            }
            b0kVar3.s();
            b0kVar2 = b0kVar3;
            j(str, qim0Var5, str6, brush4, str3, function0, apo.r(-605769672, new rz2(f4, j2iVar), b0kVar3), b0kVar2, (i3 & 14) | 1572864 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752));
            f3 = f4;
            qim0Var3 = qim0Var5;
            str5 = str6;
            brush3 = brush4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
            str5 = str4;
            brush3 = brush2;
            f3 = f2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new k411(str, qim0Var3, str5, brush3, str3, function0, f3, j2iVar, i, i2);
        }
    }

    public static void i0(Activity activity) {
        View viewK;
        int iHashCode = activity.hashCode();
        HashMap map = null;
        if (!dhn.a.contains(koj0.class)) {
            try {
                map = koj0.e;
            } catch (Throwable th) {
                dhn.a(koj0.class, th);
            }
        }
        Integer numValueOf = Integer.valueOf(iHashCode);
        Object koj0Var = map.get(numValueOf);
        if (koj0Var == null) {
            koj0Var = new koj0(activity);
            map.put(numValueOf, koj0Var);
        }
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener = (koj0) koj0Var;
        Set set = dhn.a;
        if (set.contains(koj0.class)) {
            return;
        }
        try {
            if (set.contains(onGlobalFocusChangeListener)) {
                return;
            }
            try {
                if (!((koj0) onGlobalFocusChangeListener).d.getAndSet(true) && (viewK = jm5.k((Activity) ((koj0) onGlobalFocusChangeListener).c.get())) != null) {
                    ViewTreeObserver viewTreeObserver = viewK.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
                        return;
                    }
                    return;
                    dhn.a(koj0.class, th);
                }
            } catch (Throwable th2) {
                dhn.a(onGlobalFocusChangeListener, th2);
            }
        } catch (Throwable th3) {
            dhn.a(koj0.class, th3);
        }
    }

    public static final void j(String str, qim0 qim0Var, String str2, Brush brush, String str3, Function0 function0, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        Function0 function1;
        qim0 qim0VarF;
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1303798726);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(brush) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(str3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            function1 = function0;
            i2 |= x340Var.i(function1) ? 131072 : 65536;
        } else {
            function1 = function0;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(j2iVar) ? 1048576 : 524288;
        }
        int i4 = i2;
        if (x340Var.Y(i4 & 1, (599187 & i4) != 599186)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(16.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarF2 = u291.f(qim0Var, 1.0f);
            int i5 = i4 & 14;
            boolean z = (i5 == 4) | ((i4 & 896) == 256);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new os(str, str2, (byte) 25);
                x340Var.s0(objT);
            }
            qim0 qim0VarQ = i1p1.q(s161.b(qim0VarF2, false, (iu30) objT), cr31VarB);
            nim0 nim0Var = nim0.a;
            if (brush != null) {
                x340Var.i0(-1179850312);
                x340Var.r(false);
                qim0VarF = dug.e(nim0Var, brush, cr31VarB, 0.0f, 4);
                i3 = 0;
            } else {
                x340Var.i0(-1179847893);
                qim0VarF = dug.f(nim0Var, cbx.a(x340Var).d.b, cr31VarB);
                i3 = 0;
                x340Var.r(false);
            }
            qim0 qim0VarZ = uyn1.z(0.0f, 16.0f, 1, qim0VarQ.then(qim0VarF));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, i3);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarZ2 = uyn1.z(16.0f, 0.0f, 2, nim0Var);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ2);
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
            int i6 = i4 >> 6;
            d4o1.a(i5 | ((i4 >> 3) & 112) | (i6 & 896) | (i6 & 7168), str, str2, str3, function1, x340Var);
            x340Var.r(true);
            dv20.l((i4 >> 18) & 14, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kt3(str, qim0Var, str2, brush, str3, function0, j2iVar, i);
        }
    }

    public static dfg j0(efg efgVar, qh31 qh31Var) {
        if (qh31Var instanceof qx81) {
            a8b0 a8b0Var = (a8b0) qh31Var;
            return new dfg(efgVar, new l1h1(j0h1.b.i(a8b0Var.t0(), a8b0Var.r0())));
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(qh31Var);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, qh31Var.getClass(), sb));
        return null;
    }

    public static final void k(ma71 ma71Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        m4c m4cVar = fkj0.X;
        String str = ma71Var.b;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1964229482);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(ma71Var) : b0kVar3.i(ma71Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(function0) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zG = b0kVar3.g(ma71Var.a);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                objT = v8r.q(Boolean.TRUE);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            qim0 qim0VarN = anm1.N("share.media.container.image", qim0Var);
            boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
            qim0 qim0VarL0 = nim0.a;
            if (zBooleanValue) {
                qim0VarL0 = cwl1.l0(qim0VarL0, 0L, (hw61) null, 15);
            }
            qim0 qim0VarThen = qim0VarN.then(qim0VarL0);
            Uri uri = ma71Var.a;
            boolean zI = b0kVar3.i(ven0Var);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new r9y0(ven0Var, (byte) 22);
                b0kVar3.s0(objT2);
            }
            iu30 iu30Var = (iu30) objT2;
            boolean zI2 = ((i2 & 896) == 256) | b0kVar3.i(ven0Var);
            Object objT3 = b0kVar3.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new t8s(function0, ven0Var, (byte) 1);
                b0kVar3.s0(objT3);
            }
            iu30 iu30Var2 = (iu30) objT3;
            boolean zI3 = b0kVar3.i(ven0Var);
            Object objT4 = b0kVar3.T();
            if (zI3 || objT4 == m4cVar) {
                objT4 = new r9y0(ven0Var, (byte) 23);
                b0kVar3.s0(objT4);
            }
            b0kVar2 = b0kVar3;
            eso1.h(oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, true, false, (j6m) null, iu30Var, iu30Var2, (iu30) objT4, 0L, b0kVar2, 100663296, 0, 102142), (!ihc1.y0(str) ? str : null) != null ? new jsl(str) : isl.a, qim0VarThen, (p3v) null, (zvx) null, (ecx) null, mif1.S0, (tl3) null, (ColorFilter) null, b0kVar2, 224256, 384);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kk31(ma71Var, qim0Var, function0, false, i, (byte) 17);
        }
    }

    public static Collection k0(i0h1 i0h1Var) {
        if (i0h1Var instanceof h0h1) {
            return ((h0h1) i0h1Var).d();
        }
        StringBuilder sbJ = ktd.j("ClassicTypeSystemContext couldn't handle: ", i0h1Var, ", ");
        hhg1.f(us71.f(rc11.a, i0h1Var.getClass(), sbJ));
        return null;
    }

    public static boolean l(i0h1 i0h1Var, i0h1 i0h1Var2) {
        if (!(i0h1Var instanceof h0h1)) {
            StringBuilder sbJ = ktd.j("ClassicTypeSystemContext couldn't handle: ", i0h1Var, ", ");
            hhg1.f(us71.f(rc11.a, i0h1Var.getClass(), sbJ));
            return false;
        }
        if (i0h1Var2 instanceof h0h1) {
            return i0h1Var.equals(i0h1Var2);
        }
        StringBuilder sbJ2 = ktd.j("ClassicTypeSystemContext couldn't handle: ", i0h1Var2, ", ");
        hhg1.f(us71.f(rc11.a, i0h1Var2.getClass(), sbJ2));
        return false;
    }

    public static final CharSequence l0(CharSequence charSequence) {
        if (charSequence.length() <= 5000) {
            return charSequence;
        }
        return (Character.isHighSurrogate(charSequence.charAt(4999)) && Character.isLowSurrogate(charSequence.charAt(5000))) ? ihc1.b1(4999, charSequence) : ihc1.b1(5000, charSequence);
    }

    public static int m(e8b0 e8b0Var) {
        if (e8b0Var instanceof a8b0) {
            return ((a8b0) e8b0Var).r0().size();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(e8b0Var);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, e8b0Var.getClass(), sb));
        return 0;
    }

    public static x8o0 m0(wod wodVar) {
        if (wodVar instanceof w8o0) {
            return ((w8o0) wodVar).c;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(wodVar);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, wodVar.getClass(), sb));
        return null;
    }

    public static c0h1 n(qh31 qh31Var) {
        if (qh31Var instanceof qx81) {
            return (c0h1) qh31Var;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(qh31Var);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, qh31Var.getClass(), sb));
        return null;
    }

    public static h0h1 n0(qh31 qh31Var) {
        if (qh31Var instanceof qx81) {
            return ((qx81) qh31Var).t0();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(qh31Var);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, qh31Var.getClass(), sb));
        return null;
    }

    public static wod o(efg efgVar, sx81 sx81Var) {
        if (sx81Var instanceof qx81) {
            if (sx81Var instanceof ux81) {
                return efgVar.S(((ux81) sx81Var).b);
            }
            if (sx81Var instanceof w8o0) {
                return (w8o0) sx81Var;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(sx81Var);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, sx81Var.getClass(), sb));
        return null;
    }

    public static qx81 o0(gq20 gq20Var) {
        if (gq20Var instanceof dq20) {
            return ((dq20) gq20Var).c;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(gq20Var);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, gq20Var.getClass(), sb));
        return null;
    }

    public static g4t p(qh31 qh31Var) {
        if (qh31Var instanceof qx81) {
            if (qh31Var instanceof g4t) {
                return (g4t) qh31Var;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(qh31Var);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, qh31Var.getClass(), sb));
        return null;
    }

    public static e8b0 p0(efg efgVar, e8b0 e8b0Var) {
        if (e8b0Var instanceof qh31) {
            return efgVar.s((qh31) e8b0Var);
        }
        if (e8b0Var instanceof gq20) {
            gq20 gq20Var = (gq20) e8b0Var;
            return efgVar.i0(efgVar.s(efgVar.f(gq20Var)), efgVar.s(efgVar.g(gq20Var)));
        }
        eg.m("sealed");
        return null;
    }

    public static dq20 q(e8b0 e8b0Var) {
        if (e8b0Var instanceof a8b0) {
            dq20 dq20VarW0 = ((a8b0) e8b0Var).w0();
            if (dq20VarW0 instanceof dq20) {
                return dq20VarW0;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(e8b0Var);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, e8b0Var.getClass(), sb));
        return null;
    }

    public static qx81 q0(qh31 qh31Var, boolean z) {
        if (qh31Var instanceof qx81) {
            return ((qx81) qh31Var).A0(z);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(qh31Var);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, qh31Var.getClass(), sb));
        return null;
    }

    public static qx81 r(e8b0 e8b0Var) {
        if (e8b0Var instanceof a8b0) {
            qx81 qx81VarW0 = ((a8b0) e8b0Var).w0();
            if (qx81VarW0 instanceof qx81) {
                return qx81VarW0;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(e8b0Var);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, e8b0Var.getClass(), sb));
        return null;
    }

    public static f1h1 s(e8b0 e8b0Var) {
        if (e8b0Var instanceof a8b0) {
            return new f1h1(1, (a8b0) e8b0Var);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(e8b0Var);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, e8b0Var.getClass(), sb));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001d  */
    public static qx81 t(qh31 qh31Var) {
        ArrayList arrayList;
        f8b0 f8b0Var;
        if (!(qh31Var instanceof qx81)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(qh31Var);
            sb.append(", ");
            hhg1.f(us71.f(rc11.a, qh31Var.getClass(), sb));
            return null;
        }
        qx81 qx81Var = (qx81) qh31Var;
        if (qx81Var.r0().size() != qx81Var.t0().getParameters().size()) {
            arrayList = null;
        } else {
            List listR0 = qx81Var.r0();
            List list = listR0;
            if ((list instanceof Collection) && list.isEmpty()) {
                arrayList = null;
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((e1h1) it.next()).a() != 1) {
                        ArrayList<mmr0> arrayListV1 = o7h.v1(list, qx81Var.t0().getParameters());
                        arrayList = new ArrayList(q7h.U(arrayListV1, 10));
                        for (mmr0 mmr0Var : arrayListV1) {
                            f1h1 f1h1Var = (e1h1) mmr0Var.a;
                            y0h1 y0h1Var = (y0h1) mmr0Var.b;
                            if (f1h1Var.a() != 1) {
                                gmh1 gmh1VarW0 = (f1h1Var.c() || f1h1Var.a() != 2) ? null : f1h1Var.b().w0();
                                y0h1Var.getClass();
                                f1h1Var = new f1h1(1, new w8o0(1, new x8o0(f1h1Var, (rht) null, y0h1Var, 6), gmh1VarW0, (e0h1) null, false, 56));
                            }
                            arrayList.add(f1h1Var);
                        }
                        l1h1 l1h1Var = new l1h1(j0h1.b.i(qx81Var.t0(), arrayList));
                        int size = listR0.size();
                        for (int i = 0; i < size; i++) {
                            e1h1 e1h1Var = (e1h1) listR0.get(i);
                            e1h1 e1h1Var2 = (e1h1) arrayList.get(i);
                            if (e1h1Var.a() != 1) {
                                List upperBounds = ((y0h1) qx81Var.t0().getParameters().get(i)).getUpperBounds();
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it2 = upperBounds.iterator();
                                while (true) {
                                    boolean zHasNext = it2.hasNext();
                                    f8b0Var = f8b0.b;
                                    if (!zHasNext) {
                                        break;
                                    }
                                    arrayList2.add(f8b0Var.v(l1h1Var.f(1, (a8b0) it2.next()).w0()));
                                }
                                if (!e1h1Var.c() && e1h1Var.a() == 3) {
                                    arrayList2.add(f8b0Var.v(e1h1Var.b().w0()));
                                }
                                x8o0 x8o0Var = e1h1Var2.b().c;
                                x8o0Var.getClass();
                                x8o0Var.b = new rht(arrayList2, (byte) 2);
                            }
                        }
                    }
                }
                arrayList = null;
            }
        }
        if (arrayList != null) {
            return y3o1.i0(arrayList, qx81Var.s0(), qx81Var.t0(), qx81Var.u0());
        }
        return null;
    }

    public static int u(wod wodVar) {
        if (wodVar instanceof w8o0) {
            return ((w8o0) wodVar).b;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(wodVar);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, wodVar.getClass(), sb));
        return 0;
    }

    public static gmh1 v(efg efgVar, qh31 qh31Var, qh31 qh31Var2) {
        if (!(qh31Var instanceof qx81)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(efgVar);
            sb.append(", ");
            hhg1.f(us71.f(rc11.a, efgVar.getClass(), sb));
            return null;
        }
        if (qh31Var2 instanceof qx81) {
            return y3o1.Z((qx81) qh31Var, (qx81) qh31Var2);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(efgVar);
        sb2.append(", ");
        hhg1.f(us71.f(rc11.a, efgVar.getClass(), sb2));
        return null;
    }

    public static final String w(long j, b0k b0kVar) {
        long j2 = (j / 1000) / 60;
        long j3 = j2 / 60;
        long j4 = j2 % 60;
        if (j3 > 0 && j4 > 0) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(1745955818);
            String strN0 = cwl1.n0(2131958349, new Object[]{Long.valueOf(j3), Long.valueOf(j4)}, x340Var);
            x340Var.r(false);
            return strN0;
        }
        if (j3 > 0) {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(1745959097);
            String strN1 = cwl1.n0(2131958348, new Object[]{Long.valueOf(j3)}, x340Var2);
            x340Var2.r(false);
            return strN1;
        }
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.i0(1745961693);
        String strN2 = cwl1.n0(2131958350, new Object[]{Long.valueOf(j4)}, x340Var3);
        x340Var3.r(false);
        return strN2;
    }

    public static d0h1 x(e8b0 e8b0Var, int i) {
        if (e8b0Var instanceof a8b0) {
            return (d0h1) ((a8b0) e8b0Var).r0().get(i);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(e8b0Var);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, e8b0Var.getClass(), sb));
        return null;
    }

    public static List y(e8b0 e8b0Var) {
        if (e8b0Var instanceof a8b0) {
            return ((a8b0) e8b0Var).r0();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(e8b0Var);
        sb.append(", ");
        hhg1.f(us71.f(rc11.a, e8b0Var.getClass(), sb));
        return null;
    }

    public static a1h1 z(i0h1 i0h1Var, int i) {
        if (i0h1Var instanceof h0h1) {
            return (a1h1) ((h0h1) i0h1Var).getParameters().get(i);
        }
        StringBuilder sbJ = ktd.j("ClassicTypeSystemContext couldn't handle: ", i0h1Var, ", ");
        hhg1.f(us71.f(rc11.a, i0h1Var.getClass(), sbJ));
        return null;
    }
}
