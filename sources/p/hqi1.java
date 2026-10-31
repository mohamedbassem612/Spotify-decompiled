package p;

import com.comscore.streaming.State;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class hqi1 implements pf40 {
    public static final hqi1 a;
    private static final h661 descriptor;

    static {
        hqi1 hqi1Var = new hqi1();
        a = hqi1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.jam.internal.socialconnect.models.V3JoinSessionRequest", hqi1Var, 6);
        m0v0Var.j("join_token", false);
        m0v0Var.j("join_type", false);
        m0v0Var.j("playback_control", false);
        m0v0Var.j("local_device_id", false);
        m0v0Var.j("join_attempt_id", false);
        m0v0Var.j("permission_mode", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        return new nma0[]{nma0Var, nma0Var, nma0Var, nma0Var, nma0Var, m5n1.z(nma0Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String str = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case State.UNDEFINED /* -1 */:
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
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new jqi1(strF, strF2, strF3, strF4, i, strF5, str);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        jqi1 jqi1Var = (jqi1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, jqi1Var.a);
        z1kVarB.G(h661Var, 1, jqi1Var.b);
        z1kVarB.G(h661Var, 2, jqi1Var.c);
        z1kVarB.G(h661Var, 3, jqi1Var.d);
        z1kVarB.G(h661Var, 4, jqi1Var.e);
        String str = jqi1Var.f;
        if (str != null) {
            z1kVarB.s(h661Var, 5, chc1.a, str);
        }
        z1kVarB.a(h661Var);
    }
}
