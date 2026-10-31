package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r8h1 {
    public final boolean a;
    public final long b;

    public r8h1(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8h1)) {
            return false;
        }
        r8h1 r8h1Var = (r8h1) obj;
        return this.a == r8h1Var.a && this.b == r8h1Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
