package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class t0u implements pf40 {
    public static final t0u a;
    private static final h661 descriptor;

    static {
        t0u t0uVar = new t0u();
        a = t0uVar;
        m0v0 m0v0Var = new m0v0("com.spotify.oopsplatform.diagnosticreports.DiagnosticReport", t0uVar, 11);
        m0v0Var.j("id", false);
        m0v0Var.j("type", false);
        m0v0Var.j("diagnosticSessionId", false);
        m0v0Var.j("capturedAtMs", false);
        m0v0Var.j("sizeBytes", false);
        m0v0Var.j("format", false);
        m0v0Var.j("formatVersion", false);
        m0v0Var.j("appVersion", true);
        m0v0Var.j("appBuild", true);
        m0v0Var.j("osName", true);
        m0v0Var.j("osVersion", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = v0u.m;
        chc1 chc1Var = chc1.a;
        o5f0 o5f0Var = o5f0.a;
        return new nma0[]{chc1Var, znb0VarArr[1].getValue(), m5n1.z(chc1Var), o5f0Var, o5f0Var, chc1Var, chc1Var, m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var)};
    }

    public final Object deserialize(dar darVar) {
        znb0[] znb0VarArr;
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr2 = v0u.m;
        x1kVarB.getClass();
        long jI0 = 0;
        long jI1 = 0;
        String str = null;
        String str2 = null;
        boolean z = true;
        String str3 = null;
        String str4 = null;
        int i = 0;
        String strF = null;
        n1u n1uVar = null;
        String str5 = null;
        String strF2 = null;
        String strF3 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    znb0VarArr = znb0VarArr2;
                    z = false;
                    break;
                case 0:
                    znb0VarArr = znb0VarArr2;
                    strF = x1kVarB.f(h661Var, 0);
                    i |= 1;
                    break;
                case 1:
                    znb0VarArr = znb0VarArr2;
                    n1uVar = (n1u) x1kVarB.A(h661Var, 1, (nma0) znb0VarArr[1].getValue(), n1uVar);
                    i |= 2;
                    break;
                case 2:
                    znb0VarArr = znb0VarArr2;
                    str5 = (String) x1kVarB.B(h661Var, 2, chc1.a, str5);
                    i |= 4;
                    break;
                case 3:
                    znb0VarArr = znb0VarArr2;
                    jI0 = x1kVarB.i0(h661Var, 3);
                    i |= 8;
                    break;
                case 4:
                    znb0VarArr = znb0VarArr2;
                    jI1 = x1kVarB.i0(h661Var, 4);
                    i |= 16;
                    break;
                case 5:
                    znb0VarArr = znb0VarArr2;
                    strF2 = x1kVarB.f(h661Var, 5);
                    i |= 32;
                    break;
                case 6:
                    znb0VarArr = znb0VarArr2;
                    strF3 = x1kVarB.f(h661Var, 6);
                    i |= 64;
                    break;
                case 7:
                    znb0VarArr = znb0VarArr2;
                    str3 = (String) x1kVarB.B(h661Var, 7, chc1.a, str3);
                    i |= 128;
                    break;
                case 8:
                    znb0VarArr = znb0VarArr2;
                    str4 = (String) x1kVarB.B(h661Var, 8, chc1.a, str4);
                    i |= 256;
                    break;
                case 9:
                    znb0VarArr = znb0VarArr2;
                    str2 = (String) x1kVarB.B(h661Var, 9, chc1.a, str2);
                    i |= 512;
                    break;
                case 10:
                    znb0VarArr = znb0VarArr2;
                    str = (String) x1kVarB.B(h661Var, 10, chc1.a, str);
                    i |= 1024;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
            znb0VarArr2 = znb0VarArr;
        }
        x1kVarB.a(h661Var);
        return new v0u(i, strF, n1uVar, str5, jI0, jI1, strF2, strF3, str3, str4, str2, str);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        v0u v0uVar = (v0u) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = v0u.m;
        String str = v0uVar.b;
        String str2 = v0uVar.l;
        String str3 = v0uVar.k;
        String str4 = v0uVar.j;
        String str5 = v0uVar.i;
        z1kVarB.G(h661Var, 0, str);
        z1kVarB.k(h661Var, 1, (nma0) znb0VarArr[1].getValue(), v0uVar.c);
        chc1 chc1Var = chc1.a;
        z1kVarB.s(h661Var, 2, chc1Var, v0uVar.d);
        z1kVarB.l(h661Var, 3, v0uVar.e);
        z1kVarB.l(h661Var, 4, v0uVar.f);
        z1kVarB.G(h661Var, 5, v0uVar.g);
        z1kVarB.G(h661Var, 6, v0uVar.h);
        if (z1kVarB.d0() || str5 != null) {
            z1kVarB.s(h661Var, 7, chc1Var, str5);
        }
        if (z1kVarB.d0() || str4 != null) {
            z1kVarB.s(h661Var, 8, chc1Var, str4);
        }
        if (z1kVarB.d0() || str3 != null) {
            z1kVarB.s(h661Var, 9, chc1Var, str3);
        }
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 10, chc1Var, str2);
        }
        z1kVarB.a(h661Var);
    }
}
