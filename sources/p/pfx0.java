package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pfx0 implements rfx0 {
    public final long a;

    public pfx0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pfx0) && Offset.c(this.a, ((pfx0) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
