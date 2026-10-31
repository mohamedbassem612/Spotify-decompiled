package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class h291 implements pf40 {
    public static final h291 a;
    private static final h661 descriptor;

    static {
        h291 h291Var = new h291();
        a = h291Var;
        m0v0 m0v0Var = new m0v0("com.spotify.thestage.vtec.datasource.SiteResponseErrorBody", h291Var, 3);
        m0v0Var.j("message", false);
        m0v0Var.j("code", false);
        m0v0Var.j("details", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{chc1.a, wr80.a, j291.d[2].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = j291.d;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        int iO = 0;
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
                iO = x1kVarB.o(h661Var, 1);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                list = (List) x1kVarB.A(h661Var, 2, (nma0) znb0VarArr[2].getValue(), list);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new j291(strF, i, iO, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        j291 j291Var = (j291) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = j291.d;
        z1kVarB.G(h661Var, 0, j291Var.a);
        z1kVarB.e(1, j291Var.b, h661Var);
        z1kVarB.k(h661Var, 2, (nma0) znb0VarArr[2].getValue(), j291Var.c);
        z1kVarB.a(h661Var);
    }
}
