package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xnq0 extends hoq0 {
    public final m560 a;

    public xnq0(m560 m560Var) {
        this.a = m560Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xnq0) && u890.j(this.a, ((xnq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
