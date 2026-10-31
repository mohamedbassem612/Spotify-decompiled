package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jnm1 implements pnm1 {
    public final String a;
    public final String b;
    public final Integer c;
    public final String d;
    public final boolean e;

    public jnm1(Integer num, String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = str3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnm1)) {
            return false;
        }
        jnm1 jnm1Var = (jnm1) obj;
        return this.a.equals(jnm1Var.a) && u890.j(this.b, jnm1Var.b) && u890.j(this.c, jnm1Var.c) && this.d.equals(jnm1Var.d) && this.e == jnm1Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return Boolean.hashCode(this.e) + cy30.d((iD + (num == null ? 0 : num.hashCode())) * 31, 31, this.d);
    }
}
