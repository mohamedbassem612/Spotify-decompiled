package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class u3k0 implements k4k0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public u3k0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3k0)) {
            return false;
        }
        u3k0 u3k0Var = (u3k0) obj;
        return u890.j(this.a, u3k0Var.a) && u890.j(this.b, u3k0Var.b) && u890.j(this.c, u3k0Var.c) && u890.j(this.d, u3k0Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
