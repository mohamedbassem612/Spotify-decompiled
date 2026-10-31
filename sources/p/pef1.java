package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pef1 {
    public final int a;
    public final String b;
    public final cvt0 c;

    public pef1(int i, String str, cvt0 cvt0Var) {
        this.a = i;
        this.b = str;
        this.c = cvt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pef1)) {
            return false;
        }
        pef1 pef1Var = (pef1) obj;
        return this.a == pef1Var.a && u890.j(this.b, pef1Var.b) && u890.j(this.c, pef1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }
}
