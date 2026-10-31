package p;

import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xfs {
    public final muz a;
    public final tgt0 b;
    public final b7r0 c;
    public final jfs d;
    public final Scheduler e;

    public xfs(muz muzVar, tgt0 tgt0Var, b7r0 b7r0Var, jfs jfsVar, Scheduler scheduler) {
        this.a = muzVar;
        this.b = tgt0Var;
        this.c = b7r0Var;
        this.d = jfsVar;
        this.e = scheduler;
    }

    public final LoggingParams a(String str) {
        LoggingParams.Builder builderInteractionId = LoggingParams.builder().interactionId(str);
        y6r0 y6r0Var = this.c.get();
        String str2 = y6r0Var != null ? y6r0Var.a : null;
        if (str2 == null) {
            str2 = "";
        }
        return builderInteractionId.pageInstanceId(str2).build();
    }
}
