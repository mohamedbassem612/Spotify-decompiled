package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class odc1 {
    public final String a;
    public final String b;
    public final String c;

    public odc1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odc1)) {
            return false;
        }
        odc1 odc1Var = (odc1) obj;
        return u890.j(this.a, odc1Var.a) && u890.j(this.b, odc1Var.b) && this.c.equals(odc1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
