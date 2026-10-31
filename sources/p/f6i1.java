package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f6i1 implements i6i1 {
    public final long a;
    public final String b;
    public final z5i1 c;
    public final boolean d;

    public f6i1(long j, String str, z5i1 z5i1Var, boolean z) {
        this.a = j;
        this.b = str;
        this.c = z5i1Var;
        this.d = z;
    }

    @Override // p.i6i1
    public final z5i1 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6i1)) {
            return false;
        }
        f6i1 f6i1Var = (f6i1) obj;
        return this.a == f6i1Var.a && u890.j(this.b, f6i1Var.b) && this.c.equals(f6i1Var.c) && this.d == f6i1Var.d;
    }

    @Override // p.i6i1
    public final String getEntityUri() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + cy30.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31);
    }
}
