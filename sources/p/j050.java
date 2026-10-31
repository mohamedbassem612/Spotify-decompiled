package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j050 {
    public final i050 a;

    public j050(i050 i050Var) {
        this.a = i050Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j050) && u890.j(this.a, ((j050) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
