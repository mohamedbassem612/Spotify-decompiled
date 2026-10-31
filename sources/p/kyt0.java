package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class kyt0 implements pf40 {
    public static final kyt0 a;
    private static final h661 descriptor;

    static {
        kyt0 kyt0Var = new kyt0();
        a = kyt0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.voiceassistants.voicepartnerproxy.PlaybackDevice", kyt0Var, 4);
        m0v0Var.j("id", false);
        m0v0Var.j("type", false);
        m0v0Var.j("brand", false);
        m0v0Var.j("model", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, chc1Var, chc1Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                strF2 = x1kVarB.f(h661Var, 1);
                i |= 2;
            } else if (iP == 2) {
                strF3 = x1kVarB.f(h661Var, 2);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                strF4 = x1kVarB.f(h661Var, 3);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new myt0(i, strF, strF2, strF3, strF4);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        myt0 myt0Var = (myt0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, myt0Var.a);
        z1kVarB.G(h661Var, 1, myt0Var.b);
        z1kVarB.G(h661Var, 2, myt0Var.c);
        z1kVarB.G(h661Var, 3, myt0Var.d);
        z1kVarB.a(h661Var);
    }
}
