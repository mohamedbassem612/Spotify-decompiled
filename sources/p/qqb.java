package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qqb {
    public final float a;
    public final n6a1 b;

    public qqb(float f, n6a1 n6a1Var) {
        this.a = f;
        this.b = n6a1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqb)) {
            return false;
        }
        qqb qqbVar = (qqb) obj;
        return p3v.c(this.a, qqbVar.a) && this.b.equals(qqbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + p3v.d(this.a) + ", brush=" + this.b + ")";
    }
}
