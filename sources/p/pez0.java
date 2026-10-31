package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class pez0 implements pf40 {
    public static final pez0 a;
    private static final h661 descriptor;

    static {
        pez0 pez0Var = new pez0();
        a = pez0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.notifications.models.message.QuickAction", pez0Var, 3);
        m0v0Var.j("actionIdentifier", false);
        m0v0Var.j("actionTitle", false);
        m0v0Var.j("actionData", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        return new nma0[]{nma0Var, nma0Var, m5n1.z(nma0Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String strF2 = null;
        String str = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                strF2 = x1kVarB.f(h661Var, 1);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                str = (String) x1kVarB.B(h661Var, 2, chc1.a, str);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new xez0(strF, strF2, i, str);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        xez0 xez0Var = (xez0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = xez0Var.a;
        String str2 = xez0Var.c;
        z1kVarB.G(h661Var, 0, str);
        z1kVarB.G(h661Var, 1, xez0Var.b);
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str2);
        }
        z1kVarB.a(h661Var);
    }
}
