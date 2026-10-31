package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ev00 {
    public final String a;
    public final tka0 b;
    public final xv00 c;

    public ev00(String str, tka0 tka0Var, xv00 xv00Var) {
        this.a = str;
        this.b = tka0Var;
        this.c = xv00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev00)) {
            return false;
        }
        ev00 ev00Var = (ev00) obj;
        return this.a.equals(ev00Var.a) && u890.j(this.b, ev00Var.b) && this.c.equals(ev00Var.c);
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + this.c.b;
    }
}
