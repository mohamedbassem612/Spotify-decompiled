package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hk91 extends yk91 {
    public final int a;
    public final String b;
    public final li91 c;

    public hk91(int i, String str, li91 li91Var) {
        this.a = i;
        this.b = str;
        this.c = li91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk91)) {
            return false;
        }
        hk91 hk91Var = (hk91) obj;
        return this.a == hk91Var.a && u890.j(this.b, hk91Var.b) && this.c.equals(hk91Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }
}
