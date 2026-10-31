package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a0b0 implements c0b0 {
    public final n4f0 a;

    public a0b0(n4f0 n4f0Var) {
        this.a = n4f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0b0) && u890.j(this.a, ((a0b0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
