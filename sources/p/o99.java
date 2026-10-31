package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class o99 implements r99 {
    public final int a;
    public final boolean b;
    public final String c;

    public o99(String str, int i, boolean z) {
        this.a = i;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o99)) {
            return false;
        }
        o99 o99Var = (o99) obj;
        return this.a == o99Var.a && this.b == o99Var.b && this.c.equals(o99Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(Integer.hashCode(this.a) * 31, 31, this.b);
    }
}
