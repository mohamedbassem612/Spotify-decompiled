package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fj6 {
    public final String a;
    public final String b;
    public final yj41 c;

    public fj6(String str, String str2, yj41 yj41Var) {
        this.a = str;
        this.b = str2;
        this.c = yj41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj6)) {
            return false;
        }
        fj6 fj6Var = (fj6) obj;
        return u890.j(this.a, fj6Var.a) && u890.j(this.b, fj6Var.b) && u890.j(this.c, fj6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
