package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cbv {
    public String a;

    public final boolean a(ContextTrack contextTrack) {
        if (!u890.j(contextTrack.uri(), this.a)) {
            this.a = null;
        }
        return l4o1.p(contextTrack) && this.a == null;
    }
}
