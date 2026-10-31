package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oh21 implements ph21 {
    public final String a;
    public final String b;
    public final String c;

    public oh21(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh21)) {
            return false;
        }
        oh21 oh21Var = (oh21) obj;
        return u890.j(this.a, oh21Var.a) && u890.j(this.b, oh21Var.b) && u890.j(this.c, oh21Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
