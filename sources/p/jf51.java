package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jf51 extends zf51 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public jf51(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf51)) {
            return false;
        }
        jf51 jf51Var = (jf51) obj;
        return u890.j(this.a, jf51Var.a) && u890.j(this.b, jf51Var.b) && u890.j(this.c, jf51Var.c) && u890.j(this.d, jf51Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
