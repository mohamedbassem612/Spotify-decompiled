package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ret {
    public final String a;
    public final cd90 b;
    public final String c;
    public final boolean d;

    public ret(String str, cd90 cd90Var, String str2, boolean z) {
        this.a = str;
        this.b = cd90Var;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ret)) {
            return false;
        }
        ret retVar = (ret) obj;
        return this.a.equals(retVar.a) && u890.j(this.b, retVar.b) && u890.j(this.c, retVar.c) && this.d == retVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.d(f4i1.b(this.a.hashCode() * 31, 31, this.b.a), 31, this.c);
    }
}
