package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jzf1 {
    public final fzf1 a;

    public jzf1(fzf1 fzf1Var) {
        this.a = fzf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jzf1) && this.a == ((jzf1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
