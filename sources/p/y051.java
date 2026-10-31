package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y051 extends q151 {
    public final String a;
    public final String b;
    public final s851 c;

    public y051(String str, String str2, s851 s851Var) {
        this.a = str;
        this.b = str2;
        this.c = s851Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y051)) {
            return false;
        }
        y051 y051Var = (y051) obj;
        return u890.j(this.a, y051Var.a) && u890.j(this.b, y051Var.b) && this.c.equals(y051Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
