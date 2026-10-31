package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o2f1 {
    public final String a;
    public final String b;
    public final r6h1 c;

    public o2f1(String str, String str2, r6h1 r6h1Var) {
        this.a = str;
        this.b = str2;
        this.c = r6h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2f1)) {
            return false;
        }
        o2f1 o2f1Var = (o2f1) obj;
        return u890.j(this.a, o2f1Var.a) && u890.j(this.b, o2f1Var.b) && this.c.equals(o2f1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
