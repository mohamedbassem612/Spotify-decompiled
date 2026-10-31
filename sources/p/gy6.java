package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gy6 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;

    public gy6(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy6)) {
            return false;
        }
        gy6 gy6Var = (gy6) obj;
        return u890.j(this.a, gy6Var.a) && u890.j(this.b, gy6Var.b) && this.c == gy6Var.c && u890.j(this.d, gy6Var.d);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        return iF + (str == null ? 0 : str.hashCode());
    }
}
