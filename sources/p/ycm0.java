package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class ycm0 implements pf40 {
    public static final ycm0 a;
    private static final h661 descriptor;

    static {
        ycm0 ycm0Var = new ycm0();
        a = ycm0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.campaigns.wrappedpartyvtecintegration.domain.ModOutgoingMessage.ChatNewMessage", ycm0Var, 2);
        m0v0Var.j("hierarchyId", false);
        m0v0Var.j("message", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{chc1.a, fbf.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        jbf jbfVar = null;
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
                jbfVar = (jbf) x1kVarB.A(h661Var, 1, fbf.a, jbfVar);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new adm0(i, strF, jbfVar);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        adm0 adm0Var = (adm0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, adm0Var.a);
        z1kVarB.k(h661Var, 1, fbf.a, adm0Var.b);
        z1kVarB.a(h661Var);
    }
}
