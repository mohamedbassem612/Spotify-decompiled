package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x5g implements c6g {
    public final i050 a;

    public x5g(i050 i050Var) {
        this.a = i050Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x5g) && u890.j(this.a, ((x5g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
