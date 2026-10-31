package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t9u extends gau {
    public final s9l1 a;

    public t9u(s9l1 s9l1Var) {
        this.a = s9l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t9u) && u890.j(this.a, ((t9u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
