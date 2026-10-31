package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e1u0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g1u0 b;

    public /* synthetic */ e1u0(g1u0 g1u0Var, byte b) {
        this.a = b;
        this.b = g1u0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        boolean z = false;
        g1u0 g1u0Var = this.b;
        switch (b) {
            case 0:
                mmr0 mmr0Var = (mmr0) obj;
                PlayerState playerState = (PlayerState) mmr0Var.a;
                g1u0Var.t = playerState;
                g1u0Var.u = (Boolean) mmr0Var.b;
                g1u0Var.h(playerState);
                PlayerState playerState2 = g1u0Var.t;
                if (playerState2.isPlaying() && !playerState2.isPaused()) {
                    z = true;
                }
                g1u0Var.g(z);
                if (!g1u0Var.n.d()) {
                    Iterator it = g1u0Var.t.nextTracks().iterator();
                    while (it.hasNext()) {
                        ixg ixgVarF = g1u0Var.c.f(l4o1.a0((ContextTrack) it.next(), "image_url"));
                        ixgVarF.e();
                        ixgVarF.n();
                    }
                }
                break;
            case 1:
                spq0 spq0Var = (spq0) obj;
                spq0Var.getClass();
                g1u0Var.s = (String) spq0Var.h();
                g1u0Var.h(g1u0Var.t);
                break;
            default:
                if (((spq0) obj).h() != null) {
                    bhn0.d();
                } else {
                    g1u0Var.h(g1u0Var.t);
                    PlayerState playerState3 = g1u0Var.t;
                    if (playerState3.isPlaying() && !playerState3.isPaused()) {
                        z = true;
                    }
                    g1u0Var.g(z);
                }
                break;
        }
    }
}
