package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m821 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public m821(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m821)) {
            return false;
        }
        m821 m821Var = (m821) obj;
        return u890.j(this.a, m821Var.a) && u890.j(this.b, m821Var.b) && u890.j(this.c, m821Var.c) && u890.j(this.d, m821Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
