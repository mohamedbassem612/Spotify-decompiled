package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class kb20 implements pf40 {
    public static final kb20 a;
    private static final h661 descriptor;

    static {
        kb20 kb20Var = new kb20();
        a = kb20Var;
        m0v0 m0v0Var = new m0v0("com.spotify.listuxplatformconsumers.blend.shared.api.FilterPillMetadata", kb20Var, 2);
        m0v0Var.j("filter_pills_enabled", false);
        m0v0Var.j("filter_pill_info", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{gpb.a, tb20.c[1].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = tb20.c;
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
        return new tb20(i, zM, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        tb20 tb20Var = (tb20) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = tb20.c;
        z1kVarB.E(h661Var, 0, tb20Var.a);
        z1kVarB.k(h661Var, 1, (nma0) znb0VarArr[1].getValue(), tb20Var.b);
        z1kVarB.a(h661Var);
    }
}
