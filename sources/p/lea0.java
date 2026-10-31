package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class lea0 implements pf40 {
    public static final lea0 a;
    private static final h661 descriptor;

    static {
        lea0 lea0Var = new lea0();
        a = lea0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.jam.internal.socialconnect.models.JoinRequestStatusUpdate", lea0Var, 2);
        m0v0Var.j("request_status", false);
        m0v0Var.j("request_queue", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{chc1.a, m5n1.z(lp21.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        np21 np21Var = null;
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
                np21Var = (np21) x1kVarB.B(h661Var, 1, lp21.a, np21Var);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new nea0(i, strF, np21Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        nea0 nea0Var = (nea0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = nea0Var.a;
        np21 np21Var = nea0Var.b;
        z1kVarB.G(h661Var, 0, str);
        if (z1kVarB.d0() || np21Var != null) {
            z1kVarB.s(h661Var, 1, lp21.a, np21Var);
        }
        z1kVarB.a(h661Var);
    }
}
