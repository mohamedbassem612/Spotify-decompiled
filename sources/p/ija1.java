package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class ija1 implements pf40 {
    public static final ija1 a;
    private static final h661 descriptor;

    static {
        ija1 ija1Var = new ija1();
        a = ija1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.listplatform.sortingimpl.SortingModel", ija1Var, 1);
        m0v0Var.j("map", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z(dmm.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        Map map = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                map = (Map) x1kVarB.B(h661Var, 0, dmm.a, map);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new kja1(i, map);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        Map map = ((kja1) obj).a;
        if (map != null) {
            z1kVarB.s(h661Var, 0, dmm.a, map);
        }
        z1kVarB.a(h661Var);
    }
}
