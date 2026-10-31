package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fui0 {
    public final String a;
    public final String b;
    public final String c;

    public fui0(String str, String str2, int i, String str3) {
        str3 = (i & 64) != 0 ? null : str3;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fui0)) {
            return false;
        }
        fui0 fui0Var = (fui0) obj;
        return this.a.equals(fui0Var.a) && this.b.equals(fui0Var.b) && u890.j(this.c, fui0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 28629151, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
