package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class c5a0 implements pf40 {
    public static final c5a0 a;
    private static final h661 descriptor;

    static {
        c5a0 c5a0Var = new c5a0();
        a = c5a0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.jam.internal.socialconnect.models.JamStatus", c5a0Var, 4);
        m0v0Var.j("device_broadcast_status", false);
        m0v0Var.j("session", true);
        m0v0Var.j("active_join_request", true);
        m0v0Var.j("request_queue", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{rpt.a, m5n1.z(y961.a), m5n1.z(ub0.a), m5n1.z(lp21.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        tpt tptVar = null;
        ga61 ga61Var = null;
        wb0 wb0Var = null;
        np21 np21Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                tptVar = (tpt) x1kVarB.A(h661Var, 0, rpt.a, tptVar);
                i |= 1;
            } else if (iP == 1) {
                ga61Var = (ga61) x1kVarB.B(h661Var, 1, y961.a, ga61Var);
                i |= 2;
            } else if (iP == 2) {
                wb0Var = (wb0) x1kVarB.B(h661Var, 2, ub0.a, wb0Var);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                np21Var = (np21) x1kVarB.B(h661Var, 3, lp21.a, np21Var);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new f5a0(i, tptVar, ga61Var, wb0Var, np21Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        f5a0 f5a0Var = (f5a0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        rpt rptVar = rpt.a;
        tpt tptVar = f5a0Var.a;
        np21 np21Var = f5a0Var.d;
        wb0 wb0Var = f5a0Var.c;
        ga61 ga61Var = f5a0Var.b;
        z1kVarB.k(h661Var, 0, rptVar, tptVar);
        if (z1kVarB.d0() || ga61Var != null) {
            z1kVarB.s(h661Var, 1, y961.a, ga61Var);
        }
        if (z1kVarB.d0() || wb0Var != null) {
            z1kVarB.s(h661Var, 2, ub0.a, wb0Var);
        }
        if (z1kVarB.d0() || np21Var != null) {
            z1kVarB.s(h661Var, 3, lp21.a, np21Var);
        }
        z1kVarB.a(h661Var);
    }
}
