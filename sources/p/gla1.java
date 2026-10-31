package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class gla1 implements pf40 {
    public static final gla1 a;
    private static final h661 descriptor;

    static {
        gla1 gla1Var = new gla1();
        a = gla1Var;
        m0v0 m0v0Var = new m0v0("missing_context", gla1Var, 1);
        m0v0Var.j("additionalContext", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{chc1.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                strF = x1kVarB.f(h661Var, 0);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new ila1(i, strF);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, ((ila1) obj).b);
        z1kVarB.a(h661Var);
    }
}
