package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class er61 {
    public final dr61 a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;

    public er61(dr61 dr61Var, boolean z, String str, String str2, String str3) {
        this.a = dr61Var;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er61)) {
            return false;
        }
        er61 er61Var = (er61) obj;
        return this.a.equals(er61Var.a) && this.b == er61Var.b && this.c.equals(er61Var.c) && this.d.equals(er61Var.d) && this.e.equals(er61Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
