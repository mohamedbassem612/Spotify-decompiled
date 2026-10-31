package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q751 {
    public final String a;
    public final int b;

    public q751(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q751)) {
            return false;
        }
        q751 q751Var = (q751) obj;
        return u890.j(this.a, q751Var.a) && this.b == q751Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
