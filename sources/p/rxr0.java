package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.PlayCommand$Builder;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rxr0 implements qxr0 {
    public final muz a;
    public final PlayOrigin b;

    public rxr0(muz muzVar, PlayOrigin playOrigin) {
        this.a = muzVar;
        this.b = playOrigin;
    }

    public final Object a(String str, String str2, a8d1 a8d1Var) {
        PlayOrigin playOrigin = this.b;
        PlayCommand$Builder playCommand$BuilderOptions = PlayCommand.builder(Context.fromTrackUris(playOrigin.viewUri(), b380.t(str)), playOrigin).options(PreparePlayOptions.builder().playerOptionsOverride(PlayerOptionOverrides.builder().modes(Collections.singletonMap("media", "audio")).build()).build());
        if (str2 != null) {
            playCommand$BuilderOptions.loggingParams(LoggingParams.builder().interactionId(str2).build());
        }
        Object objJ = fc11.j(this.a.a(playCommand$BuilderOptions.build()), a8d1Var);
        return objJ == d9n.a ? objJ : rih1.a;
    }
}
