package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uji0 {
    public final tni0 a;
    public final String b;
    public final h290 c;
    public final String d;

    public uji0(tni0 tni0Var, String str, h290 h290Var, String str2) {
        this.a = tni0Var;
        this.b = str;
        this.c = h290Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uji0)) {
            return false;
        }
        uji0 uji0Var = (uji0) obj;
        return this.a.equals(uji0Var.a) && this.b.equals(uji0Var.b) && this.c.equals(uji0Var.c) && this.d.equals(uji0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kk0.g(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
