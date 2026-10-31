package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class u3s0 implements x3s0 {
    public final long a;
    public final String b;

    public u3s0(long j, String str) {
        this.a = j;
        this.b = str;
    }

    @Override // p.x3s0
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3s0)) {
            return false;
        }
        u3s0 u3s0Var = (u3s0) obj;
        return this.a == u3s0Var.a && u890.j(this.b, u3s0Var.b);
    }

    @Override // p.x3s0
    public final String getEventId() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }
}
