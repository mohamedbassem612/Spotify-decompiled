package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class acf0 extends bcf0 {
    public final float a;

    public acf0(float f) {
        this.a = f;
    }

    public final float a(fcf0 fcf0Var) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof acf0) {
            return Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.a, ((acf0) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a) + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return c13.h("Progress(min=0.0, max=", this.a, ")");
    }
}
