package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nb6 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final o1v f;

    public nb6(String str, String str2, String str3, int i, String str4, o1v o1vVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = o1vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb6)) {
            return false;
        }
        nb6 nb6Var = (nb6) obj;
        return this.a.equals(nb6Var.a) && this.b.equals(nb6Var.b) && this.c.equals(nb6Var.c) && this.d == nb6Var.d && this.e.equals(nb6Var.e) && this.f == nb6Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(kaa0.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }
}
