package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class rs5 implements pf40 {
    public static final rs5 a;
    private static final h661 descriptor;

    static {
        rs5 rs5Var = new rs5();
        a = rs5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.PodcastPlaybackSpeed", rs5Var, 1);
        m0v0Var.j("podcast_playback_speed", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z(er20.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        boolean z2 = false;
        Float f = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                f = (Float) x1kVarB.B(h661Var, 0, er20.a, f);
                z2 = true;
            }
        }
        x1kVarB.a(h661Var);
        ts5 ts5Var = new ts5();
        if (z2) {
            ts5Var.b = f;
            return ts5Var;
        }
        ts5Var.b = null;
        return ts5Var;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        Float f = ((ts5) obj).b;
        if (f != null) {
            z1kVarB.s(h661Var, 0, er20.a, f);
        }
        z1kVarB.a(h661Var);
    }
}
