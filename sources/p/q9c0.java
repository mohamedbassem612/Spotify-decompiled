package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class q9c0 implements pf40 {
    public static final q9c0 a;
    private static final h661 descriptor;

    static {
        q9c0 q9c0Var = new q9c0();
        a = q9c0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.liveroom.listeningpartymessagesourceapi.api.LifecycleChannelEvent.GoLiveEvent", q9c0Var, 2);
        m0v0Var.j("common", false);
        m0v0Var.j("goLive", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{dsh.a, hy40.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        fsh fshVar = null;
        jy40 jy40Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                fshVar = (fsh) x1kVarB.A(h661Var, 0, dsh.a, fshVar);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                jy40Var = (jy40) x1kVarB.A(h661Var, 1, hy40.a, jy40Var);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new s9c0(i, fshVar, jy40Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        s9c0 s9c0Var = (s9c0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, dsh.a, s9c0Var.a);
        z1kVarB.k(h661Var, 1, hy40.a, s9c0Var.b);
        z1kVarB.a(h661Var);
    }
}
