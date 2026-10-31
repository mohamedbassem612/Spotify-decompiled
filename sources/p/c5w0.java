package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class c5w0 implements pf40 {
    public static final c5w0 a;
    private static final h661 descriptor;

    static {
        c5w0 c5w0Var = new c5w0();
        a = c5w0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.listeningactivity.presence.impl.PresencePushActivity", c5w0Var, 4);
        m0v0Var.j("uri", false);
        m0v0Var.j("isPlaying", false);
        m0v0Var.j("timestamp", true);
        m0v0Var.j("contextUri", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        return new nma0[]{nma0Var, gpb.a, m5n1.z(dru.a), m5n1.z(nma0Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        String strF = null;
        Double d = null;
        String str = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                zM = x1kVarB.M(h661Var, 1);
                i |= 2;
            } else if (iP == 2) {
                d = (Double) x1kVarB.B(h661Var, 2, dru.a, d);
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
        return new e5w0(i, strF, zM, d, str);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        e5w0 e5w0Var = (e5w0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, e5w0Var.a);
        z1kVarB.E(h661Var, 1, e5w0Var.b);
        Double d = e5w0Var.c;
        if (d != null) {
            z1kVarB.s(h661Var, 2, dru.a, d);
        }
        String str = e5w0Var.d;
        if (str != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str);
        }
        z1kVarB.a(h661Var);
    }
}
