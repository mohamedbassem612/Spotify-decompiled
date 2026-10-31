package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c180 {
    public final b180 a;
    public final int b;

    public c180(b180 b180Var, int i) {
        this.a = b180Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c180)) {
            return false;
        }
        c180 c180Var = (c180) obj;
        return this.a.equals(c180Var.a) && this.b == c180Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageVectorEntry(imageVector=" + this.a + ", configFlags=" + this.b + ")";
    }
}
