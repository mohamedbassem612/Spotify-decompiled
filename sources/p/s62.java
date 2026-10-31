package p;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s62 implements tbu0 {
    public final Context a;
    public final zhq0 b;

    public s62(yxp yxpVar, Context context) {
        this.a = context;
        this.b = yxpVar.a("ads");
    }

    public final SpannableString a(PlayerState playerState, s6g1 s6g1Var) {
        return new SpannableString(xap1.m(playerState, this.a.getResources()).b);
    }

    public final SpannableString b(PlayerState playerState, s6g1 s6g1Var) {
        SpannableString spannableString = new SpannableString(xap1.m(playerState, this.a.getResources()).a);
        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 17);
        return spannableString;
    }

    public final SpannableString c(PlayerState playerState) {
        return null;
    }

    public final List d(PlayerState playerState, Boolean bool) {
        ContextTrack contextTrack = (ContextTrack) playerState.track().b();
        contextTrack.getClass();
        boolean zQ = l4o1.Q(contextTrack);
        zhq0 zhq0Var = this.b;
        if (zQ) {
            return playerState.restrictions().disallowSkippingNextReasons().isEmpty() ? p7h.M(new ojo0[]{eio1.y(playerState, zhq0Var, true), eio1.x(playerState, zhq0Var), eio1.w(playerState, zhq0Var, true)}) : p7h.M(new ojo0[]{eio1.B(zhq0Var), eio1.y(playerState, zhq0Var, false), eio1.x(playerState, zhq0Var), eio1.w(playerState, zhq0Var, false), eio1.C(zhq0Var, true)});
        }
        return p7h.M(new ojo0[]{eio1.y(playerState, zhq0Var, true), eio1.x(playerState, zhq0Var), eio1.w(playerState, zhq0Var, true)});
    }

    public final boolean e(PlayerState playerState, s6g1 s6g1Var) {
        return l4o1.E((ContextTrack) playerState.track().b());
    }
}
