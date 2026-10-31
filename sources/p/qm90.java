package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qm90 {
    public final float a;
    public final float b;

    public qm90(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm90)) {
            return false;
        }
        qm90 qm90Var = (qm90) obj;
        return p3v.c(this.a, qm90Var.a) && p3v.c(this.b, qm90Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
