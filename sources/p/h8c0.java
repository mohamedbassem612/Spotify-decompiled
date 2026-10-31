package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h8c0 implements ez00 {
    public final String a;
    public final String b;
    public final h290 c;

    public h8c0(String str, String str2, h290 h290Var) {
        this.a = str;
        this.b = str2;
        this.c = h290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8c0)) {
            return false;
        }
        h8c0 h8c0Var = (h8c0) obj;
        return this.a.equals(h8c0Var.a) && this.b.equals(h8c0Var.b) && this.c.equals(h8c0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
