package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class q4b0 implements pf40 {
    public static final q4b0 a;
    private static final h661 descriptor;

    static {
        q4b0 q4b0Var = new q4b0();
        a = q4b0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.messaging.actionsimpl.kodak.KodakImageRequestBody", q4b0Var, 3);
        m0v0Var.j("creative_id", false);
        m0v0Var.j("width", false);
        m0v0Var.j("height", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        wr80 wr80Var = wr80.a;
        return new nma0[]{o5f0.a, wr80Var, wr80Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        int i = 0;
        int iO = 0;
        int iO2 = 0;
        long jI0 = 0;
        boolean z = true;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                jI0 = x1kVarB.i0(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                iO = x1kVarB.o(h661Var, 1);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                iO2 = x1kVarB.o(h661Var, 2);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new s4b0(jI0, i, iO, iO2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        s4b0 s4b0Var = (s4b0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.l(h661Var, 0, s4b0Var.a);
        z1kVarB.e(1, s4b0Var.b, h661Var);
        z1kVarB.e(2, s4b0Var.c, h661Var);
        z1kVarB.a(h661Var);
    }
}
