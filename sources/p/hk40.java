package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class hk40 implements pf40 {
    public static final hk40 a;
    private static final h661 descriptor;

    static {
        hk40 hk40Var = new hk40();
        a = hk40Var;
        m0v0 m0v0Var = new m0v0("com.spotify.adsdisplay.adsprivacycenter.GetAdCategoryAdPreferencesResponse", hk40Var, 2);
        m0v0Var.j("adCategoryAdPreferences", true);
        m0v0Var.j("isOptedInToTailoredAds", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z((nma0) jk40.c[0].getValue()), m5n1.z(gpb.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = jk40.c;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        Boolean bool = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                list = (List) x1kVarB.B(h661Var, 0, (nma0) znb0VarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                bool = (Boolean) x1kVarB.B(h661Var, 1, gpb.a, bool);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new jk40(i, list, bool);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        jk40 jk40Var = (jk40) obj;
        Boolean bool = jk40Var.b;
        List list = jk40Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = jk40.c;
        if (z1kVarB.d0() || list != null) {
            z1kVarB.s(h661Var, 0, (nma0) znb0VarArr[0].getValue(), list);
        }
        if (z1kVarB.d0() || bool != null) {
            z1kVarB.s(h661Var, 1, gpb.a, bool);
        }
        z1kVarB.a(h661Var);
    }
}
