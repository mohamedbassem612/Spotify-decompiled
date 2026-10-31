package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zqg0 {
    public final String a;
    public final boolean b;
    public final r6h1 c;
    public final iu30 d;

    public zqg0(String str, boolean z, r6h1 r6h1Var, iu30 iu30Var) {
        this.a = str;
        this.b = z;
        this.c = r6h1Var;
        this.d = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqg0)) {
            return false;
        }
        zqg0 zqg0Var = (zqg0) obj;
        return this.a.equals(zqg0Var.a) && this.b == zqg0Var.b && u890.j(this.c, zqg0Var.c) && u890.j(this.d, zqg0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
