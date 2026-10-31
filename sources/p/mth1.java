package p;

import android.content.Context;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.unit.TextUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class mth1 {
    public static final kn5 a = new kn5((byte) 19);
    public static b180 b;

    public static final String A(Context context, ggv ggvVar, iix0 iix0Var, long j, boolean z, boolean z2) {
        boolean z3 = iix0Var instanceof gix0;
        ngv ngvVar = ngv.f;
        if (z3) {
            ytw0 ytw0Var = jfv.b;
            gix0 gix0Var = (gix0) iix0Var;
            long jL0 = fdg1.l0(gix0Var.b - gix0Var.c, ngv.d);
            if (jfv.c(jL0, fdg1.k0(1, ngvVar)) < 0 && z) {
                return context.getString(2131958592, context.getString(2131958593));
            }
            if (!jfv.f(jL0, fdg1.k0(0, ngv.e))) {
                return context.getString(2131958592, x(ggvVar, jL0, jfv.c(jL0, fdg1.k0(1, ngvVar)) < 0));
            }
        } else {
            if (!(iix0Var instanceof hix0)) {
                eg.o();
                return null;
            }
            if (!z2 || !((hix0) iix0Var).a || z) {
                ytw0 ytw0Var2 = jfv.b;
                return x(ggvVar, j, jfv.c(j, fdg1.k0(1, ngvVar)) < 0);
            }
        }
        return null;
    }

    public static final xj61 B(hth1 hth1Var) {
        xj61 xj61Var = new xj61();
        String str = hth1Var.e;
        if (str != null) {
            xj61Var.add(new ksh1(str));
        }
        ith1 ith1Var = hth1Var.f;
        if (ith1Var != null && str != null) {
            xj61Var.add(new ish1(str, ith1Var.b));
        }
        return cwl1.j(xj61Var);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:20:0x0031 A[ORIG_RETURN, RETURN] */
    public static boolean C(rij0 rij0Var) {
        int i;
        if (!(rij0Var instanceof tpm0) && !(rij0Var instanceof rpm0)) {
            if (rij0Var instanceof upm0) {
                upm0 upm0Var = (upm0) rij0Var;
                if (upm0Var.a > 4294967295L || upm0Var.b > 4294967295L) {
                    if (rij0Var instanceof yeh0) {
                        return false;
                    }
                    i = ((yeh0) rij0Var).d;
                    if (i == 1 && i != 23) {
                        return false;
                    }
                }
            } else {
                if (rij0Var instanceof yeh0) {
                    return false;
                }
                i = ((yeh0) rij0Var).d;
                if (i == 1) {
                }
            }
        }
        return true;
    }

    public static final wzq D(syq syqVar, iu30 iu30Var) {
        return new wzq(syqVar, iu30Var);
    }

    public static final float E(iix0 iix0Var) {
        if (iix0Var instanceof gix0) {
            gix0 gix0Var = (gix0) iix0Var;
            long j = gix0Var.b;
            if (j != 0) {
                long j2 = gix0Var.c;
                if (j2 > j) {
                    j2 = j;
                }
                return j2 / j;
            }
        } else if (!(iix0Var instanceof hix0)) {
            eg.o();
            return 0.0f;
        }
        return 0.0f;
    }

    public static final boolean F(boolean z, t2p0 t2p0Var, Function0 function0) {
        if (z) {
            return t2p0Var.a().a.getValue() == s2p0.b;
        }
        return ((Boolean) function0.invoke()).booleanValue();
    }

    public static final void G(p811 p811Var, l811 l811Var, i0g0 i0g0Var, lbc0 lbc0Var, v5v v5vVar, float f) {
        p811Var.a = null;
        l811Var.a = true;
        float f2 = v5vVar.b;
        int i = v5vVar.a;
        float fO = ((f / 4.0f) / i) + yoi1.o(f2 / i, 0.0f, 1.0f);
        c7p0 c7p0Var = c7p0.b;
        c7p0 c7p0Var2 = fO > 0.5f ? c7p0Var : c7p0.a;
        i0g0Var.e = true;
        i0g0Var.f(new d0g0(c7p0Var2, true));
        i0g0Var.e = false;
        for (zyf0 zyf0Var : zyf0.h) {
            if (zyf0Var.a == c7p0Var2 && !zyf0Var.b) {
                i0g0.a(i0g0Var, zyf0Var, Float.valueOf(f), false, 4);
                if (c7p0Var2 == c7p0Var) {
                    lbc0Var.invoke(c7p0Var);
                    return;
                }
                return;
            }
        }
        bhn0.t("Collection contains no element matching the predicate.");
    }

    public static final ArrayList H(Collection collection) {
        return collection instanceof ArrayList ? (ArrayList) collection : new ArrayList(collection);
    }

    public static final void a(uda0 uda0Var, Function0 function0, Function0 function1, Function0 function2, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(79925931);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(uda0Var) : x340Var.i(uda0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function2) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
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
            mue1.g(uda0Var.e, function0, function1, x340Var, i2 & 1008);
            if (uda0Var.f) {
                x340Var.i0(-1808437201);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(nim0Var, 12.0f));
                j(function2, x340Var, (i2 >> 9) & 14);
                x340Var.r(false);
            } else {
                x340Var.i0(-1808296895);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nca0(i, uda0Var, function0, function1, function2, (byte) 1);
        }
    }

    public static final void b(u5i0 u5i0Var, String str, orp orpVar, qim0 qim0Var, boolean z, boolean z2, Function0 function0, b0k b0kVar, int i) {
        int i2;
        String str2;
        boolean z3;
        boolean z4;
        Object fmgVar;
        boolean z5;
        m4c m4cVar = fkj0.X;
        v5i0 v5i0Var = u5i0Var.a;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1172498968);
        if ((i & 6) == 0) {
            i2 = (b0kVar2.i(u5i0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= b0kVar2.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.i(orpVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar2.i(qim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z3 = z;
            i2 |= b0kVar2.h(z3) ? 16384 : 8192;
        } else {
            z3 = z;
        }
        if ((196608 & i) == 0) {
            z4 = z2;
            i2 |= b0kVar2.h(z4) ? 131072 : 65536;
        } else {
            z4 = z2;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar2.i(function0) ? 1048576 : 524288;
        }
        if (b0kVar2.Y(i2 & 1, (599187 & i2) != 599186)) {
            tbr0 tbr0VarC = ((cir0) b0kVar2.k(k2r0.a)).c();
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0Var);
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
            nko1.H(gfh0VarC, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            ven0 ven0VarS = v8r.s(function0, b0kVar2);
            boolean zG = b0kVar2.g(tbr0VarC);
            Object objT = b0kVar2.T();
            if (zG || objT == m4cVar) {
                bp9 bp9Var = new bp9(ven0VarS, (byte) 10);
                qq qqVar = (qq) orpVar.a.c;
                oai1 oai1Var = (oai1) ((y6i0) qqVar.a).k.get();
                c8o.l(oai1Var);
                y6i0 y6i0Var = (y6i0) qqVar.a;
                y6i0 y6i0Var2 = (y6i0) qqVar.a;
                f7i0 f7i0Var = (f7i0) y6i0Var.a.get();
                c8o.l(f7i0Var);
                imm1 imm1Var = new imm1((byte) 1);
                oj3 oj3Var = (oj3) y6i0Var2.n.get();
                c8o.l(oj3Var);
                dma1 dma1Var = (dma1) y6i0Var2.o.get();
                c8o.l(dma1Var);
                z5 = true;
                fmgVar = new fmg(oai1Var, f7i0Var, imm1Var, oj3Var, dma1Var, tbr0VarC, str2, bp9Var);
                b0kVar2.s0(fmgVar);
            } else {
                z5 = true;
                fmgVar = objT;
            }
            fmg fmgVar2 = (fmg) fmgVar;
            String str3 = u5i0Var.d;
            uvg1 uvg1Var = u5i0Var.e.a;
            n5f0 n5f0Var = new n5f0(uvg1Var.a, uvg1Var.b);
            List list = u5i0Var.b;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((oce1) v5i0Var.c.get(((Number) it.next()).intValue()));
            }
            cmg cmgVar = new cmg(n5f0Var, arrayList, v5i0Var.b);
            int i3 = u5i0Var.g;
            b0kVar2 = b0kVar2;
            otw.b(fmgVar2, new amg(str3, cmgVar, i3 == z5 ? z5 : false, z3, z4, i3 == 3 ? z5 : false), new joa0("create-clip-button"), (qim0) null, b0kVar2, 72, 8);
            b0kVar2.r(z5);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bw1(u5i0Var, str, orpVar, qim0Var, z, z2, function0, i);
        }
    }

    public static final void c(uda0 uda0Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, b0k b0kVar, int i) {
        int i2;
        Function0 function4;
        Function0 function5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1163459164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(uda0Var) : x340Var.i(uda0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function4 = function0;
            i2 |= x340Var.i(function4) ? 32 : 16;
        } else {
            function4 = function0;
        }
        if ((i & 384) == 0) {
            function5 = function1;
            i2 |= x340Var.i(function5) ? 256 : 128;
        } else {
            function5 = function1;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(function3) ? 16384 : 8192;
        }
        int i3 = 196608 & i;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            qim0 qim0VarH = l6o1.H(u291.f(nim0Var, 1.0f), l6o1.C(0, 0, 1, x340Var), false, 14);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarH);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(2.0f, 0.0f, 2, qim0VarP);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
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
            mue1.j(mqo1.A(uda0Var.g), null, uda0Var.f, function3, x340Var, ((i2 >> 3) & 7168) | 8, 2);
            mue1.f(mqo1.A(uda0Var.d), uda0Var.a, uda0Var.e, null, x340Var, 8);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            mue1.d(uda0Var.c, cwl1.n0(2131956968, new Object[]{uda0Var.b}, x340Var), null, x340Var, 8);
            op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.b));
            a(uda0Var, function4, function5, function2, x340Var, (i2 & 7168) | 8 | (i2 & 14) | (i2 & 112) | (i2 & 896));
            op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.d));
            mue1.h(0, x340Var, null, uda0Var.h);
            x0d.s(nim0Var, cbx.b(x340Var).b.a, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kyq(uda0Var, function0, function1, function2, function3, i);
        }
    }

    public static final void d(lzn0 lzn0Var, lik1 lik1Var, lik1 lik1Var2, v850 v850Var, lc20 lc20Var, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-742983554);
        int i2 = i | (x340Var.i(lzn0Var) ? 4 : 2) | (x340Var.g(lik1Var) ? 32 : 16) | (x340Var.g(lik1Var2) ? 256 : 128) | (x340Var.e(v850Var.ordinal()) ? 2048 : 1024) | (x340Var.g(lc20Var) ? 16384 : 8192) | (x340Var.i(function0) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            ujo1.c(l6o1.C(0, 0, 1, x340Var), t3k1.t(v850Var), apo.r(2031978153, new j750(function0, lik1Var, v850Var, lzn0Var, lik1Var2, lc20Var), x340Var), x340Var, 384);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j750(lzn0Var, lik1Var, lik1Var2, v850Var, lc20Var, function0, i);
        }
    }

    public static final void e(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1267825714);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            men1.e(cwl1.o0(x340Var, 2131956394), (qim0) null, 0.0f, x340Var, 0, 6);
            vvm1.f(cwl1.o0(x340Var, 2131956393), (qim0) null, (lee1) null, 0.0f, x340Var, 0, 14);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ns30(qim0Var, i, (byte) 5);
        }
    }

    public static final void f(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1442682058);
        int i2 = (b0kVar3.h(z) ? 4 : 2) | i | (b0kVar3.i(qim0Var) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0Var);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            if (z) {
                b0kVar3.i0(-1146507614);
                jlx jlxVar = jlx.c;
                tq60 tq60Var = new tq60(een.Q0);
                zov0 zov0Var = cbx.b(b0kVar3).g;
                b0kVar2 = b0kVar3;
                w0h1.a(jlxVar, isl.a, anm1.N("test_tag_graduation_confirmation_icon", u291.r(tq60Var, 64.0f)), 0L, 0L, false, b0kVar2, jlx.d | 48, 56);
                b0kVar2.r(false);
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.i0(-1146211626);
                b0kVar2.r(false);
            }
            men1.e(cwl1.o0(b0kVar2, 2131956399), (qim0) null, 0.0f, b0kVar2, 0, 6);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new uc0(z, qim0Var, i, (byte) 17);
        }
    }

    public static final void g(lzn0 lzn0Var, lik1 lik1Var, lik1 lik1Var2, boolean z, lc20 lc20Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(2019775033);
        int i2 = i | (b0kVar3.i(lzn0Var) ? 4 : 2) | (b0kVar3.g(lik1Var) ? 32 : 16) | (b0kVar3.g(lik1Var2) ? 256 : 128) | (b0kVar3.h(z) ? 2048 : 1024) | (b0kVar3.g(lc20Var) ? 16384 : 8192) | (b0kVar3.i(qim0Var) ? 131072 : 65536);
        if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
            boolean zI = ((i2 & 112) == 32) | ((57344 & i2) == 16384) | ((i2 & 896) == 256) | b0kVar3.i(lzn0Var);
            Object objT = b0kVar3.T();
            if (zI || objT == fkj0.X) {
                jzm jzmVar = new jzm(lc20Var, lik1Var, lik1Var2, lzn0Var, (byte) 20);
                b0kVar3.s0(jzmVar);
                objT = jzmVar;
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            idx idxVar = new idx(4);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            foo1.c(gbxVar, idxVar, anm1.N("test_tag_graduation_button", uyn1.B(qim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13)), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(505697784, new k750((byte) 0, z), b0kVar3), b0kVar2, 0, 48, 2040);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wr1(lzn0Var, lik1Var, lik1Var2, z, lc20Var, qim0Var, i, (byte) 9);
        }
    }

    public static final void h(zf11 zf11Var, iu30 iu30Var, Function0 function0, Function0 function1, vu30 vu30Var, iu30 iu30Var2, Function0 function2, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1014647931);
        int i2 = i | (x340Var.i(zf11Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024) | (x340Var.i(vu30Var) ? 16384 : 8192) | (x340Var.i(iu30Var2) ? 131072 : 65536) | (x340Var.i(function2) ? 1048576 : 524288);
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            nyx.a(0, (wux) null, apo.r(2099320526, new dwq0(zf11Var, iu30Var, iu30Var2, function2, function0, function1, vu30Var), x340Var), x340Var, 3072, 7);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dwq0(zf11Var, iu30Var, function0, function1, vu30Var, iu30Var2, function2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0083  */
    /* JADX WARN: Code duplicated, block: B:41:0x008a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:46:0x0121  */
    /* JADX WARN: Code duplicated, block: B:48:0x0130  */
    /* JADX WARN: Code duplicated, block: B:50:0x0135  */
    /* JADX WARN: Code duplicated, block: B:53:0x013e  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public static final void i(Integer num, int i, qim0 qim0Var, b0k b0kVar, int i2, int i3) {
        int i4;
        qim0 qim0Var2;
        boolean z;
        h311 h311VarV;
        qim0 qim0Var3;
        jw31 jw31VarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2036443344);
        if ((i2 & 6) == 0) {
            i4 = (x340Var.g(num) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var.e(l1d.C(i)) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 == 0) {
            if ((i2 & 384) == 0) {
                qim0Var2 = qim0Var;
                i4 |= x340Var.i(qim0Var2) ? 256 : 128;
            }
            if ((i4 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                qim0Var3 = nim0.a;
                if (i5 != 0) {
                    qim0Var2 = qim0Var3;
                }
                jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0Var2);
                hzj.A.getClass();
                if (x340Var.a != null) {
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
                zov0 zov0Var = cbx.b(x340Var).g;
                suo1.g(u291.r(qim0Var3, 12.0f), (String) null, apo.r(-521608281, new p4g0(i, (byte) 27), x340Var), x340Var, 384, 2);
                if (num != null) {
                    x340Var.i0(-2121869282);
                    op71.g(x340Var, u291.r(qim0Var3, 4.0f));
                    uwo1.e(f4i1.f("\u2066", cwl1.U(2131820928, num.intValue(), new Object[]{num}, x340Var), "\u2069 • "), (qim0) null, (lee1) null, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2038);
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-2121600202);
                    x340Var.r(false);
                }
                x340Var.r(true);
            } else {
                x340Var.b0();
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new e13(num, i, qim0Var2, i2, i3);
            }
        }
        i4 |= 384;
        qim0Var2 = qim0Var;
        if ((i4 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i4 & 1, z)) {
            qim0Var3 = nim0.a;
            if (i5 != 0) {
                qim0Var2 = qim0Var3;
            }
            jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0Var2);
            hzj.A.getClass();
            if (x340Var.a != null) {
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
            uwr uwrVar2 = cbx.a;
            zov0 zov0Var2 = cbx.b(x340Var).g;
            suo1.g(u291.r(qim0Var3, 12.0f), (String) null, apo.r(-521608281, new p4g0(i, (byte) 27), x340Var), x340Var, 384, 2);
            if (num != null) {
                x340Var.i0(-2121869282);
                op71.g(x340Var, u291.r(qim0Var3, 4.0f));
                uwo1.e(f4i1.f("\u2066", cwl1.U(2131820928, num.intValue(), new Object[]{num}, x340Var), "\u2069 • "), (qim0) null, (lee1) null, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2038);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(-2121600202);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e13(num, i, qim0Var2, i2, i3);
        }
    }

    public static final void j(Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1921816858);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131956973);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(strO0), function0), ldx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-855511323, new dz40(strO0, (byte) 28), x340Var), x340Var, 0, 48, 2044);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wk1((byte) 13, i, function0, false);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void k(gzl1 gzl1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1856872763);
        int i4 = i | (x340Var.e(gzl1Var.ordinal()) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384;
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 16.0f, 1, qim0Var3);
            cvx cvxVar2 = cbx.b(x340Var).b;
            zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
            cvx cvxVar3 = cbx.b(x340Var).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            int i5 = i4 & 14;
            boolean z3 = ((i4 & 112) == 32) | (i5 == 4);
            Object objT = x340Var.T();
            if (z3 || objT == fkj0.X) {
                objT = new f2m1(gzl1Var, iu30Var, (byte) 2);
                x340Var.s0(objT);
            }
            ujo1.e(qim0VarZ, (xtb0) null, zzq0VarH, d36Var, (pl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var, 0, 490);
            qim0 qim0VarH = u291.h(ab80.o(qim0Var3, cbx.b(x340Var).b.b, x340Var, qim0Var3, 1.0f), cbx.b(x340Var).b.f + cbx.b(x340Var).b.b);
            cvx cvxVar4 = cbx.b(x340Var).b;
            y1a1.j(gzl1Var, uyn1.z(16.0f, 0.0f, 2, qim0VarH), x340Var, i5);
            cvx cvxVar5 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var3, 8.0f));
            int iOrdinal = gzl1Var.ordinal();
            if (iOrdinal != 0) {
                z = true;
                if (iOrdinal == 1) {
                    z2 = false;
                    i2 = 2003887479;
                    i3 = 2131963917;
                } else if (iOrdinal == 2) {
                    z2 = false;
                    i2 = 2003890487;
                    i3 = 2131963913;
                } else {
                    if (iOrdinal != 3) {
                        throw p3d1.k(x340Var, 2003883335, false);
                    }
                    i2 = 2003893561;
                    i3 = 2131963911;
                    z2 = false;
                }
            } else {
                z = true;
                z2 = false;
                i2 = 2003884502;
                i3 = 2131963915;
            }
            uwo1.e(x0d.k(x340Var, i2, i3, x340Var, z2), uyn1.z(cbx.b(x340Var).b.b, 0.0f, 2, qim0Var3), cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
            x340Var = x340Var;
            x340Var.r(z);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pej1(gzl1Var, iu30Var, qim0Var2, i, (byte) 19);
        }
    }

    public static final CharSequence l(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannableString == null) {
            spannableString = new SpannableString(charSequence);
        }
        if (!z1a1.m(spannableString, p980.class)) {
            spannableString.setSpan(new p980(), spannableString.length() - 1, spannableString.length() - 1, 33);
        }
        return spannableString;
    }

    public static final int m(w9e1 w9e1Var, int i) {
        int i2 = w9e1Var.g;
        for (int i3 = 0; i3 < i2; i3++) {
            if (w9e1Var.e(i3) > i) {
                return i3;
            }
        }
        return i2;
    }

    public static final boolean n(lee1 lee1Var, boolean z) {
        int i;
        return (!z || TextUnit.a(lee1Var.a.h, fc11.G(0)) || TextUnit.a(lee1Var.a.h, TextUnit.c) || (i = lee1Var.b.a) == 0 || i == 5 || i == 4) ? false : true;
    }

    public static final int o(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 2;
        }
        return (i != 5 && i == 6) ? 1 : 0;
    }

    public static final int p(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        return i == 3 ? 2 : 0;
    }

    public static final int q(int i) {
        if (i == 2) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        return 0;
    }

    public static final int r(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        return i == 4 ? 3 : 0;
    }

    public static final int s(int i) {
        return (i != 1 && i == 2) ? 1 : 0;
    }

    public static final int t(int i) {
        return (i != 0 && i == 1) ? 1 : 0;
    }

    public static final jth1 u(hth1 hth1Var) {
        return new jth1(hth1Var.a, hth1Var.b, hth1Var.c, hth1Var.d, hth1Var.e, hth1Var.f, false, false, false, hth1Var.g, hth1Var.h);
    }

    public static final xvj v(qim0 qim0Var) {
        return new xvj(new j2i(2044538759, new quy(qim0Var, (byte) 0), true), (j2i) null, (j2i) null, false, 62);
    }

    public static final String x(ggv ggvVar, long j, boolean z) {
        return ggvVar.a(jfv.u(j, ngv.e), z ? new fgv(3, 2) : new fgv(4, 2));
    }

    public static yeh0 y(long j) {
        byte[] bArr = new byte[8];
        for (int i = 7; i >= 0; i--) {
            bArr[i] = (byte) (255 & j);
            j >>= 8;
        }
        return new yeh0("auxiliary.tracks.offset", bArr, 0, 78);
    }

    public static final rle1 z(Context context, iix0 iix0Var, boolean z) {
        boolean z2 = iix0Var instanceof hix0;
        ngv ngvVar = ngv.d;
        if (!z2) {
            if (!(iix0Var instanceof gix0)) {
                eg.o();
                return null;
            }
            ogv ogvVar = new ogv(context.getResources(), (byte) 0);
            ytw0 ytw0Var = jfv.b;
            gix0 gix0Var = (gix0) iix0Var;
            return (rle1) ogvVar.invoke(new jfv(fdg1.l0(gix0Var.b - gix0Var.c, ngvVar)));
        }
        if (!z || !((hix0) iix0Var).a) {
            long j = ((hix0) iix0Var).b;
            if (j != 0) {
                ogv ogvVar2 = new ogv(context.getResources(), (byte) 1);
                ytw0 ytw0Var2 = jfv.b;
                return (rle1) ogvVar2.invoke(new jfv(fdg1.l0(j, ngvVar)));
            }
        }
        return null;
    }
}
