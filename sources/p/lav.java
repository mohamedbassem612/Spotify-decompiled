package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class lav implements pf40 {
    public static final lav a;
    private static final h661 descriptor;

    static {
        lav lavVar = new lav();
        a = lavVar;
        m0v0 m0v0Var = new m0v0("com.spotify.eventsender.droppedevents.DroppedCounts", lavVar, 2);
        m0v0Var.j("s", true);
        m0v0Var.j("r", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        o5f0 o5f0Var = o5f0.a;
        return new nma0[]{o5f0Var, o5f0Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        long jI0 = 0;
        long jI1 = 0;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                jI0 = x1kVarB.i0(h661Var, 0);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                jI1 = x1kVarB.i0(h661Var, 1);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        nav navVar = new nav();
        if ((i & 1) == 0) {
            navVar.a = 0L;
        } else {
            navVar.a = jI0;
        }
        if ((i & 2) == 0) {
            navVar.b = 0L;
            return navVar;
        }
        navVar.b = jI1;
        return navVar;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        nav navVar = (nav) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || navVar.a != 0) {
            z1kVarB.l(h661Var, 0, navVar.a);
        }
        if (z1kVarB.d0() || navVar.b != 0) {
            z1kVarB.l(h661Var, 1, navVar.b);
        }
        z1kVarB.a(h661Var);
    }
}
