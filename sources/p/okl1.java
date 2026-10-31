package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class okl1 {
    public final String a;
    public final long b;

    public okl1(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final String a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof okl1)) {
            return false;
        }
        okl1 okl1Var = (okl1) obj;
        return this.a.equals(okl1Var.a) && this.b == okl1Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
