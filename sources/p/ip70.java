package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class ip70 implements pf40 {
    public static final ip70 a;
    private static final h661 descriptor;

    static {
        ip70 ip70Var = new ip70();
        a = ip70Var;
        m0v0 m0v0Var = new m0v0("com.spotify.hubs.model.Image", ip70Var, 3);
        m0v0Var.j("uri", true);
        m0v0Var.j("placeholder", true);
        m0v0Var.j("custom", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(xga0.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        uga0 uga0Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                i |= 1;
            } else if (iP == 1) {
                str2 = (String) x1kVarB.B(h661Var, 1, chc1.a, str2);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                uga0Var = (uga0) x1kVarB.B(h661Var, 2, xga0.a, uga0Var);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new bq70(i, str, str2, uga0Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        bq70 bq70Var = (bq70) obj;
        uga0 uga0Var = bq70Var.c;
        String str = bq70Var.b;
        String str2 = bq70Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str2);
        }
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str);
        }
        if (z1kVarB.d0() || uga0Var != null) {
            z1kVarB.s(h661Var, 2, xga0.a, uga0Var);
        }
        z1kVarB.a(h661Var);
    }
}
