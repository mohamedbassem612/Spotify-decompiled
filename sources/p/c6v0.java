package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c6v0 extends e6v0 {
    public final String a;
    public final String b;
    public final ou80 c;

    public c6v0(String str, String str2, ou80 ou80Var) {
        this.a = str;
        this.b = str2;
        this.c = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6v0)) {
            return false;
        }
        c6v0 c6v0Var = (c6v0) obj;
        return u890.j(this.a, c6v0Var.a) && this.b.equals(c6v0Var.b) && u890.j(this.c, c6v0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        ou80 ou80Var = this.c;
        return gqt0.a.hashCode() + ((iD + (ou80Var == null ? 0 : ou80Var.a.hashCode())) * 31);
    }
}
