package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c0h0 implements k0h0 {
    public final long a;
    public final e28 b;
    public final String c;

    public c0h0(long j, e28 e28Var, String str) {
        this.a = j;
        this.b = e28Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0h0)) {
            return false;
        }
        c0h0 c0h0Var = (c0h0) obj;
        return this.a == c0h0Var.a && this.b.equals(c0h0Var.b) && this.c.equals(c0h0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }
}
