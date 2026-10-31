package p;

import android.view.Surface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i390 {
    public final Surface a;
    public final l291 b;
    public final boolean c;

    public /* synthetic */ i390(Surface surface, l291 l291Var, int i) {
        this((i & 1) != 0 ? null : surface, (i & 2) != 0 ? new l291(0, 0) : l291Var, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i390)) {
            return false;
        }
        i390 i390Var = (i390) obj;
        return u890.j(this.a, i390Var.a) && u890.j(this.b, i390Var.b) && this.c == i390Var.c;
    }

    public final int hashCode() {
        Surface surface = this.a;
        int iHashCode = surface == null ? 0 : surface.hashCode();
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    public i390(Surface surface, l291 l291Var, boolean z) {
        this.a = surface;
        this.b = l291Var;
        this.c = z;
    }
}
