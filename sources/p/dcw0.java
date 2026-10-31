package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dcw0 implements pcw0 {
    public final String a;
    public final long b;

    public dcw0(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dcw0)) {
            return false;
        }
        dcw0 dcw0Var = (dcw0) obj;
        return this.a.equals(dcw0Var.a) && this.b == dcw0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
