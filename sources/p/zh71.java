package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zh71 {
    public final String a;
    public final String b;
    public final String c;
    public final va71 d;
    public final bb71 e;
    public final p571 f;
    public final int g;
    public final te71 h;

    public zh71(String str, String str2, String str3, va71 va71Var, bb71 bb71Var, p571 p571Var, int i, te71 te71Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = va71Var;
        this.e = bb71Var;
        this.f = p571Var;
        this.g = i;
        this.h = te71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh71)) {
            return false;
        }
        zh71 zh71Var = (zh71) obj;
        return u890.j(this.a, zh71Var.a) && u890.j(this.b, zh71Var.b) && u890.j(this.c, zh71Var.c) && u890.j(this.d, zh71Var.d) && this.e.equals(zh71Var.e) && u890.j(this.f, zh71Var.f) && this.g == zh71Var.g && u890.j(this.h, zh71Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + kaa0.f(this.g, (this.f.hashCode() + ((this.e.hashCode() + ((this.d.a.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31)) * 31, 31);
    }
}
