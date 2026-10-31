package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Function;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nht0 implements Function {
    public final /* synthetic */ wht0 a;

    public nht0(wht0 wht0Var) {
        this.a = wht0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        Context contextFromUri;
        xxt0 xxt0Var = (xxt0) obj;
        y6b1 y6b1Var = xxt0Var.a;
        Objects.toString(y6b1Var);
        String string = y6b1Var.toString();
        PlayerState playerState = xxt0Var.d;
        if (playerState != null) {
            Context.Builder builderMetadata = Context.builder(string).metadata(playerState.contextMetadata());
            ContextPage.Builder builder = ContextPage.builder();
            ContextTrack.Builder builder2 = ContextTrack.builder(string);
            ContextTrack contextTrack = (ContextTrack) playerState.track().h();
            j380 j380VarMetadata = contextTrack != null ? contextTrack.metadata() : null;
            j380VarMetadata.getClass();
            contextFromUri = builderMetadata.pages(k4p1.x(builder.tracks(k4p1.x(builder2.metadata(j380VarMetadata).build())).build())).restrictions(wht0.b()).build();
        } else {
            contextFromUri = Context.fromUri(string);
        }
        long j = xxt0Var.b;
        contextFromUri.getClass();
        return this.a.a(j, contextFromUri);
    }
}
