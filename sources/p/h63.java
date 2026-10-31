package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h63 {
    public final String a;
    public final int b;
    public final String c;
    public final Integer d;
    public final Integer e;

    public h63(int i, Integer num, Integer num2, String str, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = num;
        this.e = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h63)) {
            return false;
        }
        h63 h63Var = (h63) obj;
        return u890.j(this.a, h63Var.a) && this.b == h63Var.b && u890.j(this.c, h63Var.c) && u890.j(this.d, h63Var.d) && u890.j(this.e, h63Var.e);
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }
}
