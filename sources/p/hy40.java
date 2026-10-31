package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class hy40 implements pf40 {
    public static final hy40 a;
    private static final h661 descriptor;

    static {
        hy40 hy40Var = new hy40();
        a = hy40Var;
        descriptor = new m0v0("com.spotify.liveroom.listeningpartymessagesourceapi.api.GoLiveMessage", hy40Var, 0);
    }

    public final nma0[] childSerializers() {
        return new nma0[0];
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        int iP = x1kVarB.p(h661Var);
        if (iP == -1) {
            x1kVarB.a(h661Var);
            return new jy40();
        }
        n9v.a(iP);
        return null;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        uaxVar.b(h661Var).a(h661Var);
    }
}
