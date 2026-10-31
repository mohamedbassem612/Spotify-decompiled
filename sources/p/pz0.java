package p;

import com.android.installreferrer.api.InstallReferrerClient$InstallReferrerResponse;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class pz0 implements pf40 {
    public static final pz0 a;
    private static final h661 descriptor;

    static {
        pz0 pz0Var = new pz0();
        a = pz0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.externalintegration.http.AdTrackingMetadataModel", pz0Var, 11);
        m0v0Var.j("event_clicked", true);
        m0v0Var.j("event_viewed", true);
        m0v0Var.j("id", true);
        m0v0Var.j("creativeId", true);
        m0v0Var.j("playbackId", true);
        m0v0Var.j("productName", true);
        m0v0Var.j("lineitemId", true);
        m0v0Var.j("headerText", true);
        m0v0Var.j("headerIconName", true);
        m0v0Var.j("previewEntityUri", true);
        m0v0Var.j("slot", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = rz0.l;
        nma0 nma0VarZ = m5n1.z((nma0) znb0VarArr[0].getValue());
        nma0 nma0VarZ2 = m5n1.z((nma0) znb0VarArr[1].getValue());
        chc1 chc1Var = chc1.a;
        return new nma0[]{nma0VarZ, nma0VarZ2, m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var)};
    }

    public final Object deserialize(dar darVar) {
        znb0[] znb0VarArr;
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr2 = rz0.l;
        x1kVarB.getClass();
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z = true;
        String str4 = null;
        int i = 0;
        List list = null;
        List list2 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        while (true) {
            while (true) {
                if (!z) {
                    x1kVarB.a(h661Var);
                    return new rz0(i, list, list2, str5, str6, str7, str8, str9, str4, str3, str2, str);
                }
                int iP = x1kVarB.p(h661Var);
                switch (iP) {
                    case InstallReferrerClient$InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                        z = false;
                        continue;
                        break;
                    case 0:
                        znb0[] znb0VarArr3 = znb0VarArr2;
                        list = (List) x1kVarB.B(h661Var, 0, (nma0) znb0VarArr3[0].getValue(), list);
                        i |= 1;
                        znb0VarArr2 = znb0VarArr3;
                        z = z;
                        continue;
                        break;
                    case 1:
                        znb0VarArr = znb0VarArr2;
                        list2 = (List) x1kVarB.B(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list2);
                        i |= 2;
                        break;
                    case 2:
                        znb0VarArr = znb0VarArr2;
                        str5 = (String) x1kVarB.B(h661Var, 2, chc1.a, str5);
                        i |= 4;
                        break;
                    case 3:
                        znb0VarArr = znb0VarArr2;
                        str6 = (String) x1kVarB.B(h661Var, 3, chc1.a, str6);
                        i |= 8;
                        break;
                    case 4:
                        znb0VarArr = znb0VarArr2;
                        str7 = (String) x1kVarB.B(h661Var, 4, chc1.a, str7);
                        i |= 16;
                        break;
                    case 5:
                        znb0VarArr = znb0VarArr2;
                        str8 = (String) x1kVarB.B(h661Var, 5, chc1.a, str8);
                        i |= 32;
                        break;
                    case 6:
                        znb0VarArr = znb0VarArr2;
                        str9 = (String) x1kVarB.B(h661Var, 6, chc1.a, str9);
                        i |= 64;
                        break;
                    case 7:
                        znb0VarArr = znb0VarArr2;
                        str4 = (String) x1kVarB.B(h661Var, 7, chc1.a, str4);
                        i |= 128;
                        break;
                    case 8:
                        znb0VarArr = znb0VarArr2;
                        str3 = (String) x1kVarB.B(h661Var, 8, chc1.a, str3);
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
                z = z;
            }
        }
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        rz0 rz0Var = (rz0) obj;
        String str = rz0Var.k;
        String str2 = rz0Var.j;
        String str3 = rz0Var.i;
        String str4 = rz0Var.h;
        String str5 = rz0Var.g;
        String str6 = rz0Var.f;
        String str7 = rz0Var.e;
        String str8 = rz0Var.d;
        String str9 = rz0Var.c;
        List list = rz0Var.b;
        List list2 = rz0Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = rz0.l;
        if (z1kVarB.d0() || list2 != null) {
            z1kVarB.s(h661Var, 0, (nma0) znb0VarArr[0].getValue(), list2);
        }
        if (z1kVarB.d0() || list != null) {
            z1kVarB.s(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list);
        }
        if (z1kVarB.d0() || str9 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str9);
        }
        if (z1kVarB.d0() || str8 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str8);
        }
        if (z1kVarB.d0() || str7 != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str7);
        }
        if (z1kVarB.d0() || str6 != null) {
            z1kVarB.s(h661Var, 5, chc1.a, str6);
        }
        if (z1kVarB.d0() || str5 != null) {
            z1kVarB.s(h661Var, 6, chc1.a, str5);
        }
        if (z1kVarB.d0() || str4 != null) {
            z1kVarB.s(h661Var, 7, chc1.a, str4);
        }
        if (z1kVarB.d0() || str3 != null) {
            z1kVarB.s(h661Var, 8, chc1.a, str3);
        }
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 9, chc1.a, str2);
        }
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 10, chc1.a, str);
        }
        z1kVarB.a(h661Var);
    }
}
