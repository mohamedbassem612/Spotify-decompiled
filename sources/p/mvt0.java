package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mvt0 extends ovt0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public mvt0(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvt0)) {
            return false;
        }
        mvt0 mvt0Var = (mvt0) obj;
        return this.a.equals(mvt0Var.a) && u890.j(this.b, mvt0Var.b) && this.c.equals(mvt0Var.c) && u890.j(this.d, mvt0Var.d) && this.e == mvt0Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.e) + xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, true);
    }
}
