package p;

import com.android.installreferrer.api.InstallReferrerClient$InstallReferrerResponse;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class n510 implements pf40 {
    public static final n510 a;
    private static final h661 descriptor;

    static {
        n510 n510Var = new n510();
        a = n510Var;
        m0v0 m0v0Var = new m0v0("com.spotify.externalintegration.http.ExternalIntegrationSectionContentModel", n510Var, 9);
        m0v0Var.j("name", false);
        m0v0Var.j("title", false);
        m0v0Var.j("uri", true);
        m0v0Var.j("image_uri", true);
        m0v0Var.j("section_items", false);
        m0v0Var.j("presentation", true);
        m0v0Var.j("ad_tracking_metadata", true);
        m0v0Var.j("response_id", true);
        m0v0Var.j("rich_header", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = p510.j;
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, m5n1.z(chc1Var), m5n1.z(chc1Var), znb0VarArr[4].getValue(), m5n1.z(chc1Var), m5n1.z(pz0.a), m5n1.z(chc1Var), m5n1.z(fh31.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = p510.j;
        x1kVarB.getClass();
        hh31 hh31Var = null;
        boolean z = true;
        String str = null;
        int i = 0;
        String strF = null;
        String strF2 = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        String str4 = null;
        rz0 rz0Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case InstallReferrerClient$InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
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
                    str2 = (String) x1kVarB.B(h661Var, 2, chc1.a, str2);
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
                    str4 = (String) x1kVarB.B(h661Var, 5, chc1.a, str4);
                    i |= 32;
                    break;
                case 6:
                    rz0Var = (rz0) x1kVarB.B(h661Var, 6, pz0.a, rz0Var);
                    i |= 64;
                    break;
                case 7:
                    str = (String) x1kVarB.B(h661Var, 7, chc1.a, str);
                    i |= 128;
                    break;
                case 8:
                    hh31Var = (hh31) x1kVarB.B(h661Var, 8, fh31.a, hh31Var);
                    i |= 256;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new p510(i, strF, strF2, str2, str3, list, str4, rz0Var, str, hh31Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        p510 p510Var = (p510) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = p510.j;
        String str = p510Var.a;
        hh31 hh31Var = p510Var.i;
        String str2 = p510Var.h;
        rz0 rz0Var = p510Var.g;
        String str3 = p510Var.f;
        String str4 = p510Var.d;
        String str5 = p510Var.c;
        z1kVarB.G(h661Var, 0, str);
        z1kVarB.G(h661Var, 1, p510Var.b);
        if (z1kVarB.d0() || str5 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str5);
        }
        if (z1kVarB.d0() || str4 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str4);
        }
        z1kVarB.k(h661Var, 4, (nma0) znb0VarArr[4].getValue(), p510Var.e);
        if (z1kVarB.d0() || str3 != null) {
            z1kVarB.s(h661Var, 5, chc1.a, str3);
        }
        if (z1kVarB.d0() || rz0Var != null) {
            z1kVarB.s(h661Var, 6, pz0.a, rz0Var);
        }
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 7, chc1.a, str2);
        }
        if (z1kVarB.d0() || hh31Var != null) {
            z1kVarB.s(h661Var, 8, fh31.a, hh31Var);
        }
        z1kVarB.a(h661Var);
    }
}
