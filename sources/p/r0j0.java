package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r0j0 implements w0j0 {
    public final String a;
    public final sl01 b;

    public r0j0(String str, sl01 sl01Var) {
        this.a = str;
        this.b = sl01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0j0)) {
            return false;
        }
        r0j0 r0j0Var = (r0j0) obj;
        return u890.j(this.a, r0j0Var.a) && this.b == r0j0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
