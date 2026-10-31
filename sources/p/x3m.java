package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x3m extends z3m {
    public final String a;
    public final p791 b;

    public x3m(String str, p791 p791Var) {
        this.a = str;
        this.b = p791Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3m)) {
            return false;
        }
        x3m x3mVar = (x3m) obj;
        return u890.j(this.a, x3mVar.a) && this.b == x3mVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
