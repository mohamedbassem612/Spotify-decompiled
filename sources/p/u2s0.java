package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class u2s0 implements pf40 {
    public static final u2s0 a;
    private static final h661 descriptor;

    static {
        u2s0 u2s0Var = new u2s0();
        a = u2s0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.partnerapps.domain.api.PartnerIntegrationsResponse", u2s0Var, 2);
        m0v0Var.j("categoryId", false);
        m0v0Var.j("partnerIntegrations", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{chc1.a, w2s0.c[1].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = w2s0.c;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        List list = null;
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
                list = (List) x1kVarB.A(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new w2s0(strF, list, i);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        w2s0 w2s0Var = (w2s0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = w2s0.c;
        z1kVarB.G(h661Var, 0, w2s0Var.a);
        z1kVarB.k(h661Var, 1, (nma0) znb0VarArr[1].getValue(), w2s0Var.b);
        z1kVarB.a(h661Var);
    }
}
