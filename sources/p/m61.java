package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m61 {
    public final float a;
    public final float b;

    public m61(float f, float f2) {
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
        if (!(obj instanceof m61)) {
            return false;
        }
        m61 m61Var = (m61) obj;
        return Float.compare(this.a, m61Var.a) == 0 && Float.compare(this.b, m61Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
