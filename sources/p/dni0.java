package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dni0 implements le90 {
    public final String a;
    public final String b;
    public final String c;
    public final l371 d;

    public dni0(String str, String str2, String str3, l371 l371Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = l371Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dni0)) {
            return false;
        }
        dni0 dni0Var = (dni0) obj;
        return this.a.equals(dni0Var.a) && this.b.equals(dni0Var.b) && this.c.equals(dni0Var.c) && this.d.equals(dni0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
