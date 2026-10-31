package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class p8l1 implements pf40 {
    public static final p8l1 a;
    private static final h661 descriptor;

    static {
        p8l1 p8l1Var = new p8l1();
        a = p8l1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.prerelease.prerelease.datasource.WatchFeedHeader", p8l1Var, 10);
        m0v0Var.j("watch_feed_videos", true);
        m0v0Var.j("album_cover_url", false);
        m0v0Var.j("album_title", false);
        m0v0Var.j("artist_image_url", true);
        m0v0Var.j("artist_name", false);
        m0v0Var.j("artist_uri", false);
        m0v0Var.j("release_date", false);
        m0v0Var.j("is_presaved", true);
        m0v0Var.j("market_release_date", true);
        m0v0Var.j("artists", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = r8l1.X;
        nma0 nma0VarZ = m5n1.z((nma0) znb0VarArr[0].getValue());
        nma0 nma0Var = chc1.a;
        return new nma0[]{nma0VarZ, nma0Var, nma0Var, m5n1.z(nma0Var), nma0Var, nma0Var, nma0Var, m5n1.z(gpb.a), nma0Var, m5n1.z((nma0) znb0VarArr[9].getValue())};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = r8l1.X;
        x1kVarB.getClass();
        List list = null;
        boolean z = true;
        Boolean bool = null;
        int i = 0;
        List list2 = null;
        String strF = null;
        String strF2 = null;
        String str = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list2 = (List) x1kVarB.B(h661Var, 0, (nma0) znb0VarArr[0].getValue(), list2);
                    i |= 1;
                    break;
                case 1:
                    strF = x1kVarB.f(h661Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strF2 = x1kVarB.f(h661Var, 2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) x1kVarB.B(h661Var, 3, chc1.a, str);
                    i |= 8;
                    break;
                case 4:
                    strF3 = x1kVarB.f(h661Var, 4);
                    i |= 16;
                    break;
                case 5:
                    strF4 = x1kVarB.f(h661Var, 5);
                    i |= 32;
                    break;
                case 6:
                    strF5 = x1kVarB.f(h661Var, 6);
                    i |= 64;
                    break;
                case 7:
                    bool = (Boolean) x1kVarB.B(h661Var, 7, gpb.a, bool);
                    i |= 128;
                    break;
                case 8:
                    strF6 = x1kVarB.f(h661Var, 8);
                    i |= 256;
                    break;
                case 9:
                    list = (List) x1kVarB.B(h661Var, 9, (nma0) znb0VarArr[9].getValue(), list);
                    i |= 512;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new r8l1(i, list2, strF, strF2, str, strF3, strF4, strF5, bool, strF6, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        r8l1 r8l1Var = (r8l1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = r8l1.X;
        List list = r8l1Var.a;
        List list2 = r8l1Var.t;
        String str = r8l1Var.i;
        Boolean bool = r8l1Var.h;
        if (list != null) {
            z1kVarB.s(h661Var, 0, (nma0) znb0VarArr[0].getValue(), list);
        }
        z1kVarB.G(h661Var, 1, r8l1Var.b);
        z1kVarB.G(h661Var, 2, r8l1Var.c);
        String str2 = r8l1Var.d;
        if (str2 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str2);
        }
        z1kVarB.G(h661Var, 4, r8l1Var.e);
        z1kVarB.G(h661Var, 5, r8l1Var.f);
        z1kVarB.G(h661Var, 6, r8l1Var.g);
        if (!u890.j(bool, Boolean.FALSE)) {
            z1kVarB.s(h661Var, 7, gpb.a, bool);
        }
        if (z1kVarB.d0() || !u890.j(str, "")) {
            z1kVarB.G(h661Var, 8, str);
        }
        if (list2 != null) {
            z1kVarB.s(h661Var, 9, (nma0) znb0VarArr[9].getValue(), list2);
        }
        z1kVarB.a(h661Var);
    }
}
