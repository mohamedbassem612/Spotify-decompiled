package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class ib implements pf40 {
    public static final ib a;
    private static final h661 descriptor;

    static {
        ib ibVar = new ib();
        a = ibVar;
        m0v0 m0v0Var = new m0v0("com.spotify.jam.internal.socialconnect.models.AcceptJamJoinResponse", ibVar, 2);
        m0v0Var.j("request_queue", true);
        m0v0Var.j("attempt_id", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z(lp21.a), m5n1.z(chc1.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        np21 np21Var = null;
        String str = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                np21Var = (np21) x1kVarB.B(h661Var, 0, lp21.a, np21Var);
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
        return new kb(i, str, np21Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        kb kbVar = (kb) obj;
        String str = kbVar.b;
        np21 np21Var = kbVar.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || np21Var != null) {
            z1kVarB.s(h661Var, 0, lp21.a, np21Var);
        }
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str);
        }
        z1kVarB.a(h661Var);
    }
}
