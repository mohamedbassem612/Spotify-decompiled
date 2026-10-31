package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ojw0 {
    public final long a;
    public final long b;

    public ojw0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojw0)) {
            return false;
        }
        ojw0 ojw0Var = (ojw0) obj;
        return jfv.f(this.a, ojw0Var.a) && jfv.f(this.b, ojw0Var.b);
    }

    public final int hashCode() {
        ytw0 ytw0Var = jfv.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
