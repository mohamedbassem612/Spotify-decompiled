package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.Suppressions$Providers;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.LoggingParams$Builder;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.rxjava3.core.Completable;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ugt0 implements mqd0 {
    public final b7r0 a;
    public final muz b;

    public ugt0(dg30 dg30Var, t8u0 t8u0Var, b7r0 b7r0Var) {
        this.a = b7r0Var;
        this.b = t8u0Var.a(((f0i) dg30Var).a).d();
    }

    public final Completable b(lqd0 lqd0Var) {
        PlayCommand.Builder builder = PlayCommand.builder(Context.fromUri(lqd0Var.a), PlayOrigin.create("listening-parties"));
        PreparePlayOptions.Builder builderSuppressions = PreparePlayOptions.builder().suppressions(Collections.singleton(Suppressions$Providers.MFT));
        PlayerOptionOverrides.Builder builder2 = PlayerOptionOverrides.builder();
        Boolean bool = Boolean.FALSE;
        PlayCommand.Builder builderOptions = builder.options(builderSuppressions.playerOptionsOverride(builder2.repeatingTrack(bool).repeatingContext(bool).build()).build());
        LoggingParams$Builder loggingParams$BuilderInteractionId = LoggingParams.builder().interactionId(lqd0Var.b);
        y6r0 y6r0Var = this.a.get();
        String str = y6r0Var != null ? y6r0Var.a : null;
        if (str == null) {
            str = "";
        }
        return this.b.a(builderOptions.loggingParams(loggingParams$BuilderInteractionId.pageInstanceId(str).build()).build()).ignoreElement();
    }
}
