package p;

import com.spotify.player.model.BitrateLevel;
import com.spotify.player.model.BitrateStrategy;
import com.spotify.player.model.HiFiStatus;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vdu0 {
    public final boolean a;
    public final BitrateLevel b;
    public final BitrateLevel c;
    public final boolean d;
    public final BitrateStrategy e;
    public final HiFiStatus f;

    public vdu0(boolean z, BitrateLevel bitrateLevel, BitrateLevel bitrateLevel2, boolean z2, BitrateStrategy bitrateStrategy, HiFiStatus hiFiStatus) {
        this.a = z;
        this.b = bitrateLevel;
        this.c = bitrateLevel2;
        this.d = z2;
        this.e = bitrateStrategy;
        this.f = hiFiStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdu0)) {
            return false;
        }
        vdu0 vdu0Var = (vdu0) obj;
        return this.a == vdu0Var.a && this.b == vdu0Var.b && this.c == vdu0Var.c && this.d == vdu0Var.d && this.e == vdu0Var.e && this.f == vdu0Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + xcg1.g((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31, 31, this.d)) * 31);
    }
}
