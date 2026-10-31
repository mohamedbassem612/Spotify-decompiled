package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class bas0 implements pf40 {
    public static final bas0 a;
    private static final h661 descriptor;

    static {
        bas0 bas0Var = new bas0();
        a = bas0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.liveroom.listeningpartymessagesourceapi.api.PauseMessage", bas0Var, 1);
        m0v0Var.j("seekTime", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z(chc1.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new das0(i, str);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        String str = ((das0) obj).a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        z1kVarB.a(h661Var);
    }
}
