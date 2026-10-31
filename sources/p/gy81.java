package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gy81 implements o960 {
    public final n960 a;

    public gy81(n960 n960Var) {
        this.a = n960Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gy81) && this.a.equals(((gy81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
