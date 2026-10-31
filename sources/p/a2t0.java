package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a2t0 {
    public final long a;
    public final float b;

    public a2t0(long j, float f) {
        this.a = j;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2t0)) {
            return false;
        }
        a2t0 a2t0Var = (a2t0) obj;
        return Offset.c(this.a, a2t0Var.a) && Float.compare(this.b, a2t0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
