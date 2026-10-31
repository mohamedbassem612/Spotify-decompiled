package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class fps implements pf40 {
    public static final fps a;
    private static final h661 descriptor;

    static {
        fps fpsVar = new fps();
        a = fpsVar;
        m0v0 m0v0Var = new m0v0("unPlayedOnly", fpsVar, 0);
        m0v0Var.k(new yos());
        descriptor = m0v0Var;
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
            return new hps();
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
