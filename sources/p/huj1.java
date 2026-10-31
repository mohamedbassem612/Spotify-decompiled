package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class huj1 extends muj1 {
    public final int a;
    public final String b;
    public final String c;
    public final m4m d;

    public huj1(int i, String str, String str2, m4m m4mVar) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = m4mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof huj1)) {
            return false;
        }
        huj1 huj1Var = (huj1) obj;
        return this.a == huj1Var.a && u890.j(this.b, huj1Var.b) && u890.j(this.c, huj1Var.c) && this.d == huj1Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
