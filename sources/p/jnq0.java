package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jnq0 extends poz0 {
    public final m560 b;

    public jnq0(m560 m560Var) {
        this.b = m560Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jnq0) && u890.j(this.b, ((jnq0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
