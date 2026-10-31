package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xw9 {
    public final String a;
    public final int b;

    public xw9(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw9)) {
            return false;
        }
        xw9 xw9Var = (xw9) obj;
        return u890.j(this.a, xw9Var.a) && this.b == xw9Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
