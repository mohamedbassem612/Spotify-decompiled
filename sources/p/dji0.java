package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dji0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public dji0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dji0)) {
            return false;
        }
        dji0 dji0Var = (dji0) obj;
        return u890.j(this.a, dji0Var.a) && u890.j(this.b, dji0Var.b) && u890.j(this.c, dji0Var.c) && u890.j(this.d, dji0Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
