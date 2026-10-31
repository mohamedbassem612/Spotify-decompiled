package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class a8u implements pf40 {
    public static final a8u a;
    private static final h661 descriptor;

    static {
        a8u a8uVar = new a8u();
        a = a8uVar;
        m0v0 m0v0Var = new m0v0("com.spotify.jam.internal.socialconnect.models.DiscoveredToken", a8uVar, 3);
        m0v0Var.j("username", false);
        m0v0Var.j("token", true);
        m0v0Var.j("discovery_method", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        return new nma0[]{nma0Var, m5n1.z(nma0Var), nma0Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String str = null;
        String strF2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                str = (String) x1kVarB.B(h661Var, 1, chc1.a, str);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                strF2 = x1kVarB.f(h661Var, 2);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new c8u(strF, str, i, strF2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        c8u c8uVar = (c8u) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, c8uVar.a);
        String str = c8uVar.b;
        if (str != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str);
        }
        z1kVarB.G(h661Var, 2, c8uVar.c);
        z1kVarB.a(h661Var);
    }
}
