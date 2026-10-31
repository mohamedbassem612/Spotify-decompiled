package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class okg1 {
    public final lhg1 a;
    public final String b;
    public final boolean c;

    public okg1(lhg1 lhg1Var, String str, boolean z) {
        this.a = lhg1Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof okg1)) {
            return false;
        }
        okg1 okg1Var = (okg1) obj;
        return u890.j(this.a, okg1Var.a) && this.b.equals(okg1Var.b) && this.c == okg1Var.c;
    }

    public final int hashCode() {
        lhg1 lhg1Var = this.a;
        return Boolean.hashCode(this.c) + cy30.d((lhg1Var == null ? 0 : lhg1Var.hashCode()) * 31, 31, this.b);
    }
}
