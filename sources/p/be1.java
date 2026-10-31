package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class be1 implements pf40 {
    public static final be1 a;
    private static final h661 descriptor;

    static {
        be1 be1Var = new be1();
        a = be1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.genalpha.datasourceimpl.requestentity.AddKidRequest", be1Var, 3);
        m0v0Var.j("profile", false);
        m0v0Var.j("pin", true);
        m0v0Var.j("parentalControls", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{uvw0.a, m5n1.z(chc1.a), fxr0.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        bww0 bww0Var = null;
        String str = null;
        hxr0 hxr0Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                bww0Var = (bww0) x1kVarB.A(h661Var, 0, uvw0.a, bww0Var);
                i |= 1;
            } else if (iP == 1) {
                str = (String) x1kVarB.B(h661Var, 1, chc1.a, str);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                hxr0Var = (hxr0) x1kVarB.A(h661Var, 2, fxr0.a, hxr0Var);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new de1(i, bww0Var, str, hxr0Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        de1 de1Var = (de1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, uvw0.a, de1Var.a);
        String str = de1Var.b;
        if (str != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str);
        }
        z1kVarB.k(h661Var, 2, fxr0.a, de1Var.c);
        z1kVarB.a(h661Var);
    }
}
