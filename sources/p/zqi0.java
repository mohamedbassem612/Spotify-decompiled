package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class zqi0 implements pf40 {
    public static final zqi0 a;
    private static final h661 descriptor;

    static {
        zqi0 zqi0Var = new zqi0();
        a = zqi0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.jam.internal.socialconnect.endpoints.impl.MembershipUpgradePayload", zqi0Var, 2);
        m0v0Var.j("trigger", true);
        m0v0Var.j("sessionId", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{m5n1.z(chc1Var), m5n1.z(chc1Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                str2 = (String) x1kVarB.B(h661Var, 1, chc1.a, str2);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new bri0(i, str, str2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        bri0 bri0Var = (bri0) obj;
        String str = bri0Var.b;
        String str2 = bri0Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str2);
        }
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str);
        }
        z1kVarB.a(h661Var);
    }
}
