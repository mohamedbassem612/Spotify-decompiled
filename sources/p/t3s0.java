package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t3s0 implements x3s0 {
    public final long a;
    public final String b;

    public t3s0(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3s0)) {
            return false;
        }
        t3s0 t3s0Var = (t3s0) obj;
        return this.a == t3s0Var.a && u890.j(this.b, t3s0Var.b);
    }

    public final String getEventId() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }
}
