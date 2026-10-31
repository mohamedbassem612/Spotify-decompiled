package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k050 {
    public final i050 a;

    public k050(i050 i050Var) {
        this.a = i050Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k050) && u890.j(this.a, ((k050) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
