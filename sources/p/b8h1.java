package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class b8h1 implements pf40 {
    public static final b8h1 a;
    private static final h661 descriptor;

    static {
        b8h1 b8h1Var = new b8h1();
        a = b8h1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.ubi.logger.UbiInteractionSource", b8h1Var, 3);
        m0v0Var.j("interactionId", false);
        m0v0Var.j("pageInstanceId", false);
        m0v0Var.j("location", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{mu80.a, m5n1.z(w6r0.a), s6h1.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        ou80 ou80Var = null;
        y6r0 y6r0Var = null;
        r6h1 r6h1Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                ou80Var = (ou80) x1kVarB.A(h661Var, 0, mu80.a, ou80Var);
                i |= 1;
            } else if (iP == 1) {
                y6r0Var = (y6r0) x1kVarB.B(h661Var, 1, w6r0.a, y6r0Var);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                r6h1Var = (r6h1) x1kVarB.A(h661Var, 2, s6h1.a, r6h1Var);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new d8h1(i, ou80Var, y6r0Var, r6h1Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        d8h1 d8h1Var = (d8h1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, mu80.a, d8h1Var.a);
        z1kVarB.s(h661Var, 1, w6r0.a, d8h1Var.b);
        z1kVarB.k(h661Var, 2, s6h1.a, d8h1Var.c);
        z1kVarB.a(h661Var);
    }
}
