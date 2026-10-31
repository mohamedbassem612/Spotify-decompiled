package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yi9 implements bj9 {
    public final String a;
    public final be9 b;

    public yi9(String str, be9 be9Var) {
        this.a = str;
        this.b = be9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!yi9.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        yi9 yi9Var = (yi9) obj;
        return u890.j(this.a, yi9Var.a) && u890.j(this.b, yi9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
