package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bl11 {
    public final String a;
    public final h290 b;
    public final al11 c;

    public bl11(String str, h290 h290Var, al11 al11Var) {
        this.a = str;
        this.b = h290Var;
        this.c = al11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl11)) {
            return false;
        }
        bl11 bl11Var = (bl11) obj;
        return this.a.equals(bl11Var.a) && this.b.equals(bl11Var.b) && this.c.equals(bl11Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kk0.g(this.b, this.a.hashCode() * 31, 31);
    }
}
