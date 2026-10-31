package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class li51 {
    public final String a;
    public final String b;
    public final String c;

    public li51(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li51)) {
            return false;
        }
        li51 li51Var = (li51) obj;
        return u890.j(this.a, li51Var.a) && u890.j(this.b, li51Var.b) && u890.j(this.c, li51Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
