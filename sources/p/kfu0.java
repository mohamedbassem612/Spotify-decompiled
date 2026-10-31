package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kfu0 extends sfu0 {
    public final String a;
    public final long b;

    public kfu0(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfu0)) {
            return false;
        }
        kfu0 kfu0Var = (kfu0) obj;
        return u890.j(this.a, kfu0Var.a) && this.b == kfu0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
