package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yg60 {
    public final long a;
    public final long b;
    public final float c;
    public final long d;
    public final long e;

    public yg60(long j, long j2, float f, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = f;
        this.d = j3;
        this.e = j4;
    }

    public final long a() {
        return this.e;
    }

    public final long b() {
        return this.d;
    }

    public final long c() {
        return this.b;
    }

    public final float d() {
        return this.c;
    }

    public final long e() {
        return this.a;
    }

    public final String toString() {
        return "HistoricalChange(uptimeMillis=" + this.a + ", position=" + Offset.i(this.b) + ", scaleFactor=" + this.c + ", panOffset=" + Offset.i(this.d) + ")";
    }
}
