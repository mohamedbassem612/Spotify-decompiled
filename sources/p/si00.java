package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class si00 {
    public final m920 a;

    public si00(m920 m920Var) {
        this.a = m920Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof si00) && this.a.equals(((si00) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
