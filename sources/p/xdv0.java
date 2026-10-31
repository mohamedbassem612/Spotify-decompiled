package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xdv0 {
    public final String a;
    public final String b;
    public final boolean c;

    public xdv0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdv0)) {
            return false;
        }
        xdv0 xdv0Var = (xdv0) obj;
        return u890.j(this.a, xdv0Var.a) && u890.j(this.b, xdv0Var.b) && this.c == xdv0Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.c) + cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }
}
