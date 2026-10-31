package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rm90 {
    public final float a;
    public final float b;

    public rm90(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm90)) {
            return false;
        }
        rm90 rm90Var = (rm90) obj;
        return p3v.c(this.a, rm90Var.a) && p3v.c(this.b, rm90Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
