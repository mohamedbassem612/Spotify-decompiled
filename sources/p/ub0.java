package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class ub0 implements pf40 {
    public static final ub0 a;
    private static final h661 descriptor;

    static {
        ub0 ub0Var = new ub0();
        a = ub0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.jam.internal.socialconnect.models.ActiveJoinRequest", ub0Var, 4);
        m0v0Var.j("username", false);
        m0v0Var.j("playback_device_info", true);
        m0v0Var.j("playback_control", false);
        m0v0Var.j("request_type", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        return new nma0[]{nma0Var, m5n1.z(rd61.a), nma0Var, m5n1.z(nma0Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        td61 td61Var = null;
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
                td61Var = (td61) x1kVarB.B(h661Var, 1, rd61.a, td61Var);
                i |= 2;
            } else if (iP == 2) {
                strF2 = x1kVarB.f(h661Var, 2);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                str = (String) x1kVarB.B(h661Var, 3, chc1.a, str);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new wb0(i, strF, td61Var, strF2, str);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        wb0 wb0Var = (wb0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = wb0Var.a;
        String str2 = wb0Var.d;
        td61 td61Var = wb0Var.b;
        z1kVarB.G(h661Var, 0, str);
        if (z1kVarB.d0() || td61Var != null) {
            z1kVarB.s(h661Var, 1, rd61.a, td61Var);
        }
        z1kVarB.G(h661Var, 2, wb0Var.c);
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str2);
        }
        z1kVarB.a(h661Var);
    }
}
