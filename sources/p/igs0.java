package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class igs0 implements pf40 {
    public static final igs0 a;
    private static final h661 descriptor;

    static {
        igs0 igs0Var = new igs0();
        a = igs0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.jam.internal.socialconnect.models.PendingJoinRequest", igs0Var, 4);
        m0v0Var.j("requester_username", false);
        m0v0Var.j("playback_control", false);
        m0v0Var.j("join_type", true);
        m0v0Var.j("request_type", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        return new nma0[]{nma0Var, nma0Var, m5n1.z(nma0Var), m5n1.z(nma0Var)};
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
        String str2 = null;
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
            } else if (iP == 2) {
                str = (String) x1kVarB.B(h661Var, 2, chc1.a, str);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                str2 = (String) x1kVarB.B(h661Var, 3, chc1.a, str2);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new kgs0(i, strF, strF2, str, str2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        kgs0 kgs0Var = (kgs0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = kgs0Var.a;
        String str2 = kgs0Var.d;
        String str3 = kgs0Var.c;
        z1kVarB.G(h661Var, 0, str);
        z1kVarB.G(h661Var, 1, kgs0Var.b);
        if (z1kVarB.d0() || str3 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str3);
        }
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str2);
        }
        z1kVarB.a(h661Var);
    }
}
