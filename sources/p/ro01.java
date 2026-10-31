package p;

import com.spotify.recentlyplayed.recentlyplayed.RecentlyPlayedEntity;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class ro01 implements pf40 {
    public static final ro01 a;
    private static final h661 descriptor;

    static {
        ro01 ro01Var = new ro01();
        a = ro01Var;
        m0v0 m0v0Var = new m0v0("com.spotify.recentlyplayed.recentlyplayed.RecentlyPlayedEntity", ro01Var, 26);
        m0v0Var.j("link", false);
        m0v0Var.j("collectionLink", false);
        m0v0Var.j("name", false);
        m0v0Var.j("imageUri", false);
        m0v0Var.j("type", false);
        m0v0Var.j("offline", false);
        m0v0Var.j("ownerName", false);
        m0v0Var.j("publisher", false);
        m0v0Var.j("artistName", false);
        m0v0Var.j("subtitle", false);
        m0v0Var.j("mediaType", false);
        m0v0Var.j("available", false);
        m0v0Var.j("isCollaborative", false);
        m0v0Var.j("isLoading", false);
        m0v0Var.j("isOwnedBySelf", false);
        m0v0Var.j("isFollowing", false);
        m0v0Var.j("inCollection", false);
        m0v0Var.j("numTracks", false);
        m0v0Var.j("tracksInCollectionCount", false);
        m0v0Var.j("syncProgress", false);
        m0v0Var.j("formatListType", false);
        m0v0Var.j("formatListAttributes", true);
        m0v0Var.j("madeForName", true);
        m0v0Var.j("madeForUsername", true);
        m0v0Var.j("isOnDemandInFree", true);
        m0v0Var.j("isBook", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = RecentlyPlayedEntity.$childSerializers;
        nma0 nma0Var = chc1.a;
        nma0 nma0Var2 = gpb.a;
        nma0 nma0VarZ = m5n1.z((nma0) znb0VarArr[21].getValue());
        nma0 nma0VarZ2 = m5n1.z(nma0Var);
        nma0 nma0VarZ3 = m5n1.z(nma0Var);
        nma0 nma0VarZ4 = m5n1.z(nma0Var2);
        wr80 wr80Var = wr80.a;
        return new nma0[]{nma0Var, nma0Var, nma0Var, nma0Var, nma0Var, nma0Var, nma0Var, nma0Var, nma0Var, nma0Var, nma0Var, nma0Var2, nma0Var2, nma0Var2, nma0Var2, nma0Var2, nma0Var2, wr80Var, wr80Var, wr80Var, nma0Var, nma0VarZ, nma0VarZ2, nma0VarZ3, nma0VarZ4, nma0Var2};
    }

    public final Object deserialize(dar darVar) {
        int i;
        znb0[] znb0VarArr;
        int i2;
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr2 = RecentlyPlayedEntity.$childSerializers;
        x1kVarB.getClass();
        Boolean bool = null;
        String str = null;
        String str2 = null;
        boolean z = true;
        Map map = null;
        int i3 = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        String strF8 = null;
        String strF9 = null;
        String strF10 = null;
        String strF11 = null;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        boolean zM4 = false;
        boolean zM5 = false;
        boolean zM6 = false;
        int iO = 0;
        int iO2 = 0;
        int iO3 = 0;
        String strF12 = null;
        boolean zM7 = false;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    znb0VarArr = znb0VarArr2;
                    z = z;
                    strF = x1kVarB.f(h661Var, 0);
                    i3 |= 1;
                    znb0VarArr2 = znb0VarArr;
                    z = z;
                    break;
                case 1:
                    znb0VarArr2 = znb0VarArr2;
                    strF2 = x1kVarB.f(h661Var, 1);
                    i3 |= 2;
                    znb0VarArr2 = znb0VarArr2;
                    break;
                case 2:
                    znb0VarArr2 = znb0VarArr2;
                    strF3 = x1kVarB.f(h661Var, 2);
                    i3 |= 4;
                    znb0VarArr2 = znb0VarArr2;
                    break;
                case 3:
                    znb0VarArr2 = znb0VarArr2;
                    strF4 = x1kVarB.f(h661Var, 3);
                    i3 |= 8;
                    znb0VarArr2 = znb0VarArr2;
                    break;
                case 4:
                    znb0VarArr2 = znb0VarArr2;
                    strF5 = x1kVarB.f(h661Var, 4);
                    i3 |= 16;
                    znb0VarArr2 = znb0VarArr2;
                    break;
                case 5:
                    znb0VarArr2 = znb0VarArr2;
                    strF6 = x1kVarB.f(h661Var, 5);
                    i3 |= 32;
                    znb0VarArr2 = znb0VarArr2;
                    break;
                case 6:
                    znb0VarArr2 = znb0VarArr2;
                    strF7 = x1kVarB.f(h661Var, 6);
                    i3 |= 64;
                    znb0VarArr2 = znb0VarArr2;
                    break;
                case 7:
                    znb0VarArr2 = znb0VarArr2;
                    strF8 = x1kVarB.f(h661Var, 7);
                    i3 |= 128;
                    znb0VarArr2 = znb0VarArr2;
                    break;
                case 8:
                    znb0VarArr2 = znb0VarArr2;
                    strF9 = x1kVarB.f(h661Var, 8);
                    i3 |= 256;
                    znb0VarArr2 = znb0VarArr2;
                    break;
                case 9:
                    znb0VarArr2 = znb0VarArr2;
                    strF10 = x1kVarB.f(h661Var, 9);
                    i3 |= 512;
                    znb0VarArr2 = znb0VarArr2;
                    break;
                case 10:
                    znb0VarArr2 = znb0VarArr2;
                    strF11 = x1kVarB.f(h661Var, 10);
                    i3 |= 1024;
                    znb0VarArr2 = znb0VarArr2;
                    break;
                case 11:
                    znb0VarArr2 = znb0VarArr2;
                    zM = x1kVarB.M(h661Var, 11);
                    i3 |= 2048;
                    znb0VarArr2 = znb0VarArr2;
                    break;
                case 12:
                    znb0VarArr2 = znb0VarArr2;
                    zM2 = x1kVarB.M(h661Var, 12);
                    i3 |= 4096;
                    znb0VarArr2 = znb0VarArr2;
                    break;
                case 13:
                    znb0VarArr2 = znb0VarArr2;
                    zM3 = x1kVarB.M(h661Var, 13);
                    i3 |= 8192;
                    znb0VarArr2 = znb0VarArr2;
                    break;
                case 14:
                    znb0VarArr2 = znb0VarArr2;
                    zM4 = x1kVarB.M(h661Var, 14);
                    i3 |= 16384;
                    znb0VarArr2 = znb0VarArr2;
                    break;
                case 15:
                    zM5 = x1kVarB.M(h661Var, 15);
                    i = 32768;
                    i3 |= i;
                    znb0VarArr2 = znb0VarArr2;
                    break;
                case 16:
                    zM6 = x1kVarB.M(h661Var, 16);
                    i = 65536;
                    i3 |= i;
                    znb0VarArr2 = znb0VarArr2;
                    break;
                case 17:
                    iO = x1kVarB.o(h661Var, 17);
                    i = 131072;
                    i3 |= i;
                    znb0VarArr2 = znb0VarArr2;
                    break;
                case 18:
                    iO2 = x1kVarB.o(h661Var, 18);
                    i = 262144;
                    i3 |= i;
                    znb0VarArr2 = znb0VarArr2;
                    break;
                case 19:
                    iO3 = x1kVarB.o(h661Var, 19);
                    i = 524288;
                    i3 |= i;
                    znb0VarArr2 = znb0VarArr2;
                    break;
                case 20:
                    strF12 = x1kVarB.f(h661Var, 20);
                    i = 1048576;
                    i3 |= i;
                    znb0VarArr2 = znb0VarArr2;
                    break;
                case 21:
                    znb0VarArr = znb0VarArr2;
                    map = (Map) x1kVarB.B(h661Var, 21, (nma0) znb0VarArr[21].getValue(), map);
                    i2 = 2097152;
                    i3 |= i2;
                    znb0VarArr2 = znb0VarArr;
                    z = z;
                    break;
                case 22:
                    znb0VarArr = znb0VarArr2;
                    str2 = (String) x1kVarB.B(h661Var, 22, chc1.a, str2);
                    i2 = 4194304;
                    i3 |= i2;
                    znb0VarArr2 = znb0VarArr;
                    z = z;
                    break;
                case 23:
                    znb0VarArr = znb0VarArr2;
                    str = (String) x1kVarB.B(h661Var, 23, chc1.a, str);
                    i2 = 8388608;
                    i3 |= i2;
                    znb0VarArr2 = znb0VarArr;
                    z = z;
                    break;
                case 24:
                    znb0VarArr = znb0VarArr2;
                    bool = (Boolean) x1kVarB.B(h661Var, 24, gpb.a, bool);
                    i2 = 16777216;
                    i3 |= i2;
                    znb0VarArr2 = znb0VarArr;
                    z = z;
                    break;
                case 25:
                    zM7 = x1kVarB.M(h661Var, 25);
                    i = 33554432;
                    i3 |= i;
                    znb0VarArr2 = znb0VarArr2;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new RecentlyPlayedEntity(i3, strF, strF2, strF3, strF4, strF5, strF6, strF7, strF8, strF9, strF10, strF11, zM, zM2, zM3, zM4, zM5, zM6, iO, iO2, iO3, strF12, map, str2, str, bool, zM7, (p661) null);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        RecentlyPlayedEntity.write$Self$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed((RecentlyPlayedEntity) obj, z1kVarB, h661Var);
        z1kVarB.a(h661Var);
    }
}
