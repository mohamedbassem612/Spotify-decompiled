package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class h2u0 implements pf40 {
    public static final h2u0 a;
    private static final h661 descriptor;

    static {
        h2u0 h2u0Var = new h2u0();
        a = h2u0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.quickstartpivot.playerimpl.endpoint.PlaybackOptions", h2u0Var, 3);
        m0v0Var.j("shufflingContext", true);
        m0v0Var.j("repeatingContext", true);
        m0v0Var.j("repeatingTrack", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        gpb gpbVar = gpb.a;
        return new nma0[]{m5n1.z(gpbVar), m5n1.z(gpbVar), m5n1.z(gpbVar)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Boolean bool2 = null;
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
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                bool3 = (Boolean) x1kVarB.B(h661Var, 2, gpb.a, bool3);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new j2u0(i, bool, bool2, bool3);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        j2u0 j2u0Var = (j2u0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        Boolean bool = j2u0Var.a;
        Boolean bool2 = j2u0Var.c;
        Boolean bool3 = j2u0Var.b;
        Boolean bool4 = Boolean.FALSE;
        if (!u890.j(bool, bool4)) {
            z1kVarB.s(h661Var, 0, gpb.a, bool);
        }
        if (!u890.j(bool3, bool4)) {
            z1kVarB.s(h661Var, 1, gpb.a, bool3);
        }
        if (!u890.j(bool2, bool4)) {
            z1kVarB.s(h661Var, 2, gpb.a, bool2);
        }
        z1kVarB.a(h661Var);
    }
}
