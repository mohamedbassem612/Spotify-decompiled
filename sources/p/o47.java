package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class o47 implements pf40 {
    public static final o47 a;
    private static final h661 descriptor;

    static {
        o47 o47Var = new o47();
        a = o47Var;
        m0v0 m0v0Var = new m0v0("com.spotify.jam.internal.socialconnect.models.AskToJoinResponse", o47Var, 1);
        m0v0Var.j("active_join_request", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{ub0.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        wb0 wb0Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                wb0Var = (wb0) x1kVarB.A(h661Var, 0, ub0.a, wb0Var);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new q47(i, wb0Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, ub0.a, ((q47) obj).a);
        z1kVarB.a(h661Var);
    }
}
