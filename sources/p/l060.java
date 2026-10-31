package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l060 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public l060(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l060)) {
            return false;
        }
        l060 l060Var = (l060) obj;
        return u890.j(this.a, l060Var.a) && u890.j(this.b, l060Var.b) && this.c == l060Var.c && this.d == l060Var.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
