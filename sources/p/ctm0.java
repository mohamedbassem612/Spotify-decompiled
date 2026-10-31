package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ctm0 implements etm0 {
    public final long a;
    public final o091 b;

    public ctm0(long j, o091 o091Var) {
        this.a = j;
        this.b = o091Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctm0)) {
            return false;
        }
        ctm0 ctm0Var = (ctm0) obj;
        return this.a == ctm0Var.a && u890.j(this.b, ctm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }
}
