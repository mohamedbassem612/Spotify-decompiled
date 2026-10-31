package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jpm0 {
    public final int a;
    public final int b;
    public final float c;

    public jpm0(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public static jpm0 a(int i) {
        int i2 = (i >> 13) & 7;
        if (i2 == 0) {
            return null;
        }
        return new jpm0(i2, (i >> 10) & 7, ((i & 511) * ((i & 512) != 0 ? -1 : 1)) / 10.0f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jpm0)) {
            return false;
        }
        jpm0 jpm0Var = (jpm0) obj;
        return this.a == jpm0Var.a && this.b == jpm0Var.b && Float.compare(this.c, jpm0Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "GainField{name=" + this.a + ", originator=" + this.b + ", gain=" + this.c + '}';
    }
}
