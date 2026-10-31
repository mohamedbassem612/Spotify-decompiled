package p;

import com.comscore.streaming.State;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class rpt implements pf40 {
    public static final rpt a;
    private static final h661 descriptor;

    static {
        rpt rptVar = new rpt();
        a = rptVar;
        m0v0 m0v0Var = new m0v0("com.spotify.jam.internal.socialconnect.models.DeviceBroadcastStatus", rptVar, 9);
        m0v0Var.j("timestamp", false);
        m0v0Var.j("broadcast_status", true);
        m0v0Var.j("device_id", false);
        m0v0Var.j("device_name", false);
        m0v0Var.j("device_type", true);
        m0v0Var.j("output_device_info", true);
        m0v0Var.j("mdns_token", true);
        m0v0Var.j("social_radar_token", true);
        m0v0Var.j("link_token", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        nma0 nma0VarZ = m5n1.z(nma0Var);
        nma0 nma0VarZ2 = m5n1.z(nma0Var);
        nma0 nma0VarZ3 = m5n1.z(cuq0.a);
        e6c e6cVar = e6c.a;
        return new nma0[]{o5f0.a, nma0VarZ, nma0Var, nma0Var, nma0VarZ2, nma0VarZ3, m5n1.z(e6cVar), m5n1.z(e6cVar), m5n1.z(e6cVar)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        long jI0 = 0;
        boolean z = true;
        g6c g6cVar = null;
        g6c g6cVar2 = null;
        g6c g6cVar3 = null;
        int i = 0;
        String str = null;
        String strF = null;
        String strF2 = null;
        String str2 = null;
        euq0 euq0Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case State.UNDEFINED /* -1 */:
                    z = false;
                    break;
                case 0:
                    jI0 = x1kVarB.i0(h661Var, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) x1kVarB.B(h661Var, 1, chc1.a, str);
                    i |= 2;
                    break;
                case 2:
                    strF = x1kVarB.f(h661Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strF2 = x1kVarB.f(h661Var, 3);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) x1kVarB.B(h661Var, 4, chc1.a, str2);
                    i |= 16;
                    break;
                case 5:
                    euq0Var = (euq0) x1kVarB.B(h661Var, 5, cuq0.a, euq0Var);
                    i |= 32;
                    break;
                case 6:
                    g6cVar = (g6c) x1kVarB.B(h661Var, 6, e6c.a, g6cVar);
                    i |= 64;
                    break;
                case 7:
                    g6cVar3 = (g6c) x1kVarB.B(h661Var, 7, e6c.a, g6cVar3);
                    i |= 128;
                    break;
                case 8:
                    g6cVar2 = (g6c) x1kVarB.B(h661Var, 8, e6c.a, g6cVar2);
                    i |= 256;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new tpt(i, jI0, str, strF, strF2, str2, euq0Var, g6cVar, g6cVar3, g6cVar2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        tpt tptVar = (tpt) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        long j = tptVar.a;
        String str = tptVar.b;
        z1kVarB.l(h661Var, 0, j);
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str);
        }
        z1kVarB.G(h661Var, 2, tptVar.c);
        z1kVarB.G(h661Var, 3, tptVar.d);
        String str2 = tptVar.e;
        if (str2 != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str2);
        }
        euq0 euq0Var = tptVar.f;
        if (euq0Var != null) {
            z1kVarB.s(h661Var, 5, cuq0.a, euq0Var);
        }
        g6c g6cVar = tptVar.g;
        if (g6cVar != null) {
            z1kVarB.s(h661Var, 6, e6c.a, g6cVar);
        }
        g6c g6cVar2 = tptVar.h;
        if (g6cVar2 != null) {
            z1kVarB.s(h661Var, 7, e6c.a, g6cVar2);
        }
        g6c g6cVar3 = tptVar.i;
        if (g6cVar3 != null) {
            z1kVarB.s(h661Var, 8, e6c.a, g6cVar3);
        }
        z1kVarB.a(h661Var);
    }
}
