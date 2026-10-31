package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class hk61 implements pf40 {
    public static final hk61 a;
    private static final h661 descriptor;

    static {
        hk61 hk61Var = new hk61();
        a = hk61Var;
        m0v0 m0v0Var = new m0v0("com.spotify.jam.internal.socialconnect.models.SetDeviceBroadcastRequest", hk61Var, 1);
        m0v0Var.j("device_broadcast_status", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{rpt.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        tpt tptVar = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                tptVar = (tpt) x1kVarB.A(h661Var, 0, rpt.a, tptVar);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new jk61(i, tptVar);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, rpt.a, ((jk61) obj).a);
        z1kVarB.a(h661Var);
    }
}
