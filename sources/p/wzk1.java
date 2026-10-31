package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class wzk1 implements pf40 {
    public static final wzk1 a;
    private static final h661 descriptor;

    static {
        wzk1 wzk1Var = new wzk1();
        a = wzk1Var;
        m0v0 m0v0Var = new m0v0("didDismissShare", wzk1Var, 2);
        m0v0Var.j("requestId", false);
        m0v0Var.j("success", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{wr80.a, gpb.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        int iO = 0;
        boolean zM = false;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                iO = x1kVarB.o(h661Var, 0);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                zM = x1kVarB.M(h661Var, 1);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new yzk1(i, iO, zM);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        yzk1 yzk1Var = (yzk1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.e(0, yzk1Var.b, h661Var);
        z1kVarB.E(h661Var, 1, yzk1Var.c);
        z1kVarB.a(h661Var);
    }
}
