package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class us5 implements pf40 {
    public static final us5 a;
    private static final h661 descriptor;

    static {
        us5 us5Var = new us5();
        a = us5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.Rating", us5Var, 1);
        m0v0Var.j("rating", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z(wr80.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        boolean z2 = false;
        Integer num = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                num = (Integer) x1kVarB.B(h661Var, 0, wr80.a, num);
                z2 = true;
            }
        }
        x1kVarB.a(h661Var);
        ws5 ws5Var = new ws5();
        if (z2) {
            ws5Var.b = num;
            return ws5Var;
        }
        ws5Var.b = null;
        return ws5Var;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        Integer num = ((ws5) obj).b;
        if (num != null) {
            z1kVarB.s(h661Var, 0, wr80.a, num);
        }
        z1kVarB.a(h661Var);
    }
}
