package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class gb71 implements pf40 {
    public static final gb71 a;
    private static final h661 descriptor;

    static {
        gb71 gb71Var = new gb71();
        a = gb71Var;
        m0v0 m0v0Var = new m0v0("com.spotify.blend.tastematch.api.ShareMetadata", gb71Var, 6);
        m0v0Var.j("entity_uri", false);
        m0v0Var.j("image", false);
        m0v0Var.j("message", true);
        m0v0Var.j("query_parameters", false);
        m0v0Var.j("message_entity_uri", true);
        m0v0Var.j("item_log_id", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = dc71.g;
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, m5n1.z(chc1Var), znb0VarArr[3].getValue(), m5n1.z(chc1Var), m5n1.z(chc1Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = dc71.g;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String strF2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Map map = null;
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
                    strF2 = x1kVarB.f(h661Var, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) x1kVarB.B(h661Var, 2, chc1.a, str);
                    i |= 4;
                    break;
                case 3:
                    map = (Map) x1kVarB.A(h661Var, 3, (nma0) znb0VarArr[3].getValue(), map);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) x1kVarB.B(h661Var, 4, chc1.a, str2);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) x1kVarB.B(h661Var, 5, chc1.a, str3);
                    i |= 32;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new dc71(i, strF, strF2, str, str2, str3, map);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        dc71 dc71Var = (dc71) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = dc71.g;
        z1kVarB.G(h661Var, 0, dc71Var.a);
        z1kVarB.G(h661Var, 1, dc71Var.b);
        String str = dc71Var.c;
        if (str != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str);
        }
        z1kVarB.k(h661Var, 3, (nma0) znb0VarArr[3].getValue(), dc71Var.d);
        String str2 = dc71Var.e;
        if (str2 != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str2);
        }
        String str3 = dc71Var.f;
        if (str3 != null) {
            z1kVarB.s(h661Var, 5, chc1.a, str3);
        }
        z1kVarB.a(h661Var);
    }
}
