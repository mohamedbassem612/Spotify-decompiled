package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tif0 implements yif0 {
    public final ContextTrack a;
    public final String b;
    public final boolean c;

    public tif0(ContextTrack contextTrack, String str, boolean z) {
        this.a = contextTrack;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tif0)) {
            return false;
        }
        tif0 tif0Var = (tif0) obj;
        return this.a.equals(tif0Var.a) && this.b.equals(tif0Var.b) && this.c == tif0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
