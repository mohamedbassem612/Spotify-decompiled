package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class urj1 implements pf40 {
    public static final urj1 a;
    private static final h661 descriptor;

    static {
        urj1 urj1Var = new urj1();
        a = urj1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.adsinternal.adscommon.video.VideoPlayerSubscribeRequest", urj1Var, 1);
        m0v0Var.j("is_observer", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{gpb.a};
    }

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
        return new wrj1(i, zM);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        boolean z = ((wrj1) obj).a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || z) {
            z1kVarB.E(h661Var, 0, z);
        }
        z1kVarB.a(h661Var);
    }
}
