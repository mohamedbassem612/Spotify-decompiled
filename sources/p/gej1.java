package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gej1 extends iej1 {
    public final int a;
    public final String b;
    public final String c;

    public gej1(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gej1)) {
            return false;
        }
        gej1 gej1Var = (gej1) obj;
        return this.a == gej1Var.a && u890.j(this.b, gej1Var.b) && this.c.equals(gej1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }
}
