package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class q1u implements pf40 {
    public static final q1u a;
    private static final h661 descriptor;

    static {
        q1u q1uVar = new q1u();
        a = q1uVar;
        m0v0 m0v0Var = new m0v0("com.spotify.oopsplatform.diagnosticreports.DiagnosticReportUploadResponse", q1uVar, 6);
        m0v0Var.j("uploadId", true);
        m0v0Var.j("state", true);
        m0v0Var.j("rejectionReason", true);
        m0v0Var.j("signedPutUrl", true);
        m0v0Var.j("signedPutUrlExpiresAtEpochMs", true);
        m0v0Var.j("requiredHeaders", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = s1u.g;
        chc1 chc1Var = chc1.a;
        return new nma0[]{m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), znb0VarArr[5].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = s1u.g;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Map map = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) x1kVarB.B(h661Var, 1, chc1.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) x1kVarB.B(h661Var, 2, chc1.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) x1kVarB.B(h661Var, 3, chc1.a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) x1kVarB.B(h661Var, 4, chc1.a, str5);
                    i |= 16;
                    break;
                case 5:
                    map = (Map) x1kVarB.A(h661Var, 5, (nma0) znb0VarArr[5].getValue(), map);
                    i |= 32;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new s1u(i, str, str2, str3, str4, str5, map);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        s1u s1uVar = (s1u) obj;
        Map map = s1uVar.f;
        String str = s1uVar.e;
        String str2 = s1uVar.d;
        String str3 = s1uVar.c;
        String str4 = s1uVar.b;
        String str5 = s1uVar.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = s1u.g;
        if (z1kVarB.d0() || str5 != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str5);
        }
        if (z1kVarB.d0() || str4 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str4);
        }
        if (z1kVarB.d0() || str3 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str3);
        }
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str2);
        }
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str);
        }
        if (z1kVarB.d0() || !u890.j(map, b7x.a)) {
            z1kVarB.k(h661Var, 5, (nma0) znb0VarArr[5].getValue(), map);
        }
        z1kVarB.a(h661Var);
    }
}
