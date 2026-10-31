package p;

import com.spotify.player.model.PlayerState;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gzo0 {
    public final PlayerState a;
    public final lzo0 b;
    public final boolean c;
    public final hry0 d;
    public final t62 e;
    public final boolean f;
    public final Map g;
    public final boolean h;

    public gzo0(PlayerState playerState, lzo0 lzo0Var, boolean z, hry0 hry0Var, t62 t62Var, boolean z2, Map map, boolean z3) {
        this.a = playerState;
        this.b = lzo0Var;
        this.c = z;
        this.d = hry0Var;
        this.e = t62Var;
        this.f = z2;
        this.g = map;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzo0)) {
            return false;
        }
        gzo0 gzo0Var = (gzo0) obj;
        return this.a.equals(gzo0Var.a) && this.b.equals(gzo0Var.b) && this.c == gzo0Var.c && this.d.equals(gzo0Var.d) && this.e.equals(gzo0Var.e) && this.f == gzo0Var.f && this.g.equals(gzo0Var.g) && this.h == gzo0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + cy30.e(xcg1.g((this.e.hashCode() + ((this.d.hashCode() + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31)) * 31, 31, this.f), 31, this.g);
    }
}
