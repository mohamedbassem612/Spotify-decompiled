package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xw7 {
    public final float a;
    public final float b;

    public xw7(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final float a() {
        return this.b;
    }

    public final float b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw7)) {
            return false;
        }
        xw7 xw7Var = (xw7) obj;
        return Float.compare(this.a, xw7Var.a) == 0 && Float.compare(this.b, xw7Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
