package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class px00 {
    public final String a;
    public final ix00 b;
    public final long c;
    public final boolean d;

    public px00(String str, ix00 ix00Var, long j, boolean z) {
        this.a = str;
        this.b = ix00Var;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px00)) {
            return false;
        }
        px00 px00Var = (px00) obj;
        return u890.j(this.a, px00Var.a) && this.b.equals(px00Var.b) && this.c == px00Var.c && this.d == px00Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
    }
}
