package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class nr41 {
    public static final cof1 a(PlayerState playerState) {
        ContextTrack contextTrack = (ContextTrack) playerState.track().b();
        return new cof1((String) playerState.playbackId().h(), contextTrack.uri(), l4o1.a0(contextTrack, "pointer.uri"));
    }
}
