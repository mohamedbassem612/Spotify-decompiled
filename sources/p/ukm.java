package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class ukm implements pf40 {
    public static final ukm a;
    private static final h661 descriptor;

    static {
        ukm ukmVar = new ukm();
        a = ukmVar;
        m0v0 m0v0Var = new m0v0("com.spotify.betamax.contextplayercoordinatorimpl.model.ContextPlayerOptions", ukmVar, 3);
        m0v0Var.j("shuffling_context", false);
        m0v0Var.j("repeating_context", false);
        m0v0Var.j("repeating_track", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        gpb gpbVar = gpb.a;
        return new nma0[]{gpbVar, gpbVar, gpbVar};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                zM = x1kVarB.M(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                zM2 = x1kVarB.M(h661Var, 1);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                zM3 = x1kVarB.M(h661Var, 2);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new wkm(i, zM, zM2, zM3);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        wkm wkmVar = (wkm) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.E(h661Var, 0, wkmVar.a);
        z1kVarB.E(h661Var, 1, wkmVar.b);
        z1kVarB.E(h661Var, 2, wkmVar.c);
        z1kVarB.a(h661Var);
    }
}
