package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ipi1 {
    public final Object a;
    public final long b;

    public ipi1(long j, Object obj) {
        this.a = obj;
        this.b = j;
    }

    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipi1)) {
            return false;
        }
        ipi1 ipi1Var = (ipi1) obj;
        return u890.j(this.a, ipi1Var.a) && this.b == ipi1Var.b;
    }

    public final int hashCode() {
        Object obj = this.a;
        return Long.hashCode(this.b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }
}
