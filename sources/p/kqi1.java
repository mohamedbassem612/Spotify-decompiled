package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class kqi1 implements pf40 {
    public static final kqi1 a;
    private static final h661 descriptor;

    static {
        kqi1 kqi1Var = new kqi1();
        a = kqi1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.jam.internal.socialconnect.models.V3NewSessionRequest", kqi1Var, 4);
        m0v0Var.j("activate", false);
        m0v0Var.j("local_device_id", false);
        m0v0Var.j("origin", true);
        m0v0Var.j("configuration", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{gpb.a, chc1.a, m5n1.z(ug61.a), m5n1.z(db61.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        String strF = null;
        wg61 wg61Var = null;
        fb61 fb61Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                zM = x1kVarB.M(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                strF = x1kVarB.f(h661Var, 1);
                i |= 2;
            } else if (iP == 2) {
                wg61Var = (wg61) x1kVarB.B(h661Var, 2, ug61.a, wg61Var);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                fb61Var = (fb61) x1kVarB.B(h661Var, 3, db61.a, fb61Var);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new mqi1(i, zM, strF, wg61Var, fb61Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        mqi1 mqi1Var = (mqi1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.E(h661Var, 0, mqi1Var.a);
        z1kVarB.G(h661Var, 1, mqi1Var.b);
        wg61 wg61Var = mqi1Var.c;
        if (wg61Var != null) {
            z1kVarB.s(h661Var, 2, ug61.a, wg61Var);
        }
        fb61 fb61Var = mqi1Var.d;
        if (fb61Var != null) {
            z1kVarB.s(h661Var, 3, db61.a, fb61Var);
        }
        z1kVarB.a(h661Var);
    }
}
