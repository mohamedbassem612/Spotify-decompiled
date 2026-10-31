package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k761 {
    public final String a;
    public final int b;

    public k761(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k761)) {
            return false;
        }
        k761 k761Var = (k761) obj;
        return u890.j(this.a, k761Var.a) && this.b == k761Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
