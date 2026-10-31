package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class tnd0 implements pf40 {
    public static final tnd0 a;
    private static final h661 descriptor;

    static {
        tnd0 tnd0Var = new tnd0();
        a = tnd0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.betamax.live.LiveEventMetadata", tnd0Var, 2);
        m0v0Var.j("title", true);
        m0v0Var.j("urlTemplate", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String strF2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                strF2 = x1kVarB.f(h661Var, 1);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new vnd0(i, strF, strF2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        vnd0 vnd0Var = (vnd0) obj;
        String str = vnd0Var.b;
        String str2 = vnd0Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || !u890.j(str2, "Live event")) {
            z1kVarB.G(h661Var, 0, str2);
        }
        if (z1kVarB.d0() || !u890.j(str, "https://betamax.akamaized.net/cmaf/live/2003445/{eventid}/master.m3u8")) {
            z1kVarB.G(h661Var, 1, str);
        }
        z1kVarB.a(h661Var);
    }
}
