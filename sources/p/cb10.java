package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class cb10 implements pf40 {
    public static final cb10 a;
    private static final h661 descriptor;

    static {
        cb10 cb10Var = new cb10();
        a = cb10Var;
        m0v0 m0v0Var = new m0v0("com.spotify.puffin.core.data.ExternalizationDisabledResponse", cb10Var, 4);
        m0v0Var.j("id", false);
        m0v0Var.j("filterFiles", false);
        m0v0Var.j("revision", false);
        m0v0Var.j("format", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = eb10.e;
        wr80 wr80Var = wr80.a;
        return new nma0[]{chc1.a, znb0VarArr[1].getValue(), wr80Var, wr80Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = eb10.e;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        int iO = 0;
        int iO2 = 0;
        String strF = null;
        List list = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                list = (List) x1kVarB.A(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list);
                i |= 2;
            } else if (iP == 2) {
                iO = x1kVarB.o(h661Var, 2);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                iO2 = x1kVarB.o(h661Var, 3);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new eb10(i, iO, iO2, strF, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        eb10 eb10Var = (eb10) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = eb10.e;
        z1kVarB.G(h661Var, 0, eb10Var.a);
        z1kVarB.k(h661Var, 1, (nma0) znb0VarArr[1].getValue(), eb10Var.b);
        z1kVarB.e(2, eb10Var.c, h661Var);
        z1kVarB.e(3, eb10Var.d, h661Var);
        z1kVarB.a(h661Var);
    }
}
