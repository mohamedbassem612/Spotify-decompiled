package p;

import android.view.Surface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o3d1 {
    public final Surface a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;

    public o3d1(Surface surface, int i, int i2, int i3, boolean z) {
        dm5.n(i3 == 0 || i3 == 90 || i3 == 180 || i3 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.a = surface;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3d1)) {
            return false;
        }
        o3d1 o3d1Var = (o3d1) obj;
        return this.b == o3d1Var.b && this.c == o3d1Var.c && this.d == o3d1Var.d && this.e == o3d1Var.e && this.a.equals(o3d1Var.a);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + (this.e ? 1 : 0);
    }
}
