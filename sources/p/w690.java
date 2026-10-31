package p;

import com.spotify.player.model.BitrateLevel;
import com.spotify.player.model.BitrateStrategy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w690 {
    public final BitrateLevel a;
    public final BitrateLevel b;
    public final BitrateStrategy c;
    public final boolean d;
    public final boolean e;
    public final u6o0 f;

    public w690(BitrateLevel bitrateLevel, BitrateLevel bitrateLevel2, BitrateStrategy bitrateStrategy, boolean z, boolean z2, u6o0 u6o0Var) {
        this.a = bitrateLevel;
        this.b = bitrateLevel2;
        this.c = bitrateStrategy;
        this.d = z;
        this.e = z2;
        this.f = u6o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w690)) {
            return false;
        }
        w690 w690Var = (w690) obj;
        return this.a == w690Var.a && this.b == w690Var.b && this.c == w690Var.c && this.d == w690Var.d && this.e == w690Var.e && this.f == w690Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + xcg1.g(xcg1.g((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
    }
}
