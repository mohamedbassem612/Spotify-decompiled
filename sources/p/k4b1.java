package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class k4b1 implements pf40 {
    public static final k4b1 a;
    private static final h661 descriptor;

    static {
        k4b1 k4b1Var = new k4b1();
        a = k4b1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.betamax.playerimpl.exo.model.SpotifyJsonManifest", k4b1Var, 11);
        m0v0Var.j("contents", false);
        m0v0Var.j("start_time_millis", false);
        m0v0Var.j("end_time_millis", false);
        m0v0Var.j("initialization_template", false);
        m0v0Var.j("segment_template", false);
        m0v0Var.j("base_urls", false);
        m0v0Var.j("subtitle_base_urls", true);
        m0v0Var.j("subtitle_language_codes", true);
        m0v0Var.j("subtitle_template", true);
        m0v0Var.j("seekpanels", true);
        m0v0Var.j("subtitles", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = n4b1.m;
        o5f0 o5f0Var = o5f0.a;
        chc1 chc1Var = chc1.a;
        return new nma0[]{znb0VarArr[0].getValue(), o5f0Var, o5f0Var, chc1Var, chc1Var, znb0VarArr[5].getValue(), m5n1.z((nma0) znb0VarArr[6].getValue()), m5n1.z((nma0) znb0VarArr[7].getValue()), m5n1.z(chc1Var), m5n1.z(kn51.a), m5n1.z(nrc1.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = n4b1.m;
        x1kVarB.getClass();
        long jI0 = 0;
        long jI1 = 0;
        qrc1 qrc1Var = null;
        mn51 mn51Var = null;
        String str = null;
        List list = null;
        boolean z = true;
        List list2 = null;
        List list3 = null;
        int i = 0;
        List list4 = null;
        String strF = null;
        String strF2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    jI0 = jI0;
                    z = false;
                    jI0 = jI0;
                    break;
                case 0:
                    list4 = (List) x1kVarB.A(h661Var, 0, (nma0) znb0VarArr[0].getValue(), list4);
                    i |= 1;
                    z = z;
                    jI0 = jI0;
                    break;
                case 1:
                    jI0 = x1kVarB.i0(h661Var, 1);
                    i |= 2;
                    z = z;
                    break;
                case 2:
                    jI1 = x1kVarB.i0(h661Var, 2);
                    i |= 4;
                    z = z;
                    break;
                case 3:
                    strF = x1kVarB.f(h661Var, 3);
                    i |= 8;
                    z = z;
                    break;
                case 4:
                    strF2 = x1kVarB.f(h661Var, 4);
                    i |= 16;
                    z = z;
                    break;
                case 5:
                    list2 = (List) x1kVarB.A(h661Var, 5, (nma0) znb0VarArr[5].getValue(), list2);
                    i |= 32;
                    z = z;
                    jI0 = jI0;
                    break;
                case 6:
                    list3 = (List) x1kVarB.B(h661Var, 6, (nma0) znb0VarArr[6].getValue(), list3);
                    i |= 64;
                    z = z;
                    jI0 = jI0;
                    break;
                case 7:
                    list = (List) x1kVarB.B(h661Var, 7, (nma0) znb0VarArr[7].getValue(), list);
                    i |= 128;
                    z = z;
                    jI0 = jI0;
                    break;
                case 8:
                    str = (String) x1kVarB.B(h661Var, 8, chc1.a, str);
                    i |= 256;
                    z = z;
                    jI0 = jI0;
                    break;
                case 9:
                    mn51Var = (mn51) x1kVarB.B(h661Var, 9, kn51.a, mn51Var);
                    i |= 512;
                    z = z;
                    jI0 = jI0;
                    break;
                case 10:
                    qrc1Var = (qrc1) x1kVarB.B(h661Var, 10, nrc1.a, qrc1Var);
                    i |= 1024;
                    z = z;
                    jI0 = jI0;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new n4b1(i, list4, jI0, jI1, strF, strF2, list2, list3, list, str, mn51Var, qrc1Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        n4b1 n4b1Var = (n4b1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = n4b1.m;
        nma0 nma0Var = (nma0) znb0VarArr[0].getValue();
        List list = n4b1Var.a;
        List list2 = n4b1Var.h;
        z1kVarB.k(h661Var, 0, nma0Var, list);
        z1kVarB.l(h661Var, 1, n4b1Var.b);
        z1kVarB.l(h661Var, 2, n4b1Var.c);
        z1kVarB.G(h661Var, 3, n4b1Var.d);
        z1kVarB.G(h661Var, 4, n4b1Var.e);
        z1kVarB.k(h661Var, 5, (nma0) znb0VarArr[5].getValue(), n4b1Var.f);
        List list3 = n4b1Var.g;
        if (list3 != null) {
            z1kVarB.s(h661Var, 6, (nma0) znb0VarArr[6].getValue(), list3);
        }
        if (list2 != null) {
            z1kVarB.s(h661Var, 7, (nma0) znb0VarArr[7].getValue(), list2);
        }
        String str = n4b1Var.i;
        if (str != null) {
            z1kVarB.s(h661Var, 8, chc1.a, str);
        }
        mn51 mn51Var = n4b1Var.j;
        if (mn51Var != null) {
            z1kVarB.s(h661Var, 9, kn51.a, mn51Var);
        }
        qrc1 qrc1Var = n4b1Var.k;
        if (qrc1Var != null) {
            z1kVarB.s(h661Var, 10, nrc1.a, qrc1Var);
        }
        z1kVarB.a(h661Var);
    }
}
