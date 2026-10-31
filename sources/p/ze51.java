package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class ze51 implements pf40 {
    public static final ze51 a;
    private static final h661 descriptor;

    static {
        ze51 ze51Var = new ze51();
        a = ze51Var;
        m0v0 m0v0Var = new m0v0("com.spotify.externalintegration.http.Section", ze51Var, 2);
        m0v0Var.j("title", true);
        m0v0Var.j("items", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z(chc1.a), sf51.c[1].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = sf51.c;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
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
        return new sf51(str, list, i);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        sf51 sf51Var = (sf51) obj;
        String str = sf51Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = sf51.c;
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        z1kVarB.k(h661Var, 1, (nma0) znb0VarArr[1].getValue(), sf51Var.b);
        z1kVarB.a(h661Var);
    }
}
