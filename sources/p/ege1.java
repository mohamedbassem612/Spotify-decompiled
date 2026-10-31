package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ege1 implements gge1 {
    public final m1d a;
    public final long b;
    public final long c;

    public ege1(m1d m1dVar, long j, long j2) {
        this.a = m1dVar;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ege1)) {
            return false;
        }
        ege1 ege1Var = (ege1) obj;
        return u890.j(this.a, ege1Var.a) && this.b == ege1Var.b && this.c == ege1Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
