package p;

import com.spotify.betamax.common.SunsetUpgradeRequiredException;
import com.spotify.betamax.player.exception.BetamaxException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ezc1 implements c0u0 {
    public final dpa a;

    public ezc1(dpa dpaVar) {
        this.a = dpaVar;
    }

    public final void L(BetamaxException betamaxException, long j, long j2) {
        for (Throwable cause = betamaxException; cause != null; cause = cause.getCause()) {
            if (cause instanceof SunsetUpgradeRequiredException) {
                this.a.a.a(rih1.a);
                return;
            }
        }
    }
}
