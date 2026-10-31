package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class t920 implements pf40 {
    public static final t920 a;
    private static final h661 descriptor;

    static {
        t920 t920Var = new t920();
        a = t920Var;
        m0v0 m0v0Var = new m0v0("com.spotify.wear.datalayermessages.FilterDto", t920Var, 6);
        m0v0Var.j("type", false);
        m0v0Var.j("rowId", true);
        m0v0Var.j("text", true);
        m0v0Var.j("tag", true);
        m0v0Var.j("attributes", true);
        m0v0Var.j("tagManifestIds", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = w920.g;
        nma0 nma0Var = chc1.a;
        return new nma0[]{nma0Var, m5n1.z(nma0Var), m5n1.z(nma0Var), m5n1.z(nma0Var), m5n1.z((nma0) znb0VarArr[4].getValue()), m5n1.z((nma0) znb0VarArr[5].getValue())};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = w920.g;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        List list2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strF = x1kVarB.f(h661Var, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) x1kVarB.B(h661Var, 1, chc1.a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) x1kVarB.B(h661Var, 2, chc1.a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) x1kVarB.B(h661Var, 3, chc1.a, str3);
                    i |= 8;
                    break;
                case 4:
                    list = (List) x1kVarB.B(h661Var, 4, (nma0) znb0VarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) x1kVarB.B(h661Var, 5, (nma0) znb0VarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new w920(i, strF, str, str2, str3, list, list2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        w920 w920Var = (w920) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = w920.g;
        String str = w920Var.a;
        List list = w920Var.f;
        List list2 = w920Var.e;
        z1kVarB.G(h661Var, 0, str);
        String str2 = w920Var.b;
        if (str2 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str2);
        }
        String str3 = w920Var.c;
        if (str3 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str3);
        }
        String str4 = w920Var.d;
        if (str4 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str4);
        }
        if (list2 != null) {
            z1kVarB.s(h661Var, 4, (nma0) znb0VarArr[4].getValue(), list2);
        }
        if (list != null) {
            z1kVarB.s(h661Var, 5, (nma0) znb0VarArr[5].getValue(), list);
        }
        z1kVarB.a(h661Var);
    }
}
