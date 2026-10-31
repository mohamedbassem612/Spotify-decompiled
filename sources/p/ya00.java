package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ya00 {
    public final int a;
    public final String b;
    public final int c;
    public final String d;

    public ya00(String str, int i, int i2, int i3, String str2) {
        i2 = (i3 & 4) != 0 ? 0 : i2;
        str2 = (i3 & 16) != 0 ? null : str2;
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya00)) {
            return false;
        }
        ya00 ya00Var = (ya00) obj;
        return this.a == ya00Var.a && u890.j(this.b, ya00Var.b) && this.c == ya00Var.c && u890.j(this.d, ya00Var.d);
    }

    public final int hashCode() {
        int i = this.a;
        int iC = (i == 0 ? 0 : l1d.C(i)) * 31;
        String str = this.b;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        int i2 = this.c;
        int iC2 = (iHashCode + (i2 == 0 ? 0 : l1d.C(i2))) * 961;
        String str2 = this.d;
        return (iC2 + (str2 != null ? str2.hashCode() : 0)) * 29791;
    }
}
