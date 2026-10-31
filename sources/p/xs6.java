package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xs6 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;

    public xs6(int i, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs6)) {
            return false;
        }
        xs6 xs6Var = (xs6) obj;
        return this.a.equals(xs6Var.a) && this.b.equals(xs6Var.b) && this.c.equals(xs6Var.c) && this.d == xs6Var.d && this.e.equals(xs6Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kaa0.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }
}
