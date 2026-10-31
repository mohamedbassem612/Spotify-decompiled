package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tqp0 {
    public final String a;
    public final sqp0 b;
    public final long c;

    public tqp0(String str, sqp0 sqp0Var, long j) {
        this.a = str;
        this.b = sqp0Var;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqp0)) {
            return false;
        }
        tqp0 tqp0Var = (tqp0) obj;
        return u890.j(this.a, tqp0Var.a) && this.b == tqp0Var.b && this.c == tqp0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
