package p;

import app.p000rive.semantics.SemanticState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class k6v {
    public static final bz0 a = new bz0(3, (lnm) null, (byte) 10);
    public static final bz0 b = new bz0(3, (lnm) null, (byte) 11);

    public static final boolean a(qqq0 qqq0Var, float f) {
        if (qqq0Var == qqq0.b) {
            return f <= 30.0f;
        }
        return f > 30.0f && f <= 90.0f;
    }

    public static qim0 b(qim0 qim0Var, r6v r6vVar, qqq0 qqq0Var, boolean z, idn0 idn0Var, boolean z2, xu30 xu30Var, xu30 xu30Var2, boolean z3, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            idn0Var = null;
        }
        return qim0Var.then(new e6v(r6vVar, qqq0Var, z4, idn0Var, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? a : xu30Var, (i & 64) != 0 ? b : xu30Var2, (i & SemanticState.Focused) != 0 ? false : z3));
    }

    public static final r6v c(iu30 iu30Var, b0k b0kVar) {
        ven0 ven0VarS = v8r.s(iu30Var, b0kVar);
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            xvr xvrVar = new xvr(new g45(ven0VarS, (byte) 5));
            x340Var.s0(xvrVar);
            objT = xvrVar;
        }
        return (r6v) objT;
    }

    public static final long d(long j) {
        return j2h1.g(Float.isNaN(qui1.d(j)) ? 0.0f : qui1.d(j), Float.isNaN(qui1.e(j)) ? 0.0f : qui1.e(j));
    }

    public static final void e(m5v m5vVar, h5v h5vVar) {
        don1.E(m5vVar, rj40.P0, new dqc(new j6(h5vVar, (byte) 27), (byte) 4));
    }
}
