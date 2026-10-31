package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ci00 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    public ci00(int i, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci00)) {
            return false;
        }
        ci00 ci00Var = (ci00) obj;
        return this.a.equals(ci00Var.a) && u890.j(this.b, ci00Var.b) && this.c.equals(ci00Var.c) && this.d.equals(ci00Var.d) && this.e == ci00Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return l1d.C(this.e) + cy30.d(cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
    }
}
