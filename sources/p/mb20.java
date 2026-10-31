package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class mb20 implements pf40 {
    public static final mb20 a;
    private static final h661 descriptor;

    static {
        mb20 mb20Var = new mb20();
        a = mb20Var;
        m0v0 m0v0Var = new m0v0("com.spotify.campaigns.wrapped.ytsfiltersharing.impl.FilterPillMetadata", mb20Var, 2);
        m0v0Var.j("filter_pills_enabled", false);
        m0v0Var.j("filter_pill_info", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{gpb.a, vb20.c[1].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = vb20.c;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        List list = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                zM = x1kVarB.M(h661Var, 0);
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
        return new vb20(i, zM, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        vb20 vb20Var = (vb20) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = vb20.c;
        z1kVarB.E(h661Var, 0, vb20Var.a);
        z1kVarB.k(h661Var, 1, (nma0) znb0VarArr[1].getValue(), vb20Var.b);
        z1kVarB.a(h661Var);
    }
}
