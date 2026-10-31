package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class d0c1 implements pf40 {
    public static final d0c1 a;
    private static final h661 descriptor;

    static {
        d0c1 d0c1Var = new d0c1();
        a = d0c1Var;
        descriptor = new m0v0("com.spotify.liveroom.listeningpartymessagesourceapi.api.StopMessage", d0c1Var, 0);
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
            return new f0c1();
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
