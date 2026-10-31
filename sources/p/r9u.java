package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r9u extends gau {
    public final k9u a;

    public r9u(k9u k9uVar) {
        this.a = k9uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r9u) && this.a.equals(((r9u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
