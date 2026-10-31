package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u7y0 {
    public final fo01 a;
    public final mmw0 b;
    public final long c;

    public u7y0(fo01 fo01Var, mmw0 mmw0Var, long j) {
        this.a = fo01Var;
        this.b = mmw0Var;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7y0)) {
            return false;
        }
        u7y0 u7y0Var = (u7y0) obj;
        return this.a == u7y0Var.a && u890.j(this.b, u7y0Var.b) && this.c == u7y0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
