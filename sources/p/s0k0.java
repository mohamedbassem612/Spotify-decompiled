package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class s0k0 implements k1k0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public s0k0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0k0)) {
            return false;
        }
        s0k0 s0k0Var = (s0k0) obj;
        return u890.j(this.a, s0k0Var.a) && u890.j(this.b, s0k0Var.b) && u890.j(this.c, s0k0Var.c) && u890.j(this.d, s0k0Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
