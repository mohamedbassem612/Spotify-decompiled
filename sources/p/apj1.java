package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class apj1 {
    public final int a;
    public final long b;
    public final long c;

    public apj1(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apj1)) {
            return false;
        }
        apj1 apj1Var = (apj1) obj;
        return this.a == apj1Var.a && this.b == apj1Var.b && this.c == apj1Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.f(Integer.hashCode(this.a) * 31, this.b, 31);
    }
}
