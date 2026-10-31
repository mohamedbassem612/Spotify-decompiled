package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class fqc implements pf40 {
    public static final fqc a;
    private static final h661 descriptor;

    static {
        fqc fqcVar = new fqc();
        a = fqcVar;
        m0v0 m0v0Var = new m0v0("com.spotify.musicquiz.soundeffectcacheimpl.CacheEntry", fqcVar, 3);
        m0v0Var.j("sizeBytes", false);
        m0v0Var.j("createdAtMillis", false);
        m0v0Var.j("lastAccessedAtMillis", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        o5f0 o5f0Var = o5f0.a;
        return new nma0[]{o5f0Var, o5f0Var, o5f0Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        int i = 0;
        long jI0 = 0;
        long jI1 = 0;
        long jI2 = 0;
        boolean z = true;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                jI0 = x1kVarB.i0(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                jI1 = x1kVarB.i0(h661Var, 1);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                jI2 = x1kVarB.i0(h661Var, 2);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new iqc(i, jI0, jI1, jI2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        iqc iqcVar = (iqc) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.l(h661Var, 0, iqcVar.a);
        z1kVarB.l(h661Var, 1, iqcVar.b);
        z1kVarB.l(h661Var, 2, iqcVar.c);
        z1kVarB.a(h661Var);
    }
}
