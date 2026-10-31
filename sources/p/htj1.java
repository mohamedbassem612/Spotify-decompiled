package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class htj1 extends ktj1 {
    public final int a;
    public final String b;
    public final String c;

    public htj1(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htj1)) {
            return false;
        }
        htj1 htj1Var = (htj1) obj;
        return this.a == htj1Var.a && u890.j(this.b, htj1Var.b) && this.c.equals(htj1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }
}
