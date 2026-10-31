package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y151 implements j251 {
    public final String a;
    public final String b;

    public y151(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y151)) {
            return false;
        }
        y151 y151Var = (y151) obj;
        return u890.j(this.a, y151Var.a) && this.b.equals(y151Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
