package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zvf0 implements bwf0 {
    public final n4f0 a;

    public zvf0(n4f0 n4f0Var) {
        this.a = n4f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zvf0) && u890.j(this.a, ((zvf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
