package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ooq0 extends toq0 {
    public final m560 a;

    public ooq0(m560 m560Var) {
        this.a = m560Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ooq0) && u890.j(this.a, ((ooq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
