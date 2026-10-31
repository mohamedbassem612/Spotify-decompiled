package p;

import com.spotify.player.model.Context$Metadata;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fbm implements iu30 {
    public final me30 a;

    public fbm(me30 me30Var) {
        this.a = me30Var;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(PlayerState playerState) {
        le30 le30VarA = this.a.a((String) playerState.contextMetadata().get(Context$Metadata.KEY_FORMAT_LIST_TYPE));
        return Boolean.valueOf(!(playerState.track().c() && l4o1.S((ContextTrack) playerState.track().b())) && (le30VarA == le30.d1 || le30VarA == le30.P0));
    }
}
