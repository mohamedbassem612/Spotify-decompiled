package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class oj9 implements uj9 {
    public final String a;
    public final be9 b;

    public oj9(String str, be9 be9Var) {
        this.a = str;
        this.b = be9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!oj9.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        oj9 oj9Var = (oj9) obj;
        return u890.j(this.a, oj9Var.a) && u890.j(this.b, oj9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
