package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class efd0 implements pf40 {
    public static final efd0 a;
    private static final h661 descriptor;

    static {
        efd0 efd0Var = new efd0();
        a = efd0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.listeningactivity.data.impl.ListeningActivityPayload", efd0Var, 4);
        m0v0Var.j("uri", false);
        m0v0Var.j("contextUri", true);
        m0v0Var.j("isPlaying", false);
        m0v0Var.j("timestamp", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        return new nma0[]{nma0Var, m5n1.z(nma0Var), gpb.a, dru.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        int i = 0;
        boolean zM = false;
        String strF = null;
        String str = null;
        double D = 0.0d;
        boolean z = true;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                str = (String) x1kVarB.B(h661Var, 1, chc1.a, str);
                i |= 2;
            } else if (iP == 2) {
                zM = x1kVarB.M(h661Var, 2);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                D = x1kVarB.D(h661Var, 3);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new gfd0(i, strF, str, zM, D);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        gfd0 gfd0Var = (gfd0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, gfd0Var.a);
        String str = gfd0Var.b;
        if (str != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str);
        }
        z1kVarB.E(h661Var, 2, gfd0Var.c);
        z1kVarB.g(h661Var, 3, gfd0Var.d);
        z1kVarB.a(h661Var);
    }
}
