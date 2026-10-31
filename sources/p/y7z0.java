package p;

import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y7z0 extends z8z0 {
    public final ContextTrack a;
    public final ArrayList b;
    public final ArrayList c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public y7z0(ContextTrack contextTrack, ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2, String str) {
        this.a = contextTrack;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = z;
        this.e = z2;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7z0)) {
            return false;
        }
        y7z0 y7z0Var = (y7z0) obj;
        return u890.j(this.a, y7z0Var.a) && this.b.equals(y7z0Var.b) && this.c.equals(y7z0Var.c) && this.d == y7z0Var.d && this.e == y7z0Var.e && this.f.equals(y7z0Var.f);
    }

    public final int hashCode() {
        ContextTrack contextTrack = this.a;
        return this.f.hashCode() + xcg1.g(xcg1.g(p3d1.f(this.c, p3d1.f(this.b, (contextTrack == null ? 0 : contextTrack.hashCode()) * 31, 31), 31), 31, this.d), 31, this.e);
    }
}
