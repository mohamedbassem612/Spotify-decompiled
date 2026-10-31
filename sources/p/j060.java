package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j060 {
    public final String a;
    public final String b;
    public final String c;

    public j060(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j060)) {
            return false;
        }
        j060 j060Var = (j060) obj;
        return u890.j(this.a, j060Var.a) && this.b.equals(j060Var.b) && u890.j(this.c, j060Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
