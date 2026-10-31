package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vl50 {
    public final String a;
    public final String b;
    public final String c;
    public final byte d;
    public final String e;

    /* JADX WARN: Multi-variable type inference failed */
    public vl50(int i, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl50)) {
            return false;
        }
        vl50 vl50Var = (vl50) obj;
        return u890.j(this.a, vl50Var.a) && u890.j(this.b, vl50Var.b) && u890.j(this.c, vl50Var.c) && this.d == vl50Var.d && u890.j(this.e, vl50Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iF = kaa0.f(this.d, cy30.d(cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31);
        String str2 = this.e;
        return iF + (str2 != null ? str2.hashCode() : 0);
    }
}
