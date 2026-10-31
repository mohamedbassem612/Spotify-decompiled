package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class vcm0 implements pf40 {
    public static final vcm0 a;
    private static final h661 descriptor;

    static {
        vcm0 vcm0Var = new vcm0();
        a = vcm0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.campaigns.wrappedpartyvtecintegration.domain.ModOutgoingMessage.ChatInitialMessages", vcm0Var, 2);
        m0v0Var.j("hierarchyId", false);
        m0v0Var.j("messages", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{chc1.a, xcm0.c[1].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = xcm0.c;
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
        return new xcm0(strF, list, i);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        xcm0 xcm0Var = (xcm0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = xcm0.c;
        z1kVarB.G(h661Var, 0, xcm0Var.a);
        z1kVarB.k(h661Var, 1, (nma0) znb0VarArr[1].getValue(), xcm0Var.b);
        z1kVarB.a(h661Var);
    }
}
