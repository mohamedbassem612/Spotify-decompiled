package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class bq5 implements pf40 {
    public static final bq5 a;
    private static final h661 descriptor;

    static {
        bq5 bq5Var = new bq5();
        a = bq5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.Capabilities", bq5Var, 1);
        m0v0Var.j("can_play_on_demand", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z(gpb.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        boolean z2 = false;
        Boolean bool = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                bool = (Boolean) x1kVarB.B(h661Var, 0, gpb.a, bool);
                z2 = true;
            }
        }
        x1kVarB.a(h661Var);
        dq5 dq5Var = new dq5();
        if (z2) {
            dq5Var.b = bool;
            return dq5Var;
        }
        dq5Var.b = null;
        return dq5Var;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        Boolean bool = ((dq5) obj).b;
        if (bool != null) {
            z1kVarB.s(h661Var, 0, gpb.a, bool);
        }
        z1kVarB.a(h661Var);
    }
}
