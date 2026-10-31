package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qgq0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public qgq0(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgq0)) {
            return false;
        }
        qgq0 qgq0Var = (qgq0) obj;
        return u890.j(this.a, qgq0Var.a) && u890.j(this.b, qgq0Var.b) && u890.j(this.c, qgq0Var.c) && this.d == qgq0Var.d;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
