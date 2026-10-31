package p;

import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeDefer;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeSwitchIfEmpty;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yf0 {
    public final iu30 a;
    public final iu30 b;
    public final vq41 c;

    public yf0(iu30 iu30Var, iu30 iu30Var2, vq41 vq41Var) {
        this.a = iu30Var;
        this.b = iu30Var2;
        this.c = vq41Var;
    }

    public final MaybeSwitchIfEmpty a(ContextTrack contextTrack) {
        Object objC = this.c.a.c(this.a.invoke(contextTrack));
        return new MaybeSwitchIfEmpty(objC != null ? Maybe.e(objC) : MaybeEmpty.a, new MaybeDefer(new xf0(this, contextTrack, (byte) 0)));
    }
}
