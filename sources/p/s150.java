package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class s150 implements pf40 {
    public static final s150 a;
    private static final h661 descriptor;

    static {
        s150 s150Var = new s150();
        a = s150Var;
        m0v0 m0v0Var = new m0v0("com.spotify.gpb.googlecheckout.GoogleCheckoutPageViewState.Error.Generic", s150Var, 2);
        m0v0Var.j("canRetry", false);
        m0v0Var.j("errorMsg", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{gpb.a, m5n1.z(chc1.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        String str = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                zM = x1kVarB.M(h661Var, 0);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                str = (String) x1kVarB.B(h661Var, 1, chc1.a, str);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new u150(str, i, zM);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        u150 u150Var = (u150) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        boolean z = u150Var.a;
        String str = u150Var.b;
        z1kVarB.E(h661Var, 0, z);
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str);
        }
        z1kVarB.a(h661Var);
    }
}
