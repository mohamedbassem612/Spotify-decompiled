package p;

import com.spotify.betamax.offline.database.BetamaxOfflineDatabase;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vna {
    public final BetamaxOfflineDatabase a;

    public vna(BetamaxOfflineDatabase betamaxOfflineDatabase) {
        this.a = betamaxOfflineDatabase;
    }

    public final void a(String str) {
        btp0 btp0VarU = this.a.u();
        ctp0 ctp0Var = (ctp0) qyo1.x(btp0VarU.a, true, false, new atp0(str, (byte) 0));
        if (ctp0Var != null) {
            qyo1.x(btp0VarU.a, false, true, new j9n0(btp0VarU, ctp0Var, (byte) 26));
        }
    }
}
