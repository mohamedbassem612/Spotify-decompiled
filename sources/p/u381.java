package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class u381 implements pf40 {
    public static final u381 a;
    private static final h661 descriptor;

    static {
        u381 u381Var = new u381();
        a = u381Var;
        m0v0 m0v0Var = new m0v0("com.spotify.podcast.endpoints.policy.ShowDecorationPolicy", u381Var, 3);
        m0v0Var.j("list", true);
        m0v0Var.j("header", true);
        m0v0Var.j("sections", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z(f3z.a), m5n1.z(xz50.a), m5n1.z(bqa0.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        e3z e3zVar = null;
        x381 x381Var = null;
        aqa0 aqa0Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                e3zVar = (e3z) x1kVarB.B(h661Var, 0, f3z.a, e3zVar);
                i |= 1;
            } else if (iP == 1) {
                x381Var = (x381) x1kVarB.B(h661Var, 1, xz50.a, x381Var);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                aqa0Var = (aqa0) x1kVarB.B(h661Var, 2, bqa0.a, aqa0Var);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new y381(i, e3zVar, x381Var, aqa0Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        y381 y381Var = (y381) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        e3z e3zVar = y381Var.a;
        if (e3zVar != null) {
            z1kVarB.s(h661Var, 0, f3z.a, e3zVar);
        }
        x381 x381Var = y381Var.b;
        if (x381Var != null) {
            z1kVarB.s(h661Var, 1, xz50.a, x381Var);
        }
        aqa0 aqa0Var = y381Var.c;
        if (aqa0Var != null) {
            z1kVarB.s(h661Var, 2, bqa0.a, aqa0Var);
        }
        z1kVarB.a(h661Var);
    }
}
