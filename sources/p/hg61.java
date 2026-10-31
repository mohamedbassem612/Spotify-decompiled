package p;

import com.comscore.streaming.State;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class hg61 implements pf40 {
    public static final hg61 a;
    private static final h661 descriptor;

    static {
        hg61 hg61Var = new hg61();
        a = hg61Var;
        m0v0 m0v0Var = new m0v0("com.spotify.jam.internal.socialconnect.models.SessionMember", hg61Var, 8);
        m0v0Var.j("joined_timestamp", true);
        m0v0Var.j("id", true);
        m0v0Var.j("username", true);
        m0v0Var.j("display_name", true);
        m0v0Var.j("image_url", true);
        m0v0Var.j("large_image_url", true);
        m0v0Var.j("listen_mode", true);
        m0v0Var.j("is_anonymous", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0VarZ = m5n1.z(o5f0.a);
        chc1 chc1Var = chc1.a;
        nma0 nma0VarZ2 = m5n1.z(chc1Var);
        nma0 nma0VarZ3 = m5n1.z(chc1Var);
        nma0 nma0VarZ4 = m5n1.z(chc1Var);
        nma0 nma0VarZ5 = m5n1.z(chc1Var);
        nma0 nma0VarZ6 = m5n1.z(chc1Var);
        gpb gpbVar = gpb.a;
        return new nma0[]{nma0VarZ, nma0VarZ2, nma0VarZ3, nma0VarZ4, nma0VarZ5, nma0VarZ6, gpbVar, gpbVar};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean zM = false;
        boolean zM2 = false;
        Long l = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case State.UNDEFINED /* -1 */:
                    z = false;
                    continue;
                case 0:
                    l = (Long) x1kVarB.B(h661Var, 0, o5f0.a, l);
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
                    str4 = (String) x1kVarB.B(h661Var, 4, chc1.a, str4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) x1kVarB.B(h661Var, 5, chc1.a, str5);
                    i |= 32;
                    break;
                case 6:
                    zM = x1kVarB.M(h661Var, 6);
                    i |= 64;
                    continue;
                case 7:
                    zM2 = x1kVarB.M(h661Var, 7);
                    i |= 128;
                    continue;
                default:
                    n9v.a(iP);
                    return obj;
            }
            obj = null;
        }
        x1kVarB.a(h661Var);
        return new jg61(i, l, str, str2, str3, str4, str5, zM, zM2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        jg61 jg61Var = (jg61) obj;
        boolean z = jg61Var.h;
        boolean z2 = jg61Var.g;
        String str = jg61Var.f;
        String str2 = jg61Var.e;
        String str3 = jg61Var.d;
        String str4 = jg61Var.c;
        String str5 = jg61Var.b;
        Long l = jg61Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || l != null) {
            z1kVarB.s(h661Var, 0, o5f0.a, l);
        }
        if (z1kVarB.d0() || str5 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str5);
        }
        if (z1kVarB.d0() || str4 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str4);
        }
        if (z1kVarB.d0() || str3 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str3);
        }
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str2);
        }
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 5, chc1.a, str);
        }
        if (z1kVarB.d0() || z2) {
            z1kVarB.E(h661Var, 6, z2);
        }
        if (z1kVarB.d0() || z) {
            z1kVarB.E(h661Var, 7, z);
        }
        z1kVarB.a(h661Var);
    }
}
