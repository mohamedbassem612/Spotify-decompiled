package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class f0o1 {
    public static final StackTraceElement[] a = new StackTraceElement[0];
    public static b180 b;

    public static final u84 a(yk4 yk4Var) {
        return v84.a(yk4Var);
    }

    public static boolean b(String str) {
        if (!ihc1.y0(str)) {
            boolean z = true;
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                z = z && '!' <= cCharAt && cCharAt < 127;
            }
            if (z && str.length() <= 128) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03df  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:72:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:76:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:79:0x02de  */
    /* JADX WARN: Code duplicated, block: B:81:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:85:0x0395  */
    /* JADX WARN: Code duplicated, block: B:88:0x039e  */
    /* JADX WARN: Code duplicated, block: B:89:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:96:0x03d6  */
    public static final void c(xtg0 xtg0Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        m4c m4cVar;
        boolean z;
        Object objT;
        float f;
        boolean z2;
        Object objT2;
        m4c m4cVar2 = fkj0.X;
        wtg0 wtg0Var = xtg0Var.c;
        wtg0 wtg0Var2 = xtg0Var.b;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1606375682);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.i(xtg0Var) ? 4 : 2) | 48;
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            float f2 = cbx.b(x340Var2).b.c;
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            cvx cvxVar3 = cbx.b(x340Var2).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(uyn1.A(qim0Var3, 16.0f, f2, 16.0f, 16.0f), 1.0f);
            int i3 = i2 & 14;
            boolean z3 = i3 == 4 || x340Var2.i(xtg0Var);
            Object objT3 = x340Var2.T();
            if (z3 || objT3 == m4cVar2) {
                objT3 = new vtg0(xtg0Var, (byte) 0);
                x340Var2.s0(objT3);
            }
            qim0 qim0VarB = s161.b(qim0VarF, false, (iu30) objT3);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z4 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            qgo1.f(xtg0Var.a.g(new cjc0(3), x340Var2, 0), null, null, 0, false, null, x340Var2, 8, 62);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0Var3);
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
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            qim0 qim0VarD = u291.D(sgc1.H(1, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), eraVar, 2);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var2, 0);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarD);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA2, x340Var2, lljVar);
            nko1.H(xos0VarM3, x340Var2, lljVar2);
            x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar4);
            boolean z5 = i3 == 4 || x340Var2.i(xtg0Var);
            Object objT4 = x340Var2.T();
            if (z5) {
                m4cVar = m4cVar2;
            } else {
                m4cVar = m4cVar2;
                if (objT4 == m4cVar) {
                }
                qim0 qim0VarA = s161.a(qim0Var3, (iu30) objT4);
                mbh mbhVarA3 = jbh.a(f36Var, eraVar, x340Var2, 0);
                int iHashCode4 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM4 = x340Var2.m();
                qim0 qim0VarE4 = zr7.E(x340Var2, qim0VarA);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA3, x340Var2, lljVar);
                nko1.H(xos0VarM4, x340Var2, lljVar2);
                x0d.q(iHashCode4, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE4, x340Var2, lljVar4);
                String str = wtg0Var2.a;
                cvx cvxVar4 = cbx.b(x340Var2).b;
                cvx cvxVar5 = cbx.b(x340Var2).b;
                uwo1.e(str, uyn1.B(qim0Var3, 0.0f, 16.0f, 8.0f, 0.0f, 9), cbx.d(x340Var2).j, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2040);
                String str2 = wtg0Var2.b;
                cvx cvxVar6 = cbx.b(x340Var2).b;
                cvx cvxVar7 = cbx.b(x340Var2).b;
                uwo1.e(str2, uyn1.B(qim0Var3, 0.0f, 6.0f, 8.0f, 0.0f, 9), cbx.d(x340Var2).e, z4p1.e(wtg0Var2.c), null, null, 2, false, new cjc0(2), 0, null, x340Var2, 0, 0, 1712);
                x340Var2.r(true);
                if (i3 != 4 || x340Var2.i(xtg0Var)) {
                    z = true;
                } else {
                    z = false;
                }
                objT = x340Var2.T();
                if (z || objT == m4cVar) {
                    objT = new vtg0(xtg0Var, (byte) 2);
                    x340Var2.s0(objT);
                }
                qim0 qim0VarA2 = s161.a(qim0Var3, (iu30) objT);
                mbh mbhVarA4 = jbh.a(f36Var, eraVar, x340Var2, 0);
                int iHashCode5 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM5 = x340Var2.m();
                qim0 qim0VarE5 = zr7.E(x340Var2, qim0VarA2);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA4, x340Var2, lljVar);
                nko1.H(xos0VarM5, x340Var2, lljVar2);
                x0d.q(iHashCode5, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE5, x340Var2, lljVar4);
                String str3 = wtg0Var.a;
                float f3 = cbx.b(x340Var2).b.b;
                cvx cvxVar8 = cbx.b(x340Var2).b;
                uwo1.e(str3, uyn1.B(qim0Var3, 0.0f, f3, 8.0f, 0.0f, 9), cbx.d(x340Var2).j, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2040);
                String str4 = wtg0Var.b;
                cvx cvxVar9 = cbx.b(x340Var2).b;
                cvx cvxVar10 = cbx.b(x340Var2).b;
                uwo1.e(str4, uyn1.B(qim0Var3, 0.0f, 6.0f, 8.0f, 0.0f, 9), cbx.d(x340Var2).e, z4p1.e(wtg0Var.c), null, null, 2, false, new cjc0(2), 0, null, x340Var2, 0, 0, 1712);
                x340Var = x340Var2;
                x340Var.r(true);
                x340Var.r(true);
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                } else {
                    f = 1.0f;
                }
                qim0 qim0VarR = u291.r(new wnb0(f, true), dsa0.m(x340Var, 2131167185));
                cvx cvxVar11 = cbx.b(x340Var).b;
                qim0 qim0VarD2 = u291.D(uyn1.B(qim0VarR, 0.0f, 6.0f, 0.0f, 0.0f, 13), een.R0, 2);
                if (i3 != 4 || x340Var.i(xtg0Var)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objT2 = x340Var.T();
                if (z2 || objT2 == m4cVar) {
                    objT2 = new vtg0(xtg0Var, (byte) 3);
                    x340Var.s0(objT2);
                }
                dm5.a((iu30) objT2, qim0VarD2, (iu30) null, x340Var, 0, 4);
                x340Var.r(true);
                x340Var.r(true);
                qim0Var2 = qim0Var3;
            }
            objT4 = new vtg0(xtg0Var, (byte) 1);
            x340Var2.s0(objT4);
            qim0 qim0VarA3 = s161.a(qim0Var3, (iu30) objT4);
            mbh mbhVarA5 = jbh.a(f36Var, eraVar, x340Var2, 0);
            int iHashCode6 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM6 = x340Var2.m();
            qim0 qim0VarE6 = zr7.E(x340Var2, qim0VarA3);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA5, x340Var2, lljVar);
            nko1.H(xos0VarM6, x340Var2, lljVar2);
            x0d.q(iHashCode6, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE6, x340Var2, lljVar4);
            String str5 = wtg0Var2.a;
            cvx cvxVar12 = cbx.b(x340Var2).b;
            cvx cvxVar13 = cbx.b(x340Var2).b;
            uwo1.e(str5, uyn1.B(qim0Var3, 0.0f, 16.0f, 8.0f, 0.0f, 9), cbx.d(x340Var2).j, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2040);
            String str6 = wtg0Var2.b;
            cvx cvxVar14 = cbx.b(x340Var2).b;
            cvx cvxVar15 = cbx.b(x340Var2).b;
            uwo1.e(str6, uyn1.B(qim0Var3, 0.0f, 6.0f, 8.0f, 0.0f, 9), cbx.d(x340Var2).e, z4p1.e(wtg0Var2.c), null, null, 2, false, new cjc0(2), 0, null, x340Var2, 0, 0, 1712);
            x340Var2.r(true);
            if (i3 != 4) {
                z = true;
            } else {
                z = true;
            }
            objT = x340Var2.T();
            if (z) {
                objT = new vtg0(xtg0Var, (byte) 2);
                x340Var2.s0(objT);
            } else {
                objT = new vtg0(xtg0Var, (byte) 2);
                x340Var2.s0(objT);
            }
            qim0 qim0VarA4 = s161.a(qim0Var3, (iu30) objT);
            mbh mbhVarA6 = jbh.a(f36Var, eraVar, x340Var2, 0);
            int iHashCode7 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM7 = x340Var2.m();
            qim0 qim0VarE7 = zr7.E(x340Var2, qim0VarA4);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA6, x340Var2, lljVar);
            nko1.H(xos0VarM7, x340Var2, lljVar2);
            x0d.q(iHashCode7, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE7, x340Var2, lljVar4);
            String str7 = wtg0Var.a;
            float f4 = cbx.b(x340Var2).b.b;
            cvx cvxVar16 = cbx.b(x340Var2).b;
            uwo1.e(str7, uyn1.B(qim0Var3, 0.0f, f4, 8.0f, 0.0f, 9), cbx.d(x340Var2).j, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2040);
            String str8 = wtg0Var.b;
            cvx cvxVar17 = cbx.b(x340Var2).b;
            cvx cvxVar18 = cbx.b(x340Var2).b;
            uwo1.e(str8, uyn1.B(qim0Var3, 0.0f, 6.0f, 8.0f, 0.0f, 9), cbx.d(x340Var2).e, z4p1.e(wtg0Var.c), null, null, 2, false, new cjc0(2), 0, null, x340Var2, 0, 0, 1712);
            x340Var = x340Var2;
            x340Var.r(true);
            x340Var.r(true);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            } else {
                f = 1.0f;
            }
            qim0 qim0VarR2 = u291.r(new wnb0(f, true), dsa0.m(x340Var, 2131167185));
            cvx cvxVar19 = cbx.b(x340Var).b;
            qim0 qim0VarD3 = u291.D(uyn1.B(qim0VarR2, 0.0f, 6.0f, 0.0f, 0.0f, 13), een.R0, 2);
            if (i3 != 4) {
                z2 = true;
            } else {
                z2 = true;
            }
            objT2 = x340Var.T();
            if (z2) {
                objT2 = new vtg0(xtg0Var, (byte) 3);
                x340Var.s0(objT2);
            } else {
                objT2 = new vtg0(xtg0Var, (byte) 3);
                x340Var.s0(objT2);
            }
            dm5.a((iu30) objT2, qim0VarD3, (iu30) null, x340Var, 0, 4);
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q0g0(xtg0Var, qim0Var2, i, (byte) 8);
        }
    }

    public static final void d(e831 e831Var, llm llmVar, xkm0 xkm0Var) {
        l4p1.u(llmVar, new fu20(e831Var.b, new hyg0(xkm0Var, (lnm) null, (byte) 21), (byte) 1));
    }

    public static final Set e(Set set, d3h1 d3h1Var) {
        if (set == null) {
            return Collections.singleton(d3h1Var);
        }
        Set setO1 = o7h.o1(set);
        setO1.add(d3h1Var);
        return setO1;
    }

    public static final Set f(Set set, Set set2) {
        return o7h.r1(set, set2 != null ? set2 : w7x.a);
    }

    public static final eee0 g(CosmosCoroutineTransport cosmosCoroutineTransport) {
        return new eee0(cosmosCoroutineTransport);
    }

    public static final boolean h(long j, long j2) {
        return j == j2;
    }

    public static ColorStateList i(Context context, int i) {
        return x74.E(context, i);
    }

    public static Drawable j(Context context, int i) {
        return ex21.b().d(context, i);
    }

    public static final String k(uxa0 uxa0Var) {
        return cfm0.i("spotify:account-management:member-details:", uxa0Var.a, nik1.h0).a;
    }

    public static int l(long j) {
        return Long.hashCode(j);
    }

    public static p6r0 m(String str) {
        if (u890.j(nik1.B1.a, str)) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            return yon1.D2();
        }
        if (nik1.k.a(str)) {
            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
            return yon1.G1("BROWSE_GENRES", "browse/genres", 250, "browse");
        }
        AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
        return yon1.G1("FIND", "find", 555, "find");
    }

    public static gn10 n(String str) {
        return u890.j(nik1.B1.a, str) ? mno1.H : mno1.x;
    }

    public static lik1 o(String str) {
        lik1 lik1Var = nik1.B1;
        if (u890.j(lik1Var.a, str)) {
            return lik1Var;
        }
        kik1 kik1Var = nik1.o;
        if (kik1Var.a(str)) {
            return kik1Var.b(str);
        }
        kik1 kik1Var2 = nik1.k;
        return kik1Var2.a(str) ? kik1Var2.b(str) : new lik1(str);
    }

    public static Next p(z551 z551Var) {
        re20 re20Var = z551Var.h;
        if (re20Var instanceof re20) {
            re20 re20Var2 = re20Var;
            return !re20Var2.c ? Next.h(z551.a(z551Var, (String) null, (String) null, 0, (f951) null, (val) null, (fw41) null, (llr0) null, re20.a(re20Var2, (xo20) null, true, 3), (xrt0) null, 0, (m131) null, (e7r0) null, false, (h1z0) null, false, 32639)) : Next.j();
        }
        if (re20Var instanceof te20) {
            return Next.j();
        }
        if (re20Var instanceof se20) {
            return Next.j();
        }
        eg.o();
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final long q(yxa0 yxa0Var, b0k b0kVar) throws NoWhenBranchMatchedException {
        if (yxa0Var.equals(txa0.a) || (yxa0Var instanceof uxa0)) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(748377350);
            x340Var.r(false);
            uwr uwrVar = cbx.a;
            return ((vex) zex.a.b).h;
        }
        if (!(yxa0Var instanceof vxa0) && !(yxa0Var instanceof wxa0)) {
            throw p3d1.k((x340) b0kVar, 748373868, false);
        }
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.i0(748382854);
        uwr uwrVar2 = cbx.a;
        long j = cbx.a(x340Var2).c.f;
        x340Var2.r(false);
        return j;
    }

    public static ajn0 r(ajn0 ajn0Var, String str, String str2, int i) {
        char cCharAt;
        char cCharAt2;
        Object next;
        boolean z = (i & 4) != 0;
        if ((i & 8) != 0) {
            str2 = null;
        }
        if (!ajn0Var.b) {
            String strC = ajn0Var.c();
            if (nhc1.Y(strC, str, false) && strC.length() != str.length() && ('a' > (cCharAt = strC.charAt(str.length())) || cCharAt >= '{')) {
                if (str2 != null) {
                    return ajn0.e(str2.concat(ihc1.H0(strC, str)));
                }
                if (!z) {
                    return ajn0Var;
                }
                String strH0 = ihc1.H0(strC, str);
                if (strH0.length() != 0 && i1o1.u(0, strH0)) {
                    if (strH0.length() != 1 && i1o1.u(1, strH0)) {
                        lr80 it = new tr80(0, strH0.length() - 1, 1).iterator();
                        do {
                            if (!((sr80) it).c) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (i1o1.u(((Number) next).intValue(), strH0));
                        Integer num = (Integer) next;
                        if (num != null) {
                            int iIntValue = num.intValue() - 1;
                            strH0 = i1o1.I(strH0.substring(0, iIntValue)).concat(strH0.substring(iIntValue));
                        } else {
                            strH0 = i1o1.I(strH0);
                        }
                    } else if (strH0.length() != 0 && 'A' <= (cCharAt2 = strH0.charAt(0)) && cCharAt2 < '[') {
                        strH0 = Character.toLowerCase(cCharAt2) + strH0.substring(1);
                    }
                }
                if (ajn0.f(strH0)) {
                    return ajn0.e(strH0);
                }
            }
        }
        return null;
    }

    public static jy5 s(int i, String str, String str2) {
        return new jy5("hardcoded-apple-tv-".concat(str), "Test Apple TV — ".concat(str2), f4i1.f("test-apple-tv-", str, ".local"), f4i1.c(i, "192.0.2."), false);
    }

    public static final String t(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!ihc1.y0((String) obj)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return "";
        }
        if (size == 1) {
            return (String) o7h.q0(arrayList);
        }
        Object objQ0 = o7h.q0(arrayList);
        Iterator it = arrayList.subList(1, arrayList.size()).iterator();
        while (it.hasNext()) {
            objQ0 = objQ0 + " • " + ihc1.e1((String) it.next()).toString();
        }
        return (String) objQ0;
    }

    public static final LinkedHashMap u(Set set) {
        Set<d3h1> set2 = set;
        int iS = zno1.s(q7h.U(set2, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (d3h1 d3h1Var : set2) {
            linkedHashMap.put(d3h1Var.a, d3h1Var.a());
        }
        return linkedHashMap;
    }
}
