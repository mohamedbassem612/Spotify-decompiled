package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class v661 implements pf40 {
    public static final v661 a;
    private static final h661 descriptor;

    static {
        v661 v661Var = new v661();
        a = v661Var;
        m0v0 m0v0Var = new m0v0("com.spotify.follow.manager.SerializedCounts", v661Var, 1);
        m0v0Var.j("counts", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{y661.b[0].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = y661.b;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        t9n[] t9nVarArr = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                t9nVarArr = (t9n[]) x1kVarB.A(h661Var, 0, (nma0) znb0VarArr[0].getValue(), t9nVarArr);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new y661(i, t9nVarArr);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, (nma0) y661.b[0].getValue(), ((y661) obj).a);
        z1kVarB.a(h661Var);
    }
}
