package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kq50 {
    public final y3g a;
    public final String b;

    public kq50(y3g y3gVar, String str) {
        this.a = y3gVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq50)) {
            return false;
        }
        kq50 kq50Var = (kq50) obj;
        return u890.j(this.a, kq50Var.a) && u890.j(this.b, kq50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
