package p;

import com.comscore.android.HostApplicationState;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class k0f1 implements pf40 {
    public static final k0f1 a;
    private static final h661 descriptor;

    static {
        k0f1 k0f1Var = new k0f1();
        a = k0f1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.connectivity.httpmonorepo.TokenResponse", k0f1Var, 7);
        m0v0Var.j("refreshToken", true);
        m0v0Var.j("accessToken", true);
        m0v0Var.j("expiresIn", true);
        m0v0Var.j("tokenType", true);
        m0v0Var.j("scope", true);
        m0v0Var.j("errorCode", true);
        m0v0Var.j("errorDescription", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = q0f1.h;
        chc1 chc1Var = chc1.a;
        wr80 wr80Var = wr80.a;
        return new nma0[]{m5n1.z(chc1Var), m5n1.z(chc1Var), wr80Var, m5n1.z(chc1Var), znb0VarArr[4].getValue(), wr80Var, m5n1.z(chc1Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = q0f1.h;
        x1kVarB.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        int iO = 0;
        int iO2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case HostApplicationState.UNKNOWN /* -1 */:
                    z = false;
                    continue;
                case 0:
                    str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) x1kVarB.B(h661Var, 1, chc1.a, str2);
                    i |= 2;
                    break;
                case 2:
                    iO = x1kVarB.o(h661Var, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) x1kVarB.B(h661Var, 3, chc1.a, str3);
                    i |= 8;
                    break;
                case 4:
                    list = (List) x1kVarB.A(h661Var, 4, (nma0) znb0VarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    iO2 = x1kVarB.o(h661Var, 5);
                    i |= 32;
                    break;
                case 6:
                    str4 = (String) x1kVarB.B(h661Var, 6, chc1.a, str4);
                    i |= 64;
                    break;
                default:
                    n9v.a(iP);
                    return obj;
            }
            obj = null;
        }
        x1kVarB.a(h661Var);
        return new q0f1(i, iO, iO2, str, str2, str3, str4, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        q0f1 q0f1Var = (q0f1) obj;
        String str = q0f1Var.g;
        int i = q0f1Var.f;
        List list = q0f1Var.e;
        String str2 = q0f1Var.d;
        int i2 = q0f1Var.c;
        String str3 = q0f1Var.b;
        String str4 = q0f1Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = q0f1.h;
        if (z1kVarB.d0() || str4 != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str4);
        }
        if (z1kVarB.d0() || str3 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str3);
        }
        if (z1kVarB.d0() || i2 != 0) {
            z1kVarB.e(2, i2, h661Var);
        }
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str2);
        }
        if (z1kVarB.d0() || !u890.j(list, z6x.a)) {
            z1kVarB.k(h661Var, 4, (nma0) znb0VarArr[4].getValue(), list);
        }
        if (z1kVarB.d0() || i != 0) {
            z1kVarB.e(5, i, h661Var);
        }
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 6, chc1.a, str);
        }
        z1kVarB.a(h661Var);
    }
}
