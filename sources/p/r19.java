package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r19 {
    public final long a;
    public final s29 b;
    public final s09 c;

    public r19(long j, s29 s29Var, s09 s09Var) {
        this.a = j;
        if (s29Var == null) {
            bhn0.i("Null transportContext");
            throw null;
        }
        this.b = s29Var;
        this.c = s09Var;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r19)) {
            return false;
        }
        r19 r19Var = (r19) obj;
        return this.a == r19Var.a && this.b.equals(r19Var.b) && this.c.equals(r19Var.c);
    }

    public final int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
