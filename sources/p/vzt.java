package p;

import com.android.installreferrer.api.InstallReferrerClient$InstallReferrerResponse;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class vzt implements pf40 {
    public static final vzt a;
    private static final h661 descriptor;

    static {
        vzt vztVar = new vzt();
        a = vztVar;
        m0v0 m0v0Var = new m0v0("com.spotify.devicepredictability.internal.devicesuggestionproviderimpl.sources.wheretoplay.impl.endpoint.DeviceSuggestionRequest", vztVar, 7);
        m0v0Var.j("availableDevices", true);
        m0v0Var.j("clientDatetime", false);
        m0v0Var.j("lastActiveDeviceId", true);
        m0v0Var.j("activeDeviceId", true);
        m0v0Var.j("integrationType", true);
        m0v0Var.j("clientPlaybackState", true);
        m0v0Var.j("activeDeviceHistory", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = xzt.h;
        chc1 chc1Var = chc1.a;
        return new nma0[]{znb0VarArr[0].getValue(), chc1Var, m5n1.z(chc1Var), m5n1.z(chc1Var), chc1Var, m5n1.z(xkg.a), znb0VarArr[6].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = xzt.h;
        x1kVarB.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        List list = null;
        String strF = null;
        String str = null;
        String str2 = null;
        String strF2 = null;
        zkg zkgVar = null;
        List list2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case InstallReferrerClient$InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    continue;
                case 0:
                    list = (List) x1kVarB.A(h661Var, 0, (nma0) znb0VarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    strF = x1kVarB.f(h661Var, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) x1kVarB.B(h661Var, 2, chc1.a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) x1kVarB.B(h661Var, 3, chc1.a, str2);
                    i |= 8;
                    break;
                case 4:
                    strF2 = x1kVarB.f(h661Var, 4);
                    i |= 16;
                    break;
                case 5:
                    zkgVar = (zkg) x1kVarB.B(h661Var, 5, xkg.a, zkgVar);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) x1kVarB.A(h661Var, 6, (nma0) znb0VarArr[6].getValue(), list2);
                    i |= 64;
                    break;
                default:
                    n9v.a(iP);
                    return obj;
            }
            obj = null;
        }
        x1kVarB.a(h661Var);
        return new xzt(i, list, strF, str, str2, strF2, zkgVar, list2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        xzt xztVar = (xzt) obj;
        List list = xztVar.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = xzt.h;
        boolean zD0 = z1kVarB.d0();
        z6x z6xVar = z6x.a;
        if (zD0 || !u890.j(list, z6xVar)) {
            z1kVarB.k(h661Var, 0, (nma0) znb0VarArr[0].getValue(), list);
        }
        String str = xztVar.b;
        List list2 = xztVar.g;
        String str2 = xztVar.e;
        z1kVarB.G(h661Var, 1, str);
        String str3 = xztVar.c;
        if (str3 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str3);
        }
        String str4 = xztVar.d;
        if (str4 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str4);
        }
        if (z1kVarB.d0() || !u890.j(str2, "MOBILE_CLIENT")) {
            z1kVarB.G(h661Var, 4, str2);
        }
        zkg zkgVar = xztVar.f;
        if (zkgVar != null) {
            z1kVarB.s(h661Var, 5, xkg.a, zkgVar);
        }
        if (!u890.j(list2, z6xVar)) {
            z1kVarB.k(h661Var, 6, (nma0) znb0VarArr[6].getValue(), list2);
        }
        z1kVarB.a(h661Var);
    }
}
