package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zxk1 implements ayk1 {
    public final String a;
    public final String b;
    public final String c;

    public zxk1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxk1)) {
            return false;
        }
        zxk1 zxk1Var = (zxk1) obj;
        return u890.j(this.a, zxk1Var.a) && u890.j(this.b, zxk1Var.b) && u890.j(this.c, zxk1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
