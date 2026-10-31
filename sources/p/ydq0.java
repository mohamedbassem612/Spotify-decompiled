package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ydq0 implements ceq0 {
    public final String a;
    public final xbq0 b;

    public ydq0(String str, xbq0 xbq0Var) {
        this.a = str;
        this.b = xbq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydq0)) {
            return false;
        }
        ydq0 ydq0Var = (ydq0) obj;
        return u890.j(this.a, ydq0Var.a) && this.b.equals(ydq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
