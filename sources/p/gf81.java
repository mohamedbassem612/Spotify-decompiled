package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gf81 implements ff81 {
    public final cyp a;
    public final b7r0 b;
    public final vku c = new vku();

    public gf81(cyp cypVar, b7r0 b7r0Var) {
        this.a = cypVar;
        this.b = b7r0Var;
    }

    public final void b(String str, String str2, String str3) {
        LoggingParams.Builder builder = LoggingParams.builder();
        y6r0 y6r0Var = this.b.get();
        String str4 = y6r0Var != null ? y6r0Var.a : null;
        if (str4 == null) {
            str4 = "";
        }
        LoggingParams loggingParamsBuild = builder.pageInstanceId(str4).interactionId("").build();
        if ((ihc1.h0(str, "spotify:search", false) || ihc1.h0(str3, "spotify:search", false)) && str2.length() > 0) {
            str = str2;
        }
        this.c.a(this.a.d().a(PlayCommand.builder(Context.fromUri(str), PlayOrigin.create("pick-and-shuffle-cap")).options(PreparePlayOptions.builder().alwaysPlaySomething(true).initiallyPaused(false).build()).loggingParams(loggingParamsBuild).build()).subscribe(w841.U0, w841.V0));
    }
}
