package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ts9 {
    public final String a;
    public final String b;
    public final String c;

    public ts9(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ts9)) {
            return false;
        }
        ts9 ts9Var = (ts9) obj;
        return u890.j(this.a, ts9Var.a) && this.b.equals(ts9Var.b) && u890.j(this.c, ts9Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
