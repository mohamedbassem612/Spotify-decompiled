package p;

import com.android.installreferrer.api.InstallReferrerClient$InstallReferrerResponse;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class i510 implements pf40 {
    public static final i510 a;
    private static final h661 descriptor;

    static {
        i510 i510Var = new i510();
        a = i510Var;
        m0v0 m0v0Var = new m0v0("com.spotify.externalintegration.http.ExternalIntegrationRequestModel", i510Var, 6);
        m0v0Var.j("external_accessory_description", false);
        m0v0Var.j("contextual_signals", false);
        m0v0Var.j("presentation_override", true);
        m0v0Var.j("restriction_id", true);
        m0v0Var.j("dsa_mode_enabled", true);
        m0v0Var.j("supports_rich_section_headers", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = k510.g;
        chc1 chc1Var = chc1.a;
        gpb gpbVar = gpb.a;
        return new nma0[]{o210.a, znb0VarArr[1].getValue(), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(gpbVar), gpbVar};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = k510.g;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        q210 q210Var = null;
        List list = null;
        String str = null;
        String str2 = null;
        Boolean bool = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case InstallReferrerClient$InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    break;
                case 0:
                    q210Var = (q210) x1kVarB.A(h661Var, 0, o210.a, q210Var);
                    i |= 1;
                    break;
                case 1:
                    list = (List) x1kVarB.A(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    str = (String) x1kVarB.B(h661Var, 2, chc1.a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) x1kVarB.B(h661Var, 3, chc1.a, str2);
                    i |= 8;
                    break;
                case 4:
                    bool = (Boolean) x1kVarB.B(h661Var, 4, gpb.a, bool);
                    i |= 16;
                    break;
                case 5:
                    zM = x1kVarB.M(h661Var, 5);
                    i |= 32;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new k510(i, q210Var, list, str, str2, bool, zM);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        k510 k510Var = (k510) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = k510.g;
        o210 o210Var = o210.a;
        q210 q210Var = k510Var.a;
        Boolean bool = k510Var.e;
        z1kVarB.k(h661Var, 0, o210Var, q210Var);
        z1kVarB.k(h661Var, 1, (nma0) znb0VarArr[1].getValue(), k510Var.b);
        String str = k510Var.c;
        if (str != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str);
        }
        String str2 = k510Var.d;
        if (str2 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str2);
        }
        if (z1kVarB.d0() || !u890.j(bool, Boolean.FALSE)) {
            z1kVarB.s(h661Var, 4, gpb.a, bool);
        }
        boolean z = k510Var.f;
        if (z) {
            z1kVarB.E(h661Var, 5, z);
        }
        z1kVarB.a(h661Var);
    }
}
