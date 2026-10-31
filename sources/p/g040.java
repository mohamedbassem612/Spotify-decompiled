package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g040 {
    public final sqe a;
    public final String b;
    public final String c;
    public final upf d;
    public final qtg e;
    public final boolean f;
    public final String g;
    public final boolean h;

    public g040(sqe sqeVar, String str, String str2, upf upfVar, qtg qtgVar, boolean z, String str3, boolean z2) {
        this.a = sqeVar;
        this.b = str;
        this.c = str2;
        this.d = upfVar;
        this.e = qtgVar;
        this.f = z;
        this.g = str3;
        this.h = z2;
    }

    public static g040 a(g040 g040Var, sqe sqeVar, String str, String str2, upf upfVar, qtg qtgVar, boolean z, String str3, boolean z2, int i) {
        if ((i & 1) != 0) {
            sqeVar = g040Var.a;
        }
        sqe sqeVar2 = sqeVar;
        if ((i & 2) != 0) {
            str = g040Var.b;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = g040Var.c;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            upfVar = g040Var.d;
        }
        upf upfVar2 = upfVar;
        if ((i & 16) != 0) {
            qtgVar = g040Var.e;
        }
        qtg qtgVar2 = qtgVar;
        if ((i & 32) != 0) {
            z = g040Var.f;
        }
        boolean z3 = z;
        String str6 = (i & 64) != 0 ? g040Var.g : str3;
        boolean z4 = (i & 128) != 0 ? g040Var.h : z2;
        g040Var.getClass();
        return new g040(sqeVar2, str4, str5, upfVar2, qtgVar2, z3, str6, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g040)) {
            return false;
        }
        g040 g040Var = (g040) obj;
        return this.a.equals(g040Var.a) && this.b.equals(g040Var.b) && this.c.equals(g040Var.c) && this.d.equals(g040Var.d) && u890.j(this.e, g040Var.e) && this.f == g040Var.f && this.g.equals(g040Var.g) && this.h == g040Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + cy30.d(xcg1.g((this.e.hashCode() + ((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31, 31, this.f), 31, this.g);
    }
}
