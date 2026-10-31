package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class k46 implements n46 {
    public final String a;
    public final long b;

    public k46(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k46)) {
            return false;
        }
        k46 k46Var = (k46) obj;
        return this.a.equals(k46Var.a) && this.b == k46Var.b;
    }

    public final String getMessage() {
        return this.a;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
