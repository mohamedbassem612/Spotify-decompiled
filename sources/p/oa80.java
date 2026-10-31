package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class oa80 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public boolean i;

    public oa80(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
    }

    public final void a() {
        this.i = true;
    }

    public final long b() {
        return this.c;
    }

    public final long c() {
        return this.b;
    }

    public final boolean d() {
        return this.i;
    }

    public final String toString() {
        return "IndirectPointerInputChange(id=" + w8p1.z(this.a) + ", uptimeMillis=" + this.b + ", position=" + Offset.i(this.c) + ", pressed=" + this.d + ", pressure=" + this.e + ", previousUptimeMillis=" + this.f + ", previousPosition=" + Offset.i(this.g) + ", previousPressed=" + this.h + ", isConsumed=" + this.i + ")";
    }
}
