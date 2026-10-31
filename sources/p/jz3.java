package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jz3 extends n560 {
    public final String a;
    public final String b;
    public final String c;

    public jz3(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz3)) {
            return false;
        }
        jz3 jz3Var = (jz3) obj;
        return u890.j(this.a, jz3Var.a) && u890.j(this.b, jz3Var.b) && u890.j(this.c, jz3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
