package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wj10 {
    public final String a;
    public final boolean b;
    public final int c;
    public final String d;

    public wj10(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj10)) {
            return false;
        }
        wj10 wj10Var = (wj10) obj;
        return u890.j(this.a, wj10Var.a) && this.b == wj10Var.b && this.c == wj10Var.c && u890.j(this.d, wj10Var.d);
    }

    public final int hashCode() {
        int iK = ab80.k(this.c, (((Boolean.hashCode(this.b) + (this.a.hashCode() * 31)) * 31) + 1577933540) * 31, 31);
        String str = this.d;
        return iK + (str == null ? 0 : str.hashCode());
    }
}
