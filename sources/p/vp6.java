package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vp6 {
    public final String a;
    public final String b;
    public final String c;

    public vp6(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp6)) {
            return false;
        }
        vp6 vp6Var = (vp6) obj;
        return this.a.equals(vp6Var.a) && this.b.equals(vp6Var.b) && u890.j(this.c, vp6Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
