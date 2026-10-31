package p;

import com.spotify.player.model.AudioStream;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PreparePlayCommand;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qu7 implements Function {
    public final /* synthetic */ ru7 a;

    public qu7(ru7 ru7Var) {
        this.a = ru7Var;
    }

    public final Object apply(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        Context contextFromUri = Context.fromUri(playerState.contextUri());
        PreparePlayCommand preparePlayCommandBuild = PreparePlayCommand.builder(contextFromUri, playerState.playOrigin()).options(PreparePlayOptions.builder().audioStream(AudioStream.ALARM).build()).build();
        muz muzVar = (muz) this.a.e.get();
        return muzVar.a.callSingle("spotify.player.esperanto.proto.ContextPlayer", "PreparePlay", dug.p(preparePlayCommandBuild)).map(cq41.S0).map(new j3v(muzVar, (byte) 11));
    }
}
