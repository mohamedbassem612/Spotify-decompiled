package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class iwz0 extends j1h1 {
    public static final o8a0 c = bs51.u(2, false, (drb0) null, 5).b(3);
    public static final o8a0 d = bs51.u(2, false, (drb0) null, 5).b(2);
    public final vnd1 b = new vnd1(new eoc((byte) 21));

    @Override // p.j1h1
    public final e1h1 d(a8b0 a8b0Var) {
        return new f1h1(h(a8b0Var, new o8a0(2, false, false, null, 62)));
    }

    public final mmr0 g(qx81 qx81Var, beg begVar, o8a0 o8a0Var) {
        if (qx81Var.t0().getParameters().isEmpty()) {
            return new mmr0(qx81Var, Boolean.FALSE);
        }
        if (g6b0.z(qx81Var)) {
            e1h1 e1h1Var = (e1h1) qx81Var.r0().get(0);
            return new mmr0(y3o1.i0(Collections.singletonList(new f1h1(e1h1Var.a(), h(e1h1Var.b(), o8a0Var))), qx81Var.s0(), qx81Var.t0(), qx81Var.u0()), Boolean.FALSE);
        }
        if (d4o1.i(qx81Var)) {
            return new mmr0(bkz.b(zjz.N0, qx81Var.t0().toString()), Boolean.FALSE);
        }
        zpi0 zpi0VarY = begVar.y(this);
        e0h1 e0h1VarS0 = qx81Var.s0();
        h0h1 h0h1VarG = begVar.g();
        List<y0h1> parameters = begVar.g().getParameters();
        ArrayList arrayList = new ArrayList(q7h.U(parameters, 10));
        for (y0h1 y0h1Var : parameters) {
            y0h1Var.getClass();
            arrayList.add(eoc.c(y0h1Var, o8a0Var, this.b.j(y0h1Var, o8a0Var)));
        }
        return new mmr0(y3o1.k0(e0h1VarS0, h0h1VarG, arrayList, qx81Var.u0(), zpi0VarY, new qgt(begVar, this, qx81Var, o8a0Var)), Boolean.TRUE);
    }

    public final a8b0 h(a8b0 a8b0Var, o8a0 o8a0Var) {
        jfg jfgVarS = a8b0Var.t0().s();
        if (jfgVarS instanceof y0h1) {
            o8a0Var.getClass();
            return h(this.b.j((y0h1) jfgVarS, o8a0.a(o8a0Var, 0, true, null, null, 59)), o8a0Var);
        }
        if (!(jfgVarS instanceof beg)) {
            hhg1.o(jfgVarS, "Unexpected declaration kind: ");
            return null;
        }
        jfg jfgVarS2 = i3p1.I(a8b0Var).t0().s();
        if (jfgVarS2 instanceof beg) {
            mmr0 mmr0VarG = g(i3p1.C(a8b0Var), (beg) jfgVarS, c);
            qx81 qx81Var = (qx81) mmr0VarG.a;
            boolean zBooleanValue = ((Boolean) mmr0VarG.b).booleanValue();
            mmr0 mmr0VarG2 = g(i3p1.I(a8b0Var), (beg) jfgVarS2, d);
            qx81 qx81Var2 = (qx81) mmr0VarG2.a;
            return (zBooleanValue || ((Boolean) mmr0VarG2.b).booleanValue()) ? new nwz0(qx81Var, qx81Var2, 0) : y3o1.Z(qx81Var, qx81Var2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + jfgVarS2 + "\" while for lower it's \"" + jfgVarS + '\"').toString());
    }
}
