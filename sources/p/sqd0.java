package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sqd0 {
    public final boolean a;
    public final String b;
    public final hqd0 c;
    public final hqd0 d;

    public sqd0(boolean z, String str, hqd0 hqd0Var, hqd0 hqd0Var2) {
        this.a = z;
        this.b = str;
        this.c = hqd0Var;
        this.d = hqd0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sqd0) {
            sqd0 sqd0Var = (sqd0) obj;
            return this.a == sqd0Var.a && this.b.equals(sqd0Var.b) && this.c == sqd0Var.c && this.d == sqd0Var.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31);
    }
}
