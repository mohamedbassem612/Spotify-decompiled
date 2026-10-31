package p;

import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class atf0 implements Function {
    public final /* synthetic */ PlayerState a;
    public final /* synthetic */ double b;
    public final /* synthetic */ yqg c;

    public atf0(PlayerState playerState, double d, yqg yqgVar) {
        this.a = playerState;
        this.b = d;
        this.c = yqgVar;
    }

    public final Object apply(Object obj) {
        long jB = this.c.b();
        PlayerState playerState = this.a;
        long jTimestamp = jB - playerState.timestamp();
        if (jTimestamp < 0) {
            jTimestamp = 0;
        }
        long jLongValue = ((Number) playerState.positionAsOfTimestamp().e(0L)).longValue() + ((long) (jTimestamp * this.b));
        return Long.valueOf(jLongValue >= 0 ? jLongValue : 0L);
    }
}
