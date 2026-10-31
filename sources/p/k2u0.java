package p;

import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k2u0 {
    public static final k2u0 d = new k2u0(1.0f);
    public static final String e;
    public static final String f;
    public final float a;
    public final float b;
    public final int c;

    static {
        String str = zoi1.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
    }

    public k2u0(float f2, float f3) {
        dm5.m(f2 > 0.0f);
        dm5.m(f3 > 0.0f);
        this.a = f2;
        this.b = f3;
        this.c = Math.round(f2 * 1000.0f);
    }

    public final long a(long j) {
        return j * ((long) this.c);
    }

    public final k2u0 b(float f2) {
        return new k2u0(f2, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k2u0.class == obj.getClass()) {
            k2u0 k2u0Var = (k2u0) obj;
            if (this.a == k2u0Var.a && this.b == k2u0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        String str = zoi1.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public k2u0(float f2) {
        this(f2, 1.0f);
    }
}
