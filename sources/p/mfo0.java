package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mfo0 {
    public final float a;
    public final float b;

    public mfo0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfo0)) {
            return false;
        }
        mfo0 mfo0Var = (mfo0) obj;
        return p3v.c(this.a, mfo0Var.a) && p3v.c(this.b, mfo0Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
