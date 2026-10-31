package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bhf0 {
    public final kly0 a;

    public bhf0(caq caqVar) {
        this.a = caqVar;
    }

    public final boolean a(ContextTrack contextTrack) {
        if (Boolean.parseBoolean((String) contextTrack.metadata().get(ContextTrack$Metadata.KEY_HAS_LYRICS))) {
            return true;
        }
        return ((qg4) this.a.get()).c() && l4o1.W(contextTrack) && !l4o1.N(contextTrack);
    }
}
