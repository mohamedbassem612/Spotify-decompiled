package p;

import android.text.SpannableString;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t5v0 implements tbu0 {
    public final jcs a;
    public final zhq0 b;

    public t5v0(jcs jcsVar, yxp yxpVar) {
        this.a = jcsVar;
        this.b = yxpVar.a("podcast");
    }

    @Override // p.tbu0
    public final SpannableString a(PlayerState playerState, s6g1 s6g1Var) {
        String strF = this.a.f(playerState, s6g1Var);
        if (strF == null && (strF = (String) ((ContextTrack) playerState.track().b()).metadata().get("album_title")) == null) {
            strF = "";
        }
        return new SpannableString(strF);
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
        zhq0 zhq0Var = this.b;
        return p7h.M(eio1.B(zhq0Var), eio1.y(playerState, zhq0Var, false), eio1.x(playerState, zhq0Var), eio1.w(playerState, zhq0Var, false), eio1.C(zhq0Var, true));
    }

    @Override // p.tbu0
    public final boolean e(PlayerState playerState, s6g1 s6g1Var) {
        return (l4o1.P((ContextTrack) playerState.track().b()) && s6g1Var.a() != ktl.b) || s6g1Var.g();
    }
}
