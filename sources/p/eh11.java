package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class eh11 extends gh11 {
    public final hh11 a;

    public eh11(hh11 hh11Var) {
        this.a = hh11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eh11) && this.a.equals(((eh11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
