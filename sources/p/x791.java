package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x791 {
    public final tv80 a;
    public final long b;

    public x791(long j, tv80 tv80Var) {
        this.a = tv80Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x791)) {
            return false;
        }
        x791 x791Var = (x791) obj;
        return u890.j(this.a, x791Var.a) && this.b == x791Var.b;
    }

    public final int hashCode() {
        tv80 tv80Var = this.a;
        return Long.hashCode(this.b) + ((tv80Var == null ? 0 : tv80Var.hashCode()) * 31);
    }
}
