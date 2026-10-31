package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hj80 implements kj80 {
    public final String a;
    public final String b;

    public hj80(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj80)) {
            return false;
        }
        hj80 hj80Var = (hj80) obj;
        return u890.j(this.a, hj80Var.a) && u890.j(this.b, hj80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
