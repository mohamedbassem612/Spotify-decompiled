package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r9h implements s9h {
    public final s1b0 a;

    public r9h(s1b0 s1b0Var) {
        this.a = s1b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r9h) && this.a.equals(((r9h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
