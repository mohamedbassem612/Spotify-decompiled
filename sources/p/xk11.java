package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xk11 implements al11 {
    public final String a;
    public final String b;

    public xk11(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk11)) {
            return false;
        }
        xk11 xk11Var = (xk11) obj;
        return this.a.equals(xk11Var.a) && this.b.equals(xk11Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
