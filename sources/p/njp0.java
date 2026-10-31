package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class njp0 {
    public final Object a;
    public final long b;
    public final long c;

    public njp0(Object obj, long j, long j2) {
        this.a = obj;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njp0)) {
            return false;
        }
        njp0 njp0Var = (njp0) obj;
        return u890.j(this.a, njp0Var.a) && this.b == njp0Var.b && this.c == njp0Var.c;
    }

    public final int hashCode() {
        Object obj = this.a;
        return Long.hashCode(this.c) + cy30.f((obj == null ? 0 : obj.hashCode()) * 31, this.b, 31);
    }

    public /* synthetic */ njp0(long j, Object obj) {
        this(obj, j, -1L);
    }
}
