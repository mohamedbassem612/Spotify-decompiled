package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.MobiusAndroid;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xam0 {
    public final oyl1 a;
    public final p1f0 b;
    public final yjq c;
    public final vi11 d;

    public xam0(oyl1 oyl1Var, vhc vhcVar, ytw0 ytw0Var, p1f0 p1f0Var, yjq yjqVar, vi11 vi11Var) {
        this.a = oyl1Var;
        this.b = p1f0Var;
        this.c = yjqVar;
        this.d = vi11Var;
    }

    public final vam0 a(nzl1 nzl1Var, PlayerState playerState, String str) {
        this.d.F(str, nzl1Var.a());
        s1m1 s1m1Var = new s1m1(str, nzl1Var.b(), nzl1Var.a());
        MobiusLoop.Builder builderE = Mobius.d(new wam0(this, (byte) 0), this.b.j()).e(xi20.Q0);
        String strA = nzl1Var.a();
        oyl1 oyl1Var = this.a;
        yqg yqgVar = oyl1Var.d;
        Flowable flowable = oyl1Var.a;
        vbm[] vbmVarArr = q601.a;
        ht20 ht20VarB0 = u4p1.b0(new kge(flowable), new gqj1(playerState, (lnm) null, (byte) 23));
        return new vam0(nzl1Var, MobiusAndroid.a(builderE.h(FlowEventSources.Companion.b(FlowEventSources.a, new mr20[]{v9p1.N(ht20VarB0, yqgVar), x3p1.w(ht20VarB0, yqgVar), l2p1.e(oyl1Var.b, strA), d9y0.o(oyl1Var.c)})), s1m1Var), this.c);
    }
}
