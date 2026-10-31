package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class x2w0 implements pf40 {
    public static final x2w0 a;
    private static final h661 descriptor;

    static {
        x2w0 x2w0Var = new x2w0();
        a = x2w0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.prerelease.prerelease.datasource.PrereleasePayload", x2w0Var, 13);
        m0v0Var.j("id", false);
        m0v0Var.j("album_uri", true);
        m0v0Var.j("watch_feed_header", true);
        m0v0Var.j("track_list", true);
        m0v0Var.j("watch_feed_carousel", true);
        m0v0Var.j("featuring_items", true);
        m0v0Var.j("copyright", true);
        m0v0Var.j("courtesy_line", true);
        m0v0Var.j("merch_items", true);
        m0v0Var.j("redirect_to_album", true);
        m0v0Var.j("album_type", true);
        m0v0Var.j("listening_party_card", true);
        m0v0Var.j("premium_early_access", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = z2w0.N0;
        nma0 nma0Var = chc1.a;
        nma0 nma0VarZ = m5n1.z(nma0Var);
        nma0 nma0VarZ2 = m5n1.z(p8l1.a);
        nma0 nma0VarZ3 = m5n1.z((nma0) znb0VarArr[3].getValue());
        nma0 nma0VarZ4 = m5n1.z((nma0) znb0VarArr[4].getValue());
        nma0 nma0VarZ5 = m5n1.z((nma0) znb0VarArr[5].getValue());
        nma0 nma0VarZ6 = m5n1.z(nma0Var);
        nma0 nma0VarZ7 = m5n1.z(nma0Var);
        nma0 nma0VarZ8 = m5n1.z((nma0) znb0VarArr[8].getValue());
        nma0 nma0VarZ9 = m5n1.z(nma0Var);
        nma0 nma0VarZ10 = m5n1.z(yid0.a);
        gpb gpbVar = gpb.a;
        return new nma0[]{nma0Var, nma0VarZ, nma0VarZ2, nma0VarZ3, nma0VarZ4, nma0VarZ5, nma0VarZ6, nma0VarZ7, nma0VarZ8, gpbVar, nma0VarZ9, nma0VarZ10, gpbVar};
    }

    public final Object deserialize(dar darVar) {
        znb0[] znb0VarArr;
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr2 = z2w0.N0;
        x1kVarB.getClass();
        ajd0 ajd0Var = null;
        String str = null;
        List list = null;
        boolean z = true;
        String str2 = null;
        int i = 0;
        String strF = null;
        String str3 = null;
        r8l1 r8l1Var = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        String str4 = null;
        boolean zM = false;
        boolean zM2 = false;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    znb0VarArr2 = znb0VarArr2;
                    break;
                case 0:
                    znb0VarArr = znb0VarArr2;
                    strF = x1kVarB.f(h661Var, 0);
                    i |= 1;
                    znb0VarArr2 = znb0VarArr;
                    z = z;
                    break;
                case 1:
                    znb0VarArr = znb0VarArr2;
                    str3 = (String) x1kVarB.B(h661Var, 1, chc1.a, str3);
                    i |= 2;
                    znb0VarArr2 = znb0VarArr;
                    z = z;
                    break;
                case 2:
                    znb0VarArr = znb0VarArr2;
                    r8l1Var = (r8l1) x1kVarB.B(h661Var, 2, p8l1.a, r8l1Var);
                    i |= 4;
                    znb0VarArr2 = znb0VarArr;
                    z = z;
                    break;
                case 3:
                    znb0VarArr = znb0VarArr2;
                    list2 = (List) x1kVarB.B(h661Var, 3, (nma0) znb0VarArr[3].getValue(), list2);
                    i |= 8;
                    znb0VarArr2 = znb0VarArr;
                    z = z;
                    break;
                case 4:
                    znb0VarArr = znb0VarArr2;
                    list3 = (List) x1kVarB.B(h661Var, 4, (nma0) znb0VarArr[4].getValue(), list3);
                    i |= 16;
                    znb0VarArr2 = znb0VarArr;
                    z = z;
                    break;
                case 5:
                    znb0VarArr = znb0VarArr2;
                    list4 = (List) x1kVarB.B(h661Var, 5, (nma0) znb0VarArr[5].getValue(), list4);
                    i |= 32;
                    znb0VarArr2 = znb0VarArr;
                    z = z;
                    break;
                case 6:
                    znb0VarArr = znb0VarArr2;
                    str4 = (String) x1kVarB.B(h661Var, 6, chc1.a, str4);
                    i |= 64;
                    znb0VarArr2 = znb0VarArr;
                    z = z;
                    break;
                case 7:
                    znb0VarArr = znb0VarArr2;
                    str2 = (String) x1kVarB.B(h661Var, 7, chc1.a, str2);
                    i |= 128;
                    znb0VarArr2 = znb0VarArr;
                    z = z;
                    break;
                case 8:
                    znb0VarArr = znb0VarArr2;
                    list = (List) x1kVarB.B(h661Var, 8, (nma0) znb0VarArr[8].getValue(), list);
                    i |= 256;
                    znb0VarArr2 = znb0VarArr;
                    z = z;
                    break;
                case 9:
                    zM = x1kVarB.M(h661Var, 9);
                    i |= 512;
                    znb0VarArr2 = znb0VarArr2;
                    break;
                case 10:
                    znb0VarArr = znb0VarArr2;
                    str = (String) x1kVarB.B(h661Var, 10, chc1.a, str);
                    i |= 1024;
                    znb0VarArr2 = znb0VarArr;
                    z = z;
                    break;
                case 11:
                    znb0VarArr = znb0VarArr2;
                    ajd0Var = (ajd0) x1kVarB.B(h661Var, 11, yid0.a, ajd0Var);
                    i |= 2048;
                    znb0VarArr2 = znb0VarArr;
                    z = z;
                    break;
                case 12:
                    zM2 = x1kVarB.M(h661Var, 12);
                    i |= 4096;
                    znb0VarArr2 = znb0VarArr2;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new z2w0(i, strF, str3, r8l1Var, list2, list3, list4, str4, str2, list, zM, str, ajd0Var, zM2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        z2w0 z2w0Var = (z2w0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = z2w0.N0;
        String str = z2w0Var.a;
        boolean z = z2w0Var.Z;
        boolean z2 = z2w0Var.t;
        List list = z2w0Var.i;
        List list2 = z2w0Var.f;
        List list3 = z2w0Var.e;
        List list4 = z2w0Var.d;
        z1kVarB.G(h661Var, 0, str);
        String str2 = z2w0Var.b;
        if (str2 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str2);
        }
        r8l1 r8l1Var = z2w0Var.c;
        if (r8l1Var != null) {
            z1kVarB.s(h661Var, 2, p8l1.a, r8l1Var);
        }
        if (list4 != null) {
            z1kVarB.s(h661Var, 3, (nma0) znb0VarArr[3].getValue(), list4);
        }
        if (list3 != null) {
            z1kVarB.s(h661Var, 4, (nma0) znb0VarArr[4].getValue(), list3);
        }
        if (list2 != null) {
            z1kVarB.s(h661Var, 5, (nma0) znb0VarArr[5].getValue(), list2);
        }
        String str3 = z2w0Var.g;
        if (str3 != null) {
            z1kVarB.s(h661Var, 6, chc1.a, str3);
        }
        String str4 = z2w0Var.h;
        if (str4 != null) {
            z1kVarB.s(h661Var, 7, chc1.a, str4);
        }
        if (list != null) {
            z1kVarB.s(h661Var, 8, (nma0) znb0VarArr[8].getValue(), list);
        }
        if (z1kVarB.d0() || z2) {
            z1kVarB.E(h661Var, 9, z2);
        }
        String str5 = z2w0Var.X;
        if (str5 != null) {
            z1kVarB.s(h661Var, 10, chc1.a, str5);
        }
        ajd0 ajd0Var = z2w0Var.Y;
        if (ajd0Var != null) {
            z1kVarB.s(h661Var, 11, yid0.a, ajd0Var);
        }
        if (z1kVarB.d0() || z) {
            z1kVarB.E(h661Var, 12, z);
        }
        z1kVarB.a(h661Var);
    }
}
