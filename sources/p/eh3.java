package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eh3 {
    public final h290 a;

    public eh3(h290 h290Var) {
        this.a = h290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eh3) && this.a.equals(((eh3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
