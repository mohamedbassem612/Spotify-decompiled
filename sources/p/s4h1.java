package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class s4h1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public s4h1(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4h1)) {
            return false;
        }
        s4h1 s4h1Var = (s4h1) obj;
        return u890.j(this.a, s4h1Var.a) && u890.j(this.b, s4h1Var.b) && u890.j(this.c, s4h1Var.c) && u890.j(this.d, s4h1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
