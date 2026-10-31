package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class ns5 extends cv5 {
    public static final ms5 Companion = new ms5();
    public Integer b;

    public ns5(PlayerState playerState) {
        Companion.getClass();
        this.b = Integer.valueOf(((playerState == null || playerState.isPaused() || !playerState.isPlaying()) ? 1 : 0) ^ 1);
    }
}
