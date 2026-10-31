package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f2l1 extends j2l1 {
    public final b4l1 a;
    public final String b;
    public final String c;

    public f2l1(b4l1 b4l1Var, String str, String str2) {
        this.a = b4l1Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2l1)) {
            return false;
        }
        f2l1 f2l1Var = (f2l1) obj;
        return this.a.equals(f2l1Var.a) && this.b.equals(f2l1Var.b) && u890.j(this.c, f2l1Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
