package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class m3c1 implements pf40 {
    public static final m3c1 a;
    private static final h661 descriptor;

    static {
        m3c1 m3c1Var = new m3c1();
        a = m3c1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.remoteconfig.temporarypropertyoverrides.StoredOverride", m3c1Var, 2);
        m0v0Var.j("value", false);
        m0v0Var.j("expiresAtMillis", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{gpb.a, o5f0.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        long jI0 = 0;
        boolean z = true;
        int i = 0;
        boolean zM = false;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                zM = x1kVarB.M(h661Var, 0);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                jI0 = x1kVarB.i0(h661Var, 1);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new o3c1(jI0, zM, i);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        o3c1 o3c1Var = (o3c1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.E(h661Var, 0, o3c1Var.a);
        z1kVarB.l(h661Var, 1, o3c1Var.b);
        z1kVarB.a(h661Var);
    }
}
