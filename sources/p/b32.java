package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class b32 {
    public final int a;
    public final String b;
    public final String c;
    public final iu30 d;

    public b32(int i, String str, String str2, iu30 iu30Var) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b32)) {
            return false;
        }
        b32 b32Var = (b32) obj;
        return this.a == b32Var.a && u890.j(this.b, b32Var.b) && u890.j(this.c, b32Var.c) && u890.j(this.d, b32Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(l1d.C(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        iu30 iu30Var = this.d;
        return iHashCode + (iu30Var != null ? iu30Var.hashCode() : 0);
    }
}
