package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class fbf implements pf40 {
    public static final fbf a;
    private static final h661 descriptor;

    static {
        fbf fbfVar = new fbf();
        a = fbfVar;
        m0v0 m0v0Var = new m0v0("com.spotify.campaigns.wrappedpartyvtecintegration.domain.ChatMessage", fbfVar, 5);
        m0v0Var.j("id", false);
        m0v0Var.j("sender", false);
        m0v0Var.j("timestamp", false);
        m0v0Var.j("text", true);
        m0v0Var.j("unsupported", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        return new nma0[]{nma0Var, wkf.a, nma0Var, m5n1.z(nma0Var), m5n1.z(ulh1.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        ykf ykfVar = null;
        String strF2 = null;
        String str = null;
        wlh1 wlh1Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                ykfVar = (ykf) x1kVarB.A(h661Var, 1, wkf.a, ykfVar);
                i |= 2;
            } else if (iP == 2) {
                strF2 = x1kVarB.f(h661Var, 2);
                i |= 4;
            } else if (iP == 3) {
                str = (String) x1kVarB.B(h661Var, 3, chc1.a, str);
                i |= 8;
            } else {
                if (iP != 4) {
                    n9v.a(iP);
                    return null;
                }
                wlh1Var = (wlh1) x1kVarB.B(h661Var, 4, ulh1.a, wlh1Var);
                i |= 16;
            }
        }
        x1kVarB.a(h661Var);
        return new jbf(i, strF, ykfVar, strF2, str, wlh1Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        jbf jbfVar = (jbf) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = jbfVar.a;
        wlh1 wlh1Var = jbfVar.e;
        String str2 = jbfVar.d;
        z1kVarB.G(h661Var, 0, str);
        z1kVarB.k(h661Var, 1, wkf.a, jbfVar.b);
        z1kVarB.G(h661Var, 2, jbfVar.c);
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str2);
        }
        if (z1kVarB.d0() || wlh1Var != null) {
            z1kVarB.s(h661Var, 4, ulh1.a, wlh1Var);
        }
        z1kVarB.a(h661Var);
    }
}
