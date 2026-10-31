package p;

import com.spotify.player.model.ContextTrack;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r5z0 extends ajo1 {
    public final List d;
    public final ContextTrack e;

    public r5z0(ContextTrack contextTrack, List list) {
        this.d = list;
        this.e = contextTrack;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5z0)) {
            return false;
        }
        r5z0 r5z0Var = (r5z0) obj;
        return u890.j(this.d, r5z0Var.d) && u890.j(this.e, r5z0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        ContextTrack contextTrack = this.e;
        return iHashCode + (contextTrack == null ? 0 : contextTrack.hashCode());
    }
}
