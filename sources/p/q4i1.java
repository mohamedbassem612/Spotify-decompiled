package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q4i1 implements b5i1 {
    public final String a;
    public final f8i1 b;

    public q4i1(String str, f8i1 f8i1Var) {
        this.a = str;
        this.b = f8i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4i1)) {
            return false;
        }
        q4i1 q4i1Var = (q4i1) obj;
        return u890.j(this.a, q4i1Var.a) && this.b.equals(q4i1Var.b);
    }

    @Override // p.b5i1
    public final String getUsername() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
