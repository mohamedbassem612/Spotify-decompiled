package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c8z {
    public final String a;
    public final String b;
    public final long c;
    public final ou80 d;

    public c8z(String str, String str2, long j, ou80 ou80Var) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8z)) {
            return false;
        }
        c8z c8zVar = (c8z) obj;
        return u890.j(this.a, c8zVar.a) && u890.j(this.b, c8zVar.b) && this.c == c8zVar.c && u890.j(this.d, c8zVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iF = cy30.f((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31);
        ou80 ou80Var = this.d;
        return iF + (ou80Var != null ? ou80Var.a.hashCode() : 0);
    }
}
