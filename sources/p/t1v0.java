package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t1v0 {
    public final String a;
    public final p260 b;

    public t1v0(String str, p260 p260Var) {
        this.a = str;
        this.b = p260Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1v0)) {
            return false;
        }
        t1v0 t1v0Var = (t1v0) obj;
        return u890.j(this.a, t1v0Var.a) && u890.j(this.b, t1v0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
