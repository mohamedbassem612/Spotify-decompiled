package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class br9 {
    public final String a;
    public final String b;
    public final String c;

    public br9(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br9)) {
            return false;
        }
        br9 br9Var = (br9) obj;
        return this.a.equals(br9Var.a) && u890.j(this.b, br9Var.b) && u890.j(this.c, br9Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
