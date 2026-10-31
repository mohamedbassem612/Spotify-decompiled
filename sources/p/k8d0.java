package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class k8d0 implements pf40 {
    public static final k8d0 a;
    private static final h661 descriptor;

    static {
        k8d0 k8d0Var = new k8d0();
        a = k8d0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.jam.internal.socialconnect.models.ListenMode", k8d0Var, 1);
        m0v0Var.j("available", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{gpb.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                zM = x1kVarB.M(h661Var, 0);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new m8d0(i, zM);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        boolean z = ((m8d0) obj).a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || z) {
            z1kVarB.E(h661Var, 0, z);
        }
        z1kVarB.a(h661Var);
    }
}
