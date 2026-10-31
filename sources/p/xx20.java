package p;

import com.spotify.player.model.AudioStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xx20 {
    public boolean a;
    public AudioStream b;
    public enh0 c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx20)) {
            return false;
        }
        xx20 xx20Var = (xx20) obj;
        return this.a == xx20Var.a && this.b == xx20Var.b && this.c == xx20Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }
}
