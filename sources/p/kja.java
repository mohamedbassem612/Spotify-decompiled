package p;

import androidx.compose.ui.graphics.Brush;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kja {
    public final long a;
    public final Brush b;

    public kja(long j, Brush brush) {
        this.a = j;
        this.b = brush;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kja)) {
            return false;
        }
        kja kjaVar = (kja) obj;
        long j = kjaVar.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && this.b.equals(kjaVar.b);
    }

    public final int hashCode() {
        int i = u7h.l;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }
}
