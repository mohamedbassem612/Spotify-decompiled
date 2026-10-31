package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rlw0 implements vlw0 {
    public final String a;
    public final long b;
    public final long c;

    public rlw0(long j, long j2, String str) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rlw0)) {
            return false;
        }
        rlw0 rlw0Var = (rlw0) obj;
        return u890.j(this.a, rlw0Var.a) && this.b == rlw0Var.b && this.c == rlw0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
