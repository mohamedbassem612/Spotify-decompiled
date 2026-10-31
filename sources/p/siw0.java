package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class siw0 implements uiw0 {
    public final long a;
    public final long b;
    public final long c;

    public siw0(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof siw0)) {
            return false;
        }
        siw0 siw0Var = (siw0) obj;
        return this.a == siw0Var.a && this.b == siw0Var.b && this.c == siw0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.f(Long.hashCode(this.a) * 31, this.b, 31);
    }
}
