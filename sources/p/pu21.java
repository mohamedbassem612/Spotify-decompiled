package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class pu21 implements pf40 {
    public static final pu21 a;
    private static final h661 descriptor;

    static {
        pu21 pu21Var = new pu21();
        a = pu21Var;
        m0v0 m0v0Var = new m0v0("com.spotify.jam.internal.socialconnect.models.ResolveTokensResponse", pu21Var, 1);
        m0v0Var.j("resolved_jams", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{ru21.b[0].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = ru21.b;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                list = (List) x1kVarB.A(h661Var, 0, (nma0) znb0VarArr[0].getValue(), list);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new ru21(i, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, (nma0) ru21.b[0].getValue(), ((ru21) obj).a);
        z1kVarB.a(h661Var);
    }
}
