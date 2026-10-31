package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class y020 implements pf40 {
    public static final y020 a;
    private static final h661 descriptor;

    static {
        y020 y020Var = new y020();
        a = y020Var;
        m0v0 m0v0Var = new m0v0("com.spotify.yourupdates.data.FetchUserHasUnreadNotificationsResponse", y020Var, 1);
        m0v0Var.j("userHasUnreadNotification", false);
        descriptor = m0v0Var;
    }

    @Override // p.pf40
    public final nma0[] childSerializers() {
        return new nma0[]{gpb.a};
    }

    @Override // p.nma0
    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                zM = x1kVarB.M(h661Var, 0);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new a120(i, zM);
    }

    @Override // p.nma0
    public final h661 getDescriptor() {
        return descriptor;
    }

    @Override // p.nma0
    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.E(h661Var, 0, ((a120) obj).a);
        z1kVarB.a(h661Var);
    }
}
