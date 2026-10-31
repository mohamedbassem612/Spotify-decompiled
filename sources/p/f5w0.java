package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class f5w0 implements pf40 {
    public static final f5w0 a;
    private static final h661 descriptor;

    static {
        f5w0 f5w0Var = new f5w0();
        a = f5w0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.listeningactivity.presence.impl.PresencePushPayload", f5w0Var, 2);
        m0v0Var.j("username", false);
        m0v0Var.j("activity", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{chc1.a, m5n1.z(c5w0.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        e5w0 e5w0Var = null;
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
                e5w0Var = (e5w0) x1kVarB.B(h661Var, 1, c5w0.a, e5w0Var);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new h5w0(i, strF, e5w0Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h5w0 h5w0Var = (h5w0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, h5w0Var.a);
        e5w0 e5w0Var = h5w0Var.b;
        if (e5w0Var != null) {
            z1kVarB.s(h661Var, 1, c5w0.a, e5w0Var);
        }
        z1kVarB.a(h661Var);
    }
}
