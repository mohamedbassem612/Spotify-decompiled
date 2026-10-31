package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ar00 {
    public final String a;
    public final String b;
    public final br00 c;
    public final String d;
    public final boolean e;

    public ar00(int i, String str, String str2) {
        this(str, str2, new br00((2 & 1) != 0 ? 0 : i, 1, null), "", 16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar00)) {
            return false;
        }
        ar00 ar00Var = (ar00) obj;
        return u890.j(this.a, ar00Var.a) && u890.j(this.b, ar00Var.b) && u890.j(this.c, ar00Var.c) && u890.j(this.d, ar00Var.d) && this.e == ar00Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.e) + cy30.d((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d);
    }

    public /* synthetic */ ar00(String str, String str2, br00 br00Var, String str3, int i) {
        this(str, (i & 2) != 0 ? null : str2, br00Var, (i & 8) != 0 ? "" : str3, true);
    }

    public ar00(String str, String str2, br00 br00Var, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = br00Var;
        this.d = str3;
        this.e = z;
    }
}
