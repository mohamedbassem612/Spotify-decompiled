package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mvx0 extends qvx0 {
    public final String a;
    public final String b;
    public final tv80 c;

    public mvx0(String str, String str2, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvx0)) {
            return false;
        }
        mvx0 mvx0Var = (mvx0) obj;
        return u890.j(this.a, mvx0Var.a) && u890.j(this.b, mvx0Var.b) && u890.j(this.c, mvx0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
