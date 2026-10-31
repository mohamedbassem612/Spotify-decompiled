package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tw9 {
    public final long a;
    public final int b = 1;

    public tw9(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw9)) {
            return false;
        }
        tw9 tw9Var = (tw9) obj;
        long j = tw9Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && this.b == tw9Var.b;
    }

    public final int hashCode() {
        int i = u7h.l;
        return l1d.C(this.b) + (Long.hashCode(this.a) * 961);
    }
}
