package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final /* synthetic */ class zg8 implements pf40 {
    public static final zg8 a;
    private static final h661 descriptor;

    static {
        zg8 zg8Var = new zg8();
        a = zg8Var;
        m0v0 m0v0Var = new m0v0("com.spotify.connect.castbasic.core.model.AuthMessage", zg8Var, 2);
        m0v0Var.j("type", false);
        m0v0Var.j("payload", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{chc1.a, xga0.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        uga0 uga0Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                uga0Var = (uga0) x1kVarB.A(h661Var, 1, xga0.a, uga0Var);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new bh8(i, strF, uga0Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        bh8 bh8Var = (bh8) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, bh8Var.a);
        z1kVarB.k(h661Var, 1, xga0.a, bh8Var.b);
        z1kVarB.a(h661Var);
    }
}
