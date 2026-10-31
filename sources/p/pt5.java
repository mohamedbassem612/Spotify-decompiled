package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class pt5 implements pf40 {
    public static final pt5 a;
    private static final h661 descriptor;

    static {
        pt5 pt5Var = new pt5();
        a = pt5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.Shuffle", pt5Var, 1);
        m0v0Var.j("shuffle", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z(gpb.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        boolean z2 = false;
        Boolean bool = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                bool = (Boolean) x1kVarB.B(h661Var, 0, gpb.a, bool);
                z2 = true;
            }
        }
        x1kVarB.a(h661Var);
        rt5 rt5Var = new rt5();
        if (z2) {
            rt5Var.b = bool;
            return rt5Var;
        }
        rt5Var.b = null;
        return rt5Var;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        Boolean bool = ((rt5) obj).b;
        if (bool != null) {
            z1kVarB.s(h661Var, 0, gpb.a, bool);
        }
        z1kVarB.a(h661Var);
    }
}
