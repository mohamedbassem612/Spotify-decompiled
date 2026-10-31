package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jv01 {
    public final String a;
    public final boolean b;
    public final Integer c;
    public final boolean d;

    public jv01(Integer num, String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = num;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv01)) {
            return false;
        }
        jv01 jv01Var = (jv01) obj;
        return this.a.equals(jv01Var.a) && this.b == jv01Var.b && u890.j(this.c, jv01Var.c) && this.d == jv01Var.d;
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return Boolean.hashCode(this.d) + ((iG + (num == null ? 0 : num.hashCode())) * 31);
    }
}
