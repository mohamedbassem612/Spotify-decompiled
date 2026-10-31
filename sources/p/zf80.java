package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zf80 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final n6k1 e;
    public final String f;

    public zf80(String str, String str2, String str3, String str4, n6k1 n6k1Var, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = n6k1Var;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf80)) {
            return false;
        }
        zf80 zf80Var = (zf80) obj;
        return this.a.equals(zf80Var.a) && this.b.equals(zf80Var.b) && this.c.equals(zf80Var.c) && this.d.equals(zf80Var.d) && this.e.equals(zf80Var.e) && u890.j(this.f, zf80Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }
}
