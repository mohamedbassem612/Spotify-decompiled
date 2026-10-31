package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class jt21 implements pf40 {
    public static final jt21 a;
    private static final h661 descriptor;

    static {
        jt21 jt21Var = new jt21();
        a = jt21Var;
        m0v0 m0v0Var = new m0v0("com.spotify.voiceassistants.voicepartnerproxy.ResolveAndUpdateEndpointRequest", jt21Var, 7);
        m0v0Var.j("uri", false);
        m0v0Var.j("utterance", false);
        m0v0Var.j("utterance_language", false);
        m0v0Var.j("device", false);
        m0v0Var.j("voice_feature", false);
        m0v0Var.j("initially_paused", false);
        m0v0Var.j("include_alternative_results", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        gpb gpbVar = gpb.a;
        return new nma0[]{chc1Var, chc1Var, chc1Var, kyt0.a, chc1Var, gpbVar, gpbVar};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        boolean zM2 = false;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        myt0 myt0Var = null;
        String strF4 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strF = x1kVarB.f(h661Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strF2 = x1kVarB.f(h661Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strF3 = x1kVarB.f(h661Var, 2);
                    i |= 4;
                    break;
                case 3:
                    myt0Var = (myt0) x1kVarB.A(h661Var, 3, kyt0.a, myt0Var);
                    i |= 8;
                    break;
                case 4:
                    strF4 = x1kVarB.f(h661Var, 4);
                    i |= 16;
                    break;
                case 5:
                    zM = x1kVarB.M(h661Var, 5);
                    i |= 32;
                    break;
                case 6:
                    zM2 = x1kVarB.M(h661Var, 6);
                    i |= 64;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new lt21(i, strF, strF2, strF3, myt0Var, strF4, zM, zM2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        lt21 lt21Var = (lt21) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, lt21Var.a);
        z1kVarB.G(h661Var, 1, lt21Var.b);
        z1kVarB.G(h661Var, 2, lt21Var.c);
        z1kVarB.k(h661Var, 3, kyt0.a, lt21Var.d);
        z1kVarB.G(h661Var, 4, lt21Var.e);
        z1kVarB.E(h661Var, 5, lt21Var.f);
        z1kVarB.E(h661Var, 6, lt21Var.g);
        z1kVarB.a(h661Var);
    }
}
