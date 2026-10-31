package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t7z0 extends z8z0 {
    public final int a;
    public final ContextTrack b;

    public t7z0(int i, ContextTrack contextTrack) {
        this.a = i;
        this.b = contextTrack;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7z0)) {
            return false;
        }
        t7z0 t7z0Var = (t7z0) obj;
        return this.a == t7z0Var.a && u890.j(this.b, t7z0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
