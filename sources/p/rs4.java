package p;

import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Function;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rs4 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PlayerState b;

    public /* synthetic */ rs4(PlayerState playerState, byte b) {
        this.a = b;
        this.b = playerState;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        PlayerState playerState = this.b;
        switch (b) {
            case 0:
                return playerState;
            case 1:
                return new mmr0(playerState, Boolean.valueOf(((f7h) o7h.p0(((Map) obj).values())).a));
            default:
                spq0 spq0Var = (spq0) obj;
                spq0Var.getClass();
                spq0 spq0VarDuration = playerState.duration();
                if (!spq0Var.c() || !spq0VarDuration.c()) {
                    return spq0Var;
                }
                long jLongValue = ((Number) spq0Var.b()).longValue();
                long jLongValue2 = ((Number) spq0VarDuration.b()).longValue();
                if (jLongValue > jLongValue2) {
                    jLongValue = jLongValue2;
                }
                return new i5w0(Long.valueOf(jLongValue));
        }
    }
}
