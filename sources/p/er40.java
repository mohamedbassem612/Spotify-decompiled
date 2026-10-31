package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class er40 implements pf40 {
    public static final er40 a;
    private static final h661 descriptor;

    static {
        er40 er40Var = new er40();
        a = er40Var;
        m0v0 m0v0Var = new m0v0("com.spotify.puffin.crossdevicesyncing.data.GetUserFiltersResponse", er40Var, 3);
        m0v0Var.j("supportedDevices", false);
        m0v0Var.j("unsupportedDevices", false);
        m0v0Var.j("genericFilters", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = gr40.d;
        return new nma0[]{znb0VarArr[0].getValue(), znb0VarArr[1].getValue(), wh40.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = gr40.d;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        yh40 yh40Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                list = (List) x1kVarB.A(h661Var, 0, (nma0) znb0VarArr[0].getValue(), list);
                i |= 1;
            } else if (iP == 1) {
                list2 = (List) x1kVarB.A(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list2);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                yh40Var = (yh40) x1kVarB.A(h661Var, 2, wh40.a, yh40Var);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new gr40(i, list, list2, yh40Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        gr40 gr40Var = (gr40) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = gr40.d;
        z1kVarB.k(h661Var, 0, (nma0) znb0VarArr[0].getValue(), gr40Var.a);
        z1kVarB.k(h661Var, 1, (nma0) znb0VarArr[1].getValue(), gr40Var.b);
        z1kVarB.k(h661Var, 2, wh40.a, gr40Var.c);
        z1kVarB.a(h661Var);
    }
}
