package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i0s0 {
    public final short a;
    public final short b;
    public final long c;
    public final long d;
    public final float e;
    public final float f;

    /* JADX WARN: Multi-variable type inference failed */
    public i0s0(int i, int i2, long j, long j2, float f, float f2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = f;
        this.f = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0s0)) {
            return false;
        }
        i0s0 i0s0Var = (i0s0) obj;
        return this.a == i0s0Var.a && this.b == i0s0Var.b && Offset.c(this.c, i0s0Var.c) && Offset.c(this.d, i0s0Var.d) && Float.compare(this.e, i0s0Var.e) == 0 && Float.compare(this.f, i0s0Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + x0d.f(cy30.f(cy30.f(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), this.c, 31), this.d, 31), 31, this.e);
    }
}
