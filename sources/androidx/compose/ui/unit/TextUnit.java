package androidx.compose.ui.unit;

import p.fc11;
import p.wee1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class TextUnit {
    public static final wee1[] b = {new wee1(0), new wee1(4294967296L), new wee1(8589934592L)};
    public static final long c = fc11.Y(Float.NaN, 0);
    public final long a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final long b(long j) {
        return b[(int) ((j & 1095216660480L) >>> 32)].a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final boolean d(long j) {
        return (j & 1095216660480L) == 8589934592L;
    }

    public static final boolean e(long j) {
        return (j & 1095216660480L) == 4294967296L;
    }

    public static String f(long j) {
        long jB = b(j);
        if (wee1.a(jB, 0L)) {
            return "Unspecified";
        }
        if (wee1.a(jB, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (!wee1.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TextUnit) {
            return this.a == ((TextUnit) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return f(this.a);
    }
}
