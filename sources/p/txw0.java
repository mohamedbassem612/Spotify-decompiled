package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class txw0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public txw0(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txw0)) {
            return false;
        }
        txw0 txw0Var = (txw0) obj;
        return u890.j(this.a, txw0Var.a) && u890.j(this.b, txw0Var.b) && u890.j(this.c, txw0Var.c) && this.d == txw0Var.d;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
