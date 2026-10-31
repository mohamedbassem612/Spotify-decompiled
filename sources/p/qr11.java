package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qr11 {
    public final String a;
    public final boolean b;
    public final String c;

    public qr11(String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr11)) {
            return false;
        }
        qr11 qr11Var = (qr11) obj;
        return u890.j(this.a, qr11Var.a) && this.b == qr11Var.b && u890.j(this.c, qr11Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iG + (str == null ? 0 : str.hashCode());
    }
}
