package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jmp0 {
    public final o571 a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final bb71 e;
    public final va71 f;
    public final String g;
    public final String h;
    public final int i;
    public final boolean j;

    public jmp0(o571 o571Var, boolean z, boolean z2, String str, bb71 bb71Var, va71 va71Var, String str2, String str3, int i, boolean z3) {
        this.a = o571Var;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = bb71Var;
        this.f = va71Var;
        this.g = str2;
        this.h = str3;
        this.i = i;
        this.j = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmp0)) {
            return false;
        }
        jmp0 jmp0Var = (jmp0) obj;
        return u890.j(this.a, jmp0Var.a) && this.b == jmp0Var.b && this.c == jmp0Var.c && u890.j(this.d, jmp0Var.d) && this.e.equals(jmp0Var.e) && u890.j(this.f, jmp0Var.f) && u890.j(this.g, jmp0Var.g) && u890.j(this.h, jmp0Var.h) && this.i == jmp0Var.i && this.j == jmp0Var.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + kaa0.f(this.i, cy30.d(cy30.d((this.f.a.hashCode() + ((this.e.hashCode() + cy30.d(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g), 31, this.h), 31);
    }
}
