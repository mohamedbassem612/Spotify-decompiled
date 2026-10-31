package p;

import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.SeekToCommand;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class erb1 {
    public final yqg a;
    public PlayerState b = PlayerState.EMPTY;
    public spq0 c = j5.a;
    public long d;

    public erb1(yqg yqgVar) {
        this.a = yqgVar;
    }

    public final spq0 a(long j) {
        return (this.b.positionAsOfTimestamp().c() && this.b.duration().c()) ? this.c.g(this.b.position(j)) : j5.a;
    }

    public final void b(long j, SeekToCommand.Relative relative) {
        if (((Long) this.b.duration().e(0L)).longValue() == 0 || !this.b.restrictions().disallowSeekingReasons().isEmpty()) {
            return;
        }
        long jB = this.a.b();
        this.d = jB;
        int i = drb1.a[relative.ordinal()];
        if (i == 1) {
            this.c = new i5w0(Long.valueOf(j));
        } else {
            if (i != 2) {
                return;
            }
            this.c = new i5w0(Long.valueOf(((Long) a(jB).e(0L)).longValue() + j));
        }
    }
}
