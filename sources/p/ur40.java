package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ur40 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public ur40(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur40)) {
            return false;
        }
        ur40 ur40Var = (ur40) obj;
        return this.a.equals(ur40Var.a) && u890.j(this.b, ur40Var.b) && this.c == ur40Var.c && this.d == ur40Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(this.d) + kaa0.f(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
