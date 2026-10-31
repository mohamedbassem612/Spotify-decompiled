package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final /* synthetic */ class nld implements pf40 {
    public static final nld a;
    private static final h661 descriptor;

    static {
        nld nldVar = new nld();
        a = nldVar;
        m0v0 m0v0Var = new m0v0("com.spotify.connect.core.model.Capability", nldVar, 5);
        m0v0Var.j("id", true);
        m0v0Var.j("defaultTitle", true);
        m0v0Var.j("iconUrl", true);
        m0v0Var.j("redirectUris", true);
        m0v0Var.j("localizedTitle", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = vld.f;
        chc1 chc1Var = chc1.a;
        return new nma0[]{m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(m711.a), m5n1.z((nma0) znb0VarArr[4].getValue())};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = vld.f;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        o711 o711Var = null;
        Map map = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                i |= 1;
            } else if (iP == 1) {
                str2 = (String) x1kVarB.B(h661Var, 1, chc1.a, str2);
                i |= 2;
            } else if (iP == 2) {
                str3 = (String) x1kVarB.B(h661Var, 2, chc1.a, str3);
                i |= 4;
            } else if (iP == 3) {
                o711Var = (o711) x1kVarB.B(h661Var, 3, m711.a, o711Var);
                i |= 8;
            } else {
                if (iP != 4) {
                    n9v.a(iP);
                    return null;
                }
                map = (Map) x1kVarB.B(h661Var, 4, (nma0) znb0VarArr[4].getValue(), map);
                i |= 16;
            }
        }
        x1kVarB.a(h661Var);
        return new vld(i, str, str2, str3, o711Var, map);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        vld vldVar = (vld) obj;
        Map map = vldVar.e;
        o711 o711Var = vldVar.d;
        String str = vldVar.c;
        String str2 = vldVar.b;
        String str3 = vldVar.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = vld.f;
        if (z1kVarB.d0() || str3 != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str3);
        }
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str2);
        }
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str);
        }
        if (z1kVarB.d0() || o711Var != null) {
            z1kVarB.s(h661Var, 3, m711.a, o711Var);
        }
        if (z1kVarB.d0() || map != null) {
            z1kVarB.s(h661Var, 4, (nma0) znb0VarArr[4].getValue(), map);
        }
        z1kVarB.a(h661Var);
    }
}
