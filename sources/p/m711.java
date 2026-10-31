package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final /* synthetic */ class m711 implements pf40 {
    public static final m711 a;
    private static final h661 descriptor;

    static {
        m711 m711Var = new m711();
        a = m711Var;
        m0v0 m0v0Var = new m0v0("com.spotify.connect.core.model.RedirectUris", m711Var, 1);
        m0v0Var.j("android", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z(h65.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        j65 j65Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                j65Var = (j65) x1kVarB.B(h661Var, 0, h65.a, j65Var);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new o711(i, j65Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        j65 j65Var = ((o711) obj).a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || j65Var != null) {
            z1kVarB.s(h661Var, 0, h65.a, j65Var);
        }
        z1kVarB.a(h661Var);
    }
}
