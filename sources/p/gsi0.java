package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gsi0 {
    public final long a;
    public final boolean b;
    public final long c;

    public gsi0(long j, long j2, boolean z) {
        this.a = j;
        this.b = z;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsi0)) {
            return false;
        }
        gsi0 gsi0Var = (gsi0) obj;
        return this.a == gsi0Var.a && this.b == gsi0Var.b && this.c == gsi0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + xcg1.g(Long.hashCode(this.a) * 31, 31, this.b);
    }
}
