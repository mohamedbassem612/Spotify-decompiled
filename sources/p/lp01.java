package p;

import com.spotify.recentlyplayed.recentlyplayed.RecentlyPlayedResponse;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class lp01 implements pf40 {
    public static final lp01 a;
    private static final h661 descriptor;

    static {
        lp01 lp01Var = new lp01();
        a = lp01Var;
        m0v0 m0v0Var = new m0v0("com.spotify.recentlyplayed.recentlyplayed.RecentlyPlayedResponse", lp01Var, 3);
        m0v0Var.j("length", false);
        m0v0Var.j("loaded", false);
        m0v0Var.j("items", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{wr80.a, gpb.a, RecentlyPlayedResponse.$childSerializers[2].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = RecentlyPlayedResponse.$childSerializers;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        int iO = 0;
        boolean zM = false;
        List list = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                iO = x1kVarB.o(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                zM = x1kVarB.M(h661Var, 1);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                list = (List) x1kVarB.A(h661Var, 2, (nma0) znb0VarArr[2].getValue(), list);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new RecentlyPlayedResponse(i, iO, zM, list, null);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        RecentlyPlayedResponse.write$Self$src_main_java_com_spotify_recentlyplayed_recentlyplayed_recentlyplayed((RecentlyPlayedResponse) obj, z1kVarB, h661Var);
        z1kVarB.a(h661Var);
    }
}
