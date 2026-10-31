package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hqt0 {
    public final String a;
    public final String b;
    public final tv80 c;
    public final String d;

    public hqt0(String str, String str2, String str3, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = tv80Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqt0)) {
            return false;
        }
        hqt0 hqt0Var = (hqt0) obj;
        return u890.j(this.a, hqt0Var.a) && u890.j(this.b, hqt0Var.b) && u890.j(this.c, hqt0Var.c) && u890.j(this.d, hqt0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
