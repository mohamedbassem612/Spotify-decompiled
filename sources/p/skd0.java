package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class skd0 {
    public final yqg a;
    public final kly0 b;

    public skd0(yqg yqgVar, gbp gbpVar) {
        this.a = yqgVar;
        this.b = gbpVar;
    }

    public final long a(PlayerState playerState) {
        Long l = t2p1.l(playerState);
        if (l != null) {
            long jB = (this.a.b() - l.longValue()) - ((Number) this.b.get()).longValue();
            if (jB >= 0) {
                return jB;
            }
        }
        return 0L;
    }
}
