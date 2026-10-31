package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nx01 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;

    public nx01(int i, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx01)) {
            return false;
        }
        nx01 nx01Var = (nx01) obj;
        return u890.j(this.a, nx01Var.a) && u890.j(this.b, nx01Var.b) && this.c == nx01Var.c && u890.j(this.d, nx01Var.d) && u890.j(this.e, nx01Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }
}
