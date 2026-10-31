package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class fs5 implements pf40 {
    public static final fs5 a;
    private static final h661 descriptor;

    static {
        fs5 fs5Var = new fs5();
        a = fs5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.Metadata", fs5Var, 5);
        m0v0Var.j("is_explicit_content", true);
        m0v0Var.j("is_19_plus_content", true);
        m0v0Var.j("duration_ms", true);
        m0v0Var.j("time_left_ms", true);
        m0v0Var.j("is_played", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        gpb gpbVar = gpb.a;
        nma0 nma0VarZ = m5n1.z(gpbVar);
        nma0 nma0VarZ2 = m5n1.z(gpbVar);
        o5f0 o5f0Var = o5f0.a;
        return new nma0[]{nma0VarZ, nma0VarZ2, m5n1.z(o5f0Var), m5n1.z(o5f0Var), m5n1.z(gpbVar)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        Long l = null;
        Long l2 = null;
        Boolean bool3 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                bool = (Boolean) x1kVarB.B(h661Var, 0, gpb.a, bool);
                i |= 1;
            } else if (iP == 1) {
                bool2 = (Boolean) x1kVarB.B(h661Var, 1, gpb.a, bool2);
                i |= 2;
            } else if (iP == 2) {
                l = (Long) x1kVarB.B(h661Var, 2, o5f0.a, l);
                i |= 4;
            } else if (iP == 3) {
                l2 = (Long) x1kVarB.B(h661Var, 3, o5f0.a, l2);
                i |= 8;
            } else {
                if (iP != 4) {
                    n9v.a(iP);
                    return null;
                }
                bool3 = (Boolean) x1kVarB.B(h661Var, 4, gpb.a, bool3);
                i |= 16;
            }
        }
        x1kVarB.a(h661Var);
        hs5 hs5Var = new hs5();
        if ((i & 1) == 0) {
            hs5Var.b = null;
        } else {
            hs5Var.b = bool;
        }
        if ((i & 2) == 0) {
            hs5Var.c = null;
        } else {
            hs5Var.c = bool2;
        }
        if ((i & 4) == 0) {
            hs5Var.d = null;
        } else {
            hs5Var.d = l;
        }
        if ((i & 8) == 0) {
            hs5Var.e = null;
        } else {
            hs5Var.e = l2;
        }
        if ((i & 16) == 0) {
            hs5Var.f = null;
            return hs5Var;
        }
        hs5Var.f = bool3;
        return hs5Var;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        hs5 hs5Var = (hs5) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        Boolean bool = hs5Var.b;
        if (bool != null) {
            z1kVarB.s(h661Var, 0, gpb.a, bool);
        }
        Boolean bool2 = hs5Var.c;
        if (bool2 != null) {
            z1kVarB.s(h661Var, 1, gpb.a, bool2);
        }
        Long l = hs5Var.d;
        if (l != null) {
            z1kVarB.s(h661Var, 2, o5f0.a, l);
        }
        Long l2 = hs5Var.e;
        if (l2 != null) {
            z1kVarB.s(h661Var, 3, o5f0.a, l2);
        }
        Boolean bool3 = hs5Var.f;
        if (bool3 != null) {
            z1kVarB.s(h661Var, 4, gpb.a, bool3);
        }
        z1kVarB.a(h661Var);
    }
}
