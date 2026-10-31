package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class qr81 implements pf40 {
    public static final qr81 a;
    private static final h661 descriptor;

    static {
        qr81 qr81Var = new qr81();
        a = qr81Var;
        m0v0 m0v0Var = new m0v0("com.spotify.notifications.notifications.robin.SilentPushReceivedEventRequest", qr81Var, 7);
        m0v0Var.j("push_request_id", false);
        m0v0Var.j("timestamp_ms", false);
        m0v0Var.j("app_device_id", false);
        m0v0Var.j("os_name", false);
        m0v0Var.j("os_version", false);
        m0v0Var.j("feature", true);
        m0v0Var.j("feature_data", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = sr81.h;
        nma0 nma0Var = chc1.a;
        return new nma0[]{nma0Var, nma0Var, nma0Var, nma0Var, nma0Var, m5n1.z(nma0Var), m5n1.z((nma0) znb0VarArr[6].getValue())};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = sr81.h;
        x1kVarB.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String str = null;
        Map map = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strF = x1kVarB.f(h661Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strF2 = x1kVarB.f(h661Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strF3 = x1kVarB.f(h661Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strF4 = x1kVarB.f(h661Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strF5 = x1kVarB.f(h661Var, 4);
                    i |= 16;
                    break;
                case 5:
                    str = (String) x1kVarB.B(h661Var, 5, chc1.a, str);
                    i |= 32;
                    break;
                case 6:
                    map = (Map) x1kVarB.B(h661Var, 6, (nma0) znb0VarArr[6].getValue(), map);
                    i |= 64;
                    break;
                default:
                    n9v.a(iP);
                    return obj;
            }
            obj = null;
        }
        x1kVarB.a(h661Var);
        return new sr81(i, strF, strF2, strF3, strF4, strF5, str, map);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        sr81 sr81Var = (sr81) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = sr81.h;
        String str = sr81Var.a;
        Map map = sr81Var.g;
        z1kVarB.G(h661Var, 0, str);
        z1kVarB.G(h661Var, 1, sr81Var.b);
        z1kVarB.G(h661Var, 2, sr81Var.c);
        z1kVarB.G(h661Var, 3, sr81Var.d);
        z1kVarB.G(h661Var, 4, sr81Var.e);
        String str2 = sr81Var.f;
        if (str2 != null) {
            z1kVarB.s(h661Var, 5, chc1.a, str2);
        }
        if (map != null) {
            z1kVarB.s(h661Var, 6, (nma0) znb0VarArr[6].getValue(), map);
        }
        z1kVarB.a(h661Var);
    }
}
