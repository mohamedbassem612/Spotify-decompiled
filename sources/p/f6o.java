package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f6o extends j6o {
    public final j4s0 a;

    public f6o(j4s0 j4s0Var) {
        this.a = j4s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f6o) && this.a.equals(((f6o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
