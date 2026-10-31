package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o89 {
    public final String a;
    public final String b;
    public final f0u c;
    public final boolean d;

    public o89(String str, String str2, f0u f0uVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = f0uVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o89)) {
            return false;
        }
        o89 o89Var = (o89) obj;
        return u890.j(this.a, o89Var.a) && u890.j(this.b, o89Var.b) && this.c == o89Var.c && this.d == o89Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
