package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yjb1 implements Function {
    public final /* synthetic */ bjx a;
    public final /* synthetic */ xjb1 b;

    public yjb1(bjx bjxVar, xjb1 xjb1Var) {
        this.a = bjxVar;
        this.b = xjb1Var;
    }

    public final Object apply(Object obj) {
        return ((muz) this.a.b).a(PlayCommand.builder(Context.fromUri(this.b.d), PlayOrigin.create("PUSH_NOTIFICATIONS")).loggingParams(LoggingParams.builder().interactionId(((tv80) obj).a.a).build()).build());
    }
}
