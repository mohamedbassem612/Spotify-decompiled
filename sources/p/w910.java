package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w910 {
    public final vlo0 a;
    public final boo0 b;

    public w910(vlo0 vlo0Var, boo0 boo0Var) {
        this.a = vlo0Var;
        this.b = boo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w910)) {
            return false;
        }
        w910 w910Var = (w910) obj;
        return u890.j(this.a, w910Var.a) && u890.j(this.b, w910Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }
}
