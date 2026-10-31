package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ig5 {
    public final fg5 a;

    public ig5(fg5 fg5Var) {
        this.a = fg5Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ig5) {
            return u890.j(((ig5) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
