package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zj51 {
    public final String a;
    public final String b;
    public final xj51 c;

    public zj51(String str, String str2, xj51 xj51Var) {
        this.a = str;
        this.b = str2;
        this.c = xj51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj51)) {
            return false;
        }
        zj51 zj51Var = (zj51) obj;
        return u890.j(this.a, zj51Var.a) && u890.j(this.b, zj51Var.b) && this.c.equals(zj51Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }
}
