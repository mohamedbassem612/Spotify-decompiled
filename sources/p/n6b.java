package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n6b extends pim0 implements zlb0, t161 {
    public iu30 O0;

    public n6b(iu30 iu30Var) {
        this.O0 = iu30Var;
    }

    @Override // p.zlb0
    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        q5t0 q5t0VarH = afh0Var.H(j);
        return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7x.a, new b6(q5t0VarH, this, (byte) 9));
    }

    @Override // p.t161
    public final void g(e261 e261Var) {
        hw61 hw61Var;
        boolean z;
        ndo0 ndo0VarW = oap1.w(this, 2);
        if (ndo0VarW.p1) {
            hw61Var = ndo0VarW.l1;
            z = ndo0VarW.o1;
        } else {
            if (i541.i() == null) {
                i541.m(new kd31());
            } else {
                kd31 kd31VarI = i541.i();
                kd31VarI.getClass();
                kd31VarI.a();
            }
            kd31 kd31VarI2 = i541.i();
            kd31VarI2.getClass();
            kd31VarI2.T0 = ndo0VarW.U0.Z0;
            kd31VarI2.R0 = o0c.R(ndo0VarW.c);
            jv91 jv91VarO = ekb.o();
            iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
            jv91 jv91VarU = ekb.u(jv91VarO);
            try {
                this.O0.invoke(kd31VarI2);
                ekb.C(jv91VarO, jv91VarU, iu30VarE);
                hw61Var = kd31VarI2.O0;
                z = kd31VarI2.P0;
            } catch (Throwable th) {
                ekb.C(jv91VarO, jv91VarU, iu30VarE);
                throw th;
            }
        }
        if (z) {
            b261.z(e261Var, hw61Var);
        }
    }

    @Override // p.t161
    public final boolean k() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.O0 + ")";
    }

    @Override // p.pim0
    public final boolean w1() {
        return false;
    }
}
