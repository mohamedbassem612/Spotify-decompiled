package androidx.compose.ui.geometry;

import p.cy30;
import p.yah0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class Size {
    public final long a;

    public static final long a(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static /* synthetic */ long b(long j, int i, float f, float f2) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return a(f, f2);
    }

    public static final boolean c(long j, long j2) {
        return j == j2;
    }

    public static final float d(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float e(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static final float f(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean g(long j) {
        return (j == 9205357640488583168L) | (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f);
    }

    public static String h(long j) {
        return j != 9205357640488583168L ? cy30.p("Size(", yah0.z(Float.intBitsToFloat((int) (j >> 32))), ", ", yah0.z(Float.intBitsToFloat((int) (j & 4294967295L))), ")") : "Size.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Size) {
            return this.a == ((Size) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return h(this.a);
    }
}
