package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class ul9 {
    public static final Set a = Collections.singleton("spotify:playlist:37i9dQZF1EYkqdzj48dyYq");
    public static final Set b = f46.S0(new clc0[]{clc0.e, clc0.f, clc0.X});

    public static final boolean a(ContextTrack contextTrack) {
        return (l4o1.P(contextTrack) || l4o1.G(contextTrack)) ? false : true;
    }

    public static final boolean b(PlayerState playerState) {
        return !o4p1.t(playerState) || nhc1.Y(playerState.contextUri(), "spotify:lex-experiments:todays-feed", false);
    }
}
