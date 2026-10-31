package p;

import android.graphics.Rect;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class v3d {
    public final Rect a;
    public final int b;
    public final int c;

    public v3d(Rect rect, int i, int i2) {
        this.a = rect;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3d)) {
            return false;
        }
        v3d v3dVar = (v3d) obj;
        return this.a.equals(v3dVar.a) && this.b == v3dVar.b && this.c == v3dVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
