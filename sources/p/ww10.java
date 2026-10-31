package p;

import android.text.SpannableString;
import com.spotify.player.model.PlayerState;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ww10 implements tbu0 {
    public final /* synthetic */ jcs a;
    public final wm70 b;
    public final zhq0 c;
    public final cfd d;

    public ww10(jcs jcsVar, yxp yxpVar, zxp zxpVar, wm70 wm70Var) {
        this.a = jcsVar;
        this.b = wm70Var;
        this.c = yxpVar.a("feedback");
        this.d = zxpVar.a("feedback");
    }

    @Override // p.tbu0
    public final SpannableString a(PlayerState playerState, s6g1 s6g1Var) {
        return this.a.a(playerState, s6g1Var);
    }

    @Override // p.tbu0
    public final SpannableString b(PlayerState playerState, s6g1 s6g1Var) {
        return this.a.b(playerState, s6g1Var);
    }

    @Override // p.tbu0
    public final SpannableString c(PlayerState playerState) {
        return this.a.c(playerState);
    }

    @Override // p.tbu0
    public final List d(PlayerState playerState, Boolean bool) {
        smc0 smc0VarN = k4p1.n();
        cfd cfdVar = this.d;
        smc0VarN.add(cfdVar.v(playerState, bool));
        zhq0 zhq0Var = this.c;
        smc0VarN.add(eio1.y(playerState, zhq0Var, true));
        smc0VarN.add(eio1.x(playerState, zhq0Var));
        smc0VarN.add(eio1.w(playerState, zhq0Var, true));
        if (f4p1.h(playerState)) {
            smc0VarN.add(cfdVar.u(playerState));
        }
        return k4p1.k(smc0VarN);
    }

    @Override // p.tbu0
    public final boolean e(PlayerState playerState, s6g1 s6g1Var) {
        return this.b.a(playerState) || aqz0.b(playerState.contextUri());
    }
}
