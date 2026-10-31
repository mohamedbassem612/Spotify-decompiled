package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class cs5 implements pf40 {
    public static final cs5 a;
    private static final h661 descriptor;

    static {
        cs5 cs5Var = new cs5();
        a = cs5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.Message", cs5Var, 1);
        m0v0Var.j("message", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z(chc1.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        boolean z2 = false;
        String str = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                z2 = true;
            }
        }
        x1kVarB.a(h661Var);
        es5 es5Var = new es5();
        if (z2) {
            es5Var.b = str;
            return es5Var;
        }
        es5Var.b = null;
        return es5Var;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = ((es5) obj).b;
        if (str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        z1kVarB.a(h661Var);
    }
}
