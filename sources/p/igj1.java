package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class igj1 implements kgj1 {
    public final dgj1 a;
    public final ggj1 b;
    public final long c;

    public igj1(dgj1 dgj1Var, ggj1 ggj1Var, long j) {
        this.a = dgj1Var;
        this.b = ggj1Var;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igj1)) {
            return false;
        }
        igj1 igj1Var = (igj1) obj;
        return this.a.equals(igj1Var.a) && u890.j(this.b, igj1Var.b) && this.c == igj1Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
