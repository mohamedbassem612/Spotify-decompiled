package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class fp40 implements pf40 {
    public static final fp40 a;
    private static final h661 descriptor;

    static {
        fp40 fp40Var = new fp40();
        a = fp40Var;
        m0v0 m0v0Var = new m0v0("com.spotify.audiobookpremium.cappingdatasource.models.dto.GetQuotaResponse", fp40Var, 4);
        m0v0Var.j("topUps", true);
        m0v0Var.j("monthly", true);
        m0v0Var.j("recurringQuotas", false);
        m0v0Var.j("copy", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = hp40.e;
        return new nma0[]{m5n1.z((nma0) znb0VarArr[0].getValue()), nlz0.a, znb0VarArr[2].getValue(), ulz0.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = hp40.e;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        plz0 plz0Var = null;
        List list2 = null;
        wlz0 wlz0Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                list = (List) x1kVarB.B(h661Var, 0, (nma0) znb0VarArr[0].getValue(), list);
                i |= 1;
            } else if (iP == 1) {
                plz0Var = (plz0) x1kVarB.A(h661Var, 1, nlz0.a, plz0Var);
                i |= 2;
            } else if (iP == 2) {
                list2 = (List) x1kVarB.A(h661Var, 2, (nma0) znb0VarArr[2].getValue(), list2);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                wlz0Var = (wlz0) x1kVarB.A(h661Var, 3, ulz0.a, wlz0Var);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new hp40(i, list, plz0Var, list2, wlz0Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        hp40 hp40Var = (hp40) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = hp40.e;
        List list = hp40Var.a;
        plz0 plz0Var = hp40Var.b;
        if (list != null) {
            z1kVarB.s(h661Var, 0, (nma0) znb0VarArr[0].getValue(), list);
        }
        if (z1kVarB.d0() || !u890.j(plz0Var, new plz0())) {
            z1kVarB.k(h661Var, 1, nlz0.a, plz0Var);
        }
        z1kVarB.k(h661Var, 2, (nma0) znb0VarArr[2].getValue(), hp40Var.c);
        z1kVarB.k(h661Var, 3, ulz0.a, hp40Var.d);
        z1kVarB.a(h661Var);
    }
}
