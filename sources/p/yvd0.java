package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yvd0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public yvd0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvd0)) {
            return false;
        }
        yvd0 yvd0Var = (yvd0) obj;
        return u890.j(this.a, yvd0Var.a) && u890.j(this.b, yvd0Var.b) && u890.j(this.c, yvd0Var.c) && u890.j(this.d, yvd0Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
