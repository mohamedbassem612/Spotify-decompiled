package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zs80 {
    public final String a;
    public final String b;
    public final c380 c;

    public zs80(String str, String str2, c380 c380Var) {
        this.a = str;
        this.b = str2;
        this.c = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs80)) {
            return false;
        }
        zs80 zs80Var = (zs80) obj;
        return u890.j(this.a, zs80Var.a) && u890.j(this.b, zs80Var.b) && u890.j(this.c, zs80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
