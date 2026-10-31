package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class n8k1 implements s9k1 {
    public final String a;
    public final int b;

    public /* synthetic */ n8k1(String str) {
        this(str, str.length());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8k1)) {
            return false;
        }
        n8k1 n8k1Var = (n8k1) obj;
        return u890.j(this.a, n8k1Var.a) && this.b == n8k1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public n8k1(String str, int i) {
        this.a = str;
        this.b = i;
    }
}
