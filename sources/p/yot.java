package p;

import com.android.installreferrer.api.InstallReferrerClient$InstallReferrerResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class yot implements pf40 {
    public static final yot a;
    private static final h661 descriptor;

    static {
        yot yotVar = new yot();
        a = yotVar;
        m0v0 m0v0Var = new m0v0("com.spotify.devicepredictability.internal.devicesuggestionproviderimpl.sources.wheretoplay.impl.endpoint.Device", yotVar, 8);
        m0v0Var.j("deviceId", false);
        m0v0Var.j("name", false);
        m0v0Var.j("type", false);
        m0v0Var.j("brand", false);
        m0v0Var.j("model", false);
        m0v0Var.j("is_on_local_network", false);
        m0v0Var.j("last_transfer_at", true);
        m0v0Var.j("is_local_playback_device", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = gpb.a;
        nma0 nma0VarZ = m5n1.z(o5f0.a);
        nma0 nma0VarZ2 = m5n1.z(nma0Var);
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, chc1Var, chc1Var, chc1Var, nma0Var, nma0VarZ, nma0VarZ2};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean zM = false;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        Long l = null;
        Boolean bool = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case InstallReferrerClient$InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
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
                    zM = x1kVarB.M(h661Var, 5);
                    i |= 32;
                    break;
                case 6:
                    l = (Long) x1kVarB.B(h661Var, 6, o5f0.a, l);
                    i |= 64;
                    break;
                case 7:
                    bool = (Boolean) x1kVarB.B(h661Var, 7, gpb.a, bool);
                    i |= 128;
                    break;
                default:
                    n9v.a(iP);
                    return obj;
            }
            obj = null;
        }
        x1kVarB.a(h661Var);
        return new dpt(i, strF, strF2, strF3, strF4, strF5, zM, l, bool);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        dpt dptVar = (dpt) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, dptVar.a);
        z1kVarB.G(h661Var, 1, dptVar.b);
        z1kVarB.G(h661Var, 2, dptVar.c);
        z1kVarB.G(h661Var, 3, dptVar.d);
        z1kVarB.G(h661Var, 4, dptVar.e);
        z1kVarB.E(h661Var, 5, dptVar.f);
        Long l = dptVar.g;
        if (l != null) {
            z1kVarB.s(h661Var, 6, o5f0.a, l);
        }
        Boolean bool = dptVar.h;
        if (bool != null) {
            z1kVarB.s(h661Var, 7, gpb.a, bool);
        }
        z1kVarB.a(h661Var);
    }
}
