package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jsh1 {
    public final gth1 a;

    public jsh1(gth1 gth1Var) {
        this.a = gth1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jsh1) && this.a.equals(((jsh1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
