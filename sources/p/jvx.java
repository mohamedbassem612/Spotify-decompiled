package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jvx {
    public final long a;
    public final hw61 b;

    public jvx(long j, hw61 hw61Var) {
        this.a = j;
        this.b = hw61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvx)) {
            return false;
        }
        jvx jvxVar = (jvx) obj;
        long j = jvxVar.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && this.b.equals(jvxVar.b);
    }

    public final int hashCode() {
        int i = u7h.l;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }
}
