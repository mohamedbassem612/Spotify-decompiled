package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class tvo implements pf40 {
    public static final tvo a;
    private static final h661 descriptor;

    static {
        tvo tvoVar = new tvo();
        a = tvoVar;
        m0v0 m0v0Var = new m0v0("com.spotify.dsa.settingmonitorimpl.DSARequestBody", tvoVar, 2);
        m0v0Var.j("setting_identifier", false);
        m0v0Var.j("new_value", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{chc1.a, yvo.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        awo awoVar = null;
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
                awoVar = (awo) x1kVarB.A(h661Var, 1, yvo.a, awoVar);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new vvo(i, strF, awoVar);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        vvo vvoVar = (vvo) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, vvoVar.a);
        z1kVarB.k(h661Var, 1, yvo.a, vvoVar.b);
        z1kVarB.a(h661Var);
    }
}
