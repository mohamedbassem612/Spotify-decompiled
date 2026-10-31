package p;

import com.spotify.player.model.ContextTrack;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class t5z0 extends ajo1 {
    public final ContextTrack d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final Map j;

    public t5z0(ContextTrack contextTrack, int i, int i2, boolean z, boolean z2, boolean z3, Map map) {
        this.d = contextTrack;
        this.e = i;
        this.f = i2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5z0)) {
            return false;
        }
        t5z0 t5z0Var = (t5z0) obj;
        return u890.j(this.d, t5z0Var.d) && this.e == t5z0Var.e && this.f == t5z0Var.f && this.g == t5z0Var.g && this.h == t5z0Var.h && this.i == t5z0Var.i && u890.j(this.j, t5z0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + xcg1.g(xcg1.g(xcg1.g(kaa0.f(this.f, kaa0.f(this.e, this.d.hashCode() * 31, 31), 31), 31, this.g), 31, this.h), 31, this.i);
    }
}
