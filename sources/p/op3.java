package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class op3 extends hr3 {
    public final String a;
    public final String b;
    public final tv80 c;

    public op3(String str, String str2, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op3)) {
            return false;
        }
        op3 op3Var = (op3) obj;
        return this.a.equals(op3Var.a) && this.b.equals(op3Var.b) && this.c.equals(op3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
