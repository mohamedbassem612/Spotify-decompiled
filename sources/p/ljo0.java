package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class ljo0 implements pf40 {
    public static final ljo0 a;
    private static final h661 descriptor;

    static {
        ljo0 ljo0Var = new ljo0();
        a = ljo0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.yourupdates.domain.models.NotificationAction", ljo0Var, 2);
        m0v0Var.j("uri", false);
        m0v0Var.j("type", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{chc1.a, pjo0.c[1].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = pjo0.c;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        v80 v80Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                v80Var = (v80) x1kVarB.A(h661Var, 1, (nma0) znb0VarArr[1].getValue(), v80Var);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new pjo0(i, strF, v80Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        pjo0 pjo0Var = (pjo0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = pjo0.c;
        z1kVarB.G(h661Var, 0, pjo0Var.a);
        z1kVarB.k(h661Var, 1, (nma0) znb0VarArr[1].getValue(), pjo0Var.b);
        z1kVarB.a(h661Var);
    }
}
