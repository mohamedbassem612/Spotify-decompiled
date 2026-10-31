package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class k3l1 implements pf40 {
    public static final k3l1 a;
    private static final h661 descriptor;

    static {
        k3l1 k3l1Var = new k3l1();
        a = k3l1Var;
        m0v0 m0v0Var = new m0v0("didSendModMessage", k3l1Var, 1);
        m0v0Var.j("payload", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{hdm0.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        jdm0 jdm0Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                jdm0Var = (jdm0) x1kVarB.A(h661Var, 0, hdm0.a, jdm0Var);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new m3l1(i, jdm0Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        l3l1 l3l1Var = m3l1.Companion;
        z1kVarB.k(h661Var, 0, hdm0.a, ((m3l1) obj).b);
        z1kVarB.a(h661Var);
    }
}
