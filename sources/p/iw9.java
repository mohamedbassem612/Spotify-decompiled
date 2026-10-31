package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class iw9 {
    public final ju7 a;
    public final boolean b;
    public final String c;
    public final String d;

    public iw9(ju7 ju7Var, boolean z, String str, String str2) {
        this.a = ju7Var;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw9)) {
            return false;
        }
        iw9 iw9Var = (iw9) obj;
        return this.a.equals(iw9Var.a) && this.b == iw9Var.b && this.c.equals(iw9Var.c) && this.d.equals(iw9Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
