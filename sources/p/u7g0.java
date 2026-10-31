package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u7g0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;

    public u7g0(String str, String str2, Integer num, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7g0)) {
            return false;
        }
        u7g0 u7g0Var = (u7g0) obj;
        return this.a.equals(u7g0Var.a) && this.b.equals(u7g0Var.b) && this.c.equals(u7g0Var.c) && this.d.equals(u7g0Var.d) && this.e.equals(u7g0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
