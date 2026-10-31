package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cht implements eht {
    public static final cht c;
    public static final cht d;
    public static final cht e;
    public final fht a;
    public final idd1 b = new idd1(new ka(this, 25));

    static {
        fht fhtVar = new fht();
        Set set = w7x.a;
        fhtVar.i(set);
        fhtVar.a = true;
        new cht(fhtVar);
        fht fhtVar2 = new fht();
        fhtVar2.l();
        fhtVar2.a = true;
        new cht(fhtVar2);
        fht fhtVar3 = new fht();
        fhtVar3.l();
        fhtVar3.i(set);
        fhtVar3.a = true;
        new cht(fhtVar3);
        fht fhtVar4 = new fht();
        fhtVar4.l();
        fhtVar4.i(set);
        fhtVar4.f();
        fhtVar4.a = true;
        new cht(fhtVar4);
        fht fhtVar5 = new fht();
        fhtVar5.i(set);
        lfg lfgVar = lfg.c;
        fhtVar5.j(lfgVar);
        xpr0 xpr0Var = xpr0.b;
        fhtVar5.h(xpr0Var);
        fhtVar5.a = true;
        new cht(fhtVar5);
        fht fhtVar6 = new fht();
        fhtVar6.l();
        fhtVar6.i(set);
        fhtVar6.j(lfgVar);
        fhtVar6.c();
        fhtVar6.h(xpr0.c);
        fhtVar6.a();
        fhtVar6.b();
        fhtVar6.f();
        fhtVar6.d();
        fhtVar6.a = true;
        new cht(fhtVar6);
        fht fhtVar7 = new fht();
        fhtVar7.i(dht.b);
        fhtVar7.a = true;
        c = new cht(fhtVar7);
        fht fhtVar8 = new fht();
        fhtVar8.i(dht.c);
        fhtVar8.a = true;
        new cht(fhtVar8);
        fht fhtVar9 = new fht();
        fhtVar9.j(lfgVar);
        fhtVar9.h(xpr0Var);
        fhtVar9.a = true;
        d = new cht(fhtVar9);
        fht fhtVar10 = new fht();
        fhtVar10.g();
        fhtVar10.j(lfg.b);
        fhtVar10.i(dht.c);
        fhtVar10.a = true;
        e = new cht(fhtVar10);
        fht fhtVar11 = new fht();
        fhtVar11.m();
        fhtVar11.i(dht.c);
        fhtVar11.a = true;
        new cht(fhtVar11);
    }

    public cht(fht fhtVar) {
        this.a = fhtVar;
    }

    public static void T(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    public static boolean f0(a8b0 a8b0Var) {
        if (!kbb.H(a8b0Var)) {
            return false;
        }
        List listR0 = a8b0Var.r0();
        if ((listR0 instanceof Collection) && listR0.isEmpty()) {
            return true;
        }
        Iterator it = listR0.iterator();
        while (it.hasNext()) {
            if (((e1h1) it.next()).c()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004f A[RETURN] */
    public static int t(zji0 zji0Var) {
        if (zji0Var instanceof beg) {
            if (((beg) zji0Var).e0() == 2) {
                return 4;
            }
            return 1;
        }
        n9r n9rVarK = zji0Var.k();
        beg begVar = n9rVarK instanceof beg ? (beg) n9rVarK : null;
        if (begVar != null && (zji0Var instanceof jyc)) {
            jyc jycVar = (jyc) zji0Var;
            if (!jycVar.l().isEmpty() && begVar.o() != 1) {
                return 3;
            }
            if (begVar.e0() == 2 && !u890.j(jycVar.getVisibility(), mht.a)) {
                if (jycVar.o() == 4) {
                    return 4;
                }
                return 3;
            }
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    public final void A(StringBuilder sb, qx81 qx81Var) {
        ce0 ce0Var;
        w(sb, qx81Var, null);
        if (d4o1.i(qx81Var)) {
            boolean z = qx81Var instanceof wjz;
            fht fhtVar = this.a;
            if (z && ((wjz) qx81Var).d.b) {
                ce0 ce0Var2 = fhtVar.V;
                mma0 mma0Var = fht.Y[47];
                if (((Boolean) ((sgp0) ce0Var2).a).booleanValue()) {
                    bkz bkzVar = bkz.a;
                    if (z) {
                        boolean z2 = ((wjz) qx81Var).d.b;
                    }
                    sb.append(B(((yjz) qx81Var.t0()).b[0]));
                } else {
                    if (z) {
                        ce0Var = fhtVar.X;
                        mma0 mma0Var2 = fht.Y[49];
                        if (((Boolean) ((sgp0) ce0Var).a).booleanValue()) {
                            sb.append(qx81Var.t0().toString());
                        } else {
                            sb.append(((wjz) qx81Var).h);
                        }
                    } else {
                        sb.append(qx81Var.t0().toString());
                    }
                    sb.append(V(qx81Var.r0()));
                }
            } else {
                if (z) {
                    ce0Var = fhtVar.X;
                    mma0 mma0Var3 = fht.Y[49];
                    if (((Boolean) ((sgp0) ce0Var).a).booleanValue()) {
                        sb.append(((wjz) qx81Var).h);
                    } else {
                        sb.append(qx81Var.t0().toString());
                    }
                } else {
                    sb.append(qx81Var.t0().toString());
                }
                sb.append(V(qx81Var.r0()));
            }
        } else {
            h0h1 h0h1VarT0 = qx81Var.t0();
            jfg jfgVarS = qx81Var.t0().s();
            aru0 aru0VarK = bzn1.k(qx81Var, jfgVarS instanceof kfg ? (kfg) jfgVarS : null, 0);
            if (aru0VarK == null) {
                sb.append(W(h0h1VarT0));
                sb.append(V(qx81Var.r0()));
            } else {
                Q(sb, aru0VarK);
            }
        }
        if (qx81Var.u0()) {
            sb.append("?");
        }
        if (qx81Var instanceof g4t) {
            sb.append(" & Any");
        }
    }

    public final String B(String str) {
        int iOrdinal = q().ordinal();
        if (iOrdinal == 0) {
            return str;
        }
        if (iOrdinal == 1) {
            return f4i1.f("<font color=red><b>", str, "</b></font>");
        }
        eg.o();
        return null;
    }

    public final String C(String str, String str2, g6b0 g6b0Var) {
        byte b = 0;
        if (n8p1.C(str, str2)) {
            return nhc1.Y(str2, "(", false) ? f4i1.f("(", str, ")!") : str.concat("!");
        }
        String strW = n8p1.w(str, str2, new zgt(this, g6b0Var, b), new zgt(this, g6b0Var, (byte) 1), new r1t(1, this, cht.class, "escape", "escape(Ljava/lang/String;)Ljava/lang/String;", 0, (byte) 2));
        if (strW != null) {
            return strW;
        }
        return "(" + str + ".." + str2 + ')';
    }

    public final String D(a8b0 a8b0Var, boolean z) {
        String strU = U(a8b0Var);
        return ((!f0(a8b0Var) || o1h1.e(a8b0Var)) && !(a8b0Var instanceof g4t) && (!z || a8b0Var.getAnnotations().isEmpty())) ? strU : cy30.n("(", strU, ')');
    }

    public final void E(fti1 fti1Var, StringBuilder sb) {
        sgl sglVarB0;
        String strY;
        ce0 ce0Var = this.a.u;
        mma0 mma0Var = fht.Y[19];
        if (!((Boolean) ((sgp0) ce0Var).a).booleanValue() || (sglVarB0 = fti1Var.b0()) == null || (strY = y(sglVarB0)) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(n(strY));
    }

    public final String F(String str) {
        int iOrdinal = q().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            ce0 ce0Var = this.a.W;
            mma0 mma0Var = fht.Y[48];
            if (!((Boolean) ((sgp0) ce0Var).a).booleanValue()) {
                return f4i1.f("<b>", str, "</b>");
            }
        }
        return str;
    }

    public final void G(jyc jycVar, StringBuilder sb) {
        String str;
        if (o().contains(dht.MEMBER_KIND) && s() && jycVar.getKind() != 1) {
            sb.append("/*");
            int kind = jycVar.getKind();
            if (kind == 1) {
                str = "DECLARATION";
            } else if (kind == 2) {
                str = "FAKE_OVERRIDE";
            } else if (kind == 3) {
                str = "DELEGATION";
            } else {
                if (kind != 4) {
                    throw null;
                }
                str = "SYNTHESIZED";
            }
            sb.append(i1o1.I(str));
            sb.append("*/ ");
        }
    }

    public final void H(zji0 zji0Var, StringBuilder sb) {
        K(sb, zji0Var.isExternal(), "external");
        boolean z = false;
        K(sb, o().contains(dht.EXPECT) && zji0Var.Z(), "expect");
        if (o().contains(dht.ACTUAL) && zji0Var.S()) {
            z = true;
        }
        K(sb, z, "actual");
    }

    public final void I(StringBuilder sb, int i, int i2) {
        String str;
        ce0 ce0Var = this.a.f11p;
        mma0 mma0Var = fht.Y[14];
        if (((Boolean) ((sgp0) ce0Var).a).booleanValue() || i != i2) {
            boolean zContains = o().contains(dht.MODALITY);
            if (i == 1) {
                str = "FINAL";
            } else if (i == 2) {
                str = "SEALED";
            } else if (i == 3) {
                str = "OPEN";
            } else {
                if (i != 4) {
                    throw null;
                }
                str = "ABSTRACT";
            }
            K(sb, zContains, i1o1.I(str));
        }
    }

    public final void J(jyc jycVar, StringBuilder sb) {
        if (iht.p(jycVar) && jycVar.o() == 1) {
            return;
        }
        ce0 ce0Var = this.a.B;
        mma0 mma0Var = fht.Y[26];
        if (((bxq0) ((sgp0) ce0Var).a) == bxq0.a && jycVar.o() == 3 && !jycVar.l().isEmpty()) {
            return;
        }
        I(sb, jycVar.o(), t(jycVar));
    }

    public final void K(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(F(str));
            sb.append(" ");
        }
    }

    public final String L(ajn0 ajn0Var, boolean z) {
        String strN = n(n8p1.v(ajn0Var));
        ce0 ce0Var = this.a.W;
        mma0 mma0Var = fht.Y[48];
        return (((Boolean) ((sgp0) ce0Var).a).booleanValue() && q() == ud21.b && z) ? f4i1.f("<b>", strN, "</b>") : strN;
    }

    public final void M(n9r n9rVar, StringBuilder sb, boolean z) {
        sb.append(L(n9rVar.getName(), z));
    }

    public final void N(StringBuilder sb, a8b0 a8b0Var) {
        gmh1 gmh1VarW0 = a8b0Var.w0();
        x xVar = gmh1VarW0 instanceof x ? (x) gmh1VarW0 : null;
        if (xVar == null) {
            O(sb, a8b0Var);
            return;
        }
        qx81 qx81Var = xVar.c;
        qx81 qx81Var2 = xVar.b;
        fht fhtVar = this.a;
        ce0 ce0Var = fhtVar.R;
        mma0[] mma0VarArr = fht.Y;
        mma0 mma0Var = mma0VarArr[42];
        boolean zBooleanValue = ((Boolean) ((sgp0) ce0Var).a).booleanValue();
        sd21 sd21Var = ud21.b;
        if (zBooleanValue) {
            O(sb, qx81Var2);
            ce0 ce0Var2 = fhtVar.S;
            mma0 mma0Var2 = mma0VarArr[43];
            if (((Boolean) ((sgp0) ce0Var2).a).booleanValue()) {
                if (q() == sd21Var) {
                    sb.append("<font color=\"808080\"><i>");
                }
                sb.append(" /* ");
                sb.append("from: ");
                O(sb, qx81Var);
                sb.append(" */");
                if (q() == sd21Var) {
                    sb.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        O(sb, qx81Var);
        ce0 ce0Var3 = fhtVar.Q;
        mma0 mma0Var3 = mma0VarArr[41];
        if (((Boolean) ((sgp0) ce0Var3).a).booleanValue()) {
            if (q() == sd21Var) {
                sb.append("<font color=\"808080\"><i>");
            }
            sb.append(" /* ");
            sb.append("= ");
            O(sb, qx81Var2);
            sb.append(" */");
            if (q() == sd21Var) {
                sb.append("</i></font>");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b6  */
    public final void O(StringBuilder sb, a8b0 a8b0Var) {
        yv30 yv30VarA;
        String strN;
        yv30 yv30VarA2;
        boolean z;
        fht fhtVar = this.a;
        if ((a8b0Var instanceof wvb0) && fhtVar.n()) {
            toe0 toe0Var = ((wvb0) a8b0Var).d;
            if (toe0Var.c == uoe0.a || toe0Var.c == uoe0.b) {
                sb.append("<Not computed yet>");
                return;
            }
        }
        gmh1 gmh1VarW0 = a8b0Var.w0();
        if (gmh1VarW0 instanceof dq20) {
            sb.append(((dq20) gmh1VarW0).B0(this, this));
            return;
        }
        if (!(gmh1VarW0 instanceof qx81)) {
            eg.o();
            return;
        }
        qx81 qx81Var = (qx81) gmh1VarW0;
        if (qx81Var.equals(o1h1.b) || qx81Var.t0() == o1h1.a.b) {
            sb.append("???");
            return;
        }
        h0h1 h0h1VarT0 = qx81Var.t0();
        byte b = 0;
        if ((h0h1VarT0 instanceof yjz) && ((yjz) h0h1VarT0).a == zjz.t) {
            ce0 ce0Var = fhtVar.t;
            mma0 mma0Var = fht.Y[18];
            if (((Boolean) ((sgp0) ce0Var).a).booleanValue()) {
                sb.append(B(((yjz) qx81Var.t0()).b[0]));
                return;
            } else {
                sb.append("???");
                return;
            }
        }
        if (d4o1.i(qx81Var)) {
            A(sb, qx81Var);
            return;
        }
        if (!f0(qx81Var)) {
            A(sb, qx81Var);
            return;
        }
        int length = sb.length();
        ((cht) this.b.getValue()).w(sb, qx81Var, null);
        boolean z2 = sb.length() != length;
        a8b0 a8b0VarC = kbb.C(qx81Var);
        List listZ = kbb.z(qx81Var);
        jfg jfgVarS = qx81Var.t0().s();
        if (jfgVarS != null && (jfgVarS instanceof beg) && g6b0.K(jfgVarS)) {
            int i = kht.a;
            yv30VarA = kbb.A(iht.f(jfgVarS));
        } else {
            yv30VarA = null;
        }
        boolean zJ = u890.j(yv30VarA, xv30.d);
        boolean zU0 = qx81Var.u0();
        boolean z3 = zU0 || (z2 && a8b0VarC != null);
        if (z3) {
            if (zJ) {
                sb.insert(length, '(');
            } else {
                if (z2) {
                    eth.H(ihc1.z0(sb));
                    if (sb.charAt(ihc1.q0(sb) - 1) != ')') {
                        sb.insert(ihc1.q0(sb), "()");
                    }
                }
                sb.append("(");
            }
        }
        K(sb, zJ, "suspend");
        if (!listZ.isEmpty()) {
            sb.append("context(");
            Iterator it = listZ.subList(0, p7h.L(listZ)).iterator();
            while (it.hasNext()) {
                N(sb, (a8b0) it.next());
                sb.append(", ");
            }
            N(sb, (a8b0) o7h.A0(listZ));
            sb.append(") ");
        }
        if (a8b0VarC != null) {
            if (!f0(a8b0VarC) || a8b0VarC.u0()) {
                jfg jfgVarS2 = a8b0VarC.t0().s();
                if (jfgVarS2 != null && (jfgVarS2 instanceof beg) && g6b0.K(jfgVarS2)) {
                    int i2 = kht.a;
                    yv30VarA2 = kbb.A(iht.f(jfgVarS2));
                } else {
                    yv30VarA2 = null;
                }
                if (u890.j(yv30VarA2, xv30.d) || !a8b0VarC.getAnnotations().isEmpty() || (a8b0VarC instanceof g4t)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            if (z) {
                sb.append("(");
            }
            N(sb, a8b0VarC);
            if (z) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        if (!kbb.H(qx81Var) || qx81Var.getAnnotations().F(rfb1.p) == null || qx81Var.r0().size() > 1) {
            int i3 = 0;
            for (e1h1 e1h1Var : kbb.D(qx81Var)) {
                int i4 = i3 + 1;
                if (i3 > 0) {
                    sb.append(", ");
                }
                ce0 ce0Var2 = fhtVar.U;
                mma0 mma0Var2 = fht.Y[45];
                ajn0 ajn0VarX = ((Boolean) ((sgp0) ce0Var2).a).booleanValue() ? kbb.x(e1h1Var.b()) : null;
                if (ajn0VarX != null) {
                    sb.append(L(ajn0VarX, false));
                    sb.append(": ");
                }
                StringBuilder sb2 = new StringBuilder();
                o7h.x0(Collections.singletonList(e1h1Var), sb2, ", ", (String) null, (String) null, new bht(this, b), 60);
                sb.append(sb2.toString());
                i3 = i4;
            }
        } else {
            sb.append("???");
        }
        sb.append(") ");
        int iOrdinal = q().ordinal();
        if (iOrdinal == 0) {
            strN = n("->");
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return;
            }
            strN = "&rarr;";
        }
        sb.append(strN);
        sb.append(" ");
        kbb.H(qx81Var);
        N(sb, ((e1h1) o7h.A0(qx81Var.r0())).b());
        if (z3) {
            sb.append(")");
        }
        if (zU0) {
            sb.append("?");
        }
    }

    public final void P(jyc jycVar, StringBuilder sb) {
        if (o().contains(dht.OVERRIDE) && !jycVar.l().isEmpty()) {
            ce0 ce0Var = this.a.B;
            mma0 mma0Var = fht.Y[26];
            if (((bxq0) ((sgp0) ce0Var).a) != bxq0.b) {
                K(sb, true, "override");
                if (s()) {
                    sb.append("/*");
                    sb.append(jycVar.l().size());
                    sb.append("*/ ");
                }
            }
        }
    }

    public final void Q(StringBuilder sb, aru0 aru0Var) {
        aru0 aru0Var2 = (aru0) aru0Var.d;
        kfg kfgVar = (kfg) aru0Var.b;
        if (aru0Var2 != null) {
            Q(sb, aru0Var2);
            sb.append('.');
            sb.append(L(kfgVar.getName(), false));
        } else {
            sb.append(W(kfgVar.g()));
        }
        sb.append(V((List) aru0Var.c));
    }

    public final void R(tdy0 tdy0Var, StringBuilder sb) {
        if (!p()) {
            fht fhtVar = this.a;
            ce0 ce0Var = fhtVar.g;
            mma0[] mma0VarArr = fht.Y;
            mma0 mma0Var = mma0VarArr[5];
            if (!((Boolean) ((sgp0) ce0Var).a).booleanValue()) {
                z(sb, tdy0Var.g0());
                if (o().contains(dht.ANNOTATIONS)) {
                    w(sb, tdy0Var, null);
                    v120 v120VarF0 = tdy0Var.f0();
                    if (v120VarF0 != null) {
                        w(sb, v120VarF0, ag5.FIELD);
                    }
                    v120 v120VarM = tdy0Var.M();
                    if (v120VarM != null) {
                        w(sb, v120VarM, ag5.PROPERTY_DELEGATE_FIELD);
                    }
                    ce0 ce0Var2 = fhtVar.H;
                    mma0 mma0Var2 = mma0VarArr[32];
                    if (((sdy0) ((sgp0) ce0Var2).a) == sdy0.b) {
                        zdy0 zdy0VarB = tdy0Var.b();
                        if (zdy0VarB != null) {
                            w(sb, zdy0VarB, ag5.PROPERTY_GETTER);
                        }
                        fey0 fey0VarC = tdy0Var.c();
                        if (fey0VarC != null) {
                            w(sb, fey0VarC, ag5.PROPERTY_SETTER);
                            tsi1 tsi1Var = (tsi1) o7h.V0(fey0VarC.F());
                            tsi1Var.getClass();
                            w(sb, tsi1Var, ag5.SETTER_PARAMETER);
                        }
                    }
                }
                d0(tdy0Var.getVisibility(), sb);
                K(sb, o().contains(dht.CONST) && tdy0Var.V(), "const");
                H(tdy0Var, sb);
                J(tdy0Var, sb);
                P(tdy0Var, sb);
                K(sb, o().contains(dht.LATEINIT) && tdy0Var.h0(), "lateinit");
                G(tdy0Var, sb);
            }
            a0(tdy0Var, sb, false);
            Z(tdy0Var.getTypeParameters(), sb, true);
            rob0 rob0VarL = tdy0Var.L();
            if (rob0VarL != null) {
                w(sb, rob0VarL, ag5.RECEIVER);
                sb.append(D(rob0VarL.getType(), false));
                sb.append(".");
            }
        }
        M(tdy0Var, sb, true);
        sb.append(": ");
        sb.append(U(tdy0Var.getType()));
        S(tdy0Var, sb);
        E(tdy0Var, sb);
        e0(sb, tdy0Var.getTypeParameters());
    }

    public final void S(hyc hycVar, StringBuilder sb) {
        rob0 rob0VarL;
        ce0 ce0Var = this.a.F;
        mma0 mma0Var = fht.Y[30];
        if (((Boolean) ((sgp0) ce0Var).a).booleanValue() && (rob0VarL = hycVar.L()) != null) {
            sb.append(" on ");
            sb.append(U(rob0VarL.getType()));
        }
    }

    public final String U(a8b0 a8b0Var) {
        StringBuilder sb = new StringBuilder();
        ce0 ce0Var = this.a.y;
        mma0 mma0Var = fht.Y[23];
        N(sb, (a8b0) ((iu30) ((sgp0) ce0Var).a).invoke(a8b0Var));
        return sb.toString();
    }

    public final String V(List list) {
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(n("<"));
        o7h.x0(list, sb, ", ", (String) null, (String) null, new bht(this, (byte) 0), 60);
        sb.append(n(">"));
        return sb.toString();
    }

    public final String W(h0h1 h0h1Var) {
        jfg jfgVarS = h0h1Var.s();
        if (!(jfgVarS instanceof y0h1) && !(jfgVarS instanceof beg) && !(jfgVarS instanceof jit)) {
            if (jfgVarS == null) {
                return h0h1Var instanceof e890 ? ((e890) h0h1Var).b(aht.b) : h0h1Var.toString();
            }
            bhn0.B(jfgVarS.getClass(), "Unexpected classifier: ");
            return null;
        }
        if (bkz.e(jfgVarS)) {
            return jfgVarS.g().toString();
        }
        ce0 ce0Var = this.a.b;
        mma0 mma0Var = fht.Y[0];
        return ((lfg) ((sgp0) ce0Var).a).b(jfgVarS, this);
    }

    public final void X(y0h1 y0h1Var, StringBuilder sb, boolean z) {
        String str;
        if (z) {
            sb.append(n("<"));
        }
        if (s()) {
            sb.append("/*");
            sb.append(y0h1Var.getIndex());
            sb.append("*/ ");
        }
        K(sb, y0h1Var.u(), "reified");
        int iX = y0h1Var.x();
        boolean z2 = true;
        if (iX == 1) {
            str = "";
        } else if (iX == 2) {
            str = "in";
        } else {
            if (iX != 3) {
                throw null;
            }
            str = "out";
        }
        K(sb, str.length() > 0, str);
        w(sb, y0h1Var, null);
        M(y0h1Var, sb, z);
        int size = y0h1Var.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            a8b0 a8b0Var = (a8b0) y0h1Var.getUpperBounds().iterator().next();
            if (a8b0Var == null) {
                g6b0.a(141);
                throw null;
            }
            if (!g6b0.y(a8b0Var) || !a8b0Var.u0()) {
                sb.append(" : ");
                sb.append(U(a8b0Var));
            }
        } else if (z) {
            for (a8b0 a8b0Var2 : y0h1Var.getUpperBounds()) {
                if (a8b0Var2 == null) {
                    g6b0.a(141);
                    throw null;
                }
                if (!g6b0.y(a8b0Var2) || !a8b0Var2.u0()) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    sb.append(U(a8b0Var2));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(n(">"));
        }
    }

    public final void Y(StringBuilder sb, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            X((y0h1) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    public final void Z(List list, StringBuilder sb, boolean z) {
        ce0 ce0Var = this.a.w;
        mma0 mma0Var = fht.Y[21];
        if (((Boolean) ((sgp0) ce0Var).a).booleanValue() || list.isEmpty()) {
            return;
        }
        sb.append(n("<"));
        Y(sb, list);
        sb.append(n(">"));
        if (z) {
            sb.append(" ");
        }
    }

    @Override // p.eht
    public final void a() {
        this.a.a();
    }

    public final void a0(fti1 fti1Var, StringBuilder sb, boolean z) {
        if (z || !(fti1Var instanceof tsi1)) {
            sb.append(F(fti1Var.K() ? "var" : "val"));
            sb.append(" ");
        }
    }

    @Override // p.eht
    public final void b() {
        this.a.b();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0060  */
    public final void b0(tsi1 tsi1Var, boolean z, StringBuilder sb, boolean z2) {
        boolean z3;
        if (z2) {
            sb.append(F("value-parameter"));
            sb.append(" ");
        }
        if (s()) {
            sb.append("/*");
            sb.append(tsi1Var.g);
            sb.append("*/ ");
        }
        w(sb, tsi1Var, null);
        K(sb, tsi1Var.i, "crossinline");
        K(sb, tsi1Var.t, "noinline");
        fht fhtVar = this.a;
        ce0 ce0Var = fhtVar.r;
        mma0[] mma0VarArr = fht.Y;
        mma0 mma0Var = mma0VarArr[16];
        if (((Boolean) ((sgp0) ce0Var).a).booleanValue()) {
            hyc hycVarZ1 = tsi1Var.z1();
            xdg xdgVar = hycVarZ1 instanceof xdg ? (xdg) hycVarZ1 : null;
            if (xdgVar == null || !xdgVar.e1) {
                z3 = false;
            } else {
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3) {
            ce0 ce0Var2 = fhtVar.s;
            mma0 mma0Var2 = mma0VarArr[17];
            K(sb, ((Boolean) ((sgp0) ce0Var2).a).booleanValue(), "actual");
        }
        a8b0 type = tsi1Var.getType();
        a8b0 a8b0Var = tsi1Var.X;
        a8b0 a8b0Var2 = a8b0Var == null ? type : a8b0Var;
        K(sb, a8b0Var != null, "vararg");
        if (z3 || (z2 && !p())) {
            a0(tsi1Var, sb, z3);
        }
        if (z) {
            M(tsi1Var, sb, z2);
            sb.append(": ");
        }
        sb.append(U(a8b0Var2));
        E(tsi1Var, sb);
        if (s() && a8b0Var != null) {
            sb.append(" /*");
            sb.append(U(type));
            sb.append("*/");
        }
        ce0 ce0Var3 = fhtVar.z;
        mma0 mma0Var3 = mma0VarArr[24];
        if (((iu30) ((sgp0) ce0Var3).a) != null) {
            if (fhtVar.n() ? tsi1Var.y1() : kht.a(tsi1Var)) {
                StringBuilder sb2 = new StringBuilder(" = ");
                ce0 ce0Var4 = fhtVar.z;
                mma0 mma0Var4 = mma0VarArr[24];
                iu30 iu30Var = (iu30) ((sgp0) ce0Var4).a;
                iu30Var.getClass();
                sb2.append((String) iu30Var.invoke(tsi1Var));
                sb.append(sb2.toString());
            }
        }
    }

    @Override // p.eht
    public final void c() {
        this.a.c();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    public final void c0(Collection collection, boolean z, StringBuilder sb) {
        boolean z2;
        ce0 ce0Var = this.a.E;
        mma0 mma0Var = fht.Y[29];
        int iOrdinal = ((xpr0) ((sgp0) ce0Var).a).ordinal();
        if (iOrdinal == 0) {
            z2 = true;
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    eg.o();
                    return;
                }
            } else if (!z) {
                z2 = true;
            }
            z2 = false;
        }
        int size = collection.size();
        r().getClass();
        sb.append("(");
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            tsi1 tsi1Var = (tsi1) it.next();
            r().getClass();
            b0(tsi1Var, z2, sb, false);
            r().getClass();
            if (i != size - 1) {
                sb.append(", ");
            }
            i = i2;
        }
        r().getClass();
        sb.append(")");
    }

    @Override // p.eht
    public final void d() {
        this.a.d();
    }

    public final boolean d0(lht lhtVar, StringBuilder sb) {
        if (!o().contains(dht.VISIBILITY)) {
            return false;
        }
        fht fhtVar = this.a;
        ce0 ce0Var = fhtVar.n;
        mma0[] mma0VarArr = fht.Y;
        mma0 mma0Var = mma0VarArr[12];
        if (((Boolean) ((sgp0) ce0Var).a).booleanValue()) {
            lhtVar = mht.g(lhtVar.a.m());
        }
        ce0 ce0Var2 = fhtVar.o;
        mma0 mma0Var2 = mma0VarArr[13];
        if (!((Boolean) ((sgp0) ce0Var2).a).booleanValue() && u890.j(lhtVar, mht.k)) {
            return false;
        }
        sb.append(F(lhtVar.a.e()));
        sb.append(" ");
        return true;
    }

    @Override // p.eht
    public final Set e() {
        return this.a.e();
    }

    public final void e0(StringBuilder sb, List list) {
        ce0 ce0Var = this.a.w;
        mma0 mma0Var = fht.Y[21];
        if (((Boolean) ((sgp0) ce0Var).a).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y0h1 y0h1Var = (y0h1) it.next();
            for (a8b0 a8b0Var : o7h.k0(y0h1Var.getUpperBounds(), 1)) {
                StringBuilder sb2 = new StringBuilder(L(y0h1Var.getName(), false));
                sb2.append(" : ");
                a8b0Var.getClass();
                sb2.append(U(a8b0Var));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(F("where"));
        sb.append(" ");
        o7h.x0(arrayList, sb, ", ", (String) null, (String) null, (iu30) null, 124);
    }

    @Override // p.eht
    public final void f() {
        this.a.f();
    }

    @Override // p.eht
    public final void g() {
        this.a.g();
    }

    @Override // p.eht
    public final void h(xpr0 xpr0Var) {
        this.a.h(xpr0Var);
    }

    @Override // p.eht
    public final void i(Set set) {
        this.a.i(set);
    }

    @Override // p.eht
    public final void j(lfg lfgVar) {
        this.a.j(lfgVar);
    }

    @Override // p.eht
    public final void k(LinkedHashSet linkedHashSet) {
        this.a.k(linkedHashSet);
    }

    @Override // p.eht
    public final void l() {
        this.a.l();
    }

    @Override // p.eht
    public final void m() {
        this.a.m();
    }

    public final String n(String str) {
        return q().a(str);
    }

    public final Set o() {
        ce0 ce0Var = this.a.e;
        mma0 mma0Var = fht.Y[3];
        return (Set) ((sgp0) ce0Var).a;
    }

    public final boolean p() {
        ce0 ce0Var = this.a.f;
        mma0 mma0Var = fht.Y[4];
        return ((Boolean) ((sgp0) ce0Var).a).booleanValue();
    }

    public final ud21 q() {
        ce0 ce0Var = this.a.D;
        mma0 mma0Var = fht.Y[28];
        return (ud21) ((sgp0) ce0Var).a;
    }

    public final ygt r() {
        ce0 ce0Var = this.a.C;
        mma0 mma0Var = fht.Y[27];
        return (ygt) ((sgp0) ce0Var).a;
    }

    public final boolean s() {
        ce0 ce0Var = this.a.j;
        mma0 mma0Var = fht.Y[8];
        return ((Boolean) ((sgp0) ce0Var).a).booleanValue();
    }

    public final String u(n9r n9rVar) {
        n9r n9rVarK;
        String str;
        StringBuilder sb = new StringBuilder();
        n9rVar.r(new ogr((Object) this, (byte) 15), sb);
        fht fhtVar = this.a;
        ce0 ce0Var = fhtVar.c;
        mma0[] mma0VarArr = fht.Y;
        mma0 mma0Var = mma0VarArr[1];
        if (((Boolean) ((sgp0) ce0Var).a).booleanValue() && !(n9rVar instanceof dzq0) && !(n9rVar instanceof dub0) && (n9rVarK = n9rVar.k()) != null && !(n9rVarK instanceof zim0)) {
            sb.append(" ");
            int iOrdinal = q().ordinal();
            if (iOrdinal == 0) {
                str = "defined in";
            } else {
                if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                str = "<i>defined in</i>";
            }
            sb.append(str);
            sb.append(" ");
            lf30 lf30VarF = iht.f(n9rVarK);
            sb.append(lf30VarF.c() ? "root package" : n(n8p1.x(lf30.f(lf30VarF))));
            ce0 ce0Var2 = fhtVar.d;
            mma0 mma0Var2 = mma0VarArr[2];
            if (((Boolean) ((sgp0) ce0Var2).a).booleanValue() && (n9rVarK instanceof dzq0) && (n9rVar instanceof p9r)) {
                ((p9r) n9rVar).getSource().getClass();
            }
        }
        return sb.toString();
    }

    public final String v(pf5 pf5Var, ag5 ag5Var) {
        xdg xdgVarB;
        List listF;
        fht fhtVar = this.a;
        ce0 ce0Var = fhtVar.N;
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (ag5Var != null) {
            sb.append(ag5Var.a + ':');
        }
        a8b0 type = pf5Var.getType();
        sb.append(U(type));
        mma0[] mma0VarArr = fht.Y;
        mma0 mma0Var = mma0VarArr[38];
        if (((lf5) ((sgp0) ce0Var).a).a) {
            Map mapA = pf5Var.a();
            ce0 ce0Var2 = fhtVar.I;
            mma0 mma0Var2 = mma0VarArr[33];
            ArrayList arrayList = null;
            beg begVarD = ((Boolean) ((sgp0) ce0Var2).a).booleanValue() ? kht.d(pf5Var) : null;
            if (begVarD != null && (xdgVarB = begVarD.B()) != null && (listF = xdgVarB.F()) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listF) {
                    if (((tsi1) obj).y1()) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((tsi1) it.next()).getName());
                }
                arrayList = arrayList3;
            }
            if (arrayList == null) {
                arrayList = z6x.a;
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (!mapA.containsKey((ajn0) obj2)) {
                    arrayList4.add(obj2);
                }
            }
            ArrayList arrayList5 = new ArrayList(q7h.U(arrayList4, 10));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                arrayList5.add(((ajn0) it2.next()).b() + " = ...");
            }
            Set<Map.Entry> setEntrySet = mapA.entrySet();
            ArrayList arrayList6 = new ArrayList(q7h.U(setEntrySet, 10));
            for (Map.Entry entry : setEntrySet) {
                ajn0 ajn0Var = (ajn0) entry.getKey();
                sgl sglVar = (sgl) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(ajn0Var.b());
                sb2.append(" = ");
                sb2.append(!arrayList.contains(ajn0Var) ? y(sglVar) : "...");
                arrayList6.add(sb2.toString());
            }
            List listZ0 = o7h.Z0(o7h.N0(arrayList6, arrayList5));
            mma0 mma0Var3 = fht.Y[38];
            if (((lf5) ((sgp0) ce0Var).a).b || !listZ0.isEmpty()) {
                o7h.x0(listZ0, sb, ", ", "(", ")", (iu30) null, 112);
            }
        }
        if (s() && (d4o1.i(type) || (type.t0().s() instanceof ego0))) {
            sb.append(" /* annotation class not found */");
        }
        return sb.toString();
    }

    public final void w(StringBuilder sb, ve5 ve5Var, ag5 ag5Var) {
        Set setE;
        if (o().contains(dht.ANNOTATIONS)) {
            boolean z = ve5Var instanceof a8b0;
            fht fhtVar = this.a;
            if (z) {
                setE = fhtVar.e();
            } else {
                ce0 ce0Var = fhtVar.K;
                mma0 mma0Var = fht.Y[35];
                setE = (Set) ((sgp0) ce0Var).a;
            }
            ce0 ce0Var2 = fhtVar.M;
            mma0 mma0Var2 = fht.Y[37];
            iu30 iu30Var = (iu30) ((sgp0) ce0Var2).a;
            for (pf5 pf5Var : ve5Var.getAnnotations()) {
                if (!o7h.i0(setE, pf5Var.b()) && !u890.j(pf5Var.b(), rfb1.r) && (iu30Var == null || ((Boolean) iu30Var.invoke(pf5Var)).booleanValue())) {
                    sb.append(v(pf5Var, ag5Var));
                    ce0 ce0Var3 = fhtVar.J;
                    mma0 mma0Var3 = fht.Y[34];
                    if (((Boolean) ((sgp0) ce0Var3).a).booleanValue()) {
                        sb.append('\n');
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    public final void x(kfg kfgVar, StringBuilder sb) {
        List listN = kfgVar.n();
        List parameters = kfgVar.g().getParameters();
        if (s() && kfgVar.j() && parameters.size() > listN.size()) {
            sb.append(" /*captured type parameters: ");
            Y(sb, parameters.subList(listN.size(), parameters.size()));
            sb.append("*/");
        }
    }

    public final String y(sgl sglVar) {
        ce0 ce0Var = this.a.v;
        mma0 mma0Var = fht.Y[20];
        iu30 iu30Var = (iu30) ((sgp0) ce0Var).a;
        if (iu30Var != null) {
            return (String) iu30Var.invoke(sglVar);
        }
        if (sglVar instanceof e46) {
            Iterable iterable = (Iterable) ((e46) sglVar).a;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String strY = y((sgl) it.next());
                if (strY != null) {
                    arrayList.add(strY);
                }
            }
            return o7h.y0(arrayList, ", ", "{", "}", (iu30) null, 56);
        }
        if (sglVar instanceof dg5) {
            return ihc1.H0(v((pf5) ((dg5) sglVar).a, null), "@");
        }
        if (!(sglVar instanceof fla0)) {
            return sglVar.toString();
        }
        ela0 ela0Var = (ela0) ((fla0) sglVar).a;
        if (ela0Var instanceof cla0) {
            return ((cla0) ela0Var).a + "::class";
        }
        if (!(ela0Var instanceof dla0)) {
            eg.o();
            return null;
        }
        jeg jegVar = ((dla0) ela0Var).a;
        String strN = jegVar.a.a().a.a;
        int i = jegVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            strN = cy30.n("kotlin.Array<", strN, '>');
        }
        return f4i1.e(strN, "::class");
    }

    public final void z(StringBuilder sb, List list) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            sb.append(D(((rob0) it.next()).getType(), true));
            if (i == p7h.L(list)) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i = i2;
        }
    }
}
