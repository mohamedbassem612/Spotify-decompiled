package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class oth0 implements pf40 {
    public static final oth0 a;
    private static final h661 descriptor;

    static {
        oth0 oth0Var = new oth0();
        a = oth0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.liveroom.listeningpartymessagesourceapi.api.MediaPlaybackChannelEvent.StopEvent", oth0Var, 3);
        m0v0Var.j("common", false);
        m0v0Var.j("previousEventUuid", true);
        m0v0Var.j("stop", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{dsh.a, m5n1.z(chc1.a), d0c1.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        fsh fshVar = null;
        String str = null;
        f0c1 f0c1Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                fshVar = (fsh) x1kVarB.A(h661Var, 0, dsh.a, fshVar);
                i |= 1;
            } else if (iP == 1) {
                str = (String) x1kVarB.B(h661Var, 1, chc1.a, str);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                f0c1Var = (f0c1) x1kVarB.A(h661Var, 2, d0c1.a, f0c1Var);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new qth0(i, fshVar, str, f0c1Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        qth0 qth0Var = (qth0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        dsh dshVar = dsh.a;
        fsh fshVar = qth0Var.a;
        String str = qth0Var.b;
        z1kVarB.k(h661Var, 0, dshVar, fshVar);
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str);
        }
        z1kVarB.k(h661Var, 2, d0c1.a, qth0Var.c);
        z1kVarB.a(h661Var);
    }
}
