package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class nu5 implements pf40 {
    public static final nu5 a;
    private static final h661 descriptor;

    static {
        nu5 nu5Var = new nu5();
        a = nu5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.Uri", nu5Var, 2);
        m0v0Var.j("uri", true);
        m0v0Var.j("feature_identifier", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{m5n1.z(chc1Var), m5n1.z(chc1Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                str2 = (String) x1kVarB.B(h661Var, 1, chc1.a, str2);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        pu5 pu5Var = new pu5();
        if ((i & 1) == 0) {
            pu5Var.b = null;
        } else {
            pu5Var.b = str;
        }
        if ((i & 2) == 0) {
            pu5Var.c = null;
            return pu5Var;
        }
        pu5Var.c = str2;
        return pu5Var;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        pu5 pu5Var = (pu5) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = pu5Var.b;
        if (str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        String str2 = pu5Var.c;
        if (str2 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str2);
        }
        z1kVarB.a(h661Var);
    }
}
