package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class q411 implements pf40 {
    public static final q411 a;
    private static final h661 descriptor;

    static {
        q411 q411Var = new q411();
        a = q411Var;
        m0v0 m0v0Var = new m0v0("com.spotify.assistedcuration.content.model.RecsRequest", q411Var, 6);
        m0v0Var.j("playlistURI", true);
        m0v0Var.j("numResults", false);
        m0v0Var.j("trackSkipIDs", true);
        m0v0Var.j("trackIDs", true);
        m0v0Var.j("title", true);
        m0v0Var.j("condensed", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = s411.g;
        chc1 chc1Var = chc1.a;
        return new nma0[]{m5n1.z(chc1Var), wr80.a, m5n1.z((nma0) znb0VarArr[2].getValue()), m5n1.z((nma0) znb0VarArr[3].getValue()), m5n1.z(chc1Var), gpb.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = s411.g;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        int iO = 0;
        boolean zM = false;
        String str = null;
        Set set = null;
        Set set2 = null;
        String str2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                    i |= 1;
                    break;
                case 1:
                    iO = x1kVarB.o(h661Var, 1);
                    i |= 2;
                    break;
                case 2:
                    set = (Set) x1kVarB.B(h661Var, 2, (nma0) znb0VarArr[2].getValue(), set);
                    i |= 4;
                    break;
                case 3:
                    set2 = (Set) x1kVarB.B(h661Var, 3, (nma0) znb0VarArr[3].getValue(), set2);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) x1kVarB.B(h661Var, 4, chc1.a, str2);
                    i |= 16;
                    break;
                case 5:
                    zM = x1kVarB.M(h661Var, 5);
                    i |= 32;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new s411(i, str, iO, set, set2, str2, zM);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        s411 s411Var = (s411) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = s411.g;
        String str = s411Var.a;
        boolean z = s411Var.f;
        Set set = s411Var.d;
        Set set2 = s411Var.c;
        if (str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        z1kVarB.e(1, s411Var.b, h661Var);
        if (set2 != null) {
            z1kVarB.s(h661Var, 2, (nma0) znb0VarArr[2].getValue(), set2);
        }
        if (set != null) {
            z1kVarB.s(h661Var, 3, (nma0) znb0VarArr[3].getValue(), set);
        }
        String str2 = s411Var.e;
        if (str2 != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str2);
        }
        if (z1kVarB.d0() || !z) {
            z1kVarB.E(h661Var, 5, z);
        }
        z1kVarB.a(h661Var);
    }
}
