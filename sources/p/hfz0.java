package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hfz0 implements Function {
    public final /* synthetic */ List a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ PlayerOptionOverrides.Builder c;
    public final /* synthetic */ String d;
    public final /* synthetic */ ifz0 e;

    public hfz0(List list, boolean z, PlayerOptionOverrides.Builder builder, String str, ifz0 ifz0Var) {
        this.a = list;
        this.b = z;
        this.c = builder;
        this.d = str;
        this.e = ifz0Var;
    }

    public final Object apply(Object obj) {
        if (((PlayerState) obj).isPlaying()) {
            return CompletableEmpty.a;
        }
        return this.e.e().a(PlayCommand.builder(Context.fromUri((String) o7h.q0(this.a)).toBuilder().metadata(Collections.singletonMap("is_quickplay_context", "true")).build(), PlayOrigin.create("QuickPlay")).options(PreparePlayOptions.builder().initiallyPaused(!this.b).playerOptionsOverride(this.c.build()).build()).loggingParams(LoggingParams.builder().interactionId(this.d).build()).build()).ignoreElement();
    }
}
