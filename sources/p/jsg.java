package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jsg implements ksg {
    public final float a;
    public final float b;

    public jsg(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jsg)) {
            return false;
        }
        if (isEmpty() && ((jsg) obj).isEmpty()) {
            return true;
        }
        jsg jsgVar = (jsg) obj;
        return this.a == jsgVar.a && this.b == jsgVar.b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final boolean isEmpty() {
        return this.a > this.b;
    }

    public final Comparable m() {
        return Float.valueOf(this.a);
    }

    public final Comparable n() {
        return Float.valueOf(this.b);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
