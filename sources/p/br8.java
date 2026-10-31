package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class br8 implements fr8 {
    public final String a;
    public final String b;
    public final String c;

    public br8(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br8)) {
            return false;
        }
        br8 br8Var = (br8) obj;
        return this.a.equals(br8Var.a) && u890.j(this.b, br8Var.b) && u890.j(this.c, br8Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
