package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u4i1 {
    public final di8 a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;

    public u4i1(di8 di8Var, String str, String str2, String str3, Integer num) {
        this.a = di8Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4i1)) {
            return false;
        }
        u4i1 u4i1Var = (u4i1) obj;
        return this.a.equals(u4i1Var.a) && u890.j(this.b, u4i1Var.b) && this.c.equals(u4i1Var.c) && this.d.equals(u4i1Var.d) && this.e.equals(u4i1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
