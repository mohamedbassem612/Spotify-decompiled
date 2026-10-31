package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class yd51 implements pf40 {
    public static final yd51 a;
    private static final h661 descriptor;

    static {
        yd51 yd51Var = new yd51();
        a = yd51Var;
        descriptor = new m0v0("com.spotify.yourupdates.domain.models.SecondaryAction.DeleteNotification", yd51Var, 0);
    }

    public final nma0[] childSerializers() {
        return new nma0[0];
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        int iP = x1kVarB.p(h661Var);
        if (iP == -1) {
            x1kVarB.a(h661Var);
            return new ae51();
        }
        n9v.a(iP);
        return null;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        zd51 zd51Var = ae51.Companion;
        z1kVarB.a(h661Var);
    }
}
