package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h560 extends j560 {
    public final m560 a;

    public h560(m560 m560Var) {
        this.a = m560Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h560) && this.a.equals(((h560) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
