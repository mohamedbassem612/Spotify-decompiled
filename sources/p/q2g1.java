package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@o661(with = r2g1.class)
public final class q2g1 {
    public static final p2g1 Companion = new p2g1();
    public final ContextTrack a;
    public final PlayOrigin b;
    public final String c;
    public final String d;

    public q2g1(ContextTrack contextTrack, PlayOrigin playOrigin, String str, String str2) {
        this.a = contextTrack;
        this.b = playOrigin;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2g1)) {
            return false;
        }
        q2g1 q2g1Var = (q2g1) obj;
        return u890.j(this.a, q2g1Var.a) && u890.j(this.b, q2g1Var.b) && u890.j(this.c, q2g1Var.c) && u890.j(this.d, q2g1Var.d);
    }

    public final int hashCode() {
        ContextTrack contextTrack = this.a;
        int iHashCode = (contextTrack == null ? 0 : contextTrack.hashCode()) * 31;
        PlayOrigin playOrigin = this.b;
        int iHashCode2 = (iHashCode + (playOrigin == null ? 0 : playOrigin.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
