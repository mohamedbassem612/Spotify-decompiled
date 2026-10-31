package p;

import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nm30 implements h691 {
    public final /* synthetic */ byte a;
    public final kp00 b;

    public /* synthetic */ nm30(kp00 kp00Var, byte b) {
        this.a = b;
        this.b = kp00Var;
    }

    public final Completable a(PlayerState playerState, tv80 tv80Var) {
        byte b = this.a;
        kp00 kp00Var = this.b;
        switch (b) {
            case 0:
                if (playerState.restrictions().disallowPeekingNextReasons().contains("mft_disallow")) {
                    return ((Single) kp00Var.c).flatMapCompletable(new ouz(kp00Var, (byte) 8));
                }
                CompletableEmpty completableEmpty = CompletableEmpty.a;
                completableEmpty.getClass();
                return completableEmpty;
            default:
                if (playerState.restrictions().disallowPeekingNextReasons().contains("mft_disallow")) {
                    return ((Single) kp00Var.c).flatMapCompletable(new ouz(kp00Var, (byte) 8));
                }
                CompletableEmpty completableEmpty2 = CompletableEmpty.a;
                completableEmpty2.getClass();
                return completableEmpty2;
        }
    }
}
