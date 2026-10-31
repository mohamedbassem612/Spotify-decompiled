package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tet0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public tet0(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tet0)) {
            return false;
        }
        tet0 tet0Var = (tet0) obj;
        return u890.j(this.a, tet0Var.a) && u890.j(this.b, tet0Var.b) && u890.j(this.c, tet0Var.c) && this.d == tet0Var.d;
    }

    public final int hashCode() {
        String str = this.a;
        int iD = cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        return Integer.hashCode(this.d) + ((iD + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
