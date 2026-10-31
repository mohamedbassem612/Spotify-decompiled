package p;

import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public interface owo0 {
    default void a(ji50 ji50Var, iyo0 iyo0Var) {
        f(ji50Var);
    }

    default Maybe b(ContextTrack contextTrack) {
        return MaybeEmpty.a;
    }

    default void c(ji50 ji50Var, zq41 zq41Var, iyo0 iyo0Var) {
        a(ji50Var, iyo0Var);
    }

    default Maybe d(ContextTrack contextTrack, String str) {
        return b(contextTrack);
    }

    tka0 e();

    void f(ji50 ji50Var);
}
