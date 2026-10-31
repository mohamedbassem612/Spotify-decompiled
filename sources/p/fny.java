package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface fny {
    hx21 a(PlayerState playerState);

    default mr20 b(PlayerState playerState) {
        return h4p1.m(a(playerState));
    }
}
