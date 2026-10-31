package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pju0 implements tju0 {
    public final String a;
    public final String b;
    public final String c;

    public pju0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pju0)) {
            return false;
        }
        pju0 pju0Var = (pju0) obj;
        return u890.j(this.a, pju0Var.a) && u890.j(this.b, pju0Var.b) && u890.j(this.c, pju0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
