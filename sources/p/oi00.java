package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oi00 {
    public final ni00 a;

    public oi00(ni00 ni00Var) {
        this.a = ni00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oi00) && u890.j(this.a, ((oi00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
