package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hnh1 {
    public final zmh1 a;
    public final String b;
    public final int c;

    public hnh1(zmh1 zmh1Var, String str, int i) {
        this.a = zmh1Var;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hnh1)) {
            return false;
        }
        hnh1 hnh1Var = (hnh1) obj;
        return this.a.equals(hnh1Var.a) && u890.j(this.b, hnh1Var.b) && this.c == hnh1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
