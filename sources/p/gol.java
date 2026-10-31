package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class gol implements pf40 {
    public static final gol a;
    private static final h661 descriptor;

    static {
        gol golVar = new gol();
        a = golVar;
        m0v0 m0v0Var = new m0v0("com.spotify.betamax.playerimpl.exo.model.Content", golVar, 9);
        m0v0Var.j("segment_length", false);
        m0v0Var.j("start_time_millis", false);
        m0v0Var.j("end_time_millis", false);
        m0v0Var.j("profiles", true);
        m0v0Var.j("video_profiles", true);
        m0v0Var.j("audio_profiles", true);
        m0v0Var.j("encryption_infos", false);
        m0v0Var.j("volume_gain_applied", true);
        m0v0Var.j("original_loudness", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = spl.l;
        o5f0 o5f0Var = o5f0.a;
        return new nma0[]{o5f0Var, o5f0Var, o5f0Var, m5n1.z((nma0) znb0VarArr[3].getValue()), m5n1.z((nma0) znb0VarArr[4].getValue()), m5n1.z((nma0) znb0VarArr[5].getValue()), znb0VarArr[6].getValue(), m5n1.z(er20.a), m5n1.z(lfh0.a)};
    }

    public final Object deserialize(dar darVar) {
        long jI0;
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = spl.l;
        x1kVarB.getClass();
        long j = 0;
        long jI1 = 0;
        long jI2 = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
        boolean z = true;
        Float f = null;
        List list4 = null;
        kfh0 kfh0Var = null;
        int i = 0;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    jI0 = j;
                    z = false;
                    j = jI0;
                    break;
                case 0:
                    jI0 = x1kVarB.i0(h661Var, 0);
                    i |= 1;
                    z = z;
                    j = jI0;
                    break;
                case 1:
                    jI1 = x1kVarB.i0(h661Var, 1);
                    i |= 2;
                    z = z;
                    break;
                case 2:
                    jI2 = x1kVarB.i0(h661Var, 2);
                    i |= 4;
                    z = z;
                    break;
                case 3:
                    jI0 = j;
                    list4 = (List) x1kVarB.B(h661Var, 3, (nma0) znb0VarArr[3].getValue(), list4);
                    i |= 8;
                    z = z;
                    j = jI0;
                    break;
                case 4:
                    jI0 = j;
                    list3 = (List) x1kVarB.B(h661Var, 4, (nma0) znb0VarArr[4].getValue(), list3);
                    i |= 16;
                    z = z;
                    j = jI0;
                    break;
                case 5:
                    jI0 = j;
                    list2 = (List) x1kVarB.B(h661Var, 5, (nma0) znb0VarArr[5].getValue(), list2);
                    i |= 32;
                    z = z;
                    j = jI0;
                    break;
                case 6:
                    jI0 = j;
                    list = (List) x1kVarB.A(h661Var, 6, (nma0) znb0VarArr[6].getValue(), list);
                    i |= 64;
                    z = z;
                    j = jI0;
                    break;
                case 7:
                    jI0 = j;
                    f = (Float) x1kVarB.B(h661Var, 7, er20.a, f);
                    i |= 128;
                    z = z;
                    j = jI0;
                    break;
                case 8:
                    jI0 = j;
                    kfh0Var = (kfh0) x1kVarB.B(h661Var, 8, lfh0.a, kfh0Var);
                    i |= 256;
                    z = z;
                    j = jI0;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new spl(i, j, jI1, jI2, list4, list3, list2, list, f, kfh0Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        spl splVar = (spl) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = spl.l;
        long j = splVar.a;
        List list = splVar.f;
        List list2 = splVar.e;
        z1kVarB.l(h661Var, 0, j);
        z1kVarB.l(h661Var, 1, splVar.b);
        z1kVarB.l(h661Var, 2, splVar.c);
        List list3 = splVar.d;
        if (list3 != null) {
            z1kVarB.s(h661Var, 3, (nma0) znb0VarArr[3].getValue(), list3);
        }
        if (list2 != null) {
            z1kVarB.s(h661Var, 4, (nma0) znb0VarArr[4].getValue(), list2);
        }
        if (list != null) {
            z1kVarB.s(h661Var, 5, (nma0) znb0VarArr[5].getValue(), list);
        }
        z1kVarB.k(h661Var, 6, (nma0) znb0VarArr[6].getValue(), splVar.g);
        Float f = splVar.h;
        if (f != null) {
            z1kVarB.s(h661Var, 7, er20.a, f);
        }
        kfh0 kfh0Var = splVar.i;
        if (kfh0Var != null) {
            z1kVarB.s(h661Var, 8, lfh0.a, kfh0Var);
        }
        z1kVarB.a(h661Var);
    }
}
