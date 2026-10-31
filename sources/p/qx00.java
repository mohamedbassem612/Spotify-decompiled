package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qx00 implements tx00 {
    public final long a;
    public final String b;
    public final ex00 c;
    public final boolean d;

    public qx00(long j, String str, ex00 ex00Var, boolean z) {
        this.a = j;
        this.b = str;
        this.c = ex00Var;
        this.d = z;
    }

    public final ex00 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx00)) {
            return false;
        }
        qx00 qx00Var = (qx00) obj;
        return this.a == qx00Var.a && u890.j(this.b, qx00Var.b) && u890.j(this.c, qx00Var.c) && this.d == qx00Var.d;
    }

    public final String getEntityUri() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + cy30.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31);
    }
}
