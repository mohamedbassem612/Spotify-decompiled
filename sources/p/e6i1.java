package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e6i1 {
    public final String a;
    public final d6i1 b;
    public final long c;
    public final boolean d;

    public e6i1(String str, d6i1 d6i1Var, long j, boolean z) {
        this.a = str;
        this.b = d6i1Var;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6i1)) {
            return false;
        }
        e6i1 e6i1Var = (e6i1) obj;
        return u890.j(this.a, e6i1Var.a) && this.b.equals(e6i1Var.b) && this.c == e6i1Var.c && this.d == e6i1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
    }
}
