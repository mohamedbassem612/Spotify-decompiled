package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y60 {
    public final x60 a;
    public final Object b;

    public y60(x60 x60Var, Object obj) {
        this.a = x60Var;
        this.b = obj;
    }

    public final x60 a() {
        return this.a;
    }

    public final Object b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y60)) {
            return false;
        }
        y60 y60Var = (y60) obj;
        return this.a.equals(y60Var.a) && u890.j(this.b, y60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + this.a.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a.a + ", " + this.b + ')';
    }
}
