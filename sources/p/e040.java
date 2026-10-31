package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e040 {
    public final String a;
    public final String b;
    public final String c;

    public e040(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e040)) {
            return false;
        }
        e040 e040Var = (e040) obj;
        return this.a.equals(e040Var.a) && this.b.equals(e040Var.b) && u890.j(this.c, e040Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
