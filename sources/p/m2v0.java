package p;

import com.spotify.player.model.PlayerState;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m2v0 implements fny {
    public final /* synthetic */ byte a;

    public static hx21 c(PlayerState playerState) {
        return !ihc1.y0(poo1.A(playerState)) ? new hx21(new bx21(2131954514), new ugc1(poo1.A(playerState)), poo1.z(playerState), null, 120) : new hx21(new bx21(2131954515), new ugc1(""), poo1.z(playerState), null, 120);
    }

    public final hx21 a(PlayerState playerState) {
        switch (this.a) {
            case 0:
                return new hx21(new bx21(2131954505), new ugc1(""), "", null, 120);
            default:
                Set set = s4b1.f;
                s4b1 s4b1VarX = uic.x(playerState.contextUri());
                v5b1 v5b1Var = s4b1VarX.d;
                if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
                    return c(playerState);
                }
                int iOrdinal = s4b1VarX.c.ordinal();
                return (iOrdinal == 30 || iOrdinal == 44) ? c(playerState) : new hx21(new bx21(2131954515), new ugc1(""), poo1.z(playerState), null, 120);
        }
    }
}
