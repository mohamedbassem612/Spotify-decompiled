package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class e6h1 implements pf40 {
    public static final e6h1 a;
    private static final h661 descriptor;

    static {
        e6h1 e6h1Var = new e6h1();
        a = e6h1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.ubi.logger.UbiContextualSources", e6h1Var, 2);
        m0v0Var.j("sources", false);
        m0v0Var.j("sourcePathsUnavailableReason", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = g6h1.c;
        return new nma0[]{znb0VarArr[0].getValue(), m5n1.z((nma0) znb0VarArr[1].getValue())};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = g6h1.c;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        mla1 mla1Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                list = (List) x1kVarB.A(h661Var, 0, (nma0) znb0VarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                mla1Var = (mla1) x1kVarB.B(h661Var, 1, (nma0) znb0VarArr[1].getValue(), mla1Var);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new g6h1(i, list, mla1Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        g6h1 g6h1Var = (g6h1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = g6h1.c;
        nma0 nma0Var = (nma0) znb0VarArr[0].getValue();
        List list = g6h1Var.a;
        mla1 mla1Var = g6h1Var.b;
        z1kVarB.k(h661Var, 0, nma0Var, list);
        if (z1kVarB.d0() || mla1Var != null) {
            z1kVarB.s(h661Var, 1, (nma0) znb0VarArr[1].getValue(), mla1Var);
        }
        z1kVarB.a(h661Var);
    }
}
