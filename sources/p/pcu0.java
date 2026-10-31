package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class pcu0 implements pf40 {
    public static final pcu0 a;
    private static final h661 descriptor;

    static {
        pcu0 pcu0Var = new pcu0();
        a = pcu0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.betamax.contextplayercoordinatorimpl.model.PlayerState", pcu0Var, 17);
        m0v0Var.j("timestamp", false);
        m0v0Var.j("playback_id", true);
        m0v0Var.j("position_as_of_timestamp", true);
        m0v0Var.j("duration", true);
        m0v0Var.j("is_buffering", false);
        m0v0Var.j("playback_speed", false);
        m0v0Var.j("is_paused", false);
        m0v0Var.j("audio_bitrate", true);
        m0v0Var.j("available_audio_bitrates", true);
        m0v0Var.j("marker", true);
        m0v0Var.j("video_surface", true);
        m0v0Var.j("streaming_type", true);
        m0v0Var.j("playback_stack", true);
        m0v0Var.j("session_id", false);
        m0v0Var.j("is_video_on", false);
        m0v0Var.j("is_background", false);
        m0v0Var.j("former_position", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = zcu0.r;
        nma0 nma0Var = o5f0.a;
        nma0 nma0Var2 = chc1.a;
        nma0 nma0VarZ = m5n1.z(nma0Var2);
        nma0 nma0VarZ2 = m5n1.z(nma0Var);
        nma0 nma0VarZ3 = m5n1.z(nma0Var);
        nma0 nma0VarZ4 = m5n1.z(wr80.a);
        nma0 nma0VarZ5 = m5n1.z((nma0) znb0VarArr[8].getValue());
        nma0 nma0VarZ6 = m5n1.z(scu0.a);
        nma0 nma0VarZ7 = m5n1.z(nma0Var2);
        nma0 nma0VarZ8 = m5n1.z(nma0Var2);
        nma0 nma0VarZ9 = m5n1.z(nma0Var2);
        nma0 nma0VarZ10 = m5n1.z(nma0Var);
        gpb gpbVar = gpb.a;
        return new nma0[]{nma0Var, nma0VarZ, nma0VarZ2, nma0VarZ3, gpbVar, er20.a, gpbVar, nma0VarZ4, nma0VarZ5, nma0VarZ6, nma0VarZ7, nma0VarZ8, nma0VarZ9, nma0Var2, gpbVar, gpbVar, nma0VarZ10};
    }

    public final Object deserialize(dar darVar) {
        long jI0;
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = zcu0.r;
        x1kVarB.getClass();
        long j = 0;
        float fQ = 0.0f;
        Long l = null;
        String str = null;
        String str2 = null;
        boolean z = true;
        Integer num = null;
        String str3 = null;
        List list = null;
        ucu0 ucu0Var = null;
        int i = 0;
        String str4 = null;
        Long l2 = null;
        Long l3 = null;
        boolean zM = false;
        boolean zM2 = false;
        String strF = null;
        boolean zM3 = false;
        boolean zM4 = false;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jI0 = x1kVarB.i0(h661Var, 0);
                    i |= 1;
                    z = z;
                    j = jI0;
                    break;
                case 1:
                    jI0 = j;
                    str4 = (String) x1kVarB.B(h661Var, 1, chc1.a, str4);
                    i |= 2;
                    z = z;
                    j = jI0;
                    break;
                case 2:
                    jI0 = j;
                    l2 = (Long) x1kVarB.B(h661Var, 2, o5f0.a, l2);
                    i |= 4;
                    z = z;
                    j = jI0;
                    break;
                case 3:
                    jI0 = j;
                    l3 = (Long) x1kVarB.B(h661Var, 3, o5f0.a, l3);
                    i |= 8;
                    z = z;
                    j = jI0;
                    break;
                case 4:
                    zM = x1kVarB.M(h661Var, 4);
                    i |= 16;
                    z = z;
                    break;
                case 5:
                    fQ = x1kVarB.Q(h661Var, 5);
                    i |= 32;
                    z = z;
                    break;
                case 6:
                    zM2 = x1kVarB.M(h661Var, 6);
                    i |= 64;
                    z = z;
                    break;
                case 7:
                    jI0 = j;
                    num = (Integer) x1kVarB.B(h661Var, 7, wr80.a, num);
                    i |= 128;
                    z = z;
                    j = jI0;
                    break;
                case 8:
                    jI0 = j;
                    list = (List) x1kVarB.B(h661Var, 8, (nma0) znb0VarArr[8].getValue(), list);
                    i |= 256;
                    z = z;
                    j = jI0;
                    break;
                case 9:
                    jI0 = j;
                    ucu0Var = (ucu0) x1kVarB.B(h661Var, 9, scu0.a, ucu0Var);
                    i |= 512;
                    z = z;
                    j = jI0;
                    break;
                case 10:
                    jI0 = j;
                    str3 = (String) x1kVarB.B(h661Var, 10, chc1.a, str3);
                    i |= 1024;
                    z = z;
                    j = jI0;
                    break;
                case 11:
                    jI0 = j;
                    str2 = (String) x1kVarB.B(h661Var, 11, chc1.a, str2);
                    i |= 2048;
                    z = z;
                    j = jI0;
                    break;
                case 12:
                    jI0 = j;
                    str = (String) x1kVarB.B(h661Var, 12, chc1.a, str);
                    i |= 4096;
                    z = z;
                    j = jI0;
                    break;
                case 13:
                    strF = x1kVarB.f(h661Var, 13);
                    i |= 8192;
                    z = z;
                    break;
                case 14:
                    zM3 = x1kVarB.M(h661Var, 14);
                    i |= 16384;
                    z = z;
                    break;
                case 15:
                    zM4 = x1kVarB.M(h661Var, 15);
                    i |= 32768;
                    z = z;
                    break;
                case 16:
                    jI0 = j;
                    l = (Long) x1kVarB.B(h661Var, 16, o5f0.a, l);
                    i |= 65536;
                    z = z;
                    j = jI0;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new zcu0(i, j, str4, l2, l3, zM, fQ, zM2, num, list, ucu0Var, str3, str2, str, strF, zM3, zM4, l);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        zcu0 zcu0Var = (zcu0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = zcu0.r;
        long j = zcu0Var.a;
        List list = zcu0Var.i;
        z1kVarB.l(h661Var, 0, j);
        String str = zcu0Var.b;
        if (str != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str);
        }
        Long l = zcu0Var.c;
        if (l != null) {
            z1kVarB.s(h661Var, 2, o5f0.a, l);
        }
        Long l2 = zcu0Var.d;
        if (l2 != null) {
            z1kVarB.s(h661Var, 3, o5f0.a, l2);
        }
        z1kVarB.E(h661Var, 4, zcu0Var.e);
        z1kVarB.Z(h661Var, 5, zcu0Var.f);
        z1kVarB.E(h661Var, 6, zcu0Var.g);
        Integer num = zcu0Var.h;
        if (num != null) {
            z1kVarB.s(h661Var, 7, wr80.a, num);
        }
        if (list != null) {
            z1kVarB.s(h661Var, 8, (nma0) znb0VarArr[8].getValue(), list);
        }
        ucu0 ucu0Var = zcu0Var.j;
        if (ucu0Var != null) {
            z1kVarB.s(h661Var, 9, scu0.a, ucu0Var);
        }
        String str2 = zcu0Var.k;
        if (str2 != null) {
            z1kVarB.s(h661Var, 10, chc1.a, str2);
        }
        String str3 = zcu0Var.l;
        if (str3 != null) {
            z1kVarB.s(h661Var, 11, chc1.a, str3);
        }
        String str4 = zcu0Var.m;
        if (str4 != null) {
            z1kVarB.s(h661Var, 12, chc1.a, str4);
        }
        z1kVarB.G(h661Var, 13, zcu0Var.n);
        z1kVarB.E(h661Var, 14, zcu0Var.o);
        z1kVarB.E(h661Var, 15, zcu0Var.p);
        Long l3 = zcu0Var.q;
        if (l3 != null) {
            z1kVarB.s(h661Var, 16, o5f0.a, l3);
        }
        z1kVarB.a(h661Var);
    }
}
