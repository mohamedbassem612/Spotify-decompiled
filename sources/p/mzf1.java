package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mzf1 {
    public final fzf1 a;

    public mzf1(fzf1 fzf1Var) {
        this.a = fzf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mzf1) && this.a == ((mzf1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
