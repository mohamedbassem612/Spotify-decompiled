package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class is5 implements pf40 {
    public static final is5 a;
    private static final h661 descriptor;

    static {
        is5 is5Var = new is5();
        a = is5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.PlaybackPosition", is5Var, 1);
        m0v0Var.j("position_ms", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z(dru.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        Double d = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                d = (Double) x1kVarB.B(h661Var, 0, dru.a, d);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new ks5(i, d);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        Double d = ((ks5) obj).b;
        if (d != null) {
            z1kVarB.s(h661Var, 0, dru.a, d);
        }
        z1kVarB.a(h661Var);
    }
}
