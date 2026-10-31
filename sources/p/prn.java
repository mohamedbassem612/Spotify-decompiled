package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class prn implements pf40 {
    public static final prn a;
    private static final h661 descriptor;

    static {
        prn prnVar = new prn();
        a = prnVar;
        m0v0 m0v0Var = new m0v0("com.spotify.oopsplatform.diagnosticreports.CreateUploadRequest", prnVar, 10);
        m0v0Var.j("profileUuid", false);
        m0v0Var.j("diagnosticsSessionUuid", false);
        m0v0Var.j("captureTimestampEpochMs", false);
        m0v0Var.j("declaredSizeBytes", false);
        m0v0Var.j("traceFormat", false);
        m0v0Var.j("traceFormatVersion", false);
        m0v0Var.j("appVersion", false);
        m0v0Var.j("appBuild", false);
        m0v0Var.j("osName", false);
        m0v0Var.j("osVersion", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0Var = chc1.a;
        return new nma0[]{nma0Var, m5n1.z(nma0Var), nma0Var, nma0Var, nma0Var, nma0Var, m5n1.z(nma0Var), m5n1.z(nma0Var), m5n1.z(nma0Var), m5n1.z(nma0Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        String str = null;
        boolean z = true;
        String str2 = null;
        int i = 0;
        String strF = null;
        String str3 = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String str4 = null;
        String str5 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strF = x1kVarB.f(h661Var, 0);
                    i |= 1;
                    break;
                case 1:
                    str3 = (String) x1kVarB.B(h661Var, 1, chc1.a, str3);
                    i |= 2;
                    break;
                case 2:
                    strF2 = x1kVarB.f(h661Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strF3 = x1kVarB.f(h661Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strF4 = x1kVarB.f(h661Var, 4);
                    i |= 16;
                    break;
                case 5:
                    strF5 = x1kVarB.f(h661Var, 5);
                    i |= 32;
                    break;
                case 6:
                    str4 = (String) x1kVarB.B(h661Var, 6, chc1.a, str4);
                    i |= 64;
                    break;
                case 7:
                    str5 = (String) x1kVarB.B(h661Var, 7, chc1.a, str5);
                    i |= 128;
                    break;
                case 8:
                    str2 = (String) x1kVarB.B(h661Var, 8, chc1.a, str2);
                    i |= 256;
                    break;
                case 9:
                    str = (String) x1kVarB.B(h661Var, 9, chc1.a, str);
                    i |= 512;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new rrn(i, strF, str3, strF2, strF3, strF4, strF5, str4, str5, str2, str);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        rrn rrnVar = (rrn) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, rrnVar.a);
        chc1 chc1Var = chc1.a;
        z1kVarB.s(h661Var, 1, chc1Var, rrnVar.b);
        z1kVarB.G(h661Var, 2, rrnVar.c);
        z1kVarB.G(h661Var, 3, rrnVar.d);
        z1kVarB.G(h661Var, 4, rrnVar.e);
        z1kVarB.G(h661Var, 5, rrnVar.f);
        z1kVarB.s(h661Var, 6, chc1Var, rrnVar.g);
        z1kVarB.s(h661Var, 7, chc1Var, rrnVar.h);
        z1kVarB.s(h661Var, 8, chc1Var, rrnVar.i);
        z1kVarB.s(h661Var, 9, chc1Var, rrnVar.j);
        z1kVarB.a(h661Var);
    }
}
