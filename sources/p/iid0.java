package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class iid0 implements pf40 {
    public static final iid0 a;
    private static final h661 descriptor;

    static {
        iid0 iid0Var = new iid0();
        a = iid0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.audiobookpremium.listeninghoursrequest.ListeningHoursRequestResponse", iid0Var, 1);
        m0v0Var.j("result", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{kid0.b[0].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = kid0.b;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        mid0 mid0Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                mid0Var = (mid0) x1kVarB.A(h661Var, 0, (nma0) znb0VarArr[0].getValue(), mid0Var);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new kid0(i, mid0Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, (nma0) kid0.b[0].getValue(), ((kid0) obj).a);
        z1kVarB.a(h661Var);
    }
}
