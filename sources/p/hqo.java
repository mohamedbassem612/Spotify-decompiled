package p;

import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hqo implements i570, o5s {
    public final ruz a;
    public final pjt0 b;
    public final Flowable d;
    public final vku c = new vku();
    public PlayerState e = PlayerState.EMPTY;

    public hqo(ruz ruzVar, iac0 iac0Var, Flowable flowable, pjt0 pjt0Var) {
        this.a = ruzVar;
        this.d = flowable;
        this.b = pjt0Var;
        iac0Var.getLifecycle().a(this);
    }

    public final void a(j570 j570Var, u570 u570Var) {
        String strB = ((sc70) j570Var).b.c.B("uri");
        PlayerState playerState = this.e;
        if (playerState == null || strB == null || !strB.equals(playerState.contextUri()) || !playerState.isPlaying() || playerState.isPaused()) {
            this.b.a(j570Var, u570Var);
            return;
        }
        this.c.a(this.a.a(new d9u0("freetiertrack-customplayfromcontextcommandhandler", false)).subscribe());
    }

    public final void onPause(iac0 iac0Var) {
        this.c.c();
    }

    public final void onResume(iac0 iac0Var) {
        this.c.a(this.d.subscribe(new fv5(this, (byte) 3)));
    }
}
