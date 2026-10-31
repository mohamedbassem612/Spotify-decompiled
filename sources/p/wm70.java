package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wm70 {
    public final me30 a;
    public final Set b = dm61.z0(le30.THIS_IS_ARTIST, le30.ARTIST_MIX_READER, le30.BLEND, le30.DAILY_MIX, le30.DAYLIST, le30.DISCOVER_WEEKLY, le30.DESCRIPTO, le30.INSPIREDBY_MIX, le30.ON_REPEAT, le30.RELEASE_RADAR, le30.REPEAT_REWIND, le30.TOPIC_MIX);

    public wm70(me30 me30Var) {
        this.a = me30Var;
    }

    public final boolean a(PlayerState playerState) {
        if (i0p1.q(playerState)) {
            return true;
        }
        return this.b.contains(this.a.a(i0p1.p(playerState))) || l4o1.I((ContextTrack) playerState.track().b()) || i0p1.r(playerState);
    }
}
