package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.PlayCommand$Builder;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tyt0 {
    public final ynb0 a;
    public final g7h b;
    public final xrc0 c;
    public final yqg d;

    public tyt0(ynb0 ynb0Var, agc0 agc0Var, npm1 npm1Var, g7h g7hVar, xrc0 xrc0Var, yqg yqgVar) {
        this.a = ynb0Var;
        this.b = g7hVar;
        this.c = xrc0Var;
        this.d = yqgVar;
    }

    public final PlayCommand a(String str, String str2, st01 st01Var) {
        PlayCommand$Builder playCommand$BuilderContext = PlayCommand$Builder.builder().context(Context.fromUri(str));
        PreparePlayOptions preparePlayOptionsBuild = PreparePlayOptions.Builder.builder().skipTo(SkipToTrack.fromUri(str2)).build();
        playCommand$BuilderContext.getClass();
        playCommand$BuilderContext.options(preparePlayOptionsBuild);
        PlayOrigin.Builder builder = PlayOrigin.Builder.builder();
        String str3 = st01Var.c;
        playCommand$BuilderContext.playOrigin(builder.featureIdentifier(str3).viewUri(st01Var.e).referrerIdentifier(str3).build());
        LoggingParams.Builder builderPageInstanceId = LoggingParams.builder().commandInitiatedTime(Long.valueOf(this.d.b())).pageInstanceId(st01Var.b);
        ou80 ou80Var = st01Var.a;
        playCommand$BuilderContext.loggingParams(builderPageInstanceId.interactionId(ou80Var != null ? ou80Var.a : null).build());
        return playCommand$BuilderContext.build();
    }
}
