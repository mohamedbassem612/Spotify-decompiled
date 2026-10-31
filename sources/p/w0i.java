package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w0i {
    public final hp80 a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ w0i(hp80 hp80Var, String str, String str2, String str3, int i) {
        this(hp80Var, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0i)) {
            return false;
        }
        w0i w0iVar = (w0i) obj;
        return u890.j(this.a, w0iVar.a) && u890.j(this.b, w0iVar.b) && u890.j(this.c, w0iVar.c) && u890.j(this.d, w0iVar.d);
    }

    public final int hashCode() {
        hp80 hp80Var = this.a;
        int iD = cy30.d((hp80Var == null ? 0 : hp80Var.hashCode()) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public w0i(hp80 hp80Var, String str, String str2, String str3) {
        this.a = hp80Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }
}
