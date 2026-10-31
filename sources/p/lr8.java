package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class lr8 implements pf40 {
    public static final lr8 a;
    private static final h661 descriptor;

    static {
        lr8 lr8Var = new lr8();
        a = lr8Var;
        m0v0 m0v0Var = new m0v0("com.spotify.wear.wearabledatalayer.AuthorizeResponse", lr8Var, 1);
        m0v0Var.j("auth_code", false);
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
        if (1 != i) {
            o6p1.t(i, 1, descriptor);
            throw null;
        }
        nr8 nr8Var = new nr8();
        nr8Var.a = strF;
        return nr8Var;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, ((nr8) obj).a);
        z1kVarB.a(h661Var);
    }
}
