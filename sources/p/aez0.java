package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aez0 {
    public final sq61 a;
    public final hux b;

    public aez0(sq61 sq61Var, hux huxVar) {
        this.a = sq61Var;
        this.b = huxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aez0)) {
            return false;
        }
        aez0 aez0Var = (aez0) obj;
        return u890.j(this.a, aez0Var.a) && u890.j(this.b, aez0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
