package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rv90 implements sv90 {
    public final ov90 a;

    public rv90(ov90 ov90Var) {
        this.a = ov90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rv90) && u890.j(this.a, ((rv90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
