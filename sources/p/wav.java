package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class wav implements pf40 {
    public static final wav a;
    private static final h661 descriptor;

    static {
        wav wavVar = new wav();
        a = wavVar;
        m0v0 m0v0Var = new m0v0("com.spotify.adsdisplay.dsa.datasource.DsaMetadataResponse", wavVar, 3);
        m0v0Var.j("targetingTypes", false);
        m0v0Var.j("legalEntityName", false);
        m0v0Var.j("showTailoredAdsSection", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{yav.d[0].getValue(), chc1.a, gpb.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = yav.d;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        List list = null;
        String strF = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                list = (List) x1kVarB.A(h661Var, 0, (nma0) znb0VarArr[0].getValue(), list);
                i |= 1;
            } else if (iP == 1) {
                strF = x1kVarB.f(h661Var, 1);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                zM = x1kVarB.M(h661Var, 2);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new yav(i, strF, list, zM);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        yav yavVar = (yav) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, (nma0) yav.d[0].getValue(), yavVar.a);
        z1kVarB.G(h661Var, 1, yavVar.b);
        z1kVarB.E(h661Var, 2, yavVar.c);
        z1kVarB.a(h661Var);
    }
}
