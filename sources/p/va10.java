package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class va10 implements pf40 {
    public static final va10 a;
    private static final h661 descriptor;

    static {
        va10 va10Var = new va10();
        a = va10Var;
        m0v0 m0v0Var = new m0v0("com.spotify.partneraccountlinking.common.samsung.ExternalUserAccountsStatusResponse", va10Var, 1);
        m0v0Var.j("partners", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z((nma0) xa10.b[0].getValue())};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = xa10.b;
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
                map = (Map) x1kVarB.B(h661Var, 0, (nma0) znb0VarArr[0].getValue(), map);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new xa10(i, map);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        Map map = ((xa10) obj).a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = xa10.b;
        if (z1kVarB.d0() || map != null) {
            z1kVarB.s(h661Var, 0, (nma0) znb0VarArr[0].getValue(), map);
        }
        z1kVarB.a(h661Var);
    }
}
